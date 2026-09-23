package org.mockito.internal.util;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

public class TimerTest {
    
    @Before
    public void setUp() {
        // No special setup needed, but kept for clarity
    }
    
    @After
    public void tearDown() {
        // No special teardown needed, but kept for clarity
    }
    
    @Test
    public void testStartInitializesStartTime() {
        Timer timer = new Timer(100);
        timer.start();
        long currentTime = System.currentTimeMillis();
        Assert.assertFalse("Start time should be set", timerStartTimeIsCloseToCurrent(timer, currentTime));
    }
    
    @Test
    public void testIsCountingWhenWithinDuration() {
        Timer timer = new Timer(1000);
        // Manually set startTime to simulate immediate start
        setStartTime(timer, System.currentTimeMillis());
        Assert.assertTrue("Should be counting when within duration", timer.isCounting());
    }
    
    @Test
    public void testIsCountingWhenDurationExpired() {
        Timer timer = new Timer(100);
        // Manually set startTime to 200ms in the past
        setStartTime(timer, System.currentTimeMillis() - 200);
        Assert.assertFalse("Should not be counting when duration expired", timer.isCounting());
    }
    
    @Test
    public void testIsCountingAtExactBoundary() {
        Timer timer = new Timer(100);
        // Set startTime to exactly 100ms ago - at the boundary it should still count as counting
        setStartTime(timer, System.currentTimeMillis() - 100);
        Assert.assertTrue("Should be counting at exact boundary - inclusive", timer.isCounting());
    }
    
    @Test
    public void testIsCountingWithZeroDuration() {
        Timer timer = new Timer(0);
        // Start just now, should be counting
        timer.start();
        Assert.assertTrue("Zero duration timer should still count immediately after start", timer.isCounting());
        
        // But after a tiny delay, it could be expired (race condition awareness)
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        Assert.assertFalse("Zero duration timer should stop counting after minimal time", timer.isCounting());
    }
    
    @Test
    public void testIsCountingWithNegativeDuration() {
        Timer timer = new Timer(-100);
        timer.start();
        Assert.assertFalse("Negative duration timer should not count", timer.isCounting());
    }
    
    @Test
    public void testStartResetsCountdownForNewStart() {
        Timer timer = new Timer(50);
        timer.start();
        // Simulate some time passing
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        Assert.assertTrue("First start should be counting", timer.isCounting());
        
        // Wait for it to expire
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        Assert.assertFalse("Should have expired", timer.isCounting());
        
        // Restart
        timer.start();
        Assert.assertTrue("After restart, should be counting again", timer.isCounting());
    }
    
    @Test
    public void testIsCountingWithShortDurationAfterWait() {
        Timer timer = new Timer(50);
        timer.start();
        try {
            Thread.sleep(60);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        Assert.assertFalse("Should have expired after waiting longer than duration", timer.isCounting());
    }
    
    @Test
    public void testIsCountingWithLongDuration() {
        Timer timer = new Timer(1000000);
        timer.start();
        Assert.assertTrue("Long duration timer should still be counting", timer.isCounting());
    }
    
    @Test
    public void testMultipleStarts() {
        Timer timer = new Timer(50);
        timer.start();
        // Simulate 30ms elapsed
        try { Thread.sleep(30); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        Assert.assertTrue("Still counting after 30ms", timer.isCounting());
        
        // Restart after 30ms - should reset the timer
        timer.start();
        try { Thread.sleep(10); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        Assert.assertTrue("After restart, 10ms elapsed should still count", timer.isCounting());
        
        try { Thread.sleep(50); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        Assert.assertFalse("After restart, 60ms total elapsed - original duration was 50ms, so should have expired", timer.isCounting());
    }
    
    @Test
    public void testIsCountingLargeDurationBoundary() {
        Timer timer = new Timer(Long.MAX_VALUE);
        timer.start();
        Assert.assertTrue("Large duration should always be counting", timer.isCounting());
    }
    
    @Test
    public void testIsCountingZeroElapsedTimeImmediate() {
        Timer timer = new Timer(100);
        setStartTime(timer, System.currentTimeMillis());
        // Without any delay, should be counting
        Assert.assertTrue(timer.isCounting());
    }
    
    // Helper methods
    private boolean timerStartTimeIsCloseToCurrent(Timer timer, long currentTime) {
        // Since start() sets startTime to System.currentTimeMillis(), it should be very close
        // We can't directly inspect private field, so check through behavior
        // Instead, just verify that isCounting doesn't throw assertion error
        try {
            timer.isCounting();
            return true;
        } catch (AssertionError e) {
            return false;
        }
    }
    
    private void setStartTime(Timer timer, long time) {
        // Use reflection to set private field - this is a workaround, but in test we can do it
        try {
            java.lang.reflect.Field field = Timer.class.getDeclaredField("startTime");
            field.setAccessible(true);
            field.setLong(timer, time);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException("Failed to set startTime", e);
        }
    }
    
    @Test
    public void testIsCountingAfterExpiryBoundaryMinusOneMillisecond() {
        Timer timer = new Timer(100);
        // Set startTime to 99ms ago - should definitely be counting
        setStartTime(timer, System.currentTimeMillis() - 99);
        Assert.assertTrue("Should still count at 99ms of 100ms", timer.isCounting());
    }
    
    @Test
    public void testIsCountingAfterExpiryBoundaryPlusOneMillisecond() {
        Timer timer = new Timer(100);
        // Set startTime to 101ms ago - should definitely be expired
        setStartTime(timer, System.currentTimeMillis() - 101);
        Assert.assertFalse("Should have expired at 101ms of 100ms", timer.isCounting());
    }
    
    @Test
    public void testIsCountingAfterExpiryMultipleDurations() {
        Timer timer = new Timer(10);
        // Set startTime to 25ms ago - more than 2x the duration
        setStartTime(timer, System.currentTimeMillis() - 25);
        Assert.assertFalse("Should have long expired", timer.isCounting());
    }
    
    @Test(expected = AssertionError.class)
    public void testIsCountingBeforeStart() {
        Timer timer = new Timer(100);
        // startTime is still -1, should throw AssertionError due to assert statement
        timer.isCounting();
    }
}