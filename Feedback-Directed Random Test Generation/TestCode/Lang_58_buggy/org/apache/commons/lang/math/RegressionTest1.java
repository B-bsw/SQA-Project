package org.apache.commons.lang.math;

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
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (-1L), (float) (byte) 100, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) -1, (long) (-1), 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, 32, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) (byte) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) '4', 97.0d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) -1, (long) 97, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 100, (double) 35.0f, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 10.0f, (double) 1L, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 1, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(1L, (long) (short) 100, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(97, 0, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 100, (float) (short) 0, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(1.0f, 32.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double double10 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double11 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double[] doubleArray12 = null;
        double[] doubleArray17 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray21 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray17);
        double[] doubleArray28 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray32 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray32);
        double double34 = org.apache.commons.lang.math.NumberUtils.min(doubleArray28);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray28);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray28);
        java.lang.Class<?> wildcardClass37 = doubleArray28.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray10);
        byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(32L, (long) (byte) 0, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((-1.0f), (float) 97L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 100, (double) 0.0f, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1.0f), (double) 100, (double) 52L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, (int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(97.0f, (float) 35L, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1, (double) (short) 100, (double) 35);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 100, 1.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) 0, (double) (-1), (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(100.0f, (float) 32L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            byte byte13 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(1L, 0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 0, (long) 0, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray9 = null;
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 10, 0, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray9 = new int[] { (short) -1 };
        int int10 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray12 = new int[] { (short) -1 };
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray12);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray12, intArray16);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray16);
        int[] intArray25 = new int[] { (short) -1 };
        int int26 = org.apache.commons.lang.math.NumberUtils.min(intArray25);
        int[] intArray28 = new int[] { (short) -1 };
        int int29 = org.apache.commons.lang.math.NumberUtils.min(intArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray28);
        int int31 = org.apache.commons.lang.math.NumberUtils.min(intArray25);
        int int32 = org.apache.commons.lang.math.NumberUtils.min(intArray25);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray25);
        java.lang.Class<?> wildcardClass34 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(10.0d, (double) 97.0f, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int[] intArray8 = new int[] { (short) -1 };
        int int9 = org.apache.commons.lang.math.NumberUtils.min(intArray8);
        int[] intArray11 = new int[] { (short) -1 };
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray11);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray8);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray16);
        java.lang.Class<?> wildcardClass23 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 10, (int) (short) 100, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 97L, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        // The following exception was thrown during execution in test generation
        try {
            short short9 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 100, (double) 97, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.commons.lang.math.NumberUtils.max(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 97L, (double) 0.0f, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, (int) '#', 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(35L, (long) (byte) 0, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 1, (double) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(52.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 97, (float) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 100 };
        short[] shortArray4 = new short[] { (short) 100 };
        short[] shortArray5 = new short[] {};
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray5);
        short[] shortArray8 = new short[] { (short) 100 };
        short[] shortArray9 = new short[] {};
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(shortArray8, shortArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray8);
        short[] shortArray13 = new short[] { (short) 100 };
        short[] shortArray14 = new short[] {};
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray13, shortArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray8, shortArray13);
        short[] shortArray18 = new short[] { (short) 100 };
        short[] shortArray19 = new short[] {};
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray18, shortArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(shortArray8, shortArray18);
        short[] shortArray22 = null;
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(shortArray18, shortArray22);
        short short24 = org.apache.commons.lang.math.NumberUtils.max(shortArray18);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray18);
        short[] shortArray27 = new short[] { (short) 100 };
        short[] shortArray28 = new short[] {};
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray27, shortArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray27);
        java.lang.Class<?> wildcardClass31 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray27, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray28, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(1L, (long) 1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(1L, (long) ' ', (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(52L, (long) (short) 1, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(97.0f, 97.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) -1, 1, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) (byte) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 0L, (double) (byte) 1, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 10, (long) 10, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 10, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        long[] longArray0 = null;
        long[] longArray2 = new long[] { 0L };
        long long3 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray5 = new long[] { (byte) 1 };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray5);
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray5);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang.math.NumberUtils.min(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 52, (long) 35, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) ' ', (float) (byte) 100, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100.0f, (double) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) (byte) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(52, (int) '#', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 10, 97.0d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, (float) (short) 100, (float) 35L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(10L, 97L, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] {};
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray11);
        short[] shortArray14 = new short[] { (short) 100 };
        short[] shortArray15 = new short[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray14);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray14);
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short[] shortArray22 = new short[] { (short) 100 };
        short[] shortArray23 = new short[] {};
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(shortArray22, shortArray23);
        short[] shortArray26 = new short[] { (short) 100 };
        short[] shortArray27 = new short[] {};
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray23, shortArray26);
        short[] shortArray31 = new short[] { (short) 100 };
        short[] shortArray32 = new short[] {};
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(shortArray31, shortArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray31);
        short short35 = org.apache.commons.lang.math.NumberUtils.max(shortArray26);
        short[] shortArray41 = new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (byte) 10 };
        short short42 = org.apache.commons.lang.math.NumberUtils.min(shortArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray41);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray41);
        java.lang.Class<?> wildcardClass45 = shortArray14.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray26, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray27, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray31, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray32, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 100 + "'", short35 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray41, new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (short) 10 });
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 10 + "'", short42 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(35, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(1.0d, (double) 32L, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        int[] intArray9 = new int[] { (short) -1 };
        int int10 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray12 = new int[] { (short) -1 };
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray12);
        int int15 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray17 = new int[] { (short) -1 };
        int int18 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        int[] intArray20 = new int[] { (short) -1 };
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray20);
        int[] intArray24 = new int[] { (short) -1 };
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray24);
        int[] intArray27 = new int[] { (short) -1 };
        int int28 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray27);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray24);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray24);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray9);
        java.lang.Class<?> wildcardClass33 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 0, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '4', (long) 32, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) 'a', 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 10, 0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(1, (-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '#', (float) (-1), (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) -1, 0, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((-1.0f), 100.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) (byte) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(10.0f, (float) (byte) 0, (float) 52L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '4', 52, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 32, (long) 0, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, (float) (short) -1, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) (byte) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        long[] longArray1 = new long[] { 1 };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        java.lang.Class<?> wildcardClass3 = longArray1.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 100, (float) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 97, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(35.0d, (double) '4', (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32, (double) (-1), (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) '4', 100.0d, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 0, (-1), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(97, 35, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 97L, 10.0d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 0, (float) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) -1, 1L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 1, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1L, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 100, (float) '4', (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, 52, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 100 };
        short[] shortArray4 = new short[] { (short) 100 };
        short[] shortArray5 = new short[] {};
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(shortArray4, shortArray5);
        short[] shortArray8 = new short[] { (short) 100 };
        short[] shortArray9 = new short[] {};
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(shortArray8, shortArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray8);
        short[] shortArray13 = new short[] { (short) 100 };
        short[] shortArray14 = new short[] {};
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray13, shortArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray8, shortArray13);
        short[] shortArray18 = new short[] { (short) 100 };
        short[] shortArray19 = new short[] {};
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray18, shortArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(shortArray8, shortArray18);
        short[] shortArray22 = null;
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(shortArray18, shortArray22);
        short short24 = org.apache.commons.lang.math.NumberUtils.max(shortArray18);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray18);
        short[] shortArray27 = new short[] { (short) 100 };
        short[] shortArray28 = new short[] {};
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray27, shortArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray27);
        short short31 = org.apache.commons.lang.math.NumberUtils.max(shortArray27);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) 0, (short) 100 });
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertArrayEquals(shortArray4, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray27, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray28, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 100 + "'", short31 == (short) 100);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 10L, (double) (short) 1, (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 10, 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 97L, (double) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(35.0d, (double) 32L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] {};
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray11);
        short[] shortArray14 = new short[] { (short) 100 };
        short[] shortArray15 = new short[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray14);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray14);
        short[] shortArray19 = new short[] {};
        short[] shortArray21 = new short[] { (short) 100 };
        short[] shortArray22 = new short[] {};
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray22);
        short[] shortArray25 = new short[] { (short) 100 };
        short[] shortArray26 = new short[] {};
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray22, shortArray25);
        short[] shortArray30 = new short[] { (short) 100 };
        short[] shortArray31 = new short[] {};
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(shortArray30, shortArray31);
        short[] shortArray34 = new short[] { (short) 100 };
        short[] shortArray35 = new short[] {};
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray34, shortArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(shortArray31, shortArray34);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray34);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray25);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray19);
        // The following exception was thrown during execution in test generation
        try {
            short short41 = org.apache.commons.lang.math.NumberUtils.min(shortArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] {});
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray26, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray30, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray31, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray34, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 'a', (float) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, (float) 97L, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray21);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(byteArray27, byteArray34);
        byte byte36 = org.apache.commons.lang.math.NumberUtils.min(byteArray34);
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(byteArray39, byteArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(byteArray34, byteArray46);
        byte byte49 = org.apache.commons.lang.math.NumberUtils.max(byteArray46);
        byte[] byteArray51 = new byte[] { (byte) 100 };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(byteArray46, byteArray51);
        byte byte53 = org.apache.commons.lang.math.NumberUtils.max(byteArray51);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(byteArray51, byteArray60);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray51);
        byte byte63 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        java.lang.Class<?> wildcardClass64 = byteArray21.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) -1 + "'", byte36 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + byte49 + "' != '" + (byte) 100 + "'", byte49 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) 100 + "'", byte53 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) -1 + "'", byte63 == (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) '4', (double) 0, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (-1L), (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) -1, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100L, (double) 10L, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 97L, (double) (-1.0f), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        int[] intArray0 = null;
        int[] intArray2 = new int[] { (short) -1 };
        int int3 = org.apache.commons.lang.math.NumberUtils.min(intArray2);
        int[] intArray5 = new int[] { (short) -1 };
        int int6 = org.apache.commons.lang.math.NumberUtils.min(intArray5);
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(intArray2, intArray5);
        int[] intArray9 = new int[] { (short) -1 };
        int int10 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray12 = new int[] { (short) -1 };
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray12);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(intArray5, intArray9);
        int[] intArray17 = new int[] { (short) -1 };
        int int18 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        int[] intArray20 = new int[] { (short) -1 };
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray17);
        int int24 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray17);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 32L, (float) (short) 1, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 0, (double) (short) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 32);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 0, (double) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 32, 0.0d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 97L, 100.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 10, (double) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 100, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 0, (float) 0, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 32.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] {};
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray10);
        short[] shortArray15 = new short[] { (short) 100 };
        short[] shortArray16 = new short[] {};
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray15, shortArray16);
        short[] shortArray19 = new short[] { (short) 100 };
        short[] shortArray20 = new short[] {};
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(shortArray16, shortArray19);
        short[] shortArray24 = new short[] { (short) 100 };
        short[] shortArray25 = new short[] {};
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray25);
        short[] shortArray28 = new short[] { (short) 100 };
        short[] shortArray29 = new short[] {};
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray28, shortArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray28);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray28);
        short short33 = org.apache.commons.lang.math.NumberUtils.min(shortArray28);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray28);
        short[] shortArray36 = new short[] { (short) 100 };
        short[] shortArray37 = new short[] {};
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray37);
        short[] shortArray40 = new short[] { (short) 100 };
        short[] shortArray41 = new short[] {};
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(shortArray40, shortArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray37, shortArray40);
        short[] shortArray45 = new short[] { (short) 100 };
        short[] shortArray46 = new short[] {};
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray46);
        short[] shortArray49 = new short[] { (short) 100 };
        short[] shortArray50 = new short[] {};
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray49, shortArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(shortArray46, shortArray49);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray40, shortArray49);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray40);
        java.lang.Class<?> wildcardClass55 = shortArray40.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray28, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray29, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 100 + "'", short33 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray37, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray40, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray41, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray45, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray46, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray49, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray50, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 35, (float) 52, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray9 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray5);
        double[] doubleArray16 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray20 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray20);
        double double22 = org.apache.commons.lang.math.NumberUtils.min(doubleArray16);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray16);
        double double24 = org.apache.commons.lang.math.NumberUtils.max(doubleArray5);
        double double25 = org.apache.commons.lang.math.NumberUtils.min(doubleArray5);
        double[] doubleArray26 = null;
        double[] doubleArray31 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray35 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray31, doubleArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray31);
        double[] doubleArray42 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray46 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray46);
        double double48 = org.apache.commons.lang.math.NumberUtils.min(doubleArray42);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray31, doubleArray42);
        double double50 = org.apache.commons.lang.math.NumberUtils.max(doubleArray31);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray31);
        double[] doubleArray56 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray60 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray56, doubleArray60);
        double double62 = org.apache.commons.lang.math.NumberUtils.max(doubleArray60);
        double double63 = org.apache.commons.lang.math.NumberUtils.max(doubleArray60);
        double[] doubleArray64 = null;
        double[] doubleArray69 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray73 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray69, doubleArray73);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray64, doubleArray69);
        double[] doubleArray80 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray84 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray80, doubleArray84);
        double double86 = org.apache.commons.lang.math.NumberUtils.min(doubleArray80);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray69, doubleArray80);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray60, doubleArray80);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray80);
        double double90 = org.apache.commons.lang.math.NumberUtils.max(doubleArray80);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 52.0d + "'", double50 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 100.0d + "'", double63 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-1.0d) + "'", double86 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 52.0d + "'", double90 == 52.0d);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 1, (float) 32L, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(52L, (long) 1, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0L, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 97L, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.max(byteArray9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        byte byte23 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray33);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray21);
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte42 = org.apache.commons.lang.math.NumberUtils.min(byteArray41);
        byte byte43 = org.apache.commons.lang.math.NumberUtils.min(byteArray41);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray41);
        byte byte45 = org.apache.commons.lang.math.NumberUtils.max(byteArray9);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 1 + "'", byte42 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 1 + "'", byte43 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 100 + "'", byte45 == (byte) 100);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, 32, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 32, (long) (byte) 100, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(97.0f, (float) 0, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 0 };
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min(byteArray2);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray6, byteArray13);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(byteArray18, byteArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray25);
        byte byte28 = org.apache.commons.lang.math.NumberUtils.max(byteArray25);
        byte[] byteArray30 = new byte[] { (byte) 100 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(byteArray25, byteArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray30);
        java.lang.Class<?> wildcardClass33 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 100 + "'", byte28 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32, (float) 52L, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(1, (int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray9 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray5);
        double[] doubleArray16 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray20 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray20);
        double double22 = org.apache.commons.lang.math.NumberUtils.min(doubleArray16);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray16);
        double double24 = org.apache.commons.lang.math.NumberUtils.max(doubleArray16);
        java.lang.Class<?> wildcardClass25 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 52.0d + "'", double24 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) ' ', (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(32.0f, (float) (-1), (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(35, (-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        float[] floatArray0 = null;
        float[] floatArray2 = new float[] { (byte) 10 };
        float float3 = org.apache.commons.lang.math.NumberUtils.min(floatArray2);
        float float4 = org.apache.commons.lang.math.NumberUtils.max(floatArray2);
        float[] floatArray11 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float12 = org.apache.commons.lang.math.NumberUtils.min(floatArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(floatArray2, floatArray11);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray11);
        float[] floatArray19 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float20 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(floatArray11, floatArray19);
        float float22 = org.apache.commons.lang.math.NumberUtils.max(floatArray11);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray11);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertArrayEquals(floatArray2, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) -1, (float) (-1), (float) 97);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((-1), (-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) (byte) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 32, (float) (short) 100, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 10, (-1.0d), (double) 52L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) (byte) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray12 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray12);
        float float15 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        float float16 = org.apache.commons.lang.math.NumberUtils.min(floatArray12);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 100L, (float) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 35, 1.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) -1, 97.0f, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, 35, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) ' ', (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) (byte) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(35, (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) (byte) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(1.0d, (double) 100, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 10, (double) (short) 1, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 52, (double) 100.0f, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) (byte) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 1, (long) 32, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        float[] floatArray1 = new float[] { (byte) 10 };
        float float2 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
        float float3 = org.apache.commons.lang.math.NumberUtils.max(floatArray1);
        float[] floatArray10 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
        float[] floatArray18 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float19 = org.apache.commons.lang.math.NumberUtils.min(floatArray18);
        float float20 = org.apache.commons.lang.math.NumberUtils.max(floatArray18);
        float float21 = org.apache.commons.lang.math.NumberUtils.max(floatArray18);
        float[] floatArray26 = new float[] { (byte) 0, (-1.0f), (short) 1, (-1.0f) };
        float float27 = org.apache.commons.lang.math.NumberUtils.max(floatArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray26);
        float[] floatArray33 = new float[] { (byte) 0, (-1.0f), (short) 1, (-1.0f) };
        float float34 = org.apache.commons.lang.math.NumberUtils.max(floatArray33);
        float[] floatArray39 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float40 = org.apache.commons.lang.math.NumberUtils.min(floatArray39);
        float[] floatArray42 = new float[] { (byte) 10 };
        float float43 = org.apache.commons.lang.math.NumberUtils.min(floatArray42);
        float float44 = org.apache.commons.lang.math.NumberUtils.max(floatArray42);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(floatArray39, floatArray42);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray42);
        float[] floatArray51 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float52 = org.apache.commons.lang.math.NumberUtils.min(floatArray51);
        float float53 = org.apache.commons.lang.math.NumberUtils.max(floatArray51);
        float[] floatArray58 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float59 = org.apache.commons.lang.math.NumberUtils.min(floatArray58);
        float float60 = org.apache.commons.lang.math.NumberUtils.max(floatArray58);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(floatArray51, floatArray58);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray58);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(floatArray26, floatArray58);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray58);
        float[] floatArray66 = new float[] { (byte) 10 };
        float float67 = org.apache.commons.lang.math.NumberUtils.min(floatArray66);
        float float68 = org.apache.commons.lang.math.NumberUtils.max(floatArray66);
        float[] floatArray75 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float76 = org.apache.commons.lang.math.NumberUtils.min(floatArray75);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(floatArray66, floatArray75);
        float[] floatArray79 = new float[] { (byte) 10 };
        float float80 = org.apache.commons.lang.math.NumberUtils.min(floatArray79);
        float float81 = org.apache.commons.lang.math.NumberUtils.max(floatArray79);
        float[] floatArray88 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float89 = org.apache.commons.lang.math.NumberUtils.min(floatArray88);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(floatArray79, floatArray88);
        float float91 = org.apache.commons.lang.math.NumberUtils.max(floatArray88);
        float[] floatArray95 = new float[] { 97.0f, 0L, 32L };
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(floatArray88, floatArray95);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(floatArray66, floatArray88);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray88);
        float float99 = org.apache.commons.lang.math.NumberUtils.max(floatArray88);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 0.0f, (-1.0f), 1.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertArrayEquals(floatArray33, new float[] { 0.0f, (-1.0f), 1.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 1.0f + "'", float34 == 1.0f);
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertArrayEquals(floatArray39, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertArrayEquals(floatArray42, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 10.0f + "'", float43 == 10.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 10.0f + "'", float44 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertArrayEquals(floatArray51, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + (-1.0f) + "'", float52 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 100.0f + "'", float53 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertArrayEquals(floatArray58, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + (-1.0f) + "'", float59 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 100.0f + "'", float60 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertArrayEquals(floatArray66, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 10.0f + "'", float67 == 10.0f);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 10.0f + "'", float68 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray75);
        org.junit.Assert.assertArrayEquals(floatArray75, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + (-1.0f) + "'", float76 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(floatArray79);
        org.junit.Assert.assertArrayEquals(floatArray79, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float80 + "' != '" + 10.0f + "'", float80 == 10.0f);
        org.junit.Assert.assertTrue("'" + float81 + "' != '" + 10.0f + "'", float81 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray88);
        org.junit.Assert.assertArrayEquals(floatArray88, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float89 + "' != '" + (-1.0f) + "'", float89 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + float91 + "' != '" + 100.0f + "'", float91 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray95);
        org.junit.Assert.assertArrayEquals(floatArray95, new float[] { 97.0f, 0.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + float99 + "' != '" + 100.0f + "'", float99 == 100.0f);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(35.0d, (double) 0.0f, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { (byte) 1 };
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray8 = new long[] { 0L };
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        long[] longArray11 = new long[] { (byte) 1 };
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray11);
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray16 = new long[] { 0L };
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        long[] longArray19 = new long[] { (byte) 1 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray19);
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray19);
        long[] longArray23 = new long[] { 0L };
        long long24 = org.apache.commons.lang.math.NumberUtils.max(longArray23);
        long[] longArray26 = new long[] { (byte) 1 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray19, longArray26);
        long long29 = org.apache.commons.lang.math.NumberUtils.max(longArray19);
        long[] longArray31 = new long[] { 0L };
        long long32 = org.apache.commons.lang.math.NumberUtils.max(longArray31);
        long[] longArray34 = new long[] { (byte) 1 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(longArray31, longArray34);
        long long36 = org.apache.commons.lang.math.NumberUtils.max(longArray34);
        long[] longArray38 = new long[] { 0L };
        long long39 = org.apache.commons.lang.math.NumberUtils.max(longArray38);
        long[] longArray41 = new long[] { (byte) 1 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray41);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray19, longArray41);
        long[] longArray46 = new long[] { 0L };
        long long47 = org.apache.commons.lang.math.NumberUtils.max(longArray46);
        long[] longArray49 = new long[] { (byte) 1 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(longArray46, longArray49);
        long long51 = org.apache.commons.lang.math.NumberUtils.max(longArray49);
        long[] longArray53 = new long[] { 0L };
        long long54 = org.apache.commons.lang.math.NumberUtils.max(longArray53);
        long[] longArray56 = new long[] { (byte) 1 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(longArray53, longArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(longArray49, longArray56);
        long long59 = org.apache.commons.lang.math.NumberUtils.max(longArray49);
        long[] longArray61 = new long[] { 0L };
        long long62 = org.apache.commons.lang.math.NumberUtils.max(longArray61);
        long[] longArray64 = new long[] { (byte) 1 };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(longArray61, longArray64);
        long long66 = org.apache.commons.lang.math.NumberUtils.max(longArray64);
        long[] longArray68 = new long[] { 0L };
        long long69 = org.apache.commons.lang.math.NumberUtils.max(longArray68);
        long[] longArray71 = new long[] { (byte) 1 };
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(longArray68, longArray71);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(longArray64, longArray71);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(longArray49, longArray71);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(longArray41, longArray49);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray49);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertArrayEquals(longArray34, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertArrayEquals(longArray38, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertArrayEquals(longArray41, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertArrayEquals(longArray46, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertArrayEquals(longArray49, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertArrayEquals(longArray53, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertArrayEquals(longArray56, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertArrayEquals(longArray61, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertArrayEquals(longArray64, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertArrayEquals(longArray68, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertArrayEquals(longArray71, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        short[] shortArray9 = new short[] { (short) 100 };
        short[] shortArray10 = new short[] {};
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(shortArray9, shortArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray9);
        short[] shortArray14 = new short[] { (short) 100 };
        short[] shortArray15 = new short[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray9, shortArray14);
        short[] shortArray19 = new short[] { (short) 100 };
        short[] shortArray20 = new short[] {};
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(shortArray9, shortArray19);
        short[] shortArray23 = null;
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray23);
        // The following exception was thrown during execution in test generation
        try {
            short short26 = org.apache.commons.lang.math.NumberUtils.max(shortArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 97L, (float) 100, (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '4', 52L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 10, (double) (short) -1, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 0, (float) (byte) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double double10 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double11 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double[] doubleArray12 = null;
        double[] doubleArray17 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray21 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray17);
        double[] doubleArray28 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray32 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray32);
        double double34 = org.apache.commons.lang.math.NumberUtils.min(doubleArray28);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray28);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray28);
        double[] doubleArray41 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray45 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray45);
        double double47 = org.apache.commons.lang.math.NumberUtils.min(doubleArray41);
        double[] doubleArray48 = null;
        double[] doubleArray53 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray57 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray53, doubleArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray48, doubleArray53);
        double[] doubleArray60 = null;
        double[] doubleArray65 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray69 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray65, doubleArray69);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray60, doubleArray65);
        double[] doubleArray76 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray80 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray76, doubleArray80);
        double double82 = org.apache.commons.lang.math.NumberUtils.min(doubleArray76);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray65, doubleArray76);
        double double84 = org.apache.commons.lang.math.NumberUtils.max(doubleArray65);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray48, doubleArray65);
        double double86 = org.apache.commons.lang.math.NumberUtils.min(doubleArray65);
        double double87 = org.apache.commons.lang.math.NumberUtils.min(doubleArray65);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray65);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray41);
        double double90 = org.apache.commons.lang.math.NumberUtils.max(doubleArray41);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1.0d) + "'", double82 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 52.0d + "'", double84 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-1.0d) + "'", double86 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 52.0d + "'", double90 == 52.0d);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(52, 35, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 97L, (float) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(1.0d, (double) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(97L, (long) (byte) -1, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, (float) (short) 10, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(35.0d, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 97, (double) 1L, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 1.0f, (double) (short) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 0L, (float) ' ', (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 10L, (float) 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray9 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray9);
        double double11 = org.apache.commons.lang.math.NumberUtils.min(doubleArray5);
        double[] doubleArray12 = null;
        double[] doubleArray17 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray21 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray17);
        double[] doubleArray24 = null;
        double[] doubleArray29 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray33 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray29, doubleArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray24, doubleArray29);
        double[] doubleArray40 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray44 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray40, doubleArray44);
        double double46 = org.apache.commons.lang.math.NumberUtils.min(doubleArray40);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray29, doubleArray40);
        double double48 = org.apache.commons.lang.math.NumberUtils.max(doubleArray29);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray29);
        double double50 = org.apache.commons.lang.math.NumberUtils.min(doubleArray29);
        double double51 = org.apache.commons.lang.math.NumberUtils.min(doubleArray29);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray29);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray29);
        double[] doubleArray54 = null;
        double[] doubleArray59 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray63 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray59, doubleArray63);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray59);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray59);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 52.0d + "'", double48 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) -1, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        float[] floatArray1 = new float[] { (byte) 10 };
        float float2 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
        float float3 = org.apache.commons.lang.math.NumberUtils.max(floatArray1);
        float[] floatArray10 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float[] floatArray18 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float19 = org.apache.commons.lang.math.NumberUtils.min(floatArray18);
        float float20 = org.apache.commons.lang.math.NumberUtils.max(floatArray18);
        float[] floatArray25 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float26 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float float27 = org.apache.commons.lang.math.NumberUtils.max(floatArray25);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray25);
        float float29 = org.apache.commons.lang.math.NumberUtils.max(floatArray25);
        float float30 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray25);
        float[] floatArray36 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float37 = org.apache.commons.lang.math.NumberUtils.min(floatArray36);
        float[] floatArray39 = new float[] { (byte) 10 };
        float float40 = org.apache.commons.lang.math.NumberUtils.min(floatArray39);
        float float41 = org.apache.commons.lang.math.NumberUtils.max(floatArray39);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray39);
        float float43 = org.apache.commons.lang.math.NumberUtils.min(floatArray36);
        float[] floatArray48 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float49 = org.apache.commons.lang.math.NumberUtils.min(floatArray48);
        float float50 = org.apache.commons.lang.math.NumberUtils.max(floatArray48);
        float[] floatArray55 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float56 = org.apache.commons.lang.math.NumberUtils.min(floatArray55);
        float float57 = org.apache.commons.lang.math.NumberUtils.max(floatArray55);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray48, floatArray55);
        float float59 = org.apache.commons.lang.math.NumberUtils.max(floatArray55);
        float float60 = org.apache.commons.lang.math.NumberUtils.min(floatArray55);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray55);
        float float62 = org.apache.commons.lang.math.NumberUtils.max(floatArray36);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray36);
        java.lang.Class<?> wildcardClass64 = floatArray36.getClass();
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-1.0f) + "'", float30 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertArrayEquals(floatArray36, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-1.0f) + "'", float37 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray39);
        org.junit.Assert.assertArrayEquals(floatArray39, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 10.0f + "'", float40 == 10.0f);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 10.0f + "'", float41 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + (-1.0f) + "'", float43 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray48);
        org.junit.Assert.assertArrayEquals(floatArray48, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + (-1.0f) + "'", float49 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 100.0f + "'", float50 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertArrayEquals(floatArray55, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + (-1.0f) + "'", float56 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 100.0f + "'", float57 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 100.0f + "'", float59 == 100.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + (-1.0f) + "'", float60 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 100.0f + "'", float62 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, 97.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 100, (double) 'a', (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '#', (float) (short) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 97, (double) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((-1), 32, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) (byte) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 52, (long) (byte) -1, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(100.0d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 97);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 1, 0.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 1, (double) 52.0f, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1L, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] {};
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray11);
        short[] shortArray14 = new short[] { (short) 100 };
        short[] shortArray15 = new short[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray14);
        short[] shortArray19 = new short[] { (short) 100 };
        short[] shortArray20 = new short[] {};
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray20);
        short[] shortArray23 = new short[] { (short) 100 };
        short[] shortArray24 = new short[] {};
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(shortArray23, shortArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray23);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray23);
        short short28 = org.apache.commons.lang.math.NumberUtils.min(shortArray23);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray23);
        short[] shortArray31 = new short[] { (short) 100 };
        short[] shortArray32 = new short[] {};
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(shortArray31, shortArray32);
        short[] shortArray35 = new short[] { (short) 100 };
        short[] shortArray36 = new short[] {};
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray35);
        short[] shortArray40 = new short[] { (short) 100 };
        short[] shortArray41 = new short[] {};
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(shortArray40, shortArray41);
        short[] shortArray44 = new short[] { (short) 100 };
        short[] shortArray45 = new short[] {};
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray44);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray44);
        short short49 = org.apache.commons.lang.math.NumberUtils.min(shortArray44);
        short short50 = org.apache.commons.lang.math.NumberUtils.min(shortArray44);
        short[] shortArray56 = new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (byte) 10 };
        short short57 = org.apache.commons.lang.math.NumberUtils.min(shortArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray56);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray44);
        short[] shortArray61 = new short[] { (short) 100 };
        short[] shortArray62 = new short[] {};
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(shortArray61, shortArray62);
        short[] shortArray65 = new short[] { (short) 100 };
        short[] shortArray66 = new short[] {};
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(shortArray65, shortArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray62, shortArray65);
        short[] shortArray70 = new short[] { (short) 100 };
        short[] shortArray71 = new short[] {};
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(shortArray70, shortArray71);
        short[] shortArray74 = new short[] { (short) 100 };
        short[] shortArray75 = new short[] {};
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(shortArray74, shortArray75);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(shortArray71, shortArray74);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(shortArray65, shortArray74);
        short[] shortArray80 = new short[] { (short) 100 };
        short[] shortArray81 = new short[] {};
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(shortArray80, shortArray81);
        short[] shortArray84 = new short[] { (short) 100 };
        short[] shortArray85 = new short[] {};
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(shortArray84, shortArray85);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(shortArray81, shortArray84);
        short[] shortArray89 = new short[] { (short) 100 };
        short[] shortArray90 = new short[] {};
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(shortArray89, shortArray90);
        short[] shortArray93 = new short[] { (short) 100 };
        short[] shortArray94 = new short[] {};
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(shortArray93, shortArray94);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(shortArray90, shortArray93);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(shortArray84, shortArray93);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(shortArray74, shortArray84);
        boolean boolean99 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray84);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(shortArray23);
        org.junit.Assert.assertArrayEquals(shortArray23, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 100 + "'", short28 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray31, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray32, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray40, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray41, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray44, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray45, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + short49 + "' != '" + (short) 100 + "'", short49 == (short) 100);
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) 100 + "'", short50 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray56, new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (short) 10 });
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) 10 + "'", short57 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray61, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray62, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(shortArray65);
        org.junit.Assert.assertArrayEquals(shortArray65, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray66, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray70, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray71, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(shortArray74);
        org.junit.Assert.assertArrayEquals(shortArray74, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray75, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(shortArray80);
        org.junit.Assert.assertArrayEquals(shortArray80, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray81, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(shortArray84);
        org.junit.Assert.assertArrayEquals(shortArray84, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray85);
        org.junit.Assert.assertArrayEquals(shortArray85, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(shortArray89);
        org.junit.Assert.assertArrayEquals(shortArray89, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray90);
        org.junit.Assert.assertArrayEquals(shortArray90, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(shortArray93);
        org.junit.Assert.assertArrayEquals(shortArray93, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray94);
        org.junit.Assert.assertArrayEquals(shortArray94, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, 0.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        float[] floatArray1 = new float[] { (byte) 10 };
        float float2 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
        float float3 = org.apache.commons.lang.math.NumberUtils.max(floatArray1);
        float[] floatArray10 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        java.lang.Class<?> wildcardClass14 = floatArray10.getClass();
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] {};
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray10);
        short[] shortArray15 = new short[] { (short) 100 };
        short[] shortArray16 = new short[] {};
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray15, shortArray16);
        short[] shortArray19 = new short[] { (short) 100 };
        short[] shortArray20 = new short[] {};
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(shortArray16, shortArray19);
        short[] shortArray24 = new short[] { (short) 100 };
        short[] shortArray25 = new short[] {};
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray25);
        short[] shortArray28 = new short[] { (short) 100 };
        short[] shortArray29 = new short[] {};
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray28, shortArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray28);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray28);
        short short33 = org.apache.commons.lang.math.NumberUtils.min(shortArray28);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray28);
        short[] shortArray36 = new short[] { (short) 100 };
        short[] shortArray37 = new short[] {};
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray37);
        short[] shortArray40 = new short[] { (short) 100 };
        short[] shortArray41 = new short[] {};
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(shortArray40, shortArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray37, shortArray40);
        short[] shortArray45 = new short[] { (short) 100 };
        short[] shortArray46 = new short[] {};
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray46);
        short[] shortArray49 = new short[] { (short) 100 };
        short[] shortArray50 = new short[] {};
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray49, shortArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(shortArray46, shortArray49);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray40, shortArray49);
        short short54 = org.apache.commons.lang.math.NumberUtils.min(shortArray49);
        short short55 = org.apache.commons.lang.math.NumberUtils.min(shortArray49);
        short short56 = org.apache.commons.lang.math.NumberUtils.max(shortArray49);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(shortArray28, shortArray49);
        java.lang.Class<?> wildcardClass58 = shortArray49.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray28, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray29, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 100 + "'", short33 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray37, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray40, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray41, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray45, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray46, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray49, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray50, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) 100 + "'", short54 == (short) 100);
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 100 + "'", short55 == (short) 100);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 100 + "'", short56 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(1, (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray9 = new int[] { (short) -1 };
        int int10 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray12 = new int[] { (short) -1 };
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray12);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray12, intArray16);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray16);
        int[] intArray25 = new int[] { (short) -1 };
        int int26 = org.apache.commons.lang.math.NumberUtils.min(intArray25);
        int[] intArray28 = new int[] { (short) -1 };
        int int29 = org.apache.commons.lang.math.NumberUtils.min(intArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray28);
        int int31 = org.apache.commons.lang.math.NumberUtils.min(intArray25);
        int int32 = org.apache.commons.lang.math.NumberUtils.min(intArray25);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray25);
        int int34 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int int35 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int int36 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        java.lang.Class<?> wildcardClass37 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 97L, (double) 100.0f, (double) 52L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double double10 = org.apache.commons.lang.math.NumberUtils.min(doubleArray4);
        double[] doubleArray11 = null;
        double[] doubleArray16 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray20 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray16);
        double[] doubleArray23 = null;
        double[] doubleArray28 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray32 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray23, doubleArray28);
        double[] doubleArray39 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray43 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray39, doubleArray43);
        double double45 = org.apache.commons.lang.math.NumberUtils.min(doubleArray39);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray39);
        double double47 = org.apache.commons.lang.math.NumberUtils.max(doubleArray28);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray28);
        double double49 = org.apache.commons.lang.math.NumberUtils.min(doubleArray28);
        double double50 = org.apache.commons.lang.math.NumberUtils.min(doubleArray28);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray28);
        double double52 = org.apache.commons.lang.math.NumberUtils.max(doubleArray4);
        double double53 = org.apache.commons.lang.math.NumberUtils.min(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 52.0d + "'", double47 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 1, 100.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 35L, 100.0d, (double) 97L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) (byte) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 97);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, (float) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) '#', (double) (-1), (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, 0L, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '#', (int) (byte) 10, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 10, (int) (short) 0, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((-1.0d), (double) 32L, 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) (byte) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] {};
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray11);
        short[] shortArray14 = new short[] { (short) 100 };
        short[] shortArray15 = new short[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray14);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray14);
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        java.lang.Class<?> wildcardClass21 = shortArray14.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 100, 10.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) (byte) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int[] intArray8 = new int[] { (short) -1 };
        int int9 = org.apache.commons.lang.math.NumberUtils.min(intArray8);
        int[] intArray11 = new int[] { (short) -1 };
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray11);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray8);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray16);
        int[] intArray24 = new int[] { (short) -1 };
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray24);
        int[] intArray27 = new int[] { (short) -1 };
        int int28 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray27);
        int int30 = org.apache.commons.lang.math.NumberUtils.max(intArray24);
        int[] intArray32 = new int[] { (short) -1 };
        int int33 = org.apache.commons.lang.math.NumberUtils.min(intArray32);
        int[] intArray35 = new int[] { (short) -1 };
        int int36 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(intArray32, intArray35);
        int int38 = org.apache.commons.lang.math.NumberUtils.min(intArray32);
        int[] intArray40 = new int[] { (short) -1 };
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray40);
        int[] intArray43 = new int[] { (short) -1 };
        int int44 = org.apache.commons.lang.math.NumberUtils.min(intArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray43);
        int[] intArray47 = new int[] { (short) -1 };
        int int48 = org.apache.commons.lang.math.NumberUtils.min(intArray47);
        int[] intArray50 = new int[] { (short) -1 };
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(intArray47, intArray50);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(intArray43, intArray47);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray32, intArray47);
        int[] intArray56 = new int[] { (short) -1 };
        int int57 = org.apache.commons.lang.math.NumberUtils.min(intArray56);
        int[] intArray59 = new int[] { (short) -1 };
        int int60 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(intArray56, intArray59);
        int int62 = org.apache.commons.lang.math.NumberUtils.min(intArray56);
        int int63 = org.apache.commons.lang.math.NumberUtils.min(intArray56);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(intArray32, intArray56);
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray32);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray32);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray24);
        int[] intArray68 = null;
        int[] intArray70 = new int[] { (short) -1 };
        int int71 = org.apache.commons.lang.math.NumberUtils.min(intArray70);
        int[] intArray73 = new int[] { (short) -1 };
        int int74 = org.apache.commons.lang.math.NumberUtils.min(intArray73);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(intArray70, intArray73);
        int int76 = org.apache.commons.lang.math.NumberUtils.min(intArray70);
        int[] intArray78 = new int[] { (short) -1 };
        int int79 = org.apache.commons.lang.math.NumberUtils.min(intArray78);
        int[] intArray81 = new int[] { (short) -1 };
        int int82 = org.apache.commons.lang.math.NumberUtils.min(intArray81);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(intArray78, intArray81);
        int[] intArray85 = new int[] { (short) -1 };
        int int86 = org.apache.commons.lang.math.NumberUtils.min(intArray85);
        int[] intArray88 = new int[] { (short) -1 };
        int int89 = org.apache.commons.lang.math.NumberUtils.min(intArray88);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(intArray85, intArray88);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(intArray81, intArray85);
        int int92 = org.apache.commons.lang.math.NumberUtils.max(intArray85);
        int int93 = org.apache.commons.lang.math.NumberUtils.max(intArray85);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(intArray70, intArray85);
        int int95 = org.apache.commons.lang.math.NumberUtils.max(intArray70);
        int int96 = org.apache.commons.lang.math.NumberUtils.max(intArray70);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(intArray68, intArray70);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray68);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 10, (float) (short) 1, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 100, (long) (byte) 0, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 1, (double) (short) 10, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 1, (long) '4', (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0.0f, (double) ' ', 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 100, (double) '#', (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 0, 97, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 97, (double) 52L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (long) (short) 100, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(35.0f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray11 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float12 = org.apache.commons.lang.math.NumberUtils.min(floatArray11);
        float float13 = org.apache.commons.lang.math.NumberUtils.max(floatArray11);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray11);
        float[] floatArray19 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float20 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        float float21 = org.apache.commons.lang.math.NumberUtils.max(floatArray19);
        float[] floatArray26 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float27 = org.apache.commons.lang.math.NumberUtils.min(floatArray26);
        float float28 = org.apache.commons.lang.math.NumberUtils.max(floatArray26);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray26);
        float float30 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray11, floatArray19);
        float[] floatArray32 = null;
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray32);
        java.lang.Class<?> wildcardClass34 = floatArray19.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-1.0f) + "'", float27 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 100.0f + "'", float28 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-1.0f) + "'", float30 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(35, 52, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, (-1), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '4', (long) 97, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(1.0f, 10.0f, (float) 32L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] {};
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray10);
        short[] shortArray15 = new short[] { (short) 100 };
        short[] shortArray16 = new short[] {};
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray15, shortArray16);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray15);
        short[] shortArray20 = new short[] { (short) 100 };
        short[] shortArray21 = new short[] {};
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray21);
        short[] shortArray24 = new short[] { (short) 100 };
        short[] shortArray25 = new short[] {};
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray24);
        short[] shortArray29 = new short[] { (short) 100 };
        short[] shortArray30 = new short[] {};
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray29);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(shortArray15, shortArray24);
        short[] shortArray35 = new short[] { (short) 100 };
        short[] shortArray36 = new short[] {};
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray36);
        short[] shortArray39 = new short[] { (short) 100 };
        short[] shortArray40 = new short[] {};
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(shortArray39, shortArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray39);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray39);
        java.lang.Class<?> wildcardClass44 = shortArray39.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray29, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray30, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray39, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray40, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 100, (float) 100, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(32L, 35L, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.max(byteArray9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        byte byte23 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray33);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray21);
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte42 = org.apache.commons.lang.math.NumberUtils.min(byteArray41);
        byte byte43 = org.apache.commons.lang.math.NumberUtils.min(byteArray41);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray41);
        java.lang.Class<?> wildcardClass45 = byteArray41.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 1 + "'", byte42 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 1 + "'", byte43 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((-1L), 0L, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        double[] doubleArray0 = null;
        double[] doubleArray1 = null;
        boolean boolean2 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { (byte) 1 };
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long[] longArray9 = new long[] { 0L };
        long long10 = org.apache.commons.lang.math.NumberUtils.max(longArray9);
        long[] longArray12 = new long[] { (byte) 1 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray9, longArray12);
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        long[] longArray16 = new long[] { 0L };
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        long[] longArray19 = new long[] { (byte) 1 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray12);
        long[] longArray24 = new long[] { 0L };
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        long[] longArray27 = new long[] { (byte) 1 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray27);
        long long29 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        long long30 = org.apache.commons.lang.math.NumberUtils.min(longArray27);
        long[] longArray32 = new long[] { 0L };
        long long33 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        long[] longArray35 = new long[] { (byte) 1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray35);
        long long37 = org.apache.commons.lang.math.NumberUtils.max(longArray35);
        long[] longArray39 = new long[] { 0L };
        long long40 = org.apache.commons.lang.math.NumberUtils.max(longArray39);
        long[] longArray42 = new long[] { (byte) 1 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray39, longArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray35, longArray42);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray27, longArray35);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray27);
        java.lang.Class<?> wildcardClass47 = longArray27.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertArrayEquals(longArray9, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertArrayEquals(longArray35, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertArrayEquals(longArray39, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertArrayEquals(longArray42, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 35L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) -1, 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 10, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 1, (long) 10, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) '#', (double) 97L, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 0, 100L, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) ' ', 1, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 1, 52.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray10 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float float12 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray10);
        float[] floatArray21 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float22 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray21);
        float[] floatArray24 = null;
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray24);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-1.0f) + "'", float22 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] {};
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray11);
        short[] shortArray14 = new short[] { (short) 100 };
        short[] shortArray15 = new short[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray14);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray14);
        java.lang.Class<?> wildcardClass19 = shortArray14.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 52.0f, 100.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 0L, (float) ' ', (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(10.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 10, (long) 100, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 1, 52.0f, (float) 35L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 1, (long) 32, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, (double) (byte) 10, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, (float) (byte) 100, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 1, (-1L), 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 0, (float) (byte) 100, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 'a', 32L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100, 32.0d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] {};
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray11);
        short[] shortArray14 = new short[] { (short) 100 };
        short[] shortArray15 = new short[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray14);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray14);
        short short19 = org.apache.commons.lang.math.NumberUtils.max(shortArray5);
        short[] shortArray21 = new short[] { (short) 100 };
        short[] shortArray22 = new short[] {};
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray22);
        short[] shortArray25 = new short[] { (short) 100 };
        short[] shortArray26 = new short[] {};
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray22, shortArray25);
        short[] shortArray30 = new short[] { (short) 100 };
        short[] shortArray31 = new short[] {};
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(shortArray30, shortArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray30);
        short[] shortArray35 = new short[] { (short) 100 };
        short[] shortArray36 = new short[] {};
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray35);
        short[] shortArray40 = new short[] { (short) 100 };
        short[] shortArray41 = new short[] {};
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(shortArray40, shortArray41);
        short[] shortArray44 = new short[] { (short) 100 };
        short[] shortArray45 = new short[] {};
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray44);
        short[] shortArray49 = new short[] { (short) 100 };
        short[] shortArray50 = new short[] {};
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray49, shortArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray49);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray44);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray35);
        short short55 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        short short56 = org.apache.commons.lang.math.NumberUtils.max(shortArray35);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray22);
        org.junit.Assert.assertArrayEquals(shortArray22, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray26, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray30, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertArrayEquals(shortArray31, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray40, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray41, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray44, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray45, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray49, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray50, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 100 + "'", short55 == (short) 100);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 100 + "'", short56 == (short) 100);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 10, (int) (byte) 10, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) -1, 52, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 32, (-1.0d), (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '#', (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '#', (-1L), (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((-1.0d), 10.0d, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 0, (float) (byte) -1, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 10, (float) (byte) 10, (float) 97L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 10, (float) (byte) -1, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10, (double) 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 100L, (float) 10, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '4', (long) 1, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double double10 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double11 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double12 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
        double double13 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
        double double14 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double15 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        java.lang.Class<?> wildcardClass16 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0, (double) 0L, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(10L, (long) (short) 1, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100.0f, 35.0d, 32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 1, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(52, 97, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(10, 0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32.0f, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 0 };
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min(byteArray2);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(byteArray6, byteArray13);
        byte byte15 = org.apache.commons.lang.math.NumberUtils.min(byteArray13);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(byteArray18, byteArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray13, byteArray25);
        byte byte28 = org.apache.commons.lang.math.NumberUtils.max(byteArray25);
        byte[] byteArray30 = new byte[] { (byte) 100 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(byteArray25, byteArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray30);
        byte byte33 = org.apache.commons.lang.math.NumberUtils.min(byteArray2);
        java.lang.Class<?> wildcardClass34 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 100 + "'", byte28 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 0 + "'", byte33 == (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) ' ', (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) 'a', (-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(10.0d, (-1.0d), (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) -1, (double) 35.0f, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 'a', (double) (short) 100, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, (int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 10.0f, 0.0d, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.max(byteArray9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        byte byte23 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray33);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray21);
        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte42 = org.apache.commons.lang.math.NumberUtils.min(byteArray41);
        byte byte43 = org.apache.commons.lang.math.NumberUtils.min(byteArray41);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray41);
        byte byte45 = org.apache.commons.lang.math.NumberUtils.min(byteArray9);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 1 + "'", byte42 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 1 + "'", byte43 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) -1 + "'", byte45 == (byte) -1);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 10, (long) 100, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] {};
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray11);
        short[] shortArray14 = new short[] { (short) 100 };
        short[] shortArray15 = new short[] {};
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray14);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray14);
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short short21 = org.apache.commons.lang.math.NumberUtils.max(shortArray14);
        short short22 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
        short[] shortArray24 = new short[] { (short) 100 };
        short[] shortArray25 = new short[] {};
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray25);
        short[] shortArray28 = new short[] { (short) 100 };
        short[] shortArray29 = new short[] {};
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray28, shortArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(shortArray25, shortArray28);
        short[] shortArray33 = new short[] { (short) 100 };
        short[] shortArray34 = new short[] {};
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(shortArray33, shortArray34);
        short[] shortArray37 = new short[] { (short) 100 };
        short[] shortArray38 = new short[] {};
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray37, shortArray38);
        short[] shortArray41 = new short[] { (short) 100 };
        short[] shortArray42 = new short[] {};
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray38, shortArray41);
        short[] shortArray46 = new short[] { (short) 100 };
        short[] shortArray47 = new short[] {};
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray46, shortArray47);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray46);
        short[] shortArray51 = new short[] { (short) 100 };
        short[] shortArray52 = new short[] {};
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray51, shortArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray51);
        short[] shortArray55 = null;
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(shortArray51, shortArray55);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(shortArray33, shortArray55);
        short short58 = org.apache.commons.lang.math.NumberUtils.min(shortArray33);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(shortArray28, shortArray33);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray28);
        short short61 = org.apache.commons.lang.math.NumberUtils.max(shortArray14);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(shortArray14);
        org.junit.Assert.assertArrayEquals(shortArray14, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 100 + "'", short21 == (short) 100);
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 100 + "'", short22 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray28, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray29, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray33, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray34, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray37, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray38, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray41, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray42, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray46, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray47, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray51, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray52, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + short58 + "' != '" + (short) 100 + "'", short58 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + short61 + "' != '" + (short) 100 + "'", short61 == (short) 100);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) ' ', (double) 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1.0f), (double) 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 0, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int[] intArray8 = new int[] { (short) -1 };
        int int9 = org.apache.commons.lang.math.NumberUtils.min(intArray8);
        int[] intArray11 = new int[] { (short) -1 };
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray11);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray8);
        int int15 = org.apache.commons.lang.math.NumberUtils.max(intArray8);
        int int16 = org.apache.commons.lang.math.NumberUtils.max(intArray8);
        int[] intArray18 = new int[] { (short) -1 };
        int int19 = org.apache.commons.lang.math.NumberUtils.min(intArray18);
        int[] intArray21 = new int[] { (short) -1 };
        int int22 = org.apache.commons.lang.math.NumberUtils.min(intArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray21);
        int[] intArray25 = new int[] { (short) -1 };
        int int26 = org.apache.commons.lang.math.NumberUtils.min(intArray25);
        int[] intArray28 = new int[] { (short) -1 };
        int int29 = org.apache.commons.lang.math.NumberUtils.min(intArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray28);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(intArray21, intArray25);
        int[] intArray33 = new int[] { (short) -1 };
        int int34 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        int[] intArray36 = new int[] { (short) -1 };
        int int37 = org.apache.commons.lang.math.NumberUtils.min(intArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray36);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray33);
        int int40 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        int int41 = org.apache.commons.lang.math.NumberUtils.max(intArray33);
        int int42 = org.apache.commons.lang.math.NumberUtils.max(intArray33);
        int[] intArray47 = new int[] { (short) 10, (short) 100, 'a', 0 };
        int[] intArray49 = new int[] { (short) -1 };
        int int50 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        int[] intArray52 = new int[] { (short) -1 };
        int int53 = org.apache.commons.lang.math.NumberUtils.min(intArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray52);
        int int55 = org.apache.commons.lang.math.NumberUtils.max(intArray49);
        int int56 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        int int57 = org.apache.commons.lang.math.NumberUtils.max(intArray49);
        int[] intArray59 = new int[] { (short) -1 };
        int int60 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        int[] intArray62 = new int[] { (short) -1 };
        int int63 = org.apache.commons.lang.math.NumberUtils.min(intArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(intArray59, intArray62);
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray62);
        int[] intArray67 = new int[] { (short) -1 };
        int int68 = org.apache.commons.lang.math.NumberUtils.min(intArray67);
        int[] intArray70 = new int[] { (short) -1 };
        int int71 = org.apache.commons.lang.math.NumberUtils.min(intArray70);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(intArray67, intArray70);
        int int73 = org.apache.commons.lang.math.NumberUtils.min(intArray67);
        int[] intArray75 = new int[] { (short) -1 };
        int int76 = org.apache.commons.lang.math.NumberUtils.min(intArray75);
        int[] intArray78 = new int[] { (short) -1 };
        int int79 = org.apache.commons.lang.math.NumberUtils.min(intArray78);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(intArray75, intArray78);
        int[] intArray82 = new int[] { (short) -1 };
        int int83 = org.apache.commons.lang.math.NumberUtils.min(intArray82);
        int[] intArray85 = new int[] { (short) -1 };
        int int86 = org.apache.commons.lang.math.NumberUtils.min(intArray85);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(intArray82, intArray85);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(intArray78, intArray82);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(intArray67, intArray82);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(intArray62, intArray67);
        int int91 = org.apache.commons.lang.math.NumberUtils.max(intArray67);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray67);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(intArray47, intArray67);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray67);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray33);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 10, 100, 97, 0 });
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(35L, (-1L), (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(byteArray10, byteArray17);
        byte byte19 = org.apache.commons.lang.math.NumberUtils.min(byteArray17);
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray29);
        byte byte32 = org.apache.commons.lang.math.NumberUtils.min(byteArray29);
        byte[] byteArray35 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(byteArray35, byteArray42);
        byte byte44 = org.apache.commons.lang.math.NumberUtils.min(byteArray42);
        byte[] byteArray47 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray54 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(byteArray47, byteArray54);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(byteArray42, byteArray54);
        byte byte57 = org.apache.commons.lang.math.NumberUtils.max(byteArray54);
        byte[] byteArray59 = new byte[] { (byte) 100 };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(byteArray54, byteArray59);
        byte byte61 = org.apache.commons.lang.math.NumberUtils.max(byteArray59);
        byte[] byteArray68 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(byteArray59, byteArray68);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray59);
        byte[] byteArray73 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray80 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray73, byteArray80);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray73);
        byte byte83 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        byte byte84 = org.apache.commons.lang.math.NumberUtils.min(byteArray29);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray29);
        byte byte86 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) -1 + "'", byte32 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) 100 + "'", byte57 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 100 + "'", byte61 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + byte83 + "' != '" + (byte) 100 + "'", byte83 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) -1 + "'", byte84 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + byte86 + "' != '" + (byte) 100 + "'", byte86 == (byte) 100);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0L, 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 100, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, 32, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (-1L), 1.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0L, (double) (short) -1, (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        short[] shortArray10 = new short[] { (short) 100 };
        short[] shortArray11 = new short[] {};
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray11);
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray10);
        short[] shortArray15 = new short[] { (short) 100 };
        short[] shortArray16 = new short[] {};
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray15, shortArray16);
        short[] shortArray19 = new short[] { (short) 100 };
        short[] shortArray20 = new short[] {};
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(shortArray16, shortArray19);
        short[] shortArray24 = new short[] { (short) 100 };
        short[] shortArray25 = new short[] {};
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray24);
        short short28 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
        short[] shortArray34 = new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (byte) 10 };
        short short35 = org.apache.commons.lang.math.NumberUtils.min(shortArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray34);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray19);
        short short38 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(shortArray10);
        org.junit.Assert.assertArrayEquals(shortArray10, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertArrayEquals(shortArray19, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(shortArray24);
        org.junit.Assert.assertArrayEquals(shortArray24, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray25);
        org.junit.Assert.assertArrayEquals(shortArray25, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 100 + "'", short28 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray34, new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (short) 10 });
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 10 + "'", short35 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + short38 + "' != '" + (short) 100 + "'", short38 == (short) 100);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 10L, (float) 100L, 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) (byte) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 97L, (double) (byte) 10, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (-1L), (float) (byte) 1, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 10, 0L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, 1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10, (double) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { (byte) 1 };
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long[] longArray9 = new long[] { 0L };
        long long10 = org.apache.commons.lang.math.NumberUtils.max(longArray9);
        long[] longArray12 = new long[] { (byte) 1 };
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(longArray9, longArray12);
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        long[] longArray16 = new long[] { 0L };
        long long17 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        long[] longArray19 = new long[] { (byte) 1 };
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray19);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray12);
        java.lang.Class<?> wildcardClass23 = longArray12.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(longArray9);
        org.junit.Assert.assertArrayEquals(longArray9, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (long) '4', (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 10, 32.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray21);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte[] byteArray26 = new byte[] { (byte) 100 };
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray26);
        byte byte28 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte byte29 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
        java.lang.Class<?> wildcardClass30 = byteArray26.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 100 + "'", byte24 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + byte28 + "' != '" + (byte) 100 + "'", byte28 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 100 + "'", byte29 == (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) -1, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 0L, 0.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, 100L, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) ' ', 52, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32L, 1.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray21);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(byteArray27, byteArray34);
        byte byte36 = org.apache.commons.lang.math.NumberUtils.min(byteArray34);
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(byteArray39, byteArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(byteArray34, byteArray46);
        byte byte49 = org.apache.commons.lang.math.NumberUtils.max(byteArray46);
        byte[] byteArray51 = new byte[] { (byte) 100 };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(byteArray46, byteArray51);
        byte byte53 = org.apache.commons.lang.math.NumberUtils.max(byteArray51);
        byte[] byteArray60 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(byteArray51, byteArray60);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray51);
        byte[] byteArray65 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray72 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray72);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray65);
        byte byte75 = org.apache.commons.lang.math.NumberUtils.max(byteArray65);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) -1 + "'", byte36 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + byte49 + "' != '" + (byte) 100 + "'", byte49 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) 100 + "'", byte53 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + byte75 + "' != '" + (byte) 0 + "'", byte75 == (byte) 0);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 35, (long) 97, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 32, (long) (byte) 10, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }
}

