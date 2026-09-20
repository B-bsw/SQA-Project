#!/usr/bin/env bash
# Complete EvoSuite STANDARD_GA experiment using temporary Defects4J checkouts.
# Usage: run_evosuite_ga.sh PROJECT BUG_ID[,BUG_ID...] RESULT_ROUND [BUDGET_SECONDS]
# Example: run_evosuite_ga.sh Chart 1,2 1 120
set -euo pipefail

usage() {
  echo "Usage: $0 PROJECT BUG_ID[,BUG_ID...] RESULT_ROUND(1|2) [BUDGET_SECONDS]" >&2
  echo "Example: $0 Chart 1,2 1 120" >&2
  exit 2
}

[[ $# -ge 3 && $# -le 4 ]] || usage
project_input=$1
id_spec=$(printf '%s' "$2" | tr -d '[:space:]')
id_spec=${id_spec#\[}
id_spec=${id_spec%\]}
round=$3
budget=${4:-120}
[[ "$project_input" =~ ^[A-Za-z][A-Za-z0-9]*$ ]] || { echo "Invalid project: $project_input" >&2; usage; }
[[ "$round" =~ ^(1|2)$ ]] || { echo "ROUND must be 1 or 2." >&2; exit 2; }
[[ "$budget" =~ ^[1-9][0-9]*$ ]] || { echo "BUDGET_SECONDS must be positive." >&2; exit 2; }
code_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)

IFS=, read -r -a bug_ids <<< "$id_spec"
[[ ${#bug_ids[@]} -gt 0 ]] || usage
for id in "${bug_ids[@]}"; do
  [[ "$id" =~ ^[1-9][0-9]*$ ]] || { echo "Invalid bug id: $id" >&2; usage; }
done

if [[ ${#bug_ids[@]} -gt 1 ]]; then
  max_parallel=${MAX_PARALLEL:-2}
  [[ "$max_parallel" =~ ^[1-9][0-9]*$ ]] || { echo "MAX_PARALLEL must be positive." >&2; exit 2; }
  pids=(); failed=0
  echo "Batch $project_input Round $round: ${#bug_ids[@]} bugs, MAX_PARALLEL=$max_parallel" >&2
  for id in "${bug_ids[@]}"; do
    while [[ $(jobs -pr | wc -l | tr -d ' ') -ge $max_parallel ]]; do sleep 1; done
    "$0" "$project_input" "$id" "$round" "$budget" &
    pids+=("$!")
  done
  for pid in "${pids[@]}"; do
    if ! wait "$pid"; then failed=$((failed + 1)); fi
  done
  "$code_dir/collect_ga_reports.sh" "$round" >/dev/null
  echo "Batch complete: $((${#bug_ids[@]} - failed)) succeeded, $failed failed" >&2
  echo "Combined report: $(cd "$code_dir/.." && pwd)/Result_Round${round}/report.csv" >&2
  [[ $failed -eq 0 ]]
  exit
fi

project=$project_input
bug_id=${bug_ids[0]}
project_target="${project}_${bug_id}"

ga_root=$(cd "$code_dir/.." && pwd)
defects4j_bin=${DEFECTS4J_BIN:-/Users/bb/Desktop/class/sqa/defects4j/framework/bin/defects4j}
evosuite_jar=${EVOSUITE_JAR:-$code_dir/evosuite-1.2.0.jar}
sdk_java=${SDK_JAVA:-11.0.31-amzn}
seed=${SEED:-20260918}
client_memory_mb=${EVOSUITE_CLIENT_MEMORY_MB:-2048}

command -v jq >/dev/null || { echo "jq is required." >&2; exit 2; }
command -v rg >/dev/null || { echo "rg is required." >&2; exit 2; }
[[ -x "$defects4j_bin" ]] || { echo "Defects4J not found: $defects4j_bin" >&2; exit 2; }
[[ -f "$evosuite_jar" ]] || { echo "EvoSuite not found: $evosuite_jar" >&2; exit 2; }
[[ "$seed" =~ ^[0-9]+$ ]] || { echo "SEED must be a non-negative integer." >&2; exit 2; }
[[ "$client_memory_mb" =~ ^[1-9][0-9]*$ ]] || { echo "EVOSUITE_CLIENT_MEMORY_MB must be positive." >&2; exit 2; }

# SDKMAN exposes sdk as a shell function.
sdkman_init=${SDKMAN_INIT:-${SDKMAN_DIR:-$HOME/.sdkman}/bin/sdkman-init.sh}
[[ -s "$sdkman_init" ]] || { echo "SDKMAN init not found: $sdkman_init" >&2; exit 2; }
set +u
# shellcheck source=/dev/null
source "$sdkman_init"
sdk use java "$sdk_java" >/dev/null
set -u
java_major=$(java -version 2>&1 | awk -F'[\".]' '/version/ {print $2; exit}')
[[ "$java_major" == 11 ]] || { echo "Java 11 is required." >&2; exit 2; }

# Resolve the canonical Defects4J project name.
requested=$(printf '%s' "$project" | tr '[:upper:]' '[:lower:]')
canonical=''
while IFS= read -r candidate; do
  lower=$(printf '%s' "$candidate" | tr '[:upper:]' '[:lower:]')
  [[ "$lower" == "$requested" ]] && { canonical=$candidate; break; }
done < <("$defects4j_bin" pids)
[[ -n "$canonical" ]] || { echo "Unknown Defects4J project: $project" >&2; exit 2; }
project=$canonical
project_target="${project}_${bug_id}"

temp_root=$(mktemp -d "/tmp/evosuite-ga-${project_target}-r${round}.XXXXXX")
cleanup() {
  case "$temp_root" in /tmp/evosuite-ga-*) rm -rf "$temp_root" ;; esac
}
trap cleanup EXIT INT TERM

stage_tests="$temp_root/TestCode"
targets_jsonl="$temp_root/targets.jsonl"
validations_jsonl="$temp_root/validations.jsonl"
mkdir -p "$stage_tests"
: > "$targets_jsonl"
: > "$validations_jsonl"

checkout_revision() {
  local suffix=$1 workspace=$2 log=$3
  echo "[$project_target round $round] defects4j checkout ${bug_id}${suffix}" >&2
  "$defects4j_bin" checkout -p "$project" -v "${bug_id}${suffix}" -w "$workspace" >"$log" 2>&1
}

compile_revision() {
  local workspace=$1 log=$2
  echo "[$project_target round $round] defects4j compile" >&2
  "$defects4j_bin" compile -w "$workspace" >>"$log" 2>&1
}

remove_checkout() {
  local workspace=$1
  case "$workspace" in
    "$temp_root"/*) rm -rf "$workspace" ;;
    *) echo "Refusing to remove non-temporary path: $workspace" >&2; exit 1 ;;
  esac
}

run_suite() {
  local subject=$1 workspace=$2 log=$3
  local failing_file="$workspace/failing_tests" failures result rc
  echo "[$project_target round $round] test $subject" >&2
  rm -f "$failing_file"
  set +e
  (cd "$workspace" && "$defects4j_bin" test -s "$suite_archive") >>"$log" 2>&1
  rc=$?
  set -e
  failures=$(rg -o 'Failing tests:[[:space:]]*[0-9]+' "$log" | tail -1 | rg -o '[0-9]+' || true)
  [[ -n "$failures" ]] || { [[ -f "$failing_file" ]] && failures=$(rg -c '^--- ' "$failing_file" || true); }
  [[ -n "$failures" ]] || { [[ $rc -eq 0 ]] && failures=0; }
  if [[ ! "$failures" =~ ^[0-9]+$ ]]; then result=NOT_RUN; failures=null
  elif [[ $failures -eq 0 ]]; then result=PASS
  else result=FAIL
  fi
  jq -n --arg subject "$subject" --arg result "$result" --argjson failures "$failures" \
    '{subject:$subject,result:$result,failures:$failures}' >> "$validations_jsonl"
}

# 1. Checkout buggy revision. Generate GA tests from Defects4J modified classes.
buggy_checkout="$temp_root/buggy-checkout"
buggy_log="$temp_root/buggy.log"
if ! checkout_revision b "$buggy_checkout" "$buggy_log" ||
   ! compile_revision "$buggy_checkout" "$buggy_log"; then
  echo "Buggy checkout/compile failed:" >&2
  tail -40 "$buggy_log" >&2
  exit 1
fi

bin_relative=$("$defects4j_bin" export -w "$buggy_checkout" -p dir.bin.classes)
compile_cp=$("$defects4j_bin" export -w "$buggy_checkout" -p cp.compile)
modified_classes="$temp_root/modified-classes.txt"
"$defects4j_bin" export -w "$buggy_checkout" -p classes.modified | tr -d '\r' | sed '/^[[:space:]]*$/d' | sort -u > "$modified_classes"
[[ -s "$modified_classes" ]] || { echo "No modified classes for $project_target." >&2; exit 1; }

clean_cp=''; old_ifs=$IFS; IFS=:
for entry in $compile_cp; do
  [[ -e "$entry" ]] || entry="$buggy_checkout/$entry"
  [[ -e "$entry" ]] || continue
  [[ -z "$clean_cp" ]] && clean_cp=$entry || clean_cp="$clean_cp:$entry"
done
IFS=$old_ifs
stat_value() {
  local file=$1 column=$2
  awk -F, -v name="$column" 'NR==1{for(i=1;i<=NF;i++)if($i==name)p=i;next} NR==2&&p{print $p}' "$file"
}

while IFS= read -r target_class; do
  slug=${target_class//[^A-Za-z0-9_]/_}
  generated="$temp_root/generated-$slug"
  statistics_dir="$temp_root/statistics-$slug"
  generation_log="$temp_root/generate-$slug.log"
  mkdir -p "$generated" "$statistics_dir"
  echo "[$project_target round $round] EvoSuite STANDARD_GA: $target_class" >&2
  started=$(date +%s)
  project_classpath="$buggy_checkout/$bin_relative:$clean_cp"
  set +e
  # EvoSuite 1.2.0's ComputeClassWriter uses the JVM classloader while
  # instrumenting some legacy projects. Put the subject on both the JVM
  # classpath and projectCP so referenced classes (for example Chart's Range)
  # remain visible during bytecode frame computation.
  java ${EVOSUITE_JAVA_OPTS:--Xmx2g} -cp "$evosuite_jar:$project_classpath" org.evosuite.EvoSuite \
    -mem "$client_memory_mb" -class "$target_class" \
    -projectCP "$project_classpath" -seed "$seed" \
    -criterion LINE:BRANCH -generateSuite -Dalgorithm=STANDARD_GA \
    -Dlocal_search_rate=0 -Dclient_on_thread=true \
    -Dstopping_condition=MaxTime -Dsearch_budget="$budget" \
    -Dshow_progress=false \
    -Doutput_variables=TARGET_CLASS,criterion,Coverage,Total_Goals,Covered_Goals,LineCoverage,Lines,Covered_Lines,BranchCoverage,Total_Branches,Covered_Branches,Total_Methods,Covered_Methods,Branchless_Methods,Covered_Branchless_Methods \
    -Dtest_dir="$generated" -Dreport_dir="$statistics_dir" >"$generation_log" 2>&1
  generation_rc=$?
  set -e
  seconds=$(( $(date +%s) - started ))
  tests=$( (rg --no-filename '@Test' "$generated" -g '*_ESTest.java' 2>/dev/null || true) | wc -l | tr -d ' ')
  coverage=null; line_cov=null; branch_cov=null
  total_goals=null; covered_goals=null; lines=null; covered_lines=null
  total_branches=null; covered_branches=null; total_methods=null; covered_methods=null
  branchless_methods=null; covered_branchless_methods=null
  if [[ -f "$statistics_dir/statistics.csv" ]]; then
    for metric in Coverage LineCoverage BranchCoverage; do
      value=$(stat_value "$statistics_dir/statistics.csv" "$metric")
      [[ -n "$value" ]] || continue
      percent=$(awk -v n="$value" 'BEGIN{printf "%.2f",n*100}')
      case "$metric" in Coverage) coverage=$percent ;; LineCoverage) line_cov=$percent ;; BranchCoverage) branch_cov=$percent ;; esac
    done
    total_goals=$(stat_value "$statistics_dir/statistics.csv" Total_Goals); total_goals=${total_goals:-null}
    covered_goals=$(stat_value "$statistics_dir/statistics.csv" Covered_Goals); covered_goals=${covered_goals:-null}
    lines=$(stat_value "$statistics_dir/statistics.csv" Lines); lines=${lines:-null}
    covered_lines=$(stat_value "$statistics_dir/statistics.csv" Covered_Lines); covered_lines=${covered_lines:-null}
    total_branches=$(stat_value "$statistics_dir/statistics.csv" Total_Branches); total_branches=${total_branches:-null}
    covered_branches=$(stat_value "$statistics_dir/statistics.csv" Covered_Branches); covered_branches=${covered_branches:-null}
    total_methods=$(stat_value "$statistics_dir/statistics.csv" Total_Methods); total_methods=${total_methods:-null}
    covered_methods=$(stat_value "$statistics_dir/statistics.csv" Covered_Methods); covered_methods=${covered_methods:-null}
    branchless_methods=$(stat_value "$statistics_dir/statistics.csv" Branchless_Methods); branchless_methods=${branchless_methods:-null}
    covered_branchless_methods=$(stat_value "$statistics_dir/statistics.csv" Covered_Branchless_Methods); covered_branchless_methods=${covered_branchless_methods:-null}
  fi
  generation_result=FAIL
  [[ $generation_rc -eq 0 && $tests -gt 0 ]] && generation_result=PASS
  if [[ $tests -eq 0 ]]; then
    echo "EvoSuite generated no tests for $target_class (exit $generation_rc):" >&2
    tail -40 "$generation_log" >&2
  fi
  while IFS= read -r source; do
    relative=${source#"$generated/"}
    destination="$stage_tests/$relative"
    mkdir -p "$(dirname "$destination")"
    [[ ! -e "$destination" ]] || { echo "Duplicate generated test: $relative" >&2; exit 1; }
    cp "$source" "$destination"
  done < <(find "$generated" -type f -name '*.java' | sort)
  jq -n --arg target "$target_class" --arg result "$generation_result" \
    --argjson seconds "$seconds" --argjson tests "$tests" \
    --argjson coverage "$coverage" --argjson line "$line_cov" --argjson branch "$branch_cov" \
    --argjson total_goals "$total_goals" --argjson covered_goals "$covered_goals" \
    --argjson lines "$lines" --argjson covered_lines "$covered_lines" \
    --argjson total_branches "$total_branches" --argjson covered_branches "$covered_branches" \
    --argjson total_methods "$total_methods" --argjson covered_methods "$covered_methods" \
    --argjson branchless_methods "$branchless_methods" --argjson covered_branchless_methods "$covered_branchless_methods" \
    '{target_class:$target,generation_result:$result,generation_seconds:$seconds,tests:$tests,coverage:$coverage,line_cov:$line,branch_cov:$branch,total_goals:$total_goals,covered_goals:$covered_goals,lines:$lines,covered_lines:$covered_lines,total_branches:$total_branches,covered_branches:$covered_branches,total_methods:$total_methods,covered_methods:$covered_methods,branchless_methods:$branchless_methods,covered_branchless_methods:$covered_branchless_methods}' >> "$targets_jsonl"
done < "$modified_classes"

test_count=$( (rg --no-filename '@Test' "$stage_tests" -g '*_ESTest.java' 2>/dev/null || true) | wc -l | tr -d ' ')
[[ $test_count -gt 0 ]] || { echo "EvoSuite generated no usable tests." >&2; exit 1; }
suite_archive="$temp_root/evosuite-tests.tar.bz2"
tar -cjf "$suite_archive" -C "$stage_tests" .

# Test buggy, record its result, then delete the buggy checkout.
run_suite buggy "$buggy_checkout" "$buggy_log"
remove_checkout "$buggy_checkout"

# 2. Checkout fixed only after buggy was deleted. Test the exact same archive.
fixed_checkout="$temp_root/fixed-checkout"
fixed_log="$temp_root/fixed.log"
if checkout_revision f "$fixed_checkout" "$fixed_log" &&
   compile_revision "$fixed_checkout" "$fixed_log"; then
  run_suite fixed "$fixed_checkout" "$fixed_log"
else
  echo "Fixed checkout/compile failed:" >&2
  tail -40 "$fixed_log" >&2
  jq -n '{subject:"fixed",result:"NOT_RUN",failures:null}' >> "$validations_jsonl"
fi
remove_checkout "$fixed_checkout"

buggy_result=$(jq -sr '.[]|select(.subject=="buggy")|.result' "$validations_jsonl")
fixed_result=$(jq -sr '.[]|select(.subject=="fixed")|.result' "$validations_jsonl")
buggy_fails=$(jq -sr '.[]|select(.subject=="buggy")|.failures' "$validations_jsonl")
fixed_fails=$(jq -sr '.[]|select(.subject=="fixed")|.failures' "$validations_jsonl")
if [[ "$buggy_result" == FAIL && "$fixed_result" == PASS ]]; then verdict=REVEALING
elif [[ "$buggy_result" == PASS && "$fixed_result" == PASS ]]; then verdict=NOT_REVEALING
elif [[ "$buggy_result" == NOT_RUN || "$fixed_result" == NOT_RUN ]]; then verdict=NOT_AVAILABLE
else verdict=INCONCLUSIVE
fi

tests=$(jq -s '[.[].tests]|add//0' "$targets_jsonl")
coverage=$(jq -s '[.[].coverage|select(.!=null)]|if length==0 then null else (add/length*100|round/100) end' "$targets_jsonl")
line_cov=$(jq -s '[.[].line_cov|select(.!=null)]|if length==0 then null else (add/length*100|round/100) end' "$targets_jsonl")
branch_cov=$(jq -s '[.[].branch_cov|select(.!=null)]|if length==0 then null else (add/length*100|round/100) end' "$targets_jsonl")
total_goals=$(jq -s '[.[].total_goals|select(.!=null)]|add//0' "$targets_jsonl")
covered_goals=$(jq -s '[.[].covered_goals|select(.!=null)]|add//0' "$targets_jsonl")
lines=$(jq -s '[.[].lines|select(.!=null)]|add//0' "$targets_jsonl")
covered_lines=$(jq -s '[.[].covered_lines|select(.!=null)]|add//0' "$targets_jsonl")
total_branches=$(jq -s '[.[].total_branches|select(.!=null)]|add//0' "$targets_jsonl")
covered_branches=$(jq -s '[.[].covered_branches|select(.!=null)]|add//0' "$targets_jsonl")
created_at=$(date -u +%Y-%m-%dT%H:%M:%SZ)
stage_report="$temp_root/report"
mkdir -p "$stage_report"
jq -n --argjson round "$round" --arg project "$project" --argjson bug_id "$bug_id" \
  --argjson seed "$seed" --argjson budget "$budget" --argjson tests "$tests" \
  --argjson coverage "$coverage" --argjson line_cov "$line_cov" --argjson branch_cov "$branch_cov" \
  --argjson total_goals "$total_goals" --argjson covered_goals "$covered_goals" \
  --argjson lines "$lines" --argjson covered_lines "$covered_lines" \
  --argjson total_branches "$total_branches" --argjson covered_branches "$covered_branches" \
  --arg buggy_result "$buggy_result" --argjson buggy_fails "$buggy_fails" \
  --arg fixed_result "$fixed_result" --argjson fixed_fails "$fixed_fails" \
  --arg verdict "$verdict" --arg created_at "$created_at" \
  --slurpfile targets "$targets_jsonl" --slurpfile validations "$validations_jsonl" \
  '{schema_version:"1.1",algorithm:"STANDARD_GA",created_at:$created_at,round:$round,project:$project,bug_id:$bug_id,seed:$seed,budget:$budget,tests:$tests,coverage:$coverage,line_cov:$line_cov,branch_cov:$branch_cov,total_goals:$total_goals,covered_goals:$covered_goals,lines:$lines,covered_lines:$covered_lines,total_branches:$total_branches,covered_branches:$covered_branches,buggy_result:$buggy_result,buggy_fails:$buggy_fails,fixed_result:$fixed_result,fixed_fails:$fixed_fails,verdict:$verdict,targets:$targets,validations:$validations}' > "$stage_report/result.json"
jq -r '["round","project","bug_id","seed","budget","tests","coverage","line_cov","branch_cov","total_goals","covered_goals","lines","covered_lines","total_branches","covered_branches","buggy_result","buggy_fails","fixed_result","fixed_fails","verdict"], [.round,.project,.bug_id,.seed,.budget,.tests,(.coverage//""),(.line_cov//""),(.branch_cov//""),.total_goals,.covered_goals,.lines,.covered_lines,.total_branches,.covered_branches,.buggy_result,(.buggy_fails//""),.fixed_result,(.fixed_fails//""),.verdict] | @csv' \
  "$stage_report/result.json" > "$stage_report/result.csv"

# Persist only generated Java tests and reports after both temporary checkouts
# finish. The tar archive remains temporary and is deleted by the cleanup trap.
test_destination="$ga_root/TestCode/$project_target"
report_destination="$ga_root/Result_Round${round}/$project_target"
mkdir -p "$(dirname "$test_destination")" "$(dirname "$report_destination")"
if [[ -e "$test_destination" || -e "$report_destination" ]]; then
  history="$ga_root/ReportHistory/$(date -u +%Y%m%dT%H%M%SZ)-Round${round}-${project_target}"
  mkdir -p "$history"
  [[ ! -e "$test_destination" ]] || cp -pR "$test_destination" "$history/TestCode"
  [[ ! -e "$report_destination" ]] || cp -pR "$report_destination" "$history/Report"
fi
rm -rf "$test_destination" "$report_destination"
mkdir -p "$test_destination" "$report_destination"
cp -pR "$stage_tests"/. "$test_destination"/
cp -pR "$stage_report"/. "$report_destination"/

echo "Generated tests: $test_destination" >&2
echo "Report         : $report_destination/result.csv" >&2
printf '%s\n' "$report_destination/result.csv"
[[ "$verdict" != NOT_AVAILABLE ]]
