package org.apache.commons.lang.time;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 100, "P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100" + "'", str3, "P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100");
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.63-11", 37);
        token2.increment();
        java.lang.Object obj4 = token2.getValue();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "P0Y000DT00000.63-11" + "'", obj4, "P0Y000DT00000.63-11");
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
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
        java.lang.String str20 = token16.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "true" + "'", str20, "true");
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 37, "P0Y000DT00000.100-97", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.100-97" + "'", str3, "P0Y000DT00000.100-97");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        java.lang.Class<?> wildcardClass10 = token9.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass10, 0);
        token12.increment();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        java.lang.Object obj7 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        int int10 = token9.getCount();
        boolean boolean11 = token2.equals((java.lang.Object) int10);
        boolean boolean13 = token2.equals((java.lang.Object) "P0Y0M0DT0H0M0.00S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str17 = token16.toString();
        java.lang.String str18 = token16.toString();
        int int19 = token16.getCount();
        java.lang.Class<?> wildcardClass20 = token16.getClass();
        boolean boolean21 = token2.equals((java.lang.Object) wildcardClass20);
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str25 = token24.toString();
        boolean boolean27 = token24.equals((java.lang.Object) 100L);
        token24.increment();
        boolean boolean30 = token24.equals((java.lang.Object) "M");
        org.apache.commons.lang.time.DurationFormatUtils.Token token32 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        boolean boolean33 = token24.equals((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        java.lang.Object obj34 = token24.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token37 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str38 = token37.toString();
        boolean boolean40 = token37.equals((java.lang.Object) 100L);
        token37.increment();
        boolean boolean43 = token37.equals((java.lang.Object) "M");
        java.lang.String str44 = token37.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token46 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token37, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token47 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token46);
        java.lang.Object obj48 = token47.getValue();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        boolean boolean50 = token24.equals((java.lang.Object) wildcardClass49);
        token24.increment();
        boolean boolean52 = token2.equals((java.lang.Object) token24);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token55 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 1);
        java.lang.Object obj56 = token2.getValue();
        java.lang.String str57 = token2.toString();
        java.lang.Class<?> wildcardClass58 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str18, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str25, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "hi!" + "'", obj34, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str38, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str44, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + "hi!" + "'", obj56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str57, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
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
        int int17 = token5.getCount();
        java.lang.String str18 = token5.toString();
        token5.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37 + "'", int14 == 37);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 37 + "'", int16 == 37);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 37 + "'", int17 == 37);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str18, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        int int10 = token8.getCount();
        token8.increment();
        boolean boolean13 = token8.equals((java.lang.Object) "P0Y000DT00000.62-25");
        java.lang.Object obj14 = token8.getValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.04-7", 100);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        int int6 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int9 = token8.getCount();
        boolean boolean11 = token8.equals((java.lang.Object) "0:00:00.99");
        boolean boolean12 = token2.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj13 = token2.getValue();
        int int14 = token2.getCount();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100");
        java.lang.String str9 = token8.toString();
        boolean boolean10 = token2.equals((java.lang.Object) token8);
        token8.increment();
        java.lang.Class<?> wildcardClass12 = token8.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P0Y000DT00000.100" + "'", str9, "P0Y000DT00000.100");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.001S", 0);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        int int6 = token2.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
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
        token12.increment();
        java.lang.String str15 = token12.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str15, 52);
        token17.increment();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str15, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
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
        java.lang.String str15 = token9.toString();
        java.lang.Object obj16 = token9.getValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str6, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "hi!" + "'", obj16, "hi!");
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 38, (long) 36, "P0000Y000DT00000.097-33", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0000Y000DT00000.097-33" + "'", str5, "P0000Y000DT00000.097-33");
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.00137");
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) 4, "P0Y000DT00000.10297", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.10297" + "'", str5, "P0Y000DT00000.10297");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        java.lang.Object obj2 = token1.getValue();
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean10 = token8.equals((java.lang.Object) (short) 100);
        boolean boolean11 = token1.equals((java.lang.Object) token8);
        int int12 = token8.getCount();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0d + "'", obj2, 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.83-1");
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 32, "P0Y000DT00000.06435", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.06435" + "'", str5, "P0Y000DT00000.06435");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.10-100");
        java.lang.Class<?> wildcardClass2 = token1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, (int) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, (int) '#');
        token4.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str9 = token8.toString();
        boolean boolean11 = token8.equals((java.lang.Object) 100L);
        java.lang.Object obj12 = token8.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        int int14 = token13.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, (int) (short) 100);
        boolean boolean17 = token4.equals((java.lang.Object) (short) 100);
        java.lang.Object obj18 = token4.getValue();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + (short) 1 + "'", obj18, (short) 1);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 38, "P0Y000DT00000.09110");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09110" + "'", str2, "P0Y000DT00000.09110");
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.5228");
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, 0L, "P0Y000DT00000.47-9", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.47-9" + "'", str5, "P0Y000DT00000.47-9");
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.001-25");
        int int2 = token1.getCount();
        token1.increment();
        token1.increment();
        java.lang.Object obj5 = token1.getValue();
        java.lang.String str6 = token1.toString();
        java.lang.Object obj7 = token1.getValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y000DT00000.001-25" + "'", obj5, "P0Y000DT00000.001-25");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0Y000DT00000.001-25P0Y000DT00000.001-25P0Y000DT00000.001-25" + "'", str6, "P0Y000DT00000.001-25P0Y000DT00000.001-25P0Y000DT00000.001-25");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "P0Y000DT00000.001-25" + "'", obj7, "P0Y000DT00000.001-25");
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        int int6 = token1.getCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 52, "P0Y000DT00000.03-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.03-1" + "'", str3, "P0Y000DT00000.03-1");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) -1, (long) (short) -1, "P0Y000DT00000.86-54");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.86-54" + "'", str3, "P0Y000DT00000.86-54");
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
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
        java.lang.Object obj18 = token4.getValue();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str5, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str7 = token2.toString();
        int int8 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str10 = token9.toString();
        boolean boolean12 = token9.equals((java.lang.Object) "P0Y0M0DT0H0M0.98S");
        java.lang.Class<?> wildcardClass13 = token9.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str19 = token18.toString();
        boolean boolean21 = token18.equals((java.lang.Object) 100L);
        java.lang.Object obj22 = token18.getValue();
        java.lang.Object obj23 = token18.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int28 = token27.getCount();
        boolean boolean29 = token25.equals((java.lang.Object) token27);
        java.lang.Object obj30 = token27.getValue();
        boolean boolean31 = token18.equals((java.lang.Object) token27);
        java.lang.Class<?> wildcardClass32 = token18.getClass();
        boolean boolean33 = token6.equals((java.lang.Object) wildcardClass32);
        org.apache.commons.lang.time.DurationFormatUtils.Token token34 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass32);
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass32);
        org.apache.commons.lang.time.DurationFormatUtils.Token token37 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass32, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str19, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "hi!" + "'", obj22, "hi!");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj30, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) 100, "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        token1.increment();
        java.lang.Object obj3 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str8 = token7.toString();
        boolean boolean10 = token7.equals((java.lang.Object) 100L);
        token7.increment();
        boolean boolean13 = token7.equals((java.lang.Object) "M");
        java.lang.String str14 = token7.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, (int) (byte) 100);
        int int17 = token16.getCount();
        int int18 = token16.getCount();
        java.lang.Class<?> wildcardClass19 = token16.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass19, 11);
        boolean boolean22 = token1.equals((java.lang.Object) wildcardClass19);
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean22, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token26 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 10, 32);
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 32);
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj3, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) -1, "P0Y000DT00000.6537");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.6537" + "'", str2, "P0Y000DT00000.6537");
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str12 = token11.toString();
        boolean boolean14 = token11.equals((java.lang.Object) 100L);
        token11.increment();
        token11.increment();
        boolean boolean18 = token11.equals((java.lang.Object) "");
        java.lang.Object obj19 = token11.getValue();
        boolean boolean21 = token11.equals((java.lang.Object) (short) 100);
        boolean boolean23 = token11.equals((java.lang.Object) "y");
        boolean boolean24 = token7.equals((java.lang.Object) boolean23);
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int32 = token31.getCount();
        java.lang.Object obj33 = token31.getValue();
        java.lang.Class<?> wildcardClass34 = token31.getClass();
        boolean boolean35 = token29.equals((java.lang.Object) wildcardClass34);
        org.apache.commons.lang.time.DurationFormatUtils.Token token36 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token29);
        java.lang.String str37 = token36.toString();
        boolean boolean38 = token7.equals((java.lang.Object) str37);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "hi!" + "'", obj19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + "s" + "'", obj33, "s");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "37373737373737373737" + "'", str37, "37373737373737373737");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        java.lang.Object obj7 = token2.getValue();
        boolean boolean9 = token2.equals((java.lang.Object) "H");
        java.lang.Class<?> wildcardClass10 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass10, 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 52);
        java.lang.Object obj16 = token15.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 52 + "'", obj16, 52);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str2, "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 11, "37373737373737373737", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "37373737373737373737" + "'", str3, "37373737373737373737");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token33 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token32);
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token33, 39);
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
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 38, (long) (short) 1, "P0Y000DT00000.97-1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.97-1" + "'", str3, "P0Y000DT00000.97-1");
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        token1.increment();
        token1.increment();
        token1.increment();
        boolean boolean6 = token1.equals((java.lang.Object) "0");
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str9 = token8.toString();
        boolean boolean10 = token1.equals((java.lang.Object) token8);
        java.lang.Class<?> wildcardClass11 = token8.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0:00:00.010" + "'", str9, "0:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token20);
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
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, 100L, "P0Y000DT00000.024-37", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.024-37" + "'", str5, "P0Y000DT00000.024-37");
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj8 = token2.getValue();
        int int9 = token2.getCount();
        int int10 = token2.getCount();
        java.lang.String str11 = token2.toString();
        int int12 = token2.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.100S" + "'", str2, "P0Y0M0DT0H0M0.100S");
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
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
        java.lang.Class<?> wildcardClass22 = token18.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.4952", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.4952" + "'", str3, "P0Y000DT00000.4952");
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) (byte) 10);
        token4.increment();
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token63 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 101);
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
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj5 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        java.lang.Object obj8 = token7.getValue();
        int int9 = token7.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str15 = token14.toString();
        boolean boolean17 = token14.equals((java.lang.Object) 100L);
        java.lang.Object obj18 = token14.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14);
        int int20 = token14.getCount();
        java.lang.Object obj21 = token14.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14, (int) ' ');
        java.lang.Class<?> wildcardClass24 = token14.getClass();
        boolean boolean25 = token11.equals((java.lang.Object) wildcardClass24);
        boolean boolean26 = token2.equals((java.lang.Object) token11);
        int int27 = token2.getCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "hi!" + "'", obj5, "hi!");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 100.0d + "'", obj8, 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "hi!" + "'", obj21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) '4', "P0Y000DT00000.8332");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.8332" + "'", str2, "P0Y000DT00000.8332");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.039");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str6 = token5.toString();
        boolean boolean8 = token5.equals((java.lang.Object) 100L);
        token5.increment();
        token5.increment();
        boolean boolean12 = token5.equals((java.lang.Object) "");
        int int13 = token5.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int13);
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str18 = token17.toString();
        boolean boolean20 = token17.equals((java.lang.Object) 100L);
        java.lang.Object obj21 = token17.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token17);
        boolean boolean23 = token14.equals((java.lang.Object) token17);
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token17, 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str29 = token28.toString();
        boolean boolean31 = token28.equals((java.lang.Object) 100L);
        java.lang.Object obj32 = token28.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token33 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token28);
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean37 = token35.equals((java.lang.Object) "hi!");
        boolean boolean38 = token28.equals((java.lang.Object) token35);
        java.lang.Object obj39 = token35.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token40 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token35);
        org.apache.commons.lang.time.DurationFormatUtils.Token token43 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str44 = token43.toString();
        boolean boolean46 = token43.equals((java.lang.Object) 100L);
        token43.increment();
        token43.increment();
        boolean boolean50 = token43.equals((java.lang.Object) "");
        java.lang.Object obj51 = token43.getValue();
        boolean boolean52 = token40.equals(obj51);
        boolean boolean53 = token25.equals((java.lang.Object) boolean52);
        int int54 = token25.getCount();
        boolean boolean55 = token1.equals((java.lang.Object) token25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 37 + "'", int13 == 37);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str18, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "hi!" + "'", obj21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str29, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "hi!" + "'", obj32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "m" + "'", obj39, "m");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str44, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + "hi!" + "'", obj51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((-1L), (long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.101S" + "'", str2, "P0Y0M0DT0H0M0.101S");
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str2 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.010" + "'", str2, "0:00:00.010");
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int8 = token7.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, (int) (short) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7, (int) (short) 100);
        java.lang.Object obj13 = token12.getValue();
        int int14 = token12.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) ' ', (long) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.020S" + "'", str2, "P0Y0M0DT0H0M0.020S");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
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
        token11.increment();
        java.lang.Object obj16 = token11.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj16, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        java.lang.Object obj6 = token2.getValue();
        token2.increment();
        int int8 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int8);
        java.lang.Class<?> wildcardClass10 = token9.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 37 + "'", int8 == 37);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        java.lang.Object obj2 = token1.getValue();
        int int3 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean10 = token8.equals((java.lang.Object) (short) 100);
        boolean boolean11 = token1.equals((java.lang.Object) token8);
        java.lang.String str12 = token8.toString();
        java.lang.String str13 = token8.toString();
        java.lang.Object obj14 = token8.getValue();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0d + "'", obj2, 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str13, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean3 = token1.equals((java.lang.Object) "hi!");
        token1.increment();
        token1.increment();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        token7.increment();
        java.lang.Object obj9 = token7.getValue();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "mmmm");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "mmmm");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "mmmm");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
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
        java.lang.Object obj21 = token11.getValue();
        java.lang.Object obj22 = token11.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj22, 36);
        java.lang.Object obj25 = token24.getValue();
        java.lang.String str26 = token24.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 37 + "'", obj21, 37);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 37 + "'", obj22, 37);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 37 + "'", obj25, 37);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "373737373737373737373737373737373737373737373737373737373737373737373737" + "'", str26, "373737373737373737373737373737373737373737373737373737373737373737373737");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 97, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 54, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
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
        int int18 = token15.getCount();
        int int19 = token15.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 4, (long) 36, "P0Y0M0DT0H0M0.55S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.5532" + "'", str5, "P0Y000DT00000.5532");
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
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
        int int37 = token4.getCount();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.0520");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0520" + "'", str2, "P0Y000DT00000.0520");
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.0001");
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 97, (long) (-1), "s");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str7 = token2.toString();
        int int8 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        int int10 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str13 = token12.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12, 0);
        boolean boolean16 = token2.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0:00:00.010" + "'", str13, "0:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token21);
        token22.increment();
        boolean boolean25 = token22.equals((java.lang.Object) "P0Y000DT00000.32-100");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
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
        java.lang.Class<?> wildcardClass24 = token23.getClass();
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
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        java.lang.String str6 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 0);
        token8.increment();
        token8.increment();
        java.lang.Class<?> wildcardClass11 = token8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str6, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (-1), "P0Y000DT00000.4910", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.4910" + "'", str3, "P0Y000DT00000.4910");
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.030", 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0, 32);
        java.lang.Class<?> wildcardClass5 = token4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) (byte) -1, "P0Y000DT00000.09837");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09837" + "'", str3, "P0Y000DT00000.09837");
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.6552");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        token4.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int9 = token8.getCount();
        boolean boolean11 = token8.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj12 = token8.getValue();
        java.lang.String str13 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str17 = token16.toString();
        boolean boolean19 = token16.equals((java.lang.Object) 100L);
        int int20 = token16.getCount();
        boolean boolean21 = token8.equals((java.lang.Object) token16);
        boolean boolean22 = token4.equals((java.lang.Object) token16);
        boolean boolean23 = token1.equals((java.lang.Object) token4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj12, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str13, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 11, "P0Y000DT00000.063-2", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.063-2" + "'", str5, "P0Y000DT00000.063-2");
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
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
        int int14 = token2.getCount();
        int int15 = token2.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 37 + "'", int13 == 37);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37 + "'", int14 == 37);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 37 + "'", int15 == 37);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        token5.increment();
        java.lang.Object obj7 = token5.getValue();
        java.lang.String str8 = token5.toString();
        boolean boolean9 = token2.equals((java.lang.Object) str8);
        java.lang.Object obj10 = null;
        boolean boolean11 = token2.equals(obj10);
        java.lang.Object obj12 = token2.getValue();
        java.lang.String str13 = token2.toString();
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj7, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "P0Y0M0DT0H0M0.002SP0Y0M0DT0H0M0.002S" + "'", str8, "P0Y0M0DT0H0M0.002SP0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "S" + "'", obj12, "S");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int2);
        int int4 = token3.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 100, (long) 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.39S" + "'", str2, "P0Y0M0DT0H0M0.39S");
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.String str2 = token1.toString();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) -1, "-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (byte) 10, "P0Y000DT00000.04854");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04854" + "'", str3, "P0Y000DT00000.04854");
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 101, "P0Y000DT00000.10010", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.10010" + "'", str3, "P0Y000DT00000.10010");
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 0, (long) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str7 = token2.toString();
        int int8 = token2.getCount();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 0);
        token2.increment();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 37);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean9 = token7.equals((java.lang.Object) (short) 100);
        token7.increment();
        token7.increment();
        boolean boolean12 = token1.equals((java.lang.Object) token7);
        int int13 = token1.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str7 = token2.toString();
        int int8 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str10 = token9.toString();
        boolean boolean12 = token9.equals((java.lang.Object) "P0Y0M0DT0H0M0.98S");
        int int13 = token9.getCount();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L, 0);
        int int3 = token2.getCount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj5 = token2.getValue();
        java.lang.String str6 = token2.toString();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        int int10 = token9.getCount();
        boolean boolean11 = token2.equals((java.lang.Object) token9);
        boolean boolean13 = token2.equals((java.lang.Object) "P0Y000DT00000.00310");
        java.lang.String str14 = token2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "hi!" + "'", obj5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token36 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token35);
        java.lang.Object obj37 = token36.getValue();
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
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "0");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "0");
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean6 = token3.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str7 = token3.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, (-1));
        boolean boolean11 = token1.equals((java.lang.Object) token10);
        java.lang.Object obj12 = token1.getValue();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str7, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", obj12, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (-1L), "00", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "00" + "'", str5, "00");
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        java.lang.Object obj7 = token2.getValue();
        boolean boolean9 = token2.equals((java.lang.Object) "H");
        java.lang.Class<?> wildcardClass10 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass10, 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 52);
        java.lang.String str16 = token15.toString();
        java.lang.Object obj17 = token15.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "52" + "'", str16, "52");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 52 + "'", obj17, 52);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj17, 4);
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 11 + "'", obj13, 11);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token48 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token44, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token50 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        token50.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token52 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token50);
        boolean boolean53 = token44.equals((java.lang.Object) token52);
        org.apache.commons.lang.time.DurationFormatUtils.Token token55 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token52, 52);
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 3, 102);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.String str2 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        token1.increment();
        java.lang.Object obj5 = token1.getValue();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "m" + "'", obj5, "m");
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.032S", (int) '4');
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean7 = token5.equals((java.lang.Object) (short) 100);
        token5.increment();
        boolean boolean9 = token2.equals((java.lang.Object) token5);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 97);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 97, (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1.0d));
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean7 = token5.equals((java.lang.Object) (short) 100);
        token5.increment();
        java.lang.Object obj9 = token5.getValue();
        token5.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5, (int) (byte) -1);
        int int13 = token5.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str17 = token16.toString();
        java.lang.String str18 = token16.toString();
        boolean boolean19 = token5.equals((java.lang.Object) token16);
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token5, (int) (short) -1);
        boolean boolean22 = token1.equals((java.lang.Object) (short) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj24 = token1.getValue();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 37 + "'", int13 == 37);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str17, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str18, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + (-1.0d) + "'", obj24, (-1.0d));
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        token1.increment();
        token1.increment();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 4, (long) 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.093S" + "'", str2, "P0Y0M0DT0H0M0.093S");
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 1, "P0Y000DT00000.065100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.065100" + "'", str2, "P0Y000DT00000.065100");
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        java.lang.Object obj8 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) 'a');
        boolean boolean12 = token2.equals((java.lang.Object) token11);
        java.lang.String str13 = token11.toString();
        int int14 = token11.getCount();
        java.lang.String str15 = token11.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str15);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int19 = token18.getCount();
        boolean boolean21 = token18.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj22 = token18.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18);
        int int24 = token18.getCount();
        token18.increment();
        java.lang.Object obj26 = token18.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18, (-1));
        boolean boolean29 = token16.equals((java.lang.Object) (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS" + "'", str13, "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS" + "'", str15, "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj22, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj26, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
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
        int int36 = token18.getCount();
        token18.increment();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.096S" + "'", str2, "P0Y0M0DT0H0M0.096S");
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        token10.increment();
        token10.increment();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        int int9 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int9, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = token11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37 + "'", int9 == 37);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18, 101);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj14, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100");
        java.lang.String str2 = token1.toString();
        java.lang.Class<?> wildcardClass3 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.100" + "'", str2, "P0Y000DT00000.100");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 38, "P0Y000DT00000.03732");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03732" + "'", str2, "P0Y000DT00000.03732");
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        int int9 = token3.getCount();
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 2);
        java.lang.Class<?> wildcardClass13 = token3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        java.lang.String str4 = token2.toString();
        token2.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str4, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.10010", 37);
        int int3 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int3, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 37 + "'", int3 == 37);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.00411", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00411" + "'", str3, "P0Y000DT00000.00411");
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.9025");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.9025");
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str6 = token5.toString();
        boolean boolean8 = token5.equals((java.lang.Object) 100L);
        java.lang.Object obj9 = token5.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj9, (int) '#');
        boolean boolean12 = token2.equals((java.lang.Object) '#');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
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
        boolean boolean63 = token2.equals((java.lang.Object) "P0Y000DT00000.01032");
        java.lang.String str64 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token66 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        token66.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token69 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.001100");
        java.lang.Object obj70 = token69.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token71 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj70);
        java.lang.String str72 = token71.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token74 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str72, 36);
        boolean boolean75 = token66.equals((java.lang.Object) 36);
        boolean boolean76 = token2.equals((java.lang.Object) token66);
        org.apache.commons.lang.time.DurationFormatUtils.Token token79 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str80 = token79.toString();
        boolean boolean82 = token79.equals((java.lang.Object) 100L);
        token79.increment();
        token79.increment();
        boolean boolean86 = token79.equals((java.lang.Object) "");
        boolean boolean88 = token79.equals((java.lang.Object) "P0Y000DT00000.052-35");
        java.lang.Object obj89 = token79.getValue();
        java.lang.Class<?> wildcardClass90 = token79.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token92 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token79, (-1));
        java.lang.String str93 = token92.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token94 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token92);
        boolean boolean95 = token66.equals((java.lang.Object) token94);
        token94.increment();
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str64, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + "P0Y000DT00000.001100" + "'", obj70, "P0Y000DT00000.001100");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "P0Y000DT00000.001100" + "'", str72, "P0Y000DT00000.001100");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str80, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + "hi!" + "'", obj89, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) ' ', 39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.00310");
        int int2 = token1.getCount();
        java.lang.String str3 = token1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00310" + "'", str3, "P0Y000DT00000.00310");
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(100L, (long) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.01S" + "'", str2, "P0Y0M0DT0H0M0.01S");
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int2 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 37);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str8 = token7.toString();
        boolean boolean10 = token7.equals((java.lang.Object) 100L);
        java.lang.Object obj11 = token7.getValue();
        java.lang.Object obj12 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        int int15 = token14.getCount();
        boolean boolean16 = token7.equals((java.lang.Object) int15);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str19 = token18.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token18, 0);
        boolean boolean22 = token7.equals((java.lang.Object) token18);
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        boolean boolean24 = token1.equals((java.lang.Object) token23);
        token1.increment();
        int int26 = token1.getCount();
        java.lang.Class<?> wildcardClass27 = token1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0:00:00.010" + "'", str19, "0:00:00.010");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        java.lang.Object obj4 = token1.getValue();
        java.lang.String str5 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj7 = token6.getValue();
        java.lang.Object obj8 = token6.getValue();
        int int9 = token6.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj4, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 37, (-1L));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.62S" + "'", str2, "P0Y0M0DT0H0M0.62S");
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 3, (long) 38, "P0Y0M0DT0H0M0.096S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.09635" + "'", str3, "P0Y000DT00000.09635");
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "P0Y000DT00000.018-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.018-1" + "'", str3, "P0Y000DT00000.018-1");
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) (byte) 100, "P0Y0M0DT0H0M0.78S", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.7890" + "'", str5, "P0Y000DT00000.7890");
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "P0Y0M0DT0H0M0.002S" + "'", obj17, "P0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 97, (long) 'a', "P0Y000DT00000.031");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.031" + "'", str3, "P0Y000DT00000.031");
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 101, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 100, "P0Y000DT00000.0451");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0451" + "'", str2, "P0Y000DT00000.0451");
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) 3, "P0Y000DT00000.06436", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.06436" + "'", str5, "P0Y000DT00000.06436");
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 54, "P0Y000DT00000.018-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.018-1" + "'", str3, "P0Y000DT00000.018-1");
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 0, (long) 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.039S" + "'", str2, "P0Y0M0DT0H0M0.039S");
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.Object obj9 = token2.getValue();
        token2.increment();
        java.lang.String str11 = token2.toString();
        java.lang.Object obj12 = token2.getValue();
        token2.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
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
        java.lang.String str16 = token15.toString();
        java.lang.String str17 = token15.toString();
        java.lang.Object obj18 = token15.getValue();
        java.lang.String str19 = token15.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str23 = token22.toString();
        boolean boolean25 = token22.equals((java.lang.Object) 100L);
        java.lang.Object obj26 = token22.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token22);
        int int28 = token22.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int28);
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.String str32 = token31.toString();
        boolean boolean33 = token29.equals((java.lang.Object) token31);
        int int34 = token29.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token29);
        boolean boolean36 = token15.equals((java.lang.Object) token35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str23, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "hi!" + "'", obj26, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "m" + "'", str32, "m");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.053S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
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
        java.lang.Object obj24 = token23.getValue();
        token23.increment();
        int int26 = token23.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "hi!" + "'", obj20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 100, (long) 54, "0:00:00.100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.100" + "'", str3, "0:00:00.100");
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        java.lang.Object obj4 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str8 = token7.toString();
        boolean boolean10 = token7.equals((java.lang.Object) 100L);
        token7.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        token7.increment();
        int int14 = token7.getCount();
        boolean boolean15 = token1.equals((java.lang.Object) int14);
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean15, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj4, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37 + "'", int14 == 37);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1), 37);
        java.lang.String str3 = token2.toString();
        int int4 = token2.getCount();
        int int5 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str9 = token8.toString();
        boolean boolean11 = token8.equals((java.lang.Object) 100L);
        token8.increment();
        java.lang.Object obj13 = token8.getValue();
        java.lang.Object obj14 = token8.getValue();
        boolean boolean15 = token2.equals(obj14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str3, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 37 + "'", int4 == 37);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 37 + "'", int5 == 37);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "P0Y0M0DT0H0M0.63S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.630" + "'", str2, "P0Y000DT00000.630");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 39, "P0Y0M0DT0H0M0.042S", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.04239" + "'", str3, "P0Y000DT00000.04239");
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 0, (long) 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.097S" + "'", str2, "P0Y0M0DT0H0M0.097S");
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Class<?> wildcardClass3 = token2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
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
        java.lang.Object obj21 = token14.getValue();
        int int22 = token14.getCount();
        int int23 = token14.getCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj10, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str11, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "hi!" + "'", obj21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) ' ');
        java.lang.Object obj10 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, 1L, "falsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalsefalse", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "fal00000000000000000000000000000000000efalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefale" + "'", str5, "fal00000000000000000000000000000000000efalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefalefale");
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
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
        java.lang.String str29 = token27.toString();
        int int30 = token27.getCount();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (short) 0, (long) (short) 1, "P0Y000DT00000.00336");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00336" + "'", str3, "P0Y000DT00000.00336");
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
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
        java.lang.String str15 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 37 + "'", int13 == 37);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37 + "'", int14 == 37);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.0030", 11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.0030");
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str3, 35);
        boolean boolean7 = token5.equals((java.lang.Object) 'a');
        token5.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        token1.increment();
        token1.increment();
        token1.increment();
        boolean boolean6 = token1.equals((java.lang.Object) "0");
        java.lang.String str7 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10.0d);
        java.lang.String str10 = token9.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str14 = token13.toString();
        boolean boolean16 = token13.equals((java.lang.Object) 100L);
        java.lang.Object obj17 = token13.getValue();
        java.lang.Object obj18 = token13.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str22 = token21.toString();
        boolean boolean24 = token21.equals((java.lang.Object) 100L);
        token21.increment();
        boolean boolean27 = token21.equals((java.lang.Object) "M");
        java.lang.String str28 = token21.toString();
        boolean boolean29 = token13.equals((java.lang.Object) str28);
        int int30 = token13.getCount();
        boolean boolean31 = token9.equals((java.lang.Object) token13);
        boolean boolean32 = token1.equals((java.lang.Object) token13);
        int int33 = token13.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token37 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mmmm" + "'", str7, "mmmm");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0" + "'", str10, "10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "hi!" + "'", obj18, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str28, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 35, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.49S", (int) (short) 0);
        java.lang.String str3 = token2.toString();
        token2.increment();
        java.lang.Class<?> wildcardClass5 = token2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 38, 102);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, 0);
        java.lang.Class<?> wildcardClass19 = token18.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass19);
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str23 = token22.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token22, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token26 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token25);
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token25);
        java.lang.Object obj28 = token27.getValue();
        java.lang.String str29 = token27.toString();
        boolean boolean30 = token20.equals((java.lang.Object) token27);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0:00:00.010" + "'", str23, "0:00:00.010");
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.39S", (int) (short) 0);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        int int12 = token11.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int12);
        int int14 = token13.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        java.lang.String str6 = token1.toString();
        java.lang.Object obj7 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) '4');
        int int10 = token1.getCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "m" + "'", str6, "m");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "m" + "'", obj7, "m");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj7 = token1.getValue();
        int int8 = token1.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 102);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj7, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        java.lang.Object obj2 = token1.getValue();
        int int3 = token1.getCount();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 100.0d + "'", obj2, 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (byte) 10, (long) 102);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.092S" + "'", str2, "P0Y0M0DT0H0M0.092S");
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 100, (long) 3, "P0Y000DT00000.02100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02100" + "'", str3, "P0Y000DT00000.02100");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (byte) 0, "1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d, (-1));
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        java.lang.Object obj4 = token3.getValue();
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + 100.0d + "'", obj4, 100.0d);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        java.lang.Class<?> wildcardClass4 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) -1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.Object obj10 = token9.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(1L, (long) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.98S" + "'", str2, "P0Y0M0DT0H0M0.98S");
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str8 = token7.toString();
        java.lang.String str9 = token7.toString();
        int int10 = token7.getCount();
        java.lang.String str11 = token7.toString();
        java.lang.Object obj12 = token7.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str8, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean5, 0);
        token7.increment();
        java.lang.Class<?> wildcardClass9 = token7.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
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
        token2.increment();
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
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 39, "P0Y000DT00000.980", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.980" + "'", str3, "P0Y000DT00000.980");
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 11, "P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32" + "'", str2, "P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32P0Y000DT00000.065-32");
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 10, (long) 53, "10.010.0", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10.010.0" + "'", str5, "10.010.0");
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj6, (int) '#');
        java.lang.String str9 = token8.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj5 = token2.getValue();
        java.lang.String str6 = token2.toString();
        java.lang.Object obj7 = token2.getValue();
        token2.increment();
        java.lang.Object obj9 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 'a');
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "hi!" + "'", obj5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.982");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 102);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 4, "P0Y000DT00000.39-97", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.39-97" + "'", str3, "P0Y000DT00000.39-97");
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token50 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str51 = token50.toString();
        boolean boolean53 = token50.equals((java.lang.Object) 100L);
        token50.increment();
        token50.increment();
        boolean boolean57 = token50.equals((java.lang.Object) "");
        int int58 = token50.getCount();
        int int59 = token50.getCount();
        int int60 = token50.getCount();
        java.lang.Object obj61 = token50.getValue();
        boolean boolean62 = token47.equals(obj61);
        int int63 = token47.getCount();
        boolean boolean64 = token2.equals((java.lang.Object) token47);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str51, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 37 + "'", int58 == 37);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 37 + "'", int59 == 37);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 37 + "'", int60 == 37);
        org.junit.Assert.assertEquals("'" + obj61 + "' != '" + "hi!" + "'", obj61, "hi!");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.05235");
        int int17 = token16.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        java.lang.Object obj10 = token2.getValue();
        int int11 = token2.getCount();
        java.lang.Object obj12 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str16 = token15.toString();
        boolean boolean18 = token15.equals((java.lang.Object) 100L);
        java.lang.Object obj19 = token15.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15);
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean24 = token22.equals((java.lang.Object) "hi!");
        boolean boolean25 = token15.equals((java.lang.Object) token22);
        boolean boolean26 = token2.equals((java.lang.Object) token22);
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean26);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.Class<?> wildcardClass30 = token29.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass30);
        org.apache.commons.lang.time.DurationFormatUtils.Token token33 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass30, 0);
        boolean boolean34 = token27.equals((java.lang.Object) token33);
        org.apache.commons.lang.time.DurationFormatUtils.Token token37 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str38 = token37.toString();
        boolean boolean40 = token37.equals((java.lang.Object) 100L);
        token37.increment();
        token37.increment();
        java.lang.Object obj43 = token37.getValue();
        boolean boolean44 = token27.equals((java.lang.Object) token37);
        boolean boolean46 = token37.equals((java.lang.Object) "P0Y0M0DT0H0M0.69S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37 + "'", int11 == 37);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str16, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "hi!" + "'", obj19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str38, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "hi!" + "'", obj43, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 0, "P0Y000DT00000.0270", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0270" + "'", str3, "P0Y000DT00000.0270");
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 'a', "P0Y000DT00000.010-98", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.010-98" + "'", str5, "P0Y000DT00000.010-98");
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.90-35");
        java.lang.Object obj2 = token1.getValue();
        token1.increment();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "P0Y000DT00000.90-35" + "'", obj2, "P0Y000DT00000.90-35");
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 102, (long) 37, "P0Y000DT00000.00310");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00310" + "'", str3, "P0Y000DT00000.00310");
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0a00", (int) (short) 10);
        java.lang.Object obj3 = token2.getValue();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "0 0a00" + "'", obj3, "0 0a00");
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        int int10 = token2.getCount();
        java.lang.Object obj11 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 1, "P0Y000DT00000.6611", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.6611" + "'", str5, "P0Y000DT00000.6611");
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        java.lang.Object obj10 = token2.getValue();
        int int11 = token2.getCount();
        java.lang.Object obj12 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str16 = token15.toString();
        boolean boolean18 = token15.equals((java.lang.Object) 100L);
        java.lang.Object obj19 = token15.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token20 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token15);
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean24 = token22.equals((java.lang.Object) "hi!");
        boolean boolean25 = token15.equals((java.lang.Object) token22);
        boolean boolean26 = token2.equals((java.lang.Object) token22);
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean26);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.Class<?> wildcardClass30 = token29.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass30);
        org.apache.commons.lang.time.DurationFormatUtils.Token token33 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass30, 0);
        boolean boolean34 = token27.equals((java.lang.Object) token33);
        java.lang.String str35 = token27.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37 + "'", int11 == 37);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str16, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "hi!" + "'", obj19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "false" + "'", str35, "false");
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (-1), (long) (short) 0, "P0Y0M0DT0H0M0.029S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0291" + "'", str3, "P0Y000DT00000.0291");
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
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
        int int23 = token15.getCount();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 97, "P0Y000DT00000.00135", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00135" + "'", str5, "P0Y000DT00000.00135");
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.Object obj6 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        boolean boolean9 = token2.equals((java.lang.Object) "P0Y0M0DT0H0M0.48S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean9, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "hi!" + "'", obj6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(10L, "P0Y000DT00000.065-100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.065-100" + "'", str2, "P0Y000DT00000.065-100");
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 97, (long) 101, "P0Y000DT00000.05297");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.05297" + "'", str3, "P0Y000DT00000.05297");
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        token1.increment();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str5 = token1.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mmm" + "'", str5, "mmm");
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        token11.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int17 = token16.getCount();
        int int18 = token16.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str22 = token21.toString();
        boolean boolean24 = token21.equals((java.lang.Object) 100L);
        token21.increment();
        token21.increment();
        boolean boolean28 = token21.equals((java.lang.Object) "");
        token21.increment();
        boolean boolean30 = token16.equals((java.lang.Object) token21);
        int int31 = token16.getCount();
        token16.increment();
        boolean boolean33 = token11.equals((java.lang.Object) token16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 32, "P0Y000DT00000.01635");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.01635" + "'", str2, "P0Y000DT00000.01635");
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token23 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, (int) (short) 100);
        token23.increment();
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
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y0M0DT0H0M0.037S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.03710" + "'", str2, "P0Y000DT00000.03710");
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
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
        java.lang.Class<?> wildcardClass19 = token15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean3 = token1.equals((java.lang.Object) "hi!");
        token1.increment();
        java.lang.Class<?> wildcardClass5 = token1.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass5, (int) ' ');
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100L);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        int int11 = token9.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str15 = token14.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str15, 35);
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int22 = token21.getCount();
        boolean boolean23 = token19.equals((java.lang.Object) token21);
        token21.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token26 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token21, 10);
        token26.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token26);
        java.lang.Object obj29 = token26.getValue();
        boolean boolean30 = token17.equals(obj29);
        boolean boolean31 = token9.equals(obj29);
        org.apache.commons.lang.time.DurationFormatUtils.Token token33 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj29, 3);
        boolean boolean34 = token7.equals((java.lang.Object) token33);
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) (byte) 10, "P0Y000DT00000.6337", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.6337" + "'", str5, "P0Y000DT00000.6337");
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 38, "P0Y000DT00000.06437");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06437" + "'", str3, "P0Y000DT00000.06437");
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.String str6 = token2.toString();
        java.lang.Object obj7 = token2.getValue();
        java.lang.Object obj8 = token2.getValue();
        java.lang.Object obj9 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str13 = token12.toString();
        boolean boolean15 = token12.equals((java.lang.Object) 100L);
        token12.increment();
        java.lang.Object obj17 = token12.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj17, (int) '#');
        java.lang.String str20 = token19.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token19);
        boolean boolean22 = token2.equals((java.lang.Object) token21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str13, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "hi!" + "'", obj17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str20, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        boolean boolean7 = token1.equals((java.lang.Object) "P0Y000DT00000.990");
        java.lang.String str8 = token1.toString();
        token1.increment();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "m" + "'", str8, "m");
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
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
        int int20 = token16.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) (byte) 1, "P0Y000DT00000.036-12");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.036-12" + "'", str3, "P0Y000DT00000.036-12");
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Object obj7 = token1.getValue();
        boolean boolean9 = token1.equals((java.lang.Object) 100);
        java.lang.String str10 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj7, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str10, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
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
        java.lang.Class<?> wildcardClass36 = token32.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token37 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token32);
        org.apache.commons.lang.time.DurationFormatUtils.Token token38 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token37);
        token38.increment();
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
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 37, (long) 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.001S" + "'", str2, "P0Y0M0DT0H0M0.001S");
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
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
        int int17 = token11.getCount();
        int int18 = token11.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        int int7 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int7, (int) '4');
        java.lang.Class<?> wildcardClass10 = token9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.00225");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.00225", (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.00225");
        int int5 = token4.getCount();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 35, (long) 53, "P0Y000DT00000.00010", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00010" + "'", str5, "P0Y000DT00000.00010");
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO(0L, (long) 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.052S" + "'", str2, "P0Y0M0DT0H0M0.052S");
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        boolean boolean11 = token2.equals((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        java.lang.Object obj12 = token2.getValue();
        token2.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        java.lang.Object obj9 = token7.getValue();
        int int10 = token7.getCount();
        boolean boolean12 = token7.equals((java.lang.Object) "P0Y000DT00000.6597");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
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
        java.lang.String str26 = token2.toString();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 36);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "hi!" + "'", obj25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str26, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
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
        java.lang.String str17 = token1.toString();
        token1.increment();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token22 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str23 = token22.toString();
        boolean boolean25 = token22.equals((java.lang.Object) 100L);
        int int26 = token22.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int29 = token28.getCount();
        boolean boolean31 = token28.equals((java.lang.Object) "0:00:00.99");
        boolean boolean32 = token22.equals((java.lang.Object) "0:00:00.99");
        int int33 = token22.getCount();
        int int34 = token22.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token37 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str38 = token37.toString();
        boolean boolean40 = token37.equals((java.lang.Object) 100L);
        int int41 = token37.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token43 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int44 = token43.getCount();
        boolean boolean46 = token43.equals((java.lang.Object) "0:00:00.99");
        boolean boolean47 = token37.equals((java.lang.Object) "0:00:00.99");
        java.lang.String str48 = token37.toString();
        boolean boolean49 = token22.equals((java.lang.Object) token37);
        int int50 = token22.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token51 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token22);
        org.apache.commons.lang.time.DurationFormatUtils.Token token52 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token51);
        boolean boolean53 = token1.equals((java.lang.Object) token52);
        java.lang.Class<?> wildcardClass54 = token1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37 + "'", int14 == 37);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "P0Y0M0DT0H0M0.002SP0Y0M0DT0H0M0.002S" + "'", str16, "P0Y0M0DT0H0M0.002SP0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "P0Y0M0DT0H0M0.002SP0Y0M0DT0H0M0.002S" + "'", str17, "P0Y0M0DT0H0M0.002SP0Y0M0DT0H0M0.002S");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str23, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str38, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str48, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        java.lang.Object obj10 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
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
        boolean boolean63 = token2.equals((java.lang.Object) "P0Y000DT00000.01032");
        int int64 = token2.getCount();
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 35 + "'", int64 == 35);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.9236");
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.String str6 = token2.toString();
        int int7 = token2.getCount();
        token2.increment();
        token2.increment();
        int int10 = token2.getCount();
        java.lang.Object obj11 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 37 + "'", int10 == 37);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 10.0d);
        java.lang.Object obj2 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        java.lang.Object obj5 = token4.getValue();
        int int6 = token4.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean13 = token11.equals((java.lang.Object) (short) 100);
        boolean boolean14 = token4.equals((java.lang.Object) token11);
        java.lang.String str15 = token11.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int20 = token19.getCount();
        boolean boolean21 = token17.equals((java.lang.Object) token19);
        java.lang.String str22 = token17.toString();
        java.lang.Object obj23 = token17.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token17, (int) '4');
        boolean boolean26 = token11.equals((java.lang.Object) token25);
        java.lang.Object obj27 = token11.getValue();
        boolean boolean28 = token1.equals(obj27);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + 10.0d + "'", obj2, 10.0d);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 100.0d + "'", obj5, 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "m" + "'", str22, "m");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "m" + "'", obj23, "m");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "hi!" + "'", obj27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean3 = token1.equals((java.lang.Object) "hi!");
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "s");
        int int2 = token1.getCount();
        token1.increment();
        java.lang.String str4 = token1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ss" + "'", str4, "ss");
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.00310");
        java.lang.String str2 = token1.toString();
        token1.increment();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.00310" + "'", str2, "P0Y000DT00000.00310");
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 0, (long) 4, "P0Y000DT00000.03225", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.03225" + "'", str5, "P0Y000DT00000.03225");
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y000DT00000.90-1", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.90-1" + "'", str3, "P0Y000DT00000.90-1");
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 36, "P0Y0M0DT0H0M0.47S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.4736" + "'", str3, "P0Y000DT00000.4736");
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 37, "P0Y000DT00000.01635");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.01635" + "'", str2, "P0Y000DT00000.01635");
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        java.lang.Object obj7 = token2.getValue();
        int int8 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (byte) -1, "P0Y000DT00000.099-100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.099-100" + "'", str3, "P0Y000DT00000.099-100");
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "P0Y000DT00000.06437", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06437" + "'", str3, "P0Y000DT00000.06437");
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str3, 35);
        token5.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        int int9 = token8.getCount();
        boolean boolean10 = token5.equals((java.lang.Object) int9);
        int int11 = token5.getCount();
        token5.increment();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj8 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str12 = token11.toString();
        boolean boolean14 = token11.equals((java.lang.Object) 100L);
        token11.increment();
        token11.increment();
        token11.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int20 = token19.getCount();
        boolean boolean22 = token19.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj23 = token19.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token19);
        int int25 = token24.getCount();
        int int26 = token24.getCount();
        java.lang.Object obj27 = token24.getValue();
        boolean boolean28 = token11.equals((java.lang.Object) token24);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1.0d));
        token31.increment();
        token31.increment();
        boolean boolean34 = token11.equals((java.lang.Object) token31);
        boolean boolean35 = token2.equals((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token38 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str39 = token38.toString();
        boolean boolean41 = token38.equals((java.lang.Object) 100L);
        token38.increment();
        boolean boolean44 = token38.equals((java.lang.Object) "M");
        java.lang.String str45 = token38.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token47 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token38, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token48 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token47);
        org.apache.commons.lang.time.DurationFormatUtils.Token token49 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token47);
        org.apache.commons.lang.time.DurationFormatUtils.Token token52 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean54 = token52.equals((java.lang.Object) (short) 100);
        token52.increment();
        java.lang.Object obj56 = token52.getValue();
        token52.increment();
        boolean boolean58 = token49.equals((java.lang.Object) token52);
        boolean boolean59 = token11.equals((java.lang.Object) token49);
        org.apache.commons.lang.time.DurationFormatUtils.Token token60 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token49);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj23, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str39, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str45, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + "hi!" + "'", obj56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 53, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1" + "'", str3, "-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1-1");
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.010");
        java.lang.String str2 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str9 = token8.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str9, 35);
        int int12 = token11.getCount();
        java.lang.Object obj13 = token11.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1), 37);
        boolean boolean17 = token11.equals((java.lang.Object) token16);
        boolean boolean18 = token4.equals((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token21 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str22 = token21.toString();
        boolean boolean24 = token21.equals((java.lang.Object) 100L);
        java.lang.Object obj25 = token21.getValue();
        java.lang.Object obj26 = token21.getValue();
        int int27 = token21.getCount();
        int int28 = token21.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.00310");
        org.apache.commons.lang.time.DurationFormatUtils.Token token33 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) 'a');
        boolean boolean35 = token33.equals((java.lang.Object) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token37 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 1, (int) (byte) 0);
        boolean boolean38 = token30.equals((java.lang.Object) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token40 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 1, (int) ' ');
        java.lang.Object obj41 = token40.getValue();
        int int42 = token40.getCount();
        boolean boolean43 = token21.equals((java.lang.Object) token40);
        java.lang.String str44 = token40.toString();
        boolean boolean45 = token11.equals((java.lang.Object) token40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0:00:00.010" + "'", str2, "0:00:00.010");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "" + "'", obj13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "hi!" + "'", obj25, "hi!");
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + "hi!" + "'", obj26, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + obj41 + "' != '" + (byte) 1 + "'", obj41, (byte) 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "11111111111111111111111111111111" + "'", str44, "11111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
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
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) (byte) -1);
        java.lang.String str3 = token2.toString();
        java.lang.Class<?> wildcardClass4 = token2.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token12, (int) (byte) 0);
        token14.increment();
        java.lang.Class<?> wildcardClass16 = token14.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass16, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 3, (long) (short) 100, "P0Y0M0DT0H0M0.99S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.9997" + "'", str5, "P0Y000DT00000.9997");
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        boolean boolean6 = token2.equals((java.lang.Object) 10.0d);
        java.lang.String str7 = token2.toString();
        token2.increment();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 102, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 1, "P0Y0M0DT0H0M0.015S");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.0151" + "'", str2, "P0Y000DT00000.0151");
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.String str6 = token2.toString();
        int int7 = token2.getCount();
        token2.increment();
        java.lang.Object obj9 = token2.getValue();
        token2.increment();
        java.lang.String str11 = token2.toString();
        java.lang.Object obj12 = null;
        boolean boolean13 = token2.equals(obj12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + "hi!" + "'", obj9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) (byte) 10, "0:00:00.039", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0:00:00.039" + "'", str5, "0:00:00.039");
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        java.lang.String str2 = token1.toString();
        java.lang.Object obj3 = token1.getValue();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + "m" + "'", obj3, "m");
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        java.lang.Object obj10 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj13 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 37, (long) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.63S" + "'", str2, "P0Y0M0DT0H0M0.63S");
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        token8.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str7 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str11 = token10.toString();
        boolean boolean13 = token10.equals((java.lang.Object) 100L);
        int int14 = token10.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int17 = token16.getCount();
        boolean boolean19 = token16.equals((java.lang.Object) "0:00:00.99");
        boolean boolean20 = token10.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj21 = token10.getValue();
        int int22 = token10.getCount();
        token10.increment();
        java.lang.Class<?> wildcardClass24 = token10.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) wildcardClass24);
        boolean boolean26 = token1.equals((java.lang.Object) token25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str7, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "hi!" + "'", obj21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.098S" + "'", str2, "P0Y0M0DT0H0M0.098S");
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.001-25", (int) (short) -1);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(0L, (long) 35, "P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100" + "'", str5, "P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100P0Y000DT00000.100");
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        boolean boolean11 = token2.equals((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean11, (int) (byte) 0);
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, (int) (short) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token17 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int20 = token19.getCount();
        boolean boolean21 = token17.equals((java.lang.Object) token19);
        java.lang.Object obj22 = token19.getValue();
        token19.increment();
        boolean boolean24 = token13.equals((java.lang.Object) token19);
        java.lang.String str25 = token19.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj22, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S" + "'", str25, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str7 = token2.toString();
        int int8 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str10 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str14 = token13.toString();
        boolean boolean16 = token13.equals((java.lang.Object) 100L);
        token13.increment();
        boolean boolean19 = token13.equals((java.lang.Object) "M");
        java.lang.String str20 = token13.toString();
        java.lang.Class<?> wildcardClass21 = token13.getClass();
        boolean boolean22 = token2.equals((java.lang.Object) wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str20, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.100", 35);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, (int) (short) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 11);
        java.lang.Class<?> wildcardClass9 = token8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str19 = token18.toString();
        boolean boolean21 = token18.equals((java.lang.Object) 100L);
        java.lang.Object obj22 = token18.getValue();
        java.lang.Object obj23 = token18.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token27 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int28 = token27.getCount();
        boolean boolean29 = token25.equals((java.lang.Object) token27);
        java.lang.Object obj30 = token27.getValue();
        boolean boolean31 = token18.equals((java.lang.Object) token27);
        java.lang.Class<?> wildcardClass32 = token18.getClass();
        boolean boolean33 = token6.equals((java.lang.Object) wildcardClass32);
        int int34 = token6.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str19, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "hi!" + "'", obj22, "hi!");
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "hi!" + "'", obj23, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj30, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 38 + "'", int34 == 38);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
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
        int int17 = token11.getCount();
        java.lang.Object obj18 = token11.getValue();
        int int19 = token11.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 2, (long) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.095S" + "'", str2, "P0Y0M0DT0H0M0.095S");
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) -1, (long) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.000S" + "'", str2, "P0Y0M0DT0H0M0.000S");
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.001S", 0);
        java.lang.String str3 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj5 = token4.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token4);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "");
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) (short) -1, "P0Y0M0DT0H0M0.038S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.038-101" + "'", str3, "P0Y000DT00000.038-101");
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, (int) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, (int) '#');
        token4.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str9 = token8.toString();
        boolean boolean11 = token8.equals((java.lang.Object) 100L);
        java.lang.Object obj12 = token8.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        int int14 = token13.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, (int) (short) 100);
        boolean boolean17 = token4.equals((java.lang.Object) (short) 100);
        java.lang.String str18 = token4.toString();
        java.lang.Object obj19 = token4.getValue();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "111111111111111111111111111111111111" + "'", str18, "111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + (short) 1 + "'", obj19, (short) 1);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 100, 39);
        java.lang.Class<?> wildcardClass14 = token13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 39, (long) 36, "P0Y0M0DT0H0M0.060S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.060-3" + "'", str3, "P0Y000DT00000.060-3");
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.00225");
        java.lang.Object obj2 = token1.getValue();
        java.lang.String str3 = token1.toString();
        int int4 = token1.getCount();
        int int5 = token1.getCount();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "P0Y000DT00000.00225" + "'", obj2, "P0Y000DT00000.00225");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.00225" + "'", str3, "P0Y000DT00000.00225");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 1, (long) 97, "0 0a000 0 hour 0 0inute00 0 econ00", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0 0a000 0 hour 0 0inute00 0 econ00" + "'", str5, "0 0a000 0 hour 0 0inute00 0 econ00");
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) ' ', (long) 38, "P0Y000DT00000.8338", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.8338" + "'", str5, "P0Y000DT00000.8338");
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) ' ', "0:00:00.039", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0:00:00.039" + "'", str3, "0:00:00.039");
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '4', (long) 2, "P0Y000DT00000.06435");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.06435" + "'", str3, "P0Y000DT00000.06435");
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m", (-1));
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        token3.increment();
        java.lang.String str7 = token3.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "m" + "'", str7, "m");
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 53, "P0Y000DT00000.0410");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.0410" + "'", str3, "P0Y000DT00000.0410");
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean26 = token24.equals((java.lang.Object) (short) 100);
        token24.increment();
        java.lang.Object obj28 = token24.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj28, (int) '#');
        token30.increment();
        int int32 = token30.getCount();
        token30.increment();
        boolean boolean34 = token2.equals((java.lang.Object) token30);
        org.apache.commons.lang.time.DurationFormatUtils.Token token35 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token37 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        boolean boolean39 = token37.equals((java.lang.Object) "hi!");
        token37.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token42 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token37, (int) (short) 10);
        java.lang.Object obj43 = token42.getValue();
        java.lang.Object obj44 = token42.getValue();
        java.lang.String str45 = token42.toString();
        java.lang.Object obj46 = token42.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token49 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str50 = token49.toString();
        boolean boolean52 = token49.equals((java.lang.Object) 100L);
        java.lang.String str53 = token49.toString();
        int int54 = token49.getCount();
        token49.increment();
        token49.increment();
        boolean boolean57 = token42.equals((java.lang.Object) token49);
        boolean boolean58 = token35.equals((java.lang.Object) token42);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 36 + "'", int32 == 36);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertEquals(obj43.toString(), "mm");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj43), "mm");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj43), "mm");
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertEquals(obj44.toString(), "mm");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj44), "mm");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj44), "mm");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "mmmmmmmmmmmmmmmmmmmm" + "'", str45, "mmmmmmmmmmmmmmmmmmmm");
        org.junit.Assert.assertNotNull(obj46);
        org.junit.Assert.assertEquals(obj46.toString(), "mm");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj46), "mm");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj46), "mm");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str50, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str53, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 35 + "'", int54 == 35);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) (short) 1, (long) 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.051S" + "'", str2, "P0Y0M0DT0H0M0.051S");
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        boolean boolean11 = token2.equals((java.lang.Object) "P0Y000DT00000.052-35");
        java.lang.Object obj12 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str14 = token2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "hi!" + "'", obj12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str14, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 101, "P0Y000DT00000.1310");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.1310" + "'", str2, "P0Y000DT00000.1310");
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        token1.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1, 3);
        token6.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token6);
        java.lang.Class<?> wildcardClass9 = token8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 11, (long) 54, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(100L, "class org.apache.commons.lang.time.DurationFormatUtils$Tokenclass org.apache.commons.lang.time.DurationFormatUtils$Token", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "cla0 org.apache.co0on0.lang.ti0e.DurationForatUtil0$Tokencla org.apache.co0on0.lang.ti0e.DurationForatUtil0$Token" + "'", str3, "cla0 org.apache.co0on0.lang.ti0e.DurationForatUtil0$Tokencla org.apache.co0on0.lang.ti0e.DurationForatUtil0$Token");
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        int int9 = token2.getCount();
        java.lang.String str10 = token2.toString();
        java.lang.String str11 = token2.toString();
        java.lang.String str12 = token2.toString();
        java.lang.Object obj13 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37 + "'", int9 == 37);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str11, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "hi!" + "'", obj13, "hi!");
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 37, "P0Y000DT00000.01010", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.01010" + "'", str3, "P0Y000DT00000.01010");
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        token2.increment();
        int int9 = token2.getCount();
        java.lang.String str10 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11, (int) (byte) -1);
        int int14 = token13.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37 + "'", int9 == 37);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        int int9 = token2.getCount();
        java.lang.Object obj10 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 100);
        int int13 = token2.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (byte) 0, 102);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
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
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean26 = token24.equals((java.lang.Object) (short) 100);
        token24.increment();
        java.lang.Object obj28 = token24.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj28, (int) '#');
        token30.increment();
        int int32 = token30.getCount();
        token30.increment();
        boolean boolean34 = token2.equals((java.lang.Object) token30);
        java.lang.Object obj35 = token30.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token36 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token30);
        org.apache.commons.lang.time.DurationFormatUtils.Token token38 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token36, 1);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "hi!" + "'", obj28, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 36 + "'", int32 == 36);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + "hi!" + "'", obj35, "hi!");
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        boolean boolean4 = token1.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj5 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.String str7 = token1.toString();
        java.lang.Object obj8 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Class<?> wildcardClass10 = token1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str7, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj8, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration(0L, "P0Y000DT00000.48-25");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.48-25" + "'", str2, "P0Y000DT00000.48-25");
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        token8.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token8);
        java.lang.Object obj11 = token8.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj11, 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) (byte) 100, (long) 38, "P0Y000DT00000.8254", true, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.8254" + "'", str5, "P0Y000DT00000.8254");
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj8 = token7.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token7);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token10, 53);
        java.lang.Object obj13 = token10.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) '#', (long) 0, "P0Y000DT00000.982");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.982" + "'", str3, "P0Y000DT00000.982");
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((-1L), 100L, "P0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065SP0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101" + "'", str3, "P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101P0Y000DT00000.065101");
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod(100L, (long) 102, "P0Y0M0DT0H0M0.97S", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.972" + "'", str5, "P0Y000DT00000.972");
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
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
        java.lang.Object obj29 = token23.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token30 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token23);
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
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "m" + "'", obj29, "m");
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "mm");
        java.lang.Object obj2 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.10100");
        java.lang.Object obj5 = token4.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj5, (int) (byte) 10);
        boolean boolean8 = token1.equals(obj5);
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "mm" + "'", obj2, "mm");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "P0Y000DT00000.10100" + "'", obj5, "P0Y000DT00000.10100");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 10, (int) '#');
        java.lang.Object obj3 = token2.getValue();
        java.lang.Object obj4 = token2.getValue();
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + (short) 10 + "'", obj3, (short) 10);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (short) 10 + "'", obj4, (short) 10);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37, (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37, (int) (short) 10);
        int int5 = token4.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) int5, 3);
        token7.increment();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        java.lang.Object obj5 = token2.getValue();
        java.lang.String str6 = token2.toString();
        java.lang.Object obj7 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, 53);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "hi!" + "'", obj5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 10, "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        java.util.TimeZone timeZone4 = null;
        java.lang.String str5 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 36, (long) (-1), "P0Y000DT00000.00896", false, timeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y000DT00000.00896" + "'", str5, "P0Y000DT00000.00896");
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriodISO((long) 101, (long) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y0M0DT0H0M0.99S" + "'", str2, "P0Y0M0DT0H0M0.99S");
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        java.lang.Object obj4 = token1.getValue();
        java.lang.String str5 = token1.toString();
        token1.increment();
        java.lang.Object obj7 = token1.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj7);
        int int9 = token8.getCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj4, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj7, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Object obj8 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str12 = token11.toString();
        boolean boolean14 = token11.equals((java.lang.Object) 100L);
        token11.increment();
        token11.increment();
        token11.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int20 = token19.getCount();
        boolean boolean22 = token19.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj23 = token19.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token24 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token19);
        int int25 = token24.getCount();
        int int26 = token24.getCount();
        java.lang.Object obj27 = token24.getValue();
        boolean boolean28 = token11.equals((java.lang.Object) token24);
        org.apache.commons.lang.time.DurationFormatUtils.Token token29 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token31 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (-1.0d));
        token31.increment();
        token31.increment();
        boolean boolean34 = token11.equals((java.lang.Object) token31);
        boolean boolean35 = token2.equals((java.lang.Object) token11);
        org.apache.commons.lang.time.DurationFormatUtils.Token token38 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str39 = token38.toString();
        boolean boolean41 = token38.equals((java.lang.Object) 100L);
        token38.increment();
        boolean boolean44 = token38.equals((java.lang.Object) "M");
        java.lang.String str45 = token38.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token47 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token38, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token48 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token47);
        org.apache.commons.lang.time.DurationFormatUtils.Token token49 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token47);
        org.apache.commons.lang.time.DurationFormatUtils.Token token52 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean54 = token52.equals((java.lang.Object) (short) 100);
        token52.increment();
        java.lang.Object obj56 = token52.getValue();
        token52.increment();
        boolean boolean58 = token49.equals((java.lang.Object) token52);
        boolean boolean59 = token11.equals((java.lang.Object) token49);
        org.apache.commons.lang.time.DurationFormatUtils.Token token62 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0 0a00", (int) (short) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token64 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token66 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int67 = token66.getCount();
        boolean boolean68 = token64.equals((java.lang.Object) token66);
        token66.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token71 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token66, 10);
        token71.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token73 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token71);
        int int74 = token73.getCount();
        boolean boolean75 = token62.equals((java.lang.Object) int74);
        boolean boolean76 = token49.equals((java.lang.Object) token62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "hi!" + "'", obj8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj23, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertEquals(obj27.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj27), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj27), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str39, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str45, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + obj56 + "' != '" + "hi!" + "'", obj56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.0970");
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        token2.increment();
        boolean boolean9 = token2.equals((java.lang.Object) "");
        java.lang.Object obj10 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.Class<?> wildcardClass13 = token12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "hi!" + "'", obj10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
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
        java.lang.Object obj17 = token16.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (short) -1 + "'", obj17, (short) -1);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        int int6 = token2.getCount();
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        boolean boolean8 = token2.equals((java.lang.Object) "M");
        java.lang.String str9 = token2.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (byte) 100);
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11);
        java.lang.Object obj13 = token12.getValue();
        java.lang.Class<?> wildcardClass14 = obj13.getClass();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj13);
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean20 = token18.equals((java.lang.Object) (short) 100);
        java.lang.Object obj21 = token18.getValue();
        java.lang.String str22 = token18.toString();
        token18.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token25 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.002S");
        int int26 = token25.getCount();
        boolean boolean27 = token18.equals((java.lang.Object) token25);
        org.apache.commons.lang.time.DurationFormatUtils.Token token28 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) boolean27);
        boolean boolean29 = token15.equals((java.lang.Object) token28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "hi!" + "'", obj21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int2 = token1.getCount();
        int int3 = token1.getCount();
        java.lang.Object obj4 = token1.getValue();
        java.lang.String str5 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str10 = token9.toString();
        boolean boolean12 = token9.equals((java.lang.Object) 100L);
        token9.increment();
        boolean boolean15 = token9.equals((java.lang.Object) "M");
        java.lang.String str16 = token9.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token18 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, (int) (byte) 100);
        token9.increment();
        boolean boolean20 = token1.equals((java.lang.Object) token9);
        boolean boolean22 = token1.equals((java.lang.Object) "P0Y000DT00000.891");
        java.lang.Object obj23 = token1.getValue();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj4, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", str5, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str16, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj23, "P0Y0M0DT0H0M0.065S");
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) 1, "P0Y000DT00000.02-42", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.02-42" + "'", str3, "P0Y000DT00000.02-42");
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        java.lang.Object obj7 = token2.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj7, (int) '#');
        java.lang.String str10 = token9.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) str10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token13 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token11, 2);
        java.lang.Object obj14 = token13.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token15 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "hi!" + "'", obj7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str10, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
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
        java.lang.String str24 = token23.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "hi!" + "'", obj20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "false" + "'", str24, "false");
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "m");
        org.apache.commons.lang.time.DurationFormatUtils.Token token3 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int4 = token3.getCount();
        boolean boolean5 = token1.equals((java.lang.Object) token3);
        token3.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3, 10);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token3);
        token9.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token12 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, 37);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        boolean boolean4 = token2.equals((java.lang.Object) (short) 100);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token6 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        java.lang.String str7 = token2.toString();
        int int8 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token11 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9, 52);
        java.lang.Object obj12 = token11.getValue();
        boolean boolean14 = token11.equals((java.lang.Object) "P0Y0M0DT0H0M0.82S");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str7, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 36 + "'", int8 == 36);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y000DT00000.00310");
        org.apache.commons.lang.time.DurationFormatUtils.Token token4 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "S", (int) 'a');
        boolean boolean6 = token4.equals((java.lang.Object) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (byte) 1, (int) (byte) 0);
        boolean boolean9 = token1.equals((java.lang.Object) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token10 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token1);
        java.lang.Class<?> wildcardClass11 = token1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "0:00:00.039");
        token1.increment();
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, 0, 102);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        java.util.Calendar calendar0 = null;
        java.util.Calendar calendar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = org.apache.commons.lang.time.DurationFormatUtils.reduceAndCorrect(calendar0, calendar1, (int) (short) 0, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 2, (long) 53, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        org.apache.commons.lang.time.DurationFormatUtils.Token token1 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 100.0d);
        int int2 = token1.getCount();
        java.lang.String str3 = token1.toString();
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) 37);
        org.apache.commons.lang.time.DurationFormatUtils.Token token8 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str9 = token8.toString();
        boolean boolean11 = token8.equals((java.lang.Object) 100L);
        int int12 = token8.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int15 = token14.getCount();
        boolean boolean17 = token14.equals((java.lang.Object) "0:00:00.99");
        boolean boolean18 = token8.equals((java.lang.Object) "0:00:00.99");
        int int19 = token8.getCount();
        token8.increment();
        boolean boolean21 = token5.equals((java.lang.Object) token8);
        boolean boolean22 = token1.equals((java.lang.Object) token8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100.0" + "'", str3, "100.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        java.lang.String str3 = org.apache.commons.lang.time.DurationFormatUtils.formatPeriod((long) 0, (long) 10, "P0Y0M0DT0H0M0.82S");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "P0Y000DT00000.8210" + "'", str3, "P0Y000DT00000.8210");
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, (int) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token5 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, (int) (byte) 1);
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, (int) '#');
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) (short) 1, 101);
        boolean boolean10 = token2.equals((java.lang.Object) (short) 1);
        token2.increment();
        int int12 = token2.getCount();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        token2.increment();
        org.apache.commons.lang.time.DurationFormatUtils.Token token7 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2);
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token2, (int) (short) 0);
        int int10 = token2.getCount();
        java.lang.Object obj11 = token2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "hi!" + "'", obj11, "hi!");
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        org.apache.commons.lang.time.DurationFormatUtils.Token token2 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "hi!", (int) '#');
        java.lang.String str3 = token2.toString();
        boolean boolean5 = token2.equals((java.lang.Object) 100L);
        java.lang.String str6 = token2.toString();
        int int7 = token2.getCount();
        org.apache.commons.lang.time.DurationFormatUtils.Token token9 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) "P0Y0M0DT0H0M0.065S");
        int int10 = token9.getCount();
        boolean boolean12 = token9.equals((java.lang.Object) "0:00:00.99");
        java.lang.Object obj13 = token9.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token14 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token9);
        org.apache.commons.lang.time.DurationFormatUtils.Token token16 = new org.apache.commons.lang.time.DurationFormatUtils.Token((java.lang.Object) token14, 0);
        java.lang.Object obj17 = token16.getValue();
        org.apache.commons.lang.time.DurationFormatUtils.Token token19 = new org.apache.commons.lang.time.DurationFormatUtils.Token(obj17, (int) (short) -1);
        token19.increment();
        boolean boolean21 = token2.equals((java.lang.Object) token19);
        int int22 = token2.getCount();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "P0Y0M0DT0H0M0.065S" + "'", obj13, "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "P0Y0M0DT0H0M0.065S");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        java.lang.String str2 = org.apache.commons.lang.time.DurationFormatUtils.formatDuration((long) (short) 0, "P0Y000DT00000.09052");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "P0Y000DT00000.09052" + "'", str2, "P0Y000DT00000.09052");
    }
}

