package org.apache.commons.lang.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        long long8 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str11 = stopWatch0.toString();
        stopWatch0.resume();
        long long13 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.reset();
        java.lang.String str17 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
// flaky "1) test7002(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1790275767909L) + "'", long13 == (-1790275767909L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0:00:00.000" + "'", str17, "0:00:00.000");
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long13 = stopWatch0.getTime();
        stopWatch0.stop();
        long long15 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toString();
        java.lang.String str14 = stopWatch0.toString();
        long long15 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "2) test7004(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-27.80" + "'", str12, "-497298:-49:-27.80");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        java.lang.String str10 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky "3) test7005(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-497298:-49:-27.74" + "'", str10, "-497298:-49:-27.74");
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.split();
        long long8 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.stop();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        long long16 = stopWatch0.getSplitTime();
        java.lang.String str17 = stopWatch0.toSplitString();
        java.lang.String str18 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "4) test7009(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-27.55" + "'", str12, "-497298:-49:-27.55");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0:00:00.000" + "'", str17, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0:00:00.000" + "'", str18, "0:00:00.000");
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.reset();
        java.lang.String str6 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str10 = stopWatch0.toSplitString();
        java.lang.String str11 = stopWatch0.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
// flaky "5) test7011(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        stopWatch0.start();
        long long11 = stopWatch0.getTime();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.reset();
        long long12 = stopWatch0.getTime();
        java.lang.String str13 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        long long10 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky "6) test7014(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1790275767969L) + "'", long10 == (-1790275767969L));
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.stop();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str11 = stopWatch0.toString();
        stopWatch0.resume();
        long long13 = stopWatch0.getSplitTime();
        java.lang.String str14 = stopWatch0.toSplitString();
        java.lang.String str15 = stopWatch0.toString();
        long long16 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
// flaky "7) test7016(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1790275767979L) + "'", long13 == (-1790275767979L));
// flaky "1) test7016(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-497298:-49:-27.21" + "'", str14, "-497298:-49:-27.21");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
// flaky "1) test7016(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1790275767979L) + "'", long16 == (-1790275767979L));
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.reset();
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        long long10 = stopWatch0.getTime();
        stopWatch0.stop();
        long long12 = stopWatch0.getSplitTime();
        java.lang.String str13 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.unsplit();
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.reset();
        long long11 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.reset();
        java.lang.String str11 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        stopWatch0.resume();
        long long10 = stopWatch0.getTime();
        stopWatch0.stop();
        long long12 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky "8) test7024(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1790275768028L) + "'", long10 == (-1790275768028L));
// flaky "2) test7024(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1790275768028L) + "'", long12 == (-1790275768028L));
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.reset();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        stopWatch0.split();
        long long13 = stopWatch0.getTime();
        java.lang.String str14 = stopWatch0.toSplitString();
        long long15 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.stop();
        long long18 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        long long8 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.String str10 = stopWatch0.toString();
        java.lang.String str11 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        long long3 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        long long11 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        java.lang.String str15 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.suspend();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.stop();
        long long11 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str11 = stopWatch0.toString();
        java.lang.String str12 = stopWatch0.toSplitString();
        stopWatch0.resume();
        long long14 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.split();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toString();
        java.lang.String str14 = stopWatch0.toString();
        long long15 = stopWatch0.getTime();
        java.lang.String str16 = stopWatch0.toString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "9) test7034(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-28.24" + "'", str12, "-497298:-49:-28.24");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.000" + "'", str16, "0:00:00.000");
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.stop();
        java.lang.String str11 = stopWatch0.toString();
        long long12 = stopWatch0.getTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.stop();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long11 = stopWatch0.getSplitTime();
        long long12 = stopWatch0.getSplitTime();
        java.lang.String str13 = stopWatch0.toString();
        java.lang.String str14 = stopWatch0.toSplitString();
        long long15 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        long long17 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long10 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long11 = stopWatch0.getSplitTime();
        long long12 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long10 = stopWatch0.getTime();
        java.lang.String str11 = stopWatch0.toString();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str15 = stopWatch0.toString();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.stop();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        long long8 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        long long11 = stopWatch0.getTime();
        stopWatch0.stop();
        long long13 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toSplitString();
        long long14 = stopWatch0.getTime();
        long long15 = stopWatch0.getTime();
        java.lang.String str16 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.000" + "'", str16, "0:00:00.000");
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toString();
        java.lang.String str11 = stopWatch0.toSplitString();
        long long12 = stopWatch0.getTime();
        java.lang.String str13 = stopWatch0.toSplitString();
        java.lang.Class<?> wildcardClass14 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
