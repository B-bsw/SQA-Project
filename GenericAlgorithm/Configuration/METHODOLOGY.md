# Methodology and reporting protocol

## Algorithm and subjects

The selected generic algorithm is **DynaMOSA**, EvoSuite's dynamic many-objective evolutionary (genetic) search. Candidate JUnit suites are evolved with mutation/crossover against line and branch objectives. Parameters are fixed: seed 20260917, LINE:BRANCH criterion, and 60 seconds per target class.

Subjects are the 17 Defects4J v3 projects already checked out at buggy version 1b: Chart, Cli, Closure, Codec, Collections, Compress, Csv, Gson, JacksonCore, JacksonDatabind, JacksonXml, Jsoup, JxPath, Lang, Math, Mockito, Time. A target is a class supplied by classes.modified; this applies one selection rule to all projects. TARGET_SCOPE=all is available for full-production testing.

## Measurements

results.csv contains one row per target. generation_seconds is wall time, test_count is generated @Test methods, and line/branch coverage are obtained from EvoSuite measureCoverage statistics—not search fitness. Missing values remain missing; failures retain a status and raw log. summary.md reports processed targets, successful rows, test count, time, and mean coverage only over measured rows.

## Fair AI comparison and validity

For requirement (2), use the same Defects4J version, target scope, JDK, timeout, coverage command, and CSV schema; retain exact prompt, model/version/date, generated source, and logs. Compare executable-suite rate, test count, coverage, generation time, and failure-trigger rate. Repeat stochastic runs with distinct fixed seeds; coverage is a proxy for, not proof of, fault detection.
