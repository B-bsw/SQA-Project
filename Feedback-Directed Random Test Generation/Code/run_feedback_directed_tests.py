#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
================================================================================
Feedback-Directed Random Testing (Randoop) Result Runner for Defects4J
================================================================================
Executes existing Randoop JUnit test suites across Defects4J buggy and fixed
revisions, measures code coverage (line and branch), determines revealing verdicts,
and generates standardized result reports matching the GeneticAlgorithm format
(single run, no round column).

Workflow:
1. Discover test suites in TestCode/<Project>_<Bug>_buggy/
2. Pack tests into tar.bz2 archives respecting Java package structure
3. Checkout & compile buggy revision in temporary directory
4. Run generated test suite and measure coverage on buggy revision
5. Remove buggy checkout
6. Checkout & compile fixed revision in temporary directory
7. Run identical test suite on fixed revision
8. Remove fixed checkout
9. Evaluate verdict:
   - REVEALING: buggy FAILS and fixed PASSES
   - NOT_REVEALING: buggy PASSES and fixed PASSES
   - INCONCLUSIVE: other test outcomes
   - NOT_AVAILABLE: checkout/compile/test could not be executed
10. Record result.json, result.csv, logs, and aggregated report.csv
================================================================================
"""

import argparse
import csv
import json
import os
import re
import shutil
import signal
import subprocess
import sys
import tarfile
import tempfile
import threading
from concurrent.futures import ThreadPoolExecutor, as_completed
from datetime import datetime, timezone
from pathlib import Path
from typing import Dict, List, Optional, Set, Tuple


# Setup paths
SCRIPT_DIR = Path(__file__).resolve().parent
PROJECT_ROOT = SCRIPT_DIR.parent
WORKSPACE_ROOT = PROJECT_ROOT.parent
TEST_ROOT = PROJECT_ROOT / "TestCode"
RESULT_ROOT = PROJECT_ROOT / "Result"
CONFIG_DIR = PROJECT_ROOT / "Configuration"
STATE_DIR = PROJECT_ROOT / "state"
GEN_STATE_FILE = PROJECT_ROOT / "generation_state.json"

TARGET_RE = re.compile(r"^([A-Za-z][A-Za-z0-9]*)_([1-9][0-9]*)_buggy$")
PACKAGE_RE = re.compile(r"(?m)^\s*package\s+([A-Za-z_$][\w$]*(?:\.[A-Za-z_$][\w$]*)*)\s*;")
FAILURES_RE = re.compile(r"Failing tests:\s*(\d+)")

# Standard CSV fields (no round column)
CSV_FIELDS = [
    "project", "bug_id", "seed", "budget", "tests",
    "coverage", "line_cov", "branch_cov", "total_goals", "covered_goals",
    "lines", "covered_lines", "total_branches", "covered_branches",
    "buggy_result", "buggy_fails", "fixed_result", "fixed_fails", "verdict"
]

TIMEOUT_RC = 124
STOP_REQUESTED = threading.Event()
ACTIVE_COMMANDS: Set[subprocess.Popen] = set()
ACTIVE_COMMANDS_LOCK = threading.Lock()
REPORT_LOCK = threading.Lock()


class TargetInterrupted(Exception):
    """Execution was interrupted before completion."""
    pass


def find_defects4j(custom_path: Optional[str] = None) -> str:
    """Find Defects4J executable in environment or common install paths."""
    if custom_path:
        resolved = shutil.which(custom_path)
        if resolved:
            return resolved
        if Path(custom_path).is_file() and os.access(custom_path, os.X_OK):
            return custom_path

    env_d4j = os.environ.get("DEFECTS4J_BIN")
    if env_d4j:
        resolved = shutil.which(env_d4j)
        if resolved:
            return resolved
        if Path(env_d4j).is_file() and os.access(env_d4j, os.X_OK):
            return env_d4j

    which_d4j = shutil.which("defects4j")
    if which_d4j:
        return which_d4j

    home = Path.home()
    candidates = [
        home / "defect4j" / "defects4j" / "framework" / "bin" / "defects4j",
        home / "defects4j" / "framework" / "bin" / "defects4j",
        Path("/home/defects4j/framework/bin/defects4j"),
        Path("/Users/defects4j/framework/bin/defects4j"),
    ]
    for c in candidates:
        if c.is_file() and os.access(c, os.X_OK):
            return str(c)

    return "defects4j"


def load_metadata(project: str, bug_id: int) -> dict:
    """Load metadata (time_limit, seed, etc.) from state files if available."""
    key = f"{project}_{bug_id}"
    shard_file = STATE_DIR / f"{project}.json"
    if shard_file.is_file():
        try:
            with shard_file.open(encoding="utf-8") as stream:
                data = json.load(stream)
                if isinstance(data, dict) and key in data:
                    return data[key]
        except Exception:
            pass

    if GEN_STATE_FILE.is_file():
        try:
            with GEN_STATE_FILE.open(encoding="utf-8") as stream:
                data = json.load(stream)
                if isinstance(data, dict) and key in data:
                    return data[key]
        except Exception:
            pass

    return {}


def discover_targets(test_root: Path = TEST_ROOT) -> Dict[str, Path]:
    """Scan TestCode directory for test suites matching <Project>_<Bug>_buggy."""
    targets = {}
    if not test_root.is_dir():
        return targets

    for path in sorted(test_root.iterdir()):
        if not path.is_dir():
            continue
        match = TARGET_RE.fullmatch(path.name)
        if match and any(path.rglob("*.java")):
            # Standard target name is <Project>_<Bug>
            target_name = f"{match.group(1)}_{match.group(2)}"
            targets[target_name] = path

    return targets


def make_archive(source: Path, destination: Path) -> Tuple[int, int]:
    """
    Package Java test files into a tar.bz2 archive.
    Uses package declarations to preserve correct directory hierarchy.
    """
    seen = set()
    tests = 0
    with tarfile.open(destination, "w:bz2") as archive:
        for java in sorted(source.rglob("*.java")):
            code = java.read_text(encoding="utf-8-sig", errors="replace")
            match = PACKAGE_RE.search(code)
            relative = Path(*(match.group(1).split(".") if match else [])) / java.name
            name = relative.as_posix()
            if name in seen:
                continue
            seen.add(name)
            archive.add(java, arcname=name)
            tests += len(re.findall(r"@(?:org\.junit\.)?Test\b", code))

    if not seen:
        raise ValueError(f"No Java test files found in {source}")
    return tests, len(seen)


def run_command(args: list, log: Path, cwd: Optional[Path] = None,
                timeout: Optional[int] = None) -> int:
    """Execute a subprocess command with logging and process group control."""
    with log.open("a", encoding="utf-8", errors="replace") as output:
        output.write("$ " + " ".join(map(str, args)) + "\n")
        output.flush()
        try:
            with ACTIVE_COMMANDS_LOCK:
                if STOP_REQUESTED.is_set():
                    raise TargetInterrupted
                command = subprocess.Popen(
                    args,
                    cwd=cwd,
                    stdout=output,
                    stderr=subprocess.STDOUT,
                    start_new_session=(os.name == "posix")
                )
                ACTIVE_COMMANDS.add(command)
            try:
                try:
                    rc = command.wait(timeout=timeout)
                except subprocess.TimeoutExpired:
                    output.write(f"[timeout after {timeout}s]\n")
                    output.flush()
                    terminate_command(command)
                    rc = TIMEOUT_RC
            finally:
                with ACTIVE_COMMANDS_LOCK:
                    ACTIVE_COMMANDS.discard(command)

            output.write(f"[exit {rc}]\n")
            if STOP_REQUESTED.is_set():
                raise TargetInterrupted
            return rc
        except OSError as exc:
            output.write(f"[start error] {exc}\n")
            return 127


def terminate_command(command: subprocess.Popen) -> None:
    """Terminate command and any child processes it spawned."""
    if command.poll() is None:
        try:
            if os.name == "posix":
                os.killpg(command.pid, signal.SIGTERM)
            else:
                command.terminate()
        except (ProcessLookupError, PermissionError):
            pass
    try:
        command.wait(timeout=3)
    except subprocess.TimeoutExpired:
        if os.name == "posix":
            try:
                os.killpg(command.pid, signal.SIGKILL)
            except (ProcessLookupError, PermissionError):
                pass
        else:
            command.kill()
        command.wait()


def stop_active_commands() -> None:
    """Stop all active subprocesses."""
    with ACTIVE_COMMANDS_LOCK:
        commands = list(ACTIVE_COMMANDS)
    for command in commands:
        terminate_command(command)


def parse_test_results(workspace: Path, log: Path, rc: int) -> Tuple[str, Optional[int]]:
    """Determine test outcome (PASS / FAIL / NOT_RUN) and failure count."""
    output = log.read_text(encoding="utf-8", errors="replace") if log.is_file() else ""
    matches = FAILURES_RE.findall(output)
    if matches:
        count = int(matches[-1])
    else:
        failing_file = workspace / "failing_tests"
        if failing_file.is_file():
            count = sum(1 for line in failing_file.read_text(
                encoding="utf-8", errors="replace").splitlines() if line.startswith("--- "))
        else:
            count = None

    if count is None:
        return ("PASS", 0) if rc == 0 else ("NOT_RUN", None)
    if rc != 0 and count == 0:
        return ("NOT_RUN", None)

    return ("FAIL" if count > 0 else "PASS"), count


def read_coverage(workspace: Path, log_text: str = "") -> dict:
    """Extract code coverage metrics from summary.csv or console output."""
    summary = workspace / "summary.csv"
    if summary.is_file():
        try:
            with summary.open(newline="", encoding="utf-8") as handle:
                row = next(csv.DictReader(handle), None)
            if row:
                lines = int(row.get("LinesTotal", 0))
                covered_lines = int(row.get("LinesCovered", 0))
                branches = int(row.get("ConditionsTotal", 0))
                covered_branches = int(row.get("ConditionsCovered", 0))
                line_cov = round(100.0 * covered_lines / lines, 2) if lines else 0.0
                branch_cov = round(100.0 * covered_branches / branches, 2) if branches else 0.0
                total_goals = lines + branches
                covered_goals = covered_lines + covered_branches
                coverage = round(100.0 * covered_goals / total_goals, 2) if total_goals else line_cov
                return {
                    "lines": lines, "covered_lines": covered_lines, "line_cov": line_cov,
                    "total_branches": branches, "covered_branches": covered_branches, "branch_cov": branch_cov,
                    "total_goals": total_goals, "covered_goals": covered_goals, "coverage": coverage
                }
        except Exception:
            pass

    # Fallback to regex from coverage log
    m_lines = re.search(r"Lines total:\s*(\d+)", log_text)
    m_cov_lines = re.search(r"Lines covered:\s*(\d+)", log_text)
    m_cond = re.search(r"Conditions total:\s*(\d+)", log_text)
    m_cov_cond = re.search(r"Conditions covered:\s*(\d+)", log_text)
    if m_lines and m_cov_lines:
        lines = int(m_lines.group(1))
        covered_lines = int(m_cov_lines.group(1))
        branches = int(m_cond.group(1)) if m_cond else 0
        covered_branches = int(m_cov_cond.group(1)) if m_cov_cond else 0
        line_cov = round(100.0 * covered_lines / lines, 2) if lines else 0.0
        branch_cov = round(100.0 * covered_branches / branches, 2) if branches else 0.0
        total_goals = lines + branches
        covered_goals = covered_lines + covered_branches
        coverage = round(100.0 * covered_goals / total_goals, 2) if total_goals else line_cov
        return {
            "lines": lines, "covered_lines": covered_lines, "line_cov": line_cov,
            "total_branches": branches, "covered_branches": covered_branches, "branch_cov": branch_cov,
            "total_goals": total_goals, "covered_goals": covered_goals, "coverage": coverage
        }

    return {}


def run_revision(d4j: str, project: str, bug_id: int, suffix: str,
                 archive: Path, temporary_root: Path, logs_dir: Path,
                 run_cov: bool, test_timeout: int) -> dict:
    """Checkout, compile, test, and measure coverage on a single revision."""
    label = "buggy" if suffix == "b" else "fixed"
    workspace = temporary_root / label
    log = logs_dir / f"{label}.log"

    # 1. Checkout
    checkout_rc = run_command([d4j, "checkout", "-p", project, "-v",
                               f"{bug_id}{suffix}", "-w", str(workspace)], log)
    if checkout_rc != 0:
        return {"result": "NOT_RUN", "fails": None, "compile": "NOT_RUN", "status": "CHECKOUT_FAIL"}

    # 2. Compile
    compile_rc = run_command([d4j, "compile", "-w", str(workspace)], log)
    if compile_rc != 0:
        return {"result": "NOT_RUN", "fails": None, "compile": "FAIL", "status": "COMPILE_FAIL"}

    # 3. Test
    failing = workspace / "failing_tests"
    if failing.exists():
        failing.unlink()

    test_log = logs_dir / f"{label}_test.log"
    test_rc = run_command([d4j, "test", "-s", str(archive)], test_log,
                          cwd=workspace, timeout=test_timeout)
    test_output = test_log.read_text(encoding="utf-8", errors="replace") if test_log.is_file() else ""

    if test_rc == TIMEOUT_RC:
        result, fails = "NOT_RUN", None
        test_status = "TIMEOUT"
    else:
        result, fails = parse_test_results(workspace, test_log, test_rc)
        test_status = "PASS" if result == "PASS" else "FAIL" if result == "FAIL" else "ERROR"

    test_compile = ("FAIL" if re.search(r"compile\.gen\.tests\).*FAIL", test_output)
                    else "PASS" if re.search(r"compile\.gen\.tests\).*OK", test_output)
                    else "NOT_RUN")

    details = {
        "result": result,
        "fails": fails,
        "compile": "PASS",
        "test_compile": test_compile,
        "test_status": test_status
    }

    if failing.is_file():
        shutil.copy2(failing, logs_dir / f"{label}_failing_tests.txt")

    # 4. Coverage (buggy revision only, when test executed)
    if run_cov and label == "buggy" and result != "NOT_RUN":
        cov_log = logs_dir / "buggy_coverage.log"
        cov_rc = run_command([d4j, "coverage", "-s", str(archive)],
                             cov_log, cwd=workspace, timeout=test_timeout)
        cov_output = cov_log.read_text(encoding="utf-8", errors="replace") if cov_log.is_file() else ""
        details["coverage_status"] = ("TIMEOUT" if cov_rc == TIMEOUT_RC else
                                      "PASS" if cov_rc == 0 else "FAIL")
        cov_data = read_coverage(workspace, cov_output)
        details.update(cov_data)

    return details


def evaluate_verdict(buggy_result: str, fixed_result: str) -> str:
    """Determine benchmark verdict following GeneticAlgorithm standards."""
    if buggy_result == "FAIL" and fixed_result == "PASS":
        return "REVEALING"
    if buggy_result == "PASS" and fixed_result == "PASS":
        return "NOT_REVEALING"
    if buggy_result == "NOT_RUN" or fixed_result == "NOT_RUN":
        return "NOT_AVAILABLE"
    return "INCONCLUSIVE"


def format_csv_row(row_dict: dict) -> list:
    """Format dictionary into CSV values matching schema without round."""
    return [
        row_dict.get("project", ""),
        row_dict.get("bug_id", 0),
        row_dict.get("seed", 20260918),
        row_dict.get("budget", 60),
        row_dict.get("tests", 0),
        "" if row_dict.get("coverage") is None else row_dict["coverage"],
        "" if row_dict.get("line_cov") is None else row_dict["line_cov"],
        "" if row_dict.get("branch_cov") is None else row_dict["branch_cov"],
        row_dict.get("total_goals", 0),
        row_dict.get("covered_goals", 0),
        row_dict.get("lines", 0),
        row_dict.get("covered_lines", 0),
        row_dict.get("total_branches", 0),
        row_dict.get("covered_branches", 0),
        row_dict.get("buggy_result", "NOT_RUN"),
        "" if row_dict.get("buggy_fails") is None else row_dict["buggy_fails"],
        row_dict.get("fixed_result", "NOT_RUN"),
        "" if row_dict.get("fixed_fails") is None else row_dict["fixed_fails"],
        row_dict.get("verdict", "NOT_AVAILABLE")
    ]


def write_target_reports(destination: Path, report_dict: dict) -> None:
    """Write result.json and result.csv atomically inside target directory."""
    destination.mkdir(parents=True, exist_ok=True)

    # 1. result.json
    json_path = destination / "result.json"
    temp_json = destination / ".result.json.tmp"
    temp_json.write_text(json.dumps(report_dict, indent=2, ensure_ascii=False) + "\n", encoding="utf-8")
    temp_json.replace(json_path)

    # 2. result.csv
    csv_path = destination / "result.csv"
    temp_csv = destination / ".result.csv.tmp"
    row = format_csv_row(report_dict)
    with temp_csv.open("w", newline="", encoding="utf-8") as handle:
        writer = csv.writer(handle, quoting=csv.QUOTE_NONNUMERIC)
        writer.writerow(CSV_FIELDS)
        writer.writerow(row)
    temp_csv.replace(csv_path)


def write_aggregated_report(report_path: Path, rows: List[dict]) -> None:
    """Write aggregated report.csv atomically."""
    report_path.parent.mkdir(parents=True, exist_ok=True)
    temp_path = report_path.with_suffix(".csv.tmp")
    with temp_path.open("w", newline="", encoding="utf-8") as handle:
        writer = csv.writer(handle, quoting=csv.QUOTE_NONNUMERIC)
        writer.writerow(CSV_FIELDS)
        for row_dict in rows:
            writer.writerow(format_csv_row(row_dict))
    temp_path.replace(report_path)


def collect_existing_reports(result_root: Path) -> List[dict]:
    """Collect all valid result.csv records from the result directory."""
    records = []
    if not result_root.is_dir():
        return records

    for target_dir in sorted(result_root.iterdir()):
        if not target_dir.is_dir():
            continue
        result_csv = target_dir / "result.csv"
        result_json = target_dir / "result.json"
        if result_json.is_file():
            try:
                with result_json.open(encoding="utf-8") as stream:
                    data = json.load(stream)
                    if isinstance(data, dict) and "project" in data and "bug_id" in data:
                        records.append(data)
                        continue
            except Exception:
                pass

        if result_csv.is_file():
            try:
                with result_csv.open(newline="", encoding="utf-8") as stream:
                    reader = csv.DictReader(stream)
                    for r in reader:
                        record = dict(r)
                        for int_field in ("bug_id", "seed", "budget", "tests",
                                          "total_goals", "covered_goals", "lines",
                                          "covered_lines", "total_branches", "covered_branches"):
                            if record.get(int_field) not in (None, ""):
                                record[int_field] = int(record[int_field])
                        for flt_field in ("coverage", "line_cov", "branch_cov"):
                            if record.get(flt_field) not in (None, ""):
                                record[flt_field] = float(record[flt_field])
                            else:
                                record[flt_field] = None
                        for fail_field in ("buggy_fails", "fixed_fails"):
                            if record.get(fail_field) not in (None, ""):
                                record[fail_field] = int(record[fail_field])
                            else:
                                record[fail_field] = None
                        records.append(record)
            except Exception:
                pass

    records.sort(key=lambda x: (str(x.get("project", "")), int(x.get("bug_id", 0))))
    return records


def update_global_reports(result_root: Path) -> int:
    """Refresh both Result/report.csv and PROJECT_ROOT/report.csv."""
    with REPORT_LOCK:
        rows = collect_existing_reports(result_root)
        write_aggregated_report(result_root / "report.csv", rows)
        write_aggregated_report(PROJECT_ROOT / "report.csv", rows)
        return len(rows)


def run_target(name: str, source: Path, d4j: str, result_root: Path,
               run_cov: bool, test_timeout: int,
               budget_override: Optional[int] = None,
               seed_override: Optional[int] = None) -> dict:
    """Execute complete validation for a single project bug target."""
    match = TARGET_RE.fullmatch(source.name)
    if not match:
        raise ValueError(f"Invalid target directory name: {source.name}")
    project = match.group(1)
    bug_id = int(match.group(2))
    target_name = f"{project}_{bug_id}"

    destination = result_root / target_name
    destination.mkdir(parents=True, exist_ok=True)
    logs_dir = destination / "logs"
    logs_dir.mkdir(exist_ok=True)

    # Clean existing logs
    for old_file in logs_dir.glob("*.log"):
        old_file.unlink(missing_ok=True)
    for old_file in logs_dir.glob("*_failing_tests.txt"):
        old_file.unlink(missing_ok=True)

    metadata = load_metadata(project, bug_id)
    budget = budget_override if budget_override is not None else metadata.get("time_limit", 60)
    seed = seed_override if seed_override is not None else metadata.get("seed", 20260918)

    start_time = time.time()

    # Create temporary scratch space
    temp_dir = Path(tempfile.mkdtemp(prefix=f"randoop-{target_name}-"))
    archive_path = temp_dir / f"{target_name}-randoop.tar.bz2"

    try:
        tests_count, files_count = make_archive(source, archive_path)
    except Exception as exc:
        total_duration = round(time.time() - start_time, 2)
        shutil.rmtree(temp_dir, ignore_errors=True)
        report = {
            "schema_version": "1.1",
            "algorithm": "Randoop",
            "created_at": datetime.now(timezone.utc).isoformat(),
            "duration_seconds": total_duration,
            "project": project,
            "bug_id": bug_id,
            "seed": seed,
            "budget": budget,
            "tests": 0,
            "coverage": None,
            "line_cov": None,
            "branch_cov": None,
            "total_goals": 0,
            "covered_goals": 0,
            "lines": 0,
            "covered_lines": 0,
            "total_branches": 0,
            "covered_branches": 0,
            "buggy_result": "NOT_RUN",
            "buggy_fails": None,
            "fixed_result": "NOT_RUN",
            "fixed_fails": None,
            "verdict": "NOT_AVAILABLE",
            "source": str(source),
            "error": f"Failed to package test archive: {exc}",
            "validations": []
        }
        write_target_reports(destination, report)
        update_global_reports(result_root)
        return report

    try:
        # 1. Buggy revision
        buggy_start = time.time()
        buggy_details = run_revision(
            d4j=d4j, project=project, bug_id=bug_id, suffix="b",
            archive=archive_path, temporary_root=temp_dir,
            logs_dir=logs_dir, run_cov=run_cov, test_timeout=test_timeout
        )
        buggy_details["duration_seconds"] = round(time.time() - buggy_start, 2)

        # Remove buggy checkout immediately to conserve disk space
        buggy_ws = temp_dir / "buggy"
        if buggy_ws.exists():
            shutil.rmtree(buggy_ws, ignore_errors=True)

        if STOP_REQUESTED.is_set():
            raise TargetInterrupted

        # 2. Fixed revision
        fixed_start = time.time()
        fixed_details = run_revision(
            d4j=d4j, project=project, bug_id=bug_id, suffix="f",
            archive=archive_path, temporary_root=temp_dir,
            logs_dir=logs_dir, run_cov=False, test_timeout=test_timeout
        )
        fixed_details["duration_seconds"] = round(time.time() - fixed_start, 2)

        # Remove fixed checkout immediately
        fixed_ws = temp_dir / "fixed"
        if fixed_ws.exists():
            shutil.rmtree(fixed_ws, ignore_errors=True)

    finally:
        shutil.rmtree(temp_dir, ignore_errors=True)

    total_duration = round(time.time() - start_time, 2)
    verdict = evaluate_verdict(buggy_details.get("result", "NOT_RUN"),
                               fixed_details.get("result", "NOT_RUN"))

    report = {
        "schema_version": "1.1",
        "algorithm": "Randoop",
        "created_at": datetime.now(timezone.utc).isoformat(),
        "duration_seconds": total_duration,
        "project": project,
        "bug_id": bug_id,
        "seed": seed,
        "budget": budget,
        "tests": tests_count,
        "test_files": files_count,
        "coverage": buggy_details.get("coverage"),
        "line_cov": buggy_details.get("line_cov"),
        "branch_cov": buggy_details.get("branch_cov"),
        "total_goals": buggy_details.get("total_goals", 0),
        "covered_goals": buggy_details.get("covered_goals", 0),
        "lines": buggy_details.get("lines", 0),
        "covered_lines": buggy_details.get("covered_lines", 0),
        "total_branches": buggy_details.get("total_branches", 0),
        "covered_branches": buggy_details.get("covered_branches", 0),
        "buggy_result": buggy_details.get("result", "NOT_RUN"),
        "buggy_fails": buggy_details.get("fails"),
        "fixed_result": fixed_details.get("result", "NOT_RUN"),
        "fixed_fails": fixed_details.get("fails"),
        "verdict": verdict,
        "source": str(source),
        "validations": [
            {"subject": "buggy", **buggy_details},
            {"subject": "fixed", **fixed_details}
        ]
    }

    write_target_reports(destination, report)
    update_global_reports(result_root)
    return report


def parse_cli_args(argv: Optional[List[str]] = None) -> argparse.Namespace:
    """Parse command-line arguments supporting both positional (GA) and flag syntax."""
    args_list = list(sys.argv[1:] if argv is None else argv)

    # Check for GeneticAlgorithm positional format: PROJECT BUG_IDS [BUDGET]
    # e.g., run_feedback_directed_tests.py Chart 1,2 60
    if len(args_list) >= 2 and not args_list[0].startswith("-") and not args_list[1].startswith("-"):
        project_arg = args_list[0]
        bugs_raw = args_list[1].strip("[]")
        budget_arg = None
        idx = 2
        if len(args_list) > idx and args_list[idx].isdigit():
            budget_arg = int(args_list[idx])
            idx += 1

        remainder = args_list[idx:]
        parser = argparse.ArgumentParser(description="Run Randoop Feedback-Directed test suites on Defects4J")
        parser.add_argument("--workers", "-w", type=int, default=int(os.environ.get("MAX_PARALLEL", 1)))
        parser.add_argument("--seed", type=int, default=None)
        parser.add_argument("--test-timeout", type=int, default=600)
        parser.add_argument("--no-coverage", action="store_true")
        parser.add_argument("--overwrite", action="store_true")
        parser.add_argument("--dry-run", action="store_true")
        parser.add_argument("--defects4j-bin", type=str, default=None)
        parser.add_argument("--result-dir", type=str, default=None)
        parsed, extra = parser.parse_known_args(remainder)

        parsed.projects = [project_arg]
        parsed.targets = [f"{project_arg}_{b.strip()}" for b in bugs_raw.split(",") if b.strip()]
        parsed.budget = budget_arg
        parsed.limit = None
        parsed.collect_only = False
        return parsed

    parser = argparse.ArgumentParser(
        description="Run Randoop Feedback-Directed test suites on Defects4J buggy & fixed revisions.",
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog="""
Examples:
  %(prog)s Chart 1                         # Positional (GeneticAlgorithm style)
  %(prog)s Chart 1,2 60                    # Batch with 60s budget
  %(prog)s --projects Chart Cli --workers 4
  %(prog)s --targets Chart_1 Cli_1 --workers 2
  %(prog)s --workers 4                     # Run all available test suites
  %(prog)s --collect-only                  # Rebuild report.csv from existing results
        """
    )
    parser.add_argument("--projects", "-p", nargs="+",
                        help="Filter by project name(s), e.g., Chart Cli Math")
    parser.add_argument("--targets", "-t", nargs="+",
                        help="Specific target(s) to run, e.g., Chart_1 Cli_10")
    parser.add_argument("--budget", "-b", type=int, default=None,
                        help="Override search/time budget in seconds")
    parser.add_argument("--seed", "-s", type=int, default=None,
                        help="Override random seed (default: 20260918)")
    parser.add_argument("--workers", "-w", type=int,
                        default=int(os.environ.get("MAX_PARALLEL", 1)),
                        help="Maximum parallel test workers (default: 1 or MAX_PARALLEL)")
    parser.add_argument("--limit", "-l", type=int, default=None,
                        help="Maximum number of targets to execute")
    parser.add_argument("--test-timeout", type=int, default=600,
                        help="Timeout in seconds per defects4j test/coverage command (default: 600)")
    parser.add_argument("--no-coverage", action="store_true",
                        help="Skip coverage measurement step")
    parser.add_argument("--overwrite", action="store_true",
                        help="Re-run targets even if result.json already exists")
    parser.add_argument("--dry-run", action="store_true",
                        help="List targets that would run without executing")
    parser.add_argument("--collect-only", action="store_true",
                        help="Re-aggregate existing result.csv files into report.csv and exit")
    parser.add_argument("--defects4j-bin", type=str, default=None,
                        help="Path to defects4j executable")
    parser.add_argument("--result-dir", type=str, default=None,
                        help="Custom result output directory")

    return parser.parse_args(args_list)


def main(argv: Optional[List[str]] = None) -> int:
    args = parse_cli_args(argv)

    # Determine result root directory
    if args.result_dir:
        result_root = Path(args.result_dir).resolve()
    else:
        result_root = RESULT_ROOT

    result_root.mkdir(parents=True, exist_ok=True)

    if args.collect_only:
        total = update_global_reports(result_root)
        print(f"Collected {total} completed target reports into {result_root / 'report.csv'}")
        return 0

    all_targets = discover_targets(TEST_ROOT)
    if not all_targets:
        print(f"No test suites found in {TEST_ROOT}", file=sys.stderr)
        return 1

    # Filter targets
    selected = dict(all_targets)
    if args.projects:
        proj_set = {p.strip().lower() for p in args.projects}
        selected = {k: v for k, v in selected.items()
                    if k.split("_")[0].lower() in proj_set}

    if args.targets:
        target_set = set()
        for t in args.targets:
            clean = t.strip()
            if clean.endswith("_buggy"):
                clean = clean[:-6]
            target_set.add(clean)
        selected = {k: v for k, v in selected.items() if k in target_set}

    if not args.overwrite:
        remaining = {}
        for name, path in selected.items():
            result_json = result_root / name / "result.json"
            if not result_json.is_file():
                remaining[name] = path
        selected = remaining

    if args.limit and args.limit > 0:
        selected = dict(list(selected.items())[:args.limit])

    print(f"============================================================")
    print(f"Feedback-Directed Random Testing (Randoop) Result Runner")
    print(f"============================================================")
    print(f"Total discovered targets : {len(all_targets)}")
    print(f"Targets selected to run  : {len(selected)}")
    print(f"Parallel workers         : {args.workers}")
    print(f"Result directory         : {result_root}")
    print(f"Coverage enabled         : {not args.no_coverage}")
    print(f"============================================================")

    if args.dry_run:
        print("[DRY-RUN] Targets scheduled:")
        for name in sorted(selected.keys()):
            print(f"  - {name} ({selected[name]})")
        return 0

    if not selected:
        print("No targets pending execution.")
        update_global_reports(result_root)
        return 0

    d4j_bin = find_defects4j(args.defects4j_bin)
    if not shutil.which(d4j_bin) and not Path(d4j_bin).is_file():
        print(f"ERROR: Defects4J binary not found: {d4j_bin}", file=sys.stderr)
        return 2

    # Graceful shutdown handler
    def handle_interrupt(signum, frame):
        if not STOP_REQUESTED.is_set():
            STOP_REQUESTED.set()
            print("\n[Ctrl+C] Interrupted! Stopping workers and updating report...", file=sys.stderr)
            stop_active_commands()

    if threading.current_thread() is threading.main_thread():
        try:
            signal.signal(signal.SIGINT, handle_interrupt)
            signal.signal(signal.SIGTERM, handle_interrupt)
        except (ValueError, AttributeError):
            pass

    completed = 0
    revealing_count = 0
    not_revealing_count = 0
    inconclusive_count = 0
    not_avail_count = 0

    with ThreadPoolExecutor(max_workers=max(1, args.workers)) as executor:
        future_map = {
            executor.submit(
                run_target,
                name=name,
                source=path,
                d4j=d4j_bin,
                result_root=result_root,
                run_cov=(not args.no_coverage),
                test_timeout=args.test_timeout,
                budget_override=args.budget,
                seed_override=args.seed
            ): name
            for name, path in selected.items()
        }

        try:
            for future in as_completed(future_map):
                target_name = future_map[future]
                if STOP_REQUESTED.is_set():
                    break
                try:
                    result = future.result()
                    completed += 1
                    verdict = result.get("verdict", "NOT_AVAILABLE")
                    tests = result.get("tests", 0)
                    line_cov = result.get("line_cov")
                    cov_str = f"{line_cov:.2f}%" if line_cov is not None else "N/A"

                    if verdict == "REVEALING":
                        revealing_count += 1
                    elif verdict == "NOT_REVEALING":
                        not_revealing_count += 1
                    elif verdict == "INCONCLUSIVE":
                        inconclusive_count += 1
                    else:
                        not_avail_count += 1

                    duration_val = result.get('duration_seconds')
                    duration_str = f"{duration_val:.1f}s" if duration_val is not None else "N/A"

                    print(f"[{completed}/{len(selected)}] {target_name:18} -> {verdict:14} "
                          f"(tests: {tests:3}, line_cov: {cov_str:6}, time: {duration_str:6}, "
                          f"buggy: {result.get('buggy_result')}, fixed: {result.get('fixed_result')})")
                except TargetInterrupted:
                    break
                except Exception as exc:
                    print(f"[{target_name}] ERROR: {exc}", file=sys.stderr)
        except (KeyboardInterrupt, SystemExit):
            STOP_REQUESTED.set()
            stop_active_commands()

    total_rows = update_global_reports(result_root)
    print(f"\n============================================================")
    print(f"Run Summary:")
    print(f"Completed this run : {completed}")
    print(f"  - REVEALING      : {revealing_count}")
    print(f"  - NOT_REVEALING  : {not_revealing_count}")
    print(f"  - INCONCLUSIVE   : {inconclusive_count}")
    print(f"  - NOT_AVAILABLE  : {not_avail_count}")
    print(f"Aggregated report  : {result_root / 'report.csv'} ({total_rows} total entries)")
    print(f"============================================================")

    if STOP_REQUESTED.is_set():
        return 130

    return 0


if __name__ == "__main__":
    sys.exit(main())
