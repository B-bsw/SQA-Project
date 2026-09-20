#!/usr/bin/env bash
# Usage: run_evosuite_test.sh PROJECT BUG_ID_OR_LIST [BUDGET_SECONDS]
set -euo pipefail
if [[ $# -lt 2 || $# -gt 3 ]]; then echo "Usage: $0 PROJECT BUG_ID_OR_LIST [BUDGET_SECONDS]" >&2; exit 2; fi
project=$1; bug_spec=$(printf '%s' "$2" | tr -d '[:space:]'); budget=${3:-60}
bug_spec=${bug_spec#\[}; bug_spec=${bug_spec%\]}
IFS=, read -r -a bug_ids <<< "$bug_spec"
[[ ${#bug_ids[@]} -gt 0 ]] || { echo "BUG_ID list must not be empty." >&2; exit 2; }
[[ "$project" =~ ^[A-Za-z][A-Za-z0-9]*$ ]] || { echo "Invalid project: $project" >&2; exit 2; }
for id in "${bug_ids[@]}"; do
  [[ "$id" =~ ^[1-9][0-9]*$ ]] || { echo "Invalid BUG_ID in list: $id" >&2; exit 2; }
done
[[ "$budget" =~ ^[1-9][0-9]*$ ]] || { echo "Budget must be positive." >&2; exit 2; }

if [[ ${#bug_ids[@]} -gt 1 ]]; then
  max_parallel=${MAX_PARALLEL:-2}
  [[ "$max_parallel" =~ ^[1-9][0-9]*$ ]] || { echo "MAX_PARALLEL must be positive." >&2; exit 2; }
  pids=(); failed=0
  echo "Batch Round 1: ${#bug_ids[@]} bugs, MAX_PARALLEL=$max_parallel" >&2
  for id in "${bug_ids[@]}"; do
    while [[ $(jobs -pr | wc -l | tr -d ' ') -ge $max_parallel ]]; do sleep 1; done
    "$0" "$project" "$id" "$budget" &
    pids+=("$!")
  done
  for pid in "${pids[@]}"; do
    if ! wait "$pid"; then failed=$((failed + 1)); fi
  done
  echo "Batch Round 1 complete: $((${#bug_ids[@]} - failed)) passed, $failed failed" >&2
  [[ $failed -eq 0 ]]
  exit
fi
bug_id=${bug_ids[0]}

code_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)
ga_root=$(cd "$code_dir/.." && pwd); repo_root=$(cd "$ga_root/.." && pwd)
resource_root=${RESOURCE_ROOT:-$repo_root/Resoucre}
defects4j_bin=${DEFECTS4J_BIN:-/Users/bb/Desktop/class/sqa/defects4j/framework/bin/defects4j}
java11_home=${JAVA11_HOME:-/Users/bb/.sdkman/candidates/java/11.0.31-amzn}
evosuite_jar=${EVOSUITE_JAR:-$code_dir/evosuite-1.2.0.jar}
seed=${SEED:-20260918}
client_memory_mb=${EVOSUITE_CLIENT_MEMORY_MB:-2048}
client_on_thread=${EVOSUITE_CLIENT_ON_THREAD:-true}
[[ "$client_memory_mb" =~ ^[1-9][0-9]*$ ]] || { echo "EVOSUITE_CLIENT_MEMORY_MB must be positive." >&2; exit 2; }
[[ "$client_on_thread" == true || "$client_on_thread" == false ]] || { echo "EVOSUITE_CLIENT_ON_THREAD must be true or false." >&2; exit 2; }
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
project=$canonical; resource_dir="$resource_root/${project}_${bug_id}"
[[ -d "$resource_dir" ]] || { echo "Resource not found: $resource_dir" >&2; exit 2; }
java_count=$(find "$resource_dir" -type f -name '*.java' | wc -l | tr -d ' ')
[[ "$java_count" -gt 0 ]] || { echo "No Java files in $resource_dir" >&2; exit 2; }

result_dir="$ga_root/Result_Round1/${project}_${bug_id}"
test_root="$ga_root/TestCode/${project}_${bug_id}"
rm -rf "$result_dir" "$test_root"
mkdir -p "$result_dir" "$test_root"
temp_root=$(mktemp -d "/tmp/evosuite-ga-${project}-${bug_id}.XXXXXX")
cleanup() { rm -rf "$temp_root"; }; trap cleanup EXIT INT TERM
workspace="$temp_root/checkout"; setup_output="$temp_root/setup.txt"

write_setup_failure() {
  local state=$1
  jq -n --arg project "$project" --argjson bug_id "$bug_id" --arg state "$state" \
    --arg error "$(tail -20 "$setup_output")" \
    '{schema_version:"1.0",round:1,subject_version:"buggy",project:$project,bug_id:$bug_id,algorithm:"STANDARD_GA",status:$state,error:$error,targets:[]}' > "$result_dir/result.json"
  jq -r '["project","bug_id","algorithm","target_class","generated_test_methods","test_execution","line_coverage_percent","branch_coverage_percent","status","error"], [.project,.bug_id,.algorithm,"",0,"NOT_RUN","","",.status,.error] | @csv' "$result_dir/result.json" > "$result_dir/result.csv"
  printf '%s\n' "$result_dir"; exit 1
}

echo "[$project-$bug_id] checkout and compile" >&2
"$defects4j_bin" checkout -p "$project" -v "${bug_id}b" -w "$workspace" >"$setup_output" 2>&1 || write_setup_failure setup_failed
"$defects4j_bin" compile -w "$workspace" >>"$setup_output" 2>&1 || write_setup_failure compile_failed
bin_relative=$("$defects4j_bin" export -w "$workspace" -p dir.bin.classes 2>>"$setup_output")
compile_cp=$("$defects4j_bin" export -w "$workspace" -p cp.compile 2>>"$setup_output")
# Older Defects4J projects sometimes export optional/nonexistent JAR paths.
# EvoSuite rejects the whole classpath if even one entry is missing.
clean_cp=''
old_ifs=$IFS; IFS=:
for entry in $compile_cp; do
  [[ -e "$entry" ]] || continue
  if [[ -z "$clean_cp" ]]; then clean_cp=$entry; else clean_cp="$clean_cp:$entry"; fi
done
IFS=$old_ifs
compile_cp=$clean_cp
bin_dir="$workspace/$bin_relative"; resource_classes="$temp_root/resource-classes"
mkdir -p "$resource_classes"; source_list="$temp_root/resource-sources.txt"
# Keep the Resource implementation and every compiled project dependency in a
# single classpath root. EvoSuite 1.2.0 can fail while instrumenting old Chart
# classes when the modified class and its sibling classes are in separate roots.
cp -R "$bin_dir/." "$resource_classes/"
find "$resource_dir" -type f -name '*.java' | sort > "$source_list"
"$JAVA_HOME/bin/javac" -cp "$resource_classes:$compile_cp" -d "$resource_classes" @"$source_list" >>"$setup_output" 2>&1 || write_setup_failure resource_compile_failed

jsonl="$temp_root/results.jsonl"; : > "$jsonl"
while IFS= read -r source; do
  package=$(awk '/^[[:space:]]*package[[:space:]]+/ {gsub(/[;\r]/,"",$2); print $2; exit}' "$source")
  class_name=$(basename "$source" .java); target_class=${package:+$package.}$class_name
  target_slug=${target_class//[^A-Za-z0-9_]/_}
  target_tests="$temp_root/generated-$target_slug"
  evo_report="$temp_root/report-$target_slug"; generated_output="$temp_root/generate-$target_slug.txt"
  mkdir -p "$target_tests" "$evo_report"
  echo "[$project-$bug_id] STANDARD_GA $target_class" >&2
  started=$(date +%s); set +e
  "$JAVA_HOME/bin/java" ${EVOSUITE_JAVA_OPTS:--Xmx2g} \
    -cp "$evosuite_jar:$resource_classes:$compile_cp" org.evosuite.EvoSuite \
    -mem "$client_memory_mb" \
    -generateSuite -class "$target_class" -projectCP "$resource_classes:$bin_dir:$compile_cp" \
    -seed "$seed" -Dalgorithm=STANDARD_GA -Dcriterion=LINE:BRANCH \
    -Dclient_on_thread="$client_on_thread" \
    -Dstopping_condition=MaxTime -Dsearch_budget="$budget" -Dshow_progress=false \
    -Doutput_variables=TARGET_CLASS,criterion,Coverage,LineCoverage,BranchCoverage \
    -Dtest_dir="$target_tests" -Dreport_dir="$evo_report" >"$generated_output" 2>&1
  generation_rc=$?; set -e; elapsed=$(( $(date +%s) - started ))
  test_methods=$( (rg --no-filename '@Test' "$target_tests" -g '*_ESTest.java' 2>/dev/null || true) | wc -l | tr -d ' ')
  line_coverage=null; branch_coverage=null; statistics="$evo_report/statistics.csv"
  if [[ -f "$statistics" ]]; then
    value=$(awk -F, 'NR==1{for(i=1;i<=NF;i++)if($i=="LineCoverage")p=i;next}NR==2&&p{printf "%.2f",$p*100}' "$statistics"); [[ -n "$value" ]] && line_coverage=$value
    value=$(awk -F, 'NR==1{for(i=1;i<=NF;i++)if($i=="BranchCoverage")p=i;next}NR==2&&p{printf "%.2f",$p*100}' "$statistics"); [[ -n "$value" ]] && branch_coverage=$value
  fi
  execution=NOT_RUN; state=generation_failed; error=$(tail -200 "$generated_output")
  if [[ $generation_rc -eq 0 && "$test_methods" -gt 0 ]]; then
    compiled_tests="$temp_root/tests-$target_slug"; test_sources="$temp_root/test-sources-$target_slug.txt"
    test_output="$temp_root/test-$target_slug.txt"; mkdir -p "$compiled_tests"
    find "$target_tests" -type f -name '*.java' | sort > "$test_sources"; set +e
    "$JAVA_HOME/bin/javac" -cp "$resource_classes:$bin_dir:$compile_cp:$evosuite_jar" -d "$compiled_tests" @"$test_sources" >"$test_output" 2>&1
    compile_rc=$?; test_rc=1
    if [[ $compile_rc -eq 0 ]]; then
      "$JAVA_HOME/bin/java" -cp "$compiled_tests:$resource_classes:$bin_dir:$compile_cp:$evosuite_jar" org.junit.runner.JUnitCore "${target_class}_ESTest" >>"$test_output" 2>&1
      test_rc=$?
    fi
    set -e
    if [[ $compile_rc -ne 0 ]]; then execution=COMPILE_FAIL; state=test_compile_failed
    elif [[ $test_rc -ne 0 ]]; then execution=FAIL; state=test_failed
    else execution=PASS; state=ok; fi
    error=$(tail -20 "$test_output")
  fi
  # Keep the public TestCode layout flat: TestCode/Project_Bug/*.java
  # EvoSuite itself generates package directories, so copy only the generated
  # Java files out of that temporary tree after generation.
  if [[ "$test_methods" -gt 0 ]]; then
    while IFS= read -r generated_source; do
      generated_name=$(basename "$generated_source")
      if [[ -e "$test_root/$generated_name" ]]; then
        echo "Duplicate generated test filename: $generated_name" >&2
        state=duplicate_test_filename
        execution=FAIL
        error="Duplicate generated test filename: $generated_name"
        break
      fi
      cp "$generated_source" "$test_root/$generated_name"
    done < <(find "$target_tests" -type f -name '*.java' | sort)
  fi
  [[ "$state" == ok ]] && error=''
  relative_source=${source#"$repo_root/"}
  jq -n --arg source "$relative_source" --arg target "$target_class" --argjson seed "$seed" \
    --argjson budget "$budget" --argjson seconds "$elapsed" --argjson methods "$test_methods" \
    --argjson line "$line_coverage" --argjson branch "$branch_coverage" \
    --arg execution "$execution" --arg state "$state" --arg error "$error" \
    --argjson client_on_thread "$client_on_thread" \
    --argjson client_memory_mb "$client_memory_mb" \
    '{source_file:$source,target_class:$target,algorithm:"STANDARD_GA",seed:$seed,client_memory_mb:$client_memory_mb,client_on_thread:$client_on_thread,search_budget_seconds:$budget,generation_seconds:$seconds,generated_test_methods:$methods,test_execution:$execution,line_coverage_percent:$line,branch_coverage_percent:$branch,status:$state,error:(if $error=="" then null else $error end)}' >> "$jsonl"
done < "$source_list"

created_at=$(date -u +%Y-%m-%dT%H:%M:%SZ)
jq -s --arg created_at "$created_at" --arg project "$project" \
  --argjson bug_id "$bug_id" --arg resource_dir "${resource_dir#"$repo_root/"}" \
  --arg test_code_dir "${test_root#"$repo_root/"}" \
  '{schema_version:"1.0",round:1,subject_version:"buggy",created_at:$created_at,project:$project,bug_id:$bug_id,resource_dir:$resource_dir,test_code_dir:$test_code_dir,algorithm:"STANDARD_GA",status:(if all(.[];.status=="ok") then "ok" else "failed" end),targets:.}' "$jsonl" > "$result_dir/result.json"
jq -r '["project","bug_id","resource_dir","test_code_dir","algorithm","seed","search_budget_seconds","target_class","source_file","generation_seconds","generated_test_methods","test_execution","line_coverage_percent","branch_coverage_percent","status","error"], (.targets[] as $t | [.project,.bug_id,.resource_dir,.test_code_dir,$t.algorithm,$t.seed,$t.search_budget_seconds,$t.target_class,$t.source_file,$t.generation_seconds,$t.generated_test_methods,$t.test_execution,($t.line_coverage_percent//""),($t.branch_coverage_percent//""),$t.status,($t.error//"")]) | @csv' "$result_dir/result.json" > "$result_dir/result.csv"
generated_files=$(find "$test_root" -type f -name '*_ESTest*.java' | wc -l | tr -d ' ')
echo "Generated EvoSuite files : $generated_files" >&2
echo "TestCode path            : $test_root" >&2
echo "Result path              : $result_dir" >&2
printf '%s\n' "$result_dir"
[[ $(jq -r '.status' "$result_dir/result.json") == ok ]]
