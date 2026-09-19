# EvoSuite STANDARD_GA workflow

## Round 1: generate the test suite

```bash
./run_evosuite_test.sh Chart 1 60
./run_evosuite_test.sh Lang 1,2,3 60
```

EvoSuite generates tests from the buggy revision. Output:

- `TestCode/Project_ID/*_ESTest.java`
- `Result_Round1/Project_ID/result.json`
- `Result_Round1/Project_ID/result.csv`

Round 1 reports generation metrics only. Its `test_execution=PASS` means suite
generation succeeded; it is not a buggy/fixed validation result.

## Round 2: validate the same suite

```bash
./run_evosuite_test_fixed.sh Chart 1
./run_evosuite_test_fixed.sh Lang 1,2,3
```

The script takes the existing TestCode once, then runs it on both revisions:

```text
EvoSuite suite ──┬── buggy (Project-IDb) ── PASS/FAIL
                 └── fixed (Project-IDf) ── PASS/FAIL
```

Output:

- `Result_Round2/Project_ID/result.json` and `result.csv`: validation rows
- `Result_Round2/Project_ID/result_summary.json` and `result_summary.csv`:
  per-bug detection decision

`passed_tests` is `tests_run - failures`. The suite detects the defect only for
`buggy=FAIL` and `fixed=PASS`. That result uses `bug_detected=true`,
`status=pass`, and includes the buggy failure in `defect`. `PASS/PASS` is also
`status=pass`; `FAIL/FAIL`, `PASS/FAIL`, or unequal test counts are
`status=inconclusive`. Incomplete execution uses `status=not_available`.
Coverage never decides defect detection.

Round 2 snapshots TestCode once before either checkout. Buggy and fixed use
separate checkout directories, separate `cp.test` dependencies, and separate
compiled-test directories. Nothing generated or compiled for one revision is
reused as compiled input for the other; only the identical Java test sources
are shared.

## Aggregate and summarize

```bash
./collect_results.sh all
./summarize_results.sh
```

These create `result_round1.json/csv`, `result_round2.json/csv`,
`result_summary.json/csv`, and `summary.json/csv` under
`GenericAlgorithm/summary_result/`.
Reruns archive previous per-bug reports and TestCode under `ReportHistory/`.

Use `MAX_PARALLEL=4` to change the default batch concurrency of two processes.
