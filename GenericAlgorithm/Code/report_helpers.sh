#!/usr/bin/env bash
# Shared report parsing and recoverable replacement helpers.

archive_existing() {
  local path archive
  for path in "$@"; do
    [[ -e "$path" ]] || continue
    mkdir -p "$ga_root/ReportHistory"
    archive=$(mktemp -d "$ga_root/ReportHistory/$(basename "$path").XXXXXX")
    cp -pR "$path" "$archive/"
  done
}

archive_previous_run() {
  local path
  for path in "$@"; do
    [[ -e "$path" ]] || continue
    archive_existing "$path"
    rm -rf "$path"
  done
}

parse_junit_counts() {
  local output=$1 successful_count
  tests_run=$(rg -o 'Tests run: [0-9]+' "$output" | tail -1 | awk '{print $3}' || true)
  failures=$(rg -o 'Failures: [0-9]+' "$output" | tail -1 | awk '{print $2}' || true)
  successful_count=$(rg -o '^OK \([0-9]+ tests?\)' "$output" | tail -1 | rg -o '[0-9]+' || true)
  if [[ -n "$successful_count" ]]; then tests_run=$successful_count; failures=0; fi
  passed_tests=null
  if [[ -n "$tests_run" && -n "$failures" && "$failures" -le "$tests_run" ]]; then
    passed_tests=$((tests_run - failures))
  else
    tests_run=null; failures=null
  fi
}
