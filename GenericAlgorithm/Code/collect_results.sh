#!/usr/bin/env bash
# Usage: collect_results.sh 1 | 2 | all
set -euo pipefail

if [[ $# -ne 1 || ! "$1" =~ ^(1|2|all)$ ]]; then
  echo "Usage: $0 1 | 2 | all" >&2
  exit 2
fi

code_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)
ga_root=$(cd "$code_dir/.." && pwd)
command -v jq >/dev/null || { echo "jq is required." >&2; exit 2; }

collect_round1() {
  local source_dir="$ga_root/Result_Round1"
  local output_json="$ga_root/result_round1.json"
  local output_csv="$ga_root/result_round1.csv"
  local temp_json temp_csv generated_at
  local files=()
  while IFS= read -r file; do files+=("$file"); done \
    < <(find "$source_dir" -mindepth 2 -maxdepth 2 -type f -name result.json | sort)
  generated_at=$(date -u +%Y-%m-%dT%H:%M:%SZ)
  temp_json=$(mktemp "$ga_root/.result_round1.json.XXXXXX")
  temp_csv=$(mktemp "$ga_root/.result_round1.csv.XXXXXX")
  if [[ ${#files[@]} -eq 0 ]]; then
    jq -n --arg generated_at "$generated_at" \
      '{schema_version:"1.0",round:1,generated_at:$generated_at,summary:{subjects:0,successful_subjects:0,failed_subjects:0,total_targets:0,generated_test_methods:0,passed_targets:0,failed_targets:0,mean_line_coverage_percent:null,mean_branch_coverage_percent:null},subjects:[]}' > "$temp_json"
  else
    jq -s --arg generated_at "$generated_at" '
      sort_by(.project,.bug_id) as $subjects |
      [$subjects[].targets[]?] as $targets |
      {
        schema_version:"1.0",
        round:1,
        generated_at:$generated_at,
        summary:{
          subjects:($subjects|length),
          successful_subjects:([$subjects[]|select(.status=="ok")]|length),
          failed_subjects:([$subjects[]|select(.status!="ok")]|length),
          total_targets:($targets|length),
          generated_test_methods:([$targets[].generated_test_methods]|add // 0),
          passed_targets:([$targets[]|select(.test_execution=="PASS")]|length),
          failed_targets:([$targets[]|select(.status!="ok")]|length),
          mean_line_coverage_percent:([$targets[].line_coverage_percent|select(.!=null)]|if length==0 then null else (add/length*100|round)/100 end),
          mean_branch_coverage_percent:([$targets[].branch_coverage_percent|select(.!=null)]|if length==0 then null else (add/length*100|round)/100 end)
        },
        subjects:$subjects
      }' "${files[@]}" > "$temp_json"
  fi
  jq -r '
    ["project","bug_id","subject_status","target_class","source_file","algorithm","seed","search_budget_seconds","client_memory_mb","generation_seconds","generated_test_methods","test_execution","line_coverage_percent","branch_coverage_percent","target_status","error"],
    (.subjects[] as $s |
      if ($s.targets|length)==0 then
        [$s.project,$s.bug_id,$s.status,"","","","","","","",0,"NOT_RUN","","","",($s.error//"")]
      else
        $s.targets[] as $t |
        [$s.project,$s.bug_id,$s.status,$t.target_class,$t.source_file,$t.algorithm,$t.seed,$t.search_budget_seconds,($t.client_memory_mb//""),$t.generation_seconds,$t.generated_test_methods,$t.test_execution,($t.line_coverage_percent//""),($t.branch_coverage_percent//""),$t.status,($t.error//"")]
      end) | @csv' "$temp_json" > "$temp_csv"
  mv "$temp_json" "$output_json"
  mv "$temp_csv" "$output_csv"
  echo "Round 1: $output_json" >&2
  echo "Round 1: $output_csv" >&2
}

collect_round2() {
  local source_dir="$ga_root/Result_Round2"
  local output_json="$ga_root/result_round2.json"
  local output_csv="$ga_root/result_round2.csv"
  local temp_json temp_csv generated_at
  local files=()
  while IFS= read -r file; do files+=("$file"); done \
    < <(find "$source_dir" -mindepth 2 -maxdepth 2 -type f -name result.json | sort)
  generated_at=$(date -u +%Y-%m-%dT%H:%M:%SZ)
  temp_json=$(mktemp "$ga_root/.result_round2.json.XXXXXX")
  temp_csv=$(mktemp "$ga_root/.result_round2.csv.XXXXXX")
  if [[ ${#files[@]} -eq 0 ]]; then
    jq -n --arg generated_at "$generated_at" \
      '{schema_version:"1.0",round:2,generated_at:$generated_at,summary:{subjects:0,successful_subjects:0,failed_subjects:0,total_test_classes:0,tests_run:0,failures:0,passed_test_classes:0,failed_test_classes:0},subjects:[]}' > "$temp_json"
  else
    jq -s --arg generated_at "$generated_at" '
      sort_by(.project,.bug_id) as $subjects |
      [$subjects[].tests[]?] as $tests |
      {
        schema_version:"1.0",
        round:2,
        generated_at:$generated_at,
        summary:{
          subjects:($subjects|length),
          successful_subjects:([$subjects[]|select(.status=="ok")]|length),
          failed_subjects:([$subjects[]|select(.status!="ok")]|length),
          total_test_classes:($tests|length),
          tests_run:([$tests[].tests_run]|add // 0),
          failures:([$tests[].failures]|add // 0),
          passed_test_classes:([$tests[]|select(.test_execution=="PASS")]|length),
          failed_test_classes:([$tests[]|select(.status!="ok")]|length)
        },
        subjects:$subjects
      }' "${files[@]}" > "$temp_json"
  fi
  jq -r '
    ["project","bug_id","subject_status","subject_version","test_code_dir","test_class","execution_seconds","tests_run","failures","test_execution","test_status","error"],
    (.subjects[] as $s |
      if ($s.tests|length)==0 then
        [$s.project,$s.bug_id,$s.status,$s.subject_version,$s.test_code_dir,"","",0,0,"NOT_RUN","",($s.error//"")]
      else
        $s.tests[] as $t |
        [$s.project,$s.bug_id,$s.status,$s.subject_version,$s.test_code_dir,$t.test_class,$t.execution_seconds,$t.tests_run,$t.failures,$t.test_execution,$t.status,($t.error//"")]
      end) | @csv' "$temp_json" > "$temp_csv"
  mv "$temp_json" "$output_json"
  mv "$temp_csv" "$output_csv"
  echo "Round 2: $output_json" >&2
  echo "Round 2: $output_csv" >&2
}

case "$1" in
  1) collect_round1 ;;
  2) collect_round2 ;;
  all) collect_round1; collect_round2 ;;
esac
