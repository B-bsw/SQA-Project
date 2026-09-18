package org.mockito.internal.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TimerTest {

    @Test
    public void shouldBeCountingWhenDurationIsPositiveAndJustStarted() {
        Timer timer = new Timer(1000);
        timer.start();
        assertTrue(timer.isCounting());
    }

    @Test
    public void shouldNotBeCountingWhenDurationHasElapsed() throws InterruptedException {
        Timer timer = new Timer(10);
        timer.start();
        Thread.sleep(50);
        assertFalse(timer.isCounting());
    }

    @Test
    public void shouldNotBeCountingWhenDurationIsZero() throws InterruptedException {
        Timer timer = new Timer(0);
        timer.start();
        Thread.sleep(5);
        assertFalse(timer.isCounting());
    }

    @Test
    public void shouldBeCountingImmediatelyAfterStartWithZeroDuration() {
        Timer timer = new Timer(0);
        timer.start();
        assertTrue(timer.isCounting());
    }

    @Test
    public void shouldNotBeCountingWhenDurationIsNegative() {
        Timer timer = new Timer(-100);
        timer.start();
        assertFalse(timer.isCounting());
    }

    @Test
    public void shouldRestartCountdownWhenStartCalledAgain() throws InterruptedException {
        Timer timer = new Timer(50);
        timer.start();
        Thread.sleep(60);
        assertFalse(timer.isCounting());

        timer.start();
        assertTrue(timer.isCounting());
    }

    @Test
    public void shouldBeCountingWithLargeDuration() {
        Timer timer = new Timer(Long.MAX_VALUE / 2);
        timer.start();
        assertTrue(timer.isCounting());
    }

    @Test
    public void shouldHandleMultipleStartCallsCorrectly() throws InterruptedException {
        Timer timer = new Timer(30);
        timer.start();
        assertTrue(timer.isCounting());

        Thread.sleep(10);
        timer.start();
        assertTrue(timer.isCounting());

        Thread.sleep(40);
        assertFalse(timer.isCounting());
    }
}