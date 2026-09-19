#!/usr/bin/env bash
# Produce a compact one-row-per-project overview for both rounds.
set -euo pipefail

if [[ $# -ne 0 ]]; then echo "Usage: $0" >&2; exit 2; fi

code_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)
ga_root=$(cd "$code_dir/.." && pwd)
collector="$code_dir/collect_results.sh"
output_json="$ga_root/summary.json"
output_csv="$ga_root/summary.csv"
command -v jq >/dev/null || { echo "jq is required." >&2; exit 2; }
[[ -x "$collector" ]] || { echo "Missing executable: $collector" >&2; exit 2; }

"$collector" all >/dev/null 2>&1
temp_json=$(mktemp "$ga_root/.summary.json.XXXXXX")
temp_csv=$(mktemp "$ga_root/.summary.csv.XXXXXX")
cleanup() { rm -f "$temp_json" "$temp_csv"; }
trap cleanup EXIT INT TERM

jq -n --slurpfile r1 "$ga_root/result_round1.json" \
  --slurpfile r2 "$ga_root/result_round2.json" \
  --arg generated_at "$(date -u +%Y-%m-%dT%H:%M:%SZ)" '
  def percent($passed; $total):
    if $total == 0 then 0 else (($passed / $total * 10000 | round) / 100) end;
  ($r1[0].subjects) as $round1 |
  ($r2[0].subjects) as $round2 |
  ([($round1[].project), ($round2[].project)] | unique | sort) as $names |
  ([$names[] as $project |
    ([$round1[] | select(.project == $project)]) as $one |
    ([$round2[] | select(.project == $project)]) as $two |
    ([$one[].targets[]?]) as $targets |
    ([$two[].tests[]?]) as $fixed_tests |
    ($one | length) as $total |
    ([$one[] | select(.status == "ok")] | length) as $r1_passed |
    ($two | length) as $r2_run |
    ([$two[] | select(.status == "ok")] | length) as $r2_passed |
    {project:$project,total_bugs:$total,
     round1_passed:$r1_passed,round1_percent:percent($r1_passed;$total),
     generated_test_methods:([$targets[].generated_test_methods] | add // 0),
     mean_line_coverage_percent:([$targets[].line_coverage_percent | select(. != null)] | if length == 0 then null else (add/length*100|round)/100 end),
     mean_branch_coverage_percent:([$targets[].branch_coverage_percent | select(. != null)] | if length == 0 then null else (add/length*100|round)/100 end),
     round2_run:$r2_run,round2_passed:$r2_passed,round2_percent:percent($r2_passed;$total),
     fixed_tests_run:([$fixed_tests[].tests_run] | add // 0),
     fixed_test_failures:([$fixed_tests[].failures] | add // 0)}
  ]) as $projects |
  ($projects | map(.total_bugs) | add // 0) as $total |
  ($projects | map(.round1_passed) | add // 0) as $r1_passed |
  ($projects | map(.round2_run) | add // 0) as $r2_run |
  ($projects | map(.round2_passed) | add // 0) as $r2_passed |
  ([$round1[].targets[]?]) as $all_targets |
  ([$round2[].tests[]?]) as $all_fixed_tests |
  {schema_version:"1.0",generated_at:$generated_at,
   overall:{total_bugs:$total,
     round1_passed:$r1_passed,round1_percent:percent($r1_passed;$total),
     generated_test_methods:([$all_targets[].generated_test_methods] | add // 0),
     mean_line_coverage_percent:([$all_targets[].line_coverage_percent | select(. != null)] | if length == 0 then null else (add/length*100|round)/100 end),
     mean_branch_coverage_percent:([$all_targets[].branch_coverage_percent | select(. != null)] | if length == 0 then null else (add/length*100|round)/100 end),
     round2_run:$r2_run,round2_passed:$r2_passed,round2_percent:percent($r2_passed;$total),
     fixed_tests_run:([$all_fixed_tests[].tests_run] | add // 0),
     fixed_test_failures:([$all_fixed_tests[].failures] | add // 0)},
   projects:$projects}
' > "$temp_json"

jq -r '
  ["project","total_bugs","round1_passed","round1_percent","generated_test_methods","mean_line_coverage_percent","mean_branch_coverage_percent","round2_run","round2_passed","round2_percent","fixed_tests_run","fixed_test_failures"],
  (.projects[] | [.project,.total_bugs,.round1_passed,.round1_percent,.generated_test_methods,(.mean_line_coverage_percent//""),(.mean_branch_coverage_percent//""),.round2_run,.round2_passed,.round2_percent,.fixed_tests_run,.fixed_test_failures]),
  (["ALL",.overall.total_bugs,.overall.round1_passed,.overall.round1_percent,.overall.generated_test_methods,(.overall.mean_line_coverage_percent//""),(.overall.mean_branch_coverage_percent//""),.overall.round2_run,.overall.round2_passed,.overall.round2_percent,.overall.fixed_tests_run,.overall.fixed_test_failures]) |
  @csv
' "$temp_json" > "$temp_csv"

mv "$temp_json" "$output_json"
mv "$temp_csv" "$output_csv"
trap - EXIT INT TERM

printf '%-10s %6s %17s %8s %8s %8s %17s %10s %9s\n' "PROJECT" "BUGS" "ROUND 1" "TESTS" "LINE%" "BRANCH%" "ROUND 2" "FIXED TEST" "FAILURES"
printf '%-10s %6s %17s %8s %8s %8s %17s %10s %9s\n' "----------" "------" "-----------------" "--------" "--------" "--------" "-----------------" "----------" "---------"
jq -r '.projects[],({project:"ALL"} + .overall) |
  [.project,.total_bugs,"\(.round1_passed)/\(.total_bugs) (\(.round1_percent)%)",.generated_test_methods,(.mean_line_coverage_percent//"N/A"),(.mean_branch_coverage_percent//"N/A"),"\(.round2_passed)/\(.total_bugs) (\(.round2_percent)%)",.fixed_tests_run,.fixed_test_failures] | @tsv' \
  "$output_json" | while IFS=$'\t' read -r project bugs round1 tests line branch round2 fixed failures; do
    printf '%-10s %6s %17s %8s %8s %8s %17s %10s %9s\n' "$project" "$bugs" "$round1" "$tests" "$line" "$branch" "$round2" "$fixed" "$failures"
  done
echo "JSON: $output_json"
echo "CSV : $output_csv"
