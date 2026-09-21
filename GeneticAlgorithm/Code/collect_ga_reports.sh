#!/usr/bin/env bash
# Usage: collect_ga_reports.sh ROUND
set -euo pipefail
[[ $# -eq 1 && "$1" =~ ^(1|2)$ ]] || { echo "Usage: $0 ROUND(1|2)" >&2; exit 2; }
round=$1
code_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)
result_root=$(cd "$code_dir/.." && pwd)/Result_Round${round}
mkdir -p "$result_root"
output="$result_root/report.csv"
temp=$(mktemp "$result_root/.report.csv.XXXXXX")
trap 'rm -f "$temp"' EXIT INT TERM
header='"round","project","bug_id","seed","budget","tests","coverage","line_cov","branch_cov","total_goals","covered_goals","lines","covered_lines","total_branches","covered_branches","buggy_result","buggy_fails","fixed_result","fixed_fails","verdict"'
printf '%s\n' "$header" > "$temp"
while IFS= read -r report; do
  [[ $(head -1 "$report") == "$header" ]] || continue
  tail -n +2 "$report" >> "$temp"
done < <(find "$result_root" -mindepth 2 -maxdepth 2 -type f -name result.csv | sort)
mv "$temp" "$output"
trap - EXIT INT TERM
printf '%s\n' "$output"
