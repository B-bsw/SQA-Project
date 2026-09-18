#!/usr/bin/env bash
# Usage: run_evosuite_multiple.sh [--budget SECONDS] PROJECT BUG_ID [PROJECT BUG_ID ...]
#        run_evosuite_multiple.sh [--budget SECONDS] --all
set -euo pipefail
code_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)
ga_root=$(cd "$code_dir/.." && pwd); repo_root=$(cd "$ga_root/.." && pwd)
resource_root=${RESOURCE_ROOT:-$repo_root/Resoucre}; budget=60
if [[ ${1:-} == --budget ]]; then
  [[ $# -ge 3 ]] || { echo "--budget requires seconds and subjects." >&2; exit 2; }
  budget=$2; shift 2
fi
[[ "$budget" =~ ^[1-9][0-9]*$ ]] || { echo "Budget must be positive." >&2; exit 2; }
subjects=()
if [[ ${1:-} == --all ]]; then
  [[ $# -eq 1 ]] || { echo "--all cannot be combined with pairs." >&2; exit 2; }
  while IFS= read -r directory; do subjects+=("$(basename "$directory")"); done \
    < <(find "$resource_root" -mindepth 1 -maxdepth 1 -type d | awk -F/ '$NF ~ /^[A-Za-z][A-Za-z0-9]*_[1-9][0-9]*$/ {print}' | sort -V)
else
  [[ $# -ge 2 && $(( $# % 2 )) -eq 0 ]] || {
    echo "Usage: $0 [--budget SECONDS] PROJECT BUG_ID [PROJECT BUG_ID ...]" >&2; exit 2;
  }
  while [[ $# -gt 0 ]]; do subjects+=("$1_$2"); shift 2; done
fi
[[ ${#subjects[@]} -gt 0 ]] || { echo "No Resource subjects selected." >&2; exit 2; }

batch_id=$(date -u +%Y%m%dT%H%M%SZ)-$$
batch_dir="$ga_root/Result/Multiple_$batch_id"; mkdir -p "$batch_dir"
jsonl="$batch_dir/results.jsonl"; : > "$jsonl"; failed=0
for subject in "${subjects[@]}"; do
  project=${subject%_*}; bug_id=${subject##*_}; subject_dir="$batch_dir/$subject"
  subject_tests="$ga_root/TestCode/Multiple_$batch_id/$subject"
  echo "Running $project-$bug_id" >&2; set +e
  RESULT_DIR="$subject_dir" TEST_DIR="$subject_tests" RESOURCE_ROOT="$resource_root" \
    "$code_dir/run_evosuite_test.sh" "$project" "$bug_id" "$budget" >/dev/null
  rc=$?; set -e
  if [[ -f "$subject_dir/result.json" ]]; then
    jq --arg folder "$subject" '{folder:$folder,project:.project,bug_id:.bug_id,status:.status,target_count:(.targets|length),test_methods:([.targets[].generated_test_methods]|add//0),test_code_dir:.test_code_dir,result_file:($folder+"/result.json"),report_file:($folder+"/report.md")}' "$subject_dir/result.json" >> "$jsonl"
  else
    jq -n --arg folder "$subject" --arg project "$project" --argjson bug_id "$bug_id" '{folder:$folder,project:$project,bug_id:$bug_id,status:"runner_failed",target_count:0,test_methods:0,result_file:null,report_file:null}' >> "$jsonl"
  fi
  [[ $rc -eq 0 ]] || failed=$((failed + 1))
done
created_at=$(date -u +%Y-%m-%dT%H:%M:%SZ)
jq -s --arg run_id "$batch_id" --arg created_at "$created_at" --argjson budget "$budget" \
  '{schema_version:"1.0",run_id:$run_id,created_at:$created_at,algorithm:"STANDARD_GA",search_budget_seconds:$budget,subject_count:length,successful_subjects:([.[]|select(.status=="ok")]|length),failed_subjects:([.[]|select(.status!="ok")]|length),subjects:.}' "$jsonl" > "$batch_dir/result.json"
rm "$jsonl"
jq -r '"# EvoSuite STANDARD_GA multiple result","",
  "- Run: "+.run_id,"- Subjects: "+(.subject_count|tostring),
  "- Successful: "+(.successful_subjects|tostring),"- Failed: "+(.failed_subjects|tostring),"",
  "| Subject | Targets | Tests | Status | Report |",
  "| --- | ---: | ---: | --- | --- |",
  (.subjects[]|"| "+.folder+" | "+(.target_count|tostring)+" | "+(.test_methods|tostring)+" | "+.status+" | "+(.report_file//"N/A")+" |")' "$batch_dir/result.json" > "$batch_dir/report.md"
printf '%s\n' "$batch_dir"
[[ $failed -eq 0 ]]
