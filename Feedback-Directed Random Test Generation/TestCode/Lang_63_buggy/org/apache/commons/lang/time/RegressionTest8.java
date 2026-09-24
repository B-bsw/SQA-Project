package org.apache.commons.lang.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.13S", 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int5 = token4.getCount();
        boolean boolean7 = token4.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str8 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        boolean boolean10 = token2.equals((java.lang.Object) token9);
        java.lang.Object obj11 = token9.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str15 = token14.toString();
        boolean boolean17 = token14.equals((java.lang.Object) 100L);
        token14.increment();
        token14.increment();
        boolean boolean21 = token14.equals((java.lang.Object) "");
        int int22 = token14.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int22);
        org.apache.commons.lang.time.DurationFormatUtils.Token token26 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str27 = token26.toString();
        boolean boolean29 = token26.equals((java.lang.Object) 100L);
        java.lang.Object obj30 = token26.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token26);
        boolean boolean32 = token23.equals((java.lang.Object) token26);
        org.apache.commons.lang.time.DurationFormatUtils.Token token34 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token26, 100);
        token26.increment();
        boolean boolean36 = token9.equals((java.lang.Object) token26);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str8, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 37 + "'", int22 == 37);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str27, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "hi!" + "'", obj30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (byte) 1, "P0Y000DT00000.8010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.8010" + "'", str3, "P0Y000DT00000.8010");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
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
        java.lang.Object obj19 = token18.getValue();
        java.lang.String str20 = token18.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str20, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 2, "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 2, "P0Y000DT00000.9853");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9853" + "'", str3, "P0Y000DT00000.9853");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.018S");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100");
        java.lang.String str9 = token8.toString();
        boolean boolean10 = token2.equals((java.lang.Object) token8);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str14 = token13.toString();
        boolean boolean16 = token13.equals((java.lang.Object) 100L);
        java.lang.Object obj17 = token13.getValue();
        java.lang.Object obj18 = token13.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int23 = token22.getCount();
        boolean boolean24 = token20.equals((java.lang.Object) token22);
        java.lang.Object obj25 = token22.getValue();
        boolean boolean26 = token13.equals((java.lang.Object) token22);
        token13.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, (int) (short) 1);
        boolean boolean30 = token2.equals((java.lang.Object) token29);
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0Y000DT00000.100" + "'", str9, "P0Y000DT00000.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj25, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 3, (long) 32, "P0Y000DT00000.010-98");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.010-98" + "'", str3, "P0Y000DT00000.010-98");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.680", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.680" + "'", str3, "P0Y000DT00000.680");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.0871");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
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
        java.lang.Object obj16 = token15.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.038S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03810" + "'", str3, "P0Y000DT00000.03810");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.001100");
        token1.increment();
        token1.increment();
        java.lang.String str4 = token1.toString();
        int int5 = token1.getCount();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "P0Y000DT00000.001100P0Y000DT00000.001100P0Y000DT00000.001100" + "'", str4, "P0Y000DT00000.001100P0Y000DT00000.001100P0Y000DT00000.001100");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
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
        java.lang.Object obj21 = token20.getValue();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean3 = token1.equals((java.lang.Object) "hi!");
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 10);
        java.lang.Object obj7 = token6.getValue();
        java.lang.Object obj8 = token6.getValue();
        java.lang.String str9 = token6.toString();
        java.lang.Object obj10 = token6.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str14 = token13.toString();
        boolean boolean16 = token13.equals((java.lang.Object) 100L);
        java.lang.String str17 = token13.toString();
        int int18 = token13.getCount();
        token13.increment();
        token13.increment();
        boolean boolean21 = token6.equals((java.lang.Object) token13);
        java.lang.String str22 = token13.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "mm");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "mm");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "mm");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "mm");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "mm");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "mm");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mmmmmmmmmmmmmmmmmmmm" + "'", str9, "mmmmmmmmmmmmmmmmmmmm");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "mm");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "mm");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "mm");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
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
        int int20 = token18.getCount();
        java.lang.Class<?> wildcardClass21 = token18.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 38 + "'", int16 == 38);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 53 + "'", int20 == 53);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 10, "P0Y000DT00000.961", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.961" + "'", str3, "P0Y000DT00000.961");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
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
        java.lang.Class<?> wildcardClass18 = token14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 11, "P0Y000DT00000.4737", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.4737" + "'", str3, "P0Y000DT00000.4737");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.String str6 = token2.toString();
        int int7 = token2.getCount();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Class<?> wildcardClass10 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.98100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.98100" + "'", str2, "P0Y000DT00000.98100");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.10064", (int) '4');
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 0);
        token2.increment();
        java.lang.Object obj6 = token2.getValue();
        int int7 = token2.getCount();
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "P0Y000DT00000.10064" + "'", obj6, "P0Y000DT00000.10064");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53 + "'", int7 == 53);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
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
        int int15 = token2.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 37 + "'", int13 == 37);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37 + "'", int15 == 37);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 3, "P0Y000DT00000.00010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00010" + "'", str3, "P0Y000DT00000.00010");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 53, (long) 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.49S" + "'", str2, "P0Y0M0DT0H0M0.49S");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean3 = token1.equals((java.lang.Object) "hi!");
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 11, (long) (short) 0, "P0Y0M0DT0H0M0.036S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.036-11" + "'", str3, "P0Y000DT00000.036-11");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        token8.increment();
        int int10 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int10, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int15 = token14.getCount();
        token14.increment();
        boolean boolean17 = token12.equals((java.lang.Object) token14);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14);
        java.lang.Object obj19 = token14.getValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "s" + "'", obj19, "s");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 32, "P0Y000DT00000.0650");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0650" + "'", str3, "P0Y000DT00000.0650");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "P0Y0M0DT0H0M0.49S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.4932" + "'", str2, "P0Y000DT00000.4932");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 53, "-37", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-37" + "'", str5, "-37");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str9 = token8.toString();
        boolean boolean11 = token8.equals((java.lang.Object) 100L);
        token8.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, (int) (short) 0);
        boolean boolean16 = token2.equals((java.lang.Object) token8);
        java.lang.Object obj17 = token2.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 35, (long) 54, "P0Y0M0DT0H0M0.02S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0219" + "'", str5, "P0Y000DT00000.0219");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.052-35");
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 10, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str3, 35);
        int int6 = token5.getCount();
        java.lang.Object obj7 = token5.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1), 37);
        boolean boolean11 = token5.equals((java.lang.Object) token10);
        java.lang.Object obj12 = token5.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str16 = token15.toString();
        boolean boolean18 = token15.equals((java.lang.Object) 100L);
        token15.increment();
        boolean boolean21 = token15.equals((java.lang.Object) "M");
        java.lang.String str22 = token15.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token24);
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token25, (int) (byte) 0);
        boolean boolean28 = token5.equals((java.lang.Object) token27);
        java.lang.Object obj29 = token5.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str16, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "" + "'", obj29, "");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 36, 10L, "P0Y0M0DT0H0M0.011S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.011-26" + "'", str3, "P0Y000DT00000.011-26");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 97, (long) 39, "P0Y000DT00000.09110", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09110" + "'", str5, "P0Y000DT00000.09110");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 101, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
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
        int int43 = token22.getCount();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Class<?> wildcardClass8 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int10 = token9.getCount();
        java.lang.String str11 = token9.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str7 = token1.toString();
        java.lang.Object obj8 = token1.getValue();
        token1.increment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str7, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj8, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, 0L, "P0Y000DT00000.0983");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0983" + "'", str3, "P0Y000DT00000.0983");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
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
        int int21 = token18.getCount();
        java.lang.Object obj22 = token18.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int25 = token24.getCount();
        int int26 = token24.getCount();
        java.lang.Object obj27 = token24.getValue();
        java.lang.String str28 = token24.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        int int31 = token30.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token34 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L, 0);
        boolean boolean35 = token30.equals((java.lang.Object) 100L);
        boolean boolean36 = token24.equals((java.lang.Object) token30);
        java.lang.Class<?> wildcardClass37 = token24.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token39 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass37, (int) (byte) -1);
        boolean boolean40 = token18.equals((java.lang.Object) (byte) -1);
        int int41 = token18.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj27, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str28, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 32, "P0Y000DT00000.002-36", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.002-36" + "'", str3, "P0Y000DT00000.002-36");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((-1L), (long) 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.053S" + "'", str2, "P0Y0M0DT0H0M0.053S");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 35, (long) 39, "P0Y000DT00000.99-22", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.99-22" + "'", str5, "P0Y000DT00000.99-22");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 'a', "P0Y0M0DT0H0M0.81S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.8196" + "'", str3, "P0Y000DT00000.8196");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int7 = token6.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str12 = token11.toString();
        boolean boolean14 = token11.equals((java.lang.Object) 100L);
        java.lang.Object obj15 = token11.getValue();
        java.lang.Object obj16 = token11.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int21 = token20.getCount();
        boolean boolean22 = token18.equals((java.lang.Object) token20);
        java.lang.Object obj23 = token20.getValue();
        boolean boolean24 = token11.equals((java.lang.Object) token20);
        token11.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11, (int) (short) 1);
        java.lang.Object obj28 = token27.getValue();
        java.lang.Object obj29 = token27.getValue();
        boolean boolean30 = token6.equals((java.lang.Object) token27);
        token27.increment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj23, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y0M0DT0H0M0.54S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.54100" + "'", str2, "P0Y000DT00000.54100");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        token8.increment();
        java.lang.String str10 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str10, 39);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str10, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 3);
        token6.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        int int9 = token8.getCount();
        java.lang.String str10 = token8.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str10, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.35S" + "'", str2, "P0Y0M0DT0H0M0.35S");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        token5.increment();
        java.lang.String str7 = token5.toString();
        token5.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 10, 2);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(1L, (long) '4', "11");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11" + "'", str3, "11");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.10064", (int) '4');
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        token7.increment();
        java.lang.Object obj10 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean15 = token13.equals((java.lang.Object) (short) 100);
        java.lang.Object obj16 = token13.getValue();
        java.lang.String str17 = token13.toString();
        java.lang.Object obj18 = token13.getValue();
        token13.increment();
        boolean boolean20 = token7.equals((java.lang.Object) token13);
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        boolean boolean22 = token4.equals((java.lang.Object) token21);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str26 = token25.toString();
        boolean boolean28 = token25.equals((java.lang.Object) 100L);
        int int29 = token25.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int32 = token31.getCount();
        boolean boolean34 = token31.equals((java.lang.Object) "0:00:00.99");
        boolean boolean35 = token25.equals((java.lang.Object) "0:00:00.99");
        int int36 = token25.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token37 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int36);
        java.lang.Class<?> wildcardClass38 = token37.getClass();
        boolean boolean39 = token21.equals((java.lang.Object) wildcardClass38);
        java.lang.Class<?> wildcardClass40 = token21.getClass();
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "S" + "'", obj10, "S");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str26, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 35 + "'", int36 == 35);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 54, (long) (byte) -1, "P0Y000DT00000.4737");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.4737" + "'", str3, "P0Y000DT00000.4737");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        int int12 = token11.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int12);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int12);
        java.lang.Object obj15 = token14.getValue();
        int int16 = token14.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 100 + "'", obj15, 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m", (-1));
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m", (-1));
        int int9 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int9, 35);
        int int12 = token11.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11, (int) (short) 0);
        int int15 = token11.getCount();
        boolean boolean16 = token3.equals((java.lang.Object) token11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.007-35", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.007-35" + "'", str3, "P0Y000DT00000.007-35");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.String str6 = token2.toString();
        java.lang.Object obj7 = token2.getValue();
        java.lang.String str8 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str12 = token11.toString();
        boolean boolean14 = token11.equals((java.lang.Object) 100L);
        token11.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        token11.increment();
        int int18 = token11.getCount();
        int int19 = token11.getCount();
        token11.increment();
        boolean boolean21 = token2.equals((java.lang.Object) token11);
        java.lang.String str22 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 37 + "'", int18 == 37);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 37 + "'", int19 == 37);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str10 = token9.toString();
        boolean boolean12 = token9.equals((java.lang.Object) 100L);
        token9.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        token9.increment();
        int int16 = token9.getCount();
        java.lang.String str17 = token9.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.90-35");
        boolean boolean22 = token19.equals((java.lang.Object) token21);
        boolean boolean23 = token6.equals((java.lang.Object) token19);
        java.lang.String str24 = token19.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 37 + "'", int16 == 37);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str24, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y0M0DT0H0M0.018S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.018-1" + "'", str3, "P0Y000DT00000.018-1");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        java.lang.String str7 = token2.toString();
        int int8 = token2.getCount();
        java.lang.Class<?> wildcardClass9 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.03232");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03232" + "'", str2, "P0Y000DT00000.03232");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        java.lang.Object obj6 = token3.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        int int8 = token7.getCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj6, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.0890", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0890" + "'", str3, "P0Y000DT00000.0890");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.007-90", 52);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) -1, "P0Y000DT00000.4858");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.4858" + "'", str3, "P0Y000DT00000.4858");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (byte) 0, "P0Y0M0DT0H0M0.63S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.630" + "'", str5, "P0Y000DT00000.630");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
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
        token16.increment();
        java.lang.Class<?> wildcardClass32 = token16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.03411", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03411" + "'", str3, "P0Y000DT00000.03411");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.011S" + "'", str2, "P0Y0M0DT0H0M0.011S");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        boolean boolean11 = token2.equals((java.lang.Object) "P0Y000DT00000.052-35");
        java.lang.Object obj12 = token2.getValue();
        java.lang.Class<?> wildcardClass13 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (-1));
        java.lang.Class<?> wildcardClass16 = token15.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
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
        java.lang.String str15 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 37, (long) 101, "P0Y000DT00000.99-22", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.99-22" + "'", str5, "P0Y000DT00000.99-22");
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 36, (long) 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.061S" + "'", str2, "P0Y0M0DT0H0M0.061S");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        java.lang.Object obj7 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj7, (int) '#');
        java.lang.String str10 = token9.toString();
        java.lang.Object obj11 = token9.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean15 = token13.equals((java.lang.Object) "hi!");
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, (int) ' ');
        boolean boolean18 = token9.equals((java.lang.Object) token17);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.0640", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0640" + "'", str3, "P0Y000DT00000.0640");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.065-10P0Y000DT00000.065-10P0Y000DT00000.065-10", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.065-10P0Y000DT00000.065-10P0Y000DT00000.065-10" + "'", str3, "P0Y000DT00000.065-10P0Y000DT00000.065-10P0Y000DT00000.065-10");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, 10L, "P0Y000DT00000.001100P0Y000DT00000.001100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.001100P0Y000DT00000.001100" + "'", str5, "P0Y000DT00000.001100P0Y000DT00000.001100");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int7 = token1.getCount();
        token1.increment();
        java.lang.Object obj9 = token1.getValue();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        boolean boolean13 = token11.equals((java.lang.Object) "P0Y000DT00000.00100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str17 = token16.toString();
        boolean boolean19 = token16.equals((java.lang.Object) 100L);
        int int20 = token16.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int23 = token22.getCount();
        boolean boolean25 = token22.equals((java.lang.Object) "0:00:00.99");
        boolean boolean26 = token16.equals((java.lang.Object) "0:00:00.99");
        int int27 = token16.getCount();
        int int28 = token16.getCount();
        int int29 = token16.getCount();
        java.lang.String str30 = token16.toString();
        int int31 = token16.getCount();
        boolean boolean32 = token11.equals((java.lang.Object) token16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj9, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str30, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str5 = token4.toString();
        boolean boolean7 = token4.equals((java.lang.Object) 100L);
        int int8 = token4.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int11 = token10.getCount();
        boolean boolean13 = token10.equals((java.lang.Object) "0:00:00.99");
        boolean boolean14 = token4.equals((java.lang.Object) "0:00:00.99");
        int int15 = token4.getCount();
        token4.increment();
        boolean boolean17 = token1.equals((java.lang.Object) token4);
        int int18 = token4.getCount();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str5, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
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
        java.lang.Object obj17 = token16.getValue();
        java.lang.Class<?> wildcardClass18 = token16.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 1 + "'", obj17, 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 1.0f);
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 1.0f);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        int int9 = token2.getCount();
        java.lang.String str10 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37 + "'", int9 == 37);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        int int7 = token2.getCount();
        int int8 = token2.getCount();
        java.lang.Object obj9 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean13 = token11.equals((java.lang.Object) "hi!");
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str16 = token15.toString();
        java.lang.Class<?> wildcardClass17 = token15.getClass();
        boolean boolean18 = token11.equals((java.lang.Object) wildcardClass17);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int21 = token20.getCount();
        boolean boolean23 = token20.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj24 = token20.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token20);
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token25, 0);
        boolean boolean28 = token11.equals((java.lang.Object) token27);
        boolean boolean29 = token2.equals((java.lang.Object) boolean28);
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token34 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token36 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int37 = token36.getCount();
        java.lang.Object obj38 = token36.getValue();
        java.lang.Class<?> wildcardClass39 = token36.getClass();
        boolean boolean40 = token34.equals((java.lang.Object) wildcardClass39);
        org.apache.commons.lang.time.DurationFormatUtils.Token token41 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token34);
        java.lang.String str42 = token41.toString();
        boolean boolean43 = token2.equals((java.lang.Object) token41);
        org.apache.commons.lang.time.DurationFormatUtils.Token token45 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int46 = token45.getCount();
        int int47 = token45.getCount();
        token45.increment();
        java.lang.Object obj49 = token45.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token51 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int52 = token51.getCount();
        boolean boolean54 = token51.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj55 = token51.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token56 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token51);
        org.apache.commons.lang.time.DurationFormatUtils.Token token58 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token56, 0);
        java.lang.Object obj59 = token58.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token61 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj59, (int) (short) -1);
        token61.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token65 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str66 = token65.toString();
        boolean boolean68 = token65.equals((java.lang.Object) 100L);
        token65.increment();
        boolean boolean71 = token65.equals((java.lang.Object) "M");
        java.lang.String str72 = token65.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token74 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token65, (int) (byte) 100);
        int int75 = token74.getCount();
        boolean boolean77 = token74.equals((java.lang.Object) (-1L));
        token74.increment();
        boolean boolean79 = token61.equals((java.lang.Object) token74);
        org.apache.commons.lang.time.DurationFormatUtils.Token token81 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean79, (int) (byte) 1);
        boolean boolean82 = token45.equals((java.lang.Object) token81);
        boolean boolean83 = token41.equals((java.lang.Object) token81);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0:00:00.010" + "'", str16, "0:00:00.010");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj24, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "s" + "'", obj38, "s");
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "37373737373737373737" + "'", str42, "37373737373737373737");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj49, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj55, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertEquals(obj59.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj59), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj59), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str66, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str72, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 39, (long) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.061S" + "'", str2, "P0Y0M0DT0H0M0.061S");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        token5.increment();
        java.lang.String str7 = token5.toString();
        java.lang.Object obj8 = token5.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        java.lang.Object obj2 = token1.getValue();
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean10 = token8.equals((java.lang.Object) (short) 100);
        boolean boolean11 = token1.equals((java.lang.Object) token8);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        token1.increment();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0d + "'", obj2, 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 11, "P0Y000DT00000.8338", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.8338" + "'", str3, "P0Y000DT00000.8338");
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (byte) -1, "P0Y000DT00000.630", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.630" + "'", str5, "P0Y000DT00000.630");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 97, "P0Y0M0DT0H0M0.78S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.7898" + "'", str5, "P0Y000DT00000.7898");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 2, "d", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        int int6 = token2.getCount();
        token2.increment();
        int int8 = token2.getCount();
        java.lang.Object obj9 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.001S", 54);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj4 = token3.getValue();
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "100.0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "100.0");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "100.0");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        java.lang.Class<?> wildcardClass4 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        token8.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y000DT00000.021-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.021-1" + "'", str3, "P0Y000DT00000.021-1");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.101-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.101-1" + "'", str2, "P0Y000DT00000.101-1");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str3, 35);
        int int6 = token5.getCount();
        java.lang.Object obj7 = token5.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1), 37);
        boolean boolean11 = token5.equals((java.lang.Object) token10);
        java.lang.Object obj12 = token5.getValue();
        int int13 = token5.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "" + "'", obj7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 3, (long) 97, "P0Y000DT00000.6599");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6599" + "'", str3, "P0Y000DT00000.6599");
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, 0L, "P0Y000DT00000.0453", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0453" + "'", str5, "P0Y000DT00000.0453");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        java.lang.Object obj10 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj10, 35);
        java.lang.Object obj13 = token12.getValue();
        int int14 = token12.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int14, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
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
        int int21 = token11.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj17, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 11, "P0Y000DT00000.06839");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.06839" + "'", str2, "P0Y000DT00000.06839");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.101-48");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.101-48" + "'", str2, "P0Y000DT00000.101-48");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        token1.increment();
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int8 = token7.getCount();
        boolean boolean10 = token7.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj11 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12, 0);
        java.lang.Object obj15 = token14.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj15, (int) (short) -1);
        token17.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str22 = token21.toString();
        boolean boolean24 = token21.equals((java.lang.Object) 100L);
        token21.increment();
        boolean boolean27 = token21.equals((java.lang.Object) "M");
        java.lang.String str28 = token21.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token21, (int) (byte) 100);
        int int31 = token30.getCount();
        boolean boolean33 = token30.equals((java.lang.Object) (-1L));
        token30.increment();
        boolean boolean35 = token17.equals((java.lang.Object) token30);
        org.apache.commons.lang.time.DurationFormatUtils.Token token37 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean35, (int) (byte) 1);
        boolean boolean38 = token1.equals((java.lang.Object) token37);
        int int39 = token37.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj11, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str28, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y0M0DT0H0M0.90S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.900" + "'", str3, "P0Y000DT00000.900");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 52, "P0Y0M0DT0H0M0.099S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09952" + "'", str3, "P0Y000DT00000.09952");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        int int9 = token2.getCount();
        java.lang.String str10 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str13 = token12.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int16 = token15.getCount();
        boolean boolean18 = token15.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj19 = token15.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15);
        int int21 = token15.getCount();
        token15.increment();
        java.lang.Object obj23 = token15.getValue();
        token15.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15);
        boolean boolean26 = token12.equals((java.lang.Object) token25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37 + "'", int9 == 37);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str13, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj19, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj23, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 101, "P0Y0M0DT0H0M0.82S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.82101" + "'", str3, "P0Y000DT00000.82101");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 35, "P0Y000DT00000.6810", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.6810" + "'", str5, "P0Y000DT00000.6810");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653" + "'", str2, "P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0f, 39);
        java.lang.Object obj3 = token2.getValue();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 100.0f + "'", obj3, 100.0f);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int12 = token11.getCount();
        int int13 = token11.getCount();
        boolean boolean14 = token2.equals((java.lang.Object) token11);
        token2.increment();
        java.lang.Class<?> wildcardClass16 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass16, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.13S", 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int5 = token4.getCount();
        boolean boolean7 = token4.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str8 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        boolean boolean10 = token2.equals((java.lang.Object) token9);
        token2.increment();
        int int12 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str8, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.04100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04100" + "'", str3, "P0Y000DT00000.04100");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
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
        int int21 = token18.getCount();
        java.lang.String str22 = token18.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '#', "d");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 35, "P0Y000DT00000.0081");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0081" + "'", str2, "P0Y000DT00000.0081");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 36, "P0Y0M0DT0H0M0.043S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.04336" + "'", str2, "P0Y000DT00000.04336");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y0M0DT0H0M0.032S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0320" + "'", str3, "P0Y000DT00000.0320");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 39, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "10.0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10.0" + "'", str2, "10.0");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 101, "P0Y000DT00000.13-35");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.13-35" + "'", str2, "P0Y000DT00000.13-35");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
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
        java.lang.String str16 = token1.toString();
        java.lang.Class<?> wildcardClass17 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37 + "'", int14 == 37);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P0Y0M0DT0H0M0.002SP0Y0M0DT0H0M0.002S" + "'", str16, "P0Y0M0DT0H0M0.002SP0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.065-12P0Y000DT00000.065-12P0Y000DT00000.065-12");
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean3 = token1.equals((java.lang.Object) "hi!");
        token1.increment();
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass5, (int) ' ');
        token7.increment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.65S", 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str8 = token7.toString();
        boolean boolean10 = token7.equals((java.lang.Object) 100L);
        token7.increment();
        token7.increment();
        boolean boolean14 = token7.equals((java.lang.Object) "");
        int int15 = token7.getCount();
        int int16 = token7.getCount();
        boolean boolean17 = token2.equals((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str21 = token20.toString();
        boolean boolean23 = token20.equals((java.lang.Object) 100L);
        java.lang.Object obj24 = token20.getValue();
        java.lang.Object obj25 = token20.getValue();
        boolean boolean27 = token20.equals((java.lang.Object) "H");
        java.lang.Class<?> wildcardClass28 = token20.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass28);
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass28, 52);
        boolean boolean32 = token7.equals((java.lang.Object) 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token34 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean32, 39);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37 + "'", int15 == 37);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 37 + "'", int16 == 37);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str21, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + "hi!" + "'", obj24, "hi!");
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "hi!" + "'", obj25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 35, "P0Y000DT00000.0900", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0900" + "'", str5, "P0Y000DT00000.0900");
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.String str6 = token2.toString();
        java.lang.Object obj7 = token2.getValue();
        token2.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14);
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 36, (long) 0, "P0Y000DT00000.069-59");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.069-59" + "'", str3, "P0Y000DT00000.069-59");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.02100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.02100" + "'", str2, "P0Y000DT00000.02100");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj7 = token1.getValue();
        int int8 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) '4');
        token1.increment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj7, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0");
        java.lang.Object obj2 = token1.getValue();
        int int3 = token1.getCount();
        token1.increment();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "0" + "'", obj2, "0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y0M0DT0H0M0.011S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0111" + "'", str3, "P0Y000DT00000.0111");
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 35, "P0Y0M0DT0H0M0.064S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.06435" + "'", str2, "P0Y000DT00000.06435");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.065100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.065100" + "'", str3, "P0Y000DT00000.065100");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 3, "P0Y000DT00000.90-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.90-1" + "'", str3, "P0Y000DT00000.90-1");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        java.lang.Object obj4 = token1.getValue();
        java.lang.String str5 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj7 = token6.getValue();
        token6.increment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj4, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
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
        java.lang.String str21 = token8.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "m" + "'", str21, "m");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str7 = token2.toString();
        int int8 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        boolean boolean11 = token2.equals((java.lang.Object) "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        java.lang.Class<?> wildcardClass12 = token2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m", (-1));
        int int4 = token3.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int4, 35);
        int int7 = token6.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, (int) (short) 0);
        token6.increment();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 35, "P0Y000DT00000.007-35", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.007-35" + "'", str3, "P0Y000DT00000.007-35");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int2, (-1));
        java.lang.Object obj5 = token4.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (int) (short) 0);
        java.lang.Object obj8 = token7.getValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 1 + "'", obj5, 1);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.String str2 = token1.toString();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int7 = token6.getCount();
        boolean boolean9 = token6.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj10 = token6.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11, 0);
        java.lang.Object obj14 = token13.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj14, (int) (short) -1);
        token16.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str21 = token20.toString();
        boolean boolean23 = token20.equals((java.lang.Object) 100L);
        token20.increment();
        boolean boolean26 = token20.equals((java.lang.Object) "M");
        java.lang.String str27 = token20.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token20, (int) (byte) 100);
        int int30 = token29.getCount();
        boolean boolean32 = token29.equals((java.lang.Object) (-1L));
        token29.increment();
        boolean boolean34 = token16.equals((java.lang.Object) token29);
        int int35 = token16.getCount();
        boolean boolean36 = token4.equals((java.lang.Object) int35);
        token4.increment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj10, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str21, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str27, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 52, 0L, "P0Y000DT00000.6552", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.6552" + "'", str5, "P0Y000DT00000.6552");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token32);
        token32.increment();
        token32.increment();
        java.lang.Class<?> wildcardClass38 = token32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        int int10 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int10);
        int int12 = token11.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int15 = token14.getCount();
        boolean boolean17 = token14.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj18 = token14.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14);
        int int20 = token19.getCount();
        int int21 = token19.getCount();
        int int22 = token19.getCount();
        boolean boolean23 = token11.equals((java.lang.Object) token19);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj18, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token23, (int) '4');
        token23.increment();
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
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 54, (long) 100, "P0Y000DT00000.1132");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1132" + "'", str3, "P0Y000DT00000.1132");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.90-35");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int6 = token5.getCount();
        boolean boolean7 = token3.equals((java.lang.Object) token5);
        java.lang.String str8 = token3.toString();
        java.lang.Object obj9 = token3.getValue();
        boolean boolean10 = token1.equals((java.lang.Object) token3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11, (int) '4');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "m" + "'", str8, "m");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "m" + "'", obj9, "m");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        java.lang.Object obj4 = token1.getValue();
        java.lang.String str5 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int7 = token1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj4, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 97, "P0Y000DT00000.9634");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.9634" + "'", str3, "P0Y000DT00000.9634");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.99S", (int) (byte) 1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.String str6 = token5.toString();
        token5.increment();
        java.lang.String str8 = token5.toString();
        boolean boolean10 = token5.equals((java.lang.Object) "P0Y000DT00000.03-1");
        token5.increment();
        java.lang.String str12 = token5.toString();
        boolean boolean14 = token5.equals((java.lang.Object) (short) -1);
        boolean boolean15 = token2.equals((java.lang.Object) token5);
        java.lang.Class<?> wildcardClass16 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str3, "P0Y0M0DT0H0M0.99S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "m" + "'", str6, "m");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mm" + "'", str8, "mm");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mmm" + "'", str12, "mmm");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 32, "P0Y0M0DT0H0M0.65S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.6532" + "'", str2, "P0Y000DT00000.6532");
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.08610");
        boolean boolean11 = token1.equals((java.lang.Object) token10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 10);
        token1.increment();
        java.lang.Class<?> wildcardClass15 = token1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.String str6 = token2.toString();
        java.lang.Object obj7 = token2.getValue();
        java.lang.String str8 = token2.toString();
        java.lang.String str9 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str7 = token2.toString();
        int int8 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) '4');
        java.lang.Object obj10 = token9.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        int int13 = token12.getCount();
        token12.increment();
        boolean boolean15 = token9.equals((java.lang.Object) token12);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.032S", (int) '4');
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean23 = token21.equals((java.lang.Object) (short) 100);
        token21.increment();
        boolean boolean25 = token18.equals((java.lang.Object) token21);
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18, 97);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18, 97);
        boolean boolean30 = token9.equals((java.lang.Object) 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 1, (long) 37, "P0Y000DT00000.8332", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.8332" + "'", str5, "P0Y000DT00000.8332");
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean3 = token1.equals((java.lang.Object) "hi!");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj5 = token4.getValue();
        token4.increment();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "m");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "m");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "m");
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        boolean boolean11 = token2.equals((java.lang.Object) "P0Y000DT00000.052-35");
        java.lang.Object obj12 = token2.getValue();
        int int13 = token2.getCount();
        int int14 = token2.getCount();
        java.lang.Class<?> wildcardClass15 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 37 + "'", int13 == 37);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37 + "'", int14 == 37);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) (short) 10, "class org.apache.commons.lang.time.DurationFormatUtils$Tokenclass org.apache.commons.lang.time.DurationFormatUtils$Token", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "cla0 org.apache.co0on0.lang.ti0e.DurationForatUtil0$Tokencla org.apache.co0on0.lang.ti0e.DurationForatUtil0$Token" + "'", str5, "cla0 org.apache.co0on0.lang.ti0e.DurationForatUtil0$Tokencla org.apache.co0on0.lang.ti0e.DurationForatUtil0$Token");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', 1L, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001" + "'", str3, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001");
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 36, "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        java.lang.Object obj4 = token1.getValue();
        java.lang.String str5 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 100);
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj4, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str5, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 52, (long) (short) 10, "P0Y000DT00000.9768", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.9768" + "'", str5, "P0Y000DT00000.9768");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 3, (long) (-1), "P0Y000DT00000.8010", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.8010" + "'", str5, "P0Y000DT00000.8010");
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12);
        token15.increment();
        java.lang.Object obj17 = token15.getValue();
        java.lang.Object obj18 = token15.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37, (int) (short) 10);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 39);
        int int6 = token5.getCount();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 39 + "'", int6 == 39);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str2 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        token4.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str10 = token9.toString();
        boolean boolean12 = token9.equals((java.lang.Object) 100L);
        token9.increment();
        boolean boolean15 = token9.equals((java.lang.Object) "M");
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        boolean boolean18 = token9.equals((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        java.lang.Object obj19 = token9.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str23 = token22.toString();
        boolean boolean25 = token22.equals((java.lang.Object) 100L);
        token22.increment();
        boolean boolean28 = token22.equals((java.lang.Object) "M");
        java.lang.String str29 = token22.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token22, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token31);
        java.lang.Object obj33 = token32.getValue();
        java.lang.Class<?> wildcardClass34 = obj33.getClass();
        boolean boolean35 = token9.equals((java.lang.Object) wildcardClass34);
        token9.increment();
        boolean boolean37 = token4.equals((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token40 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str41 = token40.toString();
        boolean boolean43 = token40.equals((java.lang.Object) 100L);
        token40.increment();
        boolean boolean46 = token40.equals((java.lang.Object) "M");
        java.lang.String str47 = token40.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token49 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token40, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token50 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token49);
        java.lang.Object obj51 = token50.getValue();
        token50.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token54 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str55 = token54.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token57 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token54, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token58 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token57);
        org.apache.commons.lang.time.DurationFormatUtils.Token token59 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token57);
        boolean boolean60 = token50.equals((java.lang.Object) token59);
        boolean boolean61 = token9.equals((java.lang.Object) token59);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.010" + "'", str2, "0:00:00.010");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "hi!" + "'", obj19, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str23, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str29, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str41, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str47, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "0:00:00.010" + "'", str55, "0:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        token2.increment();
        int int7 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int7);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 37 + "'", int7 == 37);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        java.lang.Object obj6 = token2.getValue();
        token2.increment();
        token2.increment();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.100S", (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = token2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        java.lang.Object obj6 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) -1);
        int int10 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str14 = token13.toString();
        java.lang.String str15 = token13.toString();
        boolean boolean16 = token2.equals((java.lang.Object) token13);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) 'a');
        int int21 = token2.getCount();
        java.lang.String str22 = token2.toString();
        java.lang.Object obj23 = token2.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 37 + "'", int21 == 37);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str22 = token21.toString();
        boolean boolean24 = token21.equals((java.lang.Object) 100L);
        java.lang.Object obj25 = token21.getValue();
        java.lang.Object obj26 = token21.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int31 = token30.getCount();
        boolean boolean32 = token28.equals((java.lang.Object) token30);
        java.lang.Object obj33 = token30.getValue();
        boolean boolean34 = token21.equals((java.lang.Object) token30);
        token21.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token37 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token21, (int) (short) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token39 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token37, (int) (byte) 10);
        int int40 = token37.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token41 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int40);
        boolean boolean42 = token13.equals((java.lang.Object) int40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str15, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj17, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "hi!" + "'", obj25, "hi!");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "hi!" + "'", obj26, "hi!");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj33, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100", 35);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, (int) (short) 100);
        java.lang.Object obj6 = token5.getValue();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100");
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.65S", 100);
        int int3 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str7 = token6.toString();
        boolean boolean9 = token6.equals((java.lang.Object) 100L);
        int int10 = token6.getCount();
        token6.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        boolean boolean13 = token2.equals((java.lang.Object) token12);
        java.lang.Object obj14 = token12.getValue();
        token12.increment();
        java.lang.String str16 = token12.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str16, (int) (short) 1);
        java.lang.String str19 = token18.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str16, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str19, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 39, (long) (byte) 1, "P0000Y0M0DT0H0M0.097S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.097-38" + "'", str5, "P0000Y000DT00000.097-38");
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        java.lang.Object obj10 = token2.getValue();
        boolean boolean12 = token2.equals((java.lang.Object) (short) 100);
        boolean boolean14 = token2.equals((java.lang.Object) "y");
        token2.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 100, "P0000Y0M0DT0H0M0.032S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.0320" + "'", str3, "P0000Y000DT00000.0320");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 32, "P0Y000DT00000.00910");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00910" + "'", str2, "P0Y000DT00000.00910");
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) '4', "P0Y000DT00000.09853", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.09853" + "'", str5, "P0Y000DT00000.09853");
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.099-100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.099-100" + "'", str3, "P0Y000DT00000.099-100");
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.021-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.021-1" + "'", str3, "P0Y000DT00000.021-1");
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 54, (long) 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.85S" + "'", str2, "P0Y0M0DT0H0M0.85S");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
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
        java.lang.Class<?> wildcardClass25 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token26 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, (long) 1, "0 seconds");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 0econ00" + "'", str3, "0 0econ00");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.037-13", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.037-13" + "'", str3, "P0Y000DT00000.037-13");
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) 37);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.038S" + "'", str2, "P0Y0M0DT0H0M0.038S");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 37, (long) 10, "P0Y000DT00000.0090", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0090" + "'", str5, "P0Y000DT00000.0090");
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m", (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m", (-1));
        boolean boolean8 = token3.equals((java.lang.Object) "m");
        token3.increment();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
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
        java.lang.String str21 = token20.toString();
        token20.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y000DT00000.680");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.680" + "'", str2, "P0Y000DT00000.680");
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        boolean boolean4 = token1.equals((java.lang.Object) "P0Y000DT00000.09853");
        token1.increment();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.65-101");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.65-101" + "'", str2, "P0Y000DT00000.65-101");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, 100L, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
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
        int int62 = token11.getCount();
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
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
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
        token16.increment();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str13, "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + 11 + "'", obj14, 11);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str2 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        int int6 = token4.getCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.010" + "'", str2, "0:00:00.010");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 11, (long) 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.91S" + "'", str2, "P0Y0M0DT0H0M0.91S");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        int int12 = token11.getCount();
        int int13 = token11.getCount();
        boolean boolean15 = token11.equals((java.lang.Object) "P0Y000DT00000.05235");
        int int16 = token11.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11, 2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) '#', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        java.lang.Object obj6 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) -1);
        token2.increment();
        java.lang.String str11 = token2.toString();
        java.lang.Object obj12 = token2.getValue();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.045S" + "'", str2, "P0Y0M0DT0H0M0.045S");
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.053S");
        boolean boolean30 = token21.equals((java.lang.Object) "P0Y0M0DT0H0M0.053S");
        java.lang.Class<?> wildcardClass31 = token21.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.65S", 100);
        int int24 = token23.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str28 = token27.toString();
        boolean boolean30 = token27.equals((java.lang.Object) 100L);
        java.lang.Object obj31 = token27.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token27);
        int int33 = token27.getCount();
        boolean boolean34 = token23.equals((java.lang.Object) int33);
        boolean boolean35 = token18.equals((java.lang.Object) int33);
        java.lang.Object obj36 = token18.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str28, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "hi!" + "'", obj31, "hi!");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 97, (long) 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.38S" + "'", str2, "P0Y0M0DT0H0M0.38S");
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.08610");
        boolean boolean11 = token1.equals((java.lang.Object) token10);
        java.lang.Object obj12 = token10.getValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "P0Y000DT00000.08610" + "'", obj12, "P0Y000DT00000.08610");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        java.lang.Object obj6 = token1.getValue();
        int int7 = token1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj6, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str2, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(1L, "P0Y000DT00000.900", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.900" + "'", str3, "P0Y000DT00000.900");
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 37);
        java.lang.String str5 = token1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "s" + "'", str5, "s");
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
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
        token8.increment();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.010" + "'", str9, "0:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "0:00:00.010" + "'", obj11, "0:00:00.010");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass5);
        token6.increment();
        java.lang.Object obj8 = null;
        boolean boolean9 = token6.equals(obj8);
        boolean boolean11 = token6.equals((java.lang.Object) "P0Y000DT00000.06497");
        java.lang.Object obj12 = token6.getValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 32, "P0Y000DT00000.0010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0010" + "'", str2, "P0Y000DT00000.0010");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj6, (int) '#');
        token8.increment();
        java.lang.String str10 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
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
        java.lang.Object obj15 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37 + "'", int11 == 37);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 37 + "'", int12 == 37);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
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
        int int37 = token4.getCount();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 38 + "'", int37 == 38);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean3 = token1.equals((java.lang.Object) "hi!");
        int int4 = token1.getCount();
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 2, (long) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.098S" + "'", str2, "P0Y0M0DT0H0M0.098S");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.064S");
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
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
        java.lang.String str42 = token1.toString();
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str42, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 38, "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000000000000000000000000" + "'", str3, "00000000000000000000000000000000");
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 100, "P0Y000DT00000.00854");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00854" + "'", str3, "P0Y000DT00000.00854");
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str2 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str2, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.010" + "'", str2, "0:00:00.010");
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11, 100);
        java.lang.Object obj14 = token13.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "0");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "0");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        int int6 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int9 = token8.getCount();
        boolean boolean11 = token8.equals((java.lang.Object) "0:00:00.99");
        boolean boolean12 = token2.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str13 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str13);
        int int15 = token14.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14);
        java.lang.Object obj17 = token16.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str13, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) true);
        int int2 = token1.getCount();
        java.lang.Object obj3 = token1.getValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + true + "'", obj3, true);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.13S", 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int5 = token4.getCount();
        boolean boolean7 = token4.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str8 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        boolean boolean10 = token2.equals((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean10, 11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str8, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        java.lang.Object obj9 = null;
        boolean boolean10 = token3.equals(obj9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str8 = token7.toString();
        java.lang.Class<?> wildcardClass9 = token7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 1, "P0000Y000DT00000.0320", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.0320" + "'", str5, "P0000Y000DT00000.0320");
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "mm");
        java.lang.String str2 = token1.toString();
        int int3 = token1.getCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mm" + "'", str2, "mm");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 101, (long) 10, "P0Y000DT00000.001-90", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.001-90" + "'", str5, "P0Y000DT00000.001-90");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.85S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.850" + "'", str3, "P0Y000DT00000.850");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, (long) (short) 100, "P0Y000DT00000.5228", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.5228" + "'", str5, "P0Y000DT00000.5228");
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str3 = token2.toString();
        java.lang.Object obj4 = token2.getValue();
        java.lang.String str5 = token2.toString();
        java.lang.Object obj6 = token2.getValue();
        java.lang.String str7 = token2.toString();
        java.lang.Object obj8 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "S" + "'", obj4, "S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "S" + "'", obj6, "S");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "S" + "'", obj8, "S");
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.0642", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0642" + "'", str3, "P0Y000DT00000.0642");
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 35, (long) (short) 100, "P0Y000DT00000.7590");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.7590" + "'", str3, "P0Y000DT00000.7590");
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "52");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "52" + "'", str2, "52");
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "35", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "35" + "'", str3, "35");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) (short) 10, "0:00:00.101");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.101" + "'", str3, "0:00:00.101");
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 52, "P0Y000DT00000.0081");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0081" + "'", str2, "P0Y000DT00000.0081");
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
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
        java.lang.Object obj38 = token37.getValue();
        int int39 = token37.getCount();
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
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        int int5 = token2.getCount();
        java.lang.String str6 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str8 = token2.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 38, "P0Y000DT00000.10100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.10100" + "'", str5, "P0Y000DT00000.10100");
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 3, "0000", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000" + "'", str3, "0000");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
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
        java.lang.Class<?> wildcardClass38 = token32.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 39, "P0Y0M0DT0H0M0.86S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.8639" + "'", str2, "P0Y000DT00000.8639");
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        java.lang.Object obj2 = token1.getValue();
        java.lang.String str3 = token1.toString();
        java.lang.Object obj4 = token1.getValue();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0d + "'", obj2, 100.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100.0" + "'", str3, "100.0");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0d + "'", obj4, 100.0d);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int12 = token11.getCount();
        int int13 = token11.getCount();
        boolean boolean14 = token2.equals((java.lang.Object) token11);
        java.lang.Class<?> wildcardClass15 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.010-31");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.010-31" + "'", str2, "P0Y000DT00000.010-31");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.860");
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 38, "P0Y000DT00000.097-20", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.097-20" + "'", str5, "P0Y000DT00000.097-20");
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj5 = token2.getValue();
        java.lang.String str6 = token2.toString();
        java.lang.Object obj7 = token2.getValue();
        int int8 = token2.getCount();
        java.lang.Object obj9 = token2.getValue();
        int int10 = token2.getCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "hi!" + "'", obj5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        java.lang.Object obj6 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) -1);
        int int10 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str14 = token13.toString();
        java.lang.String str15 = token13.toString();
        boolean boolean16 = token2.equals((java.lang.Object) token13);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) 'a');
        java.lang.String str21 = token2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str21, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 10, (long) 2, "P0Y000DT00000.6322");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6322" + "'", str3, "P0Y000DT00000.6322");
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.810");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.810" + "'", str2, "P0Y000DT00000.810");
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) 53, "P0Y000DT00000.6334");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6334" + "'", str3, "P0Y000DT00000.6334");
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 100, "P0Y000DT00000.9996", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.9996" + "'", str5, "P0Y000DT00000.9996");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.982");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.982" + "'", str2, "P0Y000DT00000.982");
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        token13.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        boolean boolean16 = token9.equals((java.lang.Object) token15);
        java.lang.String str17 = token9.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 100L, "P0Y000DT00000.1365", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.1365" + "'", str5, "P0Y000DT00000.1365");
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 37, "", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
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
        java.lang.Object obj15 = token9.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "m" + "'", obj13, "m");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "m" + "'", obj15, "m");
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str18 = token17.toString();
        boolean boolean20 = token17.equals((java.lang.Object) 100L);
        int int21 = token17.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int24 = token23.getCount();
        boolean boolean26 = token23.equals((java.lang.Object) "0:00:00.99");
        boolean boolean27 = token17.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str28 = token17.toString();
        boolean boolean29 = token2.equals((java.lang.Object) token17);
        int int30 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token33 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token31, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str18, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str28, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.47-9");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.47-9" + "'", str2, "P0Y000DT00000.47-9");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.62S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.6210" + "'", str2, "P0Y000DT00000.6210");
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str2 = token1.toString();
        int int3 = token1.getCount();
        int int4 = token1.getCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.010" + "'", str2, "0:00:00.010");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
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
        int int22 = token21.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token21);
        java.lang.Class<?> wildcardClass24 = token21.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
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
        java.lang.Object obj21 = null;
        boolean boolean22 = token11.equals(obj21);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int7 = token6.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        java.lang.String str9 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        java.lang.Class<?> wildcardClass11 = token10.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str9, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
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
        token12.increment();
        token12.increment();
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
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 53, (long) (short) 100, "P0Y000DT00000.4858", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.4858" + "'", str5, "P0Y000DT00000.4858");
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 37, "P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653" + "'", str3, "P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653P0Y000DT00000.0653");
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 2, (long) 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.052S" + "'", str2, "P0Y0M0DT0H0M0.052S");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 36, (long) 36, "P0Y000DT00000.06811");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06811" + "'", str3, "P0Y000DT00000.06811");
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj8 = token2.getValue();
        int int9 = token2.getCount();
        int int10 = token2.getCount();
        int int11 = token2.getCount();
        token2.increment();
        int int13 = token2.getCount();
        token2.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 37 + "'", int13 == 37);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.13S", 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int5 = token4.getCount();
        boolean boolean7 = token4.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str8 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        boolean boolean10 = token2.equals((java.lang.Object) token9);
        java.lang.Object obj11 = token9.getValue();
        token9.increment();
        int int13 = token9.getCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str8, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 'a', (long) (byte) 10, "P0Y000DT00000.54100", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.54100" + "'", str5, "P0Y000DT00000.54100");
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) 'a');
        int int3 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.13S", 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int5 = token4.getCount();
        boolean boolean7 = token4.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str8 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        boolean boolean10 = token2.equals((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str14 = token13.toString();
        boolean boolean16 = token13.equals((java.lang.Object) 100L);
        token13.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        token13.increment();
        int int20 = token13.getCount();
        java.lang.String str21 = token13.toString();
        java.lang.Object obj22 = token13.getValue();
        java.lang.String str23 = token13.toString();
        boolean boolean24 = token9.equals((java.lang.Object) token13);
        java.lang.Object obj25 = token13.getValue();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str8, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 37 + "'", int20 == 37);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str21, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "hi!" + "'", obj22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str23, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "hi!" + "'", obj25, "hi!");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0");
        java.lang.Object obj2 = token1.getValue();
        int int3 = token1.getCount();
        int int4 = token1.getCount();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "0" + "'", obj2, "0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        int int6 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int9 = token8.getCount();
        boolean boolean11 = token8.equals((java.lang.Object) "0:00:00.99");
        boolean boolean12 = token2.equals((java.lang.Object) "0:00:00.99");
        int int13 = token2.getCount();
        java.lang.String str14 = token2.toString();
        java.lang.Object obj15 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "hi!" + "'", obj15, "hi!");
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) 97, "P0Y000DT00000.01132");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.01132" + "'", str3, "P0Y000DT00000.01132");
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, 100L, "H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int7 = token6.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str13 = token12.toString();
        boolean boolean15 = token12.equals((java.lang.Object) 100L);
        token12.increment();
        boolean boolean18 = token12.equals((java.lang.Object) "M");
        java.lang.String str19 = token12.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token21);
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token21);
        int int24 = token21.getCount();
        int int25 = token21.getCount();
        boolean boolean26 = token6.equals((java.lang.Object) token21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str13, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str19, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        java.lang.String str10 = token9.toString();
        java.lang.String str11 = token9.toString();
        java.lang.Object obj12 = token9.getValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "");
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m", (-1));
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        java.lang.Object obj6 = token5.getValue();
        java.lang.Object obj7 = token5.getValue();
        java.lang.Class<?> wildcardClass8 = token5.getClass();
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token68 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token24);
        int int69 = token68.getCount();
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
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0Y0M0DT0H0M0.061S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.06197" + "'", str2, "P0Y000DT00000.06197");
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) (short) 0, "P0Y000DT00000.47-65", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.47-65" + "'", str5, "P0Y000DT00000.47-65");
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.09911", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09911" + "'", str3, "P0Y000DT00000.09911");
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.00310");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) 'a');
        boolean boolean6 = token4.equals((java.lang.Object) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 1, (int) (byte) 0);
        boolean boolean9 = token1.equals((java.lang.Object) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 1, (int) ' ');
        int int12 = token11.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int15 = token14.getCount();
        int int16 = token14.getCount();
        java.lang.Object obj17 = token14.getValue();
        java.lang.String str18 = token14.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14);
        java.lang.Object obj20 = token19.getValue();
        boolean boolean21 = token11.equals(obj20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj17, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str18, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str3, 35);
        token5.increment();
        java.lang.Class<?> wildcardClass7 = token5.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        java.lang.String str9 = token5.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m", (-1));
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, (int) 'a');
        token3.increment();
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 38, "0:00:00.039");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.039" + "'", str3, "0:00:00.039");
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        token8.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        java.lang.Object obj11 = token8.getValue();
        java.lang.Object obj12 = token8.getValue();
        java.lang.String str13 = token8.toString();
        java.lang.Class<?> wildcardClass14 = token8.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str13, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.00310");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int2, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 101, (long) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        int int9 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str13 = token12.toString();
        boolean boolean15 = token12.equals((java.lang.Object) 100L);
        token12.increment();
        boolean boolean18 = token12.equals((java.lang.Object) "M");
        java.lang.String str19 = token12.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12, (int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = token21.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token21);
        boolean boolean24 = token2.equals((java.lang.Object) token23);
        org.apache.commons.lang.time.DurationFormatUtils.Token token26 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token23, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int31 = token30.getCount();
        boolean boolean32 = token28.equals((java.lang.Object) token30);
        token30.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token30, 10);
        token35.increment();
        int int37 = token35.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token39 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int37, (int) (byte) 100);
        java.lang.String str40 = token39.toString();
        java.lang.Object obj41 = token39.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token43 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj41, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token45 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 0, (int) (byte) -1);
        token45.increment();
        boolean boolean47 = token26.equals((java.lang.Object) token45);
        token45.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37 + "'", int9 == 37);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str13, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str19, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 11 + "'", int37 == 11);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str40, "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + 11 + "'", obj41, 11);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(10L, (long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 2, "P0Y000DT00000.0020", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0020" + "'", str5, "P0Y000DT00000.0020");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 36, true, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 seconds" + "'", str3, "0 seconds");
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 37, (long) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.063S" + "'", str2, "P0Y0M0DT0H0M0.063S");
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj8, 0);
        java.lang.Object obj11 = token10.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 39, "P0Y000DT00000.053-33");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.053-33" + "'", str2, "P0Y000DT00000.053-33");
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        java.lang.String str10 = token9.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str10, (int) '4');
        token12.increment();
        java.lang.String str14 = token12.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 35, "P0Y0M0DT0H0M0.95S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.9535" + "'", str2, "P0Y000DT00000.9535");
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37);
        java.lang.Class<?> wildcardClass6 = token5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.063-2", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.063-2" + "'", str3, "P0Y000DT00000.063-2");
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 39, (long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.71S" + "'", str2, "P0Y0M0DT0H0M0.71S");
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        java.lang.String str18 = token17.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str15, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str18, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (-1), (long) 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.098S" + "'", str2, "P0Y0M0DT0H0M0.098S");
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.00310");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) 'a');
        boolean boolean6 = token4.equals((java.lang.Object) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 1, (int) (byte) 0);
        boolean boolean9 = token1.equals((java.lang.Object) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean9, 35);
        java.lang.String str12 = token11.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        token13.increment();
        java.lang.Object obj15 = token13.getValue();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "falsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalse" + "'", str12, "falsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalse");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "falsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalse");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "falsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalse");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "falsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalse");
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 37, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 36, "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 'a', "P0000Y000DT00000.097100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0000Y000DT00000.097100" + "'", str2, "P0000Y000DT00000.097100");
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 54, 0L, "P0Y0M0DT0H0M0.036S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.036-54" + "'", str5, "P0Y000DT00000.036-54");
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        int int6 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int9 = token8.getCount();
        boolean boolean11 = token8.equals((java.lang.Object) "0:00:00.99");
        boolean boolean12 = token2.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str13 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str13);
        int int15 = token14.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14);
        java.lang.String str17 = token14.toString();
        token14.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str13, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.0038", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0038" + "'", str3, "P0Y000DT00000.0038");
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        java.lang.Object obj7 = token2.getValue();
        boolean boolean9 = token2.equals((java.lang.Object) "H");
        java.lang.Class<?> wildcardClass10 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass10, 52);
        java.lang.Class<?> wildcardClass14 = token13.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass14, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, (long) (byte) 100, "P0Y000DT00000.0030");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0030" + "'", str3, "P0Y000DT00000.0030");
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.048S" + "'", str2, "P0Y0M0DT0H0M0.048S");
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y000DT00000.02100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02100" + "'", str3, "P0Y000DT00000.02100");
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 54, (long) 52, "1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 32, "P0Y000DT00000.98-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.98-1" + "'", str3, "P0Y000DT00000.98-1");
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) -1, (long) (short) -1, "P0000Y000DT00000.097-33");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.097-33" + "'", str3, "P0000Y000DT00000.097-33");
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
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
        int int35 = token32.getCount();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        int int10 = token8.getCount();
        int int11 = token8.getCount();
        java.lang.Object obj12 = token8.getValue();
        int int13 = token8.getCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 32, (long) (byte) 0, "P0Y0M0DT0H0M0.007S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.007-32" + "'", str3, "P0Y000DT00000.007-32");
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        java.lang.Object obj6 = token3.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 36);
        token3.increment();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj6, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj5 = token2.getValue();
        java.lang.String str6 = token2.toString();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        int int10 = token9.getCount();
        boolean boolean11 = token2.equals((java.lang.Object) token9);
        boolean boolean13 = token2.equals((java.lang.Object) "P0Y000DT00000.00310");
        int int14 = token2.getCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "hi!" + "'", obj5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36 + "'", int14 == 36);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.97-2", (int) (byte) 1);
        token2.increment();
        int int4 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        java.lang.Object obj6 = token3.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 36);
        int int9 = token8.getCount();
        java.lang.Object obj10 = token8.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, (int) '4');
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj6, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        java.lang.Object obj4 = token1.getValue();
        java.lang.String str5 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 100);
        java.lang.String str8 = token1.toString();
        int int9 = token1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj4, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str8, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.10297", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10297" + "'", str3, "P0Y000DT00000.10297");
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int8 = token7.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, (int) (short) 100);
        java.lang.String str11 = token7.toString();
        token7.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str23 = token22.toString();
        boolean boolean25 = token22.equals((java.lang.Object) 100L);
        token22.increment();
        boolean boolean28 = token22.equals((java.lang.Object) "M");
        java.lang.String str29 = token22.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token22, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token31);
        org.apache.commons.lang.time.DurationFormatUtils.Token token33 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token31);
        org.apache.commons.lang.time.DurationFormatUtils.Token token34 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token33);
        int int35 = token34.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token36 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int35);
        boolean boolean37 = token15.equals((java.lang.Object) int35);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str23, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str29, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(1L, 1L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 10, "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010" + "'", str5, "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010");
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str21 = token20.toString();
        boolean boolean23 = token20.equals((java.lang.Object) 100L);
        token20.increment();
        boolean boolean26 = token20.equals((java.lang.Object) "M");
        java.lang.String str27 = token20.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token20, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token29);
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token29);
        org.apache.commons.lang.time.DurationFormatUtils.Token token34 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean36 = token34.equals((java.lang.Object) (short) 100);
        token34.increment();
        java.lang.Object obj38 = token34.getValue();
        token34.increment();
        boolean boolean40 = token31.equals((java.lang.Object) token34);
        org.apache.commons.lang.time.DurationFormatUtils.Token token41 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token34);
        org.apache.commons.lang.time.DurationFormatUtils.Token token43 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int44 = token43.getCount();
        boolean boolean46 = token43.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str47 = token43.toString();
        boolean boolean48 = token34.equals((java.lang.Object) str47);
        org.apache.commons.lang.time.DurationFormatUtils.Token token50 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token34, 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token52 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token50, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token53 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token50);
        boolean boolean54 = token12.equals((java.lang.Object) token53);
        int int55 = token12.getCount();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str21, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str27, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + "hi!" + "'", obj38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str47, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.82101", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.82101" + "'", str3, "P0Y000DT00000.82101");
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.0030", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0030" + "'", str3, "P0Y000DT00000.0030");
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str2 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        java.lang.Object obj6 = token4.getValue();
        int int7 = token4.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.65S", 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10);
        boolean boolean12 = token4.equals((java.lang.Object) token10);
        boolean boolean14 = token10.equals((java.lang.Object) 1.0f);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.010" + "'", str2, "0:00:00.010");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "0:00:00.010");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "0:00:00.010");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "0:00:00.010");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int2, (-1));
        java.lang.Class<?> wildcardClass5 = token4.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass5);
        java.lang.Object obj7 = token6.getValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "class org.apache.commons.lang.time.DurationFormatUtils$Token");
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 53, (long) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.57S" + "'", str2, "P0Y0M0DT0H0M0.57S");
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 54, (long) 101);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.047S" + "'", str2, "P0Y0M0DT0H0M0.047S");
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 54, (long) ' ', "P0Y000DT00000.922", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.922" + "'", str5, "P0Y000DT00000.922");
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int11 = token10.getCount();
        boolean boolean13 = token10.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj14 = token10.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10);
        int int16 = token15.getCount();
        int int17 = token15.getCount();
        java.lang.Object obj18 = token15.getValue();
        boolean boolean19 = token2.equals((java.lang.Object) token15);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 38, "P0000Y000DT00000.097100", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0000Y000DT00000.097100" + "'", str3, "P0000Y000DT00000.097100");
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token34 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token34);
        token34.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token37 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token34);
        org.apache.commons.lang.time.DurationFormatUtils.Token token39 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token41 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100", 35);
        org.apache.commons.lang.time.DurationFormatUtils.Token token43 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token41, (int) (short) 100);
        java.lang.String str44 = token41.toString();
        boolean boolean45 = token34.equals((java.lang.Object) token41);
        boolean boolean46 = token30.equals((java.lang.Object) boolean45);
        org.apache.commons.lang.time.DurationFormatUtils.Token token48 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int49 = token48.getCount();
        int int50 = token48.getCount();
        java.lang.Object obj51 = token48.getValue();
        java.lang.String str52 = token48.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token53 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token48);
        java.lang.Object obj54 = token53.getValue();
        java.lang.Object obj55 = token53.getValue();
        boolean boolean56 = token30.equals((java.lang.Object) token53);
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100" + "'", str44, "P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj51, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str52, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertEquals(obj54.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj54), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj54), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj55), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDurationWords((long) 52, false, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0 days 0 hours 0 minutes 0 seconds" + "'", str3, "0 days 0 hours 0 minutes 0 seconds");
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str7 = token6.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str7, 35);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int14 = token13.getCount();
        boolean boolean15 = token11.equals((java.lang.Object) token13);
        token13.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, 10);
        token18.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18);
        java.lang.Object obj21 = token18.getValue();
        boolean boolean22 = token9.equals(obj21);
        boolean boolean23 = token1.equals(obj21);
        org.apache.commons.lang.time.DurationFormatUtils.Token token26 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str27 = token26.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str27, 35);
        int int30 = token29.getCount();
        java.lang.Object obj31 = token29.getValue();
        boolean boolean32 = token1.equals((java.lang.Object) token29);
        token1.increment();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertEquals(obj21.toString(), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj21), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj21), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 35, (long) 38, "P0Y000DT00000.03410", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03410" + "'", str5, "P0Y000DT00000.03410");
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) (byte) 10, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 54, (long) 1, "0:00:00.000", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.000" + "'", str5, "0:00:00.000");
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        java.lang.Object obj5 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean10 = token8.equals((java.lang.Object) (short) 100);
        java.lang.Object obj11 = token8.getValue();
        java.lang.String str12 = token8.toString();
        java.lang.Object obj13 = token8.getValue();
        token8.increment();
        boolean boolean15 = token2.equals((java.lang.Object) token8);
        int int16 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int16, 11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 11, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = token20.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "S" + "'", obj5, "S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36 + "'", int16 == 36);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.13S", 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int5 = token4.getCount();
        boolean boolean7 = token4.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str8 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        boolean boolean10 = token2.equals((java.lang.Object) token9);
        java.lang.Class<?> wildcardClass11 = token2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str8, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, 100L, "P0Y0M0DT0H0M0.39S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.3990" + "'", str3, "P0Y000DT00000.3990");
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 0, 100L);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        java.lang.Object obj5 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean10 = token8.equals((java.lang.Object) (short) 100);
        java.lang.Object obj11 = token8.getValue();
        java.lang.String str12 = token8.toString();
        java.lang.Object obj13 = token8.getValue();
        token8.increment();
        boolean boolean15 = token2.equals((java.lang.Object) token8);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        java.lang.String str17 = token8.toString();
        java.lang.String str18 = token8.toString();
        java.lang.Class<?> wildcardClass19 = token8.getClass();
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "S" + "'", obj5, "S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str18, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.08698", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.08698" + "'", str3, "P0Y000DT00000.08698");
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 100, "P0Y000DT00000.099-100", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.099-100" + "'", str3, "P0Y000DT00000.099-100");
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.97-2", (int) (byte) 1);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str7 = token6.toString();
        boolean boolean9 = token6.equals((java.lang.Object) 100L);
        token6.increment();
        token6.increment();
        boolean boolean13 = token6.equals((java.lang.Object) "");
        int int14 = token6.getCount();
        int int15 = token6.getCount();
        int int16 = token6.getCount();
        token6.increment();
        token6.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str22 = token21.toString();
        boolean boolean24 = token21.equals((java.lang.Object) 100L);
        token21.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token26 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token21);
        java.lang.String str27 = token21.toString();
        boolean boolean28 = token6.equals((java.lang.Object) token21);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        boolean boolean30 = token2.equals((java.lang.Object) token6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37 + "'", int14 == 37);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37 + "'", int15 == 37);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 37 + "'", int16 == 37);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str27, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str2 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        java.lang.Object obj7 = token6.getValue();
        int int8 = token6.getCount();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.010" + "'", str2, "0:00:00.010");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        token1.increment();
        java.lang.Object obj5 = token1.getValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj5, "P0Y0M0DT0H0M0.002S");
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.10064", (int) '4');
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str8 = token7.toString();
        boolean boolean10 = token7.equals((java.lang.Object) 100L);
        token7.increment();
        token7.increment();
        token7.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int16 = token15.getCount();
        boolean boolean18 = token15.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj19 = token15.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15);
        int int21 = token20.getCount();
        int int22 = token20.getCount();
        java.lang.Object obj23 = token20.getValue();
        boolean boolean24 = token7.equals((java.lang.Object) token20);
        token7.increment();
        boolean boolean26 = token4.equals((java.lang.Object) token7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj19, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        int int10 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int10);
        java.lang.Class<?> wildcardClass12 = token11.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int8 = token2.getCount();
        java.lang.Object obj9 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100", 35);
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15, (int) (short) 100);
        boolean boolean18 = token2.equals((java.lang.Object) token15);
        java.lang.Object obj19 = token15.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "P0Y000DT00000.100" + "'", obj19, "P0Y000DT00000.100");
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        int int9 = token2.getCount();
        java.lang.String str10 = token2.toString();
        java.lang.Object obj11 = token2.getValue();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37 + "'", int9 == 37);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 36);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        java.lang.String str6 = token1.toString();
        int int7 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 11);
        token9.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int18 = token17.getCount();
        java.lang.Object obj19 = token17.getValue();
        java.lang.Class<?> wildcardClass20 = token17.getClass();
        boolean boolean21 = token15.equals((java.lang.Object) wildcardClass20);
        boolean boolean22 = token9.equals((java.lang.Object) token15);
        java.lang.Class<?> wildcardClass23 = token15.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str6, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "s" + "'", obj19, "s");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.13S", 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int5 = token4.getCount();
        boolean boolean7 = token4.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str8 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        boolean boolean10 = token2.equals((java.lang.Object) token9);
        java.lang.Object obj11 = token9.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, 39);
        java.lang.String str14 = token13.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str8, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str14, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str10 = token9.toString();
        boolean boolean12 = token9.equals((java.lang.Object) 100L);
        int int13 = token9.getCount();
        boolean boolean14 = token1.equals((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str18 = token17.toString();
        boolean boolean20 = token17.equals((java.lang.Object) 100L);
        token17.increment();
        boolean boolean23 = token17.equals((java.lang.Object) "M");
        java.lang.String str24 = token17.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token26 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token17, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token26);
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token26);
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean33 = token31.equals((java.lang.Object) (short) 100);
        token31.increment();
        java.lang.Object obj35 = token31.getValue();
        token31.increment();
        boolean boolean37 = token28.equals((java.lang.Object) token31);
        org.apache.commons.lang.time.DurationFormatUtils.Token token38 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token31);
        org.apache.commons.lang.time.DurationFormatUtils.Token token40 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int41 = token40.getCount();
        boolean boolean43 = token40.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str44 = token40.toString();
        boolean boolean45 = token31.equals((java.lang.Object) str44);
        org.apache.commons.lang.time.DurationFormatUtils.Token token47 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token31, 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token49 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token47, 0);
        int int50 = token49.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token51 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token49);
        boolean boolean52 = token1.equals((java.lang.Object) token51);
        org.apache.commons.lang.time.DurationFormatUtils.Token token55 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.032S", (int) '4');
        org.apache.commons.lang.time.DurationFormatUtils.Token token58 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean60 = token58.equals((java.lang.Object) (short) 100);
        token58.increment();
        boolean boolean62 = token55.equals((java.lang.Object) token58);
        int int63 = token55.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token65 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int63, (int) (short) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token68 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str69 = token68.toString();
        boolean boolean71 = token68.equals((java.lang.Object) 100L);
        token68.increment();
        boolean boolean74 = token68.equals((java.lang.Object) "M");
        java.lang.String str75 = token68.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token77 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token68, (int) (byte) 100);
        int int78 = token77.getCount();
        boolean boolean80 = token77.equals((java.lang.Object) (-1L));
        int int81 = token77.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token82 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token77);
        boolean boolean83 = token65.equals((java.lang.Object) token77);
        boolean boolean84 = token51.equals((java.lang.Object) token77);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str6, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str18, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str24, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "hi!" + "'", obj35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str44, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 52 + "'", int63 == 52);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str69, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str75, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 100 + "'", int81 == 100);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 0);
        java.lang.Object obj9 = token8.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str6, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 35, "P0Y0M0DT0H0M0.86S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.8636" + "'", str5, "P0Y000DT00000.8636");
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 37, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 35, "P0Y000DT00000.086101", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.086101" + "'", str3, "P0Y000DT00000.086101");
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str7 = token2.toString();
        int int8 = token2.getCount();
        token2.increment();
        token2.increment();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 39, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.String str6 = token2.toString();
        int int7 = token2.getCount();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str10 = token2.toString();
        token2.increment();
        token2.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 1, "P0Y0M0DT0H0M0.036S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0361" + "'", str3, "P0Y000DT00000.0361");
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int8 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int8);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.String str12 = token11.toString();
        boolean boolean13 = token9.equals((java.lang.Object) token11);
        java.lang.String str14 = token9.toString();
        int int15 = token9.getCount();
        java.lang.String str16 = token9.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "m" + "'", str12, "m");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35" + "'", str14, "35");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "35" + "'", str16, "35");
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        boolean boolean11 = token2.equals((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean11, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, (int) (short) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15, 37);
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token17, 11);
        int int20 = token17.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 37 + "'", int20 == 37);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.3253");
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.090-65", 32);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 37);
        int int5 = token4.getCount();
        token4.increment();
        java.lang.String str7 = token4.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 37 + "'", int5 == 37);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ssssssssssssssssssssssssssssssssssssss" + "'", str7, "ssssssssssssssssssssssssssssssssssssss");
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "P0Y000DT00000.48-65", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.48-65" + "'", str3, "P0Y000DT00000.48-65");
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15, (int) (short) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) -1, (int) (short) -1);
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
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, (long) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj8 = token2.getValue();
        int int9 = token2.getCount();
        java.lang.Object obj10 = token2.getValue();
        java.lang.Object obj11 = token2.getValue();
        java.lang.String str12 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 1, (long) 37, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int8 = token2.getCount();
        java.lang.Object obj9 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100", 35);
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15, (int) (short) 100);
        boolean boolean18 = token2.equals((java.lang.Object) token15);
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj20 = token19.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 11, (long) (short) 10, "P0Y000DT00000.6599", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.6599" + "'", str5, "P0Y000DT00000.6599");
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) ' ', "P0Y0M0DT0H0M0.033S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03333" + "'", str3, "P0Y000DT00000.03333");
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        java.lang.Object obj2 = token1.getValue();
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean10 = token8.equals((java.lang.Object) (short) 100);
        boolean boolean11 = token1.equals((java.lang.Object) token8);
        java.lang.String str12 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int17 = token16.getCount();
        boolean boolean18 = token14.equals((java.lang.Object) token16);
        java.lang.String str19 = token14.toString();
        java.lang.Object obj20 = token14.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14, (int) '4');
        boolean boolean23 = token8.equals((java.lang.Object) token22);
        int int24 = token22.getCount();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0d + "'", obj2, 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "m" + "'", str19, "m");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "m" + "'", obj20, "m");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str3 = token2.toString();
        java.lang.Object obj4 = token2.getValue();
        java.lang.String str5 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m", (-1));
        token11.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        boolean boolean15 = token7.equals((java.lang.Object) token11);
        java.lang.Class<?> wildcardClass16 = token7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "S" + "'", obj4, "S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
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
        int int22 = token2.getCount();
        java.lang.Object obj23 = token2.getValue();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
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
        java.lang.Class<?> wildcardClass18 = token12.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P0Y000DT00000.001100P0Y000DT00000.001100" + "'", str16, "P0Y000DT00000.001100P0Y000DT00000.001100");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
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
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj5 = token2.getValue();
        java.lang.String str6 = token2.toString();
        java.lang.Object obj7 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "hi!" + "'", obj5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.032S", (int) '4');
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean7 = token5.equals((java.lang.Object) (short) 100);
        token5.increment();
        boolean boolean9 = token2.equals((java.lang.Object) token5);
        int int10 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int10, (int) (short) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str16 = token15.toString();
        boolean boolean18 = token15.equals((java.lang.Object) 100L);
        token15.increment();
        boolean boolean21 = token15.equals((java.lang.Object) "M");
        java.lang.String str22 = token15.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15, (int) (byte) 100);
        int int25 = token24.getCount();
        boolean boolean27 = token24.equals((java.lang.Object) (-1L));
        int int28 = token24.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token24);
        boolean boolean30 = token12.equals((java.lang.Object) token24);
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token34 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int35 = token34.getCount();
        boolean boolean36 = token32.equals((java.lang.Object) token34);
        java.lang.Object obj37 = token32.getValue();
        boolean boolean38 = token12.equals((java.lang.Object) token32);
        org.apache.commons.lang.time.DurationFormatUtils.Token token40 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token42 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int43 = token42.getCount();
        boolean boolean44 = token40.equals((java.lang.Object) token42);
        boolean boolean46 = token40.equals((java.lang.Object) "P0Y000DT00000.990");
        java.lang.String str47 = token40.toString();
        java.lang.String str48 = token40.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token51 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str52 = token51.toString();
        boolean boolean54 = token51.equals((java.lang.Object) 100L);
        java.lang.Object obj55 = token51.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token56 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token51);
        int int57 = token56.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token59 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token56, (int) (short) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token61 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token56, (int) (short) 100);
        token56.increment();
        java.lang.String str63 = token56.toString();
        boolean boolean64 = token40.equals((java.lang.Object) token56);
        boolean boolean65 = token12.equals((java.lang.Object) boolean64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str16, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "m" + "'", obj37, "m");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "m" + "'", str47, "m");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "m" + "'", str48, "m");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str52, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj55 + "' != '" + "hi!" + "'", obj55, "hi!");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str63, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37, (int) (short) 10);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.10100");
        java.lang.String str2 = token1.toString();
        token1.increment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.10100" + "'", str2, "P0Y000DT00000.10100");
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.9690", (int) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int5 = token4.getCount();
        boolean boolean7 = token4.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj8 = token4.getValue();
        boolean boolean9 = token2.equals((java.lang.Object) token4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj8, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.10132", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10132" + "'", str3, "P0Y000DT00000.10132");
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        token1.increment();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12, (int) (byte) 0);
        boolean boolean16 = token14.equals((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1.0d));
        java.lang.String str19 = token18.toString();
        token18.increment();
        java.lang.String str21 = token18.toString();
        boolean boolean22 = token14.equals((java.lang.Object) str21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1.0" + "'", str19, "-1.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1.0-1.0" + "'", str21, "-1.0-1.0");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.13S", 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int5 = token4.getCount();
        boolean boolean7 = token4.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str8 = token4.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        boolean boolean10 = token2.equals((java.lang.Object) token9);
        token2.increment();
        java.lang.String str12 = token2.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str8, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "P0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13S" + "'", str12, "P0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13SP0Y0M0DT0H0M0.13S");
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 53, (long) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.48S" + "'", str2, "P0Y0M0DT0H0M0.48S");
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((-1L), "P0Y000DT00000.0650", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0650" + "'", str3, "P0Y000DT00000.0650");
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) (short) -1, "1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean3 = token1.equals((java.lang.Object) "hi!");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        token6.increment();
        boolean boolean8 = token1.equals((java.lang.Object) token6);
        int int9 = token6.getCount();
        boolean boolean11 = token6.equals((java.lang.Object) 0.0f);
        java.lang.String str12 = token6.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mm" + "'", str12, "mm");
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "0:00:00.101", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.101" + "'", str3, "0:00:00.101");
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0000Y0M0DT0H0M0.097S");
        java.lang.Object obj2 = token1.getValue();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "P0000Y0M0DT0H0M0.097S" + "'", obj2, "P0000Y0M0DT0H0M0.097S");
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        boolean boolean11 = token2.equals((java.lang.Object) "P0Y000DT00000.052-35");
        java.lang.Object obj12 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        token2.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y0M0DT0H0M0.65S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.651" + "'", str3, "P0Y000DT00000.651");
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, 0L, "P0Y0M0DT0H0M0.100S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.1000" + "'", str3, "P0Y000DT00000.1000");
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.06510P0Y000DT00000.06510P0Y000DT00000.06510", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06510P0Y000DT00000.06510P0Y000DT00000.06510" + "'", str3, "P0Y000DT00000.06510P0Y000DT00000.06510P0Y000DT00000.06510");
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean11 = token9.equals((java.lang.Object) "hi!");
        boolean boolean12 = token2.equals((java.lang.Object) token9);
        java.lang.Object obj13 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj13, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
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
        java.lang.String str16 = token15.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str16, 11);
        token18.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "m" + "'", obj13, "m");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 97, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.03232");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int3 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 100, "P0Y0M0DT0H0M0.068S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.068100" + "'", str3, "P0Y000DT00000.068100");
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.8010", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.8010" + "'", str3, "P0Y000DT00000.8010");
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) '#', "P0Y0M0DT0H0M0.098S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09835" + "'", str3, "P0Y000DT00000.09835");
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
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
        int int22 = token21.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token21, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 1);
        java.lang.String str10 = token9.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d, (-1));
        java.lang.Class<?> wildcardClass3 = token2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.String str2 = token1.toString();
        token1.increment();
        java.lang.String str4 = token1.toString();
        boolean boolean6 = token1.equals((java.lang.Object) "P0Y000DT00000.03-1");
        token1.increment();
        java.lang.String str8 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str8);
        java.lang.String str10 = token9.toString();
        int int11 = token9.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.String str14 = token13.toString();
        token13.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, (int) '4');
        int int18 = token17.getCount();
        boolean boolean19 = token9.equals((java.lang.Object) int18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mm" + "'", str4, "mm");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mmm" + "'", str8, "mmm");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mmm" + "'", str10, "mmm");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "m" + "'", str14, "m");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) true);
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) true);
        boolean boolean4 = token2.equals((java.lang.Object) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int6 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 1);
        java.lang.String str9 = token2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "true" + "'", str9, "true");
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.097-20");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.097-20");
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        int int12 = token11.getCount();
        boolean boolean14 = token11.equals((java.lang.Object) (-1L));
        token11.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        token17.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str22 = token21.toString();
        boolean boolean24 = token21.equals((java.lang.Object) 100L);
        token21.increment();
        token21.increment();
        boolean boolean28 = token21.equals((java.lang.Object) "");
        java.lang.Object obj29 = token21.getValue();
        int int30 = token21.getCount();
        boolean boolean31 = token17.equals((java.lang.Object) token21);
        boolean boolean32 = token11.equals((java.lang.Object) boolean31);
        org.apache.commons.lang.time.DurationFormatUtils.Token token33 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean31);
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean37 = token35.equals((java.lang.Object) "hi!");
        org.apache.commons.lang.time.DurationFormatUtils.Token token39 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str40 = token39.toString();
        java.lang.Class<?> wildcardClass41 = token39.getClass();
        boolean boolean42 = token35.equals((java.lang.Object) wildcardClass41);
        org.apache.commons.lang.time.DurationFormatUtils.Token token44 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int45 = token44.getCount();
        boolean boolean47 = token44.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj48 = token44.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token49 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token44);
        org.apache.commons.lang.time.DurationFormatUtils.Token token51 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token54 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean56 = token54.equals((java.lang.Object) (short) 100);
        token54.increment();
        java.lang.Object obj58 = token54.getValue();
        token54.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token61 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token54, (int) (byte) -1);
        boolean boolean62 = token51.equals((java.lang.Object) token54);
        boolean boolean63 = token49.equals((java.lang.Object) token51);
        boolean boolean64 = token35.equals((java.lang.Object) boolean63);
        boolean boolean65 = token33.equals((java.lang.Object) boolean64);
        org.apache.commons.lang.time.DurationFormatUtils.Token token67 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token33, (int) (byte) 1);
        int int68 = token33.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "hi!" + "'", obj29, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 37 + "'", int30 == 37);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0:00:00.010" + "'", str40, "0:00:00.010");
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + obj48 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj48, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + "hi!" + "'", obj58, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj5 = token2.getValue();
        java.lang.String str6 = token2.toString();
        java.lang.Object obj7 = token2.getValue();
        int int8 = token2.getCount();
        int int9 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str13 = token12.toString();
        boolean boolean15 = token12.equals((java.lang.Object) 100L);
        java.lang.Object obj16 = token12.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12);
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12, (int) '4');
        java.lang.Object obj20 = token19.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        int int23 = token22.getCount();
        token22.increment();
        boolean boolean25 = token19.equals((java.lang.Object) token22);
        java.lang.Object obj26 = token22.getValue();
        boolean boolean27 = token2.equals((java.lang.Object) token22);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        token29.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token29);
        int int32 = token29.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token33 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token29);
        boolean boolean34 = token2.equals((java.lang.Object) token29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "hi!" + "'", obj5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str13, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj26, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.032-1");
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y0M0DT0H0M0.03S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.030" + "'", str3, "P0Y000DT00000.030");
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        java.lang.Object obj6 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) -1);
        token2.increment();
        java.lang.String str11 = token2.toString();
        int int12 = token2.getCount();
        java.lang.Class<?> wildcardClass13 = token2.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 38 + "'", int12 == 38);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.100", 100);
        int int3 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str7 = token6.toString();
        boolean boolean9 = token6.equals((java.lang.Object) 100L);
        java.lang.Object obj10 = token6.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean15 = token13.equals((java.lang.Object) "hi!");
        boolean boolean16 = token6.equals((java.lang.Object) token13);
        java.lang.Object obj17 = token13.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, (-1));
        boolean boolean20 = token2.equals((java.lang.Object) token19);
        java.lang.Object obj21 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.90-35");
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int28 = token27.getCount();
        boolean boolean29 = token25.equals((java.lang.Object) token27);
        java.lang.String str30 = token25.toString();
        java.lang.Object obj31 = token25.getValue();
        boolean boolean32 = token23.equals((java.lang.Object) token25);
        token25.increment();
        boolean boolean34 = token2.equals((java.lang.Object) token25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "m" + "'", obj17, "m");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "0:00:00.100" + "'", obj21, "0:00:00.100");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "m" + "'", str30, "m");
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "m" + "'", obj31, "m");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        int int12 = token11.getCount();
        int int13 = token11.getCount();
        boolean boolean15 = token11.equals((java.lang.Object) "P0Y000DT00000.05235");
        token11.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.831");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.831" + "'", str2, "P0Y000DT00000.831");
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        java.lang.Object obj6 = token3.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 36);
        int int9 = token8.getCount();
        java.lang.Object obj10 = token8.getValue();
        java.lang.Class<?> wildcardClass11 = token8.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj6, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.0910");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0910" + "'", str2, "P0Y000DT00000.0910");
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 100, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        java.lang.String str6 = token1.toString();
        int int7 = token1.getCount();
        java.lang.Class<?> wildcardClass8 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass8, (int) (short) 10);
        int int11 = token10.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10);
        java.lang.Class<?> wildcardClass13 = token10.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str6, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
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
        java.lang.Class<?> wildcardClass21 = token20.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, (long) (byte) 100, "P0Y000DT00000.03100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03100" + "'", str3, "P0Y000DT00000.03100");
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.6532");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.6532" + "'", str2, "P0Y000DT00000.6532");
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) 54, "P0Y000DT00000.54100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.54100" + "'", str5, "P0Y000DT00000.54100");
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) -1, (long) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.033S" + "'", str2, "P0Y0M0DT0H0M0.033S");
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.String str2 = token1.toString();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str8 = token7.toString();
        boolean boolean10 = token7.equals((java.lang.Object) 100L);
        token7.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.String str13 = token12.toString();
        java.lang.String str14 = token12.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int17 = token16.getCount();
        int int18 = token16.getCount();
        java.lang.Object obj19 = token16.getValue();
        java.lang.String str20 = token16.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token16);
        boolean boolean22 = token12.equals((java.lang.Object) token16);
        boolean boolean23 = token4.equals((java.lang.Object) token12);
        java.lang.Class<?> wildcardClass24 = token12.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str13, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj19, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str20, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1.0f), (int) '#');
        java.lang.Object obj3 = token2.getValue();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (-1.0f) + "'", obj3, (-1.0f));
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y0M0DT0H0M0.67S", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.6752" + "'", str3, "P0Y000DT00000.6752");
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y0M0DT0H0M0.62S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.621" + "'", str3, "P0Y000DT00000.621");
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.65S", 100);
        int int3 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str7 = token6.toString();
        boolean boolean9 = token6.equals((java.lang.Object) 100L);
        java.lang.Object obj10 = token6.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        int int12 = token6.getCount();
        boolean boolean13 = token2.equals((java.lang.Object) int12);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean13);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int19 = token18.getCount();
        boolean boolean20 = token16.equals((java.lang.Object) token18);
        token18.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18, 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token23);
        java.lang.String str25 = token23.toString();
        boolean boolean26 = token14.equals((java.lang.Object) token23);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str30 = token29.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str30, 35);
        int int33 = token32.getCount();
        java.lang.Object obj34 = token32.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token37 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1), 37);
        boolean boolean38 = token32.equals((java.lang.Object) token37);
        org.apache.commons.lang.time.DurationFormatUtils.Token token40 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean38, (-1));
        boolean boolean41 = token23.equals((java.lang.Object) token40);
        token23.increment();
        java.lang.String str43 = token23.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token45 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str43, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str25, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "" + "'", obj34, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str43, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) (short) 10, "P0Y000DT00000.891");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.891" + "'", str3, "P0Y000DT00000.891");
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 3);
        token6.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        int int9 = token6.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), (long) (byte) -1, "P0Y000DT00000.0030");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0030" + "'", str3, "P0Y000DT00000.0030");
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) 3, "P0Y000DT00000.00137");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00137" + "'", str3, "P0Y000DT00000.00137");
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 35, (long) 4, "P0Y000DT00000.0861");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0861" + "'", str3, "P0Y000DT00000.0861");
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242" + "'", str2, "P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242P0Y000DT00000.03242");
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        java.lang.Object obj18 = token13.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        java.lang.String str20 = token19.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str15, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj18, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str20, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.3990");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.3990" + "'", str2, "P0Y000DT00000.3990");
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        int int7 = token6.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        java.lang.String str9 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10, 37);
        token10.increment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str9, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.99S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean6 = token3.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj7 = token3.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        int int9 = token3.getCount();
        token3.increment();
        java.lang.Object obj11 = token3.getValue();
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        boolean boolean14 = token1.equals((java.lang.Object) token13);
        java.lang.String str15 = token13.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj7, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj11, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str15, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 39, "mmmm", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.036");
        java.lang.String str2 = token1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.036" + "'", str2, "0:00:00.036");
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        java.lang.Object obj6 = token3.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 36);
        token8.increment();
        java.lang.Object obj10 = token8.getValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj6, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token26 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int27 = token26.getCount();
        boolean boolean29 = token26.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj30 = token26.getValue();
        java.lang.String str31 = token26.toString();
        int int32 = token26.getCount();
        token26.increment();
        boolean boolean34 = token22.equals((java.lang.Object) token26);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj30, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str31, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 54, (long) 11, "P0Y000DT00000.0239", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.0239" + "'", str5, "P0Y000DT00000.0239");
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(10L, (long) '#', "P0Y0M0DT0H0M0.002S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00225" + "'", str5, "P0Y000DT00000.00225");
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) '4', (long) 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", str2, "P0Y0M0DT0H0M0.002S");
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
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
        int int17 = token16.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.9996");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.9996" + "'", str2, "P0Y000DT00000.9996");
    }
}

