#!/usr/bin/env bash
# ==============================================================================
# Collect per-target result.csv files into an aggregated report.csv
# Usage:
#   ./collect_feedback_directed_reports.sh
# ==============================================================================
set -euo pipefail

code_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)
project_root=$(cd "$code_dir/.." && pwd)
result_root="$project_root/Result"

mkdir -p "$result_root"
output="$result_root/report.csv"
root_output="$project_root/report.csv"

temp=$(mktemp "$result_root/.report.csv.XXXXXX")
trap 'rm -f "$temp"' EXIT INT TERM

header='"project","bug_id","seed","budget","tests","coverage","line_cov","branch_cov","total_goals","covered_goals","lines","covered_lines","total_branches","covered_branches","buggy_result","buggy_fails","fixed_result","fixed_fails","verdict"'
printf '%s\n' "$header" > "$temp"

count=0
while IFS= read -r report; do
  [[ $(head -1 "$report") == "$header" ]] || continue
  tail -n +2 "$report" >> "$temp"
  count=$((count + 1))
done < <(find "$result_root" -mindepth 2 -maxdepth 2 -type f -name result.csv | sort)

mv "$temp" "$output"
cp "$output" "$root_output"
trap - EXIT INT TERM

echo "Collected $count targets into:"
printf '%s\n' "$output"
printf '%s\n' "$root_output"
