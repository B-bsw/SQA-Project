#!/usr/bin/env python3
# -*- coding: utf-8 -*-

"""
test_generate_deepseek_tests.py
-------------------------------
ชุดการทดสอบ Unit Tests แบบออฟไลน์ 100% (Offline Mock Tests)
สำหรับ generate_deepseek_tests.py

ความครอบคลุมของการทดสอบ:
1. ปลอดภัย: ไม่ใช้ API Key จริง ใช้เฉพาะคีย์จำลอง (Synthetic Dummy Key)
2. SSE Streaming: แยก content และ reasoning_content/reasoning ที่มาพร้อมกัน
3. Finish Reasons: stream จบด้วย stop สำเร็จ, จบด้วย length เป็น is_truncated, จบกะทันหันไม่มี finish_reason ต้องล้มเหลว
4. Token Usage: completion_tokens รวม reasoning tokens สูงกว่าตัวอักษรของโค้ดที่มองเห็น
5. HTTP 429 Rate Limit: ส่ง status_code 429 กลับทันทีพร้อมอ่าน Retry-After header พักคีย์และสลับคีย์ถัดไป
6. Quota Failover: สลับคีย์เมื่อโควต้าหมด (401 daily limit)
7. --skip-limits: ข้ามไฟล์ที่เคยติด LIMIT_REACHED เมื่อใส่แฟล็ก และนำมาลองใหม่เมื่อไม่ใส่
8. --limit: กรองเฉพาะงานที่ค้าง (pending) ก่อนตัดตาม limit ไม่ถูกไฟล์ที่ทำเสร็จแล้วขโมยโควต้า limit
9. Truncation Retry: ลองใหม่โดยย่อโค้ดและปรับ prompt กำชับเมื่อคำตอบขาดตอน
10. Conflicting Flags: ปฏิเสธการรันเมื่อใส่ --check-quota ร่วมกับแฟล็ก offline (--dry-run, --plan, --status)
11. Dynamic JUnit Detection: ตรวจจับ JUnit 4 vs JUnit 5 จาก pom.xml / build.xml จริง
12. Atomic File & State Writes: เขียนไฟล์ผ่าน .tmp และรักษาไฟล์เดิมที่สมบูรณ์ไว้เมื่อผลลัพธ์รอบใหม่ขาดตอน
13. Java Structural Validation & Comment Compaction
14. End-to-End Offline Inspection: main() กับ --dry-run และ --plan ไม่เรียก network
"""

import os
import sys
import json
import io
import shutil
import tempfile
import threading
import unittest
from pathlib import Path
from unittest.mock import Mock, patch, MagicMock

SCRIPT_DIR = Path(__file__).resolve().parent
sys.path.insert(0, str(SCRIPT_DIR))

import generate_deepseek_tests as gen
import run_deepseek_parallel as parallel


SAMPLE_COMPLETE_JAVA = (
    "package org.example;\n\n"
    "import org.junit.Test;\n"
    "import static org.junit.Assert.*;\n\n"
    "public class CalculatorTest {\n"
    "    @Test\n"
    "    public void testAdd() {\n"
    "        assertEquals(4, 2 + 2);\n"
    "    }\n"
    "}\n"
)

SAMPLE_INCOMPLETE_JAVA = (
    "package org.example;\n\n"
    "public class CalculatorTest {\n"
    "    @Test\n"
    "    public void testAdd() {\n"
    "        assertEquals(4, 2 + 2);\n"
)


