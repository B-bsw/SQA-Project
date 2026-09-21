"""Offline regression tests; never contact the model API."""
import contextlib
import io
import json
import tempfile
import unittest
from pathlib import Path
from unittest.mock import Mock, patch

import generate_claude_tests as gen


JAVA = 'public class ExampleTest { @Test public void testValue() { assertEquals("a fairly long literal to exercise validation", "value"); } }'


class GeneratorTests(unittest.TestCase):
    def test_prompt_preserves_java_backslashes(self):
        source = r'public class X { String s = "\\d+\\1"; }'
        self.assertIn(source, gen.build_prompt('<source_code></source_code>', source))

    def test_rate_limit_is_not_daily_exhaustion(self):
        self.assertFalse(gen.is_quota_exceeded(429, 'rate limit: too many requests'))
        self.assertTrue(gen.is_quota_exceeded(429, 'daily limit reached'))

    def test_validator_rejects_truncation_and_non_tests(self):
        with tempfile.TemporaryDirectory() as folder:
            path = Path(folder) / 'ExampleTest.java'
            for code, valid in [(JAVA, True), (JAVA[:-2], False),
                                ('public class Example { String s = "' + 'x' * 100 + '"; }', False)]:
                path.write_text(code, encoding='utf-8')
                self.assertEqual(gen.is_valid_complete_java_test(path), valid)

    def test_compaction_preserves_comment_markers_in_strings(self):
        source = 'class X { String url = "http://x/*y*/"; /* remove */ int x = 1; }'
        compacted = gen.compact_java_source(source)
        self.assertIn('"http://x/*y*/"', compacted)
        self.assertNotIn('remove', compacted)

    def test_budget_persists_unknown_attempts_and_settles_usage(self):
        with tempfile.TemporaryDirectory() as folder:
            path = Path(folder) / 'budget.json'
            budget = gen.DailyBudget(path, 1000)
            reservation = budget.reserve([{'content': 'x' * 100}], 500)
            self.assertIsNotNone(reservation)
            self.assertIsNone(gen.DailyBudget(path, 1000).reserve([{'content': 'x'}], 500))
            budget.settle(reservation, {'prompt_tokens': 20, 'completion_tokens': 100})
            self.assertEqual(budget.data[reservation[0]], 120)
            self.assertIsNotNone(gen.DailyBudget(path, 1000).reserve([{'content': 'x'}], 500))

    def test_output_only_budget(self):
        with tempfile.TemporaryDirectory() as folder:
            budget = gen.DailyBudget(Path(folder) / 'budget.json', 1000, 'output')
            reservation = budget.reserve([{'content': 'x' * 5000}], 500)
            budget.settle(reservation, {'total_tokens': 9000, 'completion_tokens': 100})
            self.assertEqual(budget.data[reservation[0]], 100)

    def test_budget_rolls_over_without_erasing_previous_day(self):
        with tempfile.TemporaryDirectory() as folder:
            path = Path(folder) / 'budget.json'
            path.write_text(json.dumps({'2000-01-01': 1000}))
            budget = gen.DailyBudget(path, 1000)
            self.assertIsNotNone(budget.reserve([{'content': 'x'}], 100))
            self.assertEqual(budget.data['2000-01-01'], 1000)

    def stream(self, finish='stop'):
        chunks = [{'choices': [{'delta': {'content': JAVA}}]}]
        if finish:
            chunks.append({'choices': [{'delta': {}, 'finish_reason': finish}]})
        chunks.append({'choices': [], 'usage': {'prompt_tokens': 12, 'completion_tokens': 50, 'total_tokens': 62}})
        response = Mock(status_code=200)
        response.iter_lines.return_value = [b'data:' + json.dumps(c).encode() for c in chunks] + [b'data: [DONE]']
        with patch.object(gen.requests, 'post', return_value=response), patch.object(gen, 'WaitingTicker'), contextlib.redirect_stdout(io.StringIO()):
            result = gen.call_single_api_stream('fake', 'prompt', max_retries=1)
        response.close.assert_called_once()
        return result

    def test_stream_usage_only_event(self):
        result = self.stream()
        self.assertTrue(result['success'])
        self.assertEqual(result['usage']['total_tokens'], 62)

    def test_stream_without_finish_is_rejected(self):
        self.assertFalse(self.stream(None)['success'])

    def test_budget_stop_does_not_rotate_or_request(self):
        with tempfile.TemporaryDirectory() as folder:
            keys = gen.KeyManager(['one', 'two'])
            keys.budget = gen.DailyBudget(Path(folder) / 'budget.json', 1)
            with patch.object(gen.requests, 'post') as post, contextlib.redirect_stdout(io.StringIO()):
                result = gen.call_claude_api_with_rotation(keys, 'prompt')
            self.assertTrue(result['budget_exhausted'])
            post.assert_not_called()
            self.assertEqual(keys.current_idx, 0)

    def test_corrupt_state_fails_closed(self):
        with tempfile.TemporaryDirectory() as folder:
            path = Path(folder) / 'state.json'
            path.write_text('{broken')
            with self.assertRaises(RuntimeError):
                gen.load_state(path)

    def test_failover_tries_remaining_keys_after_exhaustion(self):
        keys = gen.KeyManager(['one', 'two', 'three'])
        responses = [
            {'success': False, 'quota_exhausted': True, 'error': 'daily limit'},
            {'success': False, 'is_timeout': True, 'error': 'timeout'},
            {'success': True, 'content': JAVA},
        ]
        with patch.object(gen, 'call_single_api_stream', side_effect=responses) as call, contextlib.redirect_stdout(io.StringIO()):
            result = gen.call_claude_api_with_rotation(keys, 'prompt')
        self.assertTrue(result['success'])
        self.assertEqual([c.kwargs['api_key'] for c in call.call_args_list], ['one', 'two', 'three'])


if __name__ == '__main__':
    unittest.main()
