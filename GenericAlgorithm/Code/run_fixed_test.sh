#!/usr/bin/env bash
# Usage: run_fixed_test.sh PROJECT BUG_ID
set -euo pipefail
if [[ $# -ne 2 ]]; then echo "Usage: $0 PROJECT BUG_ID" >&2; exit 2; fi
project=$1; bug_id=$2
[[ "$project" =~ ^[A-Za-z][A-Za-z0-9]*$ ]] || { echo "Invalid project: $project" >&2; exit 2; }
[[ "$bug_id" =~ ^[1-9][0-9]*$ ]] || { echo "BUG_ID must be positive." >&2; exit 2; }
code_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)
ga_root=$(cd "$code_dir/.." && pwd); repo_root=$(cd "$ga_root/.." && pwd)
defects4j_bin=${DEFECTS4J_BIN:-/Users/bb/Desktop/class/sqa/defects4j/framework/bin/defects4j}
java11_home=${JAVA11_HOME:-/Users/bb/.sdkman/candidates/java/11.0.31-amzn}
evosuite_jar=${EVOSUITE_JAR:-$code_dir/evosuite-1.2.0.jar}
command -v jq >/dev/null || { echo "jq is required." >&2; exit 2; }
for file in "$defects4j_bin" "$java11_home/bin/java" "$evosuite_jar"; do
  [[ -e "$file" ]] || { echo "Missing: $file" >&2; exit 2; }
done
export JAVA_HOME="$java11_home"; export PATH="$JAVA_HOME/bin:$PATH"
requested=$(printf '%s' "$project" | tr '[:upper:]' '[:lower:]'); canonical=''
while IFS= read -r candidate; do
  lower=$(printf '%s' "$candidate" | tr '[:upper:]' '[:lower:]')
  [[ "$lower" == "$requested" ]] && { canonical=$candidate; break; }
done < <("$defects4j_bin" pids)
[[ -n "$canonical" ]] || { echo "Unknown Defects4J project: $project" >&2; exit 2; }
project=$canonical; test_parent="$ga_root/TestCode/${project}_${bug_id}"
test_root=$test_parent
[[ -n "${test_root:-}" && -d "$test_root" ]] || { echo "Generated TestCode not found for ${project}_${bug_id}" >&2; exit 2; }
test_count=$(find "$test_root" -type f -name '*_ESTest.java' | wc -l | tr -d ' ')
[[ "$test_count" -gt 0 ]] || { echo "No EvoSuite ESTest found in $test_root" >&2; exit 2; }
result_dir="$ga_root/Result_Round2/${project}_${bug_id}"
rm -rf "$result_dir"
mkdir -p "$result_dir"
temp_root=$(mktemp -d "/tmp/evosuite-fixed-${project}-${bug_id}.XXXXXX")
cleanup() { rm -rf "$temp_root"; }; trap cleanup EXIT INT TERM
workspace="$temp_root/checkout"; setup_output="$temp_root/setup.txt"
write_setup_failure() {
  local state=$1
  jq -n --arg project "$project" --argjson bug_id "$bug_id" --arg state "$state" \
    --arg tests "${test_root#"$repo_root/"}" --arg error "$(tail -20 "$setup_output")" \
    '{schema_version:"1.0",round:2,subject_version:"fixed",project:$project,bug_id:$bug_id,test_code_dir:$tests,status:$state,error:$error,tests:[]}' > "$result_dir/result.json"
  jq -r '["project","bug_id","subject_version","test_class","tests_run","failures","execution","status","error"], [.project,.bug_id,.subject_version,"",0,0,"NOT_RUN",.status,.error] | @csv' "$result_dir/result.json" > "$result_dir/result.csv"
  printf '%s\n' "$result_dir"; exit 1
}
echo "[$project-$bug_id fixed] checkout and compile" >&2
"$defects4j_bin" checkout -p "$project" -v "${bug_id}f" -w "$workspace" >"$setup_output" 2>&1 || write_setup_failure setup_failed
"$defects4j_bin" compile -w "$workspace" >>"$setup_output" 2>&1 || write_setup_failure compile_failed
bin_relative=$("$defects4j_bin" export -w "$workspace" -p dir.bin.classes 2>>"$setup_output")
compile_cp=$("$defects4j_bin" export -w "$workspace" -p cp.compile 2>>"$setup_output")
clean_cp=''; old_ifs=$IFS; IFS=:
for entry in $compile_cp; do
  [[ -e "$entry" ]] || continue
  if [[ -z "$clean_cp" ]]; then clean_cp=$entry; else clean_cp="$clean_cp:$entry"; fi
done
IFS=$old_ifs; compile_cp=$clean_cp; bin_dir="$workspace/$bin_relative"
compiled_tests="$temp_root/compiled-tests"; test_sources="$temp_root/test-sources.txt"
mkdir -p "$compiled_tests"; find "$test_root" -type f -name '*.java' | sort > "$test_sources"
"$JAVA_HOME/bin/javac" -cp "$bin_dir:$compile_cp:$evosuite_jar" -d "$compiled_tests" @"$test_sources" >>"$setup_output" 2>&1 || write_setup_failure test_compile_failed
jsonl="$temp_root/results.jsonl"; : > "$jsonl"
while IFS= read -r source; do
  package=$(awk '/^[[:space:]]*package[[:space:]]+/ {gsub(/[;\r]/,"",$2); print $2; exit}' "$source")
  class_name=$(basename "$source" .java); test_class=${package:+$package.}$class_name
  output="$temp_root/${class_name}.txt"; started=$(date +%s); set +e
  "$JAVA_HOME/bin/java" -Djava.awt.headless=true \
    -cp "$compiled_tests:$bin_dir:$compile_cp:$evosuite_jar" \
    org.junit.runner.JUnitCore "$test_class" >"$output" 2>&1
  test_rc=$?; set -e; seconds=$(( $(date +%s) - started ))
  tests_run=$(rg -o 'Tests run: [0-9]+' "$output" | tail -1 | awk '{print $3}' || true); tests_run=${tests_run:-0}
  failures=$(rg -o 'Failures: [0-9]+' "$output" | tail -1 | awk '{print $2}' || true); failures=${failures:-0}
  if [[ "$tests_run" -eq 0 ]]; then
    successful_count=$(rg -o 'OK \([0-9]+ tests?\)' "$output" | tail -1 | rg -o '[0-9]+' || true)
    [[ -n "$successful_count" ]] && tests_run=$successful_count
  fi
  if [[ $test_rc -eq 0 ]]; then execution=PASS; state=ok; error=''
  else execution=FAIL; state=test_failed; error=$(tail -20 "$output"); fi
  jq -n --arg test_class "$test_class" --argjson seconds "$seconds" --argjson tests_run "$tests_run" \
    --argjson failures "$failures" --arg execution "$execution" --arg state "$state" --arg error "$error" \
    '{test_class:$test_class,execution_seconds:$seconds,tests_run:$tests_run,failures:$failures,test_execution:$execution,status:$state,error:(if $error=="" then null else $error end)}' >> "$jsonl"
done < <(find "$test_root" -type f -name '*_ESTest.java' | sort)
created_at=$(date -u +%Y-%m-%dT%H:%M:%SZ)
jq -s --arg created_at "$created_at" --arg project "$project" \
  --argjson bug_id "$bug_id" --arg tests "${test_root#"$repo_root/"}" \
  '{schema_version:"1.0",round:2,subject_version:"fixed",created_at:$created_at,project:$project,bug_id:$bug_id,test_code_dir:$tests,status:(if all(.[];.status=="ok") then "ok" else "failed" end),tests:.}' "$jsonl" > "$result_dir/result.json"
jq -r '["project","bug_id","subject_version","test_code_dir","test_class","execution_seconds","tests_run","failures","test_execution","status","error"], (.tests[] as $t | [.project,.bug_id,.subject_version,.test_code_dir,$t.test_class,$t.execution_seconds,$t.tests_run,$t.failures,$t.test_execution,$t.status,($t.error//"")]) | @csv' "$result_dir/result.json" > "$result_dir/result.csv"
printf '%s\n' "$result_dir"
[[ $(jq -r '.status' "$result_dir/result.json") == ok ]]
