package org.apache.commons.lang.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.split();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        long long7 = stopWatch0.getTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
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
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.unsplit();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str8 = stopWatch0.toString();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        stopWatch0.unsplit();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
        stopWatch0.start();
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        long long16 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "1) test1511(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-47.99" + "'", str12, "-497298:-48:-47.99");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.stop();
        long long9 = stopWatch0.getTime();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.reset();
        long long12 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.resume();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        java.lang.String str10 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "2) test1517(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-47.36" + "'", str12, "-497298:-48:-47.36");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "3) test1519(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-47.10" + "'", str12, "-497298:-48:-47.10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        long long3 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        java.lang.String str13 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass14 = stopWatch0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        long long11 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.reset();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.start();
        java.lang.String str10 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        stopWatch0.reset();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.stop();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        stopWatch0.unsplit();
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
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        long long12 = stopWatch0.getTime();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.resume();
        stopWatch0.stop();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        stopWatch0.stop();
        java.lang.String str11 = stopWatch0.toSplitString();
        long long12 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.stop();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        stopWatch0.unsplit();
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        long long4 = stopWatch0.getTime();
        long long5 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
// flaky "4) test1544(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-47.05" + "'", str12, "-497298:-48:-47.05");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.000" + "'", str16, "0:00:00.000");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        stopWatch0.unsplit();
        java.lang.Class<?> wildcardClass13 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        long long14 = stopWatch0.getTime();
        stopWatch0.split();
        java.lang.Class<?> wildcardClass16 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
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
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        java.lang.String str11 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        stopWatch0.unsplit();
        long long13 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.stop();
        stopWatch0.unsplit();
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
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.stop();
        long long6 = stopWatch0.getSplitTime();
        java.lang.String str7 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
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
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        stopWatch0.unsplit();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.suspend();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.stop();
        java.lang.String str9 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.stop();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.stop();
        long long10 = stopWatch0.getSplitTime();
        java.lang.String str11 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        long long10 = stopWatch0.getTime();
        java.lang.String str11 = stopWatch0.toString();
        java.lang.String str12 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass15 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toSplitString();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        stopWatch0.split();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.suspend();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        long long12 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.String str7 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.reset();
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long9 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.suspend();
        long long10 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        long long10 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        stopWatch0.unsplit();
        stopWatch0.suspend();
        long long16 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass17 = stopWatch0.getClass();
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        java.lang.String str12 = stopWatch0.toString();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.suspend();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.reset();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.start();
        long long8 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        stopWatch0.suspend();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        stopWatch0.reset();
        java.lang.String str14 = stopWatch0.toString();
        stopWatch0.start();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.suspend();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        long long9 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.reset();
        long long9 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        java.lang.String str6 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.reset();
        java.lang.String str9 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.suspend();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
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
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.reset();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        stopWatch0.start();
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        java.lang.String str11 = stopWatch0.toString();
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
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        stopWatch0.reset();
        java.lang.String str9 = stopWatch0.toString();
        java.lang.String str10 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long11 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky "5) test1619(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1790275728406L) + "'", long11 == (-1790275728406L));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        long long5 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        stopWatch0.unsplit();
        stopWatch0.suspend();
        java.lang.Class<?> wildcardClass12 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        stopWatch0.unsplit();
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
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = stopWatch0.toSplitString();
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
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky "6) test1626(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-497298:-48:-48.23" + "'", str11, "-497298:-48:-48.23");
// flaky "1) test1626(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1790275728477L) + "'", long13 == (-1790275728477L));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        java.lang.String str11 = stopWatch0.toString();
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
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        long long10 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        long long10 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        long long3 = stopWatch0.getTime();
        java.lang.String str4 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass12 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
// flaky "7) test1633(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        long long10 = stopWatch0.getTime();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        stopWatch0.unsplit();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass13 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        stopWatch0.resume();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        java.lang.String str7 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        stopWatch0.start();
        stopWatch0.suspend();
        java.lang.String str13 = stopWatch0.toString();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass12 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "8) test1642(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-48.99" + "'", str12, "-497298:-48:-48.99");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.stop();
        long long10 = stopWatch0.getTime();
        stopWatch0.reset();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        long long10 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        java.lang.String str6 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
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
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        stopWatch0.resume();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long9 = stopWatch0.getSplitTime();
        java.lang.String str10 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        long long3 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        java.lang.String str13 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        stopWatch0.stop();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.reset();
        java.lang.String str9 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        stopWatch0.resume();
        stopWatch0.unsplit();
        long long13 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "9) test1666(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-48.07" + "'", str12, "-497298:-48:-48.07");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.000" + "'", str16, "0:00:00.000");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "10) test1668(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-48.74" + "'", str12, "-497298:-48:-48.74");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        java.lang.String str5 = stopWatch0.toString();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.split();
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
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str5 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
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
        long long10 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        stopWatch0.resume();
        stopWatch0.unsplit();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.String str5 = stopWatch0.toString();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        stopWatch0.unsplit();
        stopWatch0.stop();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        long long13 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        java.lang.String str8 = stopWatch0.toString();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getTime();
        long long5 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        java.lang.Class<?> wildcardClass12 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = stopWatch0.toSplitString();
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
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        stopWatch0.suspend();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "11) test1695(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-49.51" + "'", str12, "-497298:-48:-49.51");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
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
        java.lang.Class<?> wildcardClass12 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        java.lang.String str12 = stopWatch0.toString();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        stopWatch0.reset();
        java.lang.String str12 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass13 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.unsplit();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.stop();
        long long10 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.String str12 = stopWatch0.toString();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toString();
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
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        long long15 = stopWatch0.getTime();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "12) test1708(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-49.30" + "'", str12, "-497298:-48:-49.30");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        stopWatch0.unsplit();
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.stop();
        long long10 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        long long10 = stopWatch0.getTime();
        java.lang.String str11 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        java.lang.String str12 = stopWatch0.toSplitString();
        java.lang.Class<?> wildcardClass13 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.suspend();
        long long10 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.String str6 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.reset();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toString();
        long long10 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