// flaky "1) test7046(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.String str5 = stopWatch0.toString();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getTime();
        stopWatch0.reset();
        long long10 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.stop();
        long long10 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        java.lang.String str8 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getSplitTime();
        long long10 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getTime();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        long long4 = stopWatch0.getTime();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.suspend();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str10 = stopWatch0.toString();
        java.lang.String str11 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.stop();
        java.lang.String str4 = stopWatch0.toString();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str16 = stopWatch0.toString();
        stopWatch0.resume();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
// flaky "10) test7059(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.001" + "'", str9, "0:00:00.001");
// flaky "3) test7059(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.001" + "'", str10, "0:00:00.001");
// flaky "2) test7059(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-28.97" + "'", str12, "-497298:-49:-28.97");
// flaky "1) test7059(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.001" + "'", str13, "0:00:00.001");
// flaky "1) test7059(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.001" + "'", str16, "0:00:00.001");
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.reset();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getTime();
        stopWatch0.reset();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        long long13 = stopWatch0.getSplitTime();
        java.lang.Class<?> wildcardClass14 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.reset();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.start();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.suspend();
        long long7 = stopWatch0.getTime();
        stopWatch0.resume();
        stopWatch0.split();
        stopWatch0.suspend();
        long long11 = stopWatch0.getSplitTime();
        stopWatch0.resume();
        long long13 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        long long12 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.stop();
        long long6 = stopWatch0.getSplitTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.reset();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        long long9 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.String str11 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.reset();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toString();
        long long10 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str12 = stopWatch0.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        long long8 = stopWatch0.getSplitTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toSplitString();
        java.lang.String str14 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.stop();
        long long6 = stopWatch0.getSplitTime();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        long long10 = stopWatch0.getTime();
        long long11 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass14 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.split();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        long long10 = stopWatch0.getTime();
        java.lang.String str11 = stopWatch0.toSplitString();
        long long12 = stopWatch0.getTime();
        java.lang.String str13 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
// flaky "1) test7076(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.resume();
        stopWatch0.stop();
        long long10 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str11 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.stop();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.stop();
        long long7 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long8 = stopWatch0.getSplitTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        long long10 = stopWatch0.getTime();
        stopWatch0.unsplit();
        java.lang.Class<?> wildcardClass12 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.start();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        long long10 = stopWatch0.getTime();
        long long11 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str11 = stopWatch0.toString();
        java.lang.String str12 = stopWatch0.toSplitString();
        long long13 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str11 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.suspend();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str9 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        stopWatch0.reset();
        stopWatch0.reset();
        long long10 = stopWatch0.getTime();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long11 = stopWatch0.getSplitTime();
        java.lang.String str12 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
// flaky "4) test7091(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getTime();
        stopWatch0.stop();
        long long9 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        stopWatch0.split();
        java.lang.String str13 = stopWatch0.toString();
        java.lang.String str14 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.split();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
// flaky "11) test7097(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-497298:-49:-28.03" + "'", str9, "-497298:-49:-28.03");
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.start();
        long long10 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.reset();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long9 = stopWatch0.getTime();
        stopWatch0.resume();
        stopWatch0.suspend();
        stopWatch0.reset();
        java.lang.String str13 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        java.lang.String str9 = stopWatch0.toString();
        long long10 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        stopWatch0.reset();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long10 = stopWatch0.getSplitTime();
        stopWatch0.resume();
        stopWatch0.stop();
        java.lang.String str13 = stopWatch0.toString();
        java.lang.String str14 = stopWatch0.toSplitString();
        java.lang.String str15 = stopWatch0.toSplitString();
        long long16 = stopWatch0.getTime();
        java.lang.String str17 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0:00:00.000" + "'", str17, "0:00:00.000");
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long12 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.stop();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getTime();
        long long10 = stopWatch0.getSplitTime();
        long long11 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long10 = stopWatch0.getTime();
        java.lang.String str11 = stopWatch0.toString();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getSplitTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.suspend();
        long long10 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        stopWatch0.resume();
        stopWatch0.suspend();
        java.lang.String str11 = stopWatch0.toString();
        long long12 = stopWatch0.getTime();
        long long13 = stopWatch0.getTime();
        stopWatch0.resume();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky "12) test7114(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-497298:-49:-28.22" + "'", str11, "-497298:-49:-28.22");
