package org.apache.commons.lang.time;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;
import java.lang.reflect.Field;

public class StopWatchTest {

    private StopWatch watch;

    @Before
    public void setUp() {
        watch = new StopWatch();
    }

    @After
    public void tearDown() {
        watch = null;
    }

    @Test
    public void testInitialState() {
        Assert.assertEquals(0, watch.getTime());
        Assert.assertEquals("0:00:00.000", watch.toString());
        Assert.assertEquals("0:00:00.000", watch.toSplitString());
    }

    @Test
    public void testStartTwiceThrowsException() {
        watch.start();
        try {
            watch.start();
            Assert.fail("Expected IllegalStateException for double start");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("already started"));
        }
    }

    @Test
    public void testStopBeforeStartThrowsException() {
        try {
            watch.stop();
            Assert.fail("Expected IllegalStateException for stopping before start");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("not running"));
        }
    }

    @Test
    public void testSuspendBeforeStartThrowsException() {
        try {
            watch.suspend();
            Assert.fail("Expected IllegalStateException for suspending before start");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("not running"));
        }
    }

    @Test
    public void testResumeWithoutSuspendThrowsException() {
        try {
            watch.resume();
            Assert.fail("Expected IllegalStateException for resuming without suspend");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("not been suspended"));
        }
    }

    @Test
    public void testSplitBeforeStartThrowsException() {
        try {
            watch.split();
            Assert.fail("Expected IllegalStateException for splitting before start");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("not running"));
        }
    }

    @Test
    public void testUnsplitBeforeSplitThrowsException() {
        try {
            watch.unsplit();
            Assert.fail("Expected IllegalStateException for unsplitting before split");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("not been split"));
        }
    }

    @Test
    public void testGetSplitTimeBeforeSplitThrowsException() {
        try {
            watch.getSplitTime();
            Assert.fail("Expected IllegalStateException for getting split time before split");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("must be split"));
        }
    }

    @Test
    public void testStopAndRestartWithoutResetThrowsException() {
        watch.start();
        watch.stop();
        try {
            watch.start();
            Assert.fail("Expected IllegalStateException for restarting without reset");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("must be reset"));
        }
    }

    @Test
    public void testStopAfterSuspendResumesCountsTime() throws Exception {
        // This test uses reflection to verify internal state after operations
        // since we can't wait real time in unit tests
        watch.start();
        setPrivateField(watch, "stopTime", System.currentTimeMillis() + 10000);
        watch.suspend();
        watch.resume();
        setPrivateField(watch, "stopTime", System.currentTimeMillis() + 20000);
        watch.stop();
        long time = watch.getTime();
        Assert.assertTrue("Time should be at least 10000ms, got " + time, time >= 10000);
    }

    @Test
    public void testGetTimeAfterSuspend() throws Exception {
        watch.start();
        setPrivateField(watch, "stopTime", System.currentTimeMillis() + 5000);
        watch.suspend();
        long time = watch.getTime();
        Assert.assertTrue("Time should be at least 5000ms, got " + time, time >= 5000);
    }

    @Test
    public void testGetTimeAfterStop() throws Exception {
        watch.start();
        setPrivateField(watch, "stopTime", System.currentTimeMillis() + 15000);
        watch.stop();
        long time = watch.getTime();
        Assert.assertTrue("Time should be at least 15000ms, got " + time, time >= 15000);
    }

    @Test
    public void testGetTimeWhileRunning() {
        watch.start();
        long time = watch.getTime();
        Assert.assertTrue("Time should be non-negative while running", time >= 0);
    }

    @Test
    public void testReset() {
        watch.start();
        watch.reset();
        Assert.assertEquals(0, watch.getTime());
        Assert.assertEquals("0:00:00.000", watch.toString());
        // After reset, start should work again
        watch.start();
        watch.stop();
        Assert.assertTrue("Time should not be zero after restart", watch.getTime() >= 0);
    }

    @Test
    public void testSplitAndUnsplit() throws Exception {
        watch.start();
        setPrivateField(watch, "stopTime", System.currentTimeMillis() + 10000);
        watch.split();
        Assert.assertNotNull(watch.toSplitString());
        Assert.assertNotEquals("0:00:00.000", watch.toSplitString());
        
        long splitTime = watch.getSplitTime();
        Assert.assertTrue("Split time should be at least 10000ms, got " + splitTime, splitTime >= 10000);
        
        watch.unsplit();
        // After unsplit, getSplitTime should throw
        try {
            watch.getSplitTime();
            Assert.fail("Expected IllegalStateException for getSplitTime after unsplit");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("must be split"));
        }
    }

    @Test
    public void testSplitAfterStopThrowsException() {
        watch.start();
        watch.stop();
        try {
            watch.split();
            Assert.fail("Expected IllegalStateException for split after stop");
        } catch (IllegalStateException e) {
            Assert.assertTrue(e.getMessage().contains("not running"));
        }
    }

    @Test
    public void testSuspendAndResume() throws Exception {
        watch.start();
        watch.suspend();
        Assert.assertEquals(STATE_SUSPENDED, getPrivateField(watch, "runningState"));
        watch.resume();
        Assert.assertEquals(STATE_RUNNING, getPrivateField(watch, "runningState"));
    }

    @Test
    public void testStopSetsRunningState() throws Exception {
        watch.start();
        watch.stop();
        Assert.assertEquals(STATE_STOPPED, getPrivateField(watch, "runningState"));
    }

    @Test
    public void testFormatDurationHMS() {
        // Test toString and toSplitString formats
        try {
            watch.start();
            watch.stop();
            String result = watch.toString();
            Assert.assertTrue("toString should match pattern", result.matches("\\d+:\\d{2}:\\d{2}\\.\\d{3}"));
        } catch (Exception e) {
            // In case timing is too fast, this is still acceptable
            Assert.fail("toString failed: " + e.getMessage());
        }
    }

    // Helper methods to access private fields
    private void setPrivateField(Object obj, String fieldName, Object value) throws Exception {
        Field field = obj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(obj, value);
    }

    private Object getPrivateField(Object obj, String fieldName) throws Exception {
        Field field = obj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return field.get(obj);
    }

    // Constant values for testing (should match those in StopWatch)
    private static final int STATE_UNSTARTED = 0;
    private static final int STATE_RUNNING   = 1;
    private static final int STATE_STOPPED   = 2;
    private static final int STATE_SUSPENDED = 3;
}