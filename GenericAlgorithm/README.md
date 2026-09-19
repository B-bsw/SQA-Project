# Generic Algorithm — EvoSuite (STANDARD_GA)

This directory contains the EvoSuite genetic-algorithm experiment for the 17
Defects4J projects. Buggy source files are read from `../Resoucre`, generated
tests are written to `TestCode`, and machine-readable results are written to
`Result_Round1` and `Result_Round2`.

## Workflow

1. **Round 1:** generate EvoSuite tests from the buggy (`b`) revision and run
   them against that same revision.
2. **Round 2:** compile and run the Round 1 tests against the fixed (`f`)
   revision.
3. **Collect:** combine every per-bug JSON report.
4. **Summarize:** show a compact per-project overview and coverage.

```bash
cd GenericAlgorithm/Code

# One bug
./run_evosuite_test.sh Chart 1 60
./run_evosuite_test_fixed.sh Chart 1

# Multiple bugs (two concurrent processes by default)
./run_evosuite_test.sh Lang 1,2,3 60
./run_evosuite_test_fixed.sh Lang 1,2,3

# Aggregate and summarize existing results
./collect_results.sh all
./summarize_results.sh
```

Use `MAX_PARALLEL=4` before a multi-bug command to change concurrency. EvoSuite
can use up to 2 GB per process by default, so choose this value according to the
available memory.

## Project checklist

Status snapshot: 2026-09-19. `Round 1` and `Round 2` show
**successful reports / reports produced**. A project is marked complete when a
report exists for every Resource bug, even if individual reports contain a
failed test. `TestCode` counts bugs that have a generated `*_ESTest.java` file.

| Done | Project | Resource bugs | Round 1 (OK/reports) | TestCode bugs | Round 2 (OK/reports) | Status |
|:---:|---|---:|---:|---:|---:|---|
| ✅ | Chart | 26 | 26/26 | 26 | 21/26 | Both rounds complete; 5 Round 2 reports failed |
| ✅ | Cli | 39 | 38/39 | 39 | 25/39 | Both rounds complete; 1 Round 1 and 14 Round 2 reports failed |
| ⬜ | Closure | 174 | 0/0 | 0 | 0/0 | Resource ready; not started |
| ✅ | Codec | 18 | 17/18 | 18 | 11/18 | Both rounds complete; 1 Round 1 and 7 Round 2 reports failed |
| ⬜ | Collections | 28 | 0/0 | 0 | 0/0 | Resource ready; not started |
| ⬜ | Compress | 47 | 0/0 | 0 | 0/0 | Resource ready; not started |
| ⬜ | Csv | 16 | 0/0 | 0 | 0/0 | Resource ready; not started |
| ⬜ | Gson | 18 | 0/0 | 0 | 0/0 | Resource ready; not started |
| ⬜ | JacksonCore | 26 | 0/0 | 0 | 0/0 | Resource ready; not started |
| ⬜ | JacksonDatabind | 110 | 0/0 | 0 | 0/0 | Resource ready; not started |
| ⬜ | JacksonXml | 6 | 0/0 | 0 | 0/0 | Resource ready; not started |
| ⬜ | Jsoup | 93 | 0/0 | 0 | 0/0 | Resource ready; not started |
| ⬜ | JxPath | 22 | 0/0 | 0 | 0/0 | Resource ready; not started |
| ⬜ | Lang | 61 | 0/0 | 0 | 0/0 | Resource ready; not started |
| ⬜ | Math | 106 | 0/0 | 0 | 0/0 | Resource ready; not started |
| ⬜ | Mockito | 38 | 0/0 | 0 | 0/0 | Resource ready; not started |
| ⬜ | Time | 26 | 0/0 | 0 | 0/0 | Resource ready; not started |
| **3/17** | **TOTAL** | **854** | **81/83** | **83** | **57/83** | **83/854 bugs have reports for both rounds** |

## Output layout

```text
GenericAlgorithm/
├── Code/                 # Executable scripts and evosuite-1.2.0.jar
├── Configuration/        # EvoSuite configuration
├── TestCode/             # Generated EvoSuite Java tests by Project_ID
├── Result_Round1/        # Per-bug buggy-version JSON/CSV reports
├── Result_Round2/        # Per-bug fixed-version JSON/CSV reports
└── summary_result/       # All aggregate reports and summaries
    ├── result_round1.json
    ├── result_round1.csv
    ├── result_round2.json
    ├── result_round2.csv
    ├── result_summary.json
    ├── result_summary.csv
    ├── summary.json
    └── summary.csv
```

Round 2 success means that a test generated from the buggy version also passes
on the fixed version. It is a fixed-version compatibility result, not a claim
that EvoSuite repaired the bug.

## Detection workflow

Round 1 generates one EvoSuite suite. Round 2 runs the exact files from
`TestCode/Project_ID` against both buggy and fixed revisions. A buggy failure
followed by a fixed pass produces `status=defect`; other completed pairs produce
`status=pass`. See the [script guide](Code/README.md) for schemas and commands.