// flaky "5) test7114(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1790275768478L) + "'", long12 == (-1790275768478L));
// flaky "3) test7114(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1790275768478L) + "'", long13 == (-1790275768478L));
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getTime();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        long long11 = stopWatch0.getTime();
        long long12 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitTime();
        java.lang.String str9 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        long long10 = stopWatch0.getTime();
        stopWatch0.suspend();
        java.lang.String str12 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.stop();
        long long15 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
// flaky "1) test7119(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.reset();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        long long13 = stopWatch0.getTime();
        java.lang.String str14 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
// flaky "13) test7124(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-28.73" + "'", str12, "-497298:-49:-28.73");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky "6) test7124(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-497298:-49:-28.73" + "'", str14, "-497298:-49:-28.73");
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str10 = stopWatch0.toString();
        java.lang.String str11 = stopWatch0.toString();
        long long12 = stopWatch0.getSplitTime();
        stopWatch0.split();
        long long14 = stopWatch0.getSplitTime();
        java.lang.String str15 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        java.lang.String str5 = stopWatch0.toString();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.reset();
        long long8 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
// flaky "2) test7128(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getSplitTime();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.suspend();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str16 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "14) test7131(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-28.38" + "'", str12, "-497298:-49:-28.38");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.000" + "'", str16, "0:00:00.000");
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.stop();
        long long10 = stopWatch0.getSplitTime();
        java.lang.String str11 = stopWatch0.toSplitString();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toSplitString();
        long long14 = stopWatch0.getTime();
        java.lang.String str15 = stopWatch0.toSplitString();
        java.lang.String str16 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.000" + "'", str16, "0:00:00.000");
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long10 = stopWatch0.getSplitTime();
        stopWatch0.resume();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getSplitTime();
        long long10 = stopWatch0.getSplitTime();
        java.lang.String str11 = stopWatch0.toSplitString();
        java.lang.String str12 = stopWatch0.toSplitString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.resume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getSplitTime();
        long long10 = stopWatch0.getTime();
        java.lang.String str11 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long10 = stopWatch0.getTime();
        stopWatch0.stop();
        long long12 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        java.lang.String str10 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long13 = stopWatch0.getTime();
        stopWatch0.stop();
        stopWatch0.unsplit();
        java.lang.String str16 = stopWatch0.toString();
        java.lang.String str17 = stopWatch0.toString();
        long long18 = stopWatch0.getTime();
        long long19 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky "15) test7140(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-497298:-49:-28.93" + "'", str16, "-497298:-49:-28.93");
// flaky "7) test7140(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-497298:-49:-28.93" + "'", str17, "-497298:-49:-28.93");
// flaky "4) test7140(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1790275768607L) + "'", long18 == (-1790275768607L));
// flaky "2) test7140(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1790275768607L) + "'", long19 == (-1790275768607L));
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str9 = stopWatch0.toSplitString();
        long long10 = stopWatch0.getTime();
        java.lang.String str11 = stopWatch0.toSplitString();
        java.lang.String str12 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str16 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.unsplit();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "16) test7142(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-28.83" + "'", str12, "-497298:-49:-28.83");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.000" + "'", str16, "0:00:00.000");
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.stop();
        long long9 = stopWatch0.getSplitTime();
        java.lang.String str10 = stopWatch0.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str10 = stopWatch0.toSplitString();
        java.lang.String str11 = stopWatch0.toSplitString();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        long long12 = stopWatch0.getTime();
        long long13 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.reset();
        stopWatch0.start();
        long long10 = stopWatch0.getTime();
        stopWatch0.reset();
        long long12 = stopWatch0.getTime();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.suspend();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toSplitString();
        long long10 = stopWatch0.getTime();
        long long11 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        java.lang.String str14 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long11 = stopWatch0.getSplitTime();
        long long12 = stopWatch0.getSplitTime();
        java.lang.String str13 = stopWatch0.toString();
        java.lang.String str14 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long13 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long11 = stopWatch0.getTime();
        java.lang.String str12 = stopWatch0.toString();
        long long13 = stopWatch0.getTime();
        long long14 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.unsplit();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.stop();
        long long11 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toSplitString();
        long long10 = stopWatch0.getTime();
        stopWatch0.suspend();
        long long12 = stopWatch0.getTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        long long9 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky "17) test7156(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1790275768692L) + "'", long9 == (-1790275768692L));
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str11 = stopWatch0.toSplitString();
        java.lang.Class<?> wildcardClass12 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.stop();
        stopWatch0.reset();
        long long8 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.String str12 = stopWatch0.toSplitString();
        long long13 = stopWatch0.getTime();
        long long14 = stopWatch0.getSplitTime();
        java.lang.String str15 = stopWatch0.toString();
        long long16 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass18 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toSplitString();
        long long10 = stopWatch0.getTime();
        stopWatch0.split();
        long long12 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass13 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.split();
        stopWatch0.suspend();
        long long9 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long11 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        java.lang.String str5 = stopWatch0.toString();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long10 = stopWatch0.getTime();
        java.lang.String str11 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.resume();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.reset();
        long long13 = stopWatch0.getTime();
        stopWatch0.start();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        java.lang.String str11 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.split();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.stop();
        long long10 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky "2) test7175(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
