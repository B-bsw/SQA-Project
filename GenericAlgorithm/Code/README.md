# EvoSuite STANDARD_GA two-round workflow

Round 1 generates and runs tests against buggy Java sources from Resource:

    ./run_evosuite_test.sh Chart 1 60

Generated JUnit source is saved in `GenericAlgorithm/TestCode/Chart_1/<run-id>`.
JSON and CSV reports are saved in
`GenericAlgorithm/Result_Round1/Chart_1/<run-id>`.

Round 2 runs the latest generated suite against the fixed Defects4J revision:

    ./run_fixed_test.sh Chart 1

To choose an older generated suite:

    ./run_fixed_test.sh Chart 1 <test-run-id>

Round 2 JSON and CSV reports are saved under `GenericAlgorithm/Result_Round2`.
Both scripts embed errors in reports and do not retain `.log` or Markdown files.
