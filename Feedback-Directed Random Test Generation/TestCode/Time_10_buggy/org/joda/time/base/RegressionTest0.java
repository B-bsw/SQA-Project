package org.joda.time.base;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.base.BaseSingleFieldPeriod.between(readablePartial0, readablePartial1, readablePeriod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.DurationFieldType durationFieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.joda.time.base.BaseSingleFieldPeriod.between(readableInstant0, readableInstant1, durationFieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadableInstant objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, (long) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        int int2 = org.joda.time.base.BaseSingleFieldPeriod.standardPeriodIn(readablePeriod0, 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}

