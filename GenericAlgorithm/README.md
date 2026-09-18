# GenericAlgorithm — EvoSuite / Defects4J experiment

This is a reproducible implementation of requirement (1): EvoSuite's **DynaMOSA genetic algorithm** generates JUnit tests for every Defects4J project checkout under data/Code, then records coverage and execution metrics.

The repository has 17 projects at version 1b. Results are not claimed until the runner completes successfully.

## Run

    cd GenericAlgorithm
    cp Configuration/experiment.env.example Configuration/experiment.env
    # Edit paths to JDK 11 and EvoSuite
    bash scripts/preflight.sh
    bash scripts/run_all.sh

The runner writes only under TestCode and Result_Round1; source checkouts are not overwritten. It uses Defects4J's classes.modified as a consistent bug-relevant target selection rule. Use TARGET_SCOPE=all to test every production class.

Outputs: generated sources/reports in TestCode, raw logs in Result_Round1/logs, one row per target in results.csv, and aggregate metrics in summary.md. See Configuration/METHODOLOGY.md.
