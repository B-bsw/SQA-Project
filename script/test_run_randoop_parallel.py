import json
import io
import tempfile
import unittest
from contextlib import redirect_stdout
from pathlib import Path
from unittest.mock import patch

import run_randoop_parallel as parallel


class ParallelStateTests(unittest.TestCase):
    def test_timezone_aware_timestamps_compare_actual_instants(self):
        bangkok_failure = {"status": "FAILED", "timestamp": "2026-09-23T17:58:56+07:00"}
        los_angeles_success = {"status": "COMPLETED", "timestamp": "2026-09-23T04:37:28-07:00"}
        self.assertTrue(parallel.prefer_newer(bangkok_failure, los_angeles_success))
        self.assertFalse(parallel.prefer_newer(los_angeles_success, bangkok_failure))
        self.assertTrue(parallel.prefer_newer(bangkok_failure, {
            "status": "COMPLETED", "timestamp": "2026-09-23T11:38:00+00:00"}))

    def test_new_utc_record_supersedes_legacy_local_time(self):
        old_failure = {"status": "FAILED", "timestamp": "2026-09-23T17:58:56"}
        new_success = {"status": "COMPLETED", "timestamp": "2026-09-23T11:38:00+00:00"}
        self.assertTrue(parallel.prefer_newer(old_failure, new_success))

    def test_status_prints_total_for_selected_groups(self):
        counts = {"Chart": (2, 1, 3), "Cli": (4, 0, 1)}
        output = io.StringIO()
        with patch.object(parallel, "group_status", side_effect=lambda output_dir, resource_dir, group: counts[group]), \
             redirect_stdout(output):
            result = parallel.main(["--status", "--projects", "Chart", "Cli"])
        self.assertEqual(result, 0)
        self.assertIn("Chart: completed=2 failed=1 pending=3", output.getvalue())
        self.assertIn("Cli: completed=4 failed=0 pending=1", output.getvalue())
        self.assertIn("Total Randoop (2 groups): completed=6 failed=1 pending=4 total=11", output.getvalue())

    def test_seed_and_mirror_keep_failed_and_unrelated_legacy_results(self):
        with tempfile.TemporaryDirectory() as directory:
            output = Path(directory)
            legacy = {
                "Mockito_14": {"status": "FAILED", "timestamp": "2026-09-22T10:00:00"},
                "Cli_1": {"status": "COMPLETED", "timestamp": "2026-09-22T10:00:00"},
            }
            (output / "generation_state.json").write_text(json.dumps(legacy), encoding="utf-8")
            parallel.seed_group_states(output, ["Mockito"])
            shard = output / "state" / "Mockito.json"
            self.assertEqual(parallel.load_state(shard), {"Mockito_14": legacy["Mockito_14"]})

            updated = parallel.load_state(shard)
            updated["Mockito_15"] = {"status": "COMPLETED", "timestamp": "2026-09-22T11:00:00"}
            shard.write_text(json.dumps(updated), encoding="utf-8")
            (output / "state" / "Chart.json").write_text(json.dumps({"Chart_1": {
                "status": "FAILED", "timestamp": "2026-09-22T11:00:00"}}), encoding="utf-8")
            self.assertTrue(parallel.sync_global_state(output, ["Mockito"]))
            combined = parallel.load_state(output / "generation_state.json")
            self.assertEqual(combined["Mockito_14"]["status"], "FAILED")
            self.assertEqual(combined["Mockito_15"]["status"], "COMPLETED")
            self.assertEqual(combined["Cli_1"]["status"], "COMPLETED")
            self.assertEqual(combined["Chart_1"]["status"], "FAILED")

    def test_newer_direct_result_wins_when_launcher_resumes(self):
        with tempfile.TemporaryDirectory() as directory:
            output = Path(directory)
            (output / "state").mkdir()
            shard = output / "state" / "Mockito.json"
            shard.write_text(json.dumps({"Mockito_14": {
                "status": "COMPLETED", "timestamp": "2026-09-22T10:00:00"}}), encoding="utf-8")
            legacy_file = output / "generation_state.json"
            legacy_file.write_text(json.dumps({"Mockito_14": {
                "status": "FAILED", "timestamp": "2026-09-22T11:00:00"}}), encoding="utf-8")
            parallel.seed_group_states(output, ["Mockito"])
            self.assertEqual(parallel.load_state(shard)["Mockito_14"]["status"], "FAILED")
            self.assertFalse(parallel.sync_global_state(output, ["Mockito"]))


if __name__ == "__main__":
    unittest.main()