// flaky "3) test7175(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long10 = stopWatch0.getSplitTime();
        stopWatch0.resume();
        stopWatch0.split();
        java.lang.String str13 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long11 = stopWatch0.getSplitTime();
        java.lang.String str12 = stopWatch0.toSplitString();
        long long13 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getTime();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        java.lang.String str11 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toString();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        stopWatch0.start();
        long long11 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.stop();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.stop();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        long long12 = stopWatch0.getTime();
        java.lang.String str13 = stopWatch0.toString();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        stopWatch0.resume();
        stopWatch0.stop();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str10 = stopWatch0.toString();
        java.lang.String str11 = stopWatch0.toString();
        java.lang.String str12 = stopWatch0.toSplitString();
        long long13 = stopWatch0.getSplitTime();
        long long14 = stopWatch0.getTime();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        long long9 = stopWatch0.getTime();
        long long10 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        java.lang.String str12 = stopWatch0.toSplitString();
        long long13 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.start();
        long long5 = stopWatch0.getTime();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long14 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "18) test7192(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-28.30" + "'", str12, "-497298:-49:-28.30");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long10 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.reset();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.stop();
        java.lang.String str10 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.stop();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        long long10 = stopWatch0.getTime();
        long long11 = stopWatch0.getSplitTime();
        java.lang.String str12 = stopWatch0.toString();
        stopWatch0.split();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long10 = stopWatch0.getTime();
        java.lang.String str11 = stopWatch0.toString();
        java.lang.String str12 = stopWatch0.toSplitString();
        long long13 = stopWatch0.getTime();
        stopWatch0.suspend();
        java.lang.String str15 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.stop();
        long long10 = stopWatch0.getSplitTime();
        long long11 = stopWatch0.getTime();
        long long12 = stopWatch0.getTime();
        java.lang.String str13 = stopWatch0.toString();
        long long14 = stopWatch0.getSplitTime();
        java.lang.String str15 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str11 = stopWatch0.toString();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toSplitString();
        stopWatch0.resume();
        stopWatch0.stop();
        long long16 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toString();
        java.lang.String str14 = stopWatch0.toString();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "19) test7202(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-28.79" + "'", str12, "-497298:-49:-28.79");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        stopWatch0.stop();
        stopWatch0.unsplit();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toString();
        java.lang.String str11 = stopWatch0.toSplitString();
        long long12 = stopWatch0.getTime();
        java.lang.String str13 = stopWatch0.toSplitString();
        long long14 = stopWatch0.getSplitTime();
        long long15 = stopWatch0.getSplitTime();
        java.lang.String str16 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.000" + "'", str16, "0:00:00.000");
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.Class<?> wildcardClass12 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        java.lang.String str8 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky "20) test7206(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-497298:-49:-28.59" + "'", str8, "-497298:-49:-28.59");
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.resume();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        long long10 = stopWatch0.getTime();
        stopWatch0.stop();
        long long12 = stopWatch0.getTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.reset();
        java.lang.String str8 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.reset();
        long long10 = stopWatch0.getTime();
        stopWatch0.reset();
        long long12 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str15 = stopWatch0.toSplitString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.stop();
        stopWatch0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        long long16 = stopWatch0.getSplitTime();
        long long17 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        long long19 = stopWatch0.getSplitTime();
        java.lang.String str20 = stopWatch0.toString();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "21) test7213(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-28.26" + "'", str12, "-497298:-49:-28.26");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0:00:00.000" + "'", str20, "0:00:00.000");
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        long long9 = stopWatch0.getTime();
        long long10 = stopWatch0.getSplitTime();
        java.lang.String str11 = stopWatch0.toSplitString();
        stopWatch0.split();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7217");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getTime();
        stopWatch0.start();
        long long8 = stopWatch0.getTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7218");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getSplitTime();
        java.lang.String str10 = stopWatch0.toSplitString();
        long long11 = stopWatch0.getSplitTime();
        java.lang.String str12 = stopWatch0.toString();
        long long13 = stopWatch0.getTime();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7219");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.String str10 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7220");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str11 = stopWatch0.toSplitString();
        long long12 = stopWatch0.getSplitTime();
        long long13 = stopWatch0.getSplitTime();
        java.lang.String str14 = stopWatch0.toSplitString();
        java.lang.String str15 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
    }

    @Test
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7221");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        long long10 = stopWatch0.getTime();
        java.lang.String str11 = stopWatch0.toSplitString();
        long long12 = stopWatch0.getSplitTime();
        long long13 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7222");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7223");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.String str12 = stopWatch0.toSplitString();
        long long13 = stopWatch0.getTime();
        long long14 = stopWatch0.getSplitTime();
        java.lang.String str15 = stopWatch0.toString();
        java.lang.String str16 = stopWatch0.toString();
        long long17 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.000" + "'", str16, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7224");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7225");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toString();
        long long11 = stopWatch0.getTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7226");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        long long8 = stopWatch0.getTime();
        stopWatch0.reset();
        long long10 = stopWatch0.getTime();
        long long11 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7227");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        stopWatch0.unsplit();
        long long12 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky "22) test7227(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1790275769044L) + "'", long12 == (-1790275769044L));
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7228");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.unsplit();
        java.lang.String str10 = stopWatch0.toString();
        java.lang.String str11 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky "23) test7228(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-497298:-49:-29.51" + "'", str10, "-497298:-49:-29.51");
// flaky "8) test7228(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-497298:-49:-29.51" + "'", str11, "-497298:-49:-29.51");
    }

    @Test
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7229");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.stop();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7230");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7231");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.stop();
        long long9 = stopWatch0.getTime();
        long long10 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7232");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.stop();
        long long10 = stopWatch0.getSplitTime();
        long long11 = stopWatch0.getTime();
        long long12 = stopWatch0.getTime();
        java.lang.String str13 = stopWatch0.toString();
        long long14 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        long long16 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7233");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.reset();
        java.lang.String str11 = stopWatch0.toString();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7234");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toSplitString();
        long long10 = stopWatch0.getTime();
        long long11 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        long long13 = stopWatch0.getSplitTime();
        long long14 = stopWatch0.getTime();
        java.lang.String str15 = stopWatch0.toSplitString();
        java.lang.Class<?> wildcardClass16 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7235");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str12 = stopWatch0.toSplitString();
        long long13 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7236");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        java.lang.String str1 = stopWatch0.toString();
        java.lang.String str2 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0:00:00.000" + "'", str1, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7237");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long11 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7238");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str11 = stopWatch0.toString();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toSplitString();
        java.lang.String str14 = stopWatch0.toSplitString();
        java.lang.String str15 = stopWatch0.toString();
        long long16 = stopWatch0.getSplitTime();
        java.lang.String str17 = stopWatch0.toString();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