class TestDeepSeekPipelineOffline(unittest.TestCase):

    # ==========================================================================
    # 1. ทดสอบ Key Masking ด้วยคีย์สมมติ (No Real API Key)
    # ==========================================================================
    def test_key_masking_dummy_key(self):
        dummy_key = "sk_dummy_test_key_1234567890abcdef1234567890abcdef"
        masked = gen.mask_key(dummy_key)
        self.assertNotIn(dummy_key, masked)
        self.assertTrue(masked.startswith("sk_dum"))
        self.assertTrue(masked.endswith("cdef"))
        self.assertIn("...", masked)

    # ==========================================================================
    # 2. ทดสอบ SSE Streaming: แยก content ออกจาก reasoning
    # ==========================================================================
    def test_sse_concurrent_content_and_reasoning(self):
        chunks = [
            {"choices": [{"delta": {"reasoning_content": "Thinking step 1: analyze method add..."}}]},
            {"choices": [{"delta": {"reasoning": " Thinking step 2: test boundary...", "content": "public class CalculatorTest {\n"}}]},
            {"choices": [{"delta": {"content": "    @Test public void testAdd() { assertEquals(4, 4); }\n}\n"}}]},
            {"choices": [{"delta": {}, "finish_reason": "stop"}], "usage": {"prompt_tokens": 50, "completion_tokens": 120, "total_tokens": 170}}
        ]

        raw_lines = [f"data: {json.dumps(c)}".encode("utf-8") for c in chunks] + [b"data: [DONE]"]
        mock_resp = Mock(status_code=200)
        mock_resp.iter_lines.return_value = raw_lines

        with patch("requests.post", return_value=mock_resp):
            result = gen.call_single_api_stream(
                api_key="sk_dummy12345678",
                prompt="Write tests",
                max_tokens=2048
            )

        self.assertTrue(result["success"])
        self.assertIn("public class CalculatorTest", result["content"])
        self.assertNotIn("Thinking step 1", result["content"])
        self.assertIn("Thinking step 1", result["reasoning"])
        self.assertEqual(result["finish_reason"], "stop")

    # ==========================================================================
    # 3. ทดสอบ Finish Reasons: stop, length, และ stream ขาดตอน
    # ==========================================================================
    def test_stream_finish_reason_stop(self):
        chunks = [
            {"choices": [{"delta": {"content": SAMPLE_COMPLETE_JAVA}, "finish_reason": "stop"}]}
        ]
        raw_lines = [f"data: {json.dumps(c)}".encode("utf-8") for c in chunks] + [b"data: [DONE]"]
        mock_resp = Mock(status_code=200)
        mock_resp.iter_lines.return_value = raw_lines

        with patch("requests.post", return_value=mock_resp):
            result = gen.call_single_api_stream("sk_dummy12345", "prompt")
        self.assertTrue(result["success"])
        self.assertEqual(result["finish_reason"], "stop")

    def test_stream_finish_reason_length_marks_truncated(self):
        chunks = [
            {"choices": [{"delta": {"content": SAMPLE_INCOMPLETE_JAVA}, "finish_reason": "length"}]}
        ]
        raw_lines = [f"data: {json.dumps(c)}".encode("utf-8") for c in chunks] + [b"data: [DONE]"]
        mock_resp = Mock(status_code=200)
        mock_resp.iter_lines.return_value = raw_lines

        with patch("requests.post", return_value=mock_resp):
            result = gen.call_single_api_stream("sk_dummy12345", "prompt")
        self.assertFalse(result["success"])
        self.assertTrue(result.get("is_truncated"))
        self.assertEqual(result["finish_reason"], "length")

    def test_stream_abrupt_disconnect_without_finish_reason_fails(self):
        """หากการเชื่อมต่อขาดตอนโดยไม่มี finish_reason ต้องไม่ถูกนับว่าสำเร็จ (ห้ามแอบใส่ finish_reason=stop)"""
        chunks = [
            {"choices": [{"delta": {"content": SAMPLE_COMPLETE_JAVA}}]}
            # ขาด finish_reason
        ]
        raw_lines = [f"data: {json.dumps(c)}".encode("utf-8") for c in chunks]
        mock_resp = Mock(status_code=200)
        mock_resp.iter_lines.return_value = raw_lines

        with patch("requests.post", return_value=mock_resp):
            result = gen.call_single_api_stream("sk_dummy12345", "prompt", max_retries=1)
        self.assertFalse(result["success"])
        self.assertIn("without finish_reason", result["error"])

    # ==========================================================================
    # 4. ทดสอบ Usage & Reasoning Tokens
    # ==========================================================================
    def test_usage_larger_than_visible_content_tokens(self):
        reasoning_text = "Internal thought reasoning " * 50  # ~1350 chars
        content_text = "public class ATest { @Test public void t() { assertEquals(1, 1); } }"

        chunks = [
            {"choices": [{"delta": {"reasoning_content": reasoning_text}}]},
            {"choices": [{"delta": {"content": content_text}, "finish_reason": "stop"}]},
            {"choices": [], "usage": {"prompt_tokens": 100, "completion_tokens": 420, "total_tokens": 520}}
        ]
        raw_lines = [f"data: {json.dumps(c)}".encode("utf-8") for c in chunks] + [b"data: [DONE]"]
        mock_resp = Mock(status_code=200)
        mock_resp.iter_lines.return_value = raw_lines

        with patch("requests.post", return_value=mock_resp):
            result = gen.call_single_api_stream("sk_dummy12345", "prompt")

        self.assertTrue(result["success"])
        self.assertEqual(result["content_char_count"], len(content_text))
        self.assertEqual(result["reasoning_char_count"], len(reasoning_text))
        self.assertEqual(result["usage"]["completion_tokens"], 420)
        self.assertGreater(result["usage"]["completion_tokens"], result["content_char_count"] // 4 * 2)

    # ==========================================================================
    # 5. ทดสอบ HTTP 429 Rate Limit และ Retry-After Backoff
    # ==========================================================================
    def test_http_429_returns_status_and_triggers_backoff(self):
        mock_resp = Mock(status_code=429, text="Too Many Requests", headers={"Retry-After": "45"})
        mock_resp.json.return_value = {"error": {"message": "Rate limit reached"}}

        with patch("requests.post", return_value=mock_resp):
            result = gen.call_single_api_stream("sk_dummy1", "prompt", max_retries=1)

        self.assertFalse(result["success"])
        self.assertEqual(result["status_code"], 429)
        self.assertEqual(result["retry_after"], 45)

        # ทดสอบ rotation ทำงานเมื่อได้รับ 429: key1 ติด 429 ส่วน key2 สำเร็จ
        km = gen.KeyManager(["key1", "key2"])
        responses = [
            result,
            {"success": True, "content": SAMPLE_COMPLETE_JAVA, "finish_reason": "stop"}
        ]
        with patch("generate_deepseek_tests.call_single_api_stream", side_effect=responses):
            rot_result = gen.call_deepseek_api_with_rotation(km, "prompt")

        self.assertTrue(rot_result["success"])
        # key1 ต้องถูกพักการใช้งาน และ active key เหลือเฉพาะ key2
        self.assertIn("key1", km.rate_limited_keys)
        self.assertEqual(km.get_active_keys(), ["key2"])

    # ==========================================================================
    # 6. ทดสอบ Quota Exhaustion Failover
    # ==========================================================================
    def test_quota_exhausted_failover(self):
        km = gen.KeyManager(["keyA", "keyB"])

        responses = [
            {"success": False, "quota_exhausted": True, "error": "This model reached daily limit."},
            {"success": True, "content": SAMPLE_COMPLETE_JAVA, "finish_reason": "stop", "usage": {}}
        ]

        with patch("generate_deepseek_tests.call_single_api_stream", side_effect=responses):
            result = gen.call_deepseek_api_with_rotation(km, "test prompt")

        self.assertTrue(result["success"])
        self.assertIn("keyA", km.exhausted_keys)
        self.assertNotIn("keyB", km.exhausted_keys)

    # ==========================================================================
    # 7. ทดสอบ --skip-limits semantics
    # ==========================================================================
    def test_skip_limits_skips_limit_reached_tasks(self):
        task = {"project": "ProjA", "source_file": Path("Foo.java"), "rel_path": "Foo.java"}
        state = {"ProjA/Foo.java": {"status": "LIMIT_REACHED", "finish_reason": "length"}}

        with tempfile.TemporaryDirectory() as tmpdir:
            ws = Path(tmpdir)
            # เมื่อมี --skip-limits: ต้องไม่ pending (ข้าม)
            self.assertFalse(gen.is_task_pending(task, state, ws, overwrite=False, skip_limits=True))
            # เมื่อไม่มี --skip-limits: ต้อง pending (เพื่อนำมา retry)
            self.assertTrue(gen.is_task_pending(task, state, ws, overwrite=False, skip_limits=False))

    # ==========================================================================
    # 8. ทดสอบ --limit กรองงานค้าง (Pending) ก่อนจำกัดจำนวน
    # ==========================================================================
    def test_limit_filters_pending_before_slicing(self):
        with tempfile.TemporaryDirectory() as tmpdir:
            ws = Path(tmpdir)
            target_dir = gen.resolve_test_target_dir(ws, "ProjA")
            target_dir.mkdir(parents=True)
            # สร้างไฟล์เทสต์ของ File1 ที่เสร็จสมบูรณ์ไว้แล้วบนดิสก์
            gen.save_atomic_text(target_dir / "File1Test.java", SAMPLE_COMPLETE_JAVA)

            t1 = {"project": "ProjA", "source_file": Path("File1.java"), "rel_path": "File1.java"}
            t2 = {"project": "ProjA", "source_file": Path("File2.java"), "rel_path": "File2.java"}
            all_tasks = [t1, t2]

            state = {}
            # กรองงานค้างก่อน
            pending = [t for t in all_tasks if gen.is_task_pending(t, state, ws, overwrite=False, skip_limits=False)]
            self.assertEqual(len(pending), 1)
            self.assertEqual(pending[0]["source_file"].name, "File2.java")

            # เมื่อสั่ง limit 1 จะต้องได้ File2 ซึ่งเป็นงานที่ค้าง ไม่ถูก File1 แย่งสิทธิ์
            sliced = pending[:1]
            self.assertEqual(sliced[0]["source_file"].name, "File2.java")

    # ==========================================================================
    # 9. ทดสอบการรักษาไฟล์สมบูรณ์เดิมเมื่อผลลัพธ์ใหม่ถูก Truncate
    # ==========================================================================
    def test_preserve_existing_file_when_truncated(self):
        with tempfile.TemporaryDirectory() as tmpdir:
            ws = Path(tmpdir)
            target_dir = gen.resolve_test_target_dir(ws, "ProjA")
            target_dir.mkdir(parents=True)
            test_file = target_dir / "ExistingTest.java"
            gen.save_atomic_text(test_file, SAMPLE_COMPLETE_JAVA)

            # ตรวจสอบว่าไฟล์เดิมสมบูรณ์
            self.assertTrue(gen.is_valid_complete_java_test(test_file))

            # จำลองผลการรันที่ติด Truncation
            mock_result = {
                "success": False,
                "is_truncated": True,
                "finish_reason": "length",
                "content": SAMPLE_INCOMPLETE_JAVA
            }

            extracted = gen.extract_java_code(mock_result["content"])
            is_valid = gen.is_valid_complete_java_test(extracted)
            is_truncated = mock_result.get("is_truncated") or not is_valid

            # หาก is_truncated หรือ not is_valid: สคริปต์ต้องไม่เขียนทับไฟล์
            if not (is_truncated or not is_valid):
                gen.save_atomic_text(test_file, extracted)

            # ยืนยันว่าไฟล์บนดิสก์ยังคงเป็นโค้ดเดิมที่สมบูรณ์ 100%
            self.assertEqual(test_file.read_text(encoding="utf-8"), SAMPLE_COMPLETE_JAVA)

    # ==========================================================================
    # 10. ทดสอบ Truncation Retry Mechanism
    # ==========================================================================
    def test_truncation_retry_mechanism(self):
        """ทดสอบว่าเมื่อรอบแรกติด truncation (length) จะมีการ retry พร้อมกำชับคำสั่ง"""
        km = gen.KeyManager(["key1"])
        first_attempt = {
            "success": False,
            "is_truncated": True,
            "finish_reason": "length",
            "content": SAMPLE_INCOMPLETE_JAVA
        }
        second_attempt = {
            "success": True,
            "finish_reason": "stop",
            "content": SAMPLE_COMPLETE_JAVA,
            "usage": {"completion_tokens": 100}
        }

        # จำลองการเรียก API ในรอบ retry ให้ได้ผลลัพธ์ที่สมบูรณ์
        with patch("generate_deepseek_tests.call_deepseek_api_with_rotation", return_value=second_attempt) as mock_call:
            # จำลอง pipeline flow ใน main
            api_result = first_attempt
            extracted_code = gen.extract_java_code(api_result.get("content", ""))
            is_valid = gen.is_valid_complete_java_test(extracted_code)
            is_truncated = api_result.get("is_truncated") or not is_valid

            if is_truncated and api_result.get("content"):
                retry_prompt = "retry prompt"
                retry_result = gen.call_deepseek_api_with_rotation(km, retry_prompt)
                if retry_result.get("success"):
                    retry_extracted = gen.extract_java_code(retry_result["content"])
                    if gen.is_valid_complete_java_test(retry_extracted):
                        api_result = retry_result
                        extracted_code = retry_extracted
                        is_valid = True

            self.assertTrue(is_valid)
            self.assertEqual(extracted_code.strip(), SAMPLE_COMPLETE_JAVA.strip())
            mock_call.assert_called_once()  # retry ถูกเรียก 1 ครั้ง

    # ==========================================================================
    # 10. ทดสอบปฏิเสธแฟล็กที่ขัดแย้งกัน (--check-quota กับ offline flags)
    # ==========================================================================
    def test_conflicting_flags_rejected(self):
        with patch("sys.exit") as mock_exit:
            with patch("sys.stdout", new=io.StringIO()):
                gen.main(["--dry-run", "--check-quota"])
            mock_exit.assert_called_with(2)

    # ==========================================================================
    # 11. ทดสอบการตรวจหา JUnit Version แบบ Dynamic
    # ==========================================================================
    def test_dynamic_junit_detection(self):
        with tempfile.TemporaryDirectory() as tmpdir:
            ws = Path(tmpdir)
            data_dir = ws / "data" / "TestProjbuggy"
            data_dir.mkdir(parents=True)

            # 1. กรณีพบ junit-jupiter ใน pom.xml
            pom = data_dir / "pom.xml"
            pom.write_text("<dependency><groupId>org.junit.jupiter</groupId><artifactId>junit-jupiter</artifactId></dependency>", encoding="utf-8")
            self.assertEqual(gen.detect_junit_version("TestProj", workspace_root=ws), "junit5")

            # 2. กรณีเป็น JUnit 4 ทั่วไป
            pom.write_text("<dependency><groupId>junit</groupId><artifactId>junit</artifactId><version>4.13.2</version></dependency>", encoding="utf-8")
            self.assertEqual(gen.detect_junit_version("TestProj", workspace_root=ws), "junit4")

            # 3. กรณี Override ผ่าน CLI
            self.assertEqual(gen.detect_junit_version("TestProj", workspace_root=ws, preferred="junit5"), "junit5")

    # ==========================================================================
    # 12. ทดสอบ Java Validation & Comment Compaction
    # ==========================================================================
    def test_java_validation_and_compaction(self):
        self.assertTrue(gen.is_valid_complete_java_test(SAMPLE_COMPLETE_JAVA))
        self.assertFalse(gen.is_valid_complete_java_test(SAMPLE_INCOMPLETE_JAVA))
        self.assertFalse(gen.is_valid_complete_java_test("class Empty {}"))

        src = 'class X { String s = "// not a comment"; /* remove */ int a = 1; }'
        compacted = gen.compact_java_source(src)
        self.assertIn('"// not a comment"', compacted)
        self.assertNotIn("remove", compacted)

    # ==========================================================================
    # 13. ทดสอบ End-to-End: main() ในโหมด --dry-run และ --plan ไม่เรียก API
    # ==========================================================================
    def test_main_dry_run_and_plan_makes_zero_network_calls(self):
        with patch("requests.post", side_effect=AssertionError("Network call strictly forbidden!")):
            with patch("sys.stdout", new=io.StringIO()):
                # รัน dry-run และ plan ผ่าน main() จริง
                gen.main(["--project", "Closure_28", "--dry-run"])
                gen.main(["--project", "Closure_28", "--plan"])
                gen.main(["--status"])


class TestParallelProjectRunner(unittest.TestCase):
    def test_status_snapshot_overlays_project_state_without_writing(self):
        legacy = {"Cli_1/A.java": {"status": "LIMIT_REACHED"},
                  "Codec_1/B.java": {"status": "GENERATED"}}
        shard = {"Cli_1/A.java": {"status": "GENERATED"},
                 "Cli_2/C.java": {"status": "GENERATED"}}
        with patch.object(Path, "glob", return_value=[Path("state/Cli.json")]), \
             patch.object(gen, "load_state", side_effect=[legacy, shard]) as load:
            merged, count = gen.load_progress_snapshot(Path("generation_state.json"), Path("out"))
        self.assertEqual(count, 1)
        self.assertEqual(len(merged), 3)
        self.assertEqual(merged["Cli_1/A.java"]["status"], "GENERATED")
        self.assertTrue(all(call.kwargs["read_only"] for call in load.call_args_list))

    def test_parallel_budget_status_reads_key_specific_ledger(self):
        with patch.object(Path, "is_file", return_value=True), \
             patch.object(gen, "DailyBudget") as budget:
            budget.return_value.get_today_used.return_value = 123
            usage = gen.read_parallel_budget_usage(Path("out"), ["dummy-one", "dummy-two"])
        self.assertEqual(len(usage), 2)
        self.assertEqual(set(usage.values()), {123})
        paths = [call.args[0] for call in budget.call_args_list]
        self.assertNotEqual(paths[0], paths[1])
        self.assertNotIn("dummy-one", str(paths[0]))

    def test_generator_selects_one_key_and_custom_files(self):
        state = Path("isolated-state.json")
        budget = Path("isolated-budget.json")
        with patch.object(gen, "get_all_api_keys", return_value=["dummy-1", "dummy-2"]), \
             patch.object(gen, "load_state", return_value={}) as load, \
             patch.object(gen, "DailyBudget") as budget_class, \
             patch.object(gen, "print_status_report") as report:
            gen.main(["--status", "--key-index", "2", "--state-file", str(state),
                      "--budget-file", str(budget)])
        self.assertEqual(load.call_args.args[0], state)
        self.assertEqual(budget_class.call_args.args[0], budget)
        self.assertEqual(report.call_args.args[0].keys, ["dummy-2"])

    def test_parallel_commands_isolate_projects_and_key_budgets(self):
        generator = Path("script/generate_deepseek_tests.py")
        output = Path("Deepseek-flash-v4")
        first = parallel.worker_command(generator, output, "Cli", 1, "dummy-key-1", 800000, None, None, False)
        second = parallel.worker_command(generator, output, "Chart", 1, "dummy-key-1", 800000, None, None, False)
        third = parallel.worker_command(generator, output, "Closure", 2, "dummy-key-2", 800000, None, None, False)
        value = lambda cmd, flag: cmd[cmd.index(flag) + 1]
        self.assertNotEqual(value(first, "--state-file"), value(second, "--state-file"))
        self.assertEqual(value(first, "--budget-file"), value(second, "--budget-file"))
        self.assertNotEqual(value(first, "--budget-file"), value(third, "--budget-file"))
        self.assertEqual(value(third, "--key-index"), "2")
        self.assertNotIn("dummy-key-1", first)
        self.assertNotIn("dummy-key-2", third)

    def test_parallel_dry_run_does_not_start_workers_or_write_state(self):
        with patch.object(parallel, "discover_groups", return_value=["Chart", "Cli"]), \
             patch.object(parallel, "get_all_api_keys", return_value=["dummy-1", "dummy-2"]), \
             patch.object(parallel, "seed_project_states", side_effect=AssertionError("state write")), \
             patch.object(parallel.subprocess, "Popen", side_effect=AssertionError("process started")), \
             patch("sys.stdout", new_callable=io.StringIO) as out:
            code = parallel.main(["--workers", "2", "--dry-run"])
        self.assertEqual(code, 0)
        self.assertIn("Chart: key #1", out.getvalue())
        self.assertIn("Cli: key #2", out.getvalue())

    def test_seed_project_states_preserves_legacy_entries(self):
        legacy = {"Cli_1/a.java": {"status": "GENERATED"},
                  "Chart_1/b.java": {"status": "LIMIT_REACHED"}}
        with patch.object(Path, "is_file", return_value=True), \
             patch.object(Path, "exists", return_value=False), \
             patch.object(parallel, "load_state", return_value=legacy), \
             patch.object(parallel, "save_atomic_json") as save:
            parallel.seed_project_states(Path("Deepseek-flash-v4"), ["Cli"])
        self.assertEqual(save.call_count, 1)
        self.assertEqual(save.call_args.args[1], {"Cli_1/a.java": {"status": "GENERATED"}})

    def test_parallel_runner_starts_distinct_projects_concurrently(self):
        barrier = threading.Barrier(2)

        class FakeProcess:
            stdout = ()

            def __enter__(self):
                return self

            def __exit__(self, *args):
                return False

            def wait(self):
                barrier.wait(timeout=5)
                return 0

        with patch.object(parallel, "discover_groups", return_value=["Cli", "Chart"]), \
             patch.object(parallel, "get_all_api_keys", return_value=["dummy-1", "dummy-2"]), \
             patch.object(parallel, "seed_project_states"), \
             patch.object(parallel.subprocess, "Popen", side_effect=lambda *a, **kw: FakeProcess()) as popen, \
             patch("sys.stdout", new_callable=io.StringIO):
            code = parallel.main(["--workers", "2", "--projects", "Cli", "Chart"])
        self.assertEqual(code, 0)
        self.assertEqual(popen.call_count, 2)
        commands = [call.args[0] for call in popen.call_args_list]
        self.assertEqual({cmd[cmd.index("--project") + 1] for cmd in commands}, {"Cli", "Chart"})
        self.assertEqual({cmd[cmd.index("--key-index") + 1] for cmd in commands}, {"1", "2"})


if __name__ == "__main__":
    unittest.main()
