#!/usr/bin/env bash
# Round 2: run the exact Round 1 EvoSuite archive with `defects4j test -s`
# on both PROJECT-BUGb and PROJECT-BUGf.
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
command -v jq >/dev/null || { echo "jq is required." >&2; exit 2; }
for file in "$defects4j_bin" "$java11_home/bin/java"; do [[ -e "$file" ]] || { echo "Missing: $file" >&2; exit 2; }; done
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
suite_archive="$test_root/evosuite-tests.tar.bz2"
[[ -d "$test_root" ]] || { echo "Generated TestCode not found for ${project}_${bug_id}" >&2; exit 2; }
[[ -f "$generation_result" ]] || { echo "Round 1 result not found for ${project}_${bug_id}" >&2; exit 2; }
[[ -f "$suite_archive" ]] || { echo "Round 1 EvoSuite archive not found: $suite_archive" >&2; exit 2; }
test_count=$( (rg --no-filename '@Test' "$test_root" -g '*_ESTest.java' 2>/dev/null || true) | wc -l | tr -d ' ')
[[ "$test_count" -gt 0 ]] || { echo "No EvoSuite test methods found in $test_root" >&2; exit 2; }
algorithm=$(jq -r '.targets[0].algorithm // .algorithm // "STANDARD_GA"' "$generation_result")
seed=$(jq -r '.targets[0].seed // empty' "$generation_result")
[[ "$seed" =~ ^[0-9]+$ ]] || { echo "Missing valid seed in Round 1 result." >&2; exit 2; }

result_dir="$ga_root/Result_Round2/${project}_${bug_id}"
archive_previous_run "$result_dir"; mkdir -p "$result_dir"
temp_root=$(mktemp -d "/tmp/evosuite-validation-${project}-${bug_id}.XXXXXX")
cleanup() { rm -rf "$temp_root"; }; trap cleanup EXIT INT TERM

test_classes=$(while IFS= read -r source; do
  package=$(awk '/^[[:space:]]*package[[:space:]]+/ {gsub(/[;\r]/,"",$2); print $2; exit}' "$source")
  name=$(basename "$source" .java); printf '%s%s\n' "${package:+$package.}" "$name"
done < <(find "$test_root" -type f -name '*_ESTest.java' | sort) | paste -sd ';' -)

jsonl="$temp_root/validations.jsonl"; : > "$jsonl"
infrastructure_failed=0

validate_version() {
  local version=$1 suffix=$2 workspace="$temp_root/workspace-$1"
  local setup_output="$temp_root/setup-$1.txt" test_output="$temp_root/test-$1.txt"
  local failing_file started seconds test_rc reported_failures failures passed_tests execution state error
  echo "[$project-$bug_id $version] checkout ${bug_id}${suffix}, compile, defects4j test -s" >&2
  if ! "$defects4j_bin" checkout -p "$project" -v "${bug_id}${suffix}" -w "$workspace" >"$setup_output" 2>&1; then
    execution=NOT_RUN; state=setup_failed; error=$(tail -20 "$setup_output"); infrastructure_failed=1
    tests_run=null; passed_tests=null; failures=null; seconds=0
  elif ! "$defects4j_bin" compile -w "$workspace" >>"$setup_output" 2>&1; then
    execution=NOT_RUN; state=compile_failed; error=$(tail -20 "$setup_output"); infrastructure_failed=1
    tests_run=null; passed_tests=null; failures=null; seconds=0
  else
    failing_file="$workspace/failing_tests"; rm -f "$failing_file"
    started=$(date +%s); set +e
    (cd "$workspace" && "$defects4j_bin" test -s "$suite_archive") >"$test_output" 2>&1
    test_rc=$?; set -e; seconds=$(( $(date +%s) - started ))
    reported_failures=$(rg -o 'Failing tests:[[:space:]]*[0-9]+' "$test_output" | tail -1 | rg -o '[0-9]+' || true)
    if [[ -z "$reported_failures" && -f "$failing_file" ]]; then
      reported_failures=$(rg -c '^--- ' "$failing_file" || true)
    fi
    if [[ -z "$reported_failures" && $test_rc -eq 0 && ! -s "$failing_file" ]]; then reported_failures=0; fi
    if [[ ! "$reported_failures" =~ ^[0-9]+$ || "$reported_failures" -gt "$test_count" ]]; then
      execution=NOT_RUN; state=test_execution_error; error=$(tail -20 "$test_output"); infrastructure_failed=1
      tests_run=null; passed_tests=null; failures=null
    else
      tests_run=$test_count; failures=$reported_failures; passed_tests=$((tests_run - failures))
      if [[ "$failures" -gt 0 ]]; then
        execution=FAIL; state=test_failed
        if [[ -s "$failing_file" ]]; then error=$(cat "$failing_file"); else error=$(tail -20 "$test_output"); fi
      else
        execution=PASS; state=ok; error=''
      fi
    fi
  fi
  jq -n --arg project "$project" --argjson bug_id "$bug_id" --arg algorithm "$algorithm" \
    --argjson seed "$seed" --arg version "$version" --arg test_class "$test_classes" \
    --argjson seconds "$seconds" --argjson tests_run "$tests_run" --argjson passed_tests "$passed_tests" \
    --argjson failures "$failures" --arg execution "$execution" --arg state "$state" --arg error "$error" \
    '{project:$project,bug_id:$bug_id,algorithm:$algorithm,seed:$seed,subject_version:$version,test_class:$test_class,execution_seconds:$seconds,tests_run:$tests_run,passed_tests:$passed_tests,failures:$failures,test_execution:$execution,status:$state,error:(if $error=="" then null else $error end)}' >> "$jsonl"
}

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

buggy_result=$(jq -r '.validations[]|select(.subject_version=="buggy")|.test_execution' "$result_dir/result.json")
fixed_result=$(jq -r '.validations[]|select(.subject_version=="fixed")|.test_execution' "$result_dir/result.json")
buggy_count=$(jq -r '.validations[]|select(.subject_version=="buggy")|.tests_run' "$result_dir/result.json")
fixed_count=$(jq -r '.validations[]|select(.subject_version=="fixed")|.tests_run' "$result_dir/result.json")
if [[ "$buggy_result" == NOT_RUN || "$fixed_result" == NOT_RUN ]]; then
  bug_detected=not_available; summary_status=not_available; defect=''
elif [[ "$buggy_count" != "$fixed_count" ]]; then
  bug_detected=false; summary_status=inconclusive; defect=''
elif [[ "$buggy_result" == FAIL && "$fixed_result" == PASS ]]; then
  bug_detected=true; summary_status=pass
  defect=$(jq -r '.validations[]|select(.subject_version=="buggy")|.error//""' "$result_dir/result.json")
elif [[ "$buggy_result" == PASS && "$fixed_result" == PASS ]]; then
  bug_detected=false; summary_status=pass; defect=''
else
  bug_detected=false; summary_status=inconclusive; defect=''
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
