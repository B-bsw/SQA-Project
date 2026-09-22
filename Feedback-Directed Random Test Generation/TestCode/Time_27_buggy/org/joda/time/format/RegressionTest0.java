package org.joda.time.format;

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
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix0 = null;
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix1 = null;
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix2 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix(periodFieldAffix0, periodFieldAffix1);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compositeAffix2.printTo(stringBuffer3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix0 = null;
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix1 = null;
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix2 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix(periodFieldAffix0, periodFieldAffix1);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            compositeAffix2.printTo(stringBuffer3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix7 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        java.lang.Object[] objArray15 = new java.lang.Object[] { 0.0d, '#', "hi!", (-1.0d), (short) 10, 1.0f, "", 1L, 10.0d, "hi!", "", (byte) 0, (-1.0d), (short) 100 };
        java.util.ArrayList<java.lang.Object> objList16 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList16, objArray15);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite18 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList16);
        org.joda.time.ReadWritablePeriod readWritablePeriod19 = null;
        java.util.Locale locale22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = composite18.parseInto(readWritablePeriod19, "hi!", 0, locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0, #, hi!, -1.0, 10, 1.0, , 1, 10.0, hi!, , 0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0, #, hi!, -1.0, 10, 1.0, , 1, 10.0, hi!, , 0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix1 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix3 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix4 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix1, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix3);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleAffix1.printTo(writer5, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix0 = null;
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix1 = null;
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix2 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix(periodFieldAffix0, periodFieldAffix1);
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix4 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix5 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = compositeAffix5.scan("", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix7 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        java.lang.Object[] objArray15 = new java.lang.Object[] { 0.0d, '#', "hi!", (-1.0d), (short) 10, 1.0f, "", 1L, 10.0d, "hi!", "", (byte) 0, (-1.0d), (short) 100 };
        java.util.ArrayList<java.lang.Object> objList16 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList16, objArray15);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite18 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList16);
        java.io.Writer writer19 = null;
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        java.util.Locale locale21 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite18.printTo(writer19, readablePeriod20, locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[0.0, #, hi!, -1.0, 10, 1.0, , 1, 10.0, hi!, , 0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[0.0, #, hi!, -1.0, 10, 1.0, , 1, 10.0, hi!, , 0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix0 = null;
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix1 = null;
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix2 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix(periodFieldAffix0, periodFieldAffix1);
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix4 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix5 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = compositeAffix2.scan("", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroIfSupported();
        org.joda.time.format.PeriodParser periodParser2 = periodFormatterBuilder1.toParser();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodParser2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix0 = null;
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix1 = null;
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix2 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix(periodFieldAffix0, periodFieldAffix1);
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix4 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix5 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = compositeAffix2.scan("", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix0 = null;
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix1 = null;
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix2 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix(periodFieldAffix0, periodFieldAffix1);
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix4 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix5 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix4);
        int int7 = simpleAffix4.calculatePrintedLength((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder0.appendPrefix("hi!", "");
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder0.appendSeparator("hi!", "hi!", strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Prefix not followed by field");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "" });
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder0.appendPrefix("hi!", "");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder0.appendWeeks();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder5.appendPrefix("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder7.appendPrefix("");
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder0.appendPrefix("hi!", "");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder0.appendWeeks();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder5.appendPrefix("");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder10 = periodFormatterBuilder5.appendSeparator("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Prefix not followed by field");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder1.appendYears();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder2.appendSecondsWithOptionalMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendHours();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.joda.time.format.PeriodFormatterBuilder.PluralAffix pluralAffix2 = new org.joda.time.format.PeriodFormatterBuilder.PluralAffix("hi!", "hi!");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix12 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        java.lang.Object[] objArray20 = new java.lang.Object[] { 0.0d, '#', "hi!", (-1.0d), (short) 10, 1.0f, "", 1L, 10.0d, "hi!", "", (byte) 0, (-1.0d), (short) 100 };
        java.util.ArrayList<java.lang.Object> objList21 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList21, objArray20);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite23 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList21);
        org.joda.time.format.PeriodFormatterBuilder.Literal literal24 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder.Separator separator27 = new org.joda.time.format.PeriodFormatterBuilder.Separator("", "", strArray4, (org.joda.time.format.PeriodPrinter) composite23, (org.joda.time.format.PeriodParser) literal24, false, false);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        java.util.Locale locale29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = separator27.calculatePrintedLength(readablePeriod28, locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0, #, hi!, -1.0, 10, 1.0, , 1, 10.0, hi!, , 0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0, #, hi!, -1.0, 10, 1.0, , 1, 10.0, hi!, , 0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(literal24);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder1.appendYears();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder1.appendSuffix("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder6 = periodFormatterBuilder1.appendSeparatorIfFieldsAfter("");
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix1 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix3 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix4 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix1, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix3);
        int int7 = compositeAffix4.scan("hi!", 0);
        int int10 = compositeAffix4.parse("", 10);
        int int13 = compositeAffix4.parse("hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-11) + "'", int10 == (-11));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix12 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        java.lang.Object[] objArray20 = new java.lang.Object[] { 0.0d, '#', "hi!", (-1.0d), (short) 10, 1.0f, "", 1L, 10.0d, "hi!", "", (byte) 0, (-1.0d), (short) 100 };
        java.util.ArrayList<java.lang.Object> objList21 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList21, objArray20);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite23 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList21);
        org.joda.time.format.PeriodFormatterBuilder.Literal literal24 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder.Separator separator27 = new org.joda.time.format.PeriodFormatterBuilder.Separator("", "", strArray4, (org.joda.time.format.PeriodPrinter) composite23, (org.joda.time.format.PeriodParser) literal24, false, false);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        java.util.Locale locale30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = separator27.countFieldsToPrint(readablePeriod28, (int) (byte) 1, locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0, #, hi!, -1.0, 10, 1.0, , 1, 10.0, hi!, , 0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0, #, hi!, -1.0, 10, 1.0, , 1, 10.0, hi!, , 0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(literal24);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix0 = null;
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix1 = null;
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix2 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix(periodFieldAffix0, periodFieldAffix1);
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix4 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix5 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix4);
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix7 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix9 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix10 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix7, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix9);
        int int13 = compositeAffix10.scan("hi!", 0);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix14 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix5, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix10);
        java.io.Writer writer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compositeAffix14.printTo(writer15, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroIfSupported();
        org.joda.time.format.PeriodPrinter periodPrinter2 = periodFormatterBuilder1.toPrinter();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodPrinter2);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroIfSupported();
        org.joda.time.format.PeriodFormatter periodFormatter2 = periodFormatterBuilder0.toFormatter();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatter2);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.joda.time.format.PeriodFormatterBuilder.FieldFormatter fieldFormatter0 = null;
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.PeriodFormatterBuilder.FieldFormatter fieldFormatter2 = new org.joda.time.format.PeriodFormatterBuilder.FieldFormatter(fieldFormatter0, periodFieldAffix1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix0 = null;
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix1 = null;
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix2 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix(periodFieldAffix0, periodFieldAffix1);
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix4 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix5 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix4);
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix7 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix9 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix10 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix7, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix9);
        int int13 = compositeAffix10.scan("hi!", 0);
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix14 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix5, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix10);
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compositeAffix5.printTo(stringBuffer15, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder0.appendPrefix("hi!", "");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder0.appendWeeks();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix18 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        java.lang.Object[] objArray26 = new java.lang.Object[] { 0.0d, '#', "hi!", (-1.0d), (short) 10, 1.0f, "", 1L, 10.0d, "hi!", "", (byte) 0, (-1.0d), (short) 100 };
        java.util.ArrayList<java.lang.Object> objList27 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList27, objArray26);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite29 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList27);
        org.joda.time.format.PeriodFormatterBuilder.Literal literal30 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder.Separator separator33 = new org.joda.time.format.PeriodFormatterBuilder.Separator("", "", strArray10, (org.joda.time.format.PeriodPrinter) composite29, (org.joda.time.format.PeriodParser) literal30, false, false);
        org.joda.time.format.PeriodFormatterBuilder.Literal literal34 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder35 = periodFormatterBuilder5.append((org.joda.time.format.PeriodPrinter) composite29, (org.joda.time.format.PeriodParser) literal34);
        java.io.Writer writer36 = null;
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        java.util.Locale locale38 = null;
        // The following exception was thrown during execution in test generation
        try {
            literal34.printTo(writer36, readablePeriod37, locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[0.0, #, hi!, -1.0, 10, 1.0, , 1, 10.0, hi!, , 0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[0.0, #, hi!, -1.0, 10, 1.0, , 1, 10.0, hi!, , 0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(literal30);
        org.junit.Assert.assertNotNull(literal34);
        org.junit.Assert.assertNotNull(periodFormatterBuilder35);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder0.appendPrefix("hi!", "");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder4.appendPrefix("hi!", "hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder4.printZeroAlways();
        periodFormatterBuilder4.clear();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix1 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        int int4 = simpleAffix1.parse("", 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-11) + "'", int4 == (-11));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix0 = null;
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix1 = null;
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix2 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix(periodFieldAffix0, periodFieldAffix1);
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix4 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix5 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = compositeAffix5.parse("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder1.appendYears();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder2.appendSecondsWithOptionalMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.appendDays();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder1.appendYears();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder2.appendSecondsWithOptionalMillis();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder2.printZeroNever();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder1.appendYears();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder3.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder4.appendYears();
        org.joda.time.format.PeriodFormatter periodFormatter6 = periodFormatterBuilder5.toFormatter();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder2.append(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder5);
        org.junit.Assert.assertNotNull(periodFormatter6);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix12 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        java.lang.Object[] objArray20 = new java.lang.Object[] { 0.0d, '#', "hi!", (-1.0d), (short) 10, 1.0f, "", 1L, 10.0d, "hi!", "", (byte) 0, (-1.0d), (short) 100 };
        java.util.ArrayList<java.lang.Object> objList21 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList21, objArray20);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite23 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList21);
        org.joda.time.format.PeriodFormatterBuilder.Literal literal24 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder.Separator separator27 = new org.joda.time.format.PeriodFormatterBuilder.Separator("", "", strArray4, (org.joda.time.format.PeriodPrinter) composite23, (org.joda.time.format.PeriodParser) literal24, false, false);
        org.joda.time.ReadWritablePeriod readWritablePeriod28 = null;
        java.util.Locale locale31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = separator27.parseInto(readWritablePeriod28, "hi!", (int) (byte) -1, locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0, #, hi!, -1.0, 10, 1.0, , 1, 10.0, hi!, , 0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0, #, hi!, -1.0, 10, 1.0, , 1, 10.0, hi!, , 0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(literal24);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix12 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        java.lang.Object[] objArray20 = new java.lang.Object[] { 0.0d, '#', "hi!", (-1.0d), (short) 10, 1.0f, "", 1L, 10.0d, "hi!", "", (byte) 0, (-1.0d), (short) 100 };
        java.util.ArrayList<java.lang.Object> objList21 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList21, objArray20);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite23 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList21);
        org.joda.time.format.PeriodFormatterBuilder.Literal literal24 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder.Separator separator27 = new org.joda.time.format.PeriodFormatterBuilder.Separator("", "", strArray4, (org.joda.time.format.PeriodPrinter) composite23, (org.joda.time.format.PeriodParser) literal24, false, false);
        java.lang.StringBuffer stringBuffer28 = null;
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        java.util.Locale locale30 = null;
        // The following exception was thrown during execution in test generation
        try {
            composite23.printTo(stringBuffer28, readablePeriod29, locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0, #, hi!, -1.0, 10, 1.0, , 1, 10.0, hi!, , 0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0, #, hi!, -1.0, 10, 1.0, , 1, 10.0, hi!, , 0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(literal24);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendLiteral("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder2.rejectSignedValues(false);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder0.appendPrefix("hi!", "");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder4.appendPrefix("hi!", "hi!");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder8 = periodFormatterBuilder4.printZeroAlways();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder9 = periodFormatterBuilder8.appendMillis();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder4);
        org.junit.Assert.assertNotNull(periodFormatterBuilder7);
        org.junit.Assert.assertNotNull(periodFormatterBuilder8);
        org.junit.Assert.assertNotNull(periodFormatterBuilder9);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.printZeroIfSupported();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder1.appendYears();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder2.appendDays();
        org.junit.Assert.assertNotNull(periodFormatterBuilder1);
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder2 = periodFormatterBuilder0.appendLiteral("");
        org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder2.appendDays();
        org.junit.Assert.assertNotNull(periodFormatterBuilder2);
        org.junit.Assert.assertNotNull(periodFormatterBuilder3);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix0 = null;
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix1 = null;
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix2 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix(periodFieldAffix0, periodFieldAffix1);
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix4 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix5 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix4);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compositeAffix5.printTo(writer6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix0 = null;
        org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix periodFieldAffix1 = null;
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix2 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix(periodFieldAffix0, periodFieldAffix1);
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix4 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        org.joda.time.format.PeriodFormatterBuilder.CompositeAffix compositeAffix5 = new org.joda.time.format.PeriodFormatterBuilder.CompositeAffix((org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) compositeAffix2, (org.joda.time.format.PeriodFormatterBuilder.PeriodFieldAffix) simpleAffix4);
        int int7 = simpleAffix4.calculatePrintedLength(100);
        int int10 = simpleAffix4.parse("hi!", (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!" };
        org.joda.time.format.PeriodFormatterBuilder.SimpleAffix simpleAffix12 = new org.joda.time.format.PeriodFormatterBuilder.SimpleAffix("");
        java.lang.Object[] objArray20 = new java.lang.Object[] { 0.0d, '#', "hi!", (-1.0d), (short) 10, 1.0f, "", 1L, 10.0d, "hi!", "", (byte) 0, (-1.0d), (short) 100 };
        java.util.ArrayList<java.lang.Object> objList21 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList21, objArray20);
        org.joda.time.format.PeriodFormatterBuilder.Composite composite23 = new org.joda.time.format.PeriodFormatterBuilder.Composite((java.util.List<java.lang.Object>) objList21);
        org.joda.time.format.PeriodFormatterBuilder.Literal literal24 = org.joda.time.format.PeriodFormatterBuilder.Literal.EMPTY;
        org.joda.time.format.PeriodFormatterBuilder.Separator separator27 = new org.joda.time.format.PeriodFormatterBuilder.Separator("", "", strArray4, (org.joda.time.format.PeriodPrinter) composite23, (org.joda.time.format.PeriodParser) literal24, false, false);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        java.util.Locale locale30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int31 = separator27.countFieldsToPrint(readablePeriod28, (int) (byte) 100, locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[0.0, #, hi!, -1.0, 10, 1.0, , 1, 10.0, hi!, , 0, -1.0, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[0.0, #, hi!, -1.0, 10, 1.0, , 1, 10.0, hi!, , 0, -1.0, 100]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(literal24);
    }
}