// flaky "24) test7238(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.001" + "'", str11, "0:00:00.001");
// flaky "9) test7238(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.001" + "'", str12, "0:00:00.001");
// flaky "5) test7238(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.001" + "'", str13, "0:00:00.001");
// flaky "3) test7238(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.001" + "'", str14, "0:00:00.001");
// flaky "3) test7238(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.001" + "'", str15, "0:00:00.001");
// flaky "1) test7238(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
// flaky "1) test7238(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0:00:00.001" + "'", str17, "0:00:00.001");
    }

    @Test
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7239");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.String str10 = stopWatch0.toString();
        long long11 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7240");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long6 = stopWatch0.getTime();
        stopWatch0.start();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7241");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long11 = stopWatch0.getTime();
        long long12 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7242");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7243");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        long long16 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        long long18 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str20 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "25) test7243(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-29.77" + "'", str12, "-497298:-49:-29.77");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0:00:00.000" + "'", str20, "0:00:00.000");
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7244");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long11 = stopWatch0.getTime();
        stopWatch0.split();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7245");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        long long16 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str19 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "26) test7245(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-29.66" + "'", str12, "-497298:-49:-29.66");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0:00:00.000" + "'", str19, "0:00:00.000");
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7246");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7247");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass5 = stopWatch0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7248");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str11 = stopWatch0.toSplitString();
        long long12 = stopWatch0.getSplitTime();
        long long13 = stopWatch0.getSplitTime();
        long long14 = stopWatch0.getSplitTime();
        java.lang.String str15 = stopWatch0.toSplitString();
        java.lang.String str16 = stopWatch0.toSplitString();
        long long17 = stopWatch0.getTime();
        long long18 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.000" + "'", str16, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7249");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        long long10 = stopWatch0.getTime();
        java.lang.String str11 = stopWatch0.toSplitString();
        long long12 = stopWatch0.getSplitTime();
        long long13 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass14 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7250");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7251");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long9 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        long long11 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7252");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7253");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        stopWatch0.resume();
        stopWatch0.suspend();
        java.lang.String str11 = stopWatch0.toString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky "27) test7253(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-497298:-49:-29.25" + "'", str11, "-497298:-49:-29.25");
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7254");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.start();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7255");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7256");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long9 = stopWatch0.getTime();
        stopWatch0.split();
        java.lang.String str11 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7257");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long9 = stopWatch0.getTime();
        stopWatch0.resume();
        long long11 = stopWatch0.getTime();
        java.lang.String str12 = stopWatch0.toString();
        java.lang.String str13 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
// flaky "28) test7257(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-497298:-49:-29.07" + "'", str13, "-497298:-49:-29.07");
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7258");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
// flaky "29) test7258(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-497298:-49:-29.02" + "'", str8, "-497298:-49:-29.02");
    }

    @Test
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7259");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getSplitTime();
        long long10 = stopWatch0.getTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7260");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.reset();
        long long11 = stopWatch0.getTime();
        java.lang.String str12 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7261");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.stop();
        long long11 = stopWatch0.getTime();
        java.lang.String str12 = stopWatch0.toSplitString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7262");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.stop();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7263");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7264");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.stop();
        long long6 = stopWatch0.getSplitTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7265");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        stopWatch0.split();
        long long13 = stopWatch0.getTime();
        stopWatch0.reset();
        long long15 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7266");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.String str9 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7267");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toString();
        java.lang.String str11 = stopWatch0.toSplitString();
        java.lang.String str12 = stopWatch0.toString();
        stopWatch0.resume();
        java.lang.String str14 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky "4) test7267(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
    }

    @Test
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7268");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.resume();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7269");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.stop();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getTime();
        long long10 = stopWatch0.getSplitTime();
        long long11 = stopWatch0.getTime();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7270");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        long long8 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        long long11 = stopWatch0.getTime();
        long long12 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7271");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long9 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        java.lang.String str11 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
// flaky "30) test7271(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7272");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7273");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        stopWatch0.split();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7274");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.reset();
        long long11 = stopWatch0.getTime();
        stopWatch0.reset();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7275");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.stop();
        long long9 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7276");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        stopWatch0.resume();
        stopWatch0.suspend();
        java.lang.String str11 = stopWatch0.toString();
        long long12 = stopWatch0.getTime();
        long long13 = stopWatch0.getTime();
        stopWatch0.resume();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky "31) test7276(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-497298:-49:-29.14" + "'", str11, "-497298:-49:-29.14");
