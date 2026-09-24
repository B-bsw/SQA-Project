package org.apache.commons.lang.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 54, (long) (short) 0, "P0Y0M0DT0H0M0.86S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.86-54" + "'", str3, "P0Y000DT00000.86-54");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 53, "P0Y000DT00000.06330", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06330" + "'", str3, "P0Y000DT00000.06330");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 97, (long) 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.41S" + "'", str2, "P0Y0M0DT0H0M0.41S");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0M0DT0H0M0.02S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.02100" + "'", str2, "P0Y000DT00000.02100");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        token8.increment();
        int int10 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int10, (int) (byte) 100);
        int int13 = token12.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int13);
        int int15 = token14.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.10064", (int) '4');
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token23);
        token23.increment();
        java.lang.Object obj26 = token23.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean31 = token29.equals((java.lang.Object) (short) 100);
        java.lang.Object obj32 = token29.getValue();
        java.lang.String str33 = token29.toString();
        java.lang.Object obj34 = token29.getValue();
        token29.increment();
        boolean boolean36 = token23.equals((java.lang.Object) token29);
        org.apache.commons.lang.time.DurationFormatUtils.Token token37 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token29);
        boolean boolean38 = token20.equals((java.lang.Object) token37);
        org.apache.commons.lang.time.DurationFormatUtils.Token token40 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token37, 11);
        token40.increment();
        boolean boolean42 = token14.equals((java.lang.Object) token40);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "S" + "'", obj26, "S");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "hi!" + "'", obj32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str33, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "hi!" + "'", obj34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37, (int) (short) 10);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str5 = token4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3737373737373737373737" + "'", str5, "3737373737373737373737");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        int int10 = token2.getCount();
        int int11 = token2.getCount();
        java.lang.String str12 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37 + "'", int11 == 37);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 53, (long) 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        int int6 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int9 = token8.getCount();
        boolean boolean11 = token8.equals((java.lang.Object) "0:00:00.99");
        boolean boolean12 = token2.equals((java.lang.Object) "0:00:00.99");
        int int13 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) '4');
        token15.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        int int15 = token14.getCount();
        java.lang.Object obj16 = token14.getValue();
        token14.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 97, "P0Y0M0DT0H0M0.008S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00896" + "'", str3, "P0Y000DT00000.00896");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str3, 35);
        int int6 = token5.getCount();
        java.lang.Object obj7 = token5.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str11 = token10.toString();
        boolean boolean13 = token10.equals((java.lang.Object) 100L);
        java.lang.Object obj14 = token10.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10);
        int int16 = token10.getCount();
        java.lang.Object obj17 = token10.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100", 35);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token23, (int) (short) 100);
        boolean boolean26 = token10.equals((java.lang.Object) token23);
        boolean boolean27 = token5.equals((java.lang.Object) token10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj8, 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) true);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) true);
        boolean boolean15 = token13.equals((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        boolean boolean17 = token10.equals((java.lang.Object) token16);
        int int18 = token10.getCount();
        java.lang.Object obj19 = token10.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, (long) 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.039S" + "'", str2, "P0Y0M0DT0H0M0.039S");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (short) 10, "P0Y0M0DT0H0M0.068S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06811" + "'", str3, "P0Y000DT00000.06811");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (byte) 10, "fal0efalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefale", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fal0efalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefale" + "'", str5, "fal0efalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefale");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.75S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean6 = token3.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj7 = token3.getValue();
        token3.increment();
        boolean boolean9 = token1.equals((java.lang.Object) token3);
        java.lang.Class<?> wildcardClass10 = token1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj7, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean8);
        java.lang.Class<?> wildcardClass10 = token9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        java.lang.String str10 = token9.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str10, (int) '4');
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str10, 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        token1.increment();
        token1.increment();
        token1.increment();
        boolean boolean6 = token1.equals((java.lang.Object) "0");
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str9 = token8.toString();
        boolean boolean10 = token1.equals((java.lang.Object) token8);
        java.lang.Class<?> wildcardClass11 = token8.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        int int13 = token8.getCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.010" + "'", str9, "0:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str2 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str2, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str2, 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.010" + "'", str2, "0:00:00.010");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        boolean boolean9 = token2.equals((java.lang.Object) "P0Y0M0DT0H0M0.48S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.48S", 37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((-1L), (long) 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.037S" + "'", str2, "P0Y0M0DT0H0M0.037S");
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean11 = token9.equals((java.lang.Object) "hi!");
        boolean boolean12 = token2.equals((java.lang.Object) token9);
        java.lang.Object obj13 = token9.getValue();
        java.lang.Object obj14 = token9.getValue();
        token9.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "m" + "'", obj13, "m");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "m" + "'", obj14, "m");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str7 = token6.toString();
        boolean boolean9 = token6.equals((java.lang.Object) 100L);
        token6.increment();
        token6.increment();
        boolean boolean13 = token6.equals((java.lang.Object) "");
        token6.increment();
        boolean boolean15 = token1.equals((java.lang.Object) token6);
        int int16 = token6.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int16, 52);
        token18.increment();
        token18.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0");
        boolean boolean23 = token18.equals((java.lang.Object) token22);
        int int24 = token18.getCount();
        java.lang.Class<?> wildcardClass25 = token18.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 38 + "'", int16 == 38);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 54 + "'", int24 == 54);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 10, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000-100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000-100" + "'", str3, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000-100");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str10 = token9.toString();
        boolean boolean12 = token9.equals((java.lang.Object) 100L);
        token9.increment();
        boolean boolean15 = token9.equals((java.lang.Object) "M");
        java.lang.String str16 = token9.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = token18.getClass();
        boolean boolean20 = token1.equals((java.lang.Object) token18);
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str24 = token23.toString();
        boolean boolean26 = token23.equals((java.lang.Object) 100L);
        java.lang.Object obj27 = token23.getValue();
        java.lang.Object obj28 = token23.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str32 = token31.toString();
        boolean boolean34 = token31.equals((java.lang.Object) 100L);
        token31.increment();
        boolean boolean37 = token31.equals((java.lang.Object) "M");
        java.lang.String str38 = token31.toString();
        boolean boolean39 = token23.equals((java.lang.Object) str38);
        int int40 = token23.getCount();
        boolean boolean41 = token1.equals((java.lang.Object) int40);
        java.lang.Object obj42 = token1.getValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str16, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str24, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str32, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str38, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj42, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 38, "P0Y000DT00000.053-12");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.053-12" + "'", str2, "P0Y000DT00000.053-12");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 11, (long) (byte) 10, "P0Y0M0DT0H0M0.016S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.016-1" + "'", str3, "P0Y000DT00000.016-1");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.String str6 = token2.toString();
        int int7 = token2.getCount();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 101);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 38, "P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651" + "'", str5, "P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651P0Y000DT00000.0651");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 11, "P0Y000DT00000.6597");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6597" + "'", str3, "P0Y000DT00000.6597");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str5, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        token3.increment();
        java.lang.String str8 = token3.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        java.lang.Class<?> wildcardClass10 = token9.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str8, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 97, "P0Y000DT00000.06525");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.06525" + "'", str2, "P0Y000DT00000.06525");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int8 = token7.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, (int) (short) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10);
        int int12 = token10.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        java.lang.Object obj10 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Class<?> wildcardClass13 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.064S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0640" + "'", str2, "P0Y000DT00000.0640");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 39, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) ' ', "mmm");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000" + "'", str3, "000");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str8 = token7.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        token10.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str15 = token14.toString();
        boolean boolean17 = token14.equals((java.lang.Object) 100L);
        token14.increment();
        token14.increment();
        boolean boolean21 = token14.equals((java.lang.Object) "");
        java.lang.Object obj22 = token14.getValue();
        int int23 = token14.getCount();
        boolean boolean24 = token10.equals((java.lang.Object) token14);
        int int25 = token10.getCount();
        boolean boolean26 = token7.equals((java.lang.Object) token10);
        java.lang.Object obj27 = token10.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "hi!" + "'", obj22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 37 + "'", int23 == 37);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj27, "P0Y0M0DT0H0M0.002S");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 36, "P0Y0M0DT0H0M0.74S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.7437" + "'", str5, "P0Y000DT00000.7437");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 97, (long) 35, "P0Y000DT00000.98-63", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.98-63" + "'", str5, "P0Y000DT00000.98-63");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        boolean boolean11 = token2.equals((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S", 35);
        java.lang.Object obj14 = token13.getValue();
        java.lang.String str15 = token13.toString();
        int int16 = token13.getCount();
        java.lang.Object obj17 = token13.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str21 = token20.toString();
        boolean boolean23 = token20.equals((java.lang.Object) 100L);
        token20.increment();
        boolean boolean26 = token20.equals((java.lang.Object) "M");
        java.lang.String str27 = token20.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token20, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token29);
        java.lang.Class<?> wildcardClass31 = token30.getClass();
        boolean boolean32 = token13.equals((java.lang.Object) token30);
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str36 = token35.toString();
        boolean boolean38 = token35.equals((java.lang.Object) 100L);
        token35.increment();
        token35.increment();
        java.lang.Object obj41 = token35.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token44 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) 'a');
        boolean boolean45 = token35.equals((java.lang.Object) token44);
        boolean boolean46 = token13.equals((java.lang.Object) token44);
        java.lang.String str47 = token13.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str15, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj17, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str21, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str27, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str36, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + "hi!" + "'", obj41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str47, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) -1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) ' ', false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 54, (long) (byte) 1, "P0Y000DT00000.052-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.052-1" + "'", str3, "P0Y000DT00000.052-1");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.020", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.020" + "'", str3, "P0Y000DT00000.020");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.065100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.065100" + "'", str3, "P0Y000DT00000.065100");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean11 = token9.equals((java.lang.Object) "hi!");
        boolean boolean12 = token2.equals((java.lang.Object) token9);
        java.lang.Object obj13 = token9.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str19 = token18.toString();
        boolean boolean21 = token18.equals((java.lang.Object) 100L);
        java.lang.String str22 = token18.toString();
        int int23 = token18.getCount();
        token18.increment();
        token18.increment();
        boolean boolean26 = token9.equals((java.lang.Object) token18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "m" + "'", obj13, "m");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str19, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.097-20");
        int int2 = token1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.Object obj9 = token2.getValue();
        int int10 = token2.getCount();
        java.lang.Object obj11 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, 100L, "P0Y000DT00000.10152", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.10152" + "'", str5, "P0Y000DT00000.10152");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100", 35);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, (int) (short) 100);
        java.lang.String str12 = token9.toString();
        boolean boolean13 = token2.equals((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = token9.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100" + "'", str12, "P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 52, (long) 54, "0:00:00.000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.000" + "'", str3, "0:00:00.000");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str6 = token5.toString();
        boolean boolean8 = token5.equals((java.lang.Object) 100L);
        token5.increment();
        token5.increment();
        boolean boolean12 = token5.equals((java.lang.Object) "");
        java.lang.Object obj13 = token5.getValue();
        int int14 = token5.getCount();
        boolean boolean15 = token1.equals((java.lang.Object) token5);
        java.lang.String str16 = token5.toString();
        java.lang.Class<?> wildcardClass17 = token5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37 + "'", int14 == 37);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str16, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.032S", (int) '4');
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean7 = token5.equals((java.lang.Object) (short) 100);
        token5.increment();
        boolean boolean9 = token2.equals((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 97);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token12.increment();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 0);
        int int10 = token9.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str2 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        java.lang.Object obj7 = token6.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj7);
        token8.increment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.010" + "'", str2, "0:00:00.010");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 97, "mmmm", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        int int10 = token2.getCount();
        int int11 = token2.getCount();
        int int12 = token2.getCount();
        token2.increment();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str18 = token17.toString();
        boolean boolean20 = token17.equals((java.lang.Object) 100L);
        token17.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token17);
        java.lang.String str23 = token17.toString();
        boolean boolean24 = token2.equals((java.lang.Object) token17);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str26 = token25.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37 + "'", int11 == 37);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37 + "'", int12 == 37);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str18, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str23, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str26, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int7 = token6.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        int int9 = token6.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        token8.increment();
        int int10 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int10, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.001100");
        token14.increment();
        java.lang.String str16 = token14.toString();
        boolean boolean17 = token12.equals((java.lang.Object) str16);
        java.lang.Object obj18 = token12.getValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P0Y000DT00000.001100P0Y000DT00000.001100" + "'", str16, "P0Y000DT00000.001100P0Y000DT00000.001100");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 11 + "'", obj18, 11);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 54, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.004S" + "'", str2, "P0Y0M0DT0H0M0.004S");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 97, (long) (short) -1, "P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94" + "'", str3, "P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 35, (long) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.66S" + "'", str2, "P0Y0M0DT0H0M0.66S");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) 32, "P0Y000DT00000.0650P0Y000DT00000.0650P0Y000DT00000.0650");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0650P0Y000DT00000.0650P0Y000DT00000.0650" + "'", str3, "P0Y000DT00000.0650P0Y000DT00000.0650P0Y000DT00000.0650");
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        java.lang.Class<?> wildcardClass15 = token14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(10L, (long) 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.022S" + "'", str2, "P0Y0M0DT0H0M0.022S");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 52, (long) 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.85S" + "'", str2, "P0Y0M0DT0H0M0.85S");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.String str2 = token1.toString();
        token1.increment();
        java.lang.String str4 = token1.toString();
        java.lang.String str5 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int8 = token7.getCount();
        boolean boolean10 = token7.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj11 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        int int13 = token12.getCount();
        int int14 = token12.getCount();
        java.lang.Object obj15 = token12.getValue();
        java.lang.Object obj16 = token12.getValue();
        boolean boolean17 = token1.equals((java.lang.Object) token12);
        boolean boolean19 = token12.equals((java.lang.Object) "P0Y000DT00000.6337");
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str23 = token22.toString();
        boolean boolean25 = token22.equals((java.lang.Object) 100L);
        token22.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token22);
        java.lang.Object obj28 = token22.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str32 = token31.toString();
        boolean boolean34 = token31.equals((java.lang.Object) 100L);
        token31.increment();
        token31.increment();
        token31.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token39 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int40 = token39.getCount();
        boolean boolean42 = token39.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj43 = token39.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token44 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token39);
        int int45 = token44.getCount();
        int int46 = token44.getCount();
        java.lang.Object obj47 = token44.getValue();
        boolean boolean48 = token31.equals((java.lang.Object) token44);
        org.apache.commons.lang.time.DurationFormatUtils.Token token49 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token31);
        org.apache.commons.lang.time.DurationFormatUtils.Token token51 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1.0d));
        token51.increment();
        token51.increment();
        boolean boolean54 = token31.equals((java.lang.Object) token51);
        boolean boolean55 = token22.equals((java.lang.Object) token31);
        boolean boolean56 = token12.equals((java.lang.Object) boolean55);
        token12.increment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mm" + "'", str4, "mm");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mm" + "'", str5, "mm");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj11, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str23, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str32, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj43, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 101, "P0Y000DT00000.4297", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.4297" + "'", str3, "P0Y000DT00000.4297");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 53, 100L, "P0Y000DT00000.48-25");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.48-25" + "'", str3, "P0Y000DT00000.48-25");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str12 = token11.toString();
        boolean boolean14 = token11.equals((java.lang.Object) 100L);
        token11.increment();
        boolean boolean17 = token11.equals((java.lang.Object) "M");
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        boolean boolean20 = token11.equals((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S", 35);
        int int23 = token22.getCount();
        boolean boolean24 = token2.equals((java.lang.Object) int23);
        java.lang.Object obj25 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1), 37);
        token28.increment();
        int int30 = token28.getCount();
        java.lang.Object obj31 = token28.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj31);
        boolean boolean33 = token2.equals(obj31);
        java.lang.Object obj34 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "hi!" + "'", obj25, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 38 + "'", int30 == 38);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + (-1) + "'", obj31, (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "hi!" + "'", obj34, "hi!");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        java.lang.Object obj7 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int12 = token11.getCount();
        boolean boolean13 = token9.equals((java.lang.Object) token11);
        java.lang.Object obj14 = token11.getValue();
        boolean boolean15 = token2.equals((java.lang.Object) token11);
        java.lang.Class<?> wildcardClass16 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 53);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18, (int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = token20.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.00498", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00498" + "'", str3, "P0Y000DT00000.00498");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m", (-1));
        int int4 = token3.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int4, 35);
        int int7 = token6.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, (int) (short) 0);
        java.lang.String str10 = token9.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100");
        java.lang.String str9 = token8.toString();
        boolean boolean10 = token2.equals((java.lang.Object) token8);
        token8.increment();
        int int12 = token8.getCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0Y000DT00000.100" + "'", str9, "P0Y000DT00000.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.100S", (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        java.lang.Class<?> wildcardClass5 = token4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 54, "P0Y000DT00000.741");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.741" + "'", str2, "P0Y000DT00000.741");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        java.lang.Object obj10 = token9.getValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 52, (long) 0, "P0Y000DT00000.04100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.04100" + "'", str5, "P0Y000DT00000.04100");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 54, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 54, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 2, 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 52, (long) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.83S" + "'", str2, "P0Y0M0DT0H0M0.83S");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1.0d));
        java.lang.String str2 = token1.toString();
        token1.increment();
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1.0" + "'", str2, "-1.0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0-1.0" + "'", str4, "-1.0-1.0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int8 = token2.getCount();
        java.lang.Object obj9 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) ' ');
        java.lang.String str12 = token2.toString();
        java.lang.String str13 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str13, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        java.lang.Class<?> wildcardClass4 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        int int8 = token7.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        java.lang.Object obj8 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) 'a');
        boolean boolean12 = token2.equals((java.lang.Object) token11);
        java.lang.Object obj13 = token2.getValue();
        java.lang.String str14 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) ' ', "P0Y0M0DT0H0M0.026S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02632" + "'", str3, "P0Y000DT00000.02632");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y0M0DT0H0M0.061S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06110" + "'", str3, "P0Y000DT00000.06110");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10.0d);
        java.lang.String str2 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str6 = token5.toString();
        boolean boolean8 = token5.equals((java.lang.Object) 100L);
        java.lang.Object obj9 = token5.getValue();
        java.lang.Object obj10 = token5.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str14 = token13.toString();
        boolean boolean16 = token13.equals((java.lang.Object) 100L);
        token13.increment();
        boolean boolean19 = token13.equals((java.lang.Object) "M");
        java.lang.String str20 = token13.toString();
        boolean boolean21 = token5.equals((java.lang.Object) str20);
        int int22 = token5.getCount();
        boolean boolean23 = token1.equals((java.lang.Object) token5);
        token1.increment();
        int int25 = token1.getCount();
        java.lang.String str26 = token1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.0" + "'", str2, "10.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str20, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10.010.0" + "'", str26, "10.010.0");
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        token8.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        java.lang.Class<?> wildcardClass11 = token10.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.06525");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int3 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        boolean boolean6 = token2.equals((java.lang.Object) 10.0d);
        java.lang.String str7 = token2.toString();
        int int8 = token2.getCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        int int6 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int9 = token8.getCount();
        boolean boolean11 = token8.equals((java.lang.Object) "0:00:00.99");
        boolean boolean12 = token2.equals((java.lang.Object) "0:00:00.99");
        int int13 = token2.getCount();
        java.lang.Class<?> wildcardClass14 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass14);
        java.lang.Object obj16 = token15.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj16, (int) (short) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 53, "P0Y000DT00000.83-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.83-1" + "'", str2, "P0Y000DT00000.83-1");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.10100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.032S", (int) '4');
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean9 = token7.equals((java.lang.Object) (short) 100);
        token7.increment();
        boolean boolean11 = token4.equals((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean11);
        boolean boolean13 = token1.equals((java.lang.Object) boolean11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) (byte) -1, "P0Y0M0DT0H0M0.063S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.063-2" + "'", str3, "P0Y000DT00000.063-2");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 52, "P0Y000DT00000.0030", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0030" + "'", str5, "P0Y000DT00000.0030");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) 100, "P0Y000DT00000.01497", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.01497" + "'", str5, "P0Y000DT00000.01497");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.0650", 32);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0a00", (int) (short) 10);
        boolean boolean7 = token5.equals((java.lang.Object) "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        int int8 = token5.getCount();
        boolean boolean9 = token2.equals((java.lang.Object) token5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 52, (long) 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.045S" + "'", str2, "P0Y0M0DT0H0M0.045S");
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 11, "P0Y0M0DT0H0M0.62S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.6211" + "'", str5, "P0Y000DT00000.6211");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.String str2 = token1.toString();
        token1.increment();
        java.lang.String str4 = token1.toString();
        boolean boolean6 = token1.equals((java.lang.Object) "P0Y000DT00000.03-1");
        token1.increment();
        java.lang.String str8 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str8);
        int int10 = token9.getCount();
        java.lang.Object obj11 = token9.getValue();
        token9.increment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mm" + "'", str4, "mm");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mmm" + "'", str8, "mmm");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "mmm" + "'", obj11, "mmm");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.097S");
        java.lang.Class<?> wildcardClass2 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.06436", 100);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.00310");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) 'a');
        boolean boolean6 = token4.equals((java.lang.Object) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 1, (int) (byte) 0);
        boolean boolean9 = token1.equals((java.lang.Object) (byte) 1);
        java.lang.String str10 = token1.toString();
        java.lang.Object obj11 = token1.getValue();
        java.lang.Object obj12 = token1.getValue();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P0Y000DT00000.00310" + "'", str10, "P0Y000DT00000.00310");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "P0Y000DT00000.00310" + "'", obj11, "P0Y000DT00000.00310");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "P0Y000DT00000.00310" + "'", obj12, "P0Y000DT00000.00310");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (short) -1, "P0Y000DT00000.63-11");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.63-11" + "'", str3, "P0Y000DT00000.63-11");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(1L, (long) 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.037S" + "'", str2, "P0Y0M0DT0H0M0.037S");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        java.lang.String str6 = token1.toString();
        java.lang.Object obj7 = token1.getValue();
        java.lang.Object obj8 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "m" + "'", str6, "m");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "m" + "'", obj7, "m");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "m" + "'", obj8, "m");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) 1, "P0Y000DT00000.021-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.021-1" + "'", str3, "P0Y000DT00000.021-1");
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.119");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.119" + "'", str2, "P0Y000DT00000.119");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) '4', "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551" + "'", str3, "P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551P0Y000DT00000.06551");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj6, (int) '#');
        token8.increment();
        java.lang.String str10 = token8.toString();
        int int11 = token8.getCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 11, (long) 100, "P0Y000DT00000.10152");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10152" + "'", str3, "P0Y000DT00000.10152");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        int int9 = token2.getCount();
        java.lang.String str10 = token2.toString();
        java.lang.Object obj11 = token2.getValue();
        java.lang.String str12 = token2.toString();
        java.lang.Object obj13 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0");
        java.lang.Object obj16 = token15.getValue();
        token15.increment();
        int int18 = token15.getCount();
        boolean boolean19 = token2.equals((java.lang.Object) token15);
        java.lang.String str20 = token15.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37 + "'", int9 == 37);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "0" + "'", obj16, "0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "00" + "'", str20, "00");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, (int) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, (int) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 101);
        token6.increment();
        java.lang.Object obj8 = token6.getValue();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (short) 1 + "'", obj8, (short) 1);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj8, 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) true);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) true);
        boolean boolean15 = token13.equals((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        boolean boolean17 = token10.equals((java.lang.Object) token16);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16);
        token18.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.0900", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0900" + "'", str3, "P0Y000DT00000.0900");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        java.lang.Object obj10 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int12 = token11.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.089S", 52);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.98100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.98100" + "'", str2, "P0Y000DT00000.98100");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean11 = token9.equals((java.lang.Object) "hi!");
        boolean boolean12 = token2.equals((java.lang.Object) token9);
        java.lang.Object obj13 = token9.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        java.lang.String str15 = token9.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "m" + "'", obj13, "m");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "m" + "'", str15, "m");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 39, "P0Y000DT00000.62-25");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.62-25" + "'", str2, "P0Y000DT00000.62-25");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 38, (long) 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.65S" + "'", str2, "P0Y0M0DT0H0M0.65S");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((-1L), false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        boolean boolean11 = token2.equals((java.lang.Object) "P0Y000DT00000.052-35");
        java.lang.Object obj12 = token2.getValue();
        java.lang.Class<?> wildcardClass13 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Class<?> wildcardClass15 = token14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        java.lang.Object obj6 = token3.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 36);
        java.lang.String str9 = token3.toString();
        java.lang.Object obj10 = token3.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj6, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str9, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj10, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str7 = token2.toString();
        int int8 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str10 = token9.toString();
        java.lang.String str11 = token9.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str11, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        token1.increment();
        java.lang.Object obj3 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str5 = token1.toString();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.002SP0Y0M0DT0H0M0.002S" + "'", str5, "P0Y0M0DT0H0M0.002SP0Y0M0DT0H0M0.002S");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) 0, "P0Y000DT00000.7410", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.7410" + "'", str5, "P0Y000DT00000.7410");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        int int9 = token3.getCount();
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 2);
        token3.increment();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) 101, "P0Y000DT00000.0232");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0232" + "'", str3, "P0Y000DT00000.0232");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean6 = token4.equals((java.lang.Object) (short) 100);
        token4.increment();
        java.lang.Object obj8 = token4.getValue();
        token4.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (int) (byte) -1);
        boolean boolean12 = token1.equals((java.lang.Object) token4);
        token4.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int18 = token17.getCount();
        boolean boolean19 = token15.equals((java.lang.Object) token17);
        token17.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token17, 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token22);
        java.lang.String str24 = token22.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str28 = token27.toString();
        boolean boolean30 = token27.equals((java.lang.Object) 100L);
        token27.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token27);
        java.lang.Object obj33 = token27.getValue();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        boolean boolean35 = token22.equals((java.lang.Object) wildcardClass34);
        boolean boolean36 = token4.equals((java.lang.Object) token22);
        org.apache.commons.lang.time.DurationFormatUtils.Token token39 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str40 = token39.toString();
        boolean boolean42 = token39.equals((java.lang.Object) 100L);
        int int43 = token39.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token45 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int46 = token45.getCount();
        boolean boolean48 = token45.equals((java.lang.Object) "0:00:00.99");
        boolean boolean49 = token39.equals((java.lang.Object) "0:00:00.99");
        int int50 = token39.getCount();
        java.lang.Class<?> wildcardClass51 = token39.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token52 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass51);
        boolean boolean53 = token22.equals((java.lang.Object) wildcardClass51);
        int int54 = token22.getCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str24, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str28, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "hi!" + "'", obj33, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str40, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 35 + "'", int43 == 35);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.0983");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0983" + "'", str2, "P0Y000DT00000.0983");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 'a', "P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563" + "'", str3, "P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563P0Y000DT00000.06563");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 1);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 36, "P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1" + "'", str3, "P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1P0Y000DT00000.065-1");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "0 0a000 0 hour 0 0inute00 0 econ00", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str3, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, (long) (short) 10, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 101, "P0Y000DT00000.91100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.91100" + "'", str2, "P0Y000DT00000.91100");
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "mm", 3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean7 = token5.equals((java.lang.Object) (short) 100);
        token5.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        java.lang.String str10 = token5.toString();
        int int11 = token5.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        boolean boolean13 = token2.equals((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str17 = token16.toString();
        boolean boolean19 = token16.equals((java.lang.Object) 100L);
        java.lang.Object obj20 = token16.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16);
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean25 = token23.equals((java.lang.Object) "hi!");
        boolean boolean26 = token16.equals((java.lang.Object) token23);
        java.lang.Object obj27 = token23.getValue();
        boolean boolean28 = token2.equals((java.lang.Object) token23);
        java.lang.String str29 = token23.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "hi!" + "'", obj20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "m" + "'", obj27, "m");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "m" + "'", str29, "m");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str12 = token11.toString();
        boolean boolean14 = token11.equals((java.lang.Object) 100L);
        token11.increment();
        boolean boolean17 = token11.equals((java.lang.Object) "M");
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        boolean boolean20 = token11.equals((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S", 35);
        int int23 = token22.getCount();
        boolean boolean24 = token2.equals((java.lang.Object) int23);
        java.lang.Class<?> wildcardClass25 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token26 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass25);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str30 = token29.toString();
        boolean boolean32 = token29.equals((java.lang.Object) 100L);
        int int33 = token29.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int36 = token35.getCount();
        boolean boolean38 = token35.equals((java.lang.Object) "0:00:00.99");
        boolean boolean39 = token29.equals((java.lang.Object) "0:00:00.99");
        int int40 = token29.getCount();
        java.lang.Class<?> wildcardClass41 = token29.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token42 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass41);
        java.lang.Object obj43 = token42.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token45 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token42, (int) (short) -1);
        boolean boolean46 = token26.equals((java.lang.Object) token42);
        int int47 = token26.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str30, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (byte) 0, "P0Y000DT00000.08610");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.08610" + "'", str3, "P0Y000DT00000.08610");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 2, "P0Y000DT00000.002-2P0Y000DT00000.002-2");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.002-2P0Y000DT00000.002-2" + "'", str3, "P0Y000DT00000.002-2P0Y000DT00000.002-2");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 101, "P0Y000DT00000.001100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.001100" + "'", str3, "P0Y000DT00000.001100");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.470", 52);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 37, (long) '4', "P0Y000DT00000.8990");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.8990" + "'", str3, "P0Y000DT00000.8990");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1" + "'", str3, "P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1P0Y000DT00000.032-1");
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean3 = token1.equals((java.lang.Object) "hi!");
        token1.increment();
        token1.increment();
        int int6 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.061S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0610" + "'", str2, "P0Y000DT00000.0610");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.00137");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00137" + "'", str2, "P0Y000DT00000.00137");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 53, "P0Y0M0DT0H0M0.32S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.3253" + "'", str2, "P0Y000DT00000.3253");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, (int) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        int int7 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.13S", 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int13 = token12.getCount();
        boolean boolean15 = token12.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str16 = token12.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12);
        boolean boolean18 = token10.equals((java.lang.Object) token17);
        boolean boolean19 = token2.equals((java.lang.Object) boolean18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str16, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        java.lang.Class<?> wildcardClass4 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.Object obj9 = token8.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj5 = token2.getValue();
        java.lang.String str6 = token2.toString();
        java.lang.Object obj7 = token2.getValue();
        token2.increment();
        java.lang.Object obj9 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) 'a');
        token2.increment();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "hi!" + "'", obj5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        java.lang.String str10 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str14 = token13.toString();
        boolean boolean16 = token13.equals((java.lang.Object) 100L);
        token13.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        java.lang.Object obj19 = token13.getValue();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        boolean boolean21 = token8.equals((java.lang.Object) wildcardClass20);
        java.lang.Class<?> wildcardClass22 = token8.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str10, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "hi!" + "'", obj19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean13 = token11.equals((java.lang.Object) (short) 100);
        token11.increment();
        java.lang.Object obj15 = token11.getValue();
        token11.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11, (int) (byte) -1);
        boolean boolean19 = token8.equals((java.lang.Object) token11);
        boolean boolean20 = token6.equals((java.lang.Object) token8);
        java.lang.String str21 = token6.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str21, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str21, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 97, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        int int10 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str15 = token14.toString();
        boolean boolean17 = token14.equals((java.lang.Object) 100L);
        java.lang.Object obj18 = token14.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14);
        boolean boolean20 = token11.equals((java.lang.Object) token14);
        java.lang.Class<?> wildcardClass21 = token11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.06437", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06437" + "'", str3, "P0Y000DT00000.06437");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int3 = token1.getCount();
        java.lang.Class<?> wildcardClass4 = token1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32" + "'", str3, "P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32");
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, (long) (short) 1, "P0Y000DT00000.030", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.030" + "'", str5, "P0Y000DT00000.030");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.99100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.99100" + "'", str3, "P0Y000DT00000.99100");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        token8.increment();
        int int10 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int10, (int) (byte) 100);
        java.lang.String str13 = token12.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str13, 3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str13, "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        java.lang.Object obj5 = token2.getValue();
        java.lang.Class<?> wildcardClass6 = token2.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "S" + "'", obj5, "S");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        int int15 = token14.getCount();
        java.lang.Object obj16 = token14.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str20 = token19.toString();
        boolean boolean22 = token19.equals((java.lang.Object) 100L);
        token19.increment();
        boolean boolean25 = token19.equals((java.lang.Object) "M");
        java.lang.String str26 = token19.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token19, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token28);
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token28);
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token30);
        int int32 = token31.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token33 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int32);
        boolean boolean34 = token14.equals((java.lang.Object) int32);
        java.lang.Class<?> wildcardClass35 = token14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str20, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str26, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 100, (long) 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.36S" + "'", str2, "P0Y0M0DT0H0M0.36S");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj8, 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) true);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) true);
        boolean boolean15 = token13.equals((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        boolean boolean17 = token10.equals((java.lang.Object) token16);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16);
        java.lang.Object obj19 = token18.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "true");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "true");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "true");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int7 = token1.getCount();
        token1.increment();
        java.lang.Object obj9 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (-1));
        java.lang.Class<?> wildcardClass12 = token11.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj9, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 52, (long) (byte) 10, "P0Y000DT00000.922");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.922" + "'", str3, "P0Y000DT00000.922");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str12 = token11.toString();
        boolean boolean14 = token11.equals((java.lang.Object) 100L);
        token11.increment();
        boolean boolean17 = token11.equals((java.lang.Object) "M");
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        boolean boolean20 = token11.equals((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean20, (int) (byte) 0);
        java.lang.String str23 = token22.toString();
        token22.increment();
        boolean boolean25 = token1.equals((java.lang.Object) token22);
        java.lang.Object obj26 = token1.getValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "m" + "'", obj26, "m");
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 2, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 0);
        java.lang.Object obj9 = token8.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj9, (int) (short) -1);
        token11.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str16 = token15.toString();
        boolean boolean18 = token15.equals((java.lang.Object) 100L);
        token15.increment();
        boolean boolean21 = token15.equals((java.lang.Object) "M");
        java.lang.String str22 = token15.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15, (int) (byte) 100);
        int int25 = token24.getCount();
        boolean boolean27 = token24.equals((java.lang.Object) (-1L));
        token24.increment();
        boolean boolean29 = token11.equals((java.lang.Object) token24);
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str33 = token32.toString();
        boolean boolean35 = token32.equals((java.lang.Object) 100L);
        token32.increment();
        boolean boolean38 = token32.equals((java.lang.Object) "M");
        java.lang.String str39 = token32.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token41 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token32, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token42 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token41);
        org.apache.commons.lang.time.DurationFormatUtils.Token token43 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token41);
        org.apache.commons.lang.time.DurationFormatUtils.Token token46 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean48 = token46.equals((java.lang.Object) (short) 100);
        token46.increment();
        java.lang.Object obj50 = token46.getValue();
        token46.increment();
        boolean boolean52 = token43.equals((java.lang.Object) token46);
        org.apache.commons.lang.time.DurationFormatUtils.Token token53 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token46);
        org.apache.commons.lang.time.DurationFormatUtils.Token token55 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int56 = token55.getCount();
        boolean boolean58 = token55.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str59 = token55.toString();
        boolean boolean60 = token46.equals((java.lang.Object) str59);
        org.apache.commons.lang.time.DurationFormatUtils.Token token62 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token46, 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token64 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token62, 0);
        int int65 = token64.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token68 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str69 = token68.toString();
        boolean boolean71 = token68.equals((java.lang.Object) 100L);
        token68.increment();
        boolean boolean74 = token68.equals((java.lang.Object) "M");
        java.lang.String str75 = token68.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token77 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token68, (int) (byte) 100);
        int int78 = token77.getCount();
        int int79 = token77.getCount();
        java.lang.Class<?> wildcardClass80 = token77.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token82 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass80, 11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token83 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 11);
        java.lang.Object obj84 = token83.getValue();
        boolean boolean85 = token64.equals((java.lang.Object) token83);
        boolean boolean86 = token11.equals((java.lang.Object) token64);
        token64.increment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str16, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str33, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str39, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "hi!" + "'", obj50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str59, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str69, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str75, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 100 + "'", int79 == 100);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + 11 + "'", obj84, 11);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y0M0DT0H0M0.064S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0640" + "'", str2, "P0Y000DT00000.0640");
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        int int6 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int9 = token8.getCount();
        boolean boolean11 = token8.equals((java.lang.Object) "0:00:00.99");
        boolean boolean12 = token2.equals((java.lang.Object) "0:00:00.99");
        int int13 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int13);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14, (int) (short) 10);
        token14.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1.0d));
        token1.increment();
        java.lang.Object obj3 = token1.getValue();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (-1.0d) + "'", obj3, (-1.0d));
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        token8.increment();
        int int10 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int10, (int) (byte) 100);
        java.lang.Object obj13 = token12.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12, (int) (short) 0);
        java.lang.Object obj17 = token16.getValue();
        java.lang.Object obj18 = token16.getValue();
        java.lang.Object obj19 = token16.getValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 11 + "'", obj13, 11);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.String str2 = token1.toString();
        token1.increment();
        java.lang.Object obj4 = token1.getValue();
        boolean boolean6 = token1.equals((java.lang.Object) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "m" + "'", obj4, "m");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1), 37);
        token2.increment();
        int int4 = token2.getCount();
        token2.increment();
        java.lang.Class<?> wildcardClass6 = token2.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 38 + "'", int4 == 38);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, 0L, "P0Y000DT00000.09911");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09911" + "'", str3, "P0Y000DT00000.09911");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 97, (long) 100, "P0Y000DT00000.0280", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0280" + "'", str5, "P0Y000DT00000.0280");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.5842", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.5842" + "'", str3, "P0Y000DT00000.5842");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94" + "'", str3, "P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94P0Y000DT00000.065-94");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str3, 35);
        int int6 = token5.getCount();
        java.lang.Object obj7 = token5.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1), 37);
        boolean boolean11 = token5.equals((java.lang.Object) token10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean11, (-1));
        int int14 = token13.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean11 = token9.equals((java.lang.Object) "hi!");
        boolean boolean12 = token2.equals((java.lang.Object) token9);
        java.lang.Object obj13 = token9.getValue();
        int int14 = token9.getCount();
        token9.increment();
        java.lang.Class<?> wildcardClass16 = token9.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass16);
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass16, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "m" + "'", obj13, "m");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj5 = token2.getValue();
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 100);
        java.lang.Object obj9 = token8.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "hi!" + "'", obj5, "hi!");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.0338");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0338" + "'", str2, "P0Y000DT00000.0338");
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 37, 0L, "P0Y000DT00000.0610");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0610" + "'", str3, "P0Y000DT00000.0610");
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.String str2 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.001100");
        token14.increment();
        token14.increment();
        java.lang.String str17 = token14.toString();
        boolean boolean18 = token11.equals((java.lang.Object) str17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "P0Y000DT00000.001100P0Y000DT00000.001100P0Y000DT00000.001100" + "'", str17, "P0Y000DT00000.001100P0Y000DT00000.001100P0Y000DT00000.001100");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str2 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.010" + "'", str2, "0:00:00.010");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean18 = token16.equals((java.lang.Object) (short) 100);
        token16.increment();
        java.lang.Object obj20 = token16.getValue();
        token16.increment();
        boolean boolean22 = token13.equals((java.lang.Object) token16);
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int26 = token25.getCount();
        boolean boolean28 = token25.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str29 = token25.toString();
        boolean boolean30 = token16.equals((java.lang.Object) str29);
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16, 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token34 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token32, 0);
        java.lang.Object obj35 = token32.getValue();
        java.lang.String str36 = token32.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token37 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token32);
        token32.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "hi!" + "'", obj20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str29, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str36, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "0:00:00.097");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.097" + "'", str2, "0:00:00.097");
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Class<?> wildcardClass3 = token2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.002");
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 52, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.String str2 = token1.toString();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) 'a');
        java.lang.String str6 = token5.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm" + "'", str6, "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.002SP0Y0M0DT0H0M0.002S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0020P0Y000DT00000.0020" + "'", str3, "P0Y000DT00000.0020P0Y000DT00000.0020");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.003S" + "'", str2, "P0Y0M0DT0H0M0.003S");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        token1.increment();
        java.lang.Object obj3 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str8 = token7.toString();
        boolean boolean10 = token7.equals((java.lang.Object) 100L);
        java.lang.Object obj11 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        boolean boolean13 = token1.equals((java.lang.Object) token7);
        java.lang.Object obj14 = token7.getValue();
        token7.increment();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        boolean boolean11 = token2.equals((java.lang.Object) "P0Y000DT00000.052-35");
        java.lang.Object obj12 = token2.getValue();
        int int13 = token2.getCount();
        java.lang.String str14 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.10100");
        java.lang.Class<?> wildcardClass17 = token16.getClass();
        boolean boolean18 = token2.equals((java.lang.Object) token16);
        java.lang.Class<?> wildcardClass19 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 37 + "'", int13 == 37);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "10.010.0", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10.010.0" + "'", str3, "10.010.0");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        int int9 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) 35, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 11, (long) 3, "P0Y000DT00000.02836", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.02836" + "'", str5, "P0Y000DT00000.02836");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) 'a', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj8, 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) true);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) true);
        boolean boolean15 = token13.equals((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        boolean boolean17 = token10.equals((java.lang.Object) token16);
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16, 2);
        java.lang.Object obj20 = token16.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "true");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "true");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "true");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m", (-1));
        int int4 = token3.getCount();
        token3.increment();
        int int6 = token3.getCount();
        token3.increment();
        java.lang.Class<?> wildcardClass8 = token3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.00100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00100" + "'", str3, "P0Y000DT00000.00100");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        java.lang.Object obj6 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str13 = token12.toString();
        boolean boolean15 = token12.equals((java.lang.Object) 100L);
        token12.increment();
        token12.increment();
        boolean boolean19 = token12.equals((java.lang.Object) "");
        java.lang.Object obj20 = token12.getValue();
        boolean boolean21 = token9.equals((java.lang.Object) token12);
        java.lang.Object obj22 = token12.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str13, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "hi!" + "'", obj20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "hi!" + "'", obj22, "hi!");
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        int int10 = token2.getCount();
        int int11 = token2.getCount();
        int int12 = token2.getCount();
        token2.increment();
        java.lang.Object obj14 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37 + "'", int11 == 37);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37 + "'", int12 == 37);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        token1.increment();
        java.lang.Object obj3 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj5 = token4.getValue();
        java.lang.String str6 = token4.toString();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "P0Y0M0DT0H0M0.002SP0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "P0Y0M0DT0H0M0.002SP0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "P0Y0M0DT0H0M0.002SP0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0Y0M0DT0H0M0.002SP0Y0M0DT0H0M0.002S" + "'", str6, "P0Y0M0DT0H0M0.002SP0Y0M0DT0H0M0.002S");
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int7 = token1.getCount();
        token1.increment();
        java.lang.Object obj9 = token1.getValue();
        token1.increment();
        java.lang.String str11 = token1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj9, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str11, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) (short) 1, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001" + "'", str5, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.0020", (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.0020", (int) (short) 100);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 37);
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        java.lang.Object obj10 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token11.increment();
        int int13 = token11.getCount();
        boolean boolean15 = token11.equals((java.lang.Object) "P0Y000DT00000.06497");
        java.lang.Class<?> wildcardClass16 = token11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1), 37);
        token2.increment();
        int int4 = token2.getCount();
        java.lang.Object obj5 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj5);
        java.lang.Object obj7 = token6.getValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 38 + "'", int4 == 38);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1) + "'", obj5, (-1));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + (-1) + "'", obj7, (-1));
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 100, (int) (short) 10);
        java.lang.Object obj4 = token3.getValue();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 100 + "'", obj4, (short) 100);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean18 = token16.equals((java.lang.Object) (short) 100);
        token16.increment();
        java.lang.Object obj20 = token16.getValue();
        token16.increment();
        boolean boolean22 = token13.equals((java.lang.Object) token16);
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean22);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int26 = token25.getCount();
        int int27 = token25.getCount();
        token25.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token25, 3);
        token30.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token30);
        boolean boolean33 = token23.equals((java.lang.Object) token32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "hi!" + "'", obj20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        java.lang.Object obj7 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str11 = token10.toString();
        boolean boolean13 = token10.equals((java.lang.Object) 100L);
        token10.increment();
        boolean boolean16 = token10.equals((java.lang.Object) "M");
        java.lang.String str17 = token10.toString();
        boolean boolean18 = token2.equals((java.lang.Object) str17);
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean23 = token21.equals((java.lang.Object) (short) 100);
        token21.increment();
        token21.increment();
        int int26 = token21.getCount();
        boolean boolean27 = token2.equals((java.lang.Object) token21);
        java.lang.Object obj28 = token2.getValue();
        token2.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 37 + "'", int26 == 37);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 38, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.10S" + "'", str2, "P0Y0M0DT0H0M0.10S");
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        boolean boolean11 = token2.equals((java.lang.Object) "P0Y000DT00000.052-35");
        java.lang.Object obj12 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100", 35);
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token17, (int) (short) 100);
        boolean boolean20 = token13.equals((java.lang.Object) token17);
        java.lang.Object obj21 = token13.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        java.lang.Object obj2 = token1.getValue();
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean10 = token8.equals((java.lang.Object) (short) 100);
        boolean boolean11 = token1.equals((java.lang.Object) token8);
        java.lang.Class<?> wildcardClass12 = token1.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0d + "'", obj2, 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.78-2", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.78-2" + "'", str3, "P0Y000DT00000.78-2");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 35, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.8332");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.8332" + "'", str2, "P0Y000DT00000.8332");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 1L, "P0Y0M0DT0H0M0.009S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0091" + "'", str5, "P0Y000DT00000.0091");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.String str6 = token2.toString();
        java.lang.Object obj7 = token2.getValue();
        java.lang.String str8 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int16 = token15.getCount();
        java.lang.Object obj17 = token15.getValue();
        java.lang.Class<?> wildcardClass18 = token15.getClass();
        boolean boolean19 = token13.equals((java.lang.Object) wildcardClass18);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        boolean boolean21 = token2.equals((java.lang.Object) token13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "s" + "'", obj17, "s");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.001100");
        java.lang.Object obj2 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj2, 97);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "P0Y000DT00000.001100" + "'", obj2, "P0Y000DT00000.001100");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 1, (int) (byte) 100);
        int int3 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) 11, "P0Y000DT00000.0037");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0037" + "'", str3, "P0Y000DT00000.0037");
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 100, (long) 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.37S" + "'", str2, "P0Y0M0DT0H0M0.37S");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.065-1P0Y000DT00000.065-1", 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.13-35", (int) (short) 0);
        int int3 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass5);
        token6.increment();
        java.lang.String str8 = token6.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "class org.apache.commons.lang.time.DurationFormatUtils$Tokenclass org.apache.commons.lang.time.DurationFormatUtils$Token" + "'", str8, "class org.apache.commons.lang.time.DurationFormatUtils$Tokenclass org.apache.commons.lang.time.DurationFormatUtils$Token");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 10, 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.090S" + "'", str2, "P0Y0M0DT0H0M0.090S");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        java.lang.Object obj7 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str11 = token10.toString();
        boolean boolean13 = token10.equals((java.lang.Object) 100L);
        token10.increment();
        boolean boolean16 = token10.equals((java.lang.Object) "M");
        java.lang.String str17 = token10.toString();
        boolean boolean18 = token2.equals((java.lang.Object) str17);
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str22 = token21.toString();
        boolean boolean24 = token21.equals((java.lang.Object) 100L);
        token21.increment();
        token21.increment();
        boolean boolean28 = token21.equals((java.lang.Object) "");
        boolean boolean29 = token2.equals((java.lang.Object) boolean28);
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str33 = token32.toString();
        boolean boolean35 = token32.equals((java.lang.Object) 100L);
        token32.increment();
        boolean boolean38 = token32.equals((java.lang.Object) "M");
        java.lang.String str39 = token32.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token41 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token32, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token42 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token41);
        org.apache.commons.lang.time.DurationFormatUtils.Token token43 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token41);
        org.apache.commons.lang.time.DurationFormatUtils.Token token46 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean48 = token46.equals((java.lang.Object) (short) 100);
        token46.increment();
        java.lang.Object obj50 = token46.getValue();
        token46.increment();
        boolean boolean52 = token43.equals((java.lang.Object) token46);
        org.apache.commons.lang.time.DurationFormatUtils.Token token53 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token46);
        org.apache.commons.lang.time.DurationFormatUtils.Token token55 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int56 = token55.getCount();
        boolean boolean58 = token55.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str59 = token55.toString();
        boolean boolean60 = token46.equals((java.lang.Object) str59);
        boolean boolean61 = token2.equals((java.lang.Object) token46);
        token2.increment();
        java.lang.Class<?> wildcardClass63 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str33, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str39, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + "hi!" + "'", obj50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str59, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.6552", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6552" + "'", str3, "P0Y000DT00000.6552");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.048S" + "'", str2, "P0Y0M0DT0H0M0.048S");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        token8.increment();
        int int10 = token8.getCount();
        java.lang.Class<?> wildcardClass11 = token8.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass11, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) '#', "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06534P0Y000DT00000.06534P0Y000DT00000.06534" + "'", str3, "P0Y000DT00000.06534P0Y000DT00000.06534P0Y000DT00000.06534");
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.065100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.065100" + "'", str3, "P0Y000DT00000.065100");
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) 35, "P0Y000DT00000.0091", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0091" + "'", str5, "P0Y000DT00000.0091");
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.011-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.011-1" + "'", str2, "P0Y000DT00000.011-1");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10.0d);
        java.lang.String str2 = token1.toString();
        java.lang.Object obj3 = token1.getValue();
        java.lang.String str4 = token1.toString();
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.0" + "'", str2, "10.0");
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 10.0d + "'", obj3, 10.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10.0" + "'", str4, "10.0");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.001100");
        token1.increment();
        java.lang.Object obj3 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y000DT00000.001100" + "'", obj3, "P0Y000DT00000.001100");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 37, (long) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.73S" + "'", str2, "P0Y0M0DT0H0M0.73S");
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) 'a');
        boolean boolean4 = token2.equals((java.lang.Object) (byte) 1);
        java.lang.String str5 = token2.toString();
        java.lang.Object obj6 = token2.getValue();
        java.lang.Object obj7 = null;
        boolean boolean8 = token2.equals(obj7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS" + "'", str5, "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "S" + "'", obj6, "S");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 0);
        java.lang.Class<?> wildcardClass9 = token1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str6, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) 1, "10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(10L, 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        java.lang.String str4 = token2.toString();
        int int5 = token2.getCount();
        java.lang.Class<?> wildcardClass6 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str4, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        java.lang.Object obj7 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int12 = token11.getCount();
        boolean boolean13 = token9.equals((java.lang.Object) token11);
        java.lang.Object obj14 = token11.getValue();
        boolean boolean15 = token2.equals((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0");
        java.lang.Object obj18 = token17.getValue();
        boolean boolean19 = token11.equals(obj18);
        java.lang.String str20 = token11.toString();
        java.lang.Class<?> wildcardClass21 = token11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "0" + "'", obj18, "0");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str20, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 35, "P0Y0M0DT0H0M0.016S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.01635" + "'", str3, "P0Y000DT00000.01635");
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10.0d);
        java.lang.Object obj2 = token1.getValue();
        java.lang.Object obj3 = token1.getValue();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0d + "'", obj2, 10.0d);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 10.0d + "'", obj3, 10.0d);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.471", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.471" + "'", str3, "P0Y000DT00000.471");
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        token1.increment();
        java.lang.Object obj3 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str8 = token7.toString();
        boolean boolean10 = token7.equals((java.lang.Object) 100L);
        java.lang.Object obj11 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        boolean boolean13 = token1.equals((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 'a', (long) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.03S" + "'", str2, "P0Y0M0DT0H0M0.03S");
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 36, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int7 = token6.getCount();
        int int8 = token6.getCount();
        java.lang.Object obj9 = token6.getValue();
        java.lang.Object obj10 = token6.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int15 = token14.getCount();
        boolean boolean16 = token12.equals((java.lang.Object) token14);
        int int17 = token14.getCount();
        boolean boolean18 = token6.equals((java.lang.Object) token14);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, (int) '4');
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.String str6 = token2.toString();
        int int7 = token2.getCount();
        token2.increment();
        java.lang.Object obj9 = token2.getValue();
        token2.increment();
        int int11 = token2.getCount();
        java.lang.String str12 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37 + "'", int11 == 37);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.String str2 = token1.toString();
        token1.increment();
        java.lang.String str4 = token1.toString();
        token1.increment();
        int int6 = token1.getCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mm" + "'", str4, "mm");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (short) 1, "P0Y000DT00000.471", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.471" + "'", str5, "P0Y000DT00000.471");
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        java.lang.Class<?> wildcardClass2 = token1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj8 = token7.getValue();
        java.lang.Class<?> wildcardClass9 = token7.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.String str11 = token10.toString();
        int int12 = token10.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj5 = token2.getValue();
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, (int) (byte) -1);
        int int11 = token10.getCount();
        int int12 = token10.getCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "hi!" + "'", obj5, "hi!");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.001S", 0);
        token2.increment();
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 101, (long) 37, "P0Y000DT00000.05311");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05311" + "'", str3, "P0Y000DT00000.05311");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 39, "P0Y000DT00000.00037");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00037" + "'", str2, "P0Y000DT00000.00037");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.091S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0910" + "'", str3, "P0Y000DT00000.0910");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int9 = token8.getCount();
        boolean boolean11 = token8.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj12 = token8.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16);
        token16.increment();
        boolean boolean20 = token1.equals((java.lang.Object) token16);
        java.lang.Class<?> wildcardClass21 = token16.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj12, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 37, "P0Y000DT00000.48-3", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.48-3" + "'", str3, "P0Y000DT00000.48-3");
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str6 = token5.toString();
        boolean boolean8 = token5.equals((java.lang.Object) 100L);
        token5.increment();
        token5.increment();
        boolean boolean12 = token5.equals((java.lang.Object) "");
        java.lang.Object obj13 = token5.getValue();
        int int14 = token5.getCount();
        boolean boolean15 = token1.equals((java.lang.Object) token5);
        int int16 = token5.getCount();
        java.lang.String str17 = token5.toString();
        token5.increment();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37 + "'", int14 == 37);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 37 + "'", int16 == 37);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        java.lang.Object obj6 = token3.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 36);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str12 = token11.toString();
        boolean boolean14 = token11.equals((java.lang.Object) 100L);
        java.lang.String str15 = token11.toString();
        int int16 = token11.getCount();
        token11.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        int int19 = token18.getCount();
        boolean boolean20 = token3.equals((java.lang.Object) int19);
        token3.increment();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj6, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str7 = token2.toString();
        int int8 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str10 = token9.toString();
        token9.increment();
        token9.increment();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y0M0DT0H0M0.031S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.031100" + "'", str3, "P0Y000DT00000.031100");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) true);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) true, 1);
        java.lang.Class<?> wildcardClass4 = token3.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, (int) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.009-7", 53);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.750");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.750" + "'", str2, "P0Y000DT00000.750");
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        java.lang.String str6 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 3, 0L, "P0Y000DT00000.01032", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.01032" + "'", str5, "P0Y000DT00000.01032");
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 38, (long) (short) -1, "P0Y000DT00000.10-1", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.10-1" + "'", str5, "P0Y000DT00000.10-1");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        int int9 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int9, (int) (byte) 100);
        int int12 = token11.getCount();
        java.lang.String str13 = token11.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37 + "'", int9 == 37);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "37373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737" + "'", str13, "37373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737373737");
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str5 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 0);
        int int9 = token8.getCount();
        token8.increment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 52, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.10-100", (int) ' ');
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        int int12 = token11.getCount();
        boolean boolean14 = token11.equals((java.lang.Object) (-1L));
        int int15 = token11.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        java.lang.Object obj17 = null;
        boolean boolean18 = token11.equals(obj17);
        token11.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.08635", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.08635" + "'", str3, "P0Y000DT00000.08635");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 97, 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.003S" + "'", str2, "P0Y0M0DT0H0M0.003S");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str6 = token5.toString();
        boolean boolean8 = token5.equals((java.lang.Object) 100L);
        token5.increment();
        token5.increment();
        boolean boolean12 = token5.equals((java.lang.Object) "");
        java.lang.Object obj13 = token5.getValue();
        int int14 = token5.getCount();
        boolean boolean15 = token1.equals((java.lang.Object) token5);
        int int16 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int21 = token20.getCount();
        boolean boolean22 = token18.equals((java.lang.Object) token20);
        java.lang.Object obj23 = token20.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token20, 36);
        java.lang.Class<?> wildcardClass26 = token25.getClass();
        boolean boolean27 = token1.equals((java.lang.Object) wildcardClass26);
        java.lang.Class<?> wildcardClass28 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37 + "'", int14 == 37);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj23, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 3, (long) 0, "", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 100, "P0Y0M0DT0H0M0.84S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.8499" + "'", str3, "P0Y000DT00000.8499");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.032S", (int) '4');
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean7 = token5.equals((java.lang.Object) (short) 100);
        token5.increment();
        boolean boolean9 = token2.equals((java.lang.Object) token5);
        int int10 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int10, (int) (short) 0);
        java.lang.Object obj13 = token12.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 52 + "'", obj13, 52);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str5, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj5 = token2.getValue();
        java.lang.String str6 = token2.toString();
        java.lang.Object obj7 = token2.getValue();
        java.lang.Class<?> wildcardClass8 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass8);
        token9.increment();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "hi!" + "'", obj5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0" + "'", str3, "100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.900", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.900" + "'", str3, "P0Y000DT00000.900");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 97, "P0Y0M0DT0H0M0.102S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.10297" + "'", str2, "P0Y000DT00000.10297");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y000DT00000.033", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.033" + "'", str3, "P0Y000DT00000.033");
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 2, "P0Y000DT00000.024-37", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.024-37" + "'", str5, "P0Y000DT00000.024-37");
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(100L, (long) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.35S" + "'", str2, "P0Y0M0DT0H0M0.35S");
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 36, "P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653" + "'", str2, "P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653");
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean18 = token16.equals((java.lang.Object) (short) 100);
        token16.increment();
        java.lang.Object obj20 = token16.getValue();
        token16.increment();
        boolean boolean22 = token13.equals((java.lang.Object) token16);
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int26 = token25.getCount();
        boolean boolean28 = token25.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str29 = token25.toString();
        boolean boolean30 = token16.equals((java.lang.Object) str29);
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16, 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token34 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token32, 0);
        int int35 = token34.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token36 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token34);
        token34.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "hi!" + "'", obj20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str29, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token1.increment();
        java.lang.String str7 = token1.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mm" + "'", str7, "mm");
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 0, "P0Y000DT00000.83-37");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.83-37" + "'", str3, "P0Y000DT00000.83-37");
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "0:00:00.052", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.052" + "'", str3, "0:00:00.052");
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        java.lang.String str10 = token2.toString();
        java.lang.Class<?> wildcardClass11 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        java.lang.String str6 = token1.toString();
        java.lang.Object obj7 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str11 = token10.toString();
        boolean boolean13 = token10.equals((java.lang.Object) 100L);
        token10.increment();
        token10.increment();
        boolean boolean17 = token10.equals((java.lang.Object) "");
        int int18 = token10.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int18);
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str23 = token22.toString();
        boolean boolean25 = token22.equals((java.lang.Object) 100L);
        java.lang.Object obj26 = token22.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token22);
        boolean boolean28 = token19.equals((java.lang.Object) token22);
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token22, 100);
        token22.increment();
        boolean boolean32 = token1.equals((java.lang.Object) token22);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "m" + "'", str6, "m");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "m" + "'", obj7, "m");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37 + "'", int18 == 37);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str23, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "hi!" + "'", obj26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        token1.increment();
        token1.increment();
        token1.increment();
        boolean boolean6 = token1.equals((java.lang.Object) "0");
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str9 = token8.toString();
        boolean boolean10 = token1.equals((java.lang.Object) token8);
        java.lang.Object obj11 = token8.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, 0);
        token13.increment();
        java.lang.String str15 = token13.toString();
        java.lang.String str16 = token13.toString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.010" + "'", str9, "0:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "0:00:00.010" + "'", obj11, "0:00:00.010");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0:00:00.010" + "'", str15, "0:00:00.010");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.010" + "'", str16, "0:00:00.010");
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 101, (long) 101, "falsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalse");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fal00000000000000000000000000000000000efalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefale" + "'", str3, "fal00000000000000000000000000000000000efalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefale");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.05235", (int) (byte) -1);
        token2.increment();
        int int4 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        int int9 = token2.getCount();
        java.lang.String str10 = token2.toString();
        java.lang.Object obj11 = token2.getValue();
        java.lang.String str12 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37 + "'", int9 == 37);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', 10L, "0:00:00.99", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.99" + "'", str5, "0:00:00.99");
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(1L, (long) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.096S" + "'", str2, "P0Y0M0DT0H0M0.096S");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y0M0DT0H0M0.67S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.67-1" + "'", str3, "P0Y000DT00000.67-1");
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 0);
        token1.increment();
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, 1L, "P0Y000DT00000.08698");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.08698" + "'", str3, "P0Y000DT00000.08698");
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 37, (long) 2, "P0Y000DT00000.6597");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6597" + "'", str3, "P0Y000DT00000.6597");
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(1L, (long) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.034S" + "'", str2, "P0Y0M0DT0H0M0.034S");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token3.increment();
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y0M0DT0H0M0.98S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-1" + "'", str3, "P0Y000DT00000.98-1");
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        java.lang.Object obj7 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int12 = token11.getCount();
        boolean boolean13 = token9.equals((java.lang.Object) token11);
        java.lang.Object obj14 = token11.getValue();
        boolean boolean15 = token2.equals((java.lang.Object) token11);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18, 38);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.10064", (int) '4');
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 0);
        int int5 = token4.getCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        token8.increment();
        int int10 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int10, (int) (byte) 100);
        java.lang.String str13 = token12.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str13, 3);
        java.lang.Class<?> wildcardClass16 = token15.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str13, "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 52, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str5 = token4.toString();
        boolean boolean7 = token4.equals((java.lang.Object) 100L);
        token4.increment();
        token4.increment();
        boolean boolean11 = token4.equals((java.lang.Object) "");
        boolean boolean13 = token4.equals((java.lang.Object) "P0Y000DT00000.052-35");
        java.lang.Object obj14 = token4.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        boolean boolean16 = token1.equals((java.lang.Object) token4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str5, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int7 = token6.getCount();
        boolean boolean9 = token6.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj10 = token6.getValue();
        java.lang.String str11 = token6.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str15 = token14.toString();
        boolean boolean17 = token14.equals((java.lang.Object) 100L);
        int int18 = token14.getCount();
        boolean boolean19 = token6.equals((java.lang.Object) token14);
        boolean boolean20 = token2.equals((java.lang.Object) token14);
        int int21 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int21, 0);
        token23.increment();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj10, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str11, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str3, 35);
        token5.increment();
        java.lang.String str7 = token5.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 39, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean3 = token1.equals((java.lang.Object) "hi!");
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 10);
        java.lang.Object obj7 = token6.getValue();
        java.lang.Object obj8 = token6.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        java.lang.Object obj10 = token6.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "mm");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "mm");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "mm");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "mm");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "mm");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "mm");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "mm");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "mm");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "mm");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0340" + "'", str2, "P0Y000DT00000.0340");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int7 = token6.getCount();
        boolean boolean9 = token6.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj10 = token6.getValue();
        java.lang.String str11 = token6.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str15 = token14.toString();
        boolean boolean17 = token14.equals((java.lang.Object) 100L);
        int int18 = token14.getCount();
        boolean boolean19 = token6.equals((java.lang.Object) token14);
        boolean boolean20 = token2.equals((java.lang.Object) token14);
        int int21 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str26 = token25.toString();
        boolean boolean28 = token25.equals((java.lang.Object) 100L);
        token25.increment();
        token25.increment();
        boolean boolean32 = token25.equals((java.lang.Object) "");
        int int33 = token25.getCount();
        int int34 = token25.getCount();
        java.lang.String str35 = token25.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token36 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token25);
        boolean boolean37 = token22.equals((java.lang.Object) token36);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj10, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str11, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str26, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 37 + "'", int33 == 37);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 37 + "'", int34 == 37);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str35, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 11, "P0Y0M0DT0H0M0.66S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6611" + "'", str3, "P0Y000DT00000.6611");
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 97, (long) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.13S" + "'", str2, "P0Y0M0DT0H0M0.13S");
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.13S", 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int5 = token4.getCount();
        boolean boolean7 = token4.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str8 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        boolean boolean10 = token2.equals((java.lang.Object) token9);
        java.lang.Object obj11 = token9.getValue();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str8, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(1L, (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.051S" + "'", str2, "P0Y0M0DT0H0M0.051S");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.029S" + "'", str2, "P0Y0M0DT0H0M0.029S");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 11, (long) 97, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06586" + "'", str3, "P0Y000DT00000.06586");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        int int6 = token2.getCount();
        token2.increment();
        token2.increment();
        java.lang.Object obj9 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) 39, "P0Y000DT00000.00336");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00336" + "'", str3, "P0Y000DT00000.00336");
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "0 days", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0a00" + "'", str3, "0 0a00");
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 32, "P0Y000DT00000.92-26", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.92-26" + "'", str5, "P0Y000DT00000.92-26");
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean3 = token1.equals((java.lang.Object) "hi!");
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str6 = token5.toString();
        java.lang.Class<?> wildcardClass7 = token5.getClass();
        boolean boolean8 = token1.equals((java.lang.Object) wildcardClass7);
        java.lang.Object obj9 = token1.getValue();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str14 = token13.toString();
        boolean boolean16 = token13.equals((java.lang.Object) 100L);
        int int17 = token13.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int20 = token19.getCount();
        boolean boolean22 = token19.equals((java.lang.Object) "0:00:00.99");
        boolean boolean23 = token13.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj24 = token13.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token26 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj24, (int) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean31 = token29.equals((java.lang.Object) (short) 100);
        token29.increment();
        java.lang.Object obj33 = token29.getValue();
        token29.increment();
        boolean boolean35 = token26.equals((java.lang.Object) token29);
        boolean boolean36 = token1.equals((java.lang.Object) token26);
        token26.increment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0:00:00.010" + "'", str6, "0:00:00.010");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "m" + "'", obj9, "m");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "hi!" + "'", obj24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "hi!" + "'", obj33, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.03225");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03225" + "'", str2, "P0Y000DT00000.03225");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.65S", 100);
        int int3 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str7 = token6.toString();
        boolean boolean9 = token6.equals((java.lang.Object) 100L);
        int int10 = token6.getCount();
        token6.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        boolean boolean13 = token2.equals((java.lang.Object) token12);
        java.lang.String str14 = token12.toString();
        int int15 = token12.getCount();
        java.lang.Object obj16 = token12.getValue();
        java.lang.Class<?> wildcardClass17 = token12.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str5 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str7 = token6.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str11 = token10.toString();
        boolean boolean13 = token10.equals((java.lang.Object) 100L);
        token10.increment();
        java.lang.Object obj15 = token10.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj15, (int) '#');
        java.lang.Object obj18 = token17.getValue();
        boolean boolean19 = token6.equals((java.lang.Object) token17);
        token6.increment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str7, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int7 = token1.getCount();
        token1.increment();
        java.lang.Object obj9 = token1.getValue();
        java.lang.Object obj10 = token1.getValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj9, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj10, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 54, "P0Y000DT00000.033");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.033" + "'", str2, "P0Y000DT00000.033");
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, 1L, "P0Y000DT00000.10065", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.10065" + "'", str5, "P0Y000DT00000.10065");
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100", 35);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, (int) (short) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int11 = token10.getCount();
        boolean boolean12 = token8.equals((java.lang.Object) token10);
        token10.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10, 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15);
        int int17 = token15.getCount();
        int int18 = token15.getCount();
        boolean boolean19 = token3.equals((java.lang.Object) token15);
        int int20 = token3.getCount();
        java.lang.Object obj21 = token3.getValue();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "P0Y000DT00000.100" + "'", obj21, "P0Y000DT00000.100");
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        int int12 = token11.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str16 = token15.toString();
        boolean boolean18 = token15.equals((java.lang.Object) 100L);
        token15.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15);
        token15.increment();
        int int22 = token15.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str26 = token25.toString();
        boolean boolean28 = token25.equals((java.lang.Object) 100L);
        token25.increment();
        boolean boolean31 = token25.equals((java.lang.Object) "M");
        java.lang.String str32 = token25.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token34 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token25, (int) (byte) 100);
        java.lang.Class<?> wildcardClass35 = token34.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token36 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token34);
        boolean boolean37 = token15.equals((java.lang.Object) token36);
        org.apache.commons.lang.time.DurationFormatUtils.Token token39 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token36, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token41 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token43 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int44 = token43.getCount();
        boolean boolean45 = token41.equals((java.lang.Object) token43);
        token43.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token48 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token43, 10);
        token48.increment();
        int int50 = token48.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token52 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int50, (int) (byte) 100);
        java.lang.String str53 = token52.toString();
        java.lang.Object obj54 = token52.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token56 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj54, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token58 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 0, (int) (byte) -1);
        token58.increment();
        boolean boolean60 = token39.equals((java.lang.Object) token58);
        boolean boolean61 = token11.equals((java.lang.Object) token39);
        int int62 = token39.getCount();
        java.lang.Object obj63 = token39.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str16, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 37 + "'", int22 == 37);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str26, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str32, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 11 + "'", int50 == 11);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str53, "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 11 + "'", obj54, 11);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertNotNull(obj63);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str12 = token11.toString();
        boolean boolean14 = token11.equals((java.lang.Object) 100L);
        token11.increment();
        boolean boolean17 = token11.equals((java.lang.Object) "M");
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        boolean boolean20 = token11.equals((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S", 35);
        int int23 = token22.getCount();
        boolean boolean24 = token2.equals((java.lang.Object) int23);
        java.lang.Class<?> wildcardClass25 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token26 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass25);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str30 = token29.toString();
        boolean boolean32 = token29.equals((java.lang.Object) 100L);
        int int33 = token29.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int36 = token35.getCount();
        boolean boolean38 = token35.equals((java.lang.Object) "0:00:00.99");
        boolean boolean39 = token29.equals((java.lang.Object) "0:00:00.99");
        int int40 = token29.getCount();
        java.lang.Class<?> wildcardClass41 = token29.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token42 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass41);
        java.lang.Object obj43 = token42.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token45 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token42, (int) (short) -1);
        boolean boolean46 = token26.equals((java.lang.Object) token42);
        java.lang.Object obj47 = null;
        boolean boolean48 = token26.equals(obj47);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str30, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 35 + "'", int40 == 35);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.65-97");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.65-97" + "'", str2, "P0Y000DT00000.65-97");
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 52, 1L, "P0Y000DT00000.101-48", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.101-48" + "'", str5, "P0Y000DT00000.101-48");
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        java.lang.Object obj7 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int12 = token11.getCount();
        boolean boolean13 = token9.equals((java.lang.Object) token11);
        java.lang.Object obj14 = token11.getValue();
        boolean boolean15 = token2.equals((java.lang.Object) token11);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 1);
        int int19 = token18.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.0020", (int) (short) 1);
        boolean boolean23 = token18.equals((java.lang.Object) token22);
        java.lang.String str24 = token22.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str28 = token27.toString();
        boolean boolean30 = token27.equals((java.lang.Object) 100L);
        token27.increment();
        boolean boolean33 = token27.equals((java.lang.Object) "M");
        java.lang.String str34 = token27.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token36 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token27, (int) (byte) 100);
        int int37 = token36.getCount();
        boolean boolean39 = token36.equals((java.lang.Object) (-1L));
        org.apache.commons.lang.time.DurationFormatUtils.Token token41 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token36, 11);
        boolean boolean42 = token22.equals((java.lang.Object) 11);
        boolean boolean44 = token22.equals((java.lang.Object) "11111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "P0Y000DT00000.0020" + "'", str24, "P0Y000DT00000.0020");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str28, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str34, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100");
        java.lang.String str9 = token8.toString();
        boolean boolean10 = token2.equals((java.lang.Object) token8);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0Y000DT00000.100" + "'", str9, "P0Y000DT00000.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.98S" + "'", str2, "P0Y0M0DT0H0M0.98S");
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        java.lang.Object obj4 = token1.getValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "s" + "'", obj4, "s");
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 101, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        token1.increment();
        java.lang.String str3 = token1.toString();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) 100);
        boolean boolean10 = token1.equals((java.lang.Object) "S");
        java.lang.String str11 = token1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mm" + "'", str3, "mm");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mmm" + "'", str11, "mmm");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 35, (long) (byte) 100, "P0Y0M0DT0H0M0.13S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1365" + "'", str3, "P0Y000DT00000.1365");
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 39, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 3, (long) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.029S" + "'", str2, "P0Y0M0DT0H0M0.029S");
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) 100, "P0Y000DT00000.009-7");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.009-7" + "'", str3, "P0Y000DT00000.009-7");
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) ' ', "P0Y0M0DT0H0M0.027S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02722" + "'", str3, "P0Y000DT00000.02722");
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 10, "P0Y000DT00000.0310");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0310" + "'", str2, "P0Y000DT00000.0310");
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "fal0efalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefale");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fal0efalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefale" + "'", str2, "fal0efalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefale");
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 35, "P0Y000DT00000.78-2");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.78-2" + "'", str2, "P0Y000DT00000.78-2");
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        boolean boolean11 = token2.equals((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S", 35);
        java.lang.Object obj14 = token13.getValue();
        java.lang.String str15 = token13.toString();
        int int16 = token13.getCount();
        java.lang.Object obj17 = token13.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        java.lang.Object obj19 = token13.getValue();
        token13.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str15, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj17, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj19, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 35, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        int int10 = token2.getCount();
        int int11 = token2.getCount();
        int int12 = token2.getCount();
        java.lang.Object obj13 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str17 = token16.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16, (int) (byte) 100);
        boolean boolean20 = token2.equals((java.lang.Object) token19);
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int23 = token22.getCount();
        boolean boolean25 = token22.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj26 = token22.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token22);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token27, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token27);
        boolean boolean31 = token2.equals((java.lang.Object) token30);
        boolean boolean33 = token30.equals((java.lang.Object) 37);
        java.lang.Class<?> wildcardClass34 = token30.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37 + "'", int11 == 37);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37 + "'", int12 == 37);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj26, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 35, (long) 10, "P0Y000DT00000.09052");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09052" + "'", str3, "P0Y000DT00000.09052");
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "-1");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "-1");
        java.lang.Class<?> wildcardClass5 = token4.getClass();
        boolean boolean6 = token1.equals((java.lang.Object) wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 11, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        int int12 = token11.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str16 = token15.toString();
        boolean boolean18 = token15.equals((java.lang.Object) 100L);
        token15.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15);
        token15.increment();
        int int22 = token15.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str26 = token25.toString();
        boolean boolean28 = token25.equals((java.lang.Object) 100L);
        token25.increment();
        boolean boolean31 = token25.equals((java.lang.Object) "M");
        java.lang.String str32 = token25.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token34 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token25, (int) (byte) 100);
        java.lang.Class<?> wildcardClass35 = token34.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token36 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token34);
        boolean boolean37 = token15.equals((java.lang.Object) token36);
        org.apache.commons.lang.time.DurationFormatUtils.Token token39 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token36, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token41 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token43 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int44 = token43.getCount();
        boolean boolean45 = token41.equals((java.lang.Object) token43);
        token43.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token48 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token43, 10);
        token48.increment();
        int int50 = token48.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token52 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int50, (int) (byte) 100);
        java.lang.String str53 = token52.toString();
        java.lang.Object obj54 = token52.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token56 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj54, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token58 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 0, (int) (byte) -1);
        token58.increment();
        boolean boolean60 = token39.equals((java.lang.Object) token58);
        boolean boolean61 = token11.equals((java.lang.Object) token39);
        org.apache.commons.lang.time.DurationFormatUtils.Token token63 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int64 = token63.getCount();
        int int65 = token63.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token68 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str69 = token68.toString();
        boolean boolean71 = token68.equals((java.lang.Object) 100L);
        token68.increment();
        token68.increment();
        boolean boolean75 = token68.equals((java.lang.Object) "");
        token68.increment();
        boolean boolean77 = token63.equals((java.lang.Object) token68);
        boolean boolean78 = token39.equals((java.lang.Object) token63);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str16, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 37 + "'", int22 == 37);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str26, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str32, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 11 + "'", int50 == 11);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str53, "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 11 + "'", obj54, 11);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str69, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.890", 11);
        int int3 = token2.getCount();
        int int4 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 3, "P0Y000DT00000.99100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.99100" + "'", str2, "P0Y000DT00000.99100");
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y0M0DT0H0M0.68S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.681" + "'", str2, "P0Y000DT00000.681");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        token1.increment();
        java.lang.Object obj3 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str8 = token7.toString();
        boolean boolean10 = token7.equals((java.lang.Object) 100L);
        java.lang.Object obj11 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        boolean boolean13 = token1.equals((java.lang.Object) token7);
        java.lang.Class<?> wildcardClass14 = token1.getClass();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (byte) 100, "P0Y000DT00000.3834", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.3834" + "'", str5, "P0Y000DT00000.3834");
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean3 = token1.equals((java.lang.Object) "hi!");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        token6.increment();
        boolean boolean8 = token1.equals((java.lang.Object) token6);
        int int9 = token6.getCount();
        int int10 = token6.getCount();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        token8.increment();
        int int10 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int10, (int) (byte) 100);
        java.lang.String str13 = token12.toString();
        java.lang.Object obj14 = token12.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj14, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.014S", (int) (short) 100);
        boolean boolean20 = token16.equals((java.lang.Object) token19);
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str24 = token23.toString();
        boolean boolean26 = token23.equals((java.lang.Object) 100L);
        token23.increment();
        java.lang.Object obj28 = token23.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj28, (int) '#');
        java.lang.String str31 = token30.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str31);
        org.apache.commons.lang.time.DurationFormatUtils.Token token34 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token32, 2);
        java.lang.Class<?> wildcardClass35 = token32.getClass();
        boolean boolean36 = token19.equals((java.lang.Object) token32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str13, "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 11 + "'", obj14, 11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str24, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str31, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 1L, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, (int) (short) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1);
        java.lang.String str17 = token16.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16, 36);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1" + "'", str17, "-1");
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        int int10 = token8.getCount();
        token8.increment();
        java.lang.Object obj12 = token8.getValue();
        java.lang.Object obj13 = token8.getValue();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10L);
        java.lang.Object obj2 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean6 = token4.equals((java.lang.Object) "hi!");
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (int) ' ');
        java.lang.String str9 = token8.toString();
        boolean boolean10 = token1.equals((java.lang.Object) token8);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10L + "'", obj2, 10L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm" + "'", str9, "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) 'a');
        java.lang.Object obj3 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj3);
        int int5 = token4.getCount();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "S" + "'", obj3, "S");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 39, "P0Y000DT00000.031100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.031100" + "'", str3, "P0Y000DT00000.031100");
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.1310", 10);
        java.lang.Object obj3 = token2.getValue();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y000DT00000.1310" + "'", obj3, "P0Y000DT00000.1310");
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int2 = token1.getCount();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        token1.increment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 3, (long) 10, "P0Y0M0DT0H0M0.95S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.957" + "'", str3, "P0Y000DT00000.957");
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        int int14 = token13.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) 'a');
        boolean boolean19 = token17.equals((java.lang.Object) (byte) 1);
        boolean boolean20 = token13.equals((java.lang.Object) token17);
        int int21 = token13.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 52, (long) (short) 10, "P0Y0M0DT0H0M0.67S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.67-42" + "'", str5, "P0Y000DT00000.67-42");
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14);
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14, (int) (short) 100);
        java.lang.Object obj18 = token14.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj6, (int) '#');
        token8.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        int int12 = token11.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int12, 10);
        token14.increment();
        boolean boolean16 = token8.equals((java.lang.Object) token14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        java.lang.Object obj2 = token1.getValue();
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean10 = token8.equals((java.lang.Object) (short) 100);
        boolean boolean11 = token1.equals((java.lang.Object) token8);
        java.lang.Object obj12 = token8.getValue();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0d + "'", obj2, 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int7 = token6.getCount();
        boolean boolean9 = token6.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj10 = token6.getValue();
        java.lang.String str11 = token6.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str15 = token14.toString();
        boolean boolean17 = token14.equals((java.lang.Object) 100L);
        int int18 = token14.getCount();
        boolean boolean19 = token6.equals((java.lang.Object) token14);
        boolean boolean20 = token2.equals((java.lang.Object) token14);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str25 = token24.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str25, 35);
        boolean boolean29 = token27.equals((java.lang.Object) 'a');
        boolean boolean30 = token2.equals((java.lang.Object) token27);
        java.lang.Object obj31 = token2.getValue();
        token2.increment();
        java.lang.Object obj33 = token2.getValue();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj10, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str11, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "S" + "'", obj31, "S");
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "S" + "'", obj33, "S");
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.001S", 0);
        int int3 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        int int10 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str15 = token14.toString();
        boolean boolean17 = token14.equals((java.lang.Object) 100L);
        java.lang.Object obj18 = token14.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14);
        boolean boolean20 = token11.equals((java.lang.Object) token14);
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14, 100);
        java.lang.String str23 = token14.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str23, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (byte) 0);
        java.lang.String str9 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        java.lang.Object obj4 = token1.getValue();
        java.lang.String str5 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj7 = token6.getValue();
        int int8 = token6.getCount();
        int int9 = token6.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj4, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.65S", 100);
        java.lang.Object obj3 = token2.getValue();
        int int4 = token2.getCount();
        int int5 = token2.getCount();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.65S" + "'", obj3, "P0Y0M0DT0H0M0.65S");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int7 = token6.getCount();
        int int8 = token6.getCount();
        java.lang.Object obj9 = token6.getValue();
        java.lang.Object obj10 = token6.getValue();
        java.lang.Class<?> wildcardClass11 = token6.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 52, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str2, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str5 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str7 = token6.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str11 = token10.toString();
        boolean boolean13 = token10.equals((java.lang.Object) 100L);
        token10.increment();
        java.lang.Object obj15 = token10.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj15, (int) '#');
        java.lang.Object obj18 = token17.getValue();
        boolean boolean19 = token6.equals((java.lang.Object) token17);
        java.lang.String str20 = token17.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str7, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str20, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        token8.increment();
        int int10 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int10, (int) (byte) 100);
        java.lang.String str13 = token12.toString();
        java.lang.Object obj14 = token12.getValue();
        java.lang.String str15 = token12.toString();
        java.lang.Object obj16 = token12.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str20 = token19.toString();
        boolean boolean22 = token19.equals((java.lang.Object) 100L);
        token19.increment();
        boolean boolean25 = token19.equals((java.lang.Object) "M");
        java.lang.String str26 = token19.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token19, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token28);
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token29, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token31);
        boolean boolean33 = token12.equals((java.lang.Object) token31);
        java.lang.String str34 = token12.toString();
        java.lang.String str35 = token12.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str13, "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 11 + "'", obj14, 11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str15, "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 11 + "'", obj16, 11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str20, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str26, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str34, "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str35, "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        int int6 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int9 = token8.getCount();
        boolean boolean11 = token8.equals((java.lang.Object) "0:00:00.99");
        boolean boolean12 = token2.equals((java.lang.Object) "0:00:00.99");
        int int13 = token2.getCount();
        int int14 = token2.getCount();
        java.lang.Object obj15 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj15, (int) '4');
        java.lang.Object obj18 = token17.getValue();
        int int19 = token17.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) 10, "P0Y000DT00000.053-33", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.053-33" + "'", str5, "P0Y000DT00000.053-33");
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int8 = token7.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, (int) (short) 100);
        java.lang.Object obj11 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, 53);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str17 = token16.toString();
        java.lang.Class<?> wildcardClass18 = token16.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16, (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token20);
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token20);
        boolean boolean23 = token13.equals((java.lang.Object) token20);
        java.lang.Object obj24 = token13.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 38, "00000000000000000000", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000000000000" + "'", str3, "00000000000000000000");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.00468");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 38, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        int int12 = token11.getCount();
        int int13 = token11.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        token15.increment();
        java.lang.Object obj17 = token15.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15);
        boolean boolean19 = token11.equals((java.lang.Object) token18);
        int int20 = token11.getCount();
        java.lang.Object obj21 = token11.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj17, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.13S", 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int5 = token4.getCount();
        boolean boolean7 = token4.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str8 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        boolean boolean10 = token2.equals((java.lang.Object) token9);
        int int11 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int16 = token15.getCount();
        boolean boolean17 = token13.equals((java.lang.Object) token15);
        java.lang.Object obj18 = token15.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15, 36);
        token20.increment();
        token20.increment();
        boolean boolean23 = token2.equals((java.lang.Object) token20);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int28 = token27.getCount();
        boolean boolean29 = token25.equals((java.lang.Object) token27);
        token27.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token27, 10);
        int int33 = token27.getCount();
        java.lang.String str34 = token27.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token36 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token27, 35);
        boolean boolean37 = token2.equals((java.lang.Object) 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str8, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj18, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str34, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 39, (long) 1, "P0Y000DT00000.0861", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0861" + "'", str5, "P0Y000DT00000.0861");
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.038-36");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.038-36" + "'", str2, "P0Y000DT00000.038-36");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str2 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str10 = token9.toString();
        java.lang.Object obj11 = token9.getValue();
        java.lang.String str12 = token9.toString();
        boolean boolean13 = token4.equals((java.lang.Object) str12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.010" + "'", str2, "0:00:00.010");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "S" + "'", obj11, "S");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        boolean boolean11 = token2.equals((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S", 35);
        java.lang.Object obj14 = token13.getValue();
        java.lang.String str15 = token13.toString();
        token13.increment();
        java.lang.Class<?> wildcardClass17 = token13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str15, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.String str2 = token1.toString();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        token4.increment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100", 35);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, (int) (short) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        token3.increment();
        java.lang.Object obj8 = token3.getValue();
        java.lang.Object obj9 = token3.getValue();
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "P0Y000DT00000.100" + "'", obj8, "P0Y000DT00000.100");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "P0Y000DT00000.100" + "'", obj9, "P0Y000DT00000.100");
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 100, "P0Y0M0DT0H0M0.009S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.009101" + "'", str5, "P0Y000DT00000.009101");
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 39, "P0Y0M0DT0H0M0.034S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03439" + "'", str2, "P0Y000DT00000.03439");
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean18 = token16.equals((java.lang.Object) (short) 100);
        token16.increment();
        java.lang.Object obj20 = token16.getValue();
        token16.increment();
        boolean boolean22 = token13.equals((java.lang.Object) token16);
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int26 = token25.getCount();
        boolean boolean28 = token25.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str29 = token25.toString();
        boolean boolean30 = token16.equals((java.lang.Object) str29);
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16, 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token34 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token32, 0);
        java.lang.Object obj35 = token32.getValue();
        java.lang.String str36 = token32.toString();
        java.lang.Object obj37 = token32.getValue();
        java.lang.String str38 = token32.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "hi!" + "'", obj20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str29, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str36, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str38, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 39, "P0Y000DT00000.0642", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0642" + "'", str5, "P0Y000DT00000.0642");
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 'a', "P0Y000DT00000.91100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.91100" + "'", str5, "P0Y000DT00000.91100");
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', 10L, "P0Y000DT00000.05311", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.05311" + "'", str5, "P0Y000DT00000.05311");
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.95S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9510" + "'", str3, "P0Y000DT00000.9510");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str7 = token6.toString();
        boolean boolean9 = token6.equals((java.lang.Object) 100L);
        token6.increment();
        token6.increment();
        boolean boolean13 = token6.equals((java.lang.Object) "");
        token6.increment();
        boolean boolean15 = token1.equals((java.lang.Object) token6);
        int int16 = token6.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int16, 52);
        token18.increment();
        token18.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0");
        boolean boolean23 = token18.equals((java.lang.Object) token22);
        int int24 = token18.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token26 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18, 52);
        int int27 = token18.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 38 + "'", int16 == 38);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 54 + "'", int24 == 54);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 54 + "'", int27 == 54);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) 54, "P0Y000DT00000.0900");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0900" + "'", str3, "P0Y000DT00000.0900");
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.990", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.990" + "'", str3, "P0Y000DT00000.990");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 52);
        java.lang.String str9 = token2.toString();
        token2.increment();
        java.lang.Class<?> wildcardClass11 = token2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        boolean boolean11 = token2.equals((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S", 35);
        java.lang.Object obj14 = token13.getValue();
        java.lang.String str15 = token13.toString();
        int int16 = token13.getCount();
        java.lang.Object obj17 = token13.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        java.lang.Object obj19 = token18.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str15, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj17, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 36, "P0Y000DT00000.10100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.10100" + "'", str2, "P0Y000DT00000.10100");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.65-101", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.65-101" + "'", str3, "P0Y000DT00000.65-101");
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 1, "P0Y000DT00000.0001", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0001" + "'", str5, "P0Y000DT00000.0001");
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        token11.increment();
        token11.increment();
        int int14 = token11.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 38, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "11111111111111111111111111111111", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11111111111111111111111111111111" + "'", str3, "11111111111111111111111111111111");
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 36, (long) 54, "P0Y000DT00000.0980", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0980" + "'", str5, "P0Y000DT00000.0980");
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.031-97");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.031-97" + "'", str2, "P0Y000DT00000.031-97");
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, (int) ' ');
        int int11 = token6.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 36, 39);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str3 = token2.toString();
        java.lang.String str4 = token2.toString();
        java.lang.String str5 = token2.toString();
        java.lang.String str6 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str3, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str4, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str5, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str6, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, 10L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.010S" + "'", str2, "P0Y0M0DT0H0M0.010S");
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 10, (-1L), "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str5, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean3 = token1.equals((java.lang.Object) "hi!");
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 10);
        java.lang.Object obj7 = token6.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str12 = token11.toString();
        boolean boolean14 = token11.equals((java.lang.Object) 100L);
        java.lang.Object obj15 = token11.getValue();
        java.lang.Object obj16 = token11.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str20 = token19.toString();
        boolean boolean22 = token19.equals((java.lang.Object) 100L);
        token19.increment();
        boolean boolean25 = token19.equals((java.lang.Object) "M");
        java.lang.String str26 = token19.toString();
        boolean boolean27 = token11.equals((java.lang.Object) str26);
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str31 = token30.toString();
        boolean boolean33 = token30.equals((java.lang.Object) 100L);
        token30.increment();
        token30.increment();
        boolean boolean37 = token30.equals((java.lang.Object) "");
        boolean boolean38 = token11.equals((java.lang.Object) boolean37);
        org.apache.commons.lang.time.DurationFormatUtils.Token token41 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str42 = token41.toString();
        boolean boolean44 = token41.equals((java.lang.Object) 100L);
        token41.increment();
        boolean boolean47 = token41.equals((java.lang.Object) "M");
        java.lang.String str48 = token41.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token50 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token41, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token51 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token50);
        org.apache.commons.lang.time.DurationFormatUtils.Token token52 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token50);
        org.apache.commons.lang.time.DurationFormatUtils.Token token55 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean57 = token55.equals((java.lang.Object) (short) 100);
        token55.increment();
        java.lang.Object obj59 = token55.getValue();
        token55.increment();
        boolean boolean61 = token52.equals((java.lang.Object) token55);
        org.apache.commons.lang.time.DurationFormatUtils.Token token62 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token55);
        org.apache.commons.lang.time.DurationFormatUtils.Token token64 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int65 = token64.getCount();
        boolean boolean67 = token64.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str68 = token64.toString();
        boolean boolean69 = token55.equals((java.lang.Object) str68);
        boolean boolean70 = token11.equals((java.lang.Object) token55);
        token11.increment();
        boolean boolean72 = token8.equals((java.lang.Object) token11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "mm");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "mm");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "mm");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str20, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str26, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str31, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str42, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str48, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + "hi!" + "'", obj59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str68, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.99-22", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.99-22" + "'", str3, "P0Y000DT00000.99-22");
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.09734", (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int5 = token4.getCount();
        int int6 = token4.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str10 = token9.toString();
        boolean boolean12 = token9.equals((java.lang.Object) 100L);
        token9.increment();
        token9.increment();
        boolean boolean16 = token9.equals((java.lang.Object) "");
        token9.increment();
        boolean boolean18 = token4.equals((java.lang.Object) token9);
        int int19 = token4.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str23 = token22.toString();
        java.lang.Object obj24 = token22.getValue();
        boolean boolean25 = token4.equals(obj24);
        boolean boolean26 = token2.equals((java.lang.Object) boolean25);
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean25);
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token27);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "S" + "'", obj24, "S");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 2, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        java.lang.Object obj7 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str11 = token10.toString();
        boolean boolean13 = token10.equals((java.lang.Object) 100L);
        token10.increment();
        boolean boolean16 = token10.equals((java.lang.Object) "M");
        java.lang.String str17 = token10.toString();
        boolean boolean18 = token2.equals((java.lang.Object) str17);
        java.lang.String str19 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean26 = token24.equals((java.lang.Object) (short) 100);
        token24.increment();
        java.lang.Object obj28 = token24.getValue();
        token24.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token24, (int) (byte) -1);
        int int32 = token24.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str36 = token35.toString();
        java.lang.String str37 = token35.toString();
        boolean boolean38 = token24.equals((java.lang.Object) token35);
        org.apache.commons.lang.time.DurationFormatUtils.Token token40 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token24, (int) (short) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token42 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token24, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token45 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str46 = token45.toString();
        boolean boolean48 = token45.equals((java.lang.Object) 100L);
        token45.increment();
        boolean boolean51 = token45.equals((java.lang.Object) "M");
        java.lang.String str52 = token45.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token54 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token45, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token55 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token54);
        org.apache.commons.lang.time.DurationFormatUtils.Token token56 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token54);
        org.apache.commons.lang.time.DurationFormatUtils.Token token59 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean61 = token59.equals((java.lang.Object) (short) 100);
        token59.increment();
        java.lang.Object obj63 = token59.getValue();
        token59.increment();
        boolean boolean65 = token56.equals((java.lang.Object) token59);
        boolean boolean66 = token24.equals((java.lang.Object) token59);
        boolean boolean67 = token21.equals((java.lang.Object) token24);
        int int68 = token21.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str19, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 37 + "'", int32 == 37);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str36, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str37, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str46, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str52, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + obj63 + "' != '" + "hi!" + "'", obj63, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 52, "P0Y0M0DT0H0M0.90S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.9052" + "'", str2, "P0Y000DT00000.9052");
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) 0, "P0Y000DT00000.000100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.000100" + "'", str3, "P0Y000DT00000.000100");
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.7590");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.7590" + "'", str2, "P0Y000DT00000.7590");
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, (long) 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.003S" + "'", str2, "P0Y0M0DT0H0M0.003S");
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 100);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 101, false, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days" + "'", str3, "0 days");
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 0);
        int int10 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int15 = token14.getCount();
        boolean boolean16 = token12.equals((java.lang.Object) token14);
        token12.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12);
        int int19 = token12.getCount();
        boolean boolean20 = token2.equals((java.lang.Object) token12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 11, "P0Y000DT00000.04100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.04100" + "'", str2, "P0Y000DT00000.04100");
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 39, 0L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.61S" + "'", str2, "P0Y0M0DT0H0M0.61S");
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.053S" + "'", str2, "P0Y0M0DT0H0M0.053S");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        int int10 = token2.getCount();
        int int11 = token2.getCount();
        java.lang.Object obj12 = token2.getValue();
        java.lang.Object obj13 = token2.getValue();
        java.lang.Class<?> wildcardClass14 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37 + "'", int11 == 37);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0a00", (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int7 = token6.getCount();
        boolean boolean8 = token4.equals((java.lang.Object) token6);
        token6.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 10);
        token11.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        int int14 = token13.getCount();
        boolean boolean15 = token2.equals((java.lang.Object) int14);
        int int16 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 35, "-37");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-37" + "'", str2, "-37");
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.06597P0Y000DT00000.06597P0Y000DT00000.06597", 3);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (-1), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str5, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        int int7 = token3.getCount();
        int int8 = token3.getCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        int int15 = token14.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int15);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16, 37);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18, (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean25 = token23.equals((java.lang.Object) (short) 100);
        java.lang.Object obj26 = token23.getValue();
        java.lang.Object obj27 = token23.getValue();
        token23.increment();
        boolean boolean29 = token20.equals((java.lang.Object) token23);
        java.lang.Class<?> wildcardClass30 = token20.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "hi!" + "'", obj26, "hi!");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 35, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 39, "P0Y000DT00000.0010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0010" + "'", str2, "P0Y000DT00000.0010");
    }
}

