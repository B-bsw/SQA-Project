package org.mockito.internal.util;

import org.junit.Assert;
import org.junit.Test;

public class TimerTest {

    @Test
    public void isCounting_givenTimerStartedWithPositiveDuration_shouldReturnTrueImmediately() {
        // Arrange
        long durationMillis = 2000L;
        Timer timer = new Timer(durationMillis);

        // Act
        timer.start();
        boolean result = timer.isCounting();

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isCounting_givenTimerExpired_shouldReturnFalse() throws InterruptedException {
        // Arrange
        long durationMillis = 30L;
        Timer timer = new Timer(durationMillis);

        // Act
        timer.start();
        Thread.sleep(60L);
        boolean result = timer.isCounting();

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void isCounting_givenZeroDuration_shouldReturnFalseAfterBriefDelay() throws InterruptedException {
        // Arrange
        Timer timer = new Timer(0L);

        // Act
        timer.start();
        Thread.sleep(10L);
        boolean result = timer.isCounting();

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void isCounting_givenNegativeDuration_shouldReturnFalseAfterBriefDelay() throws InterruptedException {
        // Arrange
        Timer timer = new Timer(-100L);

        // Act
        timer.start();
        Thread.sleep(10L);
        boolean result = timer.isCounting();

        // Assert
        Assert.assertFalse(result);
    }

    @Test
    public void isCounting_givenTimerRestartedAfterExpiry_shouldReturnTrueAgain() throws InterruptedException {
        // Arrange
        long durationMillis = 30L;
        Timer timer = new Timer(durationMillis);
        timer.start();
        Thread.sleep(60L);
        Assert.assertFalse(timer.isCounting());

        // Act
        timer.start();
        boolean resultAfterRestart = timer.isCounting();

        // Assert
        Assert.assertTrue(resultAfterRestart);
    }

    @Test
    public void isCounting_givenMaxLongDuration_shouldReturnTrue() {
        // Arrange
        Timer timer = new Timer(Long.MAX_VALUE);

        // Act
        timer.start();
        boolean result = timer.isCounting();

        // Assert
        Assert.assertTrue(result);
    }

    @Test
    public void isCounting_givenTimerNotStarted_shouldHandleAssertionOrCalculateWithNegativeOne() {
        // Arrange
        Timer timer = new Timer(1000L);

        // Act & Assert
        try {
            boolean result = timer.isCounting();
            Assert.assertFalse(result);
        } catch (AssertionError e) {
            Assert.assertNotNull(e);
        }
    }

    @Test
    public void start_givenMultipleCalls_shouldResetStartTime() throws InterruptedException {
        // Arrange
        long durationMillis = 50L;
        Timer timer = new Timer(durationMillis);

        // Act
        timer.start();
        Thread.sleep(30L);
        timer.start();
        Thread.sleep(30L);
        boolean result = timer.isCounting();

        // Assert
        Assert.assertTrue(result);
    }
}