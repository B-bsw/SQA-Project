package org.joda.time.chrono;

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
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.joda.time.chrono.BasicChronology basicChronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.BasicMonthOfYearDateTimeField basicMonthOfYearDateTimeField2 = new org.joda.time.chrono.BasicMonthOfYearDateTimeField(basicChronology0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

