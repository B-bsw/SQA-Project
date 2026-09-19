# EvoSuite STANDARD_GA two-round workflow

Round 1 generates and runs tests against buggy Java sources from Resource:

    ./run_evosuite_test.sh Chart 1 60

Run multiple bugs concurrently (two processes by default):

    ./run_evosuite_test.sh Lang 1,2,3 60
    MAX_PARALLEL=4 ./run_evosuite_test.sh Lang 1,2,3,4 60

Bracket form is also accepted when quoted to prevent shell glob expansion:

    ./run_evosuite_test.sh Lang "[1,2,3]" 60

Generated JUnit source is saved directly in `GenericAlgorithm/TestCode/Chart_1`
as `*_ESTest.java` and `*_ESTest_scaffolding.java`.
JSON and CSV reports are saved in
`GenericAlgorithm/Result_Round1/Chart_1`.

Round 2 runs the latest generated suite against the fixed Defects4J revision:

    ./run_evosuite_test_fixed.sh Chart 1

Multiple fixed versions can also run concurrently:

    ./run_evosuite_test_fixed.sh Lang 1,2,3

Round 2 JSON and CSV reports are saved under `GenericAlgorithm/Result_Round2`.
Both scripts embed errors in reports and do not retain `.log` or Markdown files.
Running either round again replaces that project's previous output.

Collect all per-bug reports into root-level JSON and CSV files:

    ./collect_results.sh 1
    ./collect_results.sh 2
    ./collect_results.sh all

The aggregate files are `result_round1.json/csv` and `result_round2.json/csv`.
Running the collector again atomically replaces the previous aggregate files.

Create a combined Round 1 and Round 2 overview:

    ./summarize_results.sh

This refreshes both aggregate reports and prints one compact row per project:
total bugs, pass percentages, generated tests, line/branch coverage, fixed tests,
and failures. It also creates `GenericAlgorithm/summary.json` and
`GenericAlgorithm/summary.csv`.
