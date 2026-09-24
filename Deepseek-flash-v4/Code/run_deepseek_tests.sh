#!/usr/bin/env bash
set -euo pipefail
code_dir=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)
if [[ -z ${DEFECTS4J_BIN:-} && -x "$HOME/defect4j/defects4j/framework/bin/defects4j" ]]; then
  export DEFECTS4J_BIN="$HOME/defect4j/defects4j/framework/bin/defects4j"
fi
exec python3 "$code_dir/run_deepseek_tests.py" "$@"
