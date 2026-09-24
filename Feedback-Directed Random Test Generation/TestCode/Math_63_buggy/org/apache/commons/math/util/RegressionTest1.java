package org.apache.commons.math.util;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = new double[] { 100L };
        double double9 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray11);
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray16);
        double[] doubleArray20 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray16, (double) 10);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection24 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray22, orderDirection24, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray20, orderDirection24, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection24, true);
        double[] doubleArray32 = new double[] { 100L };
        double double33 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray32);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection34 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray32, orderDirection34, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection34, true);
        java.lang.Class<?> wildcardClass39 = orderDirection34.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1079574559 + "'", int18 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection24 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection24.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection34 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection34.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(146, 76);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5548 + "'", int2 == 5548);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (byte) 10, 1076101217L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10761012170L + "'", long2 == 10761012170L);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(97, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3104 + "'", int2 == 3104);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1100758016);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        double[] doubleArray5 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray7 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray5, (double) 1L);
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.6895986556913533d + "'", double8 == 0.6895986556913533d);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 1076101217L, 4, (int) ' ');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-1072693116), 1074790407);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) '#', 1078034432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1078034397) + "'", int2 == (-1078034397));
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (short) 10, (double) 1048576L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 10, (double) (byte) 0, 1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-1067909120), 9036866128227814273L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-34));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 3798431950569582479L, 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1078034432, (long) 1078034432);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        float float1 = org.apache.commons.math.util.MathUtils.sign(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo(2.1343363213777176E10d, (double) 2L, (double) 1072693248);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        int int1 = org.apache.commons.math.util.MathUtils.sign(146);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm((-1072693116), (-1611030093));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 0, (long) (-5));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5L) + "'", long2 == (-5L));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = new double[] { 100L };
        double double9 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray11);
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection18 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray16, orderDirection18, true);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        int int24 = org.apache.commons.math.util.MathUtils.hash(doubleArray22);
        double[] doubleArray26 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray22, (double) 10);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double double33 = org.apache.commons.math.util.MathUtils.distance1(doubleArray28, doubleArray31);
        double[] doubleArray35 = new double[] { 100L };
        double double36 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray35);
        double[] doubleArray38 = new double[] { 100L };
        double double39 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray38);
        double double40 = org.apache.commons.math.util.MathUtils.distance1(doubleArray35, doubleArray38);
        boolean boolean41 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray28, doubleArray38);
        double[] doubleArray43 = new double[] { 100L };
        double double44 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray43);
        int int45 = org.apache.commons.math.util.MathUtils.hash(doubleArray43);
        double[] doubleArray47 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray43, (double) 10);
        double[] doubleArray49 = new double[] { 100L };
        double double50 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray49);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection51 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray49, orderDirection51, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray47, orderDirection51, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray28, orderDirection51, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray22, orderDirection51, false);
        double double60 = org.apache.commons.math.util.MathUtils.distance1(doubleArray16, doubleArray22);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray22);
        boolean boolean62 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray22);
        double[] doubleArray64 = new double[] { 100L };
        double double65 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray64);
        double[] doubleArray67 = new double[] { 100L };
        double double68 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray67);
        double double69 = org.apache.commons.math.util.MathUtils.distance1(doubleArray64, doubleArray67);
        double[] doubleArray71 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray64, (double) (short) 100);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray71);
        double[] doubleArray74 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray71, (double) (-532995630));
        double double75 = org.apache.commons.math.util.MathUtils.distance1(doubleArray22, doubleArray71);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection18 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection18.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1079574559 + "'", int24 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1079574559 + "'", int45 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection51 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection51.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { (-5.3299563E8d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow((long) (-34), (-52L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (-5L), (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 33, (int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.133871366144E12d + "'", double2 == 1.133871366144E12d);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = new double[] { 100L };
        double double9 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray11);
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray16);
        double[] doubleArray20 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray16, (double) 10);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection24 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray22, orderDirection24, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray20, orderDirection24, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection24, true);
        double[] doubleArray32 = new double[] { 100L };
        double double33 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray32);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection34 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray32, orderDirection34, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection34, true);
        double[] doubleArray40 = new double[] { 100L };
        double double41 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray40);
        int int42 = org.apache.commons.math.util.MathUtils.hash(doubleArray40);
        double[] doubleArray44 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray40, (double) 10);
        double[] doubleArray46 = new double[] { 100L };
        double double47 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray46);
        int int48 = org.apache.commons.math.util.MathUtils.hash(doubleArray46);
        double[] doubleArray50 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray46, (double) 10);
        boolean boolean51 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray40, doubleArray50);
        double[] doubleArray53 = new double[] { 100L };
        double double54 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray53);
        int int55 = org.apache.commons.math.util.MathUtils.hash(doubleArray53);
        double[] doubleArray57 = new double[] { 100L };
        double double58 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray57);
        int int59 = org.apache.commons.math.util.MathUtils.hash(doubleArray57);
        double double60 = org.apache.commons.math.util.MathUtils.distance(doubleArray53, doubleArray57);
        double[] doubleArray62 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray53, 100.0d);
        boolean boolean63 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray50, doubleArray53);
        double double64 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray53);
        double[] doubleArray66 = new double[] { 100L };
        double double67 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray66);
        double[] doubleArray69 = new double[] { 100L };
        double double70 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray69);
        double double71 = org.apache.commons.math.util.MathUtils.distance1(doubleArray66, doubleArray69);
        double[] doubleArray73 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray66, (double) (short) 100);
        double double74 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray66);
        double[] doubleArray76 = new double[] { 100L };
        double double77 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray76);
        boolean boolean78 = org.apache.commons.math.util.MathUtils.equals(doubleArray66, doubleArray76);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1079574559 + "'", int18 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection24 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection24.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection34 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection34.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1079574559 + "'", int42 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1079574559 + "'", int48 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 100.0d + "'", double54 == 100.0d);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1079574559 + "'", int55 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 100.0d + "'", double58 == 100.0d);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1079574559 + "'", int59 == 1079574559);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 100.0d + "'", double67 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 100.0d + "'", double70 == 100.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 100.0d + "'", double77 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (-1078034397));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) 10);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray14 = new double[] { 35 };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double[] doubleArray17 = new double[] { 100L };
        double double18 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray17);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection19 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray17, orderDirection19, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection19, true);
        double[] doubleArray25 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, 3395.0d);
        double double26 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray25);
        boolean boolean27 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray25);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection19 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection19.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 3395.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 3395.0d + "'", double26 == 3395.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.pow(1072693282, (-1072693116));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1100758016, 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1100758016L + "'", long2 == 1100758016L);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(1074790407);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (-1067909019), (double) (-1074790400));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (-1067909019), (double) 7766279631452241920L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-97), 1079574559);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (-34), (double) 1048576L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(1072693247);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(2L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, 146);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(0.6895986556913533d, (-5));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.02154995799035479d + "'", double2 == 0.02154995799035479d);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-532995630), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-53299563000L) + "'", long2 == (-53299563000L));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        double double2 = org.apache.commons.math.util.MathUtils.log(0.0d, (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray5 = new int[] { 'a', '4' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray5);
        int[] intArray9 = new int[] { (-1), 100 };
        int[] intArray12 = new int[] { 'a', '4' };
        int int13 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray12);
        int[] intArray16 = new int[] { (byte) 10, 35 };
        int[] intArray23 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int24 = org.apache.commons.math.util.MathUtils.distance1(intArray16, intArray23);
        int int25 = org.apache.commons.math.util.MathUtils.distance1(intArray12, intArray16);
        int int26 = org.apache.commons.math.util.MathUtils.distanceInf(intArray5, intArray16);
        int[] intArray29 = new int[] { (-1), 100 };
        int[] intArray32 = new int[] { 'a', '4' };
        int int33 = org.apache.commons.math.util.MathUtils.distanceInf(intArray29, intArray32);
        int[] intArray36 = new int[] { (-1), 100 };
        int[] intArray39 = new int[] { 'a', '4' };
        int int40 = org.apache.commons.math.util.MathUtils.distanceInf(intArray36, intArray39);
        int int41 = org.apache.commons.math.util.MathUtils.distance1(intArray29, intArray36);
        int int42 = org.apache.commons.math.util.MathUtils.distanceInf(intArray16, intArray36);
        int[] intArray45 = new int[] { (-1), 100 };
        int[] intArray48 = new int[] { 'a', '4' };
        int int49 = org.apache.commons.math.util.MathUtils.distanceInf(intArray45, intArray48);
        int[] intArray52 = new int[] { (byte) 10, 35 };
        int[] intArray59 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int60 = org.apache.commons.math.util.MathUtils.distance1(intArray52, intArray59);
        int int61 = org.apache.commons.math.util.MathUtils.distance1(intArray48, intArray52);
        int[] intArray64 = new int[] { (-1), 100 };
        int[] intArray67 = new int[] { 'a', '4' };
        int int68 = org.apache.commons.math.util.MathUtils.distanceInf(intArray64, intArray67);
        int[] intArray71 = new int[] { (-1), 100 };
        int[] intArray74 = new int[] { 'a', '4' };
        int int75 = org.apache.commons.math.util.MathUtils.distanceInf(intArray71, intArray74);
        int int76 = org.apache.commons.math.util.MathUtils.distance1(intArray64, intArray71);
        int[] intArray79 = new int[] { (-1), 100 };
        int[] intArray82 = new int[] { 'a', '4' };
        int int83 = org.apache.commons.math.util.MathUtils.distanceInf(intArray79, intArray82);
        int[] intArray86 = new int[] { (byte) 10, 35 };
        int[] intArray93 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int94 = org.apache.commons.math.util.MathUtils.distance1(intArray86, intArray93);
        int int95 = org.apache.commons.math.util.MathUtils.distance1(intArray82, intArray86);
        int int96 = org.apache.commons.math.util.MathUtils.distanceInf(intArray71, intArray82);
        int int97 = org.apache.commons.math.util.MathUtils.distanceInf(intArray48, intArray82);
        int int98 = org.apache.commons.math.util.MathUtils.distance1(intArray36, intArray82);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 104 + "'", int25 == 104);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 87 + "'", int26 == 87);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 98 + "'", int33 == 98);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 98 + "'", int40 == 98);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 65 + "'", int42 == 65);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 98 + "'", int49 == 98);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 76 + "'", int60 == 76);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 104 + "'", int61 == 104);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 98 + "'", int68 == 98);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 98 + "'", int75 == 98);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 98 + "'", int83 == 98);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertArrayEquals(intArray93, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 76 + "'", int94 == 76);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 104 + "'", int95 == 104);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 98 + "'", int96 == 98);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 146 + "'", int98 == 146);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (byte) 100, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) ' ', 1079541760);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.3440585709080678E43d + "'", double1 == 1.3440585709080678E43d);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(2.1232288420165874E10d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.3961753845214844d + "'", double2 == 1.3961753845214844d);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        long long1 = org.apache.commons.math.util.MathUtils.sign(10761012170L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        double double1 = org.apache.commons.math.util.MathUtils.sinh(0.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) Float.NaN, (double) 1078034564, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.pow(1630474681, (int) (short) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1894776833, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1894776833L + "'", long2 == 1894776833L);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-76));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        int int1 = org.apache.commons.math.util.MathUtils.sign(3211);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (-5));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((int) '4', 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3380 + "'", int2 == 3380);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(1067909120, 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1067909055 + "'", int2 == 1067909055);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        double double3 = org.apache.commons.math.util.MathUtils.round((double) (-3798431950569582479L), (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-3.7984319505695826E18d) + "'", double3 == (-3.7984319505695826E18d));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-1067909019));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = new double[] { 100L };
        double double6 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray5);
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double double8 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray5);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        java.lang.Class<?> wildcardClass10 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1079574559 + "'", int7 == 1079574559);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (-803937719));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 440923534 + "'", int1 == 440923534);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-53299563000L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 33);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0732178989295803E14d + "'", double1 == 1.0732178989295803E14d);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 1072693282);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((int) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 9.619275968248924E151d + "'", double1 == 9.619275968248924E151d);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 1076101120);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection3, true);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) 10);
        double[] doubleArray13 = new double[] { 100L };
        double double14 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray13);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        double double18 = org.apache.commons.math.util.MathUtils.distance1(doubleArray13, doubleArray16);
        double[] doubleArray20 = new double[] { 100L };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        double[] doubleArray23 = new double[] { 100L };
        double double24 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray23);
        double double25 = org.apache.commons.math.util.MathUtils.distance1(doubleArray20, doubleArray23);
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray13, doubleArray23);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        int int30 = org.apache.commons.math.util.MathUtils.hash(doubleArray28);
        double[] doubleArray32 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray28, (double) 10);
        double[] doubleArray34 = new double[] { 100L };
        double double35 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray34);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection36 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray34, orderDirection36, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray32, orderDirection36, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray13, orderDirection36, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray7, orderDirection36, false);
        double double45 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray7);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray7);
        double double47 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        double[] doubleArray49 = new double[] { 100L };
        double double50 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray49);
        int int51 = org.apache.commons.math.util.MathUtils.hash(doubleArray49);
        double[] doubleArray53 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray49, (double) 10);
        double[] doubleArray55 = new double[] { 100L };
        double double56 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray55);
        int int57 = org.apache.commons.math.util.MathUtils.hash(doubleArray55);
        double[] doubleArray59 = new double[] { 100L };
        double double60 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray59);
        int int61 = org.apache.commons.math.util.MathUtils.hash(doubleArray59);
        double double62 = org.apache.commons.math.util.MathUtils.distance(doubleArray55, doubleArray59);
        double[] doubleArray64 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray55, 100.0d);
        double double65 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray55);
        double[] doubleArray67 = new double[] { 100L };
        double double68 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray67);
        double[] doubleArray70 = new double[] { 100L };
        double double71 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray70);
        double double72 = org.apache.commons.math.util.MathUtils.distance1(doubleArray67, doubleArray70);
        double[] doubleArray74 = new double[] { 100L };
        double double75 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray74);
        double[] doubleArray77 = new double[] { 100L };
        double double78 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray77);
        double double79 = org.apache.commons.math.util.MathUtils.distance1(doubleArray74, doubleArray77);
        boolean boolean80 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray67, doubleArray77);
        double[] doubleArray82 = new double[] { 100L };
        double double83 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray82);
        double[] doubleArray85 = new double[] { 100L };
        double double86 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray85);
        double double87 = org.apache.commons.math.util.MathUtils.distance1(doubleArray82, doubleArray85);
        double[] doubleArray89 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray82, (double) (short) 100);
        double double90 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray77, doubleArray82);
        boolean boolean91 = org.apache.commons.math.util.MathUtils.equals(doubleArray55, doubleArray77);
        double[] doubleArray93 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray55, (double) (-532995727));
        boolean boolean94 = org.apache.commons.math.util.MathUtils.equals(doubleArray49, doubleArray93);
        boolean boolean95 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray93);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection3 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection3.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1079574559 + "'", int30 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection36 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection36.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1079574559 + "'", int51 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1079574559 + "'", int57 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 100.0d + "'", double60 == 100.0d);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1079574559 + "'", int61 == 1079574559);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 100.0d + "'", double71 == 100.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 100.0d + "'", double75 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 100.0d + "'", double78 == 100.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 100.0d + "'", double83 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 100.0d + "'", double86 == 100.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertArrayEquals(doubleArray89, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertArrayEquals(doubleArray93, new double[] { (-5.32995727E8d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(Double.NaN, (double) 20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-2508L), 5548);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) -1, 1079574528);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (-2508L), 0, (-1074790303));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, 440923534);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(3201, (-35));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(109.12378292562992d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray5 = new int[] { 'a', '4' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray5);
        int[] intArray9 = new int[] { (byte) 10, 35 };
        int[] intArray16 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int17 = org.apache.commons.math.util.MathUtils.distance1(intArray9, intArray16);
        int int18 = org.apache.commons.math.util.MathUtils.distance1(intArray5, intArray9);
        int[] intArray21 = new int[] { (-1), 100 };
        int[] intArray24 = new int[] { 'a', '4' };
        int int25 = org.apache.commons.math.util.MathUtils.distanceInf(intArray21, intArray24);
        int int26 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray24);
        int[] intArray29 = new int[] { (-1), 100 };
        int[] intArray32 = new int[] { 'a', '4' };
        int int33 = org.apache.commons.math.util.MathUtils.distanceInf(intArray29, intArray32);
        int int34 = org.apache.commons.math.util.MathUtils.distance1(intArray9, intArray32);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 76 + "'", int17 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 104 + "'", int18 == 104);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 98 + "'", int25 == 98);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 87 + "'", int26 == 87);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 98 + "'", int33 == 98);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 104 + "'", int34 == 104);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble((int) (byte) 0, 98);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        long long1 = org.apache.commons.math.util.MathUtils.sign((-100L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round(2.1343363213777176E10d, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-1L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        long long2 = org.apache.commons.math.util.MathUtils.lcm((long) (short) 1, (long) 1078034432);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1078034432L + "'", long2 == 1078034432L);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-35));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round(0.0f, (int) (byte) -1, 440923534);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm((-1611030093), 2147450880);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection9 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray7, orderDirection9, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray5, orderDirection9, false);
        double[] doubleArray15 = new double[] { 35 };
        double double16 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray15);
        double[] doubleArray18 = new double[] { 100L };
        double double19 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray18);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection20 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray18, orderDirection20, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray15, orderDirection20, true);
        double double25 = org.apache.commons.math.util.MathUtils.distance1(doubleArray5, doubleArray15);
        double[] doubleArray27 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray5, (double) 1100758016);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection9 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection9.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 35.0d + "'", double16 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection20 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection20.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 25.0d + "'", double25 == 25.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 1.100758016E9d }, 1.0E-15);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(10, (-5));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 1076101185L, 20);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.12837387616256E15d + "'", double2 == 1.12837387616256E15d);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 11013.232920103324d + "'", double1 == 11013.232920103324d);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(87, 1894776833);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = new double[] { 100L };
        double double6 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray5);
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double double8 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray5);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double double16 = org.apache.commons.math.util.MathUtils.distance1(doubleArray11, doubleArray14);
        double[] doubleArray18 = new double[] { 100L };
        double double19 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray18);
        int int20 = org.apache.commons.math.util.MathUtils.hash(doubleArray18);
        double[] doubleArray22 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray18, (double) 10);
        double[] doubleArray24 = new double[] { 100L };
        double double25 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray24);
        double[] doubleArray27 = new double[] { 100L };
        double double28 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray27);
        double double29 = org.apache.commons.math.util.MathUtils.distance1(doubleArray24, doubleArray27);
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double[] doubleArray34 = new double[] { 100L };
        double double35 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray34);
        double double36 = org.apache.commons.math.util.MathUtils.distance1(doubleArray31, doubleArray34);
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray24, doubleArray34);
        double[] doubleArray39 = new double[] { 100L };
        double double40 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray39);
        int int41 = org.apache.commons.math.util.MathUtils.hash(doubleArray39);
        double[] doubleArray43 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray39, (double) 10);
        double[] doubleArray45 = new double[] { 100L };
        double double46 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray45);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection47 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray45, orderDirection47, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray43, orderDirection47, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray24, orderDirection47, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray18, orderDirection47, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection47, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray5, orderDirection47, true);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1079574559 + "'", int7 == 1079574559);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1079574559 + "'", int20 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1079574559 + "'", int41 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection47 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection47.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 2152202240L, 1078034463);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.6218191175889715E18d + "'", double2 == 4.6218191175889715E18d);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-1072693116));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 3395L, (-0.0d), (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(3380);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 1076101120, (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(532995726L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1076101120, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        int int2 = org.apache.commons.math.util.MathUtils.pow(1104139136, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 268435456 + "'", int2 == 268435456);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(4.6218191175889715E18d, 1.133871366144E12d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.133871366144E12d + "'", double2 == 1.133871366144E12d);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 32L, 99);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.028240960365167E31d + "'", double2 == 2.028240960365167E31d);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 101, (long) 65);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 166L + "'", long2 == 166L);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        boolean boolean3 = false; // flaky "1) test0604(org.apache.commons.math.util.RegressionTest1)": org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.12837387616256E15d, (double) (-1067909120), (-1067909120));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1894776833L, (long) (-1048576));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1986817512439808L) + "'", long2 == (-1986817512439808L));
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 33);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        float float1 = org.apache.commons.math.util.MathUtils.indicator(0.0f);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(100, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(1079574528L, (long) 440923534);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 476009816102141952L + "'", long2 == 476009816102141952L);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) (-100L), 3.1780538303479458d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 268435456, 3380);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        int int2 = org.apache.commons.math.util.MathUtils.pow((int) (short) 1, 3798431950569582479L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 3395L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(0L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1079574559);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1100758016, (long) 1079574559);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) (-1074790303), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.074790303E9d) + "'", double2 == (-1.074790303E9d));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) (byte) 10, (double) 1074790407, 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        double double3 = org.apache.commons.math.util.MathUtils.round(0.0d, 1078034564, 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1078034463, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 37731206205L + "'", long2 == 37731206205L);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (-2614362513533383839L), (double) (-5));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-52L));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.9155040003582885E22d + "'", double1 == 1.9155040003582885E22d);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 1078034564, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1078034564L + "'", long2 == 1078034564L);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (-76), (double) Float.NaN);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) '#', (double) (-1078034397));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (-1067909120), 98);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-3.3843390923930006E38d) + "'", double2 == (-3.3843390923930006E38d));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        int[] intArray2 = new int[] { (byte) 10, 35 };
        int[] intArray9 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int10 = org.apache.commons.math.util.MathUtils.distance1(intArray2, intArray9);
        int[] intArray13 = new int[] { (-1), 100 };
        int[] intArray16 = new int[] { 'a', '4' };
        int int17 = org.apache.commons.math.util.MathUtils.distanceInf(intArray13, intArray16);
        int[] intArray20 = new int[] { (short) 10, '#' };
        double double21 = org.apache.commons.math.util.MathUtils.distance(intArray13, intArray20);
        double double22 = org.apache.commons.math.util.MathUtils.distance(intArray2, intArray13);
        int[] intArray25 = new int[] { (-1), 100 };
        int[] intArray28 = new int[] { 'a', '4' };
        int int29 = org.apache.commons.math.util.MathUtils.distanceInf(intArray25, intArray28);
        int[] intArray32 = new int[] { (short) 10, '#' };
        double double33 = org.apache.commons.math.util.MathUtils.distance(intArray25, intArray32);
        int[] intArray36 = new int[] { (-1), 100 };
        int[] intArray39 = new int[] { 'a', '4' };
        int int40 = org.apache.commons.math.util.MathUtils.distanceInf(intArray36, intArray39);
        int[] intArray43 = new int[] { (byte) 10, 35 };
        int[] intArray50 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int51 = org.apache.commons.math.util.MathUtils.distance1(intArray43, intArray50);
        int int52 = org.apache.commons.math.util.MathUtils.distance1(intArray39, intArray43);
        int[] intArray55 = new int[] { (-1), 100 };
        int[] intArray58 = new int[] { 'a', '4' };
        int int59 = org.apache.commons.math.util.MathUtils.distanceInf(intArray55, intArray58);
        int[] intArray62 = new int[] { (byte) 10, 35 };
        int[] intArray69 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int70 = org.apache.commons.math.util.MathUtils.distance1(intArray62, intArray69);
        int int71 = org.apache.commons.math.util.MathUtils.distance1(intArray58, intArray62);
        int[] intArray74 = new int[] { (-1), 100 };
        int[] intArray77 = new int[] { 'a', '4' };
        int int78 = org.apache.commons.math.util.MathUtils.distanceInf(intArray74, intArray77);
        int int79 = org.apache.commons.math.util.MathUtils.distanceInf(intArray62, intArray77);
        double double80 = org.apache.commons.math.util.MathUtils.distance(intArray43, intArray77);
        double double81 = org.apache.commons.math.util.MathUtils.distance(intArray25, intArray77);
        int int82 = org.apache.commons.math.util.MathUtils.distance1(intArray2, intArray77);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 76 + "'", int10 == 76);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 98 + "'", int17 == 98);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 10, 35 });
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 65.92419889539804d + "'", double21 == 65.92419889539804d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 65.92419889539804d + "'", double22 == 65.92419889539804d);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 98 + "'", int29 == 98);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 10, 35 });
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 65.92419889539804d + "'", double33 == 65.92419889539804d);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 98 + "'", int40 == 98);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 76 + "'", int51 == 76);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 104 + "'", int52 == 104);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 98 + "'", int59 == 98);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 76 + "'", int70 == 76);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 104 + "'", int71 == 104);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 98 + "'", int78 == 98);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 87 + "'", int79 == 87);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 88.64536084872124d + "'", double80 == 88.64536084872124d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 109.12378292562992d + "'", double81 == 109.12378292562992d);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 104 + "'", int82 == 104);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray5 = new int[] { 'a', '4' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray5);
        int[] intArray9 = new int[] { (-1), 100 };
        int[] intArray12 = new int[] { 'a', '4' };
        int int13 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray12);
        int int14 = org.apache.commons.math.util.MathUtils.distance1(intArray2, intArray9);
        int[] intArray17 = new int[] { (-1), 100 };
        int[] intArray20 = new int[] { 'a', '4' };
        int int21 = org.apache.commons.math.util.MathUtils.distanceInf(intArray17, intArray20);
        int[] intArray24 = new int[] { (byte) 10, 35 };
        int[] intArray31 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int32 = org.apache.commons.math.util.MathUtils.distance1(intArray24, intArray31);
        int int33 = org.apache.commons.math.util.MathUtils.distance1(intArray20, intArray24);
        int[] intArray36 = new int[] { (-1), 100 };
        int[] intArray39 = new int[] { 'a', '4' };
        int int40 = org.apache.commons.math.util.MathUtils.distanceInf(intArray36, intArray39);
        int int41 = org.apache.commons.math.util.MathUtils.distanceInf(intArray24, intArray39);
        int[] intArray44 = new int[] { (-1), 100 };
        int[] intArray47 = new int[] { 'a', '4' };
        int int48 = org.apache.commons.math.util.MathUtils.distanceInf(intArray44, intArray47);
        int[] intArray51 = new int[] { (byte) 10, 35 };
        int[] intArray58 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int59 = org.apache.commons.math.util.MathUtils.distance1(intArray51, intArray58);
        int int60 = org.apache.commons.math.util.MathUtils.distance1(intArray47, intArray51);
        int[] intArray63 = new int[] { (-1), 100 };
        int[] intArray66 = new int[] { 'a', '4' };
        int int67 = org.apache.commons.math.util.MathUtils.distanceInf(intArray63, intArray66);
        int int68 = org.apache.commons.math.util.MathUtils.distanceInf(intArray51, intArray66);
        int[] intArray71 = new int[] { (-1), 100 };
        int[] intArray74 = new int[] { 'a', '4' };
        int int75 = org.apache.commons.math.util.MathUtils.distanceInf(intArray71, intArray74);
        int[] intArray78 = new int[] { (byte) 10, 35 };
        int[] intArray85 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int86 = org.apache.commons.math.util.MathUtils.distance1(intArray78, intArray85);
        int int87 = org.apache.commons.math.util.MathUtils.distance1(intArray74, intArray78);
        int[] intArray90 = new int[] { (-1), 100 };
        int[] intArray93 = new int[] { 'a', '4' };
        int int94 = org.apache.commons.math.util.MathUtils.distanceInf(intArray90, intArray93);
        int int95 = org.apache.commons.math.util.MathUtils.distanceInf(intArray78, intArray93);
        int int96 = org.apache.commons.math.util.MathUtils.distance1(intArray51, intArray93);
        int int97 = org.apache.commons.math.util.MathUtils.distanceInf(intArray39, intArray93);
        int int98 = org.apache.commons.math.util.MathUtils.distance1(intArray2, intArray93);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 98 + "'", int21 == 98);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 76 + "'", int32 == 76);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 104 + "'", int33 == 104);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 98 + "'", int40 == 98);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 87 + "'", int41 == 87);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 98 + "'", int48 == 98);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 76 + "'", int59 == 76);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 104 + "'", int60 == 104);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 98 + "'", int67 == 98);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 87 + "'", int68 == 87);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 98 + "'", int75 == 98);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 76 + "'", int86 == 76);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 104 + "'", int87 == 104);
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertArrayEquals(intArray90, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertArrayEquals(intArray93, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 98 + "'", int94 == 98);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 87 + "'", int95 == 87);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 104 + "'", int96 == 104);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 146 + "'", int98 == 146);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(440923534, 1104139136);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        short short1 = org.apache.commons.math.util.MathUtils.indicator((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        int[] intArray3 = new int[] { ' ', (short) 0, 99 };
        int[] intArray6 = new int[] { (-1), 100 };
        int[] intArray9 = new int[] { 'a', '4' };
        int int10 = org.apache.commons.math.util.MathUtils.distanceInf(intArray6, intArray9);
        int[] intArray13 = new int[] { (-1), 100 };
        int[] intArray16 = new int[] { 'a', '4' };
        int int17 = org.apache.commons.math.util.MathUtils.distanceInf(intArray13, intArray16);
        int int18 = org.apache.commons.math.util.MathUtils.distance1(intArray6, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.math.util.MathUtils.distance1(intArray3, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 32, 0, 99 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 98 + "'", int10 == 98);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 98 + "'", int17 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(574587745814872154L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 3380, 1100758016, 1067909055);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        long long1 = org.apache.commons.math.util.MathUtils.factorial(2);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2L + "'", long1 == 2L);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        int int1 = org.apache.commons.math.util.MathUtils.sign(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 87, (-3.7984319505695826E18d), (double) (-532995532));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm((int) 'a', (-1067909019));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 2147450880, 1894776833L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4042227713L + "'", long2 == 4042227713L);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (-35));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo(0.9302899837493896d, 25.0d, (double) 33.0f);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 98);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = new double[] { 100L };
        double double6 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray5);
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double double8 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray5);
        double[] doubleArray10 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 100.0d);
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray13 = new double[] { 100L };
        double double14 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray13);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        double double18 = org.apache.commons.math.util.MathUtils.distance1(doubleArray13, doubleArray16);
        double[] doubleArray20 = new double[] { 100L };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        double[] doubleArray23 = new double[] { 100L };
        double double24 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray23);
        double double25 = org.apache.commons.math.util.MathUtils.distance1(doubleArray20, doubleArray23);
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray13, doubleArray23);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double double33 = org.apache.commons.math.util.MathUtils.distance1(doubleArray28, doubleArray31);
        double[] doubleArray35 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray28, (double) (short) 100);
        double double36 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray23, doubleArray28);
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray23);
        double[] doubleArray39 = new double[] { 100L };
        double double40 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray39);
        int int41 = org.apache.commons.math.util.MathUtils.hash(doubleArray39);
        double[] doubleArray43 = new double[] { 100L };
        double double44 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray43);
        int int45 = org.apache.commons.math.util.MathUtils.hash(doubleArray43);
        double double46 = org.apache.commons.math.util.MathUtils.distance(doubleArray39, doubleArray43);
        double[] doubleArray48 = new double[] { 100L };
        double double49 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray48);
        int int50 = org.apache.commons.math.util.MathUtils.hash(doubleArray48);
        double[] doubleArray52 = new double[] { 100L };
        double double53 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray52);
        int int54 = org.apache.commons.math.util.MathUtils.hash(doubleArray52);
        double double55 = org.apache.commons.math.util.MathUtils.distance(doubleArray48, doubleArray52);
        double[] doubleArray57 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray48, 100.0d);
        double double58 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray43, doubleArray57);
        double double59 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray43);
        double double60 = org.apache.commons.math.util.MathUtils.distance(doubleArray23, doubleArray43);
        double[] doubleArray62 = new double[] { 35 };
        double double63 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray62);
        double[] doubleArray65 = new double[] { 100L };
        double double66 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray65);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection67 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray65, orderDirection67, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray62, orderDirection67, true);
        double[] doubleArray77 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray79 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray77, (double) 1L);
        double double80 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray62, doubleArray77);
        double double81 = org.apache.commons.math.util.MathUtils.distance1(doubleArray23, doubleArray62);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1079574559 + "'", int7 == 1079574559);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1079574559 + "'", int41 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1079574559 + "'", int45 == 1079574559);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1079574559 + "'", int50 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1079574559 + "'", int54 == 1079574559);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 100.0d + "'", double59 == 100.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 35.0d + "'", double63 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 100.0d + "'", double66 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection67 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection67.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 65.0d + "'", double81 == 65.0d);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog(1067909120);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 2.1132819926743435E10d + "'", double1 == 2.1132819926743435E10d);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 1100758016L, (-34), 1076101120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        double double2 = org.apache.commons.math.util.MathUtils.log(11013.232920103324d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 3201);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(0, (-5));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        int int1 = org.apache.commons.math.util.MathUtils.hash(1.4650188248182272d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1413573307) + "'", int1 == (-1413573307));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        double[] doubleArray1 = new double[] { 35 };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 65.92419889539804d);
        double[] doubleArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1078034463 + "'", int3 == 1078034463);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 65.92419889539804d }, 1.0E-15);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(1.12837387616256E15d, (double) 268435456, 256.22113555000954d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(20, 1072693247);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        int[] intArray0 = null;
        int[] intArray3 = new int[] { (-1), 100 };
        int[] intArray6 = new int[] { 'a', '4' };
        int int7 = org.apache.commons.math.util.MathUtils.distanceInf(intArray3, intArray6);
        int[] intArray10 = new int[] { (byte) 10, 35 };
        int[] intArray17 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int18 = org.apache.commons.math.util.MathUtils.distance1(intArray10, intArray17);
        int int19 = org.apache.commons.math.util.MathUtils.distance1(intArray6, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 76 + "'", int18 == 76);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 104 + "'", int19 == 104);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 87);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1079001088, 5548);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(2147450880);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        int int1 = org.apache.commons.math.util.MathUtils.hash((-1.074790303E9d));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 638583807 + "'", int1 == 638583807);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = new double[] { 100L };
        double double6 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray5);
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double double8 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray5);
        double[] doubleArray10 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 100.0d);
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray13 = new double[] { 100L };
        double double14 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray13);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        double double18 = org.apache.commons.math.util.MathUtils.distance1(doubleArray13, doubleArray16);
        double[] doubleArray20 = new double[] { 100L };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        double[] doubleArray23 = new double[] { 100L };
        double double24 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray23);
        double double25 = org.apache.commons.math.util.MathUtils.distance1(doubleArray20, doubleArray23);
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray13, doubleArray23);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double double33 = org.apache.commons.math.util.MathUtils.distance1(doubleArray28, doubleArray31);
        double[] doubleArray35 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray28, (double) (short) 100);
        double double36 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray23, doubleArray28);
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray23);
        int int38 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double double39 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1079574559 + "'", int7 == 1079574559);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1079574559 + "'", int38 == 1079574559);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = new double[] { 100L };
        double double6 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray5);
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double double8 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray5);
        double[] doubleArray10 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 100.0d);
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray13 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 3104);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1079574559 + "'", int7 == 1079574559);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 3104.0d }, 1.0E-15);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray5 = new int[] { 'a', '4' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray5);
        int[] intArray9 = new int[] { (short) 10, '#' };
        double double10 = org.apache.commons.math.util.MathUtils.distance(intArray2, intArray9);
        int[] intArray13 = new int[] { (-1), 100 };
        int[] intArray16 = new int[] { 'a', '4' };
        int int17 = org.apache.commons.math.util.MathUtils.distanceInf(intArray13, intArray16);
        int[] intArray20 = new int[] { (byte) 10, 35 };
        int[] intArray27 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int28 = org.apache.commons.math.util.MathUtils.distance1(intArray20, intArray27);
        int int29 = org.apache.commons.math.util.MathUtils.distance1(intArray16, intArray20);
        int[] intArray32 = new int[] { (-1), 100 };
        int[] intArray35 = new int[] { 'a', '4' };
        int int36 = org.apache.commons.math.util.MathUtils.distanceInf(intArray32, intArray35);
        int[] intArray39 = new int[] { (byte) 10, 35 };
        int[] intArray46 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int47 = org.apache.commons.math.util.MathUtils.distance1(intArray39, intArray46);
        int int48 = org.apache.commons.math.util.MathUtils.distance1(intArray35, intArray39);
        int[] intArray51 = new int[] { (-1), 100 };
        int[] intArray54 = new int[] { 'a', '4' };
        int int55 = org.apache.commons.math.util.MathUtils.distanceInf(intArray51, intArray54);
        int int56 = org.apache.commons.math.util.MathUtils.distanceInf(intArray39, intArray54);
        double double57 = org.apache.commons.math.util.MathUtils.distance(intArray20, intArray54);
        double double58 = org.apache.commons.math.util.MathUtils.distance(intArray2, intArray54);
        int[] intArray61 = new int[] { (-1), 100 };
        int[] intArray64 = new int[] { 'a', '4' };
        int int65 = org.apache.commons.math.util.MathUtils.distanceInf(intArray61, intArray64);
        int[] intArray68 = new int[] { (-1), 100 };
        int[] intArray71 = new int[] { 'a', '4' };
        int int72 = org.apache.commons.math.util.MathUtils.distanceInf(intArray68, intArray71);
        int[] intArray75 = new int[] { (byte) 10, 35 };
        int[] intArray82 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int83 = org.apache.commons.math.util.MathUtils.distance1(intArray75, intArray82);
        int int84 = org.apache.commons.math.util.MathUtils.distance1(intArray71, intArray75);
        int int85 = org.apache.commons.math.util.MathUtils.distanceInf(intArray64, intArray75);
        int int86 = org.apache.commons.math.util.MathUtils.distanceInf(intArray54, intArray75);
        int[] intArray89 = new int[] { (-1), 100 };
        int[] intArray92 = new int[] { 'a', '4' };
        int int93 = org.apache.commons.math.util.MathUtils.distanceInf(intArray89, intArray92);
        int[] intArray96 = new int[] { (short) 10, '#' };
        double double97 = org.apache.commons.math.util.MathUtils.distance(intArray89, intArray96);
        int int98 = org.apache.commons.math.util.MathUtils.distance1(intArray54, intArray96);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 35 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 65.92419889539804d + "'", double10 == 65.92419889539804d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 98 + "'", int17 == 98);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 76 + "'", int28 == 76);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 104 + "'", int29 == 104);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 98 + "'", int36 == 98);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 76 + "'", int47 == 76);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 104 + "'", int48 == 104);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 98 + "'", int55 == 98);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 87 + "'", int56 == 87);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 88.64536084872124d + "'", double57 == 88.64536084872124d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 109.12378292562992d + "'", double58 == 109.12378292562992d);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 98 + "'", int65 == 98);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 98 + "'", int72 == 98);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 76 + "'", int83 == 76);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 104 + "'", int84 == 104);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 87 + "'", int85 == 87);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 87 + "'", int86 == 87);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertArrayEquals(intArray92, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 98 + "'", int93 == 98);
        org.junit.Assert.assertNotNull(intArray96);
        org.junit.Assert.assertArrayEquals(intArray96, new int[] { 10, 35 });
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 65.92419889539804d + "'", double97 == 65.92419889539804d);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 104 + "'", int98 == 104);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, 9036866128227814273L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        boolean boolean3 = false; // flaky "2) test0661(org.apache.commons.math.util.RegressionTest1)": org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.3961753845214844d, (double) 195, 268435456);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        long long2 = org.apache.commons.math.util.MathUtils.pow(532995727L, (long) 1067909120);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7804846298364903425L + "'", long2 == 7804846298364903425L);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) (short) 100);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray8, (double) (-532995630));
        double[] doubleArray13 = new double[] { 100L };
        double double14 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray13);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection15 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray13, orderDirection15, true);
        double[] doubleArray19 = new double[] { 100L };
        double double20 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray19);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        double double24 = org.apache.commons.math.util.MathUtils.distance1(doubleArray19, doubleArray22);
        double[] doubleArray26 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray19, (double) (short) 100);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray26);
        double[] doubleArray29 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray26, (double) (-532995630));
        double double30 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray13, doubleArray26);
        double[] doubleArray32 = new double[] { 35 };
        double double33 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray32);
        double[] doubleArray35 = new double[] { 100L };
        double double36 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray35);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection37 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray35, orderDirection37, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray32, orderDirection37, true);
        double[] doubleArray47 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray49 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray47, (double) 1L);
        double double50 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray32, doubleArray47);
        boolean boolean51 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray13, doubleArray47);
        boolean boolean52 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray47);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-5.3299563E8d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection15 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection15.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { (-5.3299563E8d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 35.0d + "'", double33 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection37 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection37.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, 574587745814872154L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        boolean boolean3 = false; // flaky "3) test0665(org.apache.commons.math.util.RegressionTest1)": org.apache.commons.math.util.MathUtils.equals(2.1132819926743435E10d, (double) 100L, 1072693247);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((-1.0d), (-1074790303));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.5845632502852868E29d) + "'", double2 == (-1.5845632502852868E29d));
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        double double1 = org.apache.commons.math.util.MathUtils.factorialLog((int) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 92.13617560368711d + "'", double1 == 92.13617560368711d);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        long long2 = org.apache.commons.math.util.MathUtils.pow(532995727L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 532995727L + "'", long2 == 532995727L);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1078034564, 1079525376);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) 10);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray11);
        double[] doubleArray15 = new double[] { 100L };
        double double16 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray15);
        int int17 = org.apache.commons.math.util.MathUtils.hash(doubleArray15);
        double[] doubleArray19 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray15, (double) 10);
        double[] doubleArray21 = new double[] { 100L };
        double double22 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray21);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection23 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray21, orderDirection23, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray19, orderDirection23, false);
        double double28 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray11, doubleArray19);
        double[] doubleArray30 = new double[] { 100L };
        double double31 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray30);
        double[] doubleArray33 = new double[] { 100L };
        double double34 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray33);
        double double35 = org.apache.commons.math.util.MathUtils.distance1(doubleArray30, doubleArray33);
        double[] doubleArray37 = new double[] { 100L };
        double double38 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray37);
        double[] doubleArray40 = new double[] { 100L };
        double double41 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray40);
        double double42 = org.apache.commons.math.util.MathUtils.distance1(doubleArray37, doubleArray40);
        boolean boolean43 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray30, doubleArray40);
        double double44 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray30);
        double[] doubleArray46 = new double[] { 35 };
        double double47 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray46);
        double[] doubleArray49 = new double[] { 100L };
        double double50 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray49);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection51 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray49, orderDirection51, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray46, orderDirection51, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray30, orderDirection51, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray11, orderDirection51, false);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1079574559 + "'", int17 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection23 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection23.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 35.0d + "'", double47 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection51 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection51.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        long long2 = org.apache.commons.math.util.MathUtils.gcd((long) (short) 1, (-3319L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        boolean boolean3 = false; // flaky "4) test0672(org.apache.commons.math.util.RegressionTest1)": org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (-1986817512439808L), (double) 1079541760, (-532995532));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 101, 1.5430806348152437d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.09399122490953302d + "'", double2 == 0.09399122490953302d);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-1067909120));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        long long2 = org.apache.commons.math.util.MathUtils.pow(1078034564L, (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-1074790303));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-1048576));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (-53299563000L), (double) (-1413573307));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 1067909055, 33, (-76));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 1076101185L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 1L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        int int2 = org.apache.commons.math.util.MathUtils.pow(1078034564, 195);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        boolean boolean3 = false; // flaky "5) test0683(org.apache.commons.math.util.RegressionTest1)": org.apache.commons.math.util.MathUtils.equalsIncludingNaN(0.02154995799035479d, 34.075801104601965d, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(22639.925120280288d, (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.6084585122371209d + "'", double2 == 1.6084585122371209d);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray5 = new int[] { 'a', '4' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray5);
        int[] intArray9 = new int[] { (-1), 100 };
        int[] intArray12 = new int[] { 'a', '4' };
        int int13 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray12);
        int[] intArray16 = new int[] { (-1), 100 };
        int[] intArray19 = new int[] { 'a', '4' };
        int int20 = org.apache.commons.math.util.MathUtils.distanceInf(intArray16, intArray19);
        int int21 = org.apache.commons.math.util.MathUtils.distance1(intArray9, intArray16);
        int[] intArray24 = new int[] { (-1), 100 };
        int[] intArray27 = new int[] { 'a', '4' };
        int int28 = org.apache.commons.math.util.MathUtils.distanceInf(intArray24, intArray27);
        int[] intArray31 = new int[] { (byte) 10, 35 };
        int[] intArray38 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int39 = org.apache.commons.math.util.MathUtils.distance1(intArray31, intArray38);
        int int40 = org.apache.commons.math.util.MathUtils.distance1(intArray27, intArray31);
        int int41 = org.apache.commons.math.util.MathUtils.distanceInf(intArray16, intArray27);
        double double42 = org.apache.commons.math.util.MathUtils.distance(intArray5, intArray27);
        int[] intArray45 = new int[] { (-1), 100 };
        int[] intArray48 = new int[] { 'a', '4' };
        int int49 = org.apache.commons.math.util.MathUtils.distanceInf(intArray45, intArray48);
        int[] intArray52 = new int[] { (-1), 100 };
        int[] intArray55 = new int[] { 'a', '4' };
        int int56 = org.apache.commons.math.util.MathUtils.distanceInf(intArray52, intArray55);
        int[] intArray59 = new int[] { (-1), 100 };
        int[] intArray62 = new int[] { 'a', '4' };
        int int63 = org.apache.commons.math.util.MathUtils.distanceInf(intArray59, intArray62);
        int int64 = org.apache.commons.math.util.MathUtils.distance1(intArray52, intArray59);
        int[] intArray67 = new int[] { (-1), 100 };
        int[] intArray70 = new int[] { 'a', '4' };
        int int71 = org.apache.commons.math.util.MathUtils.distanceInf(intArray67, intArray70);
        int[] intArray74 = new int[] { (byte) 10, 35 };
        int[] intArray81 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int82 = org.apache.commons.math.util.MathUtils.distance1(intArray74, intArray81);
        int int83 = org.apache.commons.math.util.MathUtils.distance1(intArray70, intArray74);
        int int84 = org.apache.commons.math.util.MathUtils.distanceInf(intArray59, intArray70);
        double double85 = org.apache.commons.math.util.MathUtils.distance(intArray48, intArray70);
        double double86 = org.apache.commons.math.util.MathUtils.distance(intArray27, intArray48);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 98 + "'", int20 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 98 + "'", int28 == 98);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 76 + "'", int39 == 76);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 104 + "'", int40 == 104);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 98 + "'", int41 == 98);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 98 + "'", int49 == 98);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 98 + "'", int56 == 98);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 98 + "'", int63 == 98);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 98 + "'", int71 == 98);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 76 + "'", int82 == 76);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 104 + "'", int83 == 104);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 98 + "'", int84 == 98);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1104139136, 87);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 7.7662794E18f, 1.3961753845214844d, 146);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        float float3 = org.apache.commons.math.util.MathUtils.round((float) 2L, 1078034463, 0);
        org.junit.Assert.assertTrue(Float.isNaN(float3));
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        int int1 = org.apache.commons.math.util.MathUtils.sign((-1067909120));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 1079541760);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) (-1067909120));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1043344512) + "'", int1 == (-1043344512));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(0.0d, (double) 1076101120);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        long long2 = org.apache.commons.math.util.MathUtils.pow(1100758016L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(1100758016, 1072693248);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.306802619371374E8d + "'", double2 == 1.306802619371374E8d);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) (byte) 100, (-1067909019));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        long long1 = org.apache.commons.math.util.MathUtils.indicator(532995726L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((-2.0d), (double) 5548);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        boolean boolean3 = false; // flaky "6) test0698(org.apache.commons.math.util.RegressionTest1)": org.apache.commons.math.util.MathUtils.equals((-0.0d), (double) 1104139136, 1079525376);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1078034463);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection3, true);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) 10);
        double[] doubleArray13 = new double[] { 100L };
        double double14 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray13);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        double double18 = org.apache.commons.math.util.MathUtils.distance1(doubleArray13, doubleArray16);
        double[] doubleArray20 = new double[] { 100L };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        double[] doubleArray23 = new double[] { 100L };
        double double24 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray23);
        double double25 = org.apache.commons.math.util.MathUtils.distance1(doubleArray20, doubleArray23);
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray13, doubleArray23);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        int int30 = org.apache.commons.math.util.MathUtils.hash(doubleArray28);
        double[] doubleArray32 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray28, (double) 10);
        double[] doubleArray34 = new double[] { 100L };
        double double35 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray34);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection36 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray34, orderDirection36, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray32, orderDirection36, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray13, orderDirection36, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray7, orderDirection36, false);
        double double45 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray7);
        double[] doubleArray47 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) (-1074790324));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection3 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection3.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1079574559 + "'", int30 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection36 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection36.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { (-1.074790324E9d) }, 1.0E-15);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(440923534, (-34));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        double[] doubleArray1 = new double[] { 35 };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection6 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray4, orderDirection6, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection6, true);
        double[] doubleArray16 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray18 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray16, (double) 1L);
        double double19 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray16);
        int int20 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection6 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection6.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1078034463 + "'", int20 == 1078034463);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 638583807, (double) (short) -1);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(100L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3200L + "'", long2 == 3200L);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(2.134336531441605E10d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        boolean boolean9 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray7);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double double16 = org.apache.commons.math.util.MathUtils.distance1(doubleArray11, doubleArray14);
        double[] doubleArray18 = new double[] { 100L };
        double double19 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray18);
        double[] doubleArray21 = new double[] { 100L };
        double double22 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray21);
        double double23 = org.apache.commons.math.util.MathUtils.distance1(doubleArray18, doubleArray21);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray11, doubleArray21);
        double[] doubleArray26 = new double[] { 100L };
        double double27 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray26);
        double[] doubleArray29 = new double[] { 100L };
        double double30 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray29);
        double double31 = org.apache.commons.math.util.MathUtils.distance1(doubleArray26, doubleArray29);
        double[] doubleArray33 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray26, (double) (short) 100);
        double double34 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray21, doubleArray26);
        boolean boolean35 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray21);
        double[] doubleArray37 = new double[] { 100L };
        double double38 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray37);
        double[] doubleArray40 = new double[] { 100L };
        double double41 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray40);
        double double42 = org.apache.commons.math.util.MathUtils.distance1(doubleArray37, doubleArray40);
        double[] doubleArray44 = new double[] { 100L };
        double double45 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray44);
        double[] doubleArray47 = new double[] { 100L };
        double double48 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray47);
        double double49 = org.apache.commons.math.util.MathUtils.distance1(doubleArray44, doubleArray47);
        boolean boolean50 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray37, doubleArray47);
        double[] doubleArray52 = new double[] { 100L };
        double double53 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray52);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection54 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray52, orderDirection54, true);
        double[] doubleArray58 = new double[] { 100L };
        double double59 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray58);
        int int60 = org.apache.commons.math.util.MathUtils.hash(doubleArray58);
        double[] doubleArray62 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray58, (double) 10);
        double[] doubleArray64 = new double[] { 100L };
        double double65 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray64);
        double[] doubleArray67 = new double[] { 100L };
        double double68 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray67);
        double double69 = org.apache.commons.math.util.MathUtils.distance1(doubleArray64, doubleArray67);
        double[] doubleArray71 = new double[] { 100L };
        double double72 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray71);
        double[] doubleArray74 = new double[] { 100L };
        double double75 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray74);
        double double76 = org.apache.commons.math.util.MathUtils.distance1(doubleArray71, doubleArray74);
        boolean boolean77 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray64, doubleArray74);
        double[] doubleArray79 = new double[] { 100L };
        double double80 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray79);
        int int81 = org.apache.commons.math.util.MathUtils.hash(doubleArray79);
        double[] doubleArray83 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray79, (double) 10);
        double[] doubleArray85 = new double[] { 100L };
        double double86 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray85);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection87 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray85, orderDirection87, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray83, orderDirection87, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray64, orderDirection87, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray58, orderDirection87, false);
        double double96 = org.apache.commons.math.util.MathUtils.distance1(doubleArray52, doubleArray58);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray58);
        boolean boolean98 = org.apache.commons.math.util.MathUtils.equals(doubleArray47, doubleArray58);
        boolean boolean99 = org.apache.commons.math.util.MathUtils.equals(doubleArray7, doubleArray58);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection54 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection54.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 100.0d + "'", double59 == 100.0d);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1079574559 + "'", int60 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 100.0d + "'", double72 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 100.0d + "'", double75 == 100.0d);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 100.0d + "'", double80 == 100.0d);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1079574559 + "'", int81 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 100.0d + "'", double86 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection87 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection87.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        int int1 = org.apache.commons.math.util.MathUtils.sign(1072693282);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (-1048576), 4.6218191175889715E18d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (-53299563000L));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = new double[] { 100L };
        double double9 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray11);
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray16);
        double[] doubleArray20 = new double[] { 100L };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        int int22 = org.apache.commons.math.util.MathUtils.hash(doubleArray20);
        double double23 = org.apache.commons.math.util.MathUtils.distance(doubleArray16, doubleArray20);
        double[] doubleArray25 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray16, 100.0d);
        boolean boolean26 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray16);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double double33 = org.apache.commons.math.util.MathUtils.distance1(doubleArray28, doubleArray31);
        double[] doubleArray35 = new double[] { 100L };
        double double36 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray35);
        double[] doubleArray38 = new double[] { 100L };
        double double39 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray38);
        double double40 = org.apache.commons.math.util.MathUtils.distance1(doubleArray35, doubleArray38);
        boolean boolean41 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray28, doubleArray38);
        double[] doubleArray43 = new double[] { 100L };
        double double44 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray43);
        int int45 = org.apache.commons.math.util.MathUtils.hash(doubleArray43);
        double[] doubleArray47 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray43, (double) 10);
        double[] doubleArray49 = new double[] { 100L };
        double double50 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray49);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection51 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray49, orderDirection51, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray47, orderDirection51, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray28, orderDirection51, true);
        double[] doubleArray59 = new double[] { 100L };
        double double60 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray59);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection61 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray59, orderDirection61, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray28, orderDirection61, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection61, false);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1079574559 + "'", int18 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1079574559 + "'", int22 == 1079574559);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1079574559 + "'", int45 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection51 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection51.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 100.0d + "'", double60 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection61 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection61.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        double double1 = org.apache.commons.math.util.MathUtils.indicator((double) 532995727L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(1.3440585709080678E43d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        double[] doubleArray10 = new double[] { 100L };
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        double double12 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray10);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double[] doubleArray17 = new double[] { 100L };
        double double18 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray17);
        double double19 = org.apache.commons.math.util.MathUtils.distance1(doubleArray14, doubleArray17);
        boolean boolean20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray17);
        boolean boolean21 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray7);
        double[] doubleArray23 = new double[] { 100L };
        double double24 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray23);
        int int25 = org.apache.commons.math.util.MathUtils.hash(doubleArray23);
        double[] doubleArray27 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray23, (double) 10);
        double[] doubleArray29 = new double[] { 100L };
        double double30 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray29);
        int int31 = org.apache.commons.math.util.MathUtils.hash(doubleArray29);
        double[] doubleArray33 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray29, (double) 10);
        boolean boolean34 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray23, doubleArray33);
        double[] doubleArray36 = new double[] { 100L };
        double double37 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray36);
        double[] doubleArray39 = new double[] { 100L };
        double double40 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray39);
        double double41 = org.apache.commons.math.util.MathUtils.distance1(doubleArray36, doubleArray39);
        double[] doubleArray43 = new double[] { 100L };
        double double44 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray43);
        int int45 = org.apache.commons.math.util.MathUtils.hash(doubleArray43);
        double[] doubleArray47 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray43, (double) 10);
        double[] doubleArray49 = new double[] { 100L };
        double double50 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray49);
        double[] doubleArray52 = new double[] { 100L };
        double double53 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray52);
        double double54 = org.apache.commons.math.util.MathUtils.distance1(doubleArray49, doubleArray52);
        double[] doubleArray56 = new double[] { 100L };
        double double57 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray56);
        double[] doubleArray59 = new double[] { 100L };
        double double60 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray59);
        double double61 = org.apache.commons.math.util.MathUtils.distance1(doubleArray56, doubleArray59);
        boolean boolean62 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray49, doubleArray59);
        double[] doubleArray64 = new double[] { 100L };
        double double65 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray64);
        int int66 = org.apache.commons.math.util.MathUtils.hash(doubleArray64);
        double[] doubleArray68 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray64, (double) 10);
        double[] doubleArray70 = new double[] { 100L };
        double double71 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray70);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection72 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray70, orderDirection72, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray68, orderDirection72, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray49, orderDirection72, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray43, orderDirection72, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray39, orderDirection72, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray23, orderDirection72, false);
        double[] doubleArray86 = new double[] { 100L };
        double double87 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray86);
        int int88 = org.apache.commons.math.util.MathUtils.hash(doubleArray86);
        double[] doubleArray90 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray86, (double) 10);
        boolean boolean91 = org.apache.commons.math.util.MathUtils.equals(doubleArray23, doubleArray86);
        double double92 = org.apache.commons.math.util.MathUtils.distance1(doubleArray5, doubleArray23);
        double double93 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1079574559 + "'", int25 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1079574559 + "'", int31 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1079574559 + "'", int45 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 100.0d + "'", double57 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 100.0d + "'", double60 == 100.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1079574559 + "'", int66 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 100.0d + "'", double71 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection72 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection72.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 100.0d + "'", double87 == 100.0d);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1079574559 + "'", int88 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray90);
        org.junit.Assert.assertArrayEquals(doubleArray90, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 90.0d + "'", double92 == 90.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 100.0d + "'", double93 == 100.0d);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 3211);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 0L);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (byte) 0, (-532995727), 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1076101120);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 97, 2.2250738585072014E-308d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-154.85052976265095d) + "'", double2 == (-154.85052976265095d));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(2.1232288420165874E10d, 0.6895986556913533d, 2.134336531441605E10d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round((double) (-1.0f), 1104139136);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 638583807, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 638583806L + "'", long2 == 638583806L);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1072693282, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1072693281 + "'", int2 == 1072693281);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (-100L), (-532995630), 3104);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        long long2 = org.apache.commons.math.util.MathUtils.pow(32L, (long) 195);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1079001088);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-1067909019));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 638583807, 1.1102230246251565E-16d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) (-2614362513533383839L), 0.02154995799035479d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((int) '#', (-803937719));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 803937754 + "'", int2 == 803937754);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection3, true);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        double[] doubleArray10 = new double[] { 100L };
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        double double12 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray10);
        double[] doubleArray14 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) (short) 100);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14);
        double[] doubleArray17 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, (double) (-532995630));
        double double18 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray14);
        double[] doubleArray20 = new double[] { 35 };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        double[] doubleArray23 = new double[] { 100L };
        double double24 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray23);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection25 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray23, orderDirection25, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray20, orderDirection25, true);
        double[] doubleArray35 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray37 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray35, (double) 1L);
        double double38 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray20, doubleArray35);
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray35);
        double[] doubleArray41 = new double[] { 100L };
        double double42 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray41);
        int int43 = org.apache.commons.math.util.MathUtils.hash(doubleArray41);
        double[] doubleArray45 = new double[] { 100L };
        double double46 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray45);
        int int47 = org.apache.commons.math.util.MathUtils.hash(doubleArray45);
        double double48 = org.apache.commons.math.util.MathUtils.distance(doubleArray41, doubleArray45);
        // The following exception was thrown during execution in test generation
        try {
            double double49 = org.apache.commons.math.util.MathUtils.distance1(doubleArray35, doubleArray45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection3 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection3.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-5.3299563E8d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection25 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection25.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 100.0d + "'", double42 == 100.0d);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1079574559 + "'", int43 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1079574559 + "'", int47 == 1079574559);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(2.1232288420165874E10d, 1.5830658481259483E30d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        long long2 = org.apache.commons.math.util.MathUtils.pow(2152202240L, 440923534);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray5 = new int[] { 'a', '4' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray5);
        int[] intArray9 = new int[] { (-1), 100 };
        int[] intArray12 = new int[] { 'a', '4' };
        int int13 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray12);
        int int14 = org.apache.commons.math.util.MathUtils.distance1(intArray2, intArray9);
        int[] intArray17 = new int[] { (-1), 100 };
        int[] intArray20 = new int[] { 'a', '4' };
        int int21 = org.apache.commons.math.util.MathUtils.distanceInf(intArray17, intArray20);
        int[] intArray24 = new int[] { (byte) 10, 35 };
        int[] intArray31 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int32 = org.apache.commons.math.util.MathUtils.distance1(intArray24, intArray31);
        int int33 = org.apache.commons.math.util.MathUtils.distance1(intArray20, intArray24);
        int int34 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray20);
        int[] intArray37 = new int[] { (-1), 100 };
        int[] intArray40 = new int[] { 'a', '4' };
        int int41 = org.apache.commons.math.util.MathUtils.distanceInf(intArray37, intArray40);
        int[] intArray44 = new int[] { (byte) 10, 35 };
        int[] intArray51 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int52 = org.apache.commons.math.util.MathUtils.distance1(intArray44, intArray51);
        int int53 = org.apache.commons.math.util.MathUtils.distance1(intArray40, intArray44);
        int[] intArray56 = new int[] { (-1), 100 };
        int[] intArray59 = new int[] { 'a', '4' };
        int int60 = org.apache.commons.math.util.MathUtils.distanceInf(intArray56, intArray59);
        int int61 = org.apache.commons.math.util.MathUtils.distanceInf(intArray44, intArray59);
        int[] intArray64 = new int[] { (-1), 100 };
        int[] intArray67 = new int[] { 'a', '4' };
        int int68 = org.apache.commons.math.util.MathUtils.distanceInf(intArray64, intArray67);
        int[] intArray71 = new int[] { (byte) 10, 35 };
        int[] intArray78 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int79 = org.apache.commons.math.util.MathUtils.distance1(intArray71, intArray78);
        int int80 = org.apache.commons.math.util.MathUtils.distance1(intArray67, intArray71);
        int[] intArray83 = new int[] { (-1), 100 };
        int[] intArray86 = new int[] { 'a', '4' };
        int int87 = org.apache.commons.math.util.MathUtils.distanceInf(intArray83, intArray86);
        int int88 = org.apache.commons.math.util.MathUtils.distanceInf(intArray71, intArray86);
        int int89 = org.apache.commons.math.util.MathUtils.distance1(intArray44, intArray86);
        int int90 = org.apache.commons.math.util.MathUtils.distance1(intArray9, intArray44);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 98 + "'", int21 == 98);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 76 + "'", int32 == 76);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 104 + "'", int33 == 104);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 98 + "'", int34 == 98);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 98 + "'", int41 == 98);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 76 + "'", int52 == 76);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 104 + "'", int53 == 104);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 98 + "'", int60 == 98);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 87 + "'", int61 == 87);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 98 + "'", int68 == 98);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 76 + "'", int79 == 76);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 104 + "'", int80 == 104);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 98 + "'", int87 == 98);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 87 + "'", int88 == 87);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 104 + "'", int89 == 104);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 76 + "'", int90 == 76);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        long long2 = org.apache.commons.math.util.MathUtils.gcd((long) (-1074790400), (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (short) 1, (double) 99L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        int int1 = org.apache.commons.math.util.MathUtils.sign(3380);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) 10);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double[] doubleArray17 = new double[] { 100L };
        double double18 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray17);
        double double19 = org.apache.commons.math.util.MathUtils.distance1(doubleArray14, doubleArray17);
        double[] doubleArray21 = new double[] { 100L };
        double double22 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray21);
        int int23 = org.apache.commons.math.util.MathUtils.hash(doubleArray21);
        double[] doubleArray25 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray21, (double) 10);
        double[] doubleArray27 = new double[] { 100L };
        double double28 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray27);
        double[] doubleArray30 = new double[] { 100L };
        double double31 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray30);
        double double32 = org.apache.commons.math.util.MathUtils.distance1(doubleArray27, doubleArray30);
        double[] doubleArray34 = new double[] { 100L };
        double double35 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray34);
        double[] doubleArray37 = new double[] { 100L };
        double double38 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray37);
        double double39 = org.apache.commons.math.util.MathUtils.distance1(doubleArray34, doubleArray37);
        boolean boolean40 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray27, doubleArray37);
        double[] doubleArray42 = new double[] { 100L };
        double double43 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray42);
        int int44 = org.apache.commons.math.util.MathUtils.hash(doubleArray42);
        double[] doubleArray46 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray42, (double) 10);
        double[] doubleArray48 = new double[] { 100L };
        double double49 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray48);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection50 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray48, orderDirection50, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray46, orderDirection50, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray27, orderDirection50, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray21, orderDirection50, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray17, orderDirection50, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection50, false);
        double[] doubleArray64 = new double[] { 100L };
        double double65 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray64);
        int int66 = org.apache.commons.math.util.MathUtils.hash(doubleArray64);
        double[] doubleArray68 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray64, (double) 10);
        boolean boolean69 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray64);
        double[] doubleArray71 = new double[] { 100L };
        double double72 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray71);
        int int73 = org.apache.commons.math.util.MathUtils.hash(doubleArray71);
        double[] doubleArray75 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray71, (double) 10);
        double[] doubleArray77 = new double[] { 100L };
        double double78 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray77);
        int int79 = org.apache.commons.math.util.MathUtils.hash(doubleArray77);
        double[] doubleArray81 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray77, (double) 10);
        boolean boolean82 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray71, doubleArray81);
        double double83 = org.apache.commons.math.util.MathUtils.distance1(doubleArray64, doubleArray81);
        double[] doubleArray85 = new double[] { 100L };
        double double86 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray85);
        double[] doubleArray88 = new double[] { 100L };
        double double89 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray88);
        double double90 = org.apache.commons.math.util.MathUtils.distance1(doubleArray85, doubleArray88);
        double double91 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray85);
        double double92 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray85);
        boolean boolean93 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray64, doubleArray85);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1079574559 + "'", int23 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1079574559 + "'", int44 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection50 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection50.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1079574559 + "'", int66 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 100.0d + "'", double72 == 100.0d);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1079574559 + "'", int73 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 100.0d + "'", double78 == 100.0d);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1079574559 + "'", int79 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 90.0d + "'", double83 == 90.0d);
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 100.0d + "'", double86 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 100.0d + "'", double89 == 100.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 100.0d + "'", double91 == 100.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 100.0d + "'", double92 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.round((double) 32L, 1067909120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: BigInteger would overflow supported range");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 98, (-97), (int) (short) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) (-76), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        int int1 = org.apache.commons.math.util.MathUtils.sign(20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        long long2 = org.apache.commons.math.util.MathUtils.pow(1076101185L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-55145733986879231L) + "'", long2 == (-55145733986879231L));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-35), (int) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo(2.1343363213777176E10d, (double) (-53299563000L), (double) 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) 1076101120, 1.3440585709080678E43d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.775146118562826d + "'", double2 == 4.775146118562826d);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-52L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) (-1067909019));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        double[] doubleArray10 = new double[] { 100L };
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        double double12 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray10);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double[] doubleArray17 = new double[] { 100L };
        double double18 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray17);
        double double19 = org.apache.commons.math.util.MathUtils.distance1(doubleArray14, doubleArray17);
        boolean boolean20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray17);
        boolean boolean21 = org.apache.commons.math.util.MathUtils.equals(doubleArray5, doubleArray7);
        double[] doubleArray23 = new double[] { 100L };
        double double24 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray23);
        double[] doubleArray26 = new double[] { 100L };
        double double27 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray26);
        double double28 = org.apache.commons.math.util.MathUtils.distance1(doubleArray23, doubleArray26);
        double[] doubleArray30 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray23, (double) (short) 100);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray30);
        double double32 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray30);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1048576));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 3211, 2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12844.0d + "'", double2 == 12844.0d);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1079525376);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection3, true);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        double[] doubleArray10 = new double[] { 100L };
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        double double12 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray10);
        double[] doubleArray14 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) (short) 100);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14);
        double[] doubleArray17 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, (double) (-532995630));
        double double18 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray14);
        double[] doubleArray20 = new double[] { 100L };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        double[] doubleArray23 = new double[] { 100L };
        double double24 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray23);
        double double25 = org.apache.commons.math.util.MathUtils.distance1(doubleArray20, doubleArray23);
        double[] doubleArray27 = new double[] { 100L };
        double double28 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray27);
        double[] doubleArray30 = new double[] { 100L };
        double double31 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray30);
        double double32 = org.apache.commons.math.util.MathUtils.distance1(doubleArray27, doubleArray30);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray20, doubleArray30);
        double[] doubleArray35 = new double[] { 100L };
        double double36 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray35);
        int int37 = org.apache.commons.math.util.MathUtils.hash(doubleArray35);
        double double38 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray20, doubleArray35);
        double double39 = org.apache.commons.math.util.MathUtils.distance(doubleArray14, doubleArray35);
        double[] doubleArray41 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, (double) 638583806L);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection3 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection3.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-5.3299563E8d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1079574559 + "'", int37 == 1079574559);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 6.38583806E8d }, 1.0E-15);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        int[] intArray0 = new int[] {};
        int[] intArray3 = new int[] { (-1), 100 };
        int[] intArray6 = new int[] { 'a', '4' };
        int int7 = org.apache.commons.math.util.MathUtils.distanceInf(intArray3, intArray6);
        int[] intArray10 = new int[] { (byte) 10, 35 };
        int[] intArray17 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int18 = org.apache.commons.math.util.MathUtils.distance1(intArray10, intArray17);
        int int19 = org.apache.commons.math.util.MathUtils.distance1(intArray6, intArray10);
        int[] intArray22 = new int[] { (-1), 100 };
        int[] intArray25 = new int[] { 'a', '4' };
        int int26 = org.apache.commons.math.util.MathUtils.distanceInf(intArray22, intArray25);
        int int27 = org.apache.commons.math.util.MathUtils.distanceInf(intArray10, intArray25);
        int[] intArray30 = new int[] { (-1), 100 };
        int[] intArray33 = new int[] { 'a', '4' };
        int int34 = org.apache.commons.math.util.MathUtils.distanceInf(intArray30, intArray33);
        int[] intArray37 = new int[] { (byte) 10, 35 };
        int[] intArray44 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int45 = org.apache.commons.math.util.MathUtils.distance1(intArray37, intArray44);
        int int46 = org.apache.commons.math.util.MathUtils.distance1(intArray33, intArray37);
        int[] intArray49 = new int[] { (-1), 100 };
        int[] intArray52 = new int[] { 'a', '4' };
        int int53 = org.apache.commons.math.util.MathUtils.distanceInf(intArray49, intArray52);
        int int54 = org.apache.commons.math.util.MathUtils.distanceInf(intArray37, intArray52);
        int int55 = org.apache.commons.math.util.MathUtils.distance1(intArray10, intArray52);
        int[] intArray58 = new int[] { (-1), 100 };
        int[] intArray61 = new int[] { 'a', '4' };
        int int62 = org.apache.commons.math.util.MathUtils.distanceInf(intArray58, intArray61);
        int[] intArray65 = new int[] { (byte) 10, 35 };
        int[] intArray72 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int73 = org.apache.commons.math.util.MathUtils.distance1(intArray65, intArray72);
        int int74 = org.apache.commons.math.util.MathUtils.distance1(intArray61, intArray65);
        int[] intArray77 = new int[] { (-1), 100 };
        int[] intArray80 = new int[] { 'a', '4' };
        int int81 = org.apache.commons.math.util.MathUtils.distanceInf(intArray77, intArray80);
        int int82 = org.apache.commons.math.util.MathUtils.distanceInf(intArray65, intArray80);
        double double83 = org.apache.commons.math.util.MathUtils.distance(intArray52, intArray80);
        int[] intArray86 = new int[] { (-1), 100 };
        int[] intArray89 = new int[] { 'a', '4' };
        int int90 = org.apache.commons.math.util.MathUtils.distanceInf(intArray86, intArray89);
        int[] intArray93 = new int[] { (short) 10, '#' };
        double double94 = org.apache.commons.math.util.MathUtils.distance(intArray86, intArray93);
        int int95 = org.apache.commons.math.util.MathUtils.distance1(intArray52, intArray86);
        double double96 = org.apache.commons.math.util.MathUtils.distance(intArray0, intArray86);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 76 + "'", int18 == 76);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 104 + "'", int19 == 104);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 98 + "'", int26 == 98);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 87 + "'", int27 == 87);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 98 + "'", int34 == 98);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 76 + "'", int45 == 76);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 104 + "'", int46 == 104);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 98 + "'", int53 == 98);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 87 + "'", int54 == 87);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 104 + "'", int55 == 104);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 98 + "'", int62 == 98);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 76 + "'", int73 == 76);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 104 + "'", int74 == 104);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 98 + "'", int81 == 98);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 87 + "'", int82 == 87);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 98 + "'", int90 == 98);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertArrayEquals(intArray93, new int[] { 10, 35 });
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 65.92419889539804d + "'", double94 == 65.92419889539804d);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 146 + "'", int95 == 146);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 33);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) 10);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double[] doubleArray17 = new double[] { 100L };
        double double18 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray17);
        double double19 = org.apache.commons.math.util.MathUtils.distance1(doubleArray14, doubleArray17);
        double[] doubleArray21 = new double[] { 100L };
        double double22 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray21);
        double[] doubleArray24 = new double[] { 100L };
        double double25 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray24);
        double double26 = org.apache.commons.math.util.MathUtils.distance1(doubleArray21, doubleArray24);
        boolean boolean27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray14, doubleArray24);
        double[] doubleArray29 = new double[] { 100L };
        double double30 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray29);
        int int31 = org.apache.commons.math.util.MathUtils.hash(doubleArray29);
        double[] doubleArray33 = new double[] { 100L };
        double double34 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray33);
        int int35 = org.apache.commons.math.util.MathUtils.hash(doubleArray33);
        double double36 = org.apache.commons.math.util.MathUtils.distance(doubleArray29, doubleArray33);
        double[] doubleArray38 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray29, 100.0d);
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray14, doubleArray29);
        double double40 = org.apache.commons.math.util.MathUtils.distance1(doubleArray11, doubleArray29);
        double[] doubleArray42 = new double[] { 35 };
        double double43 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray42);
        int int44 = org.apache.commons.math.util.MathUtils.hash(doubleArray42);
        double[] doubleArray46 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray42, 65.92419889539804d);
        boolean boolean47 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1079574559 + "'", int31 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1079574559 + "'", int35 == 1079574559);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 90.0d + "'", double40 == 90.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 35.0d + "'", double43 == 35.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1078034463 + "'", int44 == 1078034463);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 65.92419889539804d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray5 = new int[] { 'a', '4' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray5);
        int[] intArray9 = new int[] { (byte) 10, 35 };
        int[] intArray16 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int17 = org.apache.commons.math.util.MathUtils.distance1(intArray9, intArray16);
        int int18 = org.apache.commons.math.util.MathUtils.distance1(intArray5, intArray9);
        int[] intArray21 = new int[] { (-1), 100 };
        int[] intArray24 = new int[] { 'a', '4' };
        int int25 = org.apache.commons.math.util.MathUtils.distanceInf(intArray21, intArray24);
        int int26 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray24);
        int[] intArray29 = new int[] { (-1), 100 };
        int[] intArray32 = new int[] { 'a', '4' };
        int int33 = org.apache.commons.math.util.MathUtils.distanceInf(intArray29, intArray32);
        int[] intArray36 = new int[] { (byte) 10, 35 };
        int[] intArray43 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int44 = org.apache.commons.math.util.MathUtils.distance1(intArray36, intArray43);
        int int45 = org.apache.commons.math.util.MathUtils.distance1(intArray32, intArray36);
        int[] intArray48 = new int[] { (-1), 100 };
        int[] intArray51 = new int[] { 'a', '4' };
        int int52 = org.apache.commons.math.util.MathUtils.distanceInf(intArray48, intArray51);
        int int53 = org.apache.commons.math.util.MathUtils.distanceInf(intArray36, intArray51);
        int int54 = org.apache.commons.math.util.MathUtils.distance1(intArray9, intArray51);
        int[] intArray57 = new int[] { (-1), 100 };
        int[] intArray60 = new int[] { 'a', '4' };
        int int61 = org.apache.commons.math.util.MathUtils.distanceInf(intArray57, intArray60);
        double double62 = org.apache.commons.math.util.MathUtils.distance(intArray9, intArray60);
        java.lang.Class<?> wildcardClass63 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 76 + "'", int17 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 104 + "'", int18 == 104);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 98 + "'", int25 == 98);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 87 + "'", int26 == 87);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 98 + "'", int33 == 98);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 76 + "'", int44 == 76);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 104 + "'", int45 == 104);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 98 + "'", int52 == 98);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 87 + "'", int53 == 87);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 104 + "'", int54 == 104);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 98 + "'", int61 == 98);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 88.64536084872124d + "'", double62 == 88.64536084872124d);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        boolean boolean3 = false; // flaky "7) test0759(org.apache.commons.math.util.RegressionTest1)": org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-1.0d), (double) (-5), 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = new double[] { 100L };
        double double9 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray11);
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 268435456, (double) 10761012170L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 4042227713L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        boolean boolean3 = false; // flaky "8) test0765(org.apache.commons.math.util.RegressionTest1)": org.apache.commons.math.util.MathUtils.equals((double) (-7953902656989896119L), (double) (-1L), 1067909120);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(10, (-532995630));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        double[] doubleArray10 = new double[] { 100L };
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        double double12 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray10);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double[] doubleArray17 = new double[] { 100L };
        double double18 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray17);
        double double19 = org.apache.commons.math.util.MathUtils.distance1(doubleArray14, doubleArray17);
        boolean boolean20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray17);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        int int24 = org.apache.commons.math.util.MathUtils.hash(doubleArray22);
        double[] doubleArray26 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray22, (double) 10);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection30 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray28, orderDirection30, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray26, orderDirection30, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray7, orderDirection30, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection30, false);
        int int39 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double double40 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1079574559 + "'", int24 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection30 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection30.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1079574559 + "'", int39 == 1079574559);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo(65.92419889539804d, 4.6625078825219655d, (double) 1078034432);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        double[] doubleArray5 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray7 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray5, (double) 1L);
        double[] doubleArray9 = new double[] { 100L };
        double double10 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray9);
        double[] doubleArray12 = new double[] { 100L };
        double double13 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray12);
        double double14 = org.apache.commons.math.util.MathUtils.distance1(doubleArray9, doubleArray12);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        double[] doubleArray19 = new double[] { 100L };
        double double20 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray19);
        double double21 = org.apache.commons.math.util.MathUtils.distance1(doubleArray16, doubleArray19);
        boolean boolean22 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray9, doubleArray19);
        double[] doubleArray24 = new double[] { 100L };
        double double25 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray24);
        int int26 = org.apache.commons.math.util.MathUtils.hash(doubleArray24);
        double[] doubleArray28 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray24, (double) 10);
        double[] doubleArray30 = new double[] { 100L };
        double double31 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray30);
        int int32 = org.apache.commons.math.util.MathUtils.hash(doubleArray30);
        double[] doubleArray34 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray30, (double) 10);
        boolean boolean35 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray24, doubleArray34);
        double[] doubleArray37 = new double[] { 100L };
        double double38 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray37);
        int int39 = org.apache.commons.math.util.MathUtils.hash(doubleArray37);
        double[] doubleArray41 = new double[] { 100L };
        double double42 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray41);
        int int43 = org.apache.commons.math.util.MathUtils.hash(doubleArray41);
        double double44 = org.apache.commons.math.util.MathUtils.distance(doubleArray37, doubleArray41);
        double[] doubleArray46 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray37, 100.0d);
        boolean boolean47 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray34, doubleArray37);
        double[] doubleArray49 = new double[] { 100L };
        double double50 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray49);
        double[] doubleArray52 = new double[] { 100L };
        double double53 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray52);
        double double54 = org.apache.commons.math.util.MathUtils.distance1(doubleArray49, doubleArray52);
        double[] doubleArray56 = new double[] { 100L };
        double double57 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray56);
        double[] doubleArray59 = new double[] { 100L };
        double double60 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray59);
        double double61 = org.apache.commons.math.util.MathUtils.distance1(doubleArray56, doubleArray59);
        boolean boolean62 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray49, doubleArray59);
        double double63 = org.apache.commons.math.util.MathUtils.distance(doubleArray37, doubleArray49);
        boolean boolean64 = org.apache.commons.math.util.MathUtils.equals(doubleArray19, doubleArray49);
        // The following exception was thrown during execution in test generation
        try {
            double double65 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1079574559 + "'", int26 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1079574559 + "'", int32 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1079574559 + "'", int39 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 100.0d + "'", double42 == 100.0d);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1079574559 + "'", int43 == 1079574559);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 100.0d + "'", double57 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 100.0d + "'", double60 == 100.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(97, 99);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(4, 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-16) + "'", int2 == (-16));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-55145733986879231L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) (short) 100);
        double[] doubleArray10 = new double[] { 35 };
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        double double12 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray10);
        double double13 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int14 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 65.0d + "'", double12 == 65.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1079574559 + "'", int14 == 1079574559);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        int int2 = org.apache.commons.math.util.MathUtils.pow(104, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(0.0d, 1894776833);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.0d, (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.53096491487338d + "'", double2 == 100.53096491487338d);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        double[] doubleArray1 = new double[] { 35 };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection6 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray4, orderDirection6, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection6, true);
        double[] doubleArray12 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 3395.0d);
        double[] doubleArray14 = new double[] { 35 };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        boolean boolean16 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray14);
        double[] doubleArray18 = new double[] { 35 };
        double double19 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray18);
        double[] doubleArray21 = new double[] { 100L };
        double double22 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray21);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection23 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray21, orderDirection23, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray18, orderDirection23, true);
        double[] doubleArray29 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray18, 3395.0d);
        double double30 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray18);
        double double31 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray18);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection6 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection6.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 3395.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 35.0d + "'", double19 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection23 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection23.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 3395.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 35.0d + "'", double30 == 35.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 1079001088, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1079001089L + "'", long2 == 1079001089L);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        long long1 = org.apache.commons.math.util.MathUtils.sign((-3319L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = null;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection3, false);
        double double6 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 101);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        boolean boolean3 = false; // flaky "9) test0782(org.apache.commons.math.util.RegressionTest1)": org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (short) 10, (double) 1072693281L, 1079541760);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.894776832824343E9d, 3628800.0d, 4.6218191175889715E18d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm(146, 638583807);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        long long2 = org.apache.commons.math.util.MathUtils.lcm(1079541760L, (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1079541760L + "'", long2 == 1079541760L);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 3395L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) 10);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray14);
        double[] doubleArray18 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, (double) 10);
        double[] doubleArray20 = new double[] { 100L };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        int int22 = org.apache.commons.math.util.MathUtils.hash(doubleArray20);
        double[] doubleArray24 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray20, (double) 10);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray14, doubleArray24);
        double double26 = org.apache.commons.math.util.MathUtils.distance1(doubleArray11, doubleArray24);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double double33 = org.apache.commons.math.util.MathUtils.distance1(doubleArray28, doubleArray31);
        double double34 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray28);
        boolean boolean36 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray28);
        double[] doubleArray38 = new double[] { 100L };
        double double39 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray38);
        int int40 = org.apache.commons.math.util.MathUtils.hash(doubleArray38);
        double[] doubleArray42 = new double[] { 100L };
        double double43 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray42);
        int int44 = org.apache.commons.math.util.MathUtils.hash(doubleArray42);
        double double45 = org.apache.commons.math.util.MathUtils.distance(doubleArray38, doubleArray42);
        double[] doubleArray47 = new double[] { 100L };
        double double48 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray47);
        int int49 = org.apache.commons.math.util.MathUtils.hash(doubleArray47);
        double[] doubleArray51 = new double[] { 100L };
        double double52 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray51);
        int int53 = org.apache.commons.math.util.MathUtils.hash(doubleArray51);
        double double54 = org.apache.commons.math.util.MathUtils.distance(doubleArray47, doubleArray51);
        double[] doubleArray56 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray47, 100.0d);
        double double57 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray42, doubleArray56);
        double[] doubleArray59 = new double[] { 35 };
        double double60 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray59);
        double[] doubleArray62 = new double[] { 100L };
        double double63 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray62);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection64 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray62, orderDirection64, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray59, orderDirection64, true);
        double[] doubleArray74 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray76 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray74, (double) 1L);
        double double77 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray59, doubleArray74);
        double double78 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray74);
        double double79 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray42, doubleArray74);
        double double80 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray11, doubleArray74);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1079574559 + "'", int16 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1079574559 + "'", int22 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1079574559 + "'", int40 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1079574559 + "'", int44 == 1079574559);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1079574559 + "'", int49 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1079574559 + "'", int53 == 1079574559);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 35.0d + "'", double60 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 100.0d + "'", double63 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection64 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection64.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 106.88779163215975d + "'", double78 == 106.88779163215975d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 65.0d + "'", double79 == 65.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 25.0d + "'", double80 == 25.0d);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialLog((-76));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(0, 1894776833);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1894776833) + "'", int2 == (-1894776833));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((-3.7984319505695826E18d), 650889.3870174974d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.133871366144E12d, (-0.0d));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo(100.53096491487338d, (double) 20, (double) (-1986817512439808L));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 2L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1073741824 + "'", int1 == 1073741824);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(1076101120);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial(1100758016);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: factorial value is too large to fit in a long");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        double double2 = org.apache.commons.math.util.MathUtils.round((double) 0L, 1072693247);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow(1L, (-803937719));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        long long2 = org.apache.commons.math.util.MathUtils.pow(32L, (long) 87);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) 1079541760);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle(0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1);
        double double4 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-16), (-34));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-2614362513533383839L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        int int2 = org.apache.commons.math.util.MathUtils.pow(10, 1079574528);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) (byte) -1, 1100758016L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1100758017L) + "'", long2 == (-1100758017L));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(2.134336531441605E10d, (double) (-100L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        int int2 = org.apache.commons.math.util.MathUtils.pow(0, 9036866128227814273L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-53299563000L), 3104);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        long long2 = org.apache.commons.math.util.MathUtils.lcm((long) (-532995532), (long) 803937754);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 214247615444057564L + "'", long2 == 214247615444057564L);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, 638583807);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigInteger2);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(22639.925120280288d, 3.562596044395821E10d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (short) 0, (double) 214247615444057564L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1067909120));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) 1079574528L, 132);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, (-35));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(bigInteger2);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        boolean boolean9 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray7);
        double double10 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray12 = new double[] { 35 };
        double double13 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray12);
        double[] doubleArray15 = new double[] { 100L };
        double double16 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray15);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection17 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray15, orderDirection17, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray12, orderDirection17, true);
        double[] doubleArray27 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray29 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray27, (double) 1L);
        double double30 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray12, doubleArray27);
        double double31 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray12);
        double double32 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray12);
        double[] doubleArray34 = new double[] { 100L };
        double double35 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray34);
        int int36 = org.apache.commons.math.util.MathUtils.hash(doubleArray34);
        double[] doubleArray38 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray34, (double) 10);
        double[] doubleArray40 = new double[] { 100L };
        double double41 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray40);
        int int42 = org.apache.commons.math.util.MathUtils.hash(doubleArray40);
        double[] doubleArray44 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray40, (double) 10);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray34, doubleArray44);
        double[] doubleArray47 = new double[] { 100L };
        double double48 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray47);
        int int49 = org.apache.commons.math.util.MathUtils.hash(doubleArray47);
        double[] doubleArray51 = new double[] { 100L };
        double double52 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray51);
        int int53 = org.apache.commons.math.util.MathUtils.hash(doubleArray51);
        double double54 = org.apache.commons.math.util.MathUtils.distance(doubleArray47, doubleArray51);
        double[] doubleArray56 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray47, 100.0d);
        boolean boolean57 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray44, doubleArray47);
        double[] doubleArray59 = new double[] { 100L };
        double double60 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray59);
        double[] doubleArray62 = new double[] { 100L };
        double double63 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray62);
        double double64 = org.apache.commons.math.util.MathUtils.distance1(doubleArray59, doubleArray62);
        double[] doubleArray66 = new double[] { 100L };
        double double67 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray66);
        double[] doubleArray69 = new double[] { 100L };
        double double70 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray69);
        double double71 = org.apache.commons.math.util.MathUtils.distance1(doubleArray66, doubleArray69);
        boolean boolean72 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray59, doubleArray69);
        double double73 = org.apache.commons.math.util.MathUtils.distance(doubleArray47, doubleArray59);
        double double74 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray59);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection17 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection17.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 35.0d + "'", double31 == 35.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 65.0d + "'", double32 == 65.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1079574559 + "'", int36 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1079574559 + "'", int42 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1079574559 + "'", int49 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1079574559 + "'", int53 == 1079574559);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 100.0d + "'", double60 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 100.0d + "'", double63 == 100.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 100.0d + "'", double67 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 100.0d + "'", double70 == 100.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 99, (long) 101);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 200L + "'", long2 == 200L);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        int int2 = org.apache.commons.math.util.MathUtils.pow((-1894776833), 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-759169023) + "'", int2 == (-759169023));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection3, true);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        double[] doubleArray10 = new double[] { 100L };
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        double double12 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray10);
        double[] doubleArray14 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) (short) 100);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14);
        double[] doubleArray17 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, (double) (-532995630));
        double double18 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray14);
        double[] doubleArray20 = new double[] { 35 };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        double[] doubleArray23 = new double[] { 100L };
        double double24 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray23);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection25 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray23, orderDirection25, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray20, orderDirection25, true);
        double[] doubleArray35 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray37 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray35, (double) 1L);
        double double38 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray20, doubleArray35);
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray35);
        double double40 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection3 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection3.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-5.3299563E8d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection25 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection25.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 97, (double) 101);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 532995727L, 132);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.9019047606769016E48d + "'", double2 == 2.9019047606769016E48d);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        int int2 = org.apache.commons.math.util.MathUtils.pow((-34), 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(1073741824, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) (-55145733986879231L), (double) 2147450880);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((-532995532), (int) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        boolean boolean3 = false; // flaky "10) test0826(org.apache.commons.math.util.RegressionTest1)": org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) Float.NaN, (double) (-1611030093), 1079574528);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1074790324), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1074790324) + "'", int2 == (-1074790324));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(1.3440585709080678E43d, (-152.0d), 0.0d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientDouble(4, 1100758016);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(1078034463, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        long long1 = org.apache.commons.math.util.MathUtils.sign(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (-1986817512439808L));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (-97));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (-1074790303));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-1.0d) + "'", double1 == (-1.0d));
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        long long2 = org.apache.commons.math.util.MathUtils.gcd((long) (short) 100, (long) 132);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-1413573307), (-1413573307));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1413573307 + "'", int2 == 1413573307);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) 10);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray14);
        double[] doubleArray18 = new double[] { 100L };
        double double19 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray18);
        int int20 = org.apache.commons.math.util.MathUtils.hash(doubleArray18);
        double double21 = org.apache.commons.math.util.MathUtils.distance(doubleArray14, doubleArray18);
        double[] doubleArray23 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, 100.0d);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray11, doubleArray14);
        double[] doubleArray26 = new double[] { 100L };
        double double27 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray26);
        double[] doubleArray29 = new double[] { 100L };
        double double30 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray29);
        double double31 = org.apache.commons.math.util.MathUtils.distance1(doubleArray26, doubleArray29);
        double[] doubleArray33 = new double[] { 100L };
        double double34 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray33);
        double[] doubleArray36 = new double[] { 100L };
        double double37 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray36);
        double double38 = org.apache.commons.math.util.MathUtils.distance1(doubleArray33, doubleArray36);
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray26, doubleArray36);
        double double40 = org.apache.commons.math.util.MathUtils.distance(doubleArray14, doubleArray26);
        double[] doubleArray42 = new double[] { 100L };
        double double43 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray42);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection44 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray42, orderDirection44, true);
        double[] doubleArray48 = new double[] { 100L };
        double double49 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray48);
        double[] doubleArray51 = new double[] { 100L };
        double double52 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray51);
        double double53 = org.apache.commons.math.util.MathUtils.distance1(doubleArray48, doubleArray51);
        double[] doubleArray55 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray48, (double) (short) 100);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray55);
        double[] doubleArray58 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray55, (double) (-532995630));
        double double59 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray42, doubleArray55);
        double[] doubleArray61 = new double[] { 35 };
        double double62 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray61);
        double[] doubleArray64 = new double[] { 100L };
        double double65 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray64);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection66 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray64, orderDirection66, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray61, orderDirection66, true);
        double[] doubleArray76 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray78 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray76, (double) 1L);
        double double79 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray61, doubleArray76);
        boolean boolean80 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray42, doubleArray76);
        boolean boolean81 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray14, doubleArray76);
        double[] doubleArray83 = new double[] { 100L };
        double double84 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray83);
        int int85 = org.apache.commons.math.util.MathUtils.hash(doubleArray83);
        double[] doubleArray87 = new double[] { 100L };
        double double88 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray87);
        int int89 = org.apache.commons.math.util.MathUtils.hash(doubleArray87);
        double double90 = org.apache.commons.math.util.MathUtils.distance(doubleArray83, doubleArray87);
        double[] doubleArray92 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray83, 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double93 = org.apache.commons.math.util.MathUtils.distance1(doubleArray76, doubleArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1079574559 + "'", int16 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1079574559 + "'", int20 == 1079574559);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection44 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection44.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { (-5.3299563E8d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 35.0d + "'", double62 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection66 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection66.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 0.0d + "'", double79 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 100.0d + "'", double84 == 100.0d);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1079574559 + "'", int85 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 100.0d + "'", double88 == 100.0d);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1079574559 + "'", int89 == 1079574559);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertArrayEquals(doubleArray92, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        boolean boolean3 = false; // flaky "11) test0838(org.apache.commons.math.util.RegressionTest1)": org.apache.commons.math.util.MathUtils.equals(1.0d, (double) (-3798431950569582479L), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.pow((-1), (long) (-532995630));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-532995532), (-759169023));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 226173491 + "'", int2 == 226173491);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        long long2 = org.apache.commons.math.util.MathUtils.pow(1100758016L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        int int1 = org.apache.commons.math.util.MathUtils.indicator(65);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) 1067909120, (long) 1413573307);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1509567826333859840L + "'", long2 == 1509567826333859840L);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(2147450880, 1079525376);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49152 + "'", int2 == 49152);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        int int13 = org.apache.commons.math.util.MathUtils.hash(doubleArray11);
        double double14 = org.apache.commons.math.util.MathUtils.distance(doubleArray7, doubleArray11);
        double[] doubleArray16 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, 100.0d);
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        double[] doubleArray19 = new double[] { 100L };
        double double20 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray19);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        double double24 = org.apache.commons.math.util.MathUtils.distance1(doubleArray19, doubleArray22);
        double[] doubleArray26 = new double[] { 100L };
        double double27 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray26);
        double[] doubleArray29 = new double[] { 100L };
        double double30 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray29);
        double double31 = org.apache.commons.math.util.MathUtils.distance1(doubleArray26, doubleArray29);
        boolean boolean32 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray19, doubleArray29);
        double[] doubleArray34 = new double[] { 100L };
        double double35 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray34);
        double[] doubleArray37 = new double[] { 100L };
        double double38 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray37);
        double double39 = org.apache.commons.math.util.MathUtils.distance1(doubleArray34, doubleArray37);
        double[] doubleArray41 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray34, (double) (short) 100);
        double double42 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray29, doubleArray34);
        boolean boolean43 = org.apache.commons.math.util.MathUtils.equals(doubleArray7, doubleArray29);
        double[] doubleArray45 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) (-532995727));
        boolean boolean46 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray45);
        double double47 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray45);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1079574559 + "'", int13 == 1079574559);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { (-5.32995727E8d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 5.32995727E8d + "'", double47 == 5.32995727E8d);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((-97));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1074790400), (-1072693116));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm(1074790407, 1072693248);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 20);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) (-1067909120));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 1079574559);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (-97), 803937754);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-2.6319286950690004E-164d) + "'", double2 == (-2.6319286950690004E-164d));
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        double[] doubleArray10 = new double[] { 100L };
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        double double12 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray10);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double[] doubleArray17 = new double[] { 100L };
        double double18 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray17);
        double double19 = org.apache.commons.math.util.MathUtils.distance1(doubleArray14, doubleArray17);
        boolean boolean20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray17);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        int int24 = org.apache.commons.math.util.MathUtils.hash(doubleArray22);
        double[] doubleArray26 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray22, (double) 10);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection30 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray28, orderDirection30, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray26, orderDirection30, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray7, orderDirection30, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection30, false);
        java.lang.Class<?> wildcardClass39 = orderDirection30.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1079574559 + "'", int24 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection30 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection30.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        boolean boolean3 = false; // flaky "12) test0854(org.apache.commons.math.util.RegressionTest1)": org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 200L, (double) 0.0f, 1413573307);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray5 = new int[] { 'a', '4' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray5);
        int[] intArray9 = new int[] { (byte) 10, 35 };
        int[] intArray16 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int17 = org.apache.commons.math.util.MathUtils.distance1(intArray9, intArray16);
        int int18 = org.apache.commons.math.util.MathUtils.distance1(intArray5, intArray9);
        int[] intArray21 = new int[] { (-1), 100 };
        int[] intArray24 = new int[] { 'a', '4' };
        int int25 = org.apache.commons.math.util.MathUtils.distanceInf(intArray21, intArray24);
        int int26 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray24);
        int[] intArray29 = new int[] { (-1), 100 };
        int[] intArray32 = new int[] { 'a', '4' };
        int int33 = org.apache.commons.math.util.MathUtils.distanceInf(intArray29, intArray32);
        int[] intArray36 = new int[] { (byte) 10, 35 };
        int[] intArray43 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int44 = org.apache.commons.math.util.MathUtils.distance1(intArray36, intArray43);
        int int45 = org.apache.commons.math.util.MathUtils.distance1(intArray32, intArray36);
        int[] intArray48 = new int[] { (-1), 100 };
        int[] intArray51 = new int[] { 'a', '4' };
        int int52 = org.apache.commons.math.util.MathUtils.distanceInf(intArray48, intArray51);
        int int53 = org.apache.commons.math.util.MathUtils.distanceInf(intArray36, intArray51);
        int[] intArray56 = new int[] { (-1), 100 };
        int[] intArray59 = new int[] { 'a', '4' };
        int int60 = org.apache.commons.math.util.MathUtils.distanceInf(intArray56, intArray59);
        int[] intArray63 = new int[] { (byte) 10, 35 };
        int[] intArray70 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int71 = org.apache.commons.math.util.MathUtils.distance1(intArray63, intArray70);
        int int72 = org.apache.commons.math.util.MathUtils.distance1(intArray59, intArray63);
        int[] intArray75 = new int[] { (-1), 100 };
        int[] intArray78 = new int[] { 'a', '4' };
        int int79 = org.apache.commons.math.util.MathUtils.distanceInf(intArray75, intArray78);
        int int80 = org.apache.commons.math.util.MathUtils.distanceInf(intArray63, intArray78);
        int int81 = org.apache.commons.math.util.MathUtils.distance1(intArray36, intArray78);
        int int82 = org.apache.commons.math.util.MathUtils.distanceInf(intArray24, intArray78);
        int[] intArray85 = new int[] { (-1), 100 };
        int[] intArray88 = new int[] { 'a', '4' };
        int int89 = org.apache.commons.math.util.MathUtils.distanceInf(intArray85, intArray88);
        int[] intArray92 = new int[] { (-1), 100 };
        int[] intArray95 = new int[] { 'a', '4' };
        int int96 = org.apache.commons.math.util.MathUtils.distanceInf(intArray92, intArray95);
        int int97 = org.apache.commons.math.util.MathUtils.distance1(intArray85, intArray92);
        double double98 = org.apache.commons.math.util.MathUtils.distance(intArray78, intArray92);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 76 + "'", int17 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 104 + "'", int18 == 104);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 98 + "'", int25 == 98);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 87 + "'", int26 == 87);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 98 + "'", int33 == 98);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 76 + "'", int44 == 76);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 104 + "'", int45 == 104);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 98 + "'", int52 == 98);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 87 + "'", int53 == 87);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 98 + "'", int60 == 98);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 76 + "'", int71 == 76);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 104 + "'", int72 == 104);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 98 + "'", int79 == 98);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 87 + "'", int80 == 87);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 104 + "'", int81 == 104);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 98 + "'", int89 == 98);
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertArrayEquals(intArray92, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertArrayEquals(intArray95, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 98 + "'", int96 == 98);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 109.12378292562992d + "'", double98 == 109.12378292562992d);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        boolean boolean3 = false; // flaky "13) test0856(org.apache.commons.math.util.RegressionTest1)": org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) ' ', (double) (short) 10, (-759169023));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        int int2 = org.apache.commons.math.util.MathUtils.pow((-35), 49152);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1187053567) + "'", int2 == (-1187053567));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((double) 1079541760L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck((-97), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-87) + "'", int2 == (-87));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient(132, (-1074790324));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = new double[] { 100L };
        double double9 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray11);
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        int int18 = org.apache.commons.math.util.MathUtils.hash(doubleArray16);
        double[] doubleArray20 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray16, (double) 10);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection24 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray22, orderDirection24, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray20, orderDirection24, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection24, true);
        double[] doubleArray32 = new double[] { 100L };
        double double33 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray32);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection34 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray32, orderDirection34, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection34, true);
        double[] doubleArray40 = new double[] { 100L };
        double double41 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray40);
        int int42 = org.apache.commons.math.util.MathUtils.hash(doubleArray40);
        double[] doubleArray44 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray40, (double) 10);
        double[] doubleArray46 = new double[] { 100L };
        double double47 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray46);
        int int48 = org.apache.commons.math.util.MathUtils.hash(doubleArray46);
        double[] doubleArray50 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray46, (double) 10);
        boolean boolean51 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray40, doubleArray50);
        double[] doubleArray53 = new double[] { 100L };
        double double54 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray53);
        int int55 = org.apache.commons.math.util.MathUtils.hash(doubleArray53);
        double[] doubleArray57 = new double[] { 100L };
        double double58 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray57);
        int int59 = org.apache.commons.math.util.MathUtils.hash(doubleArray57);
        double double60 = org.apache.commons.math.util.MathUtils.distance(doubleArray53, doubleArray57);
        double[] doubleArray62 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray53, 100.0d);
        boolean boolean63 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray50, doubleArray53);
        double double64 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray53);
        double double65 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray53);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1079574559 + "'", int18 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection24 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection24.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection34 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection34.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1079574559 + "'", int42 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1079574559 + "'", int48 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 100.0d + "'", double54 == 100.0d);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1079574559 + "'", int55 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 100.0d + "'", double58 == 100.0d);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1079574559 + "'", int59 == 1079574559);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 100.0d + "'", double65 == 100.0d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((long) 1413573307, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1413573317L + "'", long2 == 1413573317L);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(268435456, 3104);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 1894776833, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1894776823L + "'", long2 == 1894776823L);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog((int) '#', 1072693144);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 1100758016L, (double) 1079541760L, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        int[] intArray0 = null;
        int[] intArray3 = new int[] { (-1), 100 };
        int[] intArray6 = new int[] { 'a', '4' };
        int int7 = org.apache.commons.math.util.MathUtils.distanceInf(intArray3, intArray6);
        int[] intArray10 = new int[] { (byte) 10, 35 };
        int[] intArray17 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int18 = org.apache.commons.math.util.MathUtils.distance1(intArray10, intArray17);
        int int19 = org.apache.commons.math.util.MathUtils.distance1(intArray6, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = org.apache.commons.math.util.MathUtils.distance1(intArray0, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 76 + "'", int18 == 76);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 104 + "'", int19 == 104);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(2, (-76));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 1079574528, (double) (byte) 10, 2.134336531441605E10d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) (-1067909120), 1.894776833E9d, (double) (-1043344512));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        int int2 = org.apache.commons.math.util.MathUtils.gcd(65, (-16));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(635.6341670092748d, (-1078034397));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.18402236762003E13d + "'", double2 == 2.18402236762003E13d);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm(803937754, 1100758016);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, 97);
        java.math.BigInteger bigInteger5 = null;
        java.math.BigInteger bigInteger7 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, (long) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger8 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger7);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(0.9302899837493896d, (double) 1894776823L, (double) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        double double1 = org.apache.commons.math.util.MathUtils.factorialDouble(1072693144);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals(Double.NaN, 100.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.lcm(574587745814872154L, (-55145733986879231L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        double[] doubleArray0 = null;
        int int1 = org.apache.commons.math.util.MathUtils.hash(doubleArray0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck((long) 226173491, (long) (-34));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 226173525L + "'", long2 == 226173525L);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) (-5L), 2147450880, (-1413573307));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) 10);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray14);
        double[] doubleArray18 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, (double) 10);
        double[] doubleArray20 = new double[] { 100L };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        int int22 = org.apache.commons.math.util.MathUtils.hash(doubleArray20);
        double[] doubleArray24 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray20, (double) 10);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray14, doubleArray24);
        double double26 = org.apache.commons.math.util.MathUtils.distance1(doubleArray11, doubleArray24);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double double33 = org.apache.commons.math.util.MathUtils.distance1(doubleArray28, doubleArray31);
        double double34 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray28);
        boolean boolean36 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray28);
        double[] doubleArray38 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray11, (double) 3201);
        double[] doubleArray40 = new double[] { 100L };
        double double41 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray40);
        int int42 = org.apache.commons.math.util.MathUtils.hash(doubleArray40);
        double[] doubleArray44 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray40, (double) 10);
        double[] doubleArray46 = new double[] { 100L };
        double double47 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray46);
        boolean boolean48 = org.apache.commons.math.util.MathUtils.equals(doubleArray40, doubleArray46);
        double double49 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray40);
        double[] doubleArray51 = new double[] { 35 };
        double double52 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray51);
        double[] doubleArray54 = new double[] { 100L };
        double double55 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray54);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection56 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray54, orderDirection56, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray51, orderDirection56, true);
        double[] doubleArray66 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray68 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray66, (double) 1L);
        double double69 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray51, doubleArray66);
        double double70 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray51);
        double double71 = org.apache.commons.math.util.MathUtils.distance(doubleArray40, doubleArray51);
        boolean boolean72 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray38, doubleArray40);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1079574559 + "'", int16 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1079574559 + "'", int22 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 3201.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1079574559 + "'", int42 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 35.0d + "'", double52 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection56 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection56.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 35.0d + "'", double70 == 35.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 65.0d + "'", double71 == 65.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = new double[] { 100L };
        double double9 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        int int10 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        double[] doubleArray12 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray8, (double) 10);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double[] doubleArray17 = new double[] { 100L };
        double double18 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray17);
        double double19 = org.apache.commons.math.util.MathUtils.distance1(doubleArray14, doubleArray17);
        double[] doubleArray21 = new double[] { 100L };
        double double22 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray21);
        double[] doubleArray24 = new double[] { 100L };
        double double25 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray24);
        double double26 = org.apache.commons.math.util.MathUtils.distance1(doubleArray21, doubleArray24);
        boolean boolean27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray14, doubleArray24);
        double[] doubleArray29 = new double[] { 100L };
        double double30 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray29);
        int int31 = org.apache.commons.math.util.MathUtils.hash(doubleArray29);
        double[] doubleArray33 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray29, (double) 10);
        double[] doubleArray35 = new double[] { 100L };
        double double36 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray35);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection37 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray35, orderDirection37, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray33, orderDirection37, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection37, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection37, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray4, orderDirection37, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1079574559 + "'", int10 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1079574559 + "'", int31 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection37 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection37.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1, (-1048576));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.math.util.MathUtils.factorial((-1611030093));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 1072693281);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1364195328 + "'", int1 == 1364195328);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) 10);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double[] doubleArray17 = new double[] { 100L };
        double double18 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray17);
        double double19 = org.apache.commons.math.util.MathUtils.distance1(doubleArray14, doubleArray17);
        double[] doubleArray21 = new double[] { 100L };
        double double22 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray21);
        double[] doubleArray24 = new double[] { 100L };
        double double25 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray24);
        double double26 = org.apache.commons.math.util.MathUtils.distance1(doubleArray21, doubleArray24);
        boolean boolean27 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray14, doubleArray24);
        double[] doubleArray29 = new double[] { 100L };
        double double30 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray29);
        int int31 = org.apache.commons.math.util.MathUtils.hash(doubleArray29);
        double[] doubleArray33 = new double[] { 100L };
        double double34 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray33);
        int int35 = org.apache.commons.math.util.MathUtils.hash(doubleArray33);
        double double36 = org.apache.commons.math.util.MathUtils.distance(doubleArray29, doubleArray33);
        double[] doubleArray38 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray29, 100.0d);
        boolean boolean39 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray14, doubleArray29);
        double double40 = org.apache.commons.math.util.MathUtils.distance1(doubleArray11, doubleArray29);
        double[] doubleArray42 = new double[] { 100L };
        double double43 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray42);
        int int44 = org.apache.commons.math.util.MathUtils.hash(doubleArray42);
        double[] doubleArray46 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray42, (double) 10);
        double[] doubleArray48 = new double[] { 100L };
        double double49 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray48);
        int int50 = org.apache.commons.math.util.MathUtils.hash(doubleArray48);
        double[] doubleArray52 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray48, (double) 10);
        boolean boolean53 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray42, doubleArray52);
        double[] doubleArray55 = new double[] { 100L };
        double double56 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray55);
        int int57 = org.apache.commons.math.util.MathUtils.hash(doubleArray55);
        double[] doubleArray59 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray55, (double) 10);
        double[] doubleArray61 = new double[] { 100L };
        double double62 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray61);
        int int63 = org.apache.commons.math.util.MathUtils.hash(doubleArray61);
        double[] doubleArray65 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray61, (double) 10);
        boolean boolean66 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray55, doubleArray65);
        double double67 = org.apache.commons.math.util.MathUtils.distance1(doubleArray52, doubleArray65);
        double[] doubleArray69 = new double[] { 100L };
        double double70 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray69);
        double[] doubleArray72 = new double[] { 100L };
        double double73 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray72);
        double double74 = org.apache.commons.math.util.MathUtils.distance1(doubleArray69, doubleArray72);
        double double75 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray69);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray69);
        boolean boolean77 = org.apache.commons.math.util.MathUtils.equals(doubleArray52, doubleArray69);
        double[] doubleArray79 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray52, (double) 3201);
        double double80 = org.apache.commons.math.util.MathUtils.distance(doubleArray29, doubleArray79);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1079574559 + "'", int31 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1079574559 + "'", int35 == 1079574559);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 90.0d + "'", double40 == 90.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1079574559 + "'", int44 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 100.0d + "'", double49 == 100.0d);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1079574559 + "'", int50 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1079574559 + "'", int57 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1079574559 + "'", int63 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 0.0d + "'", double67 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 100.0d + "'", double70 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 100.0d + "'", double73 == 100.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 100.0d + "'", double75 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] { 3201.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 3101.0d + "'", double80 == 3101.0d);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        long long2 = org.apache.commons.math.util.MathUtils.lcm(37731206205L, (long) 638583807);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8031512433696974145L + "'", long2 == 8031512433696974145L);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 1078034564);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(1072693248, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1072693151 + "'", int2 == 1072693151);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        long long1 = org.apache.commons.math.util.MathUtils.sign(3395L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        long long2 = org.apache.commons.math.util.MathUtils.lcm(0L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck(2147450880, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        long long1 = org.apache.commons.math.util.MathUtils.sign((long) 132);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        boolean boolean9 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray7);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double double16 = org.apache.commons.math.util.MathUtils.distance1(doubleArray11, doubleArray14);
        double[] doubleArray18 = new double[] { 100L };
        double double19 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray18);
        double[] doubleArray21 = new double[] { 100L };
        double double22 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray21);
        double double23 = org.apache.commons.math.util.MathUtils.distance1(doubleArray18, doubleArray21);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray11, doubleArray21);
        double[] doubleArray26 = new double[] { 100L };
        double double27 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray26);
        double[] doubleArray29 = new double[] { 100L };
        double double30 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray29);
        double double31 = org.apache.commons.math.util.MathUtils.distance1(doubleArray26, doubleArray29);
        double[] doubleArray33 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray26, (double) (short) 100);
        double double34 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray21, doubleArray26);
        boolean boolean35 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray21);
        double[] doubleArray37 = new double[] { 100L };
        double double38 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray37);
        int int39 = org.apache.commons.math.util.MathUtils.hash(doubleArray37);
        double[] doubleArray41 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray37, (double) 10);
        double[] doubleArray43 = new double[] { 100L };
        double double44 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray43);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equals(doubleArray37, doubleArray43);
        double double46 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray37);
        double[] doubleArray48 = new double[] { 35 };
        double double49 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray48);
        double[] doubleArray51 = new double[] { 100L };
        double double52 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray51);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection53 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray51, orderDirection53, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray48, orderDirection53, true);
        double[] doubleArray63 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray65 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray63, (double) 1L);
        double double66 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray48, doubleArray63);
        double double67 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray48);
        double double68 = org.apache.commons.math.util.MathUtils.distance(doubleArray37, doubleArray48);
        boolean boolean69 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray48);
        java.lang.Class<?> wildcardClass70 = doubleArray48.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1079574559 + "'", int39 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 35.0d + "'", double49 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection53 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection53.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 35.0d + "'", double67 == 35.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 65.0d + "'", double68 == 65.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray5 = new int[] { 'a', '4' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray5);
        int[] intArray9 = new int[] { (-1), 100 };
        int[] intArray12 = new int[] { 'a', '4' };
        int int13 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray12);
        int int14 = org.apache.commons.math.util.MathUtils.distance1(intArray2, intArray9);
        int[] intArray17 = new int[] { (-1), 100 };
        int[] intArray20 = new int[] { 'a', '4' };
        int int21 = org.apache.commons.math.util.MathUtils.distanceInf(intArray17, intArray20);
        int[] intArray24 = new int[] { (-1), 100 };
        int[] intArray27 = new int[] { 'a', '4' };
        int int28 = org.apache.commons.math.util.MathUtils.distanceInf(intArray24, intArray27);
        int int29 = org.apache.commons.math.util.MathUtils.distance1(intArray17, intArray24);
        int[] intArray32 = new int[] { (-1), 100 };
        int[] intArray35 = new int[] { 'a', '4' };
        int int36 = org.apache.commons.math.util.MathUtils.distanceInf(intArray32, intArray35);
        int[] intArray39 = new int[] { (-1), 100 };
        int[] intArray42 = new int[] { 'a', '4' };
        int int43 = org.apache.commons.math.util.MathUtils.distanceInf(intArray39, intArray42);
        int[] intArray46 = new int[] { (-1), 100 };
        int[] intArray49 = new int[] { 'a', '4' };
        int int50 = org.apache.commons.math.util.MathUtils.distanceInf(intArray46, intArray49);
        int int51 = org.apache.commons.math.util.MathUtils.distance1(intArray39, intArray46);
        int[] intArray54 = new int[] { (-1), 100 };
        int[] intArray57 = new int[] { 'a', '4' };
        int int58 = org.apache.commons.math.util.MathUtils.distanceInf(intArray54, intArray57);
        int[] intArray61 = new int[] { (byte) 10, 35 };
        int[] intArray68 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int69 = org.apache.commons.math.util.MathUtils.distance1(intArray61, intArray68);
        int int70 = org.apache.commons.math.util.MathUtils.distance1(intArray57, intArray61);
        int int71 = org.apache.commons.math.util.MathUtils.distanceInf(intArray46, intArray57);
        double double72 = org.apache.commons.math.util.MathUtils.distance(intArray35, intArray57);
        int int73 = org.apache.commons.math.util.MathUtils.distance1(intArray24, intArray35);
        int int74 = org.apache.commons.math.util.MathUtils.distance1(intArray2, intArray24);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 98 + "'", int21 == 98);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 98 + "'", int28 == 98);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 98 + "'", int36 == 98);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 98 + "'", int43 == 98);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 98 + "'", int50 == 98);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 98 + "'", int58 == 98);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 76 + "'", int69 == 76);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 104 + "'", int70 == 104);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 98 + "'", int71 == 98);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 146 + "'", int73 == 146);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 49152, 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        long long2 = org.apache.commons.math.util.MathUtils.lcm(0L, (-52L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        short short1 = org.apache.commons.math.util.MathUtils.sign((short) -1);
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -1 + "'", short1 == (short) -1);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        double double2 = org.apache.commons.math.util.MathUtils.round(0.0d, (-1074790324));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        double double2 = org.apache.commons.math.util.MathUtils.log((double) (-1074790303), 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 2L, (double) (-55145733986879231L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-5.514573398687924E16d) + "'", double2 == (-5.514573398687924E16d));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) (short) 100);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray8);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double double16 = org.apache.commons.math.util.MathUtils.distance1(doubleArray11, doubleArray14);
        double[] doubleArray18 = new double[] { 100L };
        double double19 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray18);
        int int20 = org.apache.commons.math.util.MathUtils.hash(doubleArray18);
        double[] doubleArray22 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray18, (double) 10);
        double[] doubleArray24 = new double[] { 100L };
        double double25 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray24);
        double[] doubleArray27 = new double[] { 100L };
        double double28 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray27);
        double double29 = org.apache.commons.math.util.MathUtils.distance1(doubleArray24, doubleArray27);
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double[] doubleArray34 = new double[] { 100L };
        double double35 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray34);
        double double36 = org.apache.commons.math.util.MathUtils.distance1(doubleArray31, doubleArray34);
        boolean boolean37 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray24, doubleArray34);
        double[] doubleArray39 = new double[] { 100L };
        double double40 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray39);
        int int41 = org.apache.commons.math.util.MathUtils.hash(doubleArray39);
        double[] doubleArray43 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray39, (double) 10);
        double[] doubleArray45 = new double[] { 100L };
        double double46 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray45);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection47 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray45, orderDirection47, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray43, orderDirection47, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray24, orderDirection47, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray18, orderDirection47, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14, orderDirection47, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray8, orderDirection47, true);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1079574559 + "'", int20 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1079574559 + "'", int41 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection47 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection47.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray5 = new int[] { 'a', '4' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray5);
        int[] intArray9 = new int[] { (-1), 100 };
        int[] intArray12 = new int[] { 'a', '4' };
        int int13 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray12);
        int[] intArray16 = new int[] { (byte) 10, 35 };
        int[] intArray23 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int24 = org.apache.commons.math.util.MathUtils.distance1(intArray16, intArray23);
        int int25 = org.apache.commons.math.util.MathUtils.distance1(intArray12, intArray16);
        int int26 = org.apache.commons.math.util.MathUtils.distanceInf(intArray5, intArray16);
        int[] intArray29 = new int[] { (-1), 100 };
        int[] intArray32 = new int[] { 'a', '4' };
        int int33 = org.apache.commons.math.util.MathUtils.distanceInf(intArray29, intArray32);
        int[] intArray36 = new int[] { (byte) 10, 35 };
        int[] intArray43 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int44 = org.apache.commons.math.util.MathUtils.distance1(intArray36, intArray43);
        int int45 = org.apache.commons.math.util.MathUtils.distance1(intArray32, intArray36);
        int[] intArray48 = new int[] { (-1), 100 };
        int[] intArray51 = new int[] { 'a', '4' };
        int int52 = org.apache.commons.math.util.MathUtils.distanceInf(intArray48, intArray51);
        int int53 = org.apache.commons.math.util.MathUtils.distanceInf(intArray36, intArray51);
        int int54 = org.apache.commons.math.util.MathUtils.distance1(intArray16, intArray51);
        int[] intArray57 = new int[] { (-1), 100 };
        int[] intArray60 = new int[] { 'a', '4' };
        int int61 = org.apache.commons.math.util.MathUtils.distanceInf(intArray57, intArray60);
        int[] intArray64 = new int[] { (-1), 100 };
        int[] intArray67 = new int[] { 'a', '4' };
        int int68 = org.apache.commons.math.util.MathUtils.distanceInf(intArray64, intArray67);
        int int69 = org.apache.commons.math.util.MathUtils.distance1(intArray57, intArray64);
        int[] intArray72 = new int[] { (-1), 100 };
        int[] intArray75 = new int[] { 'a', '4' };
        int int76 = org.apache.commons.math.util.MathUtils.distanceInf(intArray72, intArray75);
        int[] intArray79 = new int[] { (byte) 10, 35 };
        int[] intArray86 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int87 = org.apache.commons.math.util.MathUtils.distance1(intArray79, intArray86);
        int int88 = org.apache.commons.math.util.MathUtils.distance1(intArray75, intArray79);
        int int89 = org.apache.commons.math.util.MathUtils.distanceInf(intArray64, intArray75);
        int int90 = org.apache.commons.math.util.MathUtils.distanceInf(intArray51, intArray64);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 98 + "'", int13 == 98);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 76 + "'", int24 == 76);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 104 + "'", int25 == 104);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 87 + "'", int26 == 87);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 98 + "'", int33 == 98);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 76 + "'", int44 == 76);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 104 + "'", int45 == 104);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 98 + "'", int52 == 98);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 87 + "'", int53 == 87);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 104 + "'", int54 == 104);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 98 + "'", int61 == 98);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 98 + "'", int68 == 98);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 98 + "'", int76 == 98);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 76 + "'", int87 == 76);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 104 + "'", int88 == 104);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 98 + "'", int89 == 98);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 98 + "'", int90 == 98);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (-87), (double) 7766279631452241920L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 1078034463, 1067909120, 1072693281);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((-1100758017L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-1L) + "'", long1 == (-1L));
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 1072693281);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) (short) 0, 0, 1104139136);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = new double[] { 100L };
        double double9 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray11);
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray17 = new double[] { 35 };
        double double18 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray17);
        double[] doubleArray20 = new double[] { 100L };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection22 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray20, orderDirection22, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray17, orderDirection22, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection22, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection22 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection22.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.lcm(33, 1078034432);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 35);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.mulAndCheck((-1074790324), 1078034564);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: mul");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection3 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection3, true);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        double[] doubleArray10 = new double[] { 100L };
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        double double12 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray10);
        double[] doubleArray14 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) (short) 100);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray14);
        double[] doubleArray17 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, (double) (-532995630));
        double double18 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray14);
        double[] doubleArray20 = new double[] { 100L };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        double[] doubleArray23 = new double[] { 100L };
        double double24 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray23);
        double double25 = org.apache.commons.math.util.MathUtils.distance1(doubleArray20, doubleArray23);
        double[] doubleArray27 = new double[] { 100L };
        double double28 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray27);
        double[] doubleArray30 = new double[] { 100L };
        double double31 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray30);
        double double32 = org.apache.commons.math.util.MathUtils.distance1(doubleArray27, doubleArray30);
        boolean boolean33 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray20, doubleArray30);
        double[] doubleArray35 = new double[] { 100L };
        double double36 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray35);
        int int37 = org.apache.commons.math.util.MathUtils.hash(doubleArray35);
        double double38 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray20, doubleArray35);
        double double39 = org.apache.commons.math.util.MathUtils.distance(doubleArray14, doubleArray35);
        double double40 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection3 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection3.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-5.3299563E8d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1079574559 + "'", int37 == 1079574559);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) (-803937719));
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.lcm((long) ' ', (-2614362513533383839L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1078034463, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1078034463L + "'", long2 == 1078034463L);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        long long2 = org.apache.commons.math.util.MathUtils.pow((long) 1072693282, (long) 98);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        double double1 = org.apache.commons.math.util.MathUtils.cosh(3.1780538303479458d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 12.020833333333336d + "'", double1 == 12.020833333333336d);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 1079525376, 2147450880);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.079525376E9d + "'", double2 == 1.079525376E9d);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        long long1 = org.apache.commons.math.util.MathUtils.indicator((long) 65);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(97, 440923534);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 440923631 + "'", int2 == 440923631);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math.util.MathUtils.round((double) 52.1f, (-1048576), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid rounding mode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        int int2 = org.apache.commons.math.util.MathUtils.pow((int) (byte) 1, 9036866128227814273L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) 1078034463L, 4.775146118562826d, (double) 5548);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(9.619275968248924E151d, (int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.332136766617982E167d + "'", double2 == 4.332136766617982E167d);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) 9123042065252004905L, 3201);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.453771155132106E-251d + "'", double2 == 3.453771155132106E-251d);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(1.894776832824343E9d, 76.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) (short) 100);
        double[] doubleArray10 = new double[] { 35 };
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        double double12 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray10);
        double double13 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 65.0d + "'", double12 == 65.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        double double2 = org.apache.commons.math.util.MathUtils.scalb((double) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        long long2 = org.apache.commons.math.util.MathUtils.pow(3395L, 7766279631452241920L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2241292757211545601L + "'", long2 == 2241292757211545601L);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        boolean boolean9 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray7);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double double16 = org.apache.commons.math.util.MathUtils.distance1(doubleArray11, doubleArray14);
        double[] doubleArray18 = new double[] { 100L };
        double double19 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray18);
        double[] doubleArray21 = new double[] { 100L };
        double double22 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray21);
        double double23 = org.apache.commons.math.util.MathUtils.distance1(doubleArray18, doubleArray21);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray11, doubleArray21);
        double[] doubleArray26 = new double[] { 100L };
        double double27 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray26);
        double[] doubleArray29 = new double[] { 100L };
        double double30 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray29);
        double double31 = org.apache.commons.math.util.MathUtils.distance1(doubleArray26, doubleArray29);
        double[] doubleArray33 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray26, (double) (short) 100);
        double double34 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray21, doubleArray26);
        boolean boolean35 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray21);
        double[] doubleArray37 = new double[] { 100L };
        double double38 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray37);
        int int39 = org.apache.commons.math.util.MathUtils.hash(doubleArray37);
        double[] doubleArray41 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray37, (double) 10);
        double[] doubleArray43 = new double[] { 100L };
        double double44 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray43);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equals(doubleArray37, doubleArray43);
        double double46 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray37);
        double[] doubleArray48 = new double[] { 35 };
        double double49 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray48);
        double[] doubleArray51 = new double[] { 100L };
        double double52 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray51);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection53 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray51, orderDirection53, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray48, orderDirection53, true);
        double[] doubleArray63 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray65 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray63, (double) 1L);
        double double66 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray48, doubleArray63);
        double double67 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray48);
        double double68 = org.apache.commons.math.util.MathUtils.distance(doubleArray37, doubleArray48);
        boolean boolean69 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray48);
        double[] doubleArray71 = new double[] { 35 };
        double double72 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray71);
        double[] doubleArray74 = new double[] { 100L };
        double double75 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray74);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection76 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray74, orderDirection76, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray71, orderDirection76, true);
        double[] doubleArray86 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray88 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray86, (double) 1L);
        double double89 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray71, doubleArray86);
        double double90 = org.apache.commons.math.util.MathUtils.distance1(doubleArray48, doubleArray86);
        int int91 = org.apache.commons.math.util.MathUtils.hash(doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1079574559 + "'", int39 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 35.0d + "'", double49 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection53 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection53.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 35.0d + "'", double67 == 35.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 65.0d + "'", double68 == 65.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 35.0d + "'", double72 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 100.0d + "'", double75 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection76 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection76.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertArrayEquals(doubleArray88, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1078034463 + "'", int91 == 1078034463);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) 226173491);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        int int1 = org.apache.commons.math.util.MathUtils.hash((double) 1630474681);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 798510020 + "'", int1 == 798510020);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        int int2 = org.apache.commons.math.util.MathUtils.pow(1413573307, 4L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1721638031) + "'", int2 == (-1721638031));
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        double double2 = org.apache.commons.math.util.MathUtils.normalizeAngle((double) 1072693248, 78.76851654052734d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 80.67924332618713d + "'", double2 == 80.67924332618713d);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        long long2 = org.apache.commons.math.util.MathUtils.lcm(2L, (long) 1079574559);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2159149118L + "'", long2 == 2159149118L);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 0L);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.math.util.MathUtils.factorialDouble((-1721638031));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, 97);
        java.math.BigInteger bigInteger5 = null;
        java.math.BigInteger bigInteger7 = org.apache.commons.math.util.MathUtils.pow(bigInteger5, (long) 0);
        java.math.BigInteger bigInteger9 = org.apache.commons.math.util.MathUtils.pow(bigInteger7, 97);
        java.math.BigInteger bigInteger10 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, bigInteger9);
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger12 = org.apache.commons.math.util.MathUtils.pow(bigInteger10, (-16));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        int int1 = org.apache.commons.math.util.MathUtils.sign(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        double double2 = org.apache.commons.math.util.MathUtils.binomialCoefficientLog(101, (-16));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.math.BigInteger bigInteger0 = null;
        java.math.BigInteger bigInteger2 = org.apache.commons.math.util.MathUtils.pow(bigInteger0, (long) 0);
        java.math.BigInteger bigInteger4 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, 97);
        java.math.BigInteger bigInteger6 = org.apache.commons.math.util.MathUtils.pow(bigInteger2, 1072693144);
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger6);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        int int1 = org.apache.commons.math.util.MathUtils.hash(2.18402236762003E13d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2070612641) + "'", int1 == (-2070612641));
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        double double1 = org.apache.commons.math.util.MathUtils.sinh((-152.0d));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + (-5.149099138580496E65d) + "'", double1 == (-5.149099138580496E65d));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        long long1 = org.apache.commons.math.util.MathUtils.sign(1072693281L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        float float1 = org.apache.commons.math.util.MathUtils.sign((float) 440923534);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 1.0f + "'", float1 == 1.0f);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.math.util.MathUtils.round((float) 195, 35, 1079574528);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck(532995727L, 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 532995729L + "'", long2 == 532995729L);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) (-76));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 5.074001940569444E32d + "'", double1 == 5.074001940569444E32d);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        double double2 = org.apache.commons.math.util.MathUtils.round(1.12837387616256E15d, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.12837387616256E15d + "'", double2 == 1.12837387616256E15d);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals((double) 1076101120, (double) 1894776823L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray5 = new int[] { 'a', '4' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray5);
        int[] intArray9 = new int[] { (short) 10, '#' };
        double double10 = org.apache.commons.math.util.MathUtils.distance(intArray2, intArray9);
        int[] intArray13 = new int[] { (-1), 100 };
        int[] intArray16 = new int[] { 'a', '4' };
        int int17 = org.apache.commons.math.util.MathUtils.distanceInf(intArray13, intArray16);
        int[] intArray20 = new int[] { (byte) 10, 35 };
        int[] intArray27 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int28 = org.apache.commons.math.util.MathUtils.distance1(intArray20, intArray27);
        int int29 = org.apache.commons.math.util.MathUtils.distance1(intArray16, intArray20);
        int[] intArray32 = new int[] { (-1), 100 };
        int[] intArray35 = new int[] { 'a', '4' };
        int int36 = org.apache.commons.math.util.MathUtils.distanceInf(intArray32, intArray35);
        int[] intArray39 = new int[] { (byte) 10, 35 };
        int[] intArray46 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int47 = org.apache.commons.math.util.MathUtils.distance1(intArray39, intArray46);
        int int48 = org.apache.commons.math.util.MathUtils.distance1(intArray35, intArray39);
        int[] intArray51 = new int[] { (-1), 100 };
        int[] intArray54 = new int[] { 'a', '4' };
        int int55 = org.apache.commons.math.util.MathUtils.distanceInf(intArray51, intArray54);
        int int56 = org.apache.commons.math.util.MathUtils.distanceInf(intArray39, intArray54);
        double double57 = org.apache.commons.math.util.MathUtils.distance(intArray20, intArray54);
        double double58 = org.apache.commons.math.util.MathUtils.distance(intArray2, intArray54);
        int[] intArray61 = new int[] { (byte) 10, 35 };
        int[] intArray68 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int69 = org.apache.commons.math.util.MathUtils.distance1(intArray61, intArray68);
        int[] intArray72 = new int[] { (-1), 100 };
        int[] intArray75 = new int[] { 'a', '4' };
        int int76 = org.apache.commons.math.util.MathUtils.distanceInf(intArray72, intArray75);
        int[] intArray79 = new int[] { (short) 10, '#' };
        double double80 = org.apache.commons.math.util.MathUtils.distance(intArray72, intArray79);
        double double81 = org.apache.commons.math.util.MathUtils.distance(intArray61, intArray72);
        int int82 = org.apache.commons.math.util.MathUtils.distance1(intArray54, intArray61);
        int[] intArray83 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int84 = org.apache.commons.math.util.MathUtils.distance1(intArray54, intArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 35 });
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 65.92419889539804d + "'", double10 == 65.92419889539804d);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 98 + "'", int17 == 98);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 76 + "'", int28 == 76);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 104 + "'", int29 == 104);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 98 + "'", int36 == 98);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 76 + "'", int47 == 76);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 104 + "'", int48 == 104);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 98 + "'", int55 == 98);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 87 + "'", int56 == 87);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 88.64536084872124d + "'", double57 == 88.64536084872124d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 109.12378292562992d + "'", double58 == 109.12378292562992d);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 76 + "'", int69 == 76);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 98 + "'", int76 == 98);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { 10, 35 });
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 65.92419889539804d + "'", double80 == 65.92419889539804d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 65.92419889539804d + "'", double81 == 65.92419889539804d);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 104 + "'", int82 == 104);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        double double2 = org.apache.commons.math.util.MathUtils.scalb(0.9302899837493896d, (-1611030093));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.25403790299545E130d + "'", double2 == 8.25403790299545E130d);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(97, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        double double6 = org.apache.commons.math.util.MathUtils.distance1(doubleArray1, doubleArray4);
        double[] doubleArray8 = new double[] { 100L };
        double double9 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray8);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double double13 = org.apache.commons.math.util.MathUtils.distance1(doubleArray8, doubleArray11);
        boolean boolean14 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray16 = new double[] { 100L };
        double double17 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray16);
        double[] doubleArray19 = new double[] { 100L };
        double double20 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray19);
        double double21 = org.apache.commons.math.util.MathUtils.distance1(doubleArray16, doubleArray19);
        double[] doubleArray23 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray16, (double) (short) 100);
        double double24 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray11, doubleArray16);
        double[] doubleArray26 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray16, 3395.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 3395.0d }, 1.0E-15);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck((long) (-1067909120), (-574587745814872064L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck(98, (-532995532));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 532995630 + "'", int2 == 532995630);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo(3628800.0d, 80.67924332618713d, (double) 1072693282);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        long long2 = org.apache.commons.math.util.MathUtils.subAndCheck(1076101185L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1076101150L + "'", long2 == 1076101150L);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        int int1 = org.apache.commons.math.util.MathUtils.sign(1072693151);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 100L };
        double double3 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray2);
        double[] doubleArray5 = new double[] { 100L };
        double double6 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray5);
        double double7 = org.apache.commons.math.util.MathUtils.distance1(doubleArray2, doubleArray5);
        double[] doubleArray9 = new double[] { 100L };
        double double10 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray9);
        double[] doubleArray12 = new double[] { 100L };
        double double13 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray12);
        double double14 = org.apache.commons.math.util.MathUtils.distance1(doubleArray9, doubleArray12);
        boolean boolean15 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray2, doubleArray12);
        double[] doubleArray17 = new double[] { 100L };
        double double18 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray17);
        int int19 = org.apache.commons.math.util.MathUtils.hash(doubleArray17);
        double[] doubleArray21 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray17, (double) 10);
        double[] doubleArray23 = new double[] { 100L };
        double double24 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray23);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection25 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray23, orderDirection25, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray21, orderDirection25, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray2, orderDirection25, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.util.MathUtils.checkOrder(doubleArray0, orderDirection25, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1079574559 + "'", int19 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection25 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection25.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((-1611030093), (int) (short) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        double[] doubleArray10 = new double[] { 100L };
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        double double12 = org.apache.commons.math.util.MathUtils.distance1(doubleArray7, doubleArray10);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double[] doubleArray17 = new double[] { 100L };
        double double18 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray17);
        double double19 = org.apache.commons.math.util.MathUtils.distance1(doubleArray14, doubleArray17);
        boolean boolean20 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray17);
        double[] doubleArray22 = new double[] { 100L };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        int int24 = org.apache.commons.math.util.MathUtils.hash(doubleArray22);
        double[] doubleArray26 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray22, (double) 10);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection30 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray28, orderDirection30, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray26, orderDirection30, false);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray7, orderDirection30, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection30, false);
        int int39 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        java.lang.Class<?> wildcardClass40 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1079574559 + "'", int24 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection30 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection30.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1079574559 + "'", int39 == 1079574559);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) (short) -1, (double) 5548, (-1.1752011936438014d));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        int int2 = org.apache.commons.math.util.MathUtils.gcd((-87), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        int int1 = org.apache.commons.math.util.MathUtils.indicator((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.math.util.MathUtils.pow((-1894776833), (-1074790400));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.binomialCoefficient((int) (short) -1, 76);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) 10);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray11);
        double[] doubleArray15 = new double[] { 100L };
        double double16 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray15);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection17 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray15, orderDirection17, true);
        double[] doubleArray21 = new double[] { 100L };
        double double22 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray21);
        double[] doubleArray24 = new double[] { 100L };
        double double25 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray24);
        double double26 = org.apache.commons.math.util.MathUtils.distance1(doubleArray21, doubleArray24);
        double[] doubleArray28 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray21, (double) (short) 100);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray28);
        double[] doubleArray31 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray28, (double) (-532995630));
        double double32 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray15, doubleArray28);
        double[] doubleArray34 = new double[] { 100L };
        double double35 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray34);
        double[] doubleArray37 = new double[] { 100L };
        double double38 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray37);
        double double39 = org.apache.commons.math.util.MathUtils.distance1(doubleArray34, doubleArray37);
        double[] doubleArray41 = new double[] { 100L };
        double double42 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray41);
        double[] doubleArray44 = new double[] { 100L };
        double double45 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray44);
        double double46 = org.apache.commons.math.util.MathUtils.distance1(doubleArray41, doubleArray44);
        boolean boolean47 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray34, doubleArray44);
        double[] doubleArray49 = new double[] { 100L };
        double double50 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray49);
        int int51 = org.apache.commons.math.util.MathUtils.hash(doubleArray49);
        double double52 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray34, doubleArray49);
        double double53 = org.apache.commons.math.util.MathUtils.distance(doubleArray28, doubleArray49);
        boolean boolean54 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray11, doubleArray28);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection17 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection17.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { (-5.3299563E8d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 100.0d + "'", double35 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 100.0d + "'", double42 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1079574559 + "'", int51 == 1079574559);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        double double1 = org.apache.commons.math.util.MathUtils.cosh((double) 1894776833);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 100L };
        double double3 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray2);
        double[] doubleArray5 = new double[] { 100L };
        double double6 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray5);
        double double7 = org.apache.commons.math.util.MathUtils.distance1(doubleArray2, doubleArray5);
        double[] doubleArray9 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray2, (double) (short) 100);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray9);
        double[] doubleArray12 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray9, (double) 1078034463);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray0, doubleArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.078034463E9d }, 1.0E-15);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 7.7662794E18f, (double) 33.0f, (double) 33);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equals(88.64536084872124d, 1500.1792766138647d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        // The following exception was thrown during execution in test generation
        try {
            long long2 = org.apache.commons.math.util.MathUtils.lcm((long) 1079525376, 214247615444057564L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: overflow: multiply");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        int int3 = org.apache.commons.math.util.MathUtils.compareTo((double) 32L, Double.POSITIVE_INFINITY, 100.53096491487338d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        double double1 = org.apache.commons.math.util.MathUtils.indicator(1.12837387616256E15d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        boolean boolean2 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) Float.NaN, (double) 1079574528);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        float float1 = org.apache.commons.math.util.MathUtils.indicator((float) (short) -1);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        long long2 = org.apache.commons.math.util.MathUtils.addAndCheck((-55145733986879231L), (long) 1079574528);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-55145732907304703L) + "'", long2 == (-55145732907304703L));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        double double1 = org.apache.commons.math.util.MathUtils.sign((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0d + "'", double1 == 1.0d);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) (-2614362513533383839L), (double) 1073741824, 1.9155040003582885E22d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        int int2 = org.apache.commons.math.util.MathUtils.addAndCheck(1413573307, (-1894776833));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-481203526) + "'", int2 == (-481203526));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = new double[] { 100L };
        double double6 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray5);
        int int7 = org.apache.commons.math.util.MathUtils.hash(doubleArray5);
        double double8 = org.apache.commons.math.util.MathUtils.distance(doubleArray1, doubleArray5);
        double[] doubleArray10 = new double[] { 100L };
        double double11 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray10);
        int int12 = org.apache.commons.math.util.MathUtils.hash(doubleArray10);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray14);
        double double17 = org.apache.commons.math.util.MathUtils.distance(doubleArray10, doubleArray14);
        double[] doubleArray19 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray10, 100.0d);
        double double20 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray5, doubleArray19);
        double[] doubleArray22 = new double[] { 35 };
        double double23 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray22);
        double[] doubleArray25 = new double[] { 100L };
        double double26 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray25);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection27 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray25, orderDirection27, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray22, orderDirection27, true);
        double[] doubleArray37 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray39 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray37, (double) 1L);
        double double40 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray22, doubleArray37);
        double double41 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray37);
        double double42 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray5, doubleArray37);
        java.lang.Class<?> wildcardClass43 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1079574559 + "'", int7 == 1079574559);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1079574559 + "'", int12 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1079574559 + "'", int16 == 1079574559);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 35.0d + "'", double23 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection27 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection27.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 106.88779163215975d + "'", double41 == 106.88779163215975d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 65.0d + "'", double42 == 65.0d);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        int[] intArray2 = new int[] { (-1), 100 };
        int[] intArray5 = new int[] { 'a', '4' };
        int int6 = org.apache.commons.math.util.MathUtils.distanceInf(intArray2, intArray5);
        int[] intArray9 = new int[] { (byte) 10, 35 };
        int[] intArray16 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int17 = org.apache.commons.math.util.MathUtils.distance1(intArray9, intArray16);
        int int18 = org.apache.commons.math.util.MathUtils.distance1(intArray5, intArray9);
        int[] intArray21 = new int[] { (-1), 100 };
        int[] intArray24 = new int[] { 'a', '4' };
        int int25 = org.apache.commons.math.util.MathUtils.distanceInf(intArray21, intArray24);
        int int26 = org.apache.commons.math.util.MathUtils.distanceInf(intArray9, intArray24);
        int[] intArray29 = new int[] { (-1), 100 };
        int[] intArray32 = new int[] { 'a', '4' };
        int int33 = org.apache.commons.math.util.MathUtils.distanceInf(intArray29, intArray32);
        int[] intArray36 = new int[] { (byte) 10, 35 };
        int[] intArray43 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int44 = org.apache.commons.math.util.MathUtils.distance1(intArray36, intArray43);
        int int45 = org.apache.commons.math.util.MathUtils.distance1(intArray32, intArray36);
        int[] intArray48 = new int[] { (-1), 100 };
        int[] intArray51 = new int[] { 'a', '4' };
        int int52 = org.apache.commons.math.util.MathUtils.distanceInf(intArray48, intArray51);
        int int53 = org.apache.commons.math.util.MathUtils.distanceInf(intArray36, intArray51);
        int[] intArray56 = new int[] { (-1), 100 };
        int[] intArray59 = new int[] { 'a', '4' };
        int int60 = org.apache.commons.math.util.MathUtils.distanceInf(intArray56, intArray59);
        int[] intArray63 = new int[] { (byte) 10, 35 };
        int[] intArray70 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int71 = org.apache.commons.math.util.MathUtils.distance1(intArray63, intArray70);
        int int72 = org.apache.commons.math.util.MathUtils.distance1(intArray59, intArray63);
        int[] intArray75 = new int[] { (-1), 100 };
        int[] intArray78 = new int[] { 'a', '4' };
        int int79 = org.apache.commons.math.util.MathUtils.distanceInf(intArray75, intArray78);
        int int80 = org.apache.commons.math.util.MathUtils.distanceInf(intArray63, intArray78);
        int int81 = org.apache.commons.math.util.MathUtils.distance1(intArray36, intArray78);
        int int82 = org.apache.commons.math.util.MathUtils.distanceInf(intArray24, intArray78);
        int[] intArray85 = new int[] { (-1), 100 };
        int[] intArray88 = new int[] { 'a', '4' };
        int int89 = org.apache.commons.math.util.MathUtils.distanceInf(intArray85, intArray88);
        int[] intArray92 = new int[] { (short) 10, '#' };
        double double93 = org.apache.commons.math.util.MathUtils.distance(intArray85, intArray92);
        int int94 = org.apache.commons.math.util.MathUtils.distanceInf(intArray78, intArray92);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 98 + "'", int6 == 98);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 76 + "'", int17 == 76);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 104 + "'", int18 == 104);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 98 + "'", int25 == 98);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 87 + "'", int26 == 87);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 98 + "'", int33 == 98);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 76 + "'", int44 == 76);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 104 + "'", int45 == 104);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 98 + "'", int52 == 98);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 87 + "'", int53 == 87);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 98 + "'", int60 == 98);
        org.junit.Assert.assertNotNull(intArray63);
        org.junit.Assert.assertArrayEquals(intArray63, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 76 + "'", int71 == 76);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 104 + "'", int72 == 104);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 98 + "'", int79 == 98);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 87 + "'", int80 == 87);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 104 + "'", int81 == 104);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 98 + "'", int89 == 98);
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertArrayEquals(intArray92, new int[] { 10, 35 });
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 65.92419889539804d + "'", double93 == 65.92419889539804d);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 87 + "'", int94 == 87);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        int int9 = org.apache.commons.math.util.MathUtils.hash(doubleArray7);
        double[] doubleArray11 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray7, (double) 10);
        boolean boolean12 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray1, doubleArray11);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        int int16 = org.apache.commons.math.util.MathUtils.hash(doubleArray14);
        double[] doubleArray18 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray14, (double) 10);
        double[] doubleArray20 = new double[] { 100L };
        double double21 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray20);
        int int22 = org.apache.commons.math.util.MathUtils.hash(doubleArray20);
        double[] doubleArray24 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray20, (double) 10);
        boolean boolean25 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray14, doubleArray24);
        double double26 = org.apache.commons.math.util.MathUtils.distance1(doubleArray11, doubleArray24);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double double33 = org.apache.commons.math.util.MathUtils.distance1(doubleArray28, doubleArray31);
        double double34 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray28);
        boolean boolean36 = org.apache.commons.math.util.MathUtils.equals(doubleArray11, doubleArray28);
        double[] doubleArray38 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray11, (double) 3201);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray38);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1079574559 + "'", int9 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1079574559 + "'", int16 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1079574559 + "'", int22 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 100.0d + "'", double34 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 3201.0d }, 1.0E-15);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        int int2 = org.apache.commons.math.util.MathUtils.pow(1364195328, (long) 1364195328);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equals((double) 1078034432L, 9.619275968248924E151d, 5.074001940569444E32d);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        int int2 = org.apache.commons.math.util.MathUtils.lcm(4, 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 404 + "'", int2 == 404);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray2 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray0, (double) 532995727L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        double[] doubleArray1 = new double[] { 35 };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection6 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray4, orderDirection6, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection6, true);
        double[] doubleArray12 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, 3395.0d);
        double double13 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray12);
        double double14 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection6 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection6.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 3395.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 3395.0d + "'", double13 == 3395.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 3395.0d + "'", double14 == 3395.0d);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 1894776833, 92.13617560368711d, (double) (-97));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        float float2 = org.apache.commons.math.util.MathUtils.round((float) (-35), 195);
        org.junit.Assert.assertTrue(Float.isNaN(float2));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        boolean boolean3 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN((double) 1100758016, (double) 1079541760, (double) 798510020);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        double[] doubleArray1 = new double[] { 35 };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        double[] doubleArray4 = new double[] { 100L };
        double double5 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray4);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection6 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray4, orderDirection6, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray1, orderDirection6, true);
        double[] doubleArray16 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray18 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray16, (double) 1L);
        double double19 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray1, doubleArray16);
        double[] doubleArray21 = new double[] { 100L };
        double double22 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray21);
        double[] doubleArray24 = new double[] { 100L };
        double double25 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray24);
        double double26 = org.apache.commons.math.util.MathUtils.distance1(doubleArray21, doubleArray24);
        double[] doubleArray28 = new double[] { 100L };
        double double29 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray28);
        double[] doubleArray31 = new double[] { 100L };
        double double32 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray31);
        double double33 = org.apache.commons.math.util.MathUtils.distance1(doubleArray28, doubleArray31);
        boolean boolean34 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray21, doubleArray31);
        double[] doubleArray36 = new double[] { 100L };
        double double37 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray36);
        double[] doubleArray39 = new double[] { 100L };
        double double40 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray39);
        double double41 = org.apache.commons.math.util.MathUtils.distance1(doubleArray36, doubleArray39);
        double[] doubleArray43 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray36, (double) (short) 100);
        double double44 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray31, doubleArray36);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equals(doubleArray16, doubleArray36);
        int int46 = org.apache.commons.math.util.MathUtils.hash(doubleArray36);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection6 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection6.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1079574559 + "'", int46 == 1079574559);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        int int2 = org.apache.commons.math.util.MathUtils.subAndCheck((-1067909120), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1067909120) + "'", int2 == (-1067909120));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        long long2 = org.apache.commons.math.util.MathUtils.mulAndCheck(0L, (long) 440923631);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        int[] intArray0 = null;
        int[] intArray3 = new int[] { (-1), 100 };
        int[] intArray6 = new int[] { 'a', '4' };
        int int7 = org.apache.commons.math.util.MathUtils.distanceInf(intArray3, intArray6);
        int[] intArray10 = new int[] { (-1), 100 };
        int[] intArray13 = new int[] { 'a', '4' };
        int int14 = org.apache.commons.math.util.MathUtils.distanceInf(intArray10, intArray13);
        int[] intArray17 = new int[] { (byte) 10, 35 };
        int[] intArray24 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int25 = org.apache.commons.math.util.MathUtils.distance1(intArray17, intArray24);
        int int26 = org.apache.commons.math.util.MathUtils.distance1(intArray13, intArray17);
        int int27 = org.apache.commons.math.util.MathUtils.distanceInf(intArray6, intArray17);
        int[] intArray30 = new int[] { (-1), 100 };
        int[] intArray33 = new int[] { 'a', '4' };
        int int34 = org.apache.commons.math.util.MathUtils.distanceInf(intArray30, intArray33);
        int[] intArray37 = new int[] { (byte) 10, 35 };
        int[] intArray44 = new int[] { (-1), 100, 10, (short) 1, (short) 100, 35 };
        int int45 = org.apache.commons.math.util.MathUtils.distance1(intArray37, intArray44);
        int int46 = org.apache.commons.math.util.MathUtils.distance1(intArray33, intArray37);
        double double47 = org.apache.commons.math.util.MathUtils.distance(intArray6, intArray37);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = org.apache.commons.math.util.MathUtils.distanceInf(intArray0, intArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 76 + "'", int25 == 76);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 104 + "'", int26 == 104);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 87 + "'", int27 == 87);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1), 100 });
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 97, 52 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 98 + "'", int34 == 98);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 10, 35 });
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-1), 100, 10, 1, 100, 35 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 76 + "'", int45 == 76);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 104 + "'", int46 == 104);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 88.64536084872124d + "'", double47 == 88.64536084872124d);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        double[] doubleArray1 = new double[] { 100L };
        double double2 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray1);
        int int3 = org.apache.commons.math.util.MathUtils.hash(doubleArray1);
        double[] doubleArray5 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray1, (double) 10);
        double[] doubleArray7 = new double[] { 100L };
        double double8 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray7);
        boolean boolean9 = org.apache.commons.math.util.MathUtils.equals(doubleArray1, doubleArray7);
        double[] doubleArray11 = new double[] { 100L };
        double double12 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray11);
        double[] doubleArray14 = new double[] { 100L };
        double double15 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray14);
        double double16 = org.apache.commons.math.util.MathUtils.distance1(doubleArray11, doubleArray14);
        double[] doubleArray18 = new double[] { 100L };
        double double19 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray18);
        double[] doubleArray21 = new double[] { 100L };
        double double22 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray21);
        double double23 = org.apache.commons.math.util.MathUtils.distance1(doubleArray18, doubleArray21);
        boolean boolean24 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray11, doubleArray21);
        double[] doubleArray26 = new double[] { 100L };
        double double27 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray26);
        double[] doubleArray29 = new double[] { 100L };
        double double30 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray29);
        double double31 = org.apache.commons.math.util.MathUtils.distance1(doubleArray26, doubleArray29);
        double[] doubleArray33 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray26, (double) (short) 100);
        double double34 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray21, doubleArray26);
        boolean boolean35 = org.apache.commons.math.util.MathUtils.equalsIncludingNaN(doubleArray7, doubleArray21);
        double[] doubleArray37 = new double[] { 100L };
        double double38 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray37);
        int int39 = org.apache.commons.math.util.MathUtils.hash(doubleArray37);
        double[] doubleArray41 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray37, (double) 10);
        double[] doubleArray43 = new double[] { 100L };
        double double44 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray43);
        boolean boolean45 = org.apache.commons.math.util.MathUtils.equals(doubleArray37, doubleArray43);
        double double46 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray37);
        double[] doubleArray48 = new double[] { 35 };
        double double49 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray48);
        double[] doubleArray51 = new double[] { 100L };
        double double52 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray51);
        org.apache.commons.math.util.MathUtils.OrderDirection orderDirection53 = org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING;
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray51, orderDirection53, true);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray48, orderDirection53, true);
        double[] doubleArray63 = new double[] { '#', (byte) 0, 100L, 10.0d, 10.0d };
        double[] doubleArray65 = org.apache.commons.math.util.MathUtils.normalizeArray(doubleArray63, (double) 1L);
        double double66 = org.apache.commons.math.util.MathUtils.distanceInf(doubleArray48, doubleArray63);
        double double67 = org.apache.commons.math.util.MathUtils.safeNorm(doubleArray48);
        double double68 = org.apache.commons.math.util.MathUtils.distance(doubleArray37, doubleArray48);
        boolean boolean69 = org.apache.commons.math.util.MathUtils.equals(doubleArray21, doubleArray48);
        org.apache.commons.math.util.MathUtils.checkOrder(doubleArray48);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1079574559 + "'", int3 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 100.0d + "'", double38 == 100.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1079574559 + "'", int39 == 1079574559);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 35.0d + "'", double49 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
        org.junit.Assert.assertTrue("'" + orderDirection53 + "' != '" + org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING + "'", orderDirection53.equals(org.apache.commons.math.util.MathUtils.OrderDirection.DECREASING));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 35.0d, 0.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 0.22580645161290322d, 0.0d, 0.6451612903225806d, 0.06451612903225806d, 0.06451612903225806d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 35.0d + "'", double67 == 35.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 65.0d + "'", double68 == 65.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }
}
