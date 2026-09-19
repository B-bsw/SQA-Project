#!/usr/bin/env bash
# Round 2: validate the exact generated suite on both buggy and fixed revisions.
# Usage: run_evosuite_test_fixed.sh PROJECT BUG_ID_OR_LIST
set -euo pipefail

if [[ $# -ne 2 ]]; then echo "Usage: $0 PROJECT BUG_ID_OR_LIST" >&2; exit 2; fi
project=$1; bug_spec=$(printf '%s' "$2" | tr -d '[:space:]')
bug_spec=${bug_spec#\[}; bug_spec=${bug_spec%\]}
IFS=, read -r -a bug_ids <<< "$bug_spec"
[[ ${#bug_ids[@]} -gt 0 ]] || { echo "BUG_ID list must not be empty." >&2; exit 2; }
[[ "$project" =~ ^[A-Za-z][A-Za-z0-9]*$ ]] || { echo "Invalid project: $project" >&2; exit 2; }
for id in "${bug_ids[@]}"; do [[ "$id" =~ ^[1-9][0-9]*$ ]] || { echo "Invalid BUG_ID in list: $id" >&2; exit 2; }; done

if [[ ${#bug_ids[@]} -gt 1 ]]; then
  max_parallel=${MAX_PARALLEL:-2}; pids=(); failed=0
  [[ "$max_parallel" =~ ^[1-9][0-9]*$ ]] || { echo "MAX_PARALLEL must be positive." >&2; exit 2; }
  echo "Batch Round 2: ${#bug_ids[@]} bugs, MAX_PARALLEL=$max_parallel" >&2
  for id in "${bug_ids[@]}"; do
    while [[ $(jobs -pr | wc -l | tr -d ' ') -ge $max_parallel ]]; do sleep 1; done
    "$0" "$project" "$id" & pids+=("$!")
  done
  for pid in "${pids[@]}"; do if ! wait "$pid"; then failed=$((failed + 1)); fi; done
  echo "Batch Round 2 complete: $((${#bug_ids[@]} - failed)) completed, $failed unavailable" >&2
  [[ $failed -eq 0 ]]; exit
fi
bug_id=${bug_ids[0]}

code_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)
ga_root=$(cd "$code_dir/.." && pwd); repo_root=$(cd "$ga_root/.." && pwd)
source "$code_dir/report_helpers.sh"
defects4j_bin=${DEFECTS4J_BIN:-/Users/bb/Desktop/class/sqa/defects4j/framework/bin/defects4j}
java11_home=${JAVA11_HOME:-/Users/bb/.sdkman/candidates/java/11.0.31-amzn}
evosuite_jar=${EVOSUITE_JAR:-$code_dir/evosuite-1.2.0.jar}
command -v jq >/dev/null || { echo "jq is required." >&2; exit 2; }
for file in "$defects4j_bin" "$java11_home/bin/java" "$evosuite_jar"; do [[ -e "$file" ]] || { echo "Missing: $file" >&2; exit 2; }; done
export JAVA_HOME="$java11_home"; export PATH="$JAVA_HOME/bin:$PATH"

requested=$(printf '%s' "$project" | tr '[:upper:]' '[:lower:]'); canonical=''
while IFS= read -r candidate; do
  lower=$(printf '%s' "$candidate" | tr '[:upper:]' '[:lower:]')
  [[ "$lower" == "$requested" ]] && { canonical=$candidate; break; }
done < <("$defects4j_bin" pids)
[[ -n "$canonical" ]] || { echo "Unknown Defects4J project: $project" >&2; exit 2; }
project=$canonical
test_root="$ga_root/TestCode/${project}_${bug_id}"
generation_result="$ga_root/Result_Round1/${project}_${bug_id}/result.json"
[[ -d "$test_root" ]] || { echo "Generated TestCode not found for ${project}_${bug_id}" >&2; exit 2; }
[[ $(find "$test_root" -type f -name '*_ESTest.java' | wc -l | tr -d ' ') -gt 0 ]] || { echo "No EvoSuite ESTest found in $test_root" >&2; exit 2; }
[[ -f "$generation_result" ]] || { echo "Round 1 result not found for ${project}_${bug_id}" >&2; exit 2; }
algorithm=$(jq -r '.targets[0].algorithm // .algorithm // "STANDARD_GA"' "$generation_result")
seed=$(jq -r '.targets[0].seed // empty' "$generation_result")
[[ "$seed" =~ ^[0-9]+$ ]] || { echo "Missing valid seed in Round 1 result." >&2; exit 2; }

result_dir="$ga_root/Result_Round2/${project}_${bug_id}"
archive_previous_run "$result_dir"
mkdir -p "$result_dir"
temp_root=$(mktemp -d "/tmp/evosuite-validation-${project}-${bug_id}.XXXXXX")
cleanup() { rm -rf "$temp_root"; }; trap cleanup EXIT INT TERM
jsonl="$temp_root/validations.jsonl"; : > "$jsonl"
infrastructure_failed=0

write_unavailable_rows() {
  local version=$1 state=$2 message=$3
  while IFS= read -r source; do
    package=$(awk '/^[[:space:]]*package[[:space:]]+/ {gsub(/[;\r]/,"",$2); print $2; exit}' "$source")
    class_name=$(basename "$source" .java); test_class=${package:+$package.}$class_name
    jq -n --arg project "$project" --argjson bug_id "$bug_id" --arg algorithm "$algorithm" \
      --argjson seed "$seed" --arg version "$version" --arg test_class "$test_class" \
      --arg state "$state" --arg error "$message" \
      '{project:$project,bug_id:$bug_id,algorithm:$algorithm,seed:$seed,subject_version:$version,test_class:$test_class,execution_seconds:0,tests_run:null,passed_tests:null,failures:null,test_execution:"NOT_RUN",status:$state,error:$error}' >> "$jsonl"
  done < <(find "$test_root" -type f -name '*_ESTest.java' | sort)
}

validate_version() {
  local version=$1 suffix=$2 workspace setup_output
  local bin_relative compile_cp clean_cp old_ifs entry bin_dir compiled_tests test_sources
  workspace="$temp_root/$version"; setup_output="$temp_root/setup-$version.txt"
  echo "[$project-$bug_id $version] checkout and compile ${bug_id}${suffix}" >&2
  if ! "$defects4j_bin" checkout -p "$project" -v "${bug_id}${suffix}" -w "$workspace" >"$setup_output" 2>&1; then
    write_unavailable_rows "$version" setup_failed "$(tail -20 "$setup_output")"; infrastructure_failed=1; return
  fi
  if ! "$defects4j_bin" compile -w "$workspace" >>"$setup_output" 2>&1; then
    write_unavailable_rows "$version" compile_failed "$(tail -20 "$setup_output")"; infrastructure_failed=1; return
  fi
  bin_relative=$("$defects4j_bin" export -w "$workspace" -p dir.bin.classes 2>>"$setup_output")
  compile_cp=$("$defects4j_bin" export -w "$workspace" -p cp.compile 2>>"$setup_output")
  clean_cp=''; old_ifs=$IFS; IFS=:
  for entry in $compile_cp; do
    [[ -e "$entry" ]] || continue
    [[ -z "$clean_cp" ]] && clean_cp=$entry || clean_cp="$clean_cp:$entry"
  done
  IFS=$old_ifs; compile_cp=$clean_cp; bin_dir="$workspace/$bin_relative"
  compiled_tests="$temp_root/compiled-$version"; test_sources="$temp_root/test-sources-$version.txt"
  mkdir -p "$compiled_tests"; find "$test_root" -type f -name '*.java' | sort > "$test_sources"
  if ! "$JAVA_HOME/bin/javac" -cp "$bin_dir:$compile_cp:$evosuite_jar" -d "$compiled_tests" @"$test_sources" >>"$setup_output" 2>&1; then
    write_unavailable_rows "$version" test_compile_failed "$(tail -20 "$setup_output")"; infrastructure_failed=1; return
  fi

  while IFS= read -r source; do
    package=$(awk '/^[[:space:]]*package[[:space:]]+/ {gsub(/[;\r]/,"",$2); print $2; exit}' "$source")
    class_name=$(basename "$source" .java); test_class=${package:+$package.}$class_name
    output="$temp_root/${version}-${class_name}.txt"; started=$(date +%s); set +e
    "$JAVA_HOME/bin/java" -Djava.awt.headless=true -cp "$compiled_tests:$bin_dir:$compile_cp:$evosuite_jar" \
      org.junit.runner.JUnitCore "$test_class" >"$output" 2>&1
    test_rc=$?; set -e; seconds=$(( $(date +%s) - started ))
    parse_junit_counts "$output"
    if [[ "$tests_run" == null || "$failures" == null ]]; then
      execution=NOT_RUN; state=test_execution_error; error=$(tail -20 "$output"); infrastructure_failed=1
    elif [[ $test_rc -eq 0 && "$failures" -eq 0 ]]; then
      execution=PASS; state=ok; error=''
    else
      execution=FAIL; state=test_failed; error=$(tail -20 "$output")
    fi
    jq -n --arg project "$project" --argjson bug_id "$bug_id" --arg algorithm "$algorithm" \
      --argjson seed "$seed" --arg version "$version" --arg test_class "$test_class" \
      --argjson seconds "$seconds" --argjson tests_run "$tests_run" --argjson passed_tests "$passed_tests" \
      --argjson failures "$failures" --arg execution "$execution" --arg state "$state" --arg error "$error" \
      '{project:$project,bug_id:$bug_id,algorithm:$algorithm,seed:$seed,subject_version:$version,test_class:$test_class,execution_seconds:$seconds,tests_run:$tests_run,passed_tests:$passed_tests,failures:$failures,test_execution:$execution,status:$state,error:(if $error=="" then null else $error end)}' >> "$jsonl"
  done < <(find "$test_root" -type f -name '*_ESTest.java' | sort)
}

# Both calls use the same immutable TestCode directory from Round 1.
validate_version buggy b
validate_version fixed f
created_at=$(date -u +%Y-%m-%dT%H:%M:%SZ)
jq -s --arg created_at "$created_at" --arg project "$project" --argjson bug_id "$bug_id" \
  --arg algorithm "$algorithm" --argjson seed "$seed" --arg test_code_dir "${test_root#"$repo_root/"}" \
  '{schema_version:"2.0",report_type:"validation",round:2,created_at:$created_at,project:$project,bug_id:$bug_id,algorithm:$algorithm,seed:$seed,test_code_dir:$test_code_dir,
    status:(if any(.[];.test_execution=="NOT_RUN") then "not_available" else "complete" end),validations:.}' "$jsonl" > "$result_dir/result.json"
jq -r '["project","bug_id","algorithm","seed","subject_version","test_class","execution_seconds","tests_run","passed_tests","failures","test_execution","status","error"],
  (.validations[] | [.project,.bug_id,.algorithm,.seed,.subject_version,.test_class,.execution_seconds,.tests_run,.passed_tests,.failures,.test_execution,.status,(.error//"")]) | @csv' \
  "$result_dir/result.json" > "$result_dir/result.csv"

buggy_result=$(jq -r 'if ([.validations[]|select(.subject_version=="buggy" and .test_execution=="NOT_RUN")]|length)>0 then "NOT_AVAILABLE" elif any(.validations[]; .subject_version=="buggy" and .test_execution=="FAIL") then "FAIL" elif any(.validations[]; .subject_version=="buggy" and .test_execution=="PASS") then "PASS" else "NOT_AVAILABLE" end' "$result_dir/result.json")
fixed_result=$(jq -r 'if ([.validations[]|select(.subject_version=="fixed" and .test_execution=="NOT_RUN")]|length)>0 then "NOT_AVAILABLE" elif any(.validations[]; .subject_version=="fixed" and .test_execution=="FAIL") then "FAIL" elif any(.validations[]; .subject_version=="fixed" and .test_execution=="PASS") then "PASS" else "NOT_AVAILABLE" end' "$result_dir/result.json")
if [[ "$buggy_result" == FAIL && "$fixed_result" == PASS ]]; then
  bug_detected=true; summary_status=defect
  defect=$(jq -r '[.validations[]|select(.subject_version=="buggy" and .test_execution=="FAIL")|.error]|map(select(.!=null))|join("\n---\n")' "$result_dir/result.json")
elif [[ "$buggy_result" == NOT_AVAILABLE || "$fixed_result" == NOT_AVAILABLE ]]; then
  bug_detected=not_available; summary_status=not_available; defect=''
else
  bug_detected=false; summary_status=pass; defect=''
fi
jq -n --arg project "$project" --argjson bug_id "$bug_id" --arg algorithm "$algorithm" --argjson seed "$seed" \
  --arg buggy "$buggy_result" --arg fixed "$fixed_result" --arg bug_detected "$bug_detected" \
  --arg status "$summary_status" --arg defect "$defect" \
  '{schema_version:"2.0",report_type:"bug_detection",project:$project,bug_id:$bug_id,algorithm:$algorithm,seed:$seed,buggy_result:$buggy,fixed_result:$fixed,bug_detected:(if $bug_detected=="true" then true elif $bug_detected=="false" then false else $bug_detected end),status:$status,defect:(if $defect=="" then null else $defect end)}' > "$result_dir/result_summary.json"
jq -r '["project","bug_id","algorithm","seed","buggy_result","fixed_result","bug_detected","status","defect"], [.project,.bug_id,.algorithm,.seed,.buggy_result,.fixed_result,.bug_detected,.status,(.defect//"")] | @csv' \
  "$result_dir/result_summary.json" > "$result_dir/result_summary.csv"

echo "Validation result : $result_dir/result.csv" >&2
echo "Detection summary : $result_dir/result_summary.csv" >&2
printf '%s\n' "$result_dir"
[[ $infrastructure_failed -eq 0 ]]
