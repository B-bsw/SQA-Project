"""Offline checks for exact patching and preservation of the baseline."""

import json
import sys
import tempfile
import unittest
from pathlib import Path
from unittest.mock import patch


WORKSPACE = Path(__file__).resolve().parent.parent
sys.path.insert(0, str(WORKSPACE / "Deepseek-flash-v4" / "Code"))
import repair_not_available as repair


class RepairPilotTests(unittest.TestCase):
    def test_stream_keeps_content_and_usage_without_reasoning(self):
        class Response:
            status_code = 200

            def __enter__(self):
                return self

            def __exit__(self, *_):
                return False

            def raise_for_status(self):
                pass

            def iter_lines(self):
                yield b'data: {"choices":[{"delta":{"reasoning_content":"private"}}]}'
                yield b'data: {"choices":[{"delta":{"content":"{\\"edits\\":[]}"},"finish_reason":"stop"}]}'
                yield b'data: {"usage":{"prompt_tokens":10,"completion_tokens":5,"total_tokens":15}}'
                yield b'data: [DONE]'

        with patch("requests.post", return_value=Response()):
            content, usage = repair.call_repair_api("prompt", "dummy-key", "model", 100, 5)
        self.assertEqual(json.loads(content), {"edits": []})
        self.assertEqual(usage["total_tokens"], 15)
        self.assertNotIn("private", content)

    def test_exact_patch_keeps_tests_and_assertions(self):
        original = "package p;\nclass FooTest { @Test void check() { assertNull(value.old()); } }\n"
        response = json.dumps({"edits": [{"old": "value.old()", "new": "value.get()"}]})
        self.assertIn("assertNull(value.get())", repair.apply_edits(original, response))
        with self.assertRaises(ValueError):
            repair.apply_edits(original, json.dumps({"edits": [
                {"old": "assertNull(value.old());", "new": ""}]}))
        with self.assertRaises(ValueError):
            repair.apply_edits(original, json.dumps({"edits": [
                {"old": "missing()", "new": "present()"}]}))

    def test_removes_java_fence_without_api(self):
        code = "```java\npackage p;\nclass FooTest {}\n```\n"
        self.assertEqual(repair.strip_java_fences(code), "package p;\nclass FooTest {}\n")

    def test_unauthorized_key_uses_next_key(self):
        def response(_prompt, key, *_):
            if key == "first":
                raise repair.APIRequestError(401, "daily quota reached")
            return '{"edits":[]}', {"total_tokens": 12}

        with patch.object(repair, "call_repair_api", side_effect=response):
            content, usage, index = repair.request_with_key_failover(
                "prompt", ["first", "second"], 1, "model", 100, 5)
        self.assertEqual(json.loads(content), {"edits": []})
        self.assertEqual(usage["total_tokens"], 12)
        self.assertEqual(index, 2)

    def test_api_error_does_not_expose_key(self):
        class Unauthorized:
            status_code = 401

            def __enter__(self):
                return self

            def __exit__(self, *_):
                return False

            def json(self):
                return {"error": {"message": "key dummy-secret rejected"}}

        with patch("requests.post", return_value=Unauthorized()):
            with self.assertRaises(repair.APIRequestError) as error:
                repair.call_repair_api("prompt", "dummy-secret", "model", 100, 5)
        self.assertNotIn("dummy-secret", str(error.exception))

    def test_apply_preserves_original_and_baseline(self):
        with tempfile.TemporaryDirectory(dir=WORKSPACE / "BuildClasses") as directory:
            root = Path(directory)
            test_root = root / "TestCode"
            result_root = root / "Result"
            candidate_root = root / "RepairCandidates"
            history_root = root / "RepairHistory"
            original = test_root / "Chart_1_buggy" / "FooTest.java"
            original.parent.mkdir(parents=True)
            original.write_text("package p; class FooTest {}\n", encoding="utf-8")
            candidate = candidate_root / "Chart_1" / original.name
            candidate.parent.mkdir(parents=True)
            candidate.write_text("package p; class FooTest { }\n", encoding="utf-8")
            baseline = result_root / "Chart_1"
            baseline.mkdir(parents=True)
            (baseline / "result.json").write_text('{"verdict":"NOT_AVAILABLE"}', encoding="utf-8")
            record = {"status": "COMPILE_PASS", "original_file": str(original),
                      "original_sha256": repair.sha256(original.read_text(encoding="utf-8")),
                      "candidate_sha256": repair.sha256(candidate.read_text(encoding="utf-8"))}
            (candidate.parent / "repair.json").write_text(json.dumps(record), encoding="utf-8")
            with patch.multiple(repair, TEST_ROOT=test_root, RESULT_ROOT=result_root,
                                CANDIDATE_ROOT=candidate_root, HISTORY_ROOT=history_root):
                repair.apply_verified("Chart_1")
            self.assertEqual(original.read_text(encoding="utf-8"), candidate.read_text(encoding="utf-8"))
            self.assertTrue((history_root / "Chart_1" / original.name).is_file())
            self.assertTrue((history_root / "Chart_1" / "baseline_result" / "result.json").is_file())


if __name__ == "__main__":
    unittest.main()
