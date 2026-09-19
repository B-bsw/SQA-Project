#!/usr/bin/env bash
# Compact per-project overview of generation, validation and detected defects.
set -euo pipefail
if [[ $# -ne 0 ]]; then echo "Usage: $0" >&2; exit 2; fi
code_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd); ga_root=$(cd "$code_dir/.." && pwd)
summary_root="$ga_root/summary_result"; mkdir -p "$summary_root"
source "$code_dir/report_helpers.sh"
command -v jq >/dev/null || { echo "jq is required." >&2; exit 2; }
"$code_dir/collect_results.sh" all >/dev/null
output_json="$summary_root/summary.json"; output_csv="$summary_root/summary.csv"
temp_json=$(mktemp "$summary_root/.summary.json.XXXXXX"); temp_csv=$(mktemp "$summary_root/.summary.csv.XXXXXX")
trap 'rm -f "$temp_json" "$temp_csv"' EXIT INT TERM
jq -n --slurpfile r1 "$summary_root/result_round1.json" --slurpfile r2 "$summary_root/result_round2.json" --slurpfile detected "$summary_root/result_summary.json" '
  def pct($part;$all): if $all==0 then 0 else (($part/$all*10000|round)/100) end;
  ($r1[0].subjects) as $generation | ($r2[0].subjects) as $validation | ($detected[0].results) as $detection |
  ([($generation[].project),($validation[].project)]|unique|sort) as $projects |
  [$projects[] as $project |
    ([$generation[]|select(.project==$project)]) as $g |
    ([$g[].targets[]?]) as $targets |
    ([$validation[]|select(.project==$project)|.validations[]?]) as $v |
    ([$detection[]|select(.project==$project)]) as $d |
    ($g|length) as $bugs | ([$g[]|select(.status=="ok")]|length) as $generated |
    {project:$project,bugs:$bugs,generation_ok:$generated,generation_percent:pct($generated;$bugs),
     generated_test_methods:([$targets[].generated_test_methods]|add//0),
     mean_line_coverage_percent:([$targets[].line_coverage_percent|select(.!=null)]|if length==0 then null else (add/length*100|round)/100 end),
     mean_branch_coverage_percent:([$targets[].branch_coverage_percent|select(.!=null)]|if length==0 then null else (add/length*100|round)/100 end),
     buggy_pass:([$v[]|select(.subject_version=="buggy" and .test_execution=="PASS")]|length),
     buggy_fail:([$v[]|select(.subject_version=="buggy" and .test_execution=="FAIL")]|length),
     fixed_pass:([$v[]|select(.subject_version=="fixed" and .test_execution=="PASS")]|length),
     fixed_fail:([$v[]|select(.subject_version=="fixed" and .test_execution=="FAIL")]|length),
     defects:([$d[]|select(.status=="defect")]|length),passes:([$d[]|select(.status=="pass")]|length),
     not_available:([$d[]|select(.status=="not_available")]|length)}
  ] as $projects |
  {schema_version:"2.0",projects:$projects,
   overall:($projects|reduce .[] as $p ({project:"ALL",bugs:0,generation_ok:0,generated_test_methods:0,buggy_pass:0,buggy_fail:0,fixed_pass:0,fixed_fail:0,defects:0,passes:0,not_available:0};
     .bugs+=$p.bugs|.generation_ok+=$p.generation_ok|.generated_test_methods+=$p.generated_test_methods|.buggy_pass+=$p.buggy_pass|.buggy_fail+=$p.buggy_fail|.fixed_pass+=$p.fixed_pass|.fixed_fail+=$p.fixed_fail|.defects+=$p.defects|.passes+=$p.passes|.not_available+=$p.not_available))}
' > "$temp_json"
jq -r '["project","bugs","generation_ok","generated_test_methods","mean_line_coverage_percent","mean_branch_coverage_percent","buggy_pass","buggy_fail","fixed_pass","fixed_fail","defects","passes","not_available"],
  (.projects[],.overall|[.project,.bugs,.generation_ok,.generated_test_methods,(.mean_line_coverage_percent//""),(.mean_branch_coverage_percent//""),.buggy_pass,.buggy_fail,.fixed_pass,.fixed_fail,.defects,.passes,.not_available])|@csv' "$temp_json" > "$temp_csv"
archive_existing "$output_json" "$output_csv"; mv "$temp_json" "$output_json"; mv "$temp_csv" "$output_csv"; trap - EXIT INT TERM
printf '%-12s %6s %10s %10s %10s %10s %9s %8s\n' PROJECT BUGS GENERATED BUGGY_FAIL FIXED_PASS DEFECTS PASS N/A
jq -r '.projects[],.overall|[.project,.bugs,.generation_ok,.buggy_fail,.fixed_pass,.defects,.passes,.not_available]|@tsv' "$output_json" |
while IFS=$'\t' read -r p bugs generated buggy_fail fixed_pass defects pass unavailable; do printf '%-12s %6s %10s %10s %10s %10s %9s %8s\n' "$p" "$bugs" "$generated" "$buggy_fail" "$fixed_pass" "$defects" "$pass" "$unavailable"; done
echo "JSON: $output_json"; echo "CSV : $output_csv"
