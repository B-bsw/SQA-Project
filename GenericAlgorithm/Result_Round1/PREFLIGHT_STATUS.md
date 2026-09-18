# Environment status at setup time

Checked on 2026-09-17:

* 17 Defects4J buggy workspaces named *_1_buggy are present under data/Code.
* The available default JVM is Java 25.
* Defects4J v3 refused to run because it requires Java 11.
* An EvoSuite executable or JAR was not available on PATH.

Therefore no coverage or effectiveness value has been fabricated in results.csv. Configure JDK 11 and EvoSuite in Configuration/experiment.env, then execute the supplied preflight and runner to produce measured results.
