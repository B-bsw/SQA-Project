package org.apache.commons.math3.util;

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
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.61512051684126d + "'", double1 == 4.61512051684126d);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.00000000000001d + "'", double1 == 100.00000000000001d);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) (-1.0f), (double) (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 1, (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-1), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        double double1 = org.apache.commons.math3.util.FastMath.signum(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        double double1 = org.apache.commons.math3.util.FastMath.tan((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.5574077246549023d) + "'", double1 == (-1.5574077246549023d));
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        long long2 = org.apache.commons.math3.util.FastMath.min(0L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 10L, (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (short) 10, 4.61512051684126d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999999f + "'", float2 == 9.999999f);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 0, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.017453292519943295d) + "'", double1 == (-0.017453292519943295d));
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        double double0 = org.apache.commons.math3.util.FastMath.PI;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 3.141592653589793d + "'", double0 == 3.141592653589793d);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        double double0 = org.apache.commons.math3.util.FastMath.E;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 2.718281828459045d + "'", double0 == 2.718281828459045d);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        int int0 = org.apache.commons.math3.util.FastMath.EXP_INT_TABLE_MAX_INDEX;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 750 + "'", int0 == 750);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter(9.999999f, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.999998f + "'", float2 == 9.999998f);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.584967478670572d + "'", double1 == 4.584967478670572d);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 97.00000000000001d + "'", double1 == 97.00000000000001d);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int1 = org.apache.commons.math3.util.FastMath.round(1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5604874136486533d + "'", double1 == 1.5604874136486533d);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8414709848078965d + "'", double1 == 0.8414709848078965d);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        int int2 = org.apache.commons.math3.util.FastMath.max(100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716577E22d + "'", double1 == 3.831008000716577E22d);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        double double0 = org.apache.commons.math3.util.FastMath.random();
// flaky "1) test00035(org.apache.commons.math3.util.RegressionTest0)":         org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0771875889955993d + "'", double0 == 0.0771875889955993d);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(9.999999f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        double double1 = org.apache.commons.math3.util.FastMath.floor(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 100, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        int int0 = org.apache.commons.math3.util.FastMath.EXP_INT_TABLE_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1500 + "'", int0 == 1500);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (byte) 100, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703393d + "'", double1 == 11013.232874703393d);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7031839360032603E-108d + "'", double1 == 1.7031839360032603E-108d);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        double double1 = org.apache.commons.math3.util.FastMath.floor(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32L + "'", long1 == 32L);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 1L, (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) ' ');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8342233605065102d + "'", double1 == 0.8342233605065102d);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        int int1 = org.apache.commons.math3.util.FastMath.abs(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(1.0d, 0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.1585290151921035d + "'", double2 == 0.1585290151921035d);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        int int1 = org.apache.commons.math3.util.FastMath.abs(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1.5604874136486533d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.000897785780501d + "'", double1 == 1.000897785780501d);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6952633082705699d + "'", double1 == 0.6952633082705699d);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 0L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.5779513082325d + "'", double1 == 5729.5779513082325d);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248699261236361d + "'", double1 == 4.248699261236361d);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.5574077246549023d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) ' ', (double) 750);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.00000000000001d + "'", double2 == 32.00000000000001d);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 100, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 400.0d + "'", double2 == 400.0d);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        double double2 = org.apache.commons.math3.util.FastMath.max(97.00000000000001d, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(5729.5779513082325d, 4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5729.579526593802d + "'", double2 == 5729.579526593802d);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        int int2 = org.apache.commons.math3.util.FastMath.min(97, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) (-1), (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.014282800023196d + "'", double2 == 35.014282800023196d);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22026.465794806718d + "'", double1 == 22026.465794806718d);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) 750);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.6669829823489768d) + "'", double1 == (-0.6669829823489768d));
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        double double1 = org.apache.commons.math3.util.FastMath.asin(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(1.0d, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852868E29d + "'", double2 == 1.5845632502852868E29d);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(5729.579526593802d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 328280.7252583891d + "'", double1 == 328280.7252583891d);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (-1L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 1, (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 10L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) '#');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        double double1 = org.apache.commons.math3.util.FastMath.cosh((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        long long1 = org.apache.commons.math3.util.FastMath.round(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 97L + "'", long1 == 97L);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.017453292519943295d), 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017453292519943295d + "'", double2 == 0.017453292519943295d);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) ' ', (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        double double1 = org.apache.commons.math3.util.FastMath.tan(97.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.41032129904822556d) + "'", double1 == (-0.41032129904822556d));
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (byte) 10, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        double double1 = org.apache.commons.math3.util.FastMath.signum(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) '#', (double) 3.8146973E-6f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 114.59155902616465d + "'", double1 == 114.59155902616465d);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        long long1 = org.apache.commons.math3.util.FastMath.round(1.7031839360032603E-108d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, (double) 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        int int2 = org.apache.commons.math3.util.FastMath.max(1500, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 1500);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1500L + "'", long1 == 1500L);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3383347192042695E42d + "'", double1 == 1.3383347192042695E42d);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        double double1 = org.apache.commons.math3.util.FastMath.tan(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.5049299045672764d) + "'", double1 == (-2.5049299045672764d));
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 10, 1500L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1500L + "'", long2 == 1500L);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        double double1 = org.apache.commons.math3.util.FastMath.abs(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.5779513082325d + "'", double1 == 5729.5779513082325d);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 100L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 97L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 6.691673596021348E41d + "'", double1 == 6.691673596021348E41d);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.99189285848507d) + "'", double1 == (-0.99189285848507d));
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(1.3383347192042695E42d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5707963267948966d + "'", double2 == 1.5707963267948966d);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) ' ', 3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 15.00402842524522d + "'", double2 == 15.00402842524522d);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.7031839360032603E-108d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.737125245533627E25d + "'", double1 == 7.737125245533627E25d);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        double double1 = org.apache.commons.math3.util.FastMath.signum((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453292519943295d + "'", double1 == 0.17453292519943295d);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 'a');
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        double double2 = org.apache.commons.math3.util.FastMath.max((-0.41032129904822556d), 0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.17453292519943295d + "'", double2 == 0.17453292519943295d);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.2479614275509088d + "'", double1 == 1.2479614275509088d);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        double double1 = org.apache.commons.math3.util.FastMath.cos(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6717532003326169d + "'", double1 == 0.6717532003326169d);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((-1.5574077246549023d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.267909768656306d) + "'", double1 == (-2.267909768656306d));
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        double double1 = org.apache.commons.math3.util.FastMath.rint(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        double double1 = org.apache.commons.math3.util.FastMath.exp(328280.7252583891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        double double1 = org.apache.commons.math3.util.FastMath.signum((-2.267909768656306d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 2);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.99189285848507d), 5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.99189285848507d) + "'", double2 == (-0.99189285848507d));
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 2, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        int int0 = org.apache.commons.math3.util.FastMath.LN_MANT_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1024 + "'", int0 == 1024);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.027415567780803774d + "'", double1 == 0.027415567780803774d);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.5440211108893698d) + "'", double1 == (-0.5440211108893698d));
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        double double1 = org.apache.commons.math3.util.FastMath.log10(35.014282800023196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5442452350911982d + "'", double1 == 1.5442452350911982d);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        long long2 = org.apache.commons.math3.util.FastMath.max(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-149) + "'", int1 == (-149));
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5574077246549023d + "'", double1 == 1.5574077246549023d);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) (short) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        int int1 = org.apache.commons.math3.util.FastMath.abs(1500);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1500 + "'", int1 == 1500);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-57.29577951308232d) + "'", double1 == (-57.29577951308232d));
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 4.9E-324d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.5442452350911982d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 32L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(Double.NEGATIVE_INFINITY, (-0.5440211108893698d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5845632502852868E29d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.5442452350911982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026547972235304935d + "'", double1 == 0.026547972235304935d);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(100.0d, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        double double1 = org.apache.commons.math3.util.FastMath.atan(5.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.373400766945016d + "'", double1 == 1.373400766945016d);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.026547972235304935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003524181127126d + "'", double1 == 1.0003524181127126d);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        float float2 = org.apache.commons.math3.util.FastMath.max(3.8146973E-6f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.9E-324d, (-0.6669829823489768d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.3625831891367726E215d + "'", double2 == 4.3625831891367726E215d);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        int int1 = org.apache.commons.math3.util.FastMath.abs(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        double double1 = org.apache.commons.math3.util.FastMath.abs(400.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 400.0d + "'", double1 == 400.0d);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 100.0d + "'", double1 == 100.0d);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 10L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) 10, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        double double1 = org.apache.commons.math3.util.FastMath.log((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.5553480614894135d + "'", double1 == 3.5553480614894135d);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 3.8146973E-6f, (double) 1024);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1024.0d + "'", double2 == 1024.0d);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        double double1 = org.apache.commons.math3.util.FastMath.log(2.718281828459045d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(1.3383347192042695E42d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.668093098623077E43d + "'", double1 == 7.668093098623077E43d);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 328280.6350011744d + "'", double1 == 328280.6350011744d);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        double double1 = org.apache.commons.math3.util.FastMath.cos(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8623188722876839d + "'", double1 == 0.8623188722876839d);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 192.21717495245434d + "'", double1 == 192.21717495245434d);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8342233605065102d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.16323882911185375d + "'", double2 == 0.16323882911185375d);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        float float2 = org.apache.commons.math3.util.FastMath.max(0.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.1585290151921035d, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.447015485737373E9d + "'", double2 == 5.447015485737373E9d);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        double double1 = org.apache.commons.math3.util.FastMath.atan(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5706217938714693d + "'", double1 == 1.5706217938714693d);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        double double1 = org.apache.commons.math3.util.FastMath.exp(5.447015485737373E9d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5707963267948966d, 4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.811682183676626d + "'", double2 == 6.811682183676626d);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (short) 100, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        double double2 = org.apache.commons.math3.util.FastMath.pow(1.5707963267948966d, (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 91.45317136336229d + "'", double2 == 91.45317136336229d);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 1.0f, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(4.9E-324d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.9E-324d + "'", double1 == 4.9E-324d);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((double) (-0.99999994f), 0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.9999999403953551d) + "'", double2 == (-0.9999999403953551d));
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3754263876807227d + "'", double1 == 1.3754263876807227d);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        double double1 = org.apache.commons.math3.util.FastMath.tan(0.1585290151921035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15987052369731924d + "'", double1 == 0.15987052369731924d);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        double double1 = org.apache.commons.math3.util.FastMath.exp((double) 35.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5860134523134308E15d + "'", double1 == 1.5860134523134308E15d);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        double double1 = org.apache.commons.math3.util.FastMath.log(7.668093098623077E43d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.04822696504081d + "'", double1 == 101.04822696504081d);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 22025.465794806718d + "'", double1 == 22025.465794806718d);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(101.04822696504081d, (-0.9999999403953551d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-101.04822696504081d) + "'", double2 == (-101.04822696504081d));
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(91.45317136336229d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        int int2 = org.apache.commons.math3.util.FastMath.max((-149), 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        double double1 = org.apache.commons.math3.util.FastMath.cos(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9992790497916413d) + "'", double1 == (-0.9992790497916413d));
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.105427357601002E-15d + "'", double1 == 7.105427357601002E-15d);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        int int1 = org.apache.commons.math3.util.FastMath.round((float) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.5514266812416906d + "'", double1 == 0.5514266812416906d);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(0.0d, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.9E-324d + "'", double2 == 4.9E-324d);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        double double1 = org.apache.commons.math3.util.FastMath.sinh((double) 1500);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(4.248699261236361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.153330206915566d + "'", double1 == 2.153330206915566d);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 0, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.026547972235304935d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026541737035255974d + "'", double1 == 0.026541737035255974d);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.0d, 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        double double1 = org.apache.commons.math3.util.FastMath.asin(100.00000000000001d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        double double2 = org.apache.commons.math3.util.FastMath.pow(5729.5779513082325d, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (-149), 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-149.0f) + "'", float2 == (-149.0f));
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        double double1 = org.apache.commons.math3.util.FastMath.rint((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        int int2 = org.apache.commons.math3.util.FastMath.max((int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 10, (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        double double1 = org.apache.commons.math3.util.FastMath.log(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 100);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.6881171418161356E43d + "'", double1 == 2.6881171418161356E43d);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        double double1 = org.apache.commons.math3.util.FastMath.abs(328280.6350011744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 328280.6350011744d + "'", double1 == 328280.6350011744d);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        int int0 = org.apache.commons.math3.util.FastMath.EXP_FRAC_TABLE_LEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1025 + "'", int0 == 1025);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6483608274590866d + "'", double1 == 0.6483608274590866d);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) '4', (double) 32L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 97);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 32L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4965075614664802d + "'", double1 == 3.4965075614664802d);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(7.737125245533627E25d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(11013.232874703393d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232874703395d + "'", double1 == 11013.232874703395d);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        double double2 = org.apache.commons.math3.util.FastMath.pow(4.584967478670572d, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(0.5514266812416906d, 3.141592653589793d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.189620006501493d + "'", double2 == 3.189620006501493d);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(10.0d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.04987562112089d + "'", double2 == 10.04987562112089d);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 100L, 0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.00371790007361d + "'", double2 == 100.00371790007361d);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        double double1 = org.apache.commons.math3.util.FastMath.cos((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        double double1 = org.apache.commons.math3.util.FastMath.rint(35.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 35.0d + "'", double1 == 35.0d);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 1.0f, (-0.9999999403953551d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.5514266812416906d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.009624211171012755d + "'", double1 == 0.009624211171012755d);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        double double1 = org.apache.commons.math3.util.FastMath.sin((-0.99189285848507d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8370630725347682d) + "'", double1 == (-0.8370630725347682d));
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        double double1 = org.apache.commons.math3.util.FastMath.sin((double) 97.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.3796077390275217d + "'", double1 == 0.3796077390275217d);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) 32, (float) 1024);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        double double2 = org.apache.commons.math3.util.FastMath.pow(101.04822696504081d, 1.000897785780501d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 101.46782120377229d + "'", double2 == 101.46782120377229d);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        double double1 = org.apache.commons.math3.util.FastMath.sin(328280.7252583891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.215235055286076E-4d) + "'", double1 == (-9.215235055286076E-4d));
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9389941379013969d + "'", double1 == 0.9389941379013969d);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(0.9389941379013969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8375714918828912d + "'", double1 == 0.8375714918828912d);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (short) 100, 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 7.6293945E-6f + "'", float2 == 7.6293945E-6f);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((-0.017453292519943295d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        int int2 = org.apache.commons.math3.util.FastMath.max(1025, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1025 + "'", int2 == 1025);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5729.577951308233d + "'", double1 == 5729.577951308233d);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(10.04987562112089d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.177446878757825d + "'", double2 == 14.177446878757825d);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        long long2 = org.apache.commons.math3.util.FastMath.min(100L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians((-0.8370630725347682d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.014609506662591823d) + "'", double1 == (-0.014609506662591823d));
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(1.2479614275509088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.8851621707325812d + "'", double1 == 1.8851621707325812d);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(32.00000000000001d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 33.0d + "'", double1 == 33.0d);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        float float2 = org.apache.commons.math3.util.FastMath.max(9.999999f, (float) 1500L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1500.0f + "'", float2 == 1500.0f);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.000000000000002d + "'", double1 == 10.000000000000002d);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt((-9.215235055286076E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.09731253940776538d) + "'", double1 == (-0.09731253940776538d));
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 3.8146973E-6f, 4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.584967478670572d + "'", double2 == 4.584967478670572d);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(0.9389941379013969d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0831933869426666d + "'", double1 == 1.0831933869426666d);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((-0.9999999403953551d), (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.9999999403953551d + "'", double2 == 0.9999999403953551d);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        long long2 = org.apache.commons.math3.util.FastMath.max(1L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.8375714918828912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8375714918828912d + "'", double1 == 0.8375714918828912d);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        long long1 = org.apache.commons.math3.util.FastMath.round((double) (-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 35);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.248699261236361d + "'", double1 == 4.248699261236361d);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (short) -1, 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.09966865249116202d) + "'", double2 == (-0.09966865249116202d));
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.6483608274590866d, 1.5860134523134308E15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6483608274590866d + "'", double2 == 0.6483608274590866d);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((double) (-1L), Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-0.9999999403953551d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 32);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3.8146973E-6f + "'", float1 == 3.8146973E-6f);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        double double1 = org.apache.commons.math3.util.FastMath.log((-0.9992790497916413d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        float float1 = org.apache.commons.math3.util.FastMath.signum(7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        long long1 = org.apache.commons.math3.util.FastMath.round((-0.99189285848507d));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(101.46782120377229d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-149));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) (byte) 10, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5845632502852868E30d + "'", double2 == 1.5845632502852868E30d);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(4.248699261236361d, 5729.5779513082325d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.248699261236361d + "'", double2 == 4.248699261236361d);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.NEGATIVE_INFINITY + "'", double1 == Double.NEGATIVE_INFINITY);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        double double1 = org.apache.commons.math3.util.FastMath.cosh(14.177446878757825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 718053.7444319915d + "'", double1 == 718053.7444319915d);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) ' ', 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.8375714918828912d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 97, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        double double1 = org.apache.commons.math3.util.FastMath.abs((double) 1500L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1500.0d + "'", double1 == 1500.0d);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        double double1 = org.apache.commons.math3.util.FastMath.tan((double) 2);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.185039863261519d) + "'", double1 == (-2.185039863261519d));
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.5706217938714693d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0230833853373482d + "'", double1 == 1.0230833853373482d);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder(5.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 32L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-149), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-149L) + "'", long2 == (-149L));
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        int int1 = org.apache.commons.math3.util.FastMath.abs(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) ' ', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        int int1 = org.apache.commons.math3.util.FastMath.abs(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        double double1 = org.apache.commons.math3.util.FastMath.log1p(1.000897785780501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.6935959727279236d + "'", double1 == 0.6935959727279236d);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        double double1 = org.apache.commons.math3.util.FastMath.log10((double) 100L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.0d + "'", double1 == 2.0d);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(1.5845632502852868E29d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        double double1 = org.apache.commons.math3.util.FastMath.tan(22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9498815455645588d + "'", double1 == 0.9498815455645588d);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.831008000716578E22d + "'", double1 == 3.831008000716578E22d);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        double double2 = org.apache.commons.math3.util.FastMath.min(7.668093098623077E43d, 0.026547972235304935d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.026547972235304935d + "'", double2 == 0.026547972235304935d);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 97L, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8813735870195429d) + "'", double1 == (-0.8813735870195429d));
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(Double.NEGATIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(3.831008000716578E22d, 1.0003524181127126d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.831008000716578E22d + "'", double2 == 3.831008000716578E22d);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-0.9992790497916413d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.8808637063441951d) + "'", double1 == (-0.8808637063441951d));
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp(9.999998f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9.999999f + "'", float1 == 9.999999f);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        double double1 = org.apache.commons.math3.util.FastMath.log1p((double) 32);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.4965075614664802d + "'", double1 == 3.4965075614664802d);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(10.04987562112089d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11.0d + "'", double1 == 11.0d);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        int int1 = org.apache.commons.math3.util.FastMath.round(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(35.0f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.298292365610485d + "'", double1 == 5.298292365610485d);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-1.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-0.99999994f) + "'", float1 == (-0.99999994f));
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 138 + "'", int1 == 138);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 10L, 10.000000000000002d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.000000000000004E10d + "'", double2 == 1.000000000000004E10d);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-127) + "'", int1 == (-127));
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) 35, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        double double2 = org.apache.commons.math3.util.FastMath.log(328280.6350011744d, (double) (byte) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        double double2 = org.apache.commons.math3.util.FastMath.copySign((double) 750, 1.7763568394002505E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 750.0d + "'", double2 == 750.0d);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((-149.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.5258789E-5f + "'", float1 == 1.5258789E-5f);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 1024);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 10L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222846126381d + "'", double1 == 2.993222846126381d);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.16323882911185375d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.16181164155481406d + "'", double1 == 0.16181164155481406d);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(52.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 52.0d + "'", double1 == 52.0d);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        double double1 = org.apache.commons.math3.util.FastMath.tan(4.3625831891367726E215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.949823557438858d) + "'", double1 == (-1.949823557438858d));
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        double double1 = org.apache.commons.math3.util.FastMath.sin(1.2479614275509088d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9483398404364088d + "'", double1 == 0.9483398404364088d);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        float float2 = org.apache.commons.math3.util.FastMath.scalb(1.0f, 1500);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.17453292519943295d + "'", double1 == 0.17453292519943295d);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) (byte) 1, (double) 1500L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.666665679012609E-4d + "'", double2 == 6.666665679012609E-4d);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        long long1 = org.apache.commons.math3.util.FastMath.round(6.691673596021348E41d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9223372036854775807L + "'", long1 == 9223372036854775807L);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.0d, 6.666665679012609E-4d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (byte) -1, (long) 138);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 138L + "'", long2 == 138L);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        double double1 = org.apache.commons.math3.util.FastMath.log10((-0.8813735870195429d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) (byte) 10, 0.8414709848078965d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707963267948966d + "'", double1 == 1.5707963267948966d);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        double double2 = org.apache.commons.math3.util.FastMath.min(1.7763568394002505E-15d, 2.993222846126381d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.7763568394002505E-15d + "'", double2 == 1.7763568394002505E-15d);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        double double2 = org.apache.commons.math3.util.FastMath.min((double) 97.0f, (double) 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(1.5707963267948966d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1624473515096265d + "'", double1 == 1.1624473515096265d);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        double double2 = org.apache.commons.math3.util.FastMath.min(Double.POSITIVE_INFINITY, 101.04822696504081d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 101.04822696504081d + "'", double2 == 101.04822696504081d);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(14.177446878757825d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 97L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.1920929E-7f + "'", float1 == 1.1920929E-7f);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 1500.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.006367456539117d + "'", double1 == 8.006367456539117d);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        int int2 = org.apache.commons.math3.util.FastMath.max(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 1500, 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.3768449E32f + "'", float2 == 2.3768449E32f);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(22025.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1261966.2318521822d + "'", double1 == 1261966.2318521822d);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        double double1 = org.apache.commons.math3.util.FastMath.ceil((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) 138L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 8.56324762248225E59d + "'", double1 == 8.56324762248225E59d);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        int int2 = org.apache.commons.math3.util.FastMath.min(100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(718053.7444319915d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 89.54726317526658d + "'", double1 == 89.54726317526658d);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter(1.373400766945016d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3734007669450161d + "'", double2 == 1.3734007669450161d);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        int int2 = org.apache.commons.math3.util.FastMath.max((-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 97L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) 97, 138L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(14.177446878757825d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7763568394002505E-15d + "'", double1 == 1.7763568394002505E-15d);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 138L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (byte) 10, 1.0230833853373482d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.545893600459793d + "'", double2 == 10.545893600459793d);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        double double1 = org.apache.commons.math3.util.FastMath.log(1.1624473515096265d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15052756842981832d + "'", double1 == 0.15052756842981832d);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53248.0f + "'", float2 == 53248.0f);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        double double1 = org.apache.commons.math3.util.FastMath.abs(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((float) 32L, 1025);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        double double1 = org.apache.commons.math3.util.FastMath.sin(0.1585290151921035d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.15786583843612662d + "'", double1 == 0.15786583843612662d);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) 1500L, (-149.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-149.0f) + "'", float2 == (-149.0f));
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (byte) 0, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((float) (short) 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        double double1 = org.apache.commons.math3.util.FastMath.asin(5729.577951308233d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        double double2 = org.apache.commons.math3.util.FastMath.min(14.177446878757825d, (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.177446878757825d + "'", double2 == 14.177446878757825d);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 97);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.848857801796104d + "'", double1 == 9.848857801796104d);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.6935959727279236d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6935959727279236d + "'", double2 == 0.6935959727279236d);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) 750);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(35.014282800023196d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.27151120192428d + "'", double1 == 3.27151120192428d);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(192.21717495245434d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.95177979919759d + "'", double1 == 5.95177979919759d);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        double double2 = org.apache.commons.math3.util.FastMath.atan2((double) 35.0f, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.33667481938672716d + "'", double2 == 0.33667481938672716d);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        double double2 = org.apache.commons.math3.util.FastMath.pow((double) (short) 1, (-57.29577951308232d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.15052756842981832d, 1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15052756842981832d + "'", double2 == 0.15052756842981832d);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        float float2 = org.apache.commons.math3.util.FastMath.scalb((-0.99999994f), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.2676505E30f) + "'", float2 == (-1.2676505E30f));
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        double double2 = org.apache.commons.math3.util.FastMath.min(2.6881171418161356E43d, 89.54726317526658d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 89.54726317526658d + "'", double2 == 89.54726317526658d);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(100.00371790007361d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.0d + "'", double1 == 101.0d);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        double double1 = org.apache.commons.math3.util.FastMath.signum(101.46782120377229d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        double double1 = org.apache.commons.math3.util.FastMath.log(0.17453292519943295d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.7456418720467646d) + "'", double1 == (-1.7456418720467646d));
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1.000897785780501d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.560487413648653d + "'", double1 == 1.560487413648653d);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(1.0003524181127126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001761935342754d + "'", double1 == 1.0001761935342754d);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        long long1 = org.apache.commons.math3.util.FastMath.round(5.447015485737373E9d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 5447015486L + "'", long1 == 5447015486L);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.7456418720467646d), 35.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.9405615342893493E8d) + "'", double2 == (-2.9405615342893493E8d));
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.831008000716578E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        double double1 = org.apache.commons.math3.util.FastMath.atan((double) (-149L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.564085018163574d) + "'", double1 == (-1.564085018163574d));
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        long long1 = org.apache.commons.math3.util.FastMath.abs((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        double double2 = org.apache.commons.math3.util.FastMath.pow(52.0d, 22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        double double1 = org.apache.commons.math3.util.FastMath.toRadians(Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        double double1 = org.apache.commons.math3.util.FastMath.nextUp(1.000000000000004E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0000000000000042E10d + "'", double1 == 1.0000000000000042E10d);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        int int2 = org.apache.commons.math3.util.FastMath.max((-149), 750);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 750 + "'", int2 == 750);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        long long1 = org.apache.commons.math3.util.FastMath.round(15.00402842524522d);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 15L + "'", long1 == 15L);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        double double1 = org.apache.commons.math3.util.FastMath.log(100.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.605170185988092d + "'", double1 == 4.605170185988092d);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        long long2 = org.apache.commons.math3.util.FastMath.max(9223372036854775807L, (-149L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        double double1 = org.apache.commons.math3.util.FastMath.cos(1.0000000000000042E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.8731400784750731d + "'", double1 == 0.8731400784750731d);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        int int2 = org.apache.commons.math3.util.FastMath.max((-1), 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        float float2 = org.apache.commons.math3.util.FastMath.copySign((float) (short) 1, (float) 138L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        double double1 = org.apache.commons.math3.util.FastMath.atanh(0.8342233605065102d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.201867548519866d + "'", double1 == 1.201867548519866d);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(35.014282800023196d, 1.5604874136486533d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.5262586308923471d + "'", double2 == 1.5262586308923471d);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        double double1 = org.apache.commons.math3.util.FastMath.acos(3.189620006501493d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        float float1 = org.apache.commons.math3.util.FastMath.signum((-149.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((-9.215235055286076E-4d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-9.215233751015083E-4d) + "'", double1 == (-9.215233751015083E-4d));
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(4.3625831891367726E215d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 7.584283767291423E71d + "'", double1 == 7.584283767291423E71d);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        double double1 = org.apache.commons.math3.util.FastMath.atan(4.584967478670572d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3560551570236352d + "'", double1 == 1.3560551570236352d);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        double double2 = org.apache.commons.math3.util.FastMath.scalb(0.026541737035255974d, 1024);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.7713898455600543E306d + "'", double2 == 4.7713898455600543E306d);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        double double1 = org.apache.commons.math3.util.FastMath.abs((-101.04822696504081d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.04822696504081d + "'", double1 == 101.04822696504081d);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) 32, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        double double2 = org.apache.commons.math3.util.FastMath.min(0.017453292519943295d, (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.017453292519943295d + "'", double2 == 0.017453292519943295d);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        double double2 = org.apache.commons.math3.util.FastMath.min(100.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        long long2 = org.apache.commons.math3.util.FastMath.max(10L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        double double2 = org.apache.commons.math3.util.FastMath.nextAfter((-1.5574077246549023d), (-0.09966865249116202d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.557407724654902d) + "'", double2 == (-1.557407724654902d));
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        double double1 = org.apache.commons.math3.util.FastMath.floor(5.298292365610485d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        int int2 = org.apache.commons.math3.util.FastMath.min((int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        double double1 = org.apache.commons.math3.util.FastMath.asinh((double) 1.4E-45f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.401298464324817E-45d + "'", double1 == 1.401298464324817E-45d);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        double double1 = org.apache.commons.math3.util.FastMath.atan((-1.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7853981633974483d) + "'", double1 == (-0.7853981633974483d));
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (short) 10, (float) 1025);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 5447015486L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 5.4470154E9f + "'", float1 == 5.4470154E9f);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        double double1 = org.apache.commons.math3.util.FastMath.acosh(1.0003524181127126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.026547972235306663d + "'", double1 == 0.026547972235306663d);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees(3.27151120192428d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 187.44378450003248d + "'", double1 == 187.44378450003248d);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        double double1 = org.apache.commons.math3.util.FastMath.tan(328280.6350011744d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.08957411090233484d) + "'", double1 == (-0.08957411090233484d));
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.9999999403953551d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.1102230246251565E-16d + "'", double1 == 1.1102230246251565E-16d);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) 138);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 138.0f + "'", float1 == 138.0f);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent(0.027415567780803774d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-6) + "'", int1 == (-6));
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        int int1 = org.apache.commons.math3.util.FastMath.abs((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        float float2 = org.apache.commons.math3.util.FastMath.min((float) (byte) 100, (float) 1500);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 32L, (double) 5.4470154E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.000004f + "'", float2 == 32.000004f);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        double double1 = org.apache.commons.math3.util.FastMath.asinh(22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.693147181075235d + "'", double1 == 10.693147181075235d);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        double double2 = org.apache.commons.math3.util.FastMath.copySign(0.0d, 718053.7444319915d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        double double2 = org.apache.commons.math3.util.FastMath.min(97.00000000000001d, 0.6483608274590866d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.6483608274590866d + "'", double2 == 0.6483608274590866d);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        double double1 = org.apache.commons.math3.util.FastMath.tanh((-2.5049299045672764d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.9867447596805989d) + "'", double1 == (-0.9867447596805989d));
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        double double1 = org.apache.commons.math3.util.FastMath.exp(4.61512051684126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 101.00000000000003d + "'", double1 == 101.00000000000003d);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(91.45317136336229d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.505395525898652d + "'", double1 == 4.505395525898652d);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.4E-45f + "'", float1 == 1.4E-45f);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        float float2 = org.apache.commons.math3.util.FastMath.min((-1.0f), (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        double double2 = org.apache.commons.math3.util.FastMath.hypot(5729.577951308233d, (-2.267909768656306d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5729.578400155824d + "'", double2 == 5729.578400155824d);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        long long1 = org.apache.commons.math3.util.FastMath.abs(100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        double double1 = org.apache.commons.math3.util.FastMath.expm1((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.7182818284590453d + "'", double1 == 1.7182818284590453d);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        double double2 = org.apache.commons.math3.util.FastMath.log((double) 1500, (-2.267909768656306d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(2.3768449E32f, (float) (-127));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-2.3768449E32f) + "'", float2 == (-2.3768449E32f));
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 100L, 0.8375714918828912d);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 99.99999f + "'", float2 == 99.99999f);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        int int1 = org.apache.commons.math3.util.FastMath.abs(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        double double1 = org.apache.commons.math3.util.FastMath.sin(4.7713898455600543E306d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-0.7966228647962957d) + "'", double1 == (-0.7966228647962957d));
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        double double2 = org.apache.commons.math3.util.FastMath.pow(91.45317136336229d, 138);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.420081748504424E270d + "'", double2 == 4.420081748504424E270d);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        double double1 = org.apache.commons.math3.util.FastMath.tan(1261966.2318521822d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.662514762151963d + "'", double1 == 1.662514762151963d);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt(101.04822696504081d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.052274715955628d + "'", double1 == 10.052274715955628d);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        double double1 = org.apache.commons.math3.util.FastMath.exp(3.831008000716578E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        int int2 = org.apache.commons.math3.util.FastMath.max((-127), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) (byte) 0, 1.1920929E-7f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.1920929E-7f + "'", float2 == 1.1920929E-7f);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 5, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(1.5845632502852868E30d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5845632502852868E30d + "'", double1 == 1.5845632502852868E30d);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        int int1 = org.apache.commons.math3.util.FastMath.abs(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        double double1 = org.apache.commons.math3.util.FastMath.tanh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        double double1 = org.apache.commons.math3.util.FastMath.abs(1.0003524181127126d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0003524181127126d + "'", double1 == 1.0003524181127126d);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        double double1 = org.apache.commons.math3.util.FastMath.toDegrees((double) '4');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2979.3805346802806d + "'", double1 == 2979.3805346802806d);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        double double1 = org.apache.commons.math3.util.FastMath.asin((double) 32L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        float float1 = org.apache.commons.math3.util.FastMath.abs((float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(0.8375714918828912d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.9426286359925615d + "'", double1 == 0.9426286359925615d);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        double double2 = org.apache.commons.math3.util.FastMath.pow(0.8414709848078965d, 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.3554640413010734E-8d + "'", double2 == 5.3554640413010734E-8d);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        long long2 = org.apache.commons.math3.util.FastMath.max(9223372036854775807L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 9223372036854775807L + "'", long2 == 9223372036854775807L);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        double double2 = org.apache.commons.math3.util.FastMath.max((double) 32.000004f, (double) 1025);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1025.0d + "'", double2 == 1025.0d);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        double double1 = org.apache.commons.math3.util.FastMath.sinh(1.0000000000000042E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 15L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        double double1 = org.apache.commons.math3.util.FastMath.ceil(0.6935959727279236d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        double double1 = org.apache.commons.math3.util.FastMath.acos((double) (-2.3768449E32f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        float float1 = org.apache.commons.math3.util.FastMath.ulp(100.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        long long2 = org.apache.commons.math3.util.FastMath.max((long) (-149), 5447015486L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5447015486L + "'", long2 == 5447015486L);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(0.3796077390275217d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.551115123125783E-17d + "'", double1 == 5.551115123125783E-17d);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        double double1 = org.apache.commons.math3.util.FastMath.acos(14.177446878757825d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        int int1 = org.apache.commons.math3.util.FastMath.getExponent((float) 138L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-1.557407724654902d), (double) 52L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0113951599323715E10d + "'", double2 == 1.0113951599323715E10d);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        int int2 = org.apache.commons.math3.util.FastMath.max(1500, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1500 + "'", int2 == 1500);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) (-149.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.8421709430404007E-14d + "'", double1 == 2.8421709430404007E-14d);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        double double1 = org.apache.commons.math3.util.FastMath.atan(328280.7252583891d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5707932806215363d + "'", double1 == 1.5707932806215363d);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        long long2 = org.apache.commons.math3.util.FastMath.min((long) (-1), (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        double double2 = org.apache.commons.math3.util.FastMath.atan2(22026.465794806718d, 22026.465794806718d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-0.09731253940776538d), (-2.267909768656306d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        double double2 = org.apache.commons.math3.util.FastMath.pow((-2.9405615342893493E8d), 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.9405615342893493E8d) + "'", double2 == (-2.9405615342893493E8d));
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        double double1 = org.apache.commons.math3.util.FastMath.cbrt(3.831008000716577E22d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.371095219025714E7d + "'", double1 == 3.371095219025714E7d);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        int int2 = org.apache.commons.math3.util.FastMath.max(32, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        float float1 = org.apache.commons.math3.util.FastMath.signum((float) (-6));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        double double1 = org.apache.commons.math3.util.FastMath.floor((-1.564085018163574d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-2.0d) + "'", double1 == (-2.0d));
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        double double1 = org.apache.commons.math3.util.FastMath.atanh((double) 10L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        double double1 = org.apache.commons.math3.util.FastMath.exp(1.5442452350911982d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.684434645507153d + "'", double1 == 4.684434645507153d);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        float float1 = org.apache.commons.math3.util.FastMath.ulp((float) 100L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 7.6293945E-6f + "'", float1 == 7.6293945E-6f);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        double double2 = org.apache.commons.math3.util.FastMath.max(10.693147181075235d, 0.9426286359925615d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.693147181075235d + "'", double2 == 10.693147181075235d);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((-101.04822696504081d), 0.027415567780803774d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 101.0482306841231d + "'", double2 == 101.0482306841231d);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        double double1 = org.apache.commons.math3.util.FastMath.atan(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) (-127), (double) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-126.99999f) + "'", float2 == (-126.99999f));
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        double double1 = org.apache.commons.math3.util.FastMath.ulp((double) 7.6293945E-6f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.6940658945086007E-21d + "'", double1 == 1.6940658945086007E-21d);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        double double1 = org.apache.commons.math3.util.FastMath.floor((double) 5.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.0d + "'", double1 == 5.0d);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        double double2 = org.apache.commons.math3.util.FastMath.log(91.45317136336229d, 2.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.15349285356613754d + "'", double2 == 0.15349285356613754d);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        float float2 = org.apache.commons.math3.util.FastMath.max((float) 0L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        double double2 = org.apache.commons.math3.util.FastMath.scalb((double) '4', 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 53248.0d + "'", double2 == 53248.0d);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        float float1 = org.apache.commons.math3.util.FastMath.nextUp((-149.0f));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-148.99998f) + "'", float1 == (-148.99998f));
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        double double1 = org.apache.commons.math3.util.FastMath.exp(0.8623188722876839d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.3686469200204923d + "'", double1 == 2.3686469200204923d);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        float float2 = org.apache.commons.math3.util.FastMath.min(0.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        double double1 = org.apache.commons.math3.util.FastMath.acosh((double) 9.999999f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.993222750278501d + "'", double1 == 2.993222750278501d);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        double double2 = org.apache.commons.math3.util.FastMath.IEEEremainder((-0.9999999403953551d), 1.5574077246549023d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.5574077842595472d + "'", double2 == 0.5574077842595472d);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        int int2 = org.apache.commons.math3.util.FastMath.max(1024, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1024 + "'", int2 == 1024);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        double double2 = org.apache.commons.math3.util.FastMath.hypot((double) 0L, 0.7853981633974483d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.7853981633974483d + "'", double2 == 0.7853981633974483d);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        float float2 = org.apache.commons.math3.util.FastMath.nextAfter((float) 1025, (-0.5440211108893698d));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1024.9999f + "'", float2 == 1024.9999f);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        double double1 = org.apache.commons.math3.util.FastMath.atan(1024.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.5698197646053373d + "'", double1 == 1.5698197646053373d);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        double double1 = org.apache.commons.math3.util.FastMath.asin(328280.7252583891d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        double double1 = org.apache.commons.math3.util.FastMath.sqrt((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 3.1622776601683795d + "'", double1 == 3.1622776601683795d);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        double double1 = org.apache.commons.math3.util.FastMath.ulp(1.5698197646053373d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.220446049250313E-16d + "'", double1 == 2.220446049250313E-16d);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        float float2 = org.apache.commons.math3.util.FastMath.copySign(5.0f, (float) 5);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 5.0f + "'", float2 == 5.0f);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        double double1 = org.apache.commons.math3.util.FastMath.expm1(Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        double double1 = org.apache.commons.math3.util.FastMath.log10(89.54726317526658d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9520523170857447d + "'", double1 == 1.9520523170857447d);
    }
}
