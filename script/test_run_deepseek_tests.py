"""Focused checks for stopping the DeepSeek report runner."""

import csv
from contextlib import contextmanager
import importlib.util
import json
import shutil
import sys
import unittest
from uuid import uuid4
from pathlib import Path
from unittest.mock import MagicMock, patch


RUNNER = Path(__file__).resolve().parents[1] / "Deepseek-flash-v4/Code/run_deepseek_tests.py"
SPEC = importlib.util.spec_from_file_location("run_deepseek_tests", RUNNER)
runner = importlib.util.module_from_spec(SPEC)
SPEC.loader.exec_module(runner)


@contextmanager
def test_workspace():
    root = RUNNER.parent / f"_interrupt_test_{uuid4().hex}"
    root.mkdir()
    try:
        yield root
    finally:
        shutil.rmtree(root)


class InterruptTests(unittest.TestCase):
    def tearDown(self):
        runner.STOP_REQUESTED.clear()

    def test_ctrl_c_updates_combined_report_from_finished_targets(self):
        with test_workspace() as root:
            tests = root / "TestCode"
            results = root / "Result"
            tests.mkdir()
            target = results / "Chart_1"
            target.mkdir(parents=True)
            (target / "result.json").write_text(json.dumps({
                "project": "Chart", "bug_id": 1, "tests": 2,
                "buggy": {"result": "FAIL", "fails": 1},
                "fixed": {"result": "PASS", "fails": 0},
                "verdict": "REVEALING",
            }), encoding="utf-8")
            pool = MagicMock()
            with patch.object(runner, "TEST_ROOT", tests), \
                 patch.object(runner, "RESULT_ROOT", results), \
                 patch.object(runner, "discover_targets", return_value={
                     "Chart_1": tests / "Chart_1_buggy", "Cli_5": tests / "Cli_5_buggy",
                 }), \
                 patch.object(runner, "ThreadPoolExecutor", return_value=pool), \
                 patch.object(runner, "as_completed", side_effect=KeyboardInterrupt), \
                 patch.object(runner, "stop_active_commands") as stop:
                rc = runner.main(["--defects4j-bin", sys.executable])

            self.assertEqual(rc, 130)
            stop.assert_called_once_with()
            pool.shutdown.assert_called_once_with(wait=True, cancel_futures=True)
            with (results / "report.csv").open(newline="", encoding="utf-8") as handle:
                rows = list(csv.DictReader(handle))
            self.assertEqual(len(rows), 1)
            self.assertEqual(rows[0]["project"], "Chart")
            self.assertEqual(rows[0]["verdict"], "REVEALING")
            with patch.object(runner, "RESULT_ROOT", results), \
                 patch.object(runner, "discover_targets", side_effect=AssertionError), \
                 patch.object(runner, "ThreadPoolExecutor", side_effect=AssertionError):
                self.assertEqual(runner.main(["--collect-only"]), 0)

    def test_stop_flag_prevents_new_defects4j_command(self):
        with test_workspace() as root:
            runner.STOP_REQUESTED.set()
            with patch.object(runner.subprocess, "Popen") as popen:
                with self.assertRaises(runner.TargetInterrupted):
                    runner.run_command(["defects4j", "checkout"], root / "command.log")
            popen.assert_not_called()

    def test_timeout_stops_a_running_command(self):
        with test_workspace() as root:
            log = root / "timeout.log"
            rc = runner.run_command([sys.executable, "-c",
                                     "import time; time.sleep(30)"], log, timeout=0.1)
            self.assertEqual(rc, runner.TIMEOUT_RC)
            self.assertIn("[timeout after 0.1s]", log.read_text(encoding="utf-8"))
            self.assertFalse(runner.ACTIVE_COMMANDS)

    def test_timed_out_test_is_recorded_as_not_run(self):
        with test_workspace() as root:
            logs = root / "logs"
            logs.mkdir()

            def fake_command(args, log, cwd=None, timeout=None):
                if args[1] == "test":
                    log.write_text("Running ant (compile.gen.tests).......... OK\n",
                                   encoding="utf-8")
                    self.assertEqual(timeout, 60)
                    return runner.TIMEOUT_RC
                return 0

            with patch.object(runner, "run_command", side_effect=fake_command):
                result = runner.run_revision("defects4j", "Lang", 11, "b",
                                             root / "suite.tar.bz2", root,
                                             logs, False, 60)
            self.assertEqual(result["result"], "NOT_RUN")
            self.assertIsNone(result["fails"])
            self.assertEqual(result["test_status"], "TIMEOUT")


if __name__ == "__main__":
    unittest.main()
