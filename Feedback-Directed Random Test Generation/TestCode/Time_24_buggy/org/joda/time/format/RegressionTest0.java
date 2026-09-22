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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale2, (java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket4.saveField(dateTimeFieldType5, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType6, "", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology1, locale2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeParserBucket.SavedState savedState1 = dateTimeParserBucket0.new SavedState();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.joda.time.format.DateTimeParserBucket$SavedState with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        java.lang.Class<?> wildcardClass7 = savedState6.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long4 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 28799999L + "'", long4 == 28799999L);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale2, (java.lang.Integer) 0);
        int int5 = dateTimeParserBucket4.getOffset();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 0);
        int int8 = dateTimeParserBucket4.getOffset();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        long long10 = dateTimeParserBucket3.computeMillis(false, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 28799999L + "'", long10 == 28799999L);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale2, (java.lang.Integer) 0);
        int int5 = dateTimeParserBucket4.getOffset();
        java.lang.Object obj6 = null;
        boolean boolean7 = dateTimeParserBucket4.restoreState(obj6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        dateTimeParserBucket3.setZone(dateTimeZone8);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        long long8 = dateTimeParserBucket3.computeMillis(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28799999L + "'", long8 == 28799999L);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray7 = savedState6.iSavedFields;
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology9, locale10);
        long long13 = dateTimeParserBucket11.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState14 = dateTimeParserBucket11.new SavedState();
        boolean boolean15 = savedState6.restoreState(dateTimeParserBucket11);
        int int16 = savedState6.iSavedFieldsCount;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
        org.junit.Assert.assertNotNull(savedFieldArray7);
        org.junit.Assert.assertArrayEquals(savedFieldArray7, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 28799999L + "'", long13 == 28799999L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale2, (java.lang.Integer) 0);
        int int5 = dateTimeParserBucket4.getOffset();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket4.getZone();
        long long9 = dateTimeParserBucket4.computeMillis();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 28800001L + "'", long9 == 28800001L);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.joda.time.DurationField durationField0 = null;
        org.joda.time.DurationField durationField1 = null;
        int int2 = org.joda.time.format.DateTimeParserBucket.compareReverse(durationField0, durationField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        dateTimeParserBucket3.setOffset(0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale2, (java.lang.Integer) 0);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState5 = dateTimeParserBucket4.new SavedState();
        org.joda.time.DateTimeZone dateTimeZone6 = savedState5.iZone;
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray7 = savedState6.iSavedFields;
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology9, locale10);
        long long13 = dateTimeParserBucket11.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState14 = dateTimeParserBucket11.new SavedState();
        boolean boolean15 = savedState6.restoreState(dateTimeParserBucket11);
        java.lang.Object obj16 = dateTimeParserBucket11.saveState();
        org.joda.time.format.DateTimeParserBucket.SavedState savedState17 = dateTimeParserBucket11.new SavedState();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
        org.junit.Assert.assertNotNull(savedFieldArray7);
        org.junit.Assert.assertArrayEquals(savedFieldArray7, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 28799999L + "'", long13 == 28799999L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        dateTimeParserBucket3.setZone(dateTimeZone8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) -1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale2, (java.lang.Integer) 0);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState5 = dateTimeParserBucket4.new SavedState();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology9, locale10);
        int int12 = dateTimeParserBucket11.getOffset();
        dateTimeParserBucket11.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale15 = dateTimeParserBucket11.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket4.saveField(dateTimeFieldType6, "hi!", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale2, (java.lang.Integer) 0);
        int int5 = dateTimeParserBucket4.getOffset();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket4.getZone();
        java.lang.Class<?> wildcardClass9 = dateTimeParserBucket4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale2, (java.lang.Integer) 0);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState5 = dateTimeParserBucket4.new SavedState();
        long long7 = dateTimeParserBucket4.computeMillis(true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 28800001L + "'", long7 == 28800001L);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale2, (java.lang.Integer) 0);
        long long6 = dateTimeParserBucket4.computeMillis(true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 28800001L + "'", long6 == 28800001L);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale2, (java.lang.Integer) 0);
        int int5 = dateTimeParserBucket4.getOffset();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 0);
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology1, locale2);
        long long4 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket3.saveField(dateTimeField5, 0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 28800001L + "'", long4 == 28800001L);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray7 = savedState6.iSavedFields;
        int int8 = savedState6.iOffset;
        int int9 = savedState6.iOffset;
        int int10 = savedState6.iOffset;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
        org.junit.Assert.assertNotNull(savedFieldArray7);
        org.junit.Assert.assertArrayEquals(savedFieldArray7, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology1, locale2);
        long long4 = dateTimeParserBucket3.computeMillis();
        java.lang.Object obj5 = dateTimeParserBucket3.saveState();
        java.lang.Integer int6 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 28800001L + "'", long4 == 28800001L);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology3, locale4);
        long long7 = dateTimeParserBucket5.computeMillis(true);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology11, locale12);
        long long15 = dateTimeParserBucket13.computeMillis(true);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket13.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology18, locale19);
        int int21 = dateTimeParserBucket20.getOffset();
        dateTimeParserBucket20.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale24 = dateTimeParserBucket20.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology16, locale24, (java.lang.Integer) 1, (int) '#');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology8, locale24, (java.lang.Integer) 1, (int) (short) 100);
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology33, locale34);
        long long37 = dateTimeParserBucket35.computeMillis(true);
        org.joda.time.Chronology chronology38 = dateTimeParserBucket35.getChronology();
        org.joda.time.Chronology chronology40 = null;
        java.util.Locale locale41 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology40, locale41);
        int int43 = dateTimeParserBucket42.getOffset();
        dateTimeParserBucket42.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale46 = dateTimeParserBucket42.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology38, locale46, (java.lang.Integer) 1, (int) '#');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 1, chronology8, locale46);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 28799999L + "'", long7 == 28799999L);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 28799999L + "'", long15 == 28799999L);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 28799999L + "'", long37 == 28799999L);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray7 = savedState6.iSavedFields;
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology9, locale10);
        long long13 = dateTimeParserBucket11.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState14 = dateTimeParserBucket11.new SavedState();
        boolean boolean15 = savedState6.restoreState(dateTimeParserBucket11);
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray16 = savedState6.iSavedFields;
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology18, locale19, (java.lang.Integer) 0);
        boolean boolean22 = savedState6.restoreState(dateTimeParserBucket21);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
        org.junit.Assert.assertNotNull(savedFieldArray7);
        org.junit.Assert.assertArrayEquals(savedFieldArray7, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 28799999L + "'", long13 == 28799999L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(savedFieldArray16);
        org.junit.Assert.assertArrayEquals(savedFieldArray16, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology2, locale3);
        long long6 = dateTimeParserBucket4.computeMillis(true);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology10, locale11);
        long long14 = dateTimeParserBucket12.computeMillis(true);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket12.getChronology();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology17, locale18);
        int int20 = dateTimeParserBucket19.getOffset();
        dateTimeParserBucket19.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale23 = dateTimeParserBucket19.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology15, locale23, (java.lang.Integer) 1, (int) '#');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology7, locale23, (java.lang.Integer) 1, (int) (short) 100);
        dateTimeParserBucket29.setOffset((int) '4');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 28799999L + "'", long6 == 28799999L);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 28799999L + "'", long14 == 28799999L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology4, locale5);
        long long8 = dateTimeParserBucket6.computeMillis(true);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology11, locale12);
        int int14 = dateTimeParserBucket13.getOffset();
        dateTimeParserBucket13.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale17 = dateTimeParserBucket13.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology9, locale17, (java.lang.Integer) 1, (int) '#');
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology22, locale23);
        int int25 = dateTimeParserBucket24.getOffset();
        dateTimeParserBucket24.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale28 = dateTimeParserBucket24.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology9, locale28, (java.lang.Integer) 1, 10);
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology33, locale34, (java.lang.Integer) 0);
        int int37 = dateTimeParserBucket36.getOffset();
        dateTimeParserBucket36.setPivotYear((java.lang.Integer) 0);
        long long41 = dateTimeParserBucket36.computeMillis(false);
        java.util.Locale locale42 = dateTimeParserBucket36.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology9, locale42, (java.lang.Integer) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28799999L + "'", long8 == 28799999L);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 28800001L + "'", long41 == 28800001L);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale2, (java.lang.Integer) 0);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState5 = dateTimeParserBucket4.new SavedState();
        int int6 = savedState5.iSavedFieldsCount;
        int int7 = savedState5.iSavedFieldsCount;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        dateTimeParserBucket3.setZone(dateTimeZone8);
        long long11 = dateTimeParserBucket3.computeMillis(true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale2, (java.lang.Integer) 0);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState5 = dateTimeParserBucket4.new SavedState();
        java.lang.Class<?> wildcardClass6 = savedState5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray7 = savedState6.iSavedFields;
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology9, locale10);
        long long13 = dateTimeParserBucket11.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState14 = dateTimeParserBucket11.new SavedState();
        boolean boolean15 = savedState6.restoreState(dateTimeParserBucket11);
        java.lang.Object obj16 = dateTimeParserBucket11.saveState();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology18, locale19);
        int int21 = dateTimeParserBucket20.getOffset();
        boolean boolean22 = dateTimeParserBucket11.restoreState((java.lang.Object) int21);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
        org.junit.Assert.assertNotNull(savedFieldArray7);
        org.junit.Assert.assertArrayEquals(savedFieldArray7, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 28799999L + "'", long13 == 28799999L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState6 = dateTimeParserBucket3.new SavedState();
        org.joda.time.format.DateTimeParserBucket.SavedField[] savedFieldArray7 = savedState6.iSavedFields;
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology9, locale10, (java.lang.Integer) 0);
        int int13 = dateTimeParserBucket12.getOffset();
        dateTimeParserBucket12.setPivotYear((java.lang.Integer) 0);
        long long17 = dateTimeParserBucket12.computeMillis(false);
        boolean boolean18 = savedState6.restoreState(dateTimeParserBucket12);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
        org.junit.Assert.assertNotNull(savedFieldArray7);
        org.junit.Assert.assertArrayEquals(savedFieldArray7, new org.joda.time.format.DateTimeParserBucket.SavedField[] { null, null, null, null, null, null, null, null });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 28800001L + "'", long17 == 28800001L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        long long6 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 28799999L + "'", long6 == 28799999L);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology4, locale5);
        long long8 = dateTimeParserBucket6.computeMillis(true);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology11, locale12);
        int int14 = dateTimeParserBucket13.getOffset();
        dateTimeParserBucket13.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale17 = dateTimeParserBucket13.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology9, locale17, (java.lang.Integer) 1, (int) '#');
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology22, locale23);
        int int25 = dateTimeParserBucket24.getOffset();
        dateTimeParserBucket24.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale28 = dateTimeParserBucket24.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology9, locale28, (java.lang.Integer) 1, 10);
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology34, locale35);
        long long38 = dateTimeParserBucket36.computeMillis(true);
        org.joda.time.Chronology chronology39 = dateTimeParserBucket36.getChronology();
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology42, locale43);
        long long46 = dateTimeParserBucket44.computeMillis(true);
        org.joda.time.Chronology chronology47 = dateTimeParserBucket44.getChronology();
        org.joda.time.Chronology chronology49 = null;
        java.util.Locale locale50 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology49, locale50);
        int int52 = dateTimeParserBucket51.getOffset();
        dateTimeParserBucket51.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale55 = dateTimeParserBucket51.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology47, locale55, (java.lang.Integer) 1, (int) '#');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology39, locale55, (java.lang.Integer) 1, (int) (short) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket((long) 10, chronology9, locale55);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28799999L + "'", long8 == 28799999L);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 28799999L + "'", long38 == 28799999L);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 28799999L + "'", long46 == 28799999L);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        dateTimeParserBucket3.setOffset((int) '#');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 28799999L + "'", long5 == 28799999L);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology2, locale3);
        long long6 = dateTimeParserBucket4.computeMillis(true);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology9, locale10);
        int int12 = dateTimeParserBucket11.getOffset();
        dateTimeParserBucket11.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale15 = dateTimeParserBucket11.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology7, locale15, (java.lang.Integer) 1, (int) '#');
        int int19 = dateTimeParserBucket18.getOffset();
        dateTimeParserBucket18.setOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeParserBucket18.getZone();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology24, locale25, (java.lang.Integer) 0);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState28 = dateTimeParserBucket27.new SavedState();
        int int29 = savedState28.iSavedFieldsCount;
        org.joda.time.DateTimeZone dateTimeZone30 = savedState28.iZone;
        dateTimeParserBucket18.setZone(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 28799999L + "'", long6 == 28799999L);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone30);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) 1, chronology1, locale2, (java.lang.Integer) 0);
        org.joda.time.format.DateTimeParserBucket.SavedState savedState5 = dateTimeParserBucket4.new SavedState();
        long long8 = dateTimeParserBucket4.computeMillis(true, "");
        org.joda.time.format.DateTimeParserBucket.SavedState savedState9 = dateTimeParserBucket4.new SavedState();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 28800001L + "'", long8 == 28800001L);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology6, locale7);
        long long10 = dateTimeParserBucket8.computeMillis(true);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket8.getChronology();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology13, locale14);
        int int16 = dateTimeParserBucket15.getOffset();
        dateTimeParserBucket15.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale19 = dateTimeParserBucket15.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology11, locale19, (java.lang.Integer) 1, (int) '#');
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology24, locale25);
        int int27 = dateTimeParserBucket26.getOffset();
        dateTimeParserBucket26.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale30 = dateTimeParserBucket26.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology11, locale30, (java.lang.Integer) 1, 10);
        org.joda.time.Chronology chronology35 = null;
        java.util.Locale locale36 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology35, locale36);
        int int38 = dateTimeParserBucket37.getOffset();
        dateTimeParserBucket37.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale41 = dateTimeParserBucket37.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology11, locale41);
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology45, locale46);
        long long49 = dateTimeParserBucket47.computeMillis(true);
        org.joda.time.Chronology chronology50 = dateTimeParserBucket47.getChronology();
        org.joda.time.Chronology chronology52 = null;
        java.util.Locale locale53 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology52, locale53);
        int int55 = dateTimeParserBucket54.getOffset();
        dateTimeParserBucket54.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale58 = dateTimeParserBucket54.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology50, locale58, (java.lang.Integer) 1, (int) '#');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology11, locale58, (java.lang.Integer) 100, 0);
        org.joda.time.Chronology chronology68 = null;
        java.util.Locale locale69 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology68, locale69);
        long long72 = dateTimeParserBucket70.computeMillis(true);
        org.joda.time.Chronology chronology73 = dateTimeParserBucket70.getChronology();
        org.joda.time.Chronology chronology75 = null;
        java.util.Locale locale76 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology75, locale76);
        int int78 = dateTimeParserBucket77.getOffset();
        dateTimeParserBucket77.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale81 = dateTimeParserBucket77.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket84 = new org.joda.time.format.DateTimeParserBucket((long) '4', chronology73, locale81, (java.lang.Integer) 1, (int) '#');
        org.joda.time.Chronology chronology86 = null;
        java.util.Locale locale87 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket88 = new org.joda.time.format.DateTimeParserBucket((long) (short) 1, chronology86, locale87);
        int int89 = dateTimeParserBucket88.getOffset();
        dateTimeParserBucket88.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale92 = dateTimeParserBucket88.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket95 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology73, locale92, (java.lang.Integer) 1, 10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket97 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology11, locale92, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 28799999L + "'", long10 == 28799999L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 28799999L + "'", long49 == 28799999L);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 28799999L + "'", long72 == 28799999L);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(locale81);
        org.junit.Assert.assertEquals(locale81.toString(), "en");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(locale92);
        org.junit.Assert.assertEquals(locale92.toString(), "en");
    }
}

