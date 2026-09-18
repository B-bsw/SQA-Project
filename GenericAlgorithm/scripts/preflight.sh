#!/usr/bin/env bash
set -euo pipefail
root=$(cd "$(dirname "${BASH_SOURCE[0]}")/../.." && pwd)
config="$root/GenericAlgorithm/Configuration/experiment.env"
[[ -f "$config" ]] || { echo "Missing $config; copy experiment.env.example first." >&2; exit 2; }
# shellcheck disable=SC1090
source "$config"
bad=0
for key in DEFECTS4J_BIN JAVA11_HOME EVOSUITE_JAR EVOSUITE_RUNTIME_JAR; do
  value=${!key:-}
  [[ -n "$value" && -e "$value" ]] || { echo "ERROR: $key is missing: $value" >&2; bad=1; }
done
[[ $bad -eq 0 ]] || exit 2
java="$JAVA11_HOME/bin/java"
[[ -x "$java" ]] || { echo "ERROR: Java not executable: $java" >&2; exit 2; }
version=$("$java" -version 2>&1 | head -1)
[[ "$version" == *'"11.'* || "$version" == *'"11"'* ]] || { echo "ERROR: Defects4J v3 requires JDK 11; found $version" >&2; exit 2; }
count=$(find "$root/$BENCHMARK_ROOT" -mindepth 2 -maxdepth 2 -name .defects4j.config -type f | wc -l | tr -d ' ')
[[ "$count" -eq 17 ]] || { echo "ERROR: expected 17 workspaces under $root/$BENCHMARK_ROOT; found $count" >&2; exit 2; }
echo "Preflight passed: $version; projects=$count"