// flaky "10) test7276(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1790275769286L) + "'", long12 == (-1790275769286L));
// flaky "6) test7276(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1790275769286L) + "'", long13 == (-1790275769286L));
    }

    @Test
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7277");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7278");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        java.lang.String str10 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7279");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.stop();
        long long8 = stopWatch0.getSplitTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        long long10 = stopWatch0.getTime();
        long long11 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7280");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.String str10 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7281");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toString();
        long long7 = stopWatch0.getTime();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7282");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.stop();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7283");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long11 = stopWatch0.getSplitTime();
        stopWatch0.resume();
        long long13 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky "32) test7283(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1790275769320L) + "'", long13 == (-1790275769320L));
    }

    @Test
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7284");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        long long8 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.split();
        long long13 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        java.lang.String str15 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7285");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long11 = stopWatch0.getSplitTime();
        long long12 = stopWatch0.getSplitTime();
        stopWatch0.split();
        java.lang.String str14 = stopWatch0.toString();
        long long15 = stopWatch0.getTime();
        long long16 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7286");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.suspend();
        long long12 = stopWatch0.getTime();
        java.lang.String str13 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7287");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toString();
        java.lang.String str10 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
// flaky "33) test7287(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-497298:-49:-29.60" + "'", str10, "-497298:-49:-29.60");
    }

    @Test
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7288");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        long long10 = stopWatch0.getTime();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7289");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        long long11 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7290");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.stop();
        long long11 = stopWatch0.getTime();
        java.lang.String str12 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7291");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getSplitTime();
        long long10 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.split();
        long long13 = stopWatch0.getTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7292");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        java.lang.String str9 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7293");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str11 = stopWatch0.toString();
        java.lang.String str12 = stopWatch0.toString();
        long long13 = stopWatch0.getTime();
        stopWatch0.resume();
        stopWatch0.stop();
        java.lang.String str16 = stopWatch0.toString();
        java.lang.String str17 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.000" + "'", str16, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0:00:00.000" + "'", str17, "0:00:00.000");
    }

    @Test
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7294");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.split();
        java.lang.String str13 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7295");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        stopWatch0.stop();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7296");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.stop();
        java.lang.String str9 = stopWatch0.toSplitString();
        long long10 = stopWatch0.getTime();
        java.lang.String str11 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7297");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getSplitTime();
        long long10 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7298");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7299");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.reset();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7300");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str16 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "34) test7300(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-29.95" + "'", str12, "-497298:-49:-29.95");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.000" + "'", str16, "0:00:00.000");
    }

    @Test
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7301");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.stop();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7302");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        long long8 = stopWatch0.getTime();
        stopWatch0.reset();
        long long10 = stopWatch0.getTime();
        long long11 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.String str13 = stopWatch0.toString();
        stopWatch0.reset();
        long long15 = stopWatch0.getTime();
        long long16 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7303");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.split();
        stopWatch0.reset();
    }

    @Test
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7304");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        long long16 = stopWatch0.getSplitTime();
        long long17 = stopWatch0.getSplitTime();
        java.lang.String str18 = stopWatch0.toSplitString();
        java.lang.String str19 = stopWatch0.toString();
        stopWatch0.split();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "35) test7304(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-29.75" + "'", str12, "-497298:-49:-29.75");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0:00:00.000" + "'", str18, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0:00:00.000" + "'", str19, "0:00:00.000");
    }

    @Test
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7305");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.resume();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7306");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7307");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        long long16 = stopWatch0.getSplitTime();
        long long17 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        stopWatch0.reset();
        long long20 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "36) test7307(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-29.61" + "'", str12, "-497298:-49:-29.61");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test7308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7308");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str11 = stopWatch0.toString();
        long long12 = stopWatch0.getSplitTime();
        stopWatch0.resume();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test7309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7309");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getTime();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        long long10 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7310");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        stopWatch0.resume();
        stopWatch0.suspend();
        java.lang.String str11 = stopWatch0.toString();
        stopWatch0.stop();
        long long13 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky "37) test7310(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-497298:-49:-29.46" + "'", str11, "-497298:-49:-29.46");
