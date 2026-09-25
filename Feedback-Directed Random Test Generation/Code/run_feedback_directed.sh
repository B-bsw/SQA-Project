#!/usr/bin/env bash
# ==============================================================================
# Feedback-Directed Random Testing (Randoop) Result Runner Launcher
# ==============================================================================
# Usage (GeneticAlgorithm style):
#   ./run_feedback_directed.sh PROJECT BUG_ID[,BUG_ID...] [BUDGET]
#   Example: ./run_feedback_directed.sh Chart 1,2 60
#
# Usage (Flag style):
#   ./run_feedback_directed.sh --projects Chart Cli --workers 4
#   ./run_feedback_directed.sh --targets Chart_1 Cli_1 --workers 2
#   ./run_feedback_directed.sh --workers 4
#   ./run_feedback_directed.sh --collect-only
# ==============================================================================
set -euo pipefail

code_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)
project_dir=$(cd "$code_dir/.." && pwd)
config_dir="$project_dir/Configuration"

# 1. Source configuration from .env if present
if [[ -f "$config_dir/.env" ]]; then
  # shellcheck source=/dev/null
  source "$config_dir/.env"
elif [[ -f "$project_dir/../GeneticAlgorithm/Configuration/.env" ]]; then
  # shellcheck source=/dev/null
  source "$project_dir/../GeneticAlgorithm/Configuration/.env"
fi

# 2. Check Defects4J path
if [[ -z "${DEFECTS4J_BIN:-}" ]]; then
  if command -v defects4j >/dev/null 2>&1; then
    DEFECTS4J_BIN=$(command -v defects4j)
  elif [[ -x "$HOME/defect4j/defects4j/framework/bin/defects4j" ]]; then
    DEFECTS4J_BIN="$HOME/defect4j/defects4j/framework/bin/defects4j"
  elif [[ -x "$HOME/defects4j/framework/bin/defects4j" ]]; then
    DEFECTS4J_BIN="$HOME/defects4j/framework/bin/defects4j"
  elif [[ -x "/home/defects4j/framework/bin/defects4j" ]]; then
    DEFECTS4J_BIN="/home/defects4j/framework/bin/defects4j"
  elif [[ -x "/Users/defects4j/framework/bin/defects4j" ]]; then
    DEFECTS4J_BIN="/Users/defects4j/framework/bin/defects4j"
  fi
fi

if [[ -n "${DEFECTS4J_BIN:-}" ]]; then
  export DEFECTS4J_BIN
fi

# 3. Configure Java through SDKMAN if available
sdk_java=${SDK_JAVA:-}
sdkman_init=${SDKMAN_INIT:-${SDKMAN_DIR:-$HOME/.sdkman}/bin/sdkman-init.sh}
if [[ -n "$sdk_java" && -s "$sdkman_init" ]]; then
  set +u
  # shellcheck source=/dev/null
  source "$sdkman_init"
  sdk use java "$sdk_java" >/dev/null 2>&1 || true
  set -u
fi

# 4. Execute Python runner
exec python3 "$code_dir/run_feedback_directed_tests.py" "$@"