// flaky "13) test1725(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-49.95" + "'", str12, "-497298:-48:-49.95");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str9 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass18 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "14) test1729(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-49.70" + "'", str12, "-497298:-48:-49.70");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.000" + "'", str16, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        java.lang.String str11 = stopWatch0.toString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        java.lang.String str11 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.reset();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.resume();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.reset();
        java.lang.String str8 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        java.lang.Class<?> wildcardClass15 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "15) test1738(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-49.05" + "'", str12, "-497298:-48:-49.05");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        long long12 = stopWatch0.getTime();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
        stopWatch0.stop();
        stopWatch0.unsplit();
        long long13 = stopWatch0.getTime();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "16) test1740(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1790275729520L) + "'", long13 == (-1790275729520L));
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
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
        long long10 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        long long12 = stopWatch0.getSplitTime();
        stopWatch0.reset();
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.start();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        stopWatch0.unsplit();
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
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
// flaky "17) test1747(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-49.30" + "'", str12, "-497298:-48:-49.30");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        long long8 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        long long9 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.resume();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        stopWatch0.split();
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        java.lang.String str8 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        stopWatch0.resume();
        stopWatch0.unsplit();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        java.lang.Class<?> wildcardClass14 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
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
        java.lang.String str12 = stopWatch0.toString();
        long long13 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.stop();
        java.lang.String str5 = stopWatch0.toString();
        java.lang.String str6 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.reset();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
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
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        long long11 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
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
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getTime();
        stopWatch0.unsplit();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.reset();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toString();
        long long10 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.reset();
        long long6 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky "18) test1777(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-497298:-48:-49.16" + "'", str11, "-497298:-48:-49.16");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.String str7 = stopWatch0.toString();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.start();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        long long11 = stopWatch0.getSplitTime();
        java.lang.String str12 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
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
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.suspend();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        long long12 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        stopWatch0.suspend();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.split();
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
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long8 = stopWatch0.getTime();
        stopWatch0.unsplit();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.String str5 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.String str4 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.Class<?> wildcardClass8 = stopWatch0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        java.lang.String str11 = stopWatch0.toString();
        java.lang.String str12 = stopWatch0.toString();
        java.lang.String str13 = stopWatch0.toString();
        java.lang.String str14 = stopWatch0.toString();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        java.lang.String str11 = stopWatch0.toString();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.unsplit();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.String str7 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.String str6 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
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
        stopWatch0.unsplit();
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
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
        long long12 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        stopWatch0.reset();
        java.lang.String str9 = stopWatch0.toString();
        java.lang.String str10 = stopWatch0.toString();
        long long11 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        long long11 = stopWatch0.getTime();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        stopWatch0.suspend();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        java.lang.Class<?> wildcardClass20 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "19) test1821(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-50.07" + "'", str12, "-497298:-48:-50.07");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.String str9 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.stop();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        long long10 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
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
        java.lang.String str10 = stopWatch0.toString();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass12 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long8 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
        stopWatch0.unsplit();
        java.lang.Class<?> wildcardClass15 = stopWatch0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
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
        java.lang.String str13 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        stopWatch0.split();
        java.lang.Class<?> wildcardClass15 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        long long8 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
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
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.String str7 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        long long5 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.stop();
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
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
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
        java.lang.Class<?> wildcardClass13 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.reset();
        java.lang.String str6 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.split();
        long long9 = stopWatch0.getSplitTime();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = stopWatch0.toSplitString();
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
// flaky "20) test1840(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-50.06" + "'", str12, "-497298:-48:-50.06");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.000" + "'", str16, "0:00:00.000");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        long long10 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
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
        long long13 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass14 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.reset();
        java.lang.String str10 = stopWatch0.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
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
        stopWatch0.reset();
        java.lang.String str14 = stopWatch0.toString();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        long long3 = stopWatch0.getTime();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        long long4 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass5 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.start();
        long long9 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass12 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
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
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
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
        stopWatch0.split();
        long long12 = stopWatch0.getTime();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        long long12 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
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
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
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
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
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
        long long12 = stopWatch0.getTime();
        long long13 = stopWatch0.getTime();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.reset();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
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
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
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
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
            java.lang.String str14 = stopWatch0.toSplitString();
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
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        long long3 = stopWatch0.getTime();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
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
        // The following exception was thrown during execution in test generation
        try {
            long long10 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
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
        stopWatch0.stop();
        java.lang.String str11 = stopWatch0.toSplitString();
        long long12 = stopWatch0.getSplitTime();
        java.lang.String str13 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        java.lang.String str15 = stopWatch0.toString();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
// flaky "21) test1869(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-497298:-48:-50.17" + "'", str15, "-497298:-48:-50.17");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
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
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
        long long10 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
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
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        stopWatch0.suspend();
        stopWatch0.unsplit();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
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
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        stopWatch0.start();
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
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
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
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        long long16 = stopWatch0.getTime();
        stopWatch0.suspend();
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
// flaky "22) test1880(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-50.37" + "'", str12, "-497298:-48:-50.37");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
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
        stopWatch0.start();
        stopWatch0.suspend();
        java.lang.String str13 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass14 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
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
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
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
        java.lang.String str10 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        java.lang.String str8 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
// flaky "23) test1885(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-497298:-48:-50.78" + "'", str8, "-497298:-48:-50.78");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.reset();
        java.lang.String str10 = stopWatch0.toString();
        long long11 = stopWatch0.getTime();
        java.lang.Class<?> wildcardClass12 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        long long9 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        stopWatch0.resume();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.reset();
        stopWatch0.reset();
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
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
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
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.reset();
        java.lang.String str6 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass7 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        stopWatch0.stop();
        long long7 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.split();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        stopWatch0.reset();
        java.lang.String str12 = stopWatch0.toString();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getTime();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str8 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.split();
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        long long6 = stopWatch0.getTime();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getTime();
        stopWatch0.split();
        long long10 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long10 = stopWatch0.getTime();
        stopWatch0.split();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        long long9 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        long long7 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long9 = stopWatch0.getSplitTime();
        long long10 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        java.lang.String str9 = stopWatch0.toString();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long4 = stopWatch0.getSplitTime();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.suspend();
        stopWatch0.resume();
        java.lang.String str8 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        java.lang.String str11 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        long long10 = stopWatch0.getSplitTime();
        long long11 = stopWatch0.getTime();
        stopWatch0.reset();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
        stopWatch0.stop();
        java.lang.String str11 = stopWatch0.toString();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toSplitString();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.suspend();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
// flaky "24) test1916(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-51.34" + "'", str12, "-497298:-48:-51.34");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.000" + "'", str16, "0:00:00.000");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.String str5 = stopWatch0.toString();
        java.lang.String str6 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
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
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.resume();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
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
        long long10 = stopWatch0.getSplitTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
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
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.stop();
        long long10 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toSplitString();
        long long8 = stopWatch0.getSplitTime();
        long long9 = stopWatch0.getSplitTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str9 = stopWatch0.toSplitString();
        stopWatch0.stop();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long8 = stopWatch0.getTime();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        stopWatch0.split();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        java.lang.String str8 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
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
        java.lang.String str15 = stopWatch0.toString();
        stopWatch0.stop();
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
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
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str12 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        java.lang.String str10 = stopWatch0.toString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        long long2 = stopWatch0.getTime();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.start();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.split();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
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
        long long14 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        java.lang.String str8 = stopWatch0.toString();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.start();
        long long2 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            long long3 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        java.lang.String str13 = stopWatch0.toString();
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        java.lang.String str13 = stopWatch0.toString();
        java.lang.String str14 = stopWatch0.toString();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getTime();
        stopWatch0.split();
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
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
// flaky "25) test1941(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-497298:-48:-51.08" + "'", str10, "-497298:-48:-51.08");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
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
        java.lang.String str11 = stopWatch0.toString();
        long long12 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.unsplit();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
        stopWatch0.suspend();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.split();
        long long7 = stopWatch0.getSplitTime();
        java.lang.String str8 = stopWatch0.toSplitString();
        stopWatch0.suspend();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.resume();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be suspended to resume. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        long long11 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "26) test1947(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-51.72" + "'", str12, "-497298:-48:-51.72");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.000" + "'", str16, "0:00:00.000");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
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
        java.lang.Class<?> wildcardClass11 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
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
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        java.lang.String str10 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.unsplit();
        java.lang.Class<?> wildcardClass6 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.resume();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
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
        java.lang.Class<?> wildcardClass12 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        stopWatch0.reset();
        stopWatch0.start();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.suspend();
        java.lang.String str8 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.suspend();
        long long9 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        long long4 = stopWatch0.getTime();
        stopWatch0.split();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.suspend();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be running to suspend. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.stop();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
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
        stopWatch0.split();
        long long13 = stopWatch0.getSplitTime();
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
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
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.stop();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        java.lang.String str7 = stopWatch0.toString();
        stopWatch0.start();
        stopWatch0.suspend();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.split();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
        stopWatch0.split();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        long long6 = stopWatch0.getTime();
        stopWatch0.unsplit();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.Class<?> wildcardClass10 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.suspend();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        long long5 = stopWatch0.getTime();
        java.lang.String str6 = stopWatch0.toSplitString();
        java.lang.String str7 = stopWatch0.toString();
        long long8 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        stopWatch0.suspend();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