// flaky "11) test7310(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1790275769454L) + "'", long13 == (-1790275769454L));
    }

    @Test
    public void test7311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7311");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        stopWatch0.stop();
        long long11 = stopWatch0.getTime();
        long long12 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test7312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7312");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.unsplit();
        java.lang.String str11 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7313");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.reset();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
    }

    @Test
    public void test7314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7314");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long10 = stopWatch0.getSplitTime();
        long long11 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7315");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test7316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7316");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test7317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7317");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long13 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass17 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7318");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.reset();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test7319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7319");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        long long16 = stopWatch0.getSplitTime();
        stopWatch0.split();
        stopWatch0.split();
        long long19 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "38) test7319(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-29.03" + "'", str12, "-497298:-49:-29.03");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test7320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7320");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        long long8 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7321");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.suspend();
        long long11 = stopWatch0.getTime();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7322");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.String str11 = stopWatch0.toString();
        long long12 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test7323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7323");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.start();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test7324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7324");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.stop();
        stopWatch0.reset();
        long long8 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        long long11 = stopWatch0.getSplitTime();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test7325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7325");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.unsplit();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.unsplit();
        long long10 = stopWatch0.getTime();
        stopWatch0.stop();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7326");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.String str13 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.reset();
        stopWatch0.start();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "39) test7326(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-29.69" + "'", str12, "-497298:-49:-29.69");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test7327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7327");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long9 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str12 = stopWatch0.toString();
        long long13 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test7328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7328");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long9 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test7329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7329");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.reset();
        long long9 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test7330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7330");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        java.lang.String str9 = stopWatch0.toString();
        java.lang.String str10 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7331");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test7332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7332");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        long long5 = stopWatch0.getSplitTime();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7333");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.unsplit();
        java.lang.String str15 = stopWatch0.toString();
        long long16 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test7334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7334");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.reset();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7335");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long10 = stopWatch0.getTime();
        java.lang.String str11 = stopWatch0.toSplitString();
        stopWatch0.stop();
        stopWatch0.unsplit();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7336");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str11 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7337");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toString();
        java.lang.String str10 = stopWatch0.toString();
        java.lang.String str11 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test7338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7338");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        long long14 = stopWatch0.getSplitTime();
        long long15 = stopWatch0.getSplitTime();
        long long16 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "40) test7338(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-29.10" + "'", str12, "-497298:-49:-29.10");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test7339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7339");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str11 = stopWatch0.toSplitString();
        long long12 = stopWatch0.getSplitTime();
        long long13 = stopWatch0.getSplitTime();
        java.lang.String str14 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        long long16 = stopWatch0.getTime();
        long long17 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
// flaky "41) test7339(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1790275769595L) + "'", long16 == (-1790275769595L));
// flaky "12) test7339(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1790275769595L) + "'", long17 == (-1790275769595L));
    }

    @Test
    public void test7340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7340");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        long long11 = stopWatch0.getTime();
        java.lang.String str12 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test7341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7341");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.stop();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7342");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        long long8 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        long long14 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test7343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7343");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.String str12 = stopWatch0.toSplitString();
        long long13 = stopWatch0.getTime();
        long long14 = stopWatch0.getTime();
        long long15 = stopWatch0.getTime();
        long long16 = stopWatch0.getSplitTime();
        java.lang.String str17 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0:00:00.000" + "'", str17, "0:00:00.000");
    }

    @Test
    public void test7344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7344");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.reset();
        java.lang.String str13 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test7345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7345");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.split();
        long long11 = stopWatch0.getSplitTime();
        long long12 = stopWatch0.getSplitTime();
        java.lang.String str13 = stopWatch0.toString();
        java.lang.String str14 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.stop();
        long long17 = stopWatch0.getSplitTime();
        long long18 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test7346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7346");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        long long10 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test7347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7347");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.reset();
        long long6 = stopWatch0.getTime();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test7348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7348");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        long long8 = stopWatch0.getTime();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        stopWatch0.resume();
        long long13 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
// flaky "42) test7348(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1790275769640L) + "'", long13 == (-1790275769640L));
    }

    @Test
    public void test7349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7349");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.Class<?> wildcardClass13 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7350");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toString();
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.String str13 = stopWatch0.toString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
// flaky "4) test7350(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test7351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7351");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.stop();
        java.lang.String str10 = stopWatch0.toSplitString();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test7352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7352");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        long long11 = stopWatch0.getSplitTime();
        java.lang.String str12 = stopWatch0.toString();
        stopWatch0.resume();
        stopWatch0.unsplit();
        stopWatch0.split();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test7353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7353");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        java.lang.String str9 = stopWatch0.toSplitString();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.resume();
        java.lang.String str12 = stopWatch0.toSplitString();
        stopWatch0.split();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "43) test7353(org.apache.commons.lang.time.RegressionTest14)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-49:-29.35" + "'", str12, "-497298:-49:-29.35");
    }
}
