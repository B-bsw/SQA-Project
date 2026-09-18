# EvoSuite GA runners

Single Resource bug:

    ./run_evosuite_test.sh Chart 1 60

Multiple selected bugs:

    ./run_evosuite_multiple.sh --budget 60 Chart 1 Cli 2 Codec 1

Every Resource bug:

    ./run_evosuite_multiple.sh --budget 60 --all

The scripts read Java files only from `Resoucre/Project_BugId`, use EvoSuite
`STANDARD_GA`, and create a fresh folder under `GenericAlgorithm/Result` for
every run. `result.json` and `report.md` are written under `Result`; generated
EvoSuite JUnit source is written under `TestCode`. No `.log` files are retained.
