#!/usr/bin/env bash
# Aggregate per-bug reports without modifying them.
# Usage: collect_results.sh 1 | 2 | all
set -euo pipefail
if [[ $# -ne 1 || ! "$1" =~ ^(1|2|all)$ ]]; then echo "Usage: $0 1 | 2 | all" >&2; exit 2; fi
code_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)
ga_root=$(cd "$code_dir/.." && pwd)
summary_root="$ga_root/summary_result"
mkdir -p "$summary_root"
source "$code_dir/report_helpers.sh"
command -v jq >/dev/null || { echo "jq is required." >&2; exit 2; }

collect_round1() {
  local files=() file output_json="$summary_root/result_round1.json" output_csv="$summary_root/result_round1.csv"
  local temp_json temp_csv
  while IFS= read -r file; do files+=("$file"); done < <(find "$ga_root/Result_Round1" -mindepth 2 -maxdepth 2 -name result.json -type f | sort)
  temp_json=$(mktemp "$summary_root/.result_round1.json.XXXXXX"); temp_csv=$(mktemp "$summary_root/.result_round1.csv.XXXXXX")
  if [[ ${#files[@]} -eq 0 ]]; then
    jq -n '{schema_version:"2.0",report_type:"generation",subjects:[]}' > "$temp_json"
  else
    jq -s '{schema_version:"2.0",report_type:"generation",subjects:sort_by(.project,.bug_id)}' "${files[@]}" > "$temp_json"
  fi
  jq -r '["project","bug_id","algorithm","seed","search_budget_seconds","target_class","generation_seconds","generated_test_methods","test_execution","line_coverage_percent","branch_coverage_percent","status","error"],
    (.subjects[] as $s | if (($s.targets//[])|length)==0 then
      [$s.project,$s.bug_id,($s.algorithm//""),"","","","",0,"NOT_RUN","","",$s.status,($s.error//"")]
    else $s.targets[] as $t | [$s.project,$s.bug_id,$t.algorithm,$t.seed,$t.search_budget_seconds,$t.target_class,$t.generation_seconds,$t.generated_test_methods,$t.test_execution,($t.line_coverage_percent//""),($t.branch_coverage_percent//""),$t.status,($t.error//"")] end) | @csv' "$temp_json" > "$temp_csv"
  archive_existing "$output_json" "$output_csv"; mv "$temp_json" "$output_json"; mv "$temp_csv" "$output_csv"
  echo "Round 1: $output_json" >&2; echo "Round 1: $output_csv" >&2
}

collect_round2() {
  local files=() summaries=() file output_json="$summary_root/result_round2.json" output_csv="$summary_root/result_round2.csv"
  local summary_json="$summary_root/result_summary.json" summary_csv="$summary_root/result_summary.csv" temp_json temp_csv temp_summary_json temp_summary_csv temp_explicit
  while IFS= read -r file; do files+=("$file"); done < <(find "$ga_root/Result_Round2" -mindepth 2 -maxdepth 2 -name result.json -type f | sort)
  while IFS= read -r file; do summaries+=("$file"); done < <(find "$ga_root/Result_Round2" -mindepth 2 -maxdepth 2 -name result_summary.json -type f | sort)
  temp_json=$(mktemp "$summary_root/.result_round2.json.XXXXXX"); temp_csv=$(mktemp "$summary_root/.result_round2.csv.XXXXXX")
  temp_summary_json=$(mktemp "$summary_root/.result_summary.json.XXXXXX"); temp_summary_csv=$(mktemp "$summary_root/.result_summary.csv.XXXXXX")
  temp_explicit=$(mktemp "$summary_root/.result_summary.explicit.XXXXXX")
  if [[ ${#files[@]} -eq 0 ]]; then
    jq -n '{schema_version:"2.0",report_type:"validation",subjects:[]}' > "$temp_json"
  else
    jq -s --slurpfile generation "$summary_root/result_round1.json" '
      ($generation[0].subjects) as $generations |
      map(. as $s | ([$generations[]|select(.project==$s.project and .bug_id==$s.bug_id)][0]//{}) as $g |
      .validations = ((.validations // .tests // []) | map(
      . + {project:(.project//$s.project),bug_id:(.bug_id//$s.bug_id),algorithm:(.algorithm//$s.algorithm//$g.targets[0].algorithm),seed:(.seed//$s.seed//$g.targets[0].seed),subject_version:(.subject_version//$s.subject_version//"fixed"),passed_tests:(.passed_tests // (if (.tests_run|type)=="number" and (.failures|type)=="number" then .tests_run-.failures else null end))}))) |
      {schema_version:"2.0",report_type:"validation",subjects:sort_by(.project,.bug_id)}' "${files[@]}" > "$temp_json"
  fi
  jq -r '["project","bug_id","algorithm","seed","subject_version","test_class","execution_seconds","tests_run","passed_tests","failures","test_execution","status","error"],
    (.subjects[] as $s | if (($s.validations//[])|length)==0 then
      [$s.project,$s.bug_id,($s.algorithm//""),($s.seed//""),($s.subject_version//""),"",0,"","","","NOT_RUN",$s.status,($s.error//"")]
    else $s.validations[] | [.project,.bug_id,(.algorithm//""),(.seed//""),.subject_version,.test_class,.execution_seconds,.tests_run,.passed_tests,.failures,.test_execution,.status,(.error//"")] end) | @csv' "$temp_json" > "$temp_csv"

  if [[ ${#summaries[@]} -eq 0 ]]; then jq -n '[]' > "$temp_explicit"; else jq -s '.' "${summaries[@]}" > "$temp_explicit"; fi
  jq -n --slurpfile validation "$temp_json" --slurpfile explicit "$temp_explicit" '
    ($explicit[0]) as $known |
    [$validation[0].subjects[] as $s |
      select(any($known[]; .project==$s.project and .bug_id==$s.bug_id)|not) |
      ([$s.validations[]|select(.subject_version=="fixed")]) as $fixed |
      {project:$s.project,bug_id:$s.bug_id,
       algorithm:($s.algorithm//$s.validations[0].algorithm),seed:($s.seed//$s.validations[0].seed),
       buggy_result:"NOT_AVAILABLE",
       fixed_result:(if ($fixed|length)==0 or any($fixed[];.test_execution=="NOT_RUN") then "NOT_AVAILABLE" elif any($fixed[];.test_execution=="FAIL") then "FAIL" elif any($fixed[];.test_execution=="PASS") then "PASS" else "NOT_AVAILABLE" end),
       bug_detected:"not_available",status:"not_available",defect:null}
    ] as $legacy |
    {schema_version:"2.0",report_type:"bug_detection",results:(($known+$legacy)|sort_by(.project,.bug_id))}' > "$temp_summary_json"
  rm -f "$temp_explicit"
  jq -r '["project","bug_id","algorithm","seed","buggy_result","fixed_result","bug_detected","status","defect"],
    (.results[] | [.project,.bug_id,.algorithm,.seed,.buggy_result,.fixed_result,.bug_detected,.status,(.defect//"")]) | @csv' "$temp_summary_json" > "$temp_summary_csv"
  archive_existing "$output_json" "$output_csv" "$summary_json" "$summary_csv"
  mv "$temp_json" "$output_json"; mv "$temp_csv" "$output_csv"
  mv "$temp_summary_json" "$summary_json"; mv "$temp_summary_csv" "$summary_csv"
  echo "Round 2: $output_json" >&2; echo "Round 2: $output_csv" >&2
  echo "Summary: $summary_json" >&2; echo "Summary: $summary_csv" >&2
}

case "$1" in 1) collect_round1 ;; 2) collect_round2 ;; all) collect_round1; collect_round2 ;; esac
