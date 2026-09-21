#!/usr/bin/env bash
# Rebuild Round 1/2 aggregate reports and merge them into GenericAlgorithm/report.csv.
set -euo pipefail

[[ $# -eq 0 ]] || { echo "Usage: $0" >&2; exit 2; }
code_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)
ga_root=$(cd "$code_dir/.." && pwd)
output="$ga_root/report.csv"
expected_header='"round","project","bug_id","seed","budget","tests","coverage","line_cov","branch_cov","total_goals","covered_goals","lines","covered_lines","total_branches","covered_branches","buggy_result","buggy_fails","fixed_result","fixed_fails","verdict"'

# Refresh each round report from its per-bug result.csv files first.
"$code_dir/collect_ga_reports.sh" 1 >/dev/null
"$code_dir/collect_ga_reports.sh" 2 >/dev/null

temp=$(mktemp "$ga_root/.report.csv.XXXXXX")
trap 'rm -f "$temp"' EXIT INT TERM
printf '%s\n' "$expected_header" > "$temp"

for round in 1 2; do
  report="$ga_root/Result_Round${round}/report.csv"
  [[ -f "$report" ]] || continue
  header=$(head -1 "$report")
  if [[ "$header" != "$expected_header" ]]; then
    echo "Unexpected schema: $report" >&2
    exit 1
  fi
  tail -n +2 "$report" >> "$temp"
done

mv "$temp" "$output"
trap - EXIT INT TERM
rows=$(( $(wc -l < "$output" | tr -d ' ') - 1 ))
echo "Merged $rows rows: $output" >&2
printf '%s\n' "$output"
