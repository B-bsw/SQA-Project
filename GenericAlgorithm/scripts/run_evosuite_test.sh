#!/usr/bin/env bash

# Generate tests for every class modified by one Defects4J bug using EvoSuite's
# DynaMOSA genetic algorithm.
#
# Usage:
#   ./scripts/run_evosuite_test.sh PROJECT BUG_ID [BUDGET_SECONDS]
#
# Example:
#   ./scripts/run_evosuite_test.sh Lang 1 60

set -euo pipefail

if [[ $# -lt 2 || $# -gt 3 ]]; then
  echo "Usage: $0 PROJECT BUG_ID [BUDGET_SECONDS]" >&2
  exit 2
fi

PROJECT=$1
BUG_ID=$2
BUDGET=${3:-60}

SCRIPT_DIR=$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)
PROJECT_ROOT=$(cd "$SCRIPT_DIR/.." && pwd)

# These values can be overridden from the command line environment.
DEFECTS4J_BIN=${DEFECTS4J_BIN:-/Users/bb/Desktop/class/sqa/defects4j/framework/bin/defects4j}
D4J_HOME=${D4J_HOME:-$(cd "$(dirname "$DEFECTS4J_BIN")/../.." && pwd)}
JAVA11_HOME=${JAVA11_HOME:-/Users/bb/.sdkman/candidates/java/11.0.31-amzn}
EVOSUITE_JAR=${EVOSUITE_JAR:-$PROJECT_ROOT/evosuite-1.2.0.jar}

if [[ ! "$BUG_ID" =~ ^[1-9][0-9]*$ ]]; then
  echo "Error: BUG_ID must be a positive integer." >&2
  exit 2
fi
if [[ ! "$BUDGET" =~ ^[1-9][0-9]*$ ]]; then
  echo "Error: BUDGET_SECONDS must be a positive integer." >&2
  exit 2
fi
for file in "$DEFECTS4J_BIN" "$JAVA11_HOME/bin/java" "$EVOSUITE_JAR"; do
  if [[ ! -e "$file" ]]; then
    echo "Error: required file not found: $file" >&2
    exit 2
  fi
done

export JAVA_HOME="$JAVA11_HOME"
export PATH="$JAVA_HOME/bin:$PATH"

# Defects4J project IDs are case-sensitive. Resolve user input such as
# "chart" or "CHART" to its canonical ID, "Chart".
REQUESTED_PROJECT=$PROJECT
REQUESTED_PROJECT_LOWER=$(printf '%s' "$REQUESTED_PROJECT" | tr '[:upper:]' '[:lower:]')
PROJECT=''
while IFS= read -r CANDIDATE; do
  CANDIDATE_LOWER=$(printf '%s' "$CANDIDATE" | tr '[:upper:]' '[:lower:]')
  if [[ "$CANDIDATE_LOWER" == "$REQUESTED_PROJECT_LOWER" ]]; then
    PROJECT=$CANDIDATE
    break
  fi
done < <("$DEFECTS4J_BIN" pids)
if [[ -z "$PROJECT" ]]; then
  echo "Error: unknown Defects4J project: $REQUESTED_PROJECT" >&2
  echo "Available projects: $("$DEFECTS4J_BIN" pids | tr '\n' ' ')" >&2
  exit 2
fi
if ! "$DEFECTS4J_BIN" bids -p "$PROJECT" | grep -qx "$BUG_ID"; then
  echo "Error: $PROJECT does not have active bug ID $BUG_ID." >&2
  exit 2
fi

VERSION="${BUG_ID}b"
WORK_DIR=${WORK_DIR:-/tmp/generic-algorithm-${PROJECT}-${VERSION}}
TEST_ROOT=${TEST_ROOT:-$PROJECT_ROOT/TestCode/${PROJECT}_${BUG_ID}_buggy}
REPORT_ROOT=${REPORT_ROOT:-$PROJECT_ROOT/Result_Round1/${PROJECT}_${BUG_ID}_buggy}
mkdir -p "$TEST_ROOT" "$REPORT_ROOT"

echo "GenericAlgorithm test generation"
echo "  Subject   : $PROJECT-$VERSION"
echo "  Algorithm : DynaMOSA"
echo "  Criteria  : LINE, BRANCH"
echo "  Budget    : ${BUDGET}s"

# Reuse a checkout only when it is exactly the requested project and version.
if [[ -d "$WORK_DIR" ]]; then
  if [[ ! -f "$WORK_DIR/.defects4j.config" ]] || \
     ! grep -qx "pid=$PROJECT" "$WORK_DIR/.defects4j.config" || \
     ! grep -qx "vid=$VERSION" "$WORK_DIR/.defects4j.config"; then
    echo "Error: $WORK_DIR exists but is not a $PROJECT-$VERSION checkout." >&2
    echo "Set WORK_DIR to another location or remove the stale directory." >&2
    exit 2
  fi
else
  echo ">> Checking out the buggy revision..."
  "$DEFECTS4J_BIN" checkout -p "$PROJECT" -v "$VERSION" -w "$WORK_DIR"
fi

echo ">> Compiling with Java 11..."
"$DEFECTS4J_BIN" compile -w "$WORK_DIR"

echo ">> Preparing the subject classpath..."
COMPILE_CP=$("$DEFECTS4J_BIN" export -w "$WORK_DIR" -p cp.compile)
BIN_DIR=$("$DEFECTS4J_BIN" export -w "$WORK_DIR" -p dir.bin.classes)
SUBJECT_CP="$WORK_DIR/$BIN_DIR:$COMPILE_CP"

echo ">> Reading modified classes from Defects4J..."
TARGET_CLASSES=$("$DEFECTS4J_BIN" export -w "$WORK_DIR" -p classes.modified)
CLASS_COUNT=$(printf '%s\n' "$TARGET_CLASSES" | awk 'NF { n++ } END { print n+0 }')
[[ "$CLASS_COUNT" -gt 0 ]] || { echo "Error: no modified classes found." >&2; exit 1; }

echo ">> Running the genetic search for $CLASS_COUNT class(es)..."
FAILED=0
while IFS= read -r TARGET_CLASS; do
  [[ -n "$TARGET_CLASS" ]] || continue
  TARGET_NAME=${TARGET_CLASS//./_}
  TEST_DIR="$TEST_ROOT/$TARGET_NAME"
  REPORT_DIR="$REPORT_ROOT/$TARGET_NAME"
  LOG_FILE="$REPORT_DIR/evosuite.log"
  mkdir -p "$TEST_DIR" "$REPORT_DIR"
  echo ">> Target: $TARGET_CLASS"

  set +e
  "$JAVA_HOME/bin/java" ${EVOSUITE_JAVA_OPTS:--Xmx2g} -jar "$EVOSUITE_JAR" \
    -class "$TARGET_CLASS" \
    -projectCP "$SUBJECT_CP" \
    -seed "${SEED:-20260918}" \
    -Dalgorithm=DynaMOSA \
    -Dcriterion=LINE:BRANCH \
    -Dstopping_condition=MaxTime \
    -Dsearch_budget="$BUDGET" \
    -Dshow_progress=false \
    -Dtest_dir="$TEST_DIR" \
    -Dreport_dir="$REPORT_DIR" 2>&1 | tee "$LOG_FILE"
  EVOSUITE_STATUS=${PIPESTATUS[0]}
  set -e
  if [[ $EVOSUITE_STATUS -ne 0 ]]; then
    echo "Warning: failed for $TARGET_CLASS; see $LOG_FILE" >&2
    FAILED=$((FAILED + 1))
  fi
done <<< "$TARGET_CLASSES"

TEST_COUNT=$(find "$TEST_ROOT" -type f -name '*_ESTest.java' | wc -l | tr -d ' ')
if [[ "$TEST_COUNT" -eq 0 ]]; then
  echo "Error: EvoSuite finished without generating an ESTest class." >&2
  exit 1
fi

echo "Generation completed"
echo "  Target classes          : $CLASS_COUNT"
echo "  Generated test classes : $TEST_COUNT"
echo "  Failed targets          : $FAILED"
echo "  Tests                   : $TEST_ROOT"
echo "  Reports                 : $REPORT_ROOT"
[[ "$FAILED" -eq 0 ]]