// flaky "27) test1974(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-51.99" + "'", str12, "-497298:-48:-51.99");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
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
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toSplitString();
        long long7 = stopWatch0.getTime();
        java.lang.String str8 = stopWatch0.toString();
        long long9 = stopWatch0.getTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long5 = stopWatch0.getSplitTime();
        stopWatch0.unsplit();
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.Class<?> wildcardClass9 = stopWatch0.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        long long1 = stopWatch0.getTime();
        java.lang.String str2 = stopWatch0.toString();
        java.lang.String str3 = stopWatch0.toString();
        long long4 = stopWatch0.getTime();
        stopWatch0.start();
        stopWatch0.reset();
        long long7 = stopWatch0.getTime();
        stopWatch0.reset();
        long long9 = stopWatch0.getTime();
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
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
// flaky "28) test1979(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-497298:-48:-51.50" + "'", str12, "-497298:-48:-51.50");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
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
        long long12 = stopWatch0.getSplitTime();
        stopWatch0.reset();
        long long14 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.stop();
        java.lang.String str6 = stopWatch0.toSplitString();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        java.lang.String str4 = stopWatch0.toString();
        java.lang.Class<?> wildcardClass5 = stopWatch0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
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
        long long12 = stopWatch0.getTime();
        java.lang.String str13 = stopWatch0.toString();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        stopWatch0.suspend();
        java.lang.String str6 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.000" + "'", str6, "0:00:00.000");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        stopWatch0.reset();
        stopWatch0.reset();
        java.lang.String str14 = stopWatch0.toString();
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        java.lang.String str4 = stopWatch0.toString();
        stopWatch0.unsplit();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = stopWatch0.getSplitTime();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0:00:00.000" + "'", str4, "0:00:00.000");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        java.lang.String str13 = stopWatch0.toSplitString();
        stopWatch0.unsplit();
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
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
        long long12 = stopWatch0.getTime();
        java.lang.String str13 = stopWatch0.toString();
        long long14 = stopWatch0.getTime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.000" + "'", str2, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0:00:00.000" + "'", str8, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.000" + "'", str13, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0:00:00.000" + "'", str7, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.suspend();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.stop();
        stopWatch0.reset();
        long long8 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = stopWatch0.toSplitString();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be split to get the split time. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
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
        java.lang.String str10 = stopWatch0.toSplitString();
        stopWatch0.split();
        java.lang.String str12 = stopWatch0.toSplitString();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.000" + "'", str9, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0:00:00.000" + "'", str10, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0:00:00.000" + "'", str12, "0:00:00.000");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.reset();
        stopWatch0.start();
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
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.split();
        stopWatch0.suspend();
        long long6 = stopWatch0.getTime();
        long long7 = stopWatch0.getTime();
        long long8 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch already started. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
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
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.unsplit();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch has not been split. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0:00:00.000" + "'", str14, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.000" + "'", str15, "0:00:00.000");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0:00:00.000" + "'", str11, "0:00:00.000");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.reset();
        stopWatch0.start();
        stopWatch0.split();
        stopWatch0.split();
        long long6 = stopWatch0.getSplitTime();
        stopWatch0.stop();
        long long8 = stopWatch0.getTime();
        long long9 = stopWatch0.getTime();
        stopWatch0.unsplit();
        long long11 = stopWatch0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.start();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch must be reset before being restarted. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky "29) test1999(org.apache.commons.lang.time.RegressionTest3)":         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1790275731922L) + "'", long11 == (-1790275731922L));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        org.apache.commons.lang.time.StopWatch stopWatch0 = new org.apache.commons.lang.time.StopWatch();
        stopWatch0.reset();
        stopWatch0.start();
        java.lang.String str3 = stopWatch0.toString();
        stopWatch0.suspend();
        java.lang.String str5 = stopWatch0.toString();
        stopWatch0.stop();
        stopWatch0.reset();
        // The following exception was thrown during execution in test generation
        try {
            stopWatch0.stop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Stopwatch is not running. ");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }
}
