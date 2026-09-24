package org.apache.commons.lang3.time;

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
        int int0 = org.apache.commons.lang3.time.FastDatePrinter.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int0 = org.apache.commons.lang3.time.FastDatePrinter.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        int int0 = org.apache.commons.lang3.time.FastDatePrinter.MEDIUM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDatePrinter fastDatePrinter3 = new org.apache.commons.lang3.time.FastDatePrinter("hi!", timeZone1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, (-1), locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.util.TimeZone timeZone1 = null;
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.time.FastDatePrinter fastDatePrinter3 = new org.apache.commons.lang3.time.FastDatePrinter("", timeZone1, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int0 = org.apache.commons.lang3.time.FastDatePrinter.FULL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, 10, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, (int) (byte) 10, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, 100, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, (int) (short) 10, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, (int) '4', locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, 0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, (int) '4', locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, (int) (short) 100, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, (int) ' ', locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, (int) 'a', locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, (int) (short) 0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, 0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, (int) (byte) 1, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, (int) 'a', locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, (int) (short) -1, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, 3, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, (int) (byte) 1, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, (int) '#', locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, 1, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, 3, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, (int) (short) 1, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, (int) (byte) 100, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, (int) (short) 100, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, (int) (short) 10, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, (-1), locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, 10, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, 1, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, 2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, (int) (short) 1, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, (int) ' ', locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, 2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, (int) (short) -1, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, 100, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, (int) (byte) -1, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, (int) (short) 0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, (int) (byte) 10, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, (int) (byte) 0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, (int) (byte) -1, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, (int) (byte) 100, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, true, (int) (byte) 0, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(timeZone0, false, (int) '#', locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

