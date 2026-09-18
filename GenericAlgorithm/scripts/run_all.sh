#!/usr/bin/env bash
set -euo pipefail
root=$(cd "$(dirname "${BASH_SOURCE[0]}")/../.." && pwd)
ga="$root/GenericAlgorithm"
config="$ga/Configuration/experiment.env"
[[ -f "$config" ]] || { echo "Missing $config" >&2; exit 2; }
# shellcheck disable=SC1090
source "$config"
"$ga/scripts/preflight.sh"
result="$ga/Result_Round1"; [[ "$RUN_ID" != round1 ]] && result="$ga/Result_Round2"
tests="$ga/TestCode"; logs="$result/logs"; mkdir -p "$result" "$tests" "$logs"
csv="$result/results.csv"
[[ -f "$csv" ]] || echo 'run_id,project,bug_id,target_class,algorithm,seed,search_budget_seconds,generation_seconds,test_count,test_execution,line_coverage,branch_coverage,status,error' > "$csv"
quote() { printf '"%s"' "$(printf %s "$1" | tr '\n' ' ' | sed 's/"/""/g')"; }
row() { local x; for x in "$@"; do quote "$x"; printf ','; done | sed 's/,$//'; printf '\n'; }
for f in "$root"/$BENCHMARK_ROOT/*_1_buggy/.defects4j.config; do
  [[ -f "$f" ]] || continue
  w=$(dirname "$f"); base=$(basename "$w"); project=${base%_1_buggy}
  classes=$("$DEFECTS4J_BIN" export -w "$w" -p dir.src.classes)
  cp=$("$DEFECTS4J_BIN" export -w "$w" -p cp.compile)
  modified=$("$DEFECTS4J_BIN" export -w "$w" -p classes.modified 2>/dev/null || true)
  if [[ "$TARGET_SCOPE" == all || -z "$modified" ]]; then
    targets=$(cd "$w/$classes" && find . -name '*.class' ! -name '*$*' | sed 's#^\./##;s#/#.#g;s#\.class$##' | sort)
  else targets=$modified; fi
  i=0
  while IFS= read -r target; do
    [[ -n "$target" ]] || continue; i=$((i+1))
    [[ ${MAX_TARGETS_PER_PROJECT:-0} -eq 0 || $i -le $MAX_TARGETS_PER_PROJECT ]] || break
    slug=${target//./_}; out="$tests/$base/$slug"; log="$logs/$base/$slug"; mkdir -p "$out" "$log"
    started=$(date +%s); set +e
    "$JAVA11_HOME/bin/java" -jar "$EVOSUITE_JAR" -projectCP "$w/$classes:$cp:$EVOSUITE_RUNTIME_JAR" -class "$target" -Dalgorithm=DynaMOSA -Dcriterion=LINE:BRANCH -Dsearch_budget="$SEARCH_BUDGET_SECONDS" -Dseed="$SEED" -Dtest_dir="$out" -Dreport_dir="$out/report" >"$log/generate.log" 2>&1
    rc=$?; set -e; elapsed=$(( $(date +%s)-started ))
    test_count=$(rg -h '@Test' "$out" -g '*.java' 2>/dev/null | wc -l | tr -d ' ')
    if [[ $rc -ne 0 || "$test_count" -eq 0 ]]; then
      row "$RUN_ID" "$project" 1b "$target" DynaMOSA "$SEED" "$SEARCH_BUDGET_SECONDS" "$elapsed" "$test_count" NOT_RUN '' '' generation_failed "$(tail -1 "$log/generate.log" 2>/dev/null || true)" >> "$csv"; continue
    fi
    set +e; "$JAVA11_HOME/bin/java" -jar "$EVOSUITE_JAR" -measureCoverage -DCP="$w/$classes:$cp:$EVOSUITE_RUNTIME_JAR" -Dtarget_class="$target" -Dtest_dir="$out" >"$log/coverage.log" 2>&1; crc=$?; set -e
    stats=$(find "$out" -name statistics.csv -type f -print -quit); line=''; branch=''
    if [[ -n "$stats" ]]; then
      line=$(awk -F, 'NR==1{for(i=1;i<=NF;i++)if($i=="LineCoverage")c=i;next}NR==2&&c{print $(c)*100}' "$stats")
      branch=$(awk -F, 'NR==1{for(i=1;i<=NF;i++)if($i=="BranchCoverage")c=i;next}NR==2&&c{print $(c)*100}' "$stats")
    fi
    status=ok; execution=PASS; err=''
    [[ $crc -eq 0 ]] || { status=coverage_failed; execution=FAIL; err=$(tail -1 "$log/coverage.log" 2>/dev/null || true); }
    row "$RUN_ID" "$project" 1b "$target" DynaMOSA "$SEED" "$SEARCH_BUDGET_SECONDS" "$elapsed" "$test_count" "$execution" "$line" "$branch" "$status" "$err" >> "$csv"
  done <<< "$targets"
done
"$ga/scripts/make_summary.sh" "$csv" "$result/summary.md"
