package org.apache.commons.lang.time;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Comprehensive Unit Tests for {@link StopWatch}.
 * Strictly compliant with JUnit 4 and Java 7 syntax (no diamond operator, no lambdas).
 */
public class StopWatchTest {

    @Test
    public void startAndStopAndReset_shouldMeasureElapsedTime() throws Exception {
        // Arrange
        StopWatch watch = new StopWatch();

        // Act
        watch.start();
        Thread.sleep(20);
        watch.stop();
        long time = watch.getTime();

        // Assert
        assertTrue(time >= 15);

        watch.reset();
        assertEquals(0, watch.getTime());
    }

    @Test
    public void splitAndUnsplit_shouldCaptureSplitTime() throws Exception {
        // Arrange
        StopWatch watch = new StopWatch();

        // Act
        watch.start();
        Thread.sleep(20);
        watch.split();
        long splitTime = watch.getSplitTime();
        watch.unsplit();
        Thread.sleep(20);
        watch.stop();

        // Assert
        assertTrue(splitTime >= 15);
        assertTrue(watch.getTime() >= splitTime);
    }

    @Test
    public void suspendAndResume_shouldPauseMeasurement() throws Exception {
        // Arrange
        StopWatch watch = new StopWatch();

        // Act
        watch.start();
        Thread.sleep(20);
        watch.suspend();
        Thread.sleep(30);
        watch.resume();
        watch.stop();

        // Assert
        long elapsed = watch.getTime();
        assertTrue(elapsed < 45);
    }
}
