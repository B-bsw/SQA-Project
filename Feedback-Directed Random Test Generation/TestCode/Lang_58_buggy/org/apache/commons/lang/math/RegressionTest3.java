package org.apache.commons.lang.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 1, (-1.0f), (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, 32L, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 10, (long) 10, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) ' ', (float) (byte) 10, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 97, (long) (byte) 10, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(32.0f, (float) 0, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 52, (double) 10L, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray9 = new short[] { (short) 0, (byte) -1, (short) 0, (short) 1, (byte) 0 };
        short[] shortArray11 = new short[] { (short) 100 };
        short[] shortArray12 = new short[] {};
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray12);
        short[] shortArray15 = new short[] { (short) 100 };
        short[] shortArray16 = new short[] {};
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray15, shortArray16);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray15);
        short[] shortArray20 = new short[] { (short) 100 };
        short[] shortArray21 = new short[] {};
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray21);
        short[] shortArray24 = new short[] { (short) 100 };
        short[] shortArray25 = new short[] {};
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray24);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray15, shortArray24);
        short short29 = org.apache.commons.lang.math.NumberUtils.min(shortArray24);
        short short30 = org.apache.commons.lang.math.NumberUtils.min(shortArray24);
        short[] shortArray36 = new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (byte) 10 };
        short short37 = org.apache.commons.lang.math.NumberUtils.min(shortArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray36);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray9, shortArray36);
        short[] shortArray41 = new short[] { (short) 100 };
        short[] shortArray42 = new short[] {};
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray42);
        short[] shortArray45 = new short[] { (short) 100 };
        short[] shortArray46 = new short[] {};
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray42, shortArray45);
        short[] shortArray50 = new short[] { (short) 100 };
        short[] shortArray51 = new short[] {};
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(shortArray50, shortArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray50);
        short[] shortArray55 = new short[] { (short) 100 };
        short[] shortArray56 = new short[] {};
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(shortArray55, shortArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray55);
        short short59 = org.apache.commons.lang.math.NumberUtils.min(shortArray45);
        short short60 = org.apache.commons.lang.math.NumberUtils.min(shortArray45);
        short short61 = org.apache.commons.lang.math.NumberUtils.max(shortArray45);
        short short62 = org.apache.commons.lang.math.NumberUtils.max(shortArray45);
        short short63 = org.apache.commons.lang.math.NumberUtils.max(shortArray45);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(shortArray9, shortArray45);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray9);
        // The following exception was thrown during execution in test generation
        try {
            short short66 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] { (short) 0, (short) -1, (short) 0, (short) 1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 100 + "'", short29 == (short) 100);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 100 + "'", short30 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (short) 10 });
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 10 + "'", short37 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray41, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray42, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray45, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray46, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray50, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray51, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray55, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray56, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + short59 + "' != '" + (short) 100 + "'", short59 == (short) 100);
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) 100 + "'", short60 == (short) 100);
        org.junit.Assert.assertTrue("'" + short61 + "' != '" + (short) 100 + "'", short61 == (short) 100);
        org.junit.Assert.assertTrue("'" + short62 + "' != '" + (short) 100 + "'", short62 == (short) 100);
        org.junit.Assert.assertTrue("'" + short63 + "' != '" + (short) 100 + "'", short63 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        float[] floatArray1 = new float[] { (byte) 10 };
        float float2 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
        float float3 = org.apache.commons.lang.math.NumberUtils.max(floatArray1);
        float[] floatArray10 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float[] floatArray15 = new float[] { (byte) 10 };
        float float16 = org.apache.commons.lang.math.NumberUtils.min(floatArray15);
        float float17 = org.apache.commons.lang.math.NumberUtils.max(floatArray15);
        float[] floatArray24 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float25 = org.apache.commons.lang.math.NumberUtils.min(floatArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(floatArray15, floatArray24);
        float float27 = org.apache.commons.lang.math.NumberUtils.max(floatArray24);
        float[] floatArray32 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float33 = org.apache.commons.lang.math.NumberUtils.min(floatArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(floatArray24, floatArray32);
        float float35 = org.apache.commons.lang.math.NumberUtils.max(floatArray24);
        float[] floatArray38 = new float[] { 97L, 'a' };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(floatArray24, floatArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray38);
        float[] floatArray45 = new float[] { (byte) 0, (-1.0f), (short) 1, (-1.0f) };
        float float46 = org.apache.commons.lang.math.NumberUtils.max(floatArray45);
        float[] floatArray51 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float52 = org.apache.commons.lang.math.NumberUtils.min(floatArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(floatArray45, floatArray51);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(floatArray38, floatArray45);
        float float55 = org.apache.commons.lang.math.NumberUtils.max(floatArray38);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertArrayEquals(floatArray32, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertArrayEquals(floatArray38, new float[] { 97.0f, 97.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertArrayEquals(floatArray45, new float[] { 0.0f, (-1.0f), 1.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 1.0f + "'", float46 == 1.0f);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertArrayEquals(floatArray51, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + (-1.0f) + "'", float52 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 97.0f + "'", float55 == 97.0f);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(1.0f, (float) 35L, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 52, (-1.0f), (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 100, (float) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 100, (long) '4', (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, (int) '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        int[] intArray4 = new int[] { (short) 10, (short) 100, 'a', 0 };
        int[] intArray6 = new int[] { (short) -1 };
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray6);
        int[] intArray9 = new int[] { (short) -1 };
        int int10 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray9);
        int int12 = org.apache.commons.lang.math.NumberUtils.max(intArray6);
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang.math.NumberUtils.max(intArray6);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray19);
        int int22 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        int[] intArray24 = new int[] { (short) -1 };
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray24);
        int[] intArray27 = new int[] { (short) -1 };
        int int28 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray27);
        int int30 = org.apache.commons.lang.math.NumberUtils.min(intArray24);
        int[] intArray32 = new int[] { (short) -1 };
        int int33 = org.apache.commons.lang.math.NumberUtils.min(intArray32);
        int[] intArray35 = new int[] { (short) -1 };
        int int36 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(intArray32, intArray35);
        int[] intArray39 = new int[] { (short) -1 };
        int int40 = org.apache.commons.lang.math.NumberUtils.min(intArray39);
        int[] intArray42 = new int[] { (short) -1 };
        int int43 = org.apache.commons.lang.math.NumberUtils.min(intArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(intArray39, intArray42);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray39);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray39);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray19, intArray24);
        int int48 = org.apache.commons.lang.math.NumberUtils.max(intArray24);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(intArray6, intArray24);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray24);
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        int int52 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 10, 100, 97, 0 });
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
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
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        short short26 = org.apache.commons.lang.math.NumberUtils.min(shortArray1);
        short[] shortArray28 = new short[] { (short) 100 };
        short[] shortArray29 = new short[] {};
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray28, shortArray29);
        short[] shortArray32 = new short[] { (short) 100 };
        short[] shortArray33 = new short[] {};
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray32);
        short[] shortArray37 = new short[] { (short) 100 };
        short[] shortArray38 = new short[] {};
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray37, shortArray38);
        short[] shortArray41 = new short[] { (short) 100 };
        short[] shortArray42 = new short[] {};
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray38, shortArray41);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray41);
        short[] shortArray46 = new short[] {};
        short[] shortArray48 = new short[] { (short) 100 };
        short[] shortArray49 = new short[] {};
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(shortArray48, shortArray49);
        short[] shortArray52 = new short[] { (short) 100 };
        short[] shortArray53 = new short[] {};
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(shortArray49, shortArray52);
        short[] shortArray57 = new short[] { (short) 100 };
        short[] shortArray58 = new short[] {};
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(shortArray57, shortArray58);
        short[] shortArray61 = new short[] { (short) 100 };
        short[] shortArray62 = new short[] {};
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(shortArray61, shortArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(shortArray58, shortArray61);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray61);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(shortArray46, shortArray52);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray46);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray41);
        java.lang.Class<?> wildcardClass69 = shortArray1.getClass();
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
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 100 + "'", short26 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray28, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray29, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray32, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray33, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray46, new short[] {});
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray48, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray49, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray52, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray53, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray57, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray58, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray61, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray62, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) (byte) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(1L, (long) 1, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(10.0d, (double) 32L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(52, 35, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (-1L), (double) (-1.0f), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(97.0d, (double) 32.0f, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(1, (int) '#', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        byte byte33 = org.apache.commons.lang.math.NumberUtils.min(byteArray30);
        byte[] byteArray36 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(byteArray36, byteArray43);
        byte byte45 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte[] byteArray48 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(byteArray48, byteArray55);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray55);
        byte byte58 = org.apache.commons.lang.math.NumberUtils.max(byteArray55);
        byte[] byteArray60 = new byte[] { (byte) 100 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(byteArray55, byteArray60);
        byte byte62 = org.apache.commons.lang.math.NumberUtils.max(byteArray60);
        byte[] byteArray69 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(byteArray60, byteArray69);
        byte byte71 = org.apache.commons.lang.math.NumberUtils.min(byteArray60);
        byte byte72 = org.apache.commons.lang.math.NumberUtils.max(byteArray60);
        byte[] byteArray77 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        byte byte78 = org.apache.commons.lang.math.NumberUtils.max(byteArray77);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(byteArray60, byteArray77);
        byte byte80 = org.apache.commons.lang.math.NumberUtils.min(byteArray77);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray30, byteArray77);
        java.lang.Class<?> wildcardClass82 = byteArray30.getClass();
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
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) 100 + "'", byte33 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) -1 + "'", byte45 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + byte58 + "' != '" + (byte) 100 + "'", byte58 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) 100 + "'", byte62 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + byte71 + "' != '" + (byte) 100 + "'", byte71 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte72 + "' != '" + (byte) 100 + "'", byte72 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte78 + "' != '" + (byte) 10 + "'", byte78 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) -1 + "'", byte80 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 1, (double) (byte) -1, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
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
        short[] shortArray36 = new short[] { (short) 100 };
        short[] shortArray37 = new short[] {};
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray36);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray36);
        short short41 = org.apache.commons.lang.math.NumberUtils.max(shortArray36);
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
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray37, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + short41 + "' != '" + (short) 100 + "'", short41 == (short) 100);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray7 = new long[] { 52, (-1), '4', 100L };
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray7);
        long[] longArray11 = new long[] { 0L };
        long long12 = org.apache.commons.lang.math.NumberUtils.max(longArray11);
        long[] longArray14 = new long[] { (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray14);
        long long16 = org.apache.commons.lang.math.NumberUtils.max(longArray14);
        long[] longArray18 = new long[] { 0L };
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long[] longArray21 = new long[] { (byte) 1 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray21);
        long[] longArray25 = new long[] { 0L };
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray21, longArray25);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray21);
        long long29 = org.apache.commons.lang.math.NumberUtils.max(longArray21);
        long long30 = org.apache.commons.lang.math.NumberUtils.min(longArray21);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { 52L, (-1L), 52L, 100L });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 0, 0L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 10, 35, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 1, 0.0f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 'a', 0.0d, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32.0f, (double) (short) -1, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) -1, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 10, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(100.0d, (double) 32L, (double) 97L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 97, (long) 32, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(100, 52, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) ' ', (long) (short) 0, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 1, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(100L, (long) 0, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(10.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 35, (double) 10L, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (-1), 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 10, (int) (byte) 10, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32, (double) 0L, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        java.lang.Class<?> wildcardClass14 = shortArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray9 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray5);
        double double12 = org.apache.commons.lang.math.NumberUtils.max(doubleArray5);
        double double13 = org.apache.commons.lang.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(35.0f, (float) 32L, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 100, (long) 'a', (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, (float) (byte) 10, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '4', (int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 35, (double) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, (int) (byte) 0, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        float float32 = org.apache.commons.lang.math.NumberUtils.max(floatArray11);
        java.lang.Class<?> wildcardClass33 = floatArray11.getClass();
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
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100.0f + "'", float32 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) ' ', 35L, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
        long long14 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long long15 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray17 = new long[] { 0L };
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long[] longArray20 = new long[] { (byte) 1 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray20);
        long long24 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        java.lang.Class<?> wildcardClass25 = longArray20.getClass();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        double double47 = org.apache.commons.lang.math.NumberUtils.max(doubleArray45);
        double double48 = org.apache.commons.lang.math.NumberUtils.max(doubleArray45);
        double double49 = org.apache.commons.lang.math.NumberUtils.min(doubleArray45);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray45);
        double[] doubleArray55 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray59 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray55, doubleArray59);
        double double61 = org.apache.commons.lang.math.NumberUtils.max(doubleArray55);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray55);
        double double63 = org.apache.commons.lang.math.NumberUtils.min(doubleArray55);
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
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 52.0d + "'", double61 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(100.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        short[] shortArray5 = new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (byte) 10 };
        short short6 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
        short[] shortArray8 = new short[] { (short) 100 };
        short[] shortArray9 = new short[] {};
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(shortArray8, shortArray9);
        short[] shortArray12 = new short[] { (short) 100 };
        short[] shortArray13 = new short[] {};
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray9, shortArray12);
        short[] shortArray17 = new short[] { (short) 100 };
        short[] shortArray18 = new short[] {};
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(shortArray17, shortArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray17);
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
        short[] shortArray35 = new short[] { (short) 100 };
        short[] shortArray36 = new short[] {};
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray35);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray35);
        short short40 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray35);
        short[] shortArray43 = new short[] { (short) 100 };
        short[] shortArray44 = new short[] {};
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray43, shortArray44);
        short[] shortArray47 = new short[] { (short) 100 };
        short[] shortArray48 = new short[] {};
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(shortArray47, shortArray48);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray47);
        short[] shortArray52 = new short[] { (short) 100 };
        short[] shortArray53 = new short[] {};
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray53);
        short[] shortArray56 = new short[] { (short) 100 };
        short[] shortArray57 = new short[] {};
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(shortArray56, shortArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(shortArray53, shortArray56);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(shortArray47, shortArray56);
        short short61 = org.apache.commons.lang.math.NumberUtils.min(shortArray56);
        short short62 = org.apache.commons.lang.math.NumberUtils.min(shortArray56);
        short short63 = org.apache.commons.lang.math.NumberUtils.max(shortArray56);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray56);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray56);
        short short66 = org.apache.commons.lang.math.NumberUtils.max(shortArray56);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (short) 10 });
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
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
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) 100 + "'", short40 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray43, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray44, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray47, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray48, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray52, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray53, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray56, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray57, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + short61 + "' != '" + (short) 100 + "'", short61 == (short) 100);
        org.junit.Assert.assertTrue("'" + short62 + "' != '" + (short) 100 + "'", short62 == (short) 100);
        org.junit.Assert.assertTrue("'" + short63 + "' != '" + (short) 100 + "'", short63 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) 100 + "'", short66 == (short) 100);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(10.0d, (double) (byte) 10, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 10, (double) 0, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 1, (float) ' ', (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '4', 32, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 100, (double) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '#', (float) (short) 100, (float) 52L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 0, 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(10.0f, (float) (short) -1, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray9 = null;
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray9);
        int int11 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray13 = new int[] { (short) -1 };
        int int14 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        int[] intArray16 = new int[] { (short) -1 };
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray16);
        int[] intArray20 = new int[] { (short) -1 };
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        int[] intArray23 = new int[] { (short) -1 };
        int int24 = org.apache.commons.lang.math.NumberUtils.min(intArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray23);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray20);
        int[] intArray28 = new int[] { (short) -1 };
        int int29 = org.apache.commons.lang.math.NumberUtils.min(intArray28);
        int[] intArray31 = new int[] { (short) -1 };
        int int32 = org.apache.commons.lang.math.NumberUtils.min(intArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(intArray28, intArray31);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray28);
        int int35 = org.apache.commons.lang.math.NumberUtils.min(intArray28);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray28);
        int[] intArray38 = new int[] { (short) -1 };
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray38);
        int[] intArray41 = new int[] { (short) -1 };
        int int42 = org.apache.commons.lang.math.NumberUtils.min(intArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(intArray38, intArray41);
        int[] intArray45 = new int[] { (short) -1 };
        int int46 = org.apache.commons.lang.math.NumberUtils.min(intArray45);
        int[] intArray48 = new int[] { (short) -1 };
        int int49 = org.apache.commons.lang.math.NumberUtils.min(intArray48);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(intArray45, intArray48);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray45);
        int[] intArray53 = new int[] { (short) -1 };
        int int54 = org.apache.commons.lang.math.NumberUtils.min(intArray53);
        int[] intArray56 = new int[] { (short) -1 };
        int int57 = org.apache.commons.lang.math.NumberUtils.min(intArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(intArray53, intArray56);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(intArray45, intArray53);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(intArray28, intArray53);
        int int61 = org.apache.commons.lang.math.NumberUtils.max(intArray53);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double double10 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double11 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
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
        double double36 = org.apache.commons.lang.math.NumberUtils.max(doubleArray17);
        double double37 = org.apache.commons.lang.math.NumberUtils.min(doubleArray17);
        double[] doubleArray42 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray46 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray46);
        double[] doubleArray52 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray56 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray52, doubleArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray52);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray42);
        double[] doubleArray64 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray68 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray64, doubleArray68);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray68);
        double double71 = org.apache.commons.lang.math.NumberUtils.max(doubleArray42);
        double[] doubleArray76 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray80 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray76, doubleArray80);
        double double82 = org.apache.commons.lang.math.NumberUtils.max(doubleArray80);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray80);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray42);
        double double85 = org.apache.commons.lang.math.NumberUtils.max(doubleArray42);
        double double86 = org.apache.commons.lang.math.NumberUtils.max(doubleArray42);
        double double87 = org.apache.commons.lang.math.NumberUtils.max(doubleArray42);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
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
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 52.0d + "'", double36 == 52.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 52.0d + "'", double71 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 100.0d + "'", double82 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 52.0d + "'", double85 == 52.0d);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 52.0d + "'", double86 == 52.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 52.0d + "'", double87 == 52.0d);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32, (double) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 1, (float) (byte) 1, 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        short short26 = org.apache.commons.lang.math.NumberUtils.min(shortArray1);
        short[] shortArray28 = new short[] { (short) 100 };
        short[] shortArray29 = new short[] {};
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray28, shortArray29);
        short[] shortArray32 = new short[] { (short) 100 };
        short[] shortArray33 = new short[] {};
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray32);
        short[] shortArray37 = new short[] { (short) 100 };
        short[] shortArray38 = new short[] {};
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray37, shortArray38);
        short[] shortArray41 = new short[] { (short) 100 };
        short[] shortArray42 = new short[] {};
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray38, shortArray41);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray41);
        short[] shortArray46 = new short[] {};
        short[] shortArray48 = new short[] { (short) 100 };
        short[] shortArray49 = new short[] {};
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(shortArray48, shortArray49);
        short[] shortArray52 = new short[] { (short) 100 };
        short[] shortArray53 = new short[] {};
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(shortArray49, shortArray52);
        short[] shortArray57 = new short[] { (short) 100 };
        short[] shortArray58 = new short[] {};
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(shortArray57, shortArray58);
        short[] shortArray61 = new short[] { (short) 100 };
        short[] shortArray62 = new short[] {};
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(shortArray61, shortArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(shortArray58, shortArray61);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray61);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(shortArray46, shortArray52);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray46);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray41);
        short short69 = org.apache.commons.lang.math.NumberUtils.min(shortArray41);
        short short70 = org.apache.commons.lang.math.NumberUtils.min(shortArray41);
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
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 100 + "'", short26 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray28, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray29, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray32, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray33, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray46, new short[] {});
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray48, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray49, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray52, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray53, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray57, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray58, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray61, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray62, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + short69 + "' != '" + (short) 100 + "'", short69 == (short) 100);
        org.junit.Assert.assertTrue("'" + short70 + "' != '" + (short) 100 + "'", short70 == (short) 100);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(52L, (long) (byte) -1, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 0, 0.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 100, (float) 10L, 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (long) (short) 100, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 97.0f, (double) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) (byte) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 32L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) (byte) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        long[] longArray0 = null;
        long[] longArray2 = new long[] { 0L };
        long long3 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray5 = new long[] { (byte) 1 };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray5);
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray5);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray5);
        long[] longArray10 = new long[] { 0L };
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray10);
        long[] longArray13 = new long[] { (byte) 1 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(longArray10, longArray13);
        long long15 = org.apache.commons.lang.math.NumberUtils.min(longArray13);
        long[] longArray17 = new long[] { 0L };
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long[] longArray20 = new long[] { (byte) 1 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long[] longArray24 = new long[] { 0L };
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        long[] longArray27 = new long[] { (byte) 1 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray27);
        long long30 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        long long31 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long[] longArray33 = new long[] { 0L };
        long long34 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long[] longArray36 = new long[] { (byte) 1 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray36);
        long long38 = org.apache.commons.lang.math.NumberUtils.min(longArray36);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray36);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray36);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray5, longArray13);
        long[] longArray43 = new long[] { 1 };
        long long44 = org.apache.commons.lang.math.NumberUtils.max(longArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray5, longArray43);
        long[] longArray47 = new long[] { 0L };
        long long48 = org.apache.commons.lang.math.NumberUtils.max(longArray47);
        long[] longArray50 = new long[] { (byte) 1 };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray47, longArray50);
        long long52 = org.apache.commons.lang.math.NumberUtils.min(longArray50);
        long long53 = org.apache.commons.lang.math.NumberUtils.min(longArray50);
        long long54 = org.apache.commons.lang.math.NumberUtils.min(longArray50);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(longArray5, longArray50);
        java.lang.Class<?> wildcardClass56 = longArray5.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertArrayEquals(longArray36, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertArrayEquals(longArray43, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertArrayEquals(longArray47, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertArrayEquals(longArray50, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        short short45 = org.apache.commons.lang.math.NumberUtils.max(shortArray14);
        short short46 = org.apache.commons.lang.math.NumberUtils.max(shortArray14);
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
        org.junit.Assert.assertTrue("'" + short45 + "' != '" + (short) 100 + "'", short45 == (short) 100);
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 100 + "'", short46 == (short) 100);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) ' ', (double) 32, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0L, 0.0d, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (-1), (float) '4', (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(52, (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(1, (int) (short) 1, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 1, 0L, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        double[] doubleArray30 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray34 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray34);
        double[] doubleArray40 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray44 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray40, doubleArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray40);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray30);
        double[] doubleArray52 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray56 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray52, doubleArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray56);
        double double59 = org.apache.commons.lang.math.NumberUtils.max(doubleArray30);
        double double60 = org.apache.commons.lang.math.NumberUtils.max(doubleArray30);
        double[] doubleArray61 = null;
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray61);
        // The following exception was thrown during execution in test generation
        try {
            double double63 = org.apache.commons.lang.math.NumberUtils.min(doubleArray61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 52.0d + "'", double59 == 52.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 52.0d + "'", double60 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) -1, (float) 1, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 100, (long) 0, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, (float) (short) 0, (float) 97L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        byte byte28 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
        byte byte29 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte[] byteArray32 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray32, byteArray39);
        byte byte41 = org.apache.commons.lang.math.NumberUtils.min(byteArray39);
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray51 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(byteArray44, byteArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(byteArray39, byteArray51);
        byte[] byteArray54 = null;
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray64 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(byteArray57, byteArray64);
        byte byte66 = org.apache.commons.lang.math.NumberUtils.min(byteArray64);
        byte[] byteArray69 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(byteArray69, byteArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(byteArray64, byteArray76);
        byte byte79 = org.apache.commons.lang.math.NumberUtils.max(byteArray76);
        byte[] byteArray81 = new byte[] { (byte) 100 };
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(byteArray76, byteArray81);
        byte byte83 = org.apache.commons.lang.math.NumberUtils.max(byteArray81);
        byte[] byteArray90 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(byteArray81, byteArray90);
        byte byte92 = org.apache.commons.lang.math.NumberUtils.min(byteArray81);
        byte byte93 = org.apache.commons.lang.math.NumberUtils.min(byteArray81);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(byteArray54, byteArray81);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(byteArray39, byteArray54);
        byte byte96 = org.apache.commons.lang.math.NumberUtils.max(byteArray39);
        byte byte97 = org.apache.commons.lang.math.NumberUtils.min(byteArray39);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray39);
        byte byte99 = org.apache.commons.lang.math.NumberUtils.min(byteArray39);
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
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) -1 + "'", byte41 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) -1 + "'", byte66 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + byte79 + "' != '" + (byte) 100 + "'", byte79 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + byte83 + "' != '" + (byte) 100 + "'", byte83 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + byte92 + "' != '" + (byte) 100 + "'", byte92 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte93 + "' != '" + (byte) 100 + "'", byte93 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + byte96 + "' != '" + (byte) 100 + "'", byte96 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte97 + "' != '" + (byte) -1 + "'", byte97 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + byte99 + "' != '" + (byte) -1 + "'", byte99 == (byte) -1);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, 97L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 1, (int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 1.0f, (double) (byte) 10, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(10, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10.0f, (double) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32.0f, (double) 32, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0, (double) 52.0f, (double) 35L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        byte byte28 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
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
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        short[] shortArray5 = new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (byte) 10 };
        short short6 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
        short[] shortArray8 = new short[] { (short) 100 };
        short[] shortArray9 = new short[] {};
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(shortArray8, shortArray9);
        short[] shortArray12 = new short[] { (short) 100 };
        short[] shortArray13 = new short[] {};
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(shortArray9, shortArray12);
        short[] shortArray17 = new short[] { (short) 100 };
        short[] shortArray18 = new short[] {};
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(shortArray17, shortArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray17);
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
        short[] shortArray35 = new short[] { (short) 100 };
        short[] shortArray36 = new short[] {};
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray35);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray35);
        short short40 = org.apache.commons.lang.math.NumberUtils.min(shortArray35);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray35);
        short[] shortArray43 = new short[] { (short) 100 };
        short[] shortArray44 = new short[] {};
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray43, shortArray44);
        short[] shortArray47 = new short[] { (short) 100 };
        short[] shortArray48 = new short[] {};
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(shortArray47, shortArray48);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray47);
        short[] shortArray52 = new short[] { (short) 100 };
        short[] shortArray53 = new short[] {};
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray53);
        short[] shortArray56 = new short[] { (short) 100 };
        short[] shortArray57 = new short[] {};
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(shortArray56, shortArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(shortArray53, shortArray56);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(shortArray47, shortArray56);
        short short61 = org.apache.commons.lang.math.NumberUtils.min(shortArray56);
        short short62 = org.apache.commons.lang.math.NumberUtils.min(shortArray56);
        short short63 = org.apache.commons.lang.math.NumberUtils.max(shortArray56);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray56);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray56);
        short short66 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
        short short67 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (short) 10 });
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray13);
        org.junit.Assert.assertArrayEquals(shortArray13, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray18);
        org.junit.Assert.assertArrayEquals(shortArray18, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
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
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) 100 + "'", short40 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray43, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray44, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray47, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray48, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray52, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray53, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray56, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray57, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + short61 + "' != '" + (short) 100 + "'", short61 == (short) 100);
        org.junit.Assert.assertTrue("'" + short62 + "' != '" + (short) 100 + "'", short62 == (short) 100);
        org.junit.Assert.assertTrue("'" + short63 + "' != '" + (short) 100 + "'", short63 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + short66 + "' != '" + (short) 10 + "'", short66 == (short) 10);
        org.junit.Assert.assertTrue("'" + short67 + "' != '" + (short) 10 + "'", short67 == (short) 10);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        float[] floatArray1 = new float[] { (byte) 10 };
        float float2 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
        float float3 = org.apache.commons.lang.math.NumberUtils.max(floatArray1);
        float[] floatArray5 = new float[] { (-1L) };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray5);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertArrayEquals(floatArray5, new float[] { (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float8 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray14 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray14);
        float[] floatArray17 = new float[] { (byte) 10 };
        float float18 = org.apache.commons.lang.math.NumberUtils.min(floatArray17);
        float float19 = org.apache.commons.lang.math.NumberUtils.max(floatArray17);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(floatArray14, floatArray17);
        float[] floatArray25 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float26 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float[] floatArray33 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float34 = org.apache.commons.lang.math.NumberUtils.min(floatArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(floatArray25, floatArray33);
        float[] floatArray40 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float41 = org.apache.commons.lang.math.NumberUtils.min(floatArray40);
        float[] floatArray46 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float47 = org.apache.commons.lang.math.NumberUtils.min(floatArray46);
        float float48 = org.apache.commons.lang.math.NumberUtils.max(floatArray46);
        float float49 = org.apache.commons.lang.math.NumberUtils.min(floatArray46);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(floatArray40, floatArray46);
        float[] floatArray57 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float58 = org.apache.commons.lang.math.NumberUtils.min(floatArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(floatArray40, floatArray57);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray57);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray33);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray17);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray14);
        org.junit.Assert.assertArrayEquals(floatArray14, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertArrayEquals(floatArray33, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-1.0f) + "'", float34 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertArrayEquals(floatArray40, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-1.0f) + "'", float41 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertArrayEquals(floatArray46, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + (-1.0f) + "'", float47 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 100.0f + "'", float48 == 100.0f);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + (-1.0f) + "'", float49 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(floatArray57);
        org.junit.Assert.assertArrayEquals(floatArray57, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + (-1.0f) + "'", float58 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, 35, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, (float) (-1), (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) 'a', 10, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(97.0f, 0.0f, (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(97.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 35, 35.0d, (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) -1, (float) (short) 0, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) -1, (long) (byte) -1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        short[] shortArray26 = new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (byte) 10 };
        short short27 = org.apache.commons.lang.math.NumberUtils.min(shortArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray26);
        short[] shortArray30 = new short[] { (short) 100 };
        short[] shortArray31 = new short[] {};
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(shortArray30, shortArray31);
        short[] shortArray34 = new short[] { (short) 100 };
        short[] shortArray35 = new short[] {};
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray34, shortArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(shortArray31, shortArray34);
        short[] shortArray39 = new short[] { (short) 100 };
        short[] shortArray40 = new short[] {};
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(shortArray39, shortArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(shortArray34, shortArray39);
        short[] shortArray44 = new short[] { (short) 100 };
        short[] shortArray45 = new short[] {};
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray45);
        short[] shortArray48 = new short[] { (short) 100 };
        short[] shortArray49 = new short[] {};
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(shortArray48, shortArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray48);
        short[] shortArray53 = new short[] { (short) 100 };
        short[] shortArray54 = new short[] {};
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(shortArray53, shortArray54);
        short[] shortArray57 = new short[] { (short) 100 };
        short[] shortArray58 = new short[] {};
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(shortArray57, shortArray58);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(shortArray54, shortArray57);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(shortArray48, shortArray57);
        short short62 = org.apache.commons.lang.math.NumberUtils.min(shortArray57);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(shortArray34, shortArray57);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray34);
        short short65 = org.apache.commons.lang.math.NumberUtils.min(shortArray14);
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
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertArrayEquals(shortArray26, new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (short) 10 });
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 10 + "'", short27 == (short) 10);
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
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray39, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray40);
        org.junit.Assert.assertArrayEquals(shortArray40, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray44, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray45, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray48, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray49, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray53, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray54, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray57, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray58, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + short62 + "' != '" + (short) 100 + "'", short62 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + short65 + "' != '" + (short) 100 + "'", short65 == (short) 100);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        int[] intArray33 = new int[] { (short) -1 };
        int int34 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        int[] intArray36 = new int[] { (short) -1 };
        int int37 = org.apache.commons.lang.math.NumberUtils.min(intArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray36);
        int[] intArray40 = new int[] { (short) -1 };
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray40);
        int[] intArray43 = new int[] { (short) -1 };
        int int44 = org.apache.commons.lang.math.NumberUtils.min(intArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray43);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray36, intArray40);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray40);
        int[] intArray49 = new int[] { (short) -1 };
        int int50 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        int[] intArray52 = new int[] { (short) -1 };
        int int53 = org.apache.commons.lang.math.NumberUtils.min(intArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray52);
        int int55 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        int int56 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray49);
        int int58 = org.apache.commons.lang.math.NumberUtils.min(intArray25);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray25);
        int[] intArray61 = new int[] { (short) -1 };
        int int62 = org.apache.commons.lang.math.NumberUtils.min(intArray61);
        int[] intArray64 = new int[] { (short) -1 };
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(intArray61, intArray64);
        int[] intArray68 = new int[] { (short) -1 };
        int int69 = org.apache.commons.lang.math.NumberUtils.min(intArray68);
        int[] intArray71 = new int[] { (short) -1 };
        int int72 = org.apache.commons.lang.math.NumberUtils.min(intArray71);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(intArray68, intArray71);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(intArray64, intArray68);
        int int75 = org.apache.commons.lang.math.NumberUtils.min(intArray68);
        int[] intArray77 = new int[] { (short) -1 };
        int int78 = org.apache.commons.lang.math.NumberUtils.min(intArray77);
        int[] intArray80 = new int[] { (short) -1 };
        int int81 = org.apache.commons.lang.math.NumberUtils.min(intArray80);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(intArray77, intArray80);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(intArray68, intArray77);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray68);
        int int85 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
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
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertArrayEquals(intArray77, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 10, 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 100, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double double10 = org.apache.commons.lang.math.NumberUtils.min(doubleArray4);
        double double11 = org.apache.commons.lang.math.NumberUtils.max(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        short short19 = org.apache.commons.lang.math.NumberUtils.max(shortArray14);
        java.lang.Class<?> wildcardClass20 = shortArray14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 1, (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (-1), (long) 97, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 0, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) 'a', (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 10, (int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 10, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 0, (long) 32, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 100, (long) 52, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 1, (double) '4', (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, (double) 32.0f, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 100, 97.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 'a', (long) (-1), (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(32L, (long) (byte) 1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray10 = new int[] { (short) -1 };
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray10);
        int[] intArray13 = new int[] { (short) -1 };
        int int14 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(intArray10, intArray13);
        int[] intArray17 = new int[] { (short) -1 };
        int int18 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        int[] intArray20 = new int[] { (short) -1 };
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray13, intArray17);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray13);
        int int25 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32, (double) 52L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(100.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(1L, (long) 'a', (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray7 = new float[] { (byte) 10 };
        float float8 = org.apache.commons.lang.math.NumberUtils.min(floatArray7);
        float float9 = org.apache.commons.lang.math.NumberUtils.max(floatArray7);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray7);
        float[] floatArray12 = new float[] { (byte) 10 };
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray12);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        float[] floatArray21 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float22 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray21);
        float float24 = org.apache.commons.lang.math.NumberUtils.max(floatArray21);
        float[] floatArray28 = new float[] { 97.0f, 0L, 32L };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray21);
        float[] floatArray32 = new float[] { (byte) 10 };
        float float33 = org.apache.commons.lang.math.NumberUtils.min(floatArray32);
        float float34 = org.apache.commons.lang.math.NumberUtils.max(floatArray32);
        float[] floatArray41 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float42 = org.apache.commons.lang.math.NumberUtils.min(floatArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(floatArray32, floatArray41);
        float[] floatArray45 = new float[] { (byte) 10 };
        float float46 = org.apache.commons.lang.math.NumberUtils.min(floatArray45);
        float float47 = org.apache.commons.lang.math.NumberUtils.max(floatArray45);
        float[] floatArray54 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float55 = org.apache.commons.lang.math.NumberUtils.min(floatArray54);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(floatArray45, floatArray54);
        float float57 = org.apache.commons.lang.math.NumberUtils.max(floatArray54);
        float[] floatArray61 = new float[] { 97.0f, 0L, 32L };
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(floatArray54, floatArray61);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(floatArray32, floatArray54);
        float[] floatArray65 = new float[] { (byte) 10 };
        float float66 = org.apache.commons.lang.math.NumberUtils.min(floatArray65);
        float float67 = org.apache.commons.lang.math.NumberUtils.max(floatArray65);
        float[] floatArray74 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float75 = org.apache.commons.lang.math.NumberUtils.min(floatArray74);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(floatArray65, floatArray74);
        float float77 = org.apache.commons.lang.math.NumberUtils.max(floatArray74);
        float[] floatArray82 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float83 = org.apache.commons.lang.math.NumberUtils.min(floatArray82);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(floatArray74, floatArray82);
        float[] floatArray85 = null;
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(floatArray82, floatArray85);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(floatArray54, floatArray85);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray85);
        float float89 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float90 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + (-1.0f) + "'", float22 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] { 97.0f, 0.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertArrayEquals(floatArray32, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 10.0f + "'", float33 == 10.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 10.0f + "'", float34 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertArrayEquals(floatArray41, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-1.0f) + "'", float42 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertArrayEquals(floatArray45, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 10.0f + "'", float46 == 10.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 10.0f + "'", float47 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertArrayEquals(floatArray54, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + (-1.0f) + "'", float55 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 100.0f + "'", float57 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray61);
        org.junit.Assert.assertArrayEquals(floatArray61, new float[] { 97.0f, 0.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(floatArray65);
        org.junit.Assert.assertArrayEquals(floatArray65, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float66 + "' != '" + 10.0f + "'", float66 == 10.0f);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 10.0f + "'", float67 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray74);
        org.junit.Assert.assertArrayEquals(floatArray74, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + (-1.0f) + "'", float75 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + float77 + "' != '" + 100.0f + "'", float77 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray82);
        org.junit.Assert.assertArrayEquals(floatArray82, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float83 + "' != '" + (-1.0f) + "'", float83 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + float89 + "' != '" + 100.0f + "'", float89 == 100.0f);
        org.junit.Assert.assertTrue("'" + float90 + "' != '" + 100.0f + "'", float90 == 100.0f);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 35, (long) 'a', 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '4', 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 'a', (long) (byte) 0, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 'a', (double) (short) 1, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 'a', 0L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(97.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) '#', (double) (byte) 10, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32.0f, (double) (byte) 10, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray12 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray12);
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray12);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        float float17 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        float float18 = org.apache.commons.lang.math.NumberUtils.min(floatArray12);
        float float19 = org.apache.commons.lang.math.NumberUtils.min(floatArray12);
        float[] floatArray20 = null;
        float[] floatArray25 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float26 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float[] floatArray33 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float34 = org.apache.commons.lang.math.NumberUtils.min(floatArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(floatArray25, floatArray33);
        float float36 = org.apache.commons.lang.math.NumberUtils.max(floatArray33);
        float[] floatArray41 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float42 = org.apache.commons.lang.math.NumberUtils.min(floatArray41);
        float[] floatArray49 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float50 = org.apache.commons.lang.math.NumberUtils.min(floatArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(floatArray41, floatArray49);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray49);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(floatArray20, floatArray49);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray20);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertArrayEquals(floatArray33, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-1.0f) + "'", float34 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 100.0f + "'", float36 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertArrayEquals(floatArray41, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-1.0f) + "'", float42 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertArrayEquals(floatArray49, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + (-1.0f) + "'", float50 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(10.0f, (float) 100L, (float) 32);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(100.0d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32.0f, 1.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray21);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray33);
        byte byte35 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray33);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte[] byteArray38 = null;
        byte[] byteArray41 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray48 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(byteArray41, byteArray48);
        byte byte50 = org.apache.commons.lang.math.NumberUtils.max(byteArray48);
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray60 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(byteArray53, byteArray60);
        byte byte62 = org.apache.commons.lang.math.NumberUtils.min(byteArray60);
        byte[] byteArray65 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray72 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray72);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(byteArray60, byteArray72);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(byteArray48, byteArray60);
        byte[] byteArray80 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte81 = org.apache.commons.lang.math.NumberUtils.min(byteArray80);
        byte byte82 = org.apache.commons.lang.math.NumberUtils.min(byteArray80);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(byteArray48, byteArray80);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(byteArray38, byteArray80);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray80);
        byte[] byteArray88 = new byte[] { (byte) 0, (byte) 0 };
        byte byte89 = org.apache.commons.lang.math.NumberUtils.min(byteArray88);
        byte byte90 = org.apache.commons.lang.math.NumberUtils.min(byteArray88);
        byte byte91 = org.apache.commons.lang.math.NumberUtils.max(byteArray88);
        byte byte92 = org.apache.commons.lang.math.NumberUtils.min(byteArray88);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(byteArray80, byteArray88);
        byte byte94 = org.apache.commons.lang.math.NumberUtils.max(byteArray80);
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
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) -1 + "'", byte35 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) -1 + "'", byte37 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 100 + "'", byte50 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) -1 + "'", byte62 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte81 + "' != '" + (byte) 1 + "'", byte81 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte82 + "' != '" + (byte) 1 + "'", byte82 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte89 + "' != '" + (byte) 0 + "'", byte89 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte90 + "' != '" + (byte) 0 + "'", byte90 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte91 + "' != '" + (byte) 0 + "'", byte91 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte92 + "' != '" + (byte) 0 + "'", byte92 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + byte94 + "' != '" + (byte) 100 + "'", byte94 == (byte) 100);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
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
        double double47 = org.apache.commons.lang.math.NumberUtils.max(doubleArray45);
        double double48 = org.apache.commons.lang.math.NumberUtils.max(doubleArray45);
        double double49 = org.apache.commons.lang.math.NumberUtils.min(doubleArray45);
        double double50 = org.apache.commons.lang.math.NumberUtils.min(doubleArray45);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray45);
        double double52 = org.apache.commons.lang.math.NumberUtils.max(doubleArray45);
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
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 100.0d + "'", double47 == 100.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 100.0d + "'", double48 == 100.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 1, (long) (short) 100, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte5 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(byteArray10, byteArray17);
        byte byte19 = org.apache.commons.lang.math.NumberUtils.min(byteArray17);
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(byteArray17, byteArray29);
        byte byte32 = org.apache.commons.lang.math.NumberUtils.max(byteArray29);
        byte[] byteArray34 = new byte[] { (byte) 100 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(byteArray29, byteArray34);
        byte byte36 = org.apache.commons.lang.math.NumberUtils.max(byteArray34);
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(byteArray34, byteArray43);
        byte byte45 = org.apache.commons.lang.math.NumberUtils.min(byteArray34);
        byte[] byteArray48 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(byteArray48, byteArray55);
        byte byte57 = org.apache.commons.lang.math.NumberUtils.min(byteArray55);
        byte[] byteArray60 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray67 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(byteArray60, byteArray67);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(byteArray55, byteArray67);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(byteArray34, byteArray67);
        byte byte71 = org.apache.commons.lang.math.NumberUtils.max(byteArray34);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(byteArray4, byteArray34);
        byte byte73 = org.apache.commons.lang.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
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
        org.junit.Assert.assertTrue("'" + byte32 + "' != '" + (byte) 100 + "'", byte32 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 100 + "'", byte36 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 100 + "'", byte45 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + byte57 + "' != '" + (byte) -1 + "'", byte57 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + byte71 + "' != '" + (byte) 100 + "'", byte71 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + byte73 + "' != '" + (byte) 100 + "'", byte73 == (byte) 100);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) ' ', 10.0f, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 1, 100, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(97.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int int8 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray9 = null;
        int[] intArray11 = new int[] { (short) -1 };
        int int12 = org.apache.commons.lang.math.NumberUtils.min(intArray11);
        int[] intArray14 = new int[] { (short) -1 };
        int int15 = org.apache.commons.lang.math.NumberUtils.min(intArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(intArray11, intArray14);
        int[] intArray18 = new int[] { (short) -1 };
        int int19 = org.apache.commons.lang.math.NumberUtils.min(intArray18);
        int[] intArray21 = new int[] { (short) -1 };
        int int22 = org.apache.commons.lang.math.NumberUtils.min(intArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray21);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(intArray14, intArray18);
        int[] intArray26 = new int[] { (short) -1 };
        int int27 = org.apache.commons.lang.math.NumberUtils.min(intArray26);
        int[] intArray29 = new int[] { (short) -1 };
        int int30 = org.apache.commons.lang.math.NumberUtils.min(intArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(intArray26, intArray29);
        int int32 = org.apache.commons.lang.math.NumberUtils.min(intArray26);
        int int33 = org.apache.commons.lang.math.NumberUtils.max(intArray26);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(intArray18, intArray26);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray18);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray18);
        int int37 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 97);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        byte[] byteArray0 = null;
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(byteArray3, byteArray10);
        byte byte12 = org.apache.commons.lang.math.NumberUtils.min(byteArray10);
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray15, byteArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(byteArray10, byteArray22);
        byte byte25 = org.apache.commons.lang.math.NumberUtils.max(byteArray22);
        byte byte26 = org.apache.commons.lang.math.NumberUtils.min(byteArray22);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray22);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(byteArray30, byteArray37);
        byte byte39 = org.apache.commons.lang.math.NumberUtils.min(byteArray30);
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray49 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(byteArray42, byteArray49);
        byte byte51 = org.apache.commons.lang.math.NumberUtils.min(byteArray49);
        byte[] byteArray54 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray61 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(byteArray54, byteArray61);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(byteArray49, byteArray61);
        byte byte64 = org.apache.commons.lang.math.NumberUtils.max(byteArray61);
        byte[] byteArray66 = new byte[] { (byte) 100 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(byteArray61, byteArray66);
        byte byte68 = org.apache.commons.lang.math.NumberUtils.max(byteArray66);
        byte[] byteArray75 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(byteArray66, byteArray75);
        byte byte77 = org.apache.commons.lang.math.NumberUtils.max(byteArray75);
        byte byte78 = org.apache.commons.lang.math.NumberUtils.min(byteArray75);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(byteArray30, byteArray75);
        byte byte80 = org.apache.commons.lang.math.NumberUtils.min(byteArray75);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray75);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 100 + "'", byte25 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) -1 + "'", byte26 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) -1 + "'", byte39 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + byte51 + "' != '" + (byte) -1 + "'", byte51 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + byte64 + "' != '" + (byte) 100 + "'", byte64 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + byte68 + "' != '" + (byte) 100 + "'", byte68 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + byte77 + "' != '" + (byte) 100 + "'", byte77 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte78 + "' != '" + (byte) -1 + "'", byte78 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) -1 + "'", byte80 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 100, (long) 97, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1.0f, (double) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) '4', 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, (float) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        short[] shortArray29 = new short[] { (short) 100 };
        short[] shortArray30 = new short[] {};
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray29);
        short short33 = org.apache.commons.lang.math.NumberUtils.min(shortArray19);
        short short34 = org.apache.commons.lang.math.NumberUtils.min(shortArray19);
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
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray40, shortArray45);
        short[] shortArray50 = new short[] { (short) 100 };
        short[] shortArray51 = new short[] {};
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(shortArray50, shortArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray40, shortArray50);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray50);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray19);
        short[] shortArray57 = new short[] { (short) 100 };
        short[] shortArray58 = new short[] {};
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(shortArray57, shortArray58);
        short[] shortArray61 = new short[] { (short) 100 };
        short[] shortArray62 = new short[] {};
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(shortArray61, shortArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(shortArray58, shortArray61);
        short[] shortArray66 = new short[] { (short) 100 };
        short[] shortArray67 = new short[] {};
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray66, shortArray67);
        short[] shortArray70 = new short[] { (short) 100 };
        short[] shortArray71 = new short[] {};
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(shortArray70, shortArray71);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(shortArray67, shortArray70);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(shortArray61, shortArray70);
        short short75 = org.apache.commons.lang.math.NumberUtils.min(shortArray70);
        short short76 = org.apache.commons.lang.math.NumberUtils.min(shortArray70);
        short short77 = org.apache.commons.lang.math.NumberUtils.min(shortArray70);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray70);
        short short79 = org.apache.commons.lang.math.NumberUtils.min(shortArray70);
        short short80 = org.apache.commons.lang.math.NumberUtils.min(shortArray70);
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
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray29, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray30);
        org.junit.Assert.assertArrayEquals(shortArray30, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 100 + "'", short33 == (short) 100);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 100 + "'", short34 == (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray50, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray51, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray57, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray58, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray61, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray62, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray66, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray67, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertArrayEquals(shortArray70, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray71, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + short75 + "' != '" + (short) 100 + "'", short75 == (short) 100);
        org.junit.Assert.assertTrue("'" + short76 + "' != '" + (short) 100 + "'", short76 == (short) 100);
        org.junit.Assert.assertTrue("'" + short77 + "' != '" + (short) 100 + "'", short77 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + short79 + "' != '" + (short) 100 + "'", short79 == (short) 100);
        org.junit.Assert.assertTrue("'" + short80 + "' != '" + (short) 100 + "'", short80 == (short) 100);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) ' ', (float) 100, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 10, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(32.0f, (float) (byte) 1, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 10, 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        float[] floatArray0 = null;
        float[] floatArray1 = null;
        boolean boolean2 = org.apache.commons.lang.math.NumberUtils.equals(floatArray0, floatArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100L, 52.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray12 = new float[] { (byte) 0, (-1.0f), (short) 1, (-1.0f) };
        float float13 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray12);
        float float15 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 0.0f, (-1.0f), 1.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        long[] longArray16 = new long[] { (short) -1, (short) 1 };
        long[] longArray18 = new long[] { 0L };
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long[] longArray21 = new long[] { (byte) 1 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray21);
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray21);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray21);
        long[] longArray26 = new long[] { 0L };
        long long27 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray26);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray26);
        long[] longArray32 = new long[] { 0L };
        long long33 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        long[] longArray35 = new long[] { (byte) 1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray35);
        long long37 = org.apache.commons.lang.math.NumberUtils.min(longArray32);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray32);
        long[] longArray41 = new long[] { (short) -1, (short) 1 };
        long[] longArray43 = new long[] { 0L };
        long long44 = org.apache.commons.lang.math.NumberUtils.max(longArray43);
        long[] longArray46 = new long[] { (byte) 1 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(longArray43, longArray46);
        long long48 = org.apache.commons.lang.math.NumberUtils.max(longArray46);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray41, longArray46);
        long long50 = org.apache.commons.lang.math.NumberUtils.max(longArray41);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray41);
        long[] longArray53 = new long[] { 0L };
        long long54 = org.apache.commons.lang.math.NumberUtils.max(longArray53);
        long[] longArray56 = new long[] { (byte) 1 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(longArray53, longArray56);
        long long58 = org.apache.commons.lang.math.NumberUtils.max(longArray56);
        long long59 = org.apache.commons.lang.math.NumberUtils.min(longArray56);
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
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(longArray56, longArray64);
        long[] longArray76 = new long[] { 0L };
        long long77 = org.apache.commons.lang.math.NumberUtils.max(longArray76);
        long[] longArray79 = new long[] { (byte) 1 };
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(longArray76, longArray79);
        long long81 = org.apache.commons.lang.math.NumberUtils.max(longArray79);
        long[] longArray83 = new long[] { 0L };
        long long84 = org.apache.commons.lang.math.NumberUtils.max(longArray83);
        long[] longArray86 = new long[] { (byte) 1 };
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(longArray83, longArray86);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(longArray79, longArray86);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(longArray64, longArray86);
        long long90 = org.apache.commons.lang.math.NumberUtils.max(longArray86);
        long long91 = org.apache.commons.lang.math.NumberUtils.max(longArray86);
        long long92 = org.apache.commons.lang.math.NumberUtils.min(longArray86);
        long[] longArray93 = null;
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(longArray86, longArray93);
        long long95 = org.apache.commons.lang.math.NumberUtils.min(longArray86);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(longArray41, longArray86);
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
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertArrayEquals(longArray35, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertArrayEquals(longArray41, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertArrayEquals(longArray43, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertArrayEquals(longArray46, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertArrayEquals(longArray53, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertArrayEquals(longArray56, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
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
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertArrayEquals(longArray76, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertArrayEquals(longArray79, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1L + "'", long81 == 1L);
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertArrayEquals(longArray83, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 0L + "'", long84 == 0L);
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertArrayEquals(longArray86, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1L + "'", long90 == 1L);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 1L + "'", long91 == 1L);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 1L + "'", long92 == 1L);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 1L + "'", long95 == 1L);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (-1), (long) (-1), (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray21);
        byte[] byteArray24 = null;
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray24);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100.0f, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(97.0f, (float) 52L, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(32.0f, 1.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 52.0f, (double) (-1.0f), (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 97, (-1L), 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 0, 32L, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray7 = new long[] { 52, (-1), '4', 100L };
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray7);
        long[] longArray11 = new long[] { 0L };
        long long12 = org.apache.commons.lang.math.NumberUtils.max(longArray11);
        long[] longArray14 = new long[] { (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray14);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray14);
        long[] longArray18 = new long[] { 0L };
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long[] longArray21 = new long[] { (byte) 1 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray21);
        long long23 = org.apache.commons.lang.math.NumberUtils.min(longArray21);
        long[] longArray25 = new long[] { 0L };
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        long[] longArray28 = new long[] { (byte) 1 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray28);
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray28);
        long[] longArray32 = new long[] { 0L };
        long long33 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        long[] longArray35 = new long[] { (byte) 1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray35);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray35);
        long long38 = org.apache.commons.lang.math.NumberUtils.min(longArray28);
        long long39 = org.apache.commons.lang.math.NumberUtils.max(longArray28);
        long[] longArray41 = new long[] { 0L };
        long long42 = org.apache.commons.lang.math.NumberUtils.max(longArray41);
        long[] longArray44 = new long[] { (byte) 1 };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray41, longArray44);
        long long46 = org.apache.commons.lang.math.NumberUtils.min(longArray44);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray44);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(longArray21, longArray44);
        long long49 = org.apache.commons.lang.math.NumberUtils.min(longArray21);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray21);
        long long51 = org.apache.commons.lang.math.NumberUtils.max(longArray21);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { 52L, (-1L), 52L, 100L });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertArrayEquals(longArray28, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertArrayEquals(longArray35, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertNotNull(longArray41);
        org.junit.Assert.assertArrayEquals(longArray41, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertArrayEquals(longArray44, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1L + "'", long51 == 1L);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32L, (-1.0d), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 10L, 1.0d, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) (byte) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        int int23 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray16);
        int[] intArray27 = new int[] { (short) -1 };
        int int28 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        int[] intArray30 = new int[] { (short) -1 };
        int int31 = org.apache.commons.lang.math.NumberUtils.min(intArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray30);
        int int33 = org.apache.commons.lang.math.NumberUtils.max(intArray27);
        int[] intArray35 = new int[] { (short) -1 };
        int int36 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int[] intArray38 = new int[] { (short) -1 };
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray38);
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int[] intArray43 = new int[] { (short) -1 };
        int int44 = org.apache.commons.lang.math.NumberUtils.min(intArray43);
        int[] intArray46 = new int[] { (short) -1 };
        int int47 = org.apache.commons.lang.math.NumberUtils.min(intArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray43, intArray46);
        int[] intArray50 = new int[] { (short) -1 };
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray50);
        int[] intArray53 = new int[] { (short) -1 };
        int int54 = org.apache.commons.lang.math.NumberUtils.min(intArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray53);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(intArray46, intArray50);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray50);
        int[] intArray59 = new int[] { (short) -1 };
        int int60 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        int[] intArray62 = new int[] { (short) -1 };
        int int63 = org.apache.commons.lang.math.NumberUtils.min(intArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(intArray59, intArray62);
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        int int66 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray59);
        int int68 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray35);
        int int70 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray27);
        int[] intArray73 = new int[] { (short) -1 };
        int int74 = org.apache.commons.lang.math.NumberUtils.min(intArray73);
        int[] intArray76 = new int[] { (short) -1 };
        int int77 = org.apache.commons.lang.math.NumberUtils.min(intArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(intArray73, intArray76);
        int[] intArray80 = new int[] { (short) -1 };
        int int81 = org.apache.commons.lang.math.NumberUtils.min(intArray80);
        int[] intArray83 = new int[] { (short) -1 };
        int int84 = org.apache.commons.lang.math.NumberUtils.min(intArray83);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(intArray80, intArray83);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(intArray76, intArray80);
        int[] intArray88 = new int[] { (short) -1 };
        int int89 = org.apache.commons.lang.math.NumberUtils.min(intArray88);
        int[] intArray91 = new int[] { (short) -1 };
        int int92 = org.apache.commons.lang.math.NumberUtils.min(intArray91);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(intArray88, intArray91);
        int int94 = org.apache.commons.lang.math.NumberUtils.min(intArray88);
        int int95 = org.apache.commons.lang.math.NumberUtils.max(intArray88);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(intArray80, intArray88);
        int int97 = org.apache.commons.lang.math.NumberUtils.min(intArray80);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray80);
        java.lang.Class<?> wildcardClass99 = intArray80.getClass();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertArrayEquals(intArray91, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 1, (long) (byte) -1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(32.0f, (-1.0f), (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(10L, (long) 10, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        long[] longArray2 = new long[] { (short) -1, (short) 1 };
        long[] longArray4 = new long[] { 0L };
        long long5 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray7 = new long[] { (byte) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray7);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray7);
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray13 = new long[] { 0L };
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray13);
        long[] longArray16 = new long[] { (byte) 1 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray16);
        long long18 = org.apache.commons.lang.math.NumberUtils.min(longArray16);
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray16);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray16);
        long[] longArray22 = new long[] { 0L };
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray22);
        long[] longArray25 = new long[] { (byte) 1 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray25);
        long long27 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        long[] longArray29 = new long[] { 0L };
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray29);
        long[] longArray32 = new long[] { (byte) 1 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(longArray29, longArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray32);
        long long35 = org.apache.commons.lang.math.NumberUtils.min(longArray25);
        long long36 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray25);
        java.lang.Class<?> wildcardClass38 = longArray25.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertArrayEquals(longArray29, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(32.0d, (double) 0.0f, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) (byte) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) '#', (double) '#', (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        float[] floatArray1 = new float[] { (byte) 10 };
        float float2 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
        float float3 = org.apache.commons.lang.math.NumberUtils.max(floatArray1);
        float[] floatArray10 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float[] floatArray15 = new float[] { (byte) 10 };
        float float16 = org.apache.commons.lang.math.NumberUtils.min(floatArray15);
        float float17 = org.apache.commons.lang.math.NumberUtils.max(floatArray15);
        float[] floatArray24 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float25 = org.apache.commons.lang.math.NumberUtils.min(floatArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(floatArray15, floatArray24);
        float float27 = org.apache.commons.lang.math.NumberUtils.max(floatArray24);
        float[] floatArray32 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float33 = org.apache.commons.lang.math.NumberUtils.min(floatArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(floatArray24, floatArray32);
        float float35 = org.apache.commons.lang.math.NumberUtils.max(floatArray24);
        float[] floatArray38 = new float[] { 97L, 'a' };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(floatArray24, floatArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray38);
        float float41 = org.apache.commons.lang.math.NumberUtils.min(floatArray38);
        float float42 = org.apache.commons.lang.math.NumberUtils.max(floatArray38);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertArrayEquals(floatArray15, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray32);
        org.junit.Assert.assertArrayEquals(floatArray32, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertArrayEquals(floatArray38, new float[] { 97.0f, 97.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 97.0f + "'", float41 == 97.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 97.0f + "'", float42 == 97.0f);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 35L, (double) 100, (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 100, (int) ' ', 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 97L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) 0, (double) 10L, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((-1.0d), (double) 1.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((-1.0f), 0.0f, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1L, 35.0d, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 100, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double double10 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double11 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double12 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
        double double13 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
        double double14 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double15 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double[] doubleArray16 = null;
        double[] doubleArray21 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray25 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray21);
        double[] doubleArray28 = null;
        double[] doubleArray33 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray37 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray33, doubleArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray28, doubleArray33);
        double[] doubleArray44 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray48 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray44, doubleArray48);
        double double50 = org.apache.commons.lang.math.NumberUtils.min(doubleArray44);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray33, doubleArray44);
        double double52 = org.apache.commons.lang.math.NumberUtils.max(doubleArray33);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray33);
        double[] doubleArray54 = null;
        double[] doubleArray59 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray63 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray59, doubleArray63);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray59);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray33, doubleArray59);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray59);
        double double68 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
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
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 35);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        long[] longArray0 = null;
        long[] longArray2 = new long[] { 0L };
        long long3 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray5 = new long[] { (byte) 1 };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray5);
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray5);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray5);
        long[] longArray10 = new long[] { 0L };
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray10);
        long[] longArray13 = new long[] { (byte) 1 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(longArray10, longArray13);
        long long15 = org.apache.commons.lang.math.NumberUtils.min(longArray13);
        long[] longArray17 = new long[] { 0L };
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long[] longArray20 = new long[] { (byte) 1 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long[] longArray24 = new long[] { 0L };
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        long[] longArray27 = new long[] { (byte) 1 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray27);
        long long30 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        long long31 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long[] longArray33 = new long[] { 0L };
        long long34 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long[] longArray36 = new long[] { (byte) 1 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray36);
        long long38 = org.apache.commons.lang.math.NumberUtils.min(longArray36);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray36);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray36);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray5, longArray13);
        long[] longArray43 = new long[] { 1 };
        long long44 = org.apache.commons.lang.math.NumberUtils.max(longArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray5, longArray43);
        long[] longArray47 = new long[] { 0L };
        long long48 = org.apache.commons.lang.math.NumberUtils.max(longArray47);
        long[] longArray50 = new long[] { (byte) 1 };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray47, longArray50);
        long long52 = org.apache.commons.lang.math.NumberUtils.min(longArray50);
        long long53 = org.apache.commons.lang.math.NumberUtils.min(longArray50);
        long long54 = org.apache.commons.lang.math.NumberUtils.min(longArray50);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(longArray5, longArray50);
        long long56 = org.apache.commons.lang.math.NumberUtils.max(longArray5);
        java.lang.Class<?> wildcardClass57 = longArray5.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertArrayEquals(longArray36, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertArrayEquals(longArray43, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertArrayEquals(longArray47, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertArrayEquals(longArray50, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        long[] longArray2 = new long[] { (short) -1, (short) 1 };
        long[] longArray4 = new long[] { 0L };
        long long5 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray7 = new long[] { (byte) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray7);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray7);
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        long[] longArray13 = new long[] { 0L };
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray13);
        long[] longArray16 = new long[] { (byte) 1 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray16);
        long long18 = org.apache.commons.lang.math.NumberUtils.min(longArray16);
        long long19 = org.apache.commons.lang.math.NumberUtils.min(longArray16);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray16);
        long[] longArray22 = new long[] { 0L };
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray22);
        long[] longArray25 = new long[] { (byte) 1 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray25);
        long long27 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        long[] longArray29 = new long[] { 0L };
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray29);
        long[] longArray32 = new long[] { (byte) 1 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(longArray29, longArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray32);
        long long35 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        long[] longArray37 = new long[] { 0L };
        long long38 = org.apache.commons.lang.math.NumberUtils.max(longArray37);
        long[] longArray40 = new long[] { (byte) 1 };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray37, longArray40);
        long long42 = org.apache.commons.lang.math.NumberUtils.max(longArray40);
        long[] longArray44 = new long[] { 0L };
        long long45 = org.apache.commons.lang.math.NumberUtils.max(longArray44);
        long[] longArray47 = new long[] { (byte) 1 };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(longArray44, longArray47);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray40, longArray47);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray47);
        long[] longArray52 = new long[] { 0L };
        long long53 = org.apache.commons.lang.math.NumberUtils.max(longArray52);
        long[] longArray55 = new long[] { (byte) 1 };
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(longArray52, longArray55);
        long long57 = org.apache.commons.lang.math.NumberUtils.max(longArray55);
        long[] longArray59 = new long[] { 0L };
        long long60 = org.apache.commons.lang.math.NumberUtils.max(longArray59);
        long[] longArray62 = new long[] { (byte) 1 };
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(longArray59, longArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray55, longArray62);
        long long65 = org.apache.commons.lang.math.NumberUtils.max(longArray55);
        long[] longArray67 = new long[] { 0L };
        long long68 = org.apache.commons.lang.math.NumberUtils.max(longArray67);
        long[] longArray70 = new long[] { (byte) 1 };
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(longArray67, longArray70);
        long long72 = org.apache.commons.lang.math.NumberUtils.max(longArray70);
        long[] longArray74 = new long[] { 0L };
        long long75 = org.apache.commons.lang.math.NumberUtils.max(longArray74);
        long[] longArray77 = new long[] { (byte) 1 };
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(longArray74, longArray77);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(longArray70, longArray77);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(longArray55, longArray77);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(longArray47, longArray55);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray47);
        long long83 = org.apache.commons.lang.math.NumberUtils.min(longArray7);
        long long84 = org.apache.commons.lang.math.NumberUtils.min(longArray7);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertArrayEquals(longArray29, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertArrayEquals(longArray37, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertArrayEquals(longArray40, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertArrayEquals(longArray44, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertArrayEquals(longArray47, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertArrayEquals(longArray52, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertArrayEquals(longArray55, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertArrayEquals(longArray59, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertArrayEquals(longArray62, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertArrayEquals(longArray67, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertArrayEquals(longArray70, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 1L + "'", long72 == 1L);
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertArrayEquals(longArray74, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 0L + "'", long75 == 0L);
        org.junit.Assert.assertNotNull(longArray77);
        org.junit.Assert.assertArrayEquals(longArray77, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 1L + "'", long83 == 1L);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 1L + "'", long84 == 1L);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(35L, (long) (byte) 0, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, 35, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 100, (long) (short) 1, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (long) ' ', (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
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
        double[] doubleArray30 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray34 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray34);
        double[] doubleArray40 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray44 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray40, doubleArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray40);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray30);
        double[] doubleArray52 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray56 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray52, doubleArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray56);
        double double59 = org.apache.commons.lang.math.NumberUtils.max(doubleArray30);
        double double60 = org.apache.commons.lang.math.NumberUtils.max(doubleArray30);
        double[] doubleArray61 = null;
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray61);
        double double63 = org.apache.commons.lang.math.NumberUtils.min(doubleArray30);
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
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 52.0d + "'", double59 == 52.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 52.0d + "'", double60 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 1, (double) (short) -1, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) -1, (long) 10, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) (byte) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (-1), (long) (short) 1, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 1, 1L, (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) 'a', 52, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '4', 0L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) '4', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
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
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(shortArray34, shortArray37);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(shortArray28, shortArray37);
        short short42 = org.apache.commons.lang.math.NumberUtils.min(shortArray37);
        short short43 = org.apache.commons.lang.math.NumberUtils.min(shortArray37);
        short[] shortArray49 = new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (byte) 10 };
        short short50 = org.apache.commons.lang.math.NumberUtils.min(shortArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray37, shortArray49);
        short[] shortArray53 = new short[] { (short) 100 };
        short[] shortArray54 = new short[] {};
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(shortArray53, shortArray54);
        short[] shortArray57 = new short[] { (short) 100 };
        short[] shortArray58 = new short[] {};
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(shortArray57, shortArray58);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(shortArray54, shortArray57);
        short[] shortArray62 = new short[] { (short) 100 };
        short[] shortArray63 = new short[] {};
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(shortArray62, shortArray63);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray57, shortArray62);
        short[] shortArray67 = new short[] { (short) 100 };
        short[] shortArray68 = new short[] {};
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(shortArray67, shortArray68);
        short[] shortArray71 = new short[] { (short) 100 };
        short[] shortArray72 = new short[] {};
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(shortArray71, shortArray72);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(shortArray68, shortArray71);
        short[] shortArray76 = new short[] { (short) 100 };
        short[] shortArray77 = new short[] {};
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(shortArray76, shortArray77);
        short[] shortArray80 = new short[] { (short) 100 };
        short[] shortArray81 = new short[] {};
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(shortArray80, shortArray81);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(shortArray77, shortArray80);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(shortArray71, shortArray80);
        short short85 = org.apache.commons.lang.math.NumberUtils.min(shortArray80);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(shortArray57, shortArray80);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(shortArray37, shortArray57);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray37);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 100 + "'", short42 == (short) 100);
        org.junit.Assert.assertTrue("'" + short43 + "' != '" + (short) 100 + "'", short43 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray49);
        org.junit.Assert.assertArrayEquals(shortArray49, new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (short) 10 });
        org.junit.Assert.assertTrue("'" + short50 + "' != '" + (short) 10 + "'", short50 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray53, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray54, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray57, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray58, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray62, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray63, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray67, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray68, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray71, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray72, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray76, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertArrayEquals(shortArray77, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(shortArray80);
        org.junit.Assert.assertArrayEquals(shortArray80, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray81);
        org.junit.Assert.assertArrayEquals(shortArray81, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + short85 + "' != '" + (short) 100 + "'", short85 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 32, (long) ' ', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        float[] floatArray36 = new float[] { (byte) 0, (-1.0f), (short) 1, (-1.0f) };
        float float37 = org.apache.commons.lang.math.NumberUtils.max(floatArray36);
        float[] floatArray42 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float43 = org.apache.commons.lang.math.NumberUtils.min(floatArray42);
        float[] floatArray45 = new float[] { (byte) 10 };
        float float46 = org.apache.commons.lang.math.NumberUtils.min(floatArray45);
        float float47 = org.apache.commons.lang.math.NumberUtils.max(floatArray45);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(floatArray42, floatArray45);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray45);
        float float50 = org.apache.commons.lang.math.NumberUtils.max(floatArray45);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(floatArray25, floatArray45);
        java.lang.Class<?> wildcardClass52 = floatArray25.getClass();
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
        org.junit.Assert.assertArrayEquals(floatArray36, new float[] { 0.0f, (-1.0f), 1.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 1.0f + "'", float37 == 1.0f);
        org.junit.Assert.assertNotNull(floatArray42);
        org.junit.Assert.assertArrayEquals(floatArray42, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + (-1.0f) + "'", float43 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertArrayEquals(floatArray45, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 10.0f + "'", float46 == 10.0f);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 10.0f + "'", float47 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 10.0f + "'", float50 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        long[] longArray0 = null;
        long[] longArray2 = new long[] { 0L };
        long long3 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray5 = new long[] { (byte) 1 };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray5);
        long long7 = org.apache.commons.lang.math.NumberUtils.max(longArray5);
        long long8 = org.apache.commons.lang.math.NumberUtils.min(longArray5);
        long[] longArray10 = new long[] { 0L };
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray10);
        long[] longArray13 = new long[] { (byte) 1 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(longArray10, longArray13);
        long long15 = org.apache.commons.lang.math.NumberUtils.max(longArray13);
        long[] longArray17 = new long[] { 0L };
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long[] longArray20 = new long[] { (byte) 1 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray5, longArray13);
        long long24 = org.apache.commons.lang.math.NumberUtils.min(longArray5);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray0);
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 'a', (long) 1, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 0, (long) '#', (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 0, (long) '#', (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, (float) 0L, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(35.0d, (double) 10L, (double) 32L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
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
        long[] longArray16 = new long[] { (short) -1, (short) 1 };
        long[] longArray18 = new long[] { 0L };
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long[] longArray21 = new long[] { (byte) 1 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray21);
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray21);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray21);
        long[] longArray26 = new long[] { 0L };
        long long27 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray16, longArray26);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray26);
        long[] longArray31 = null;
        long[] longArray33 = new long[] { 0L };
        long long34 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long[] longArray36 = new long[] { (byte) 1 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray36);
        long long38 = org.apache.commons.lang.math.NumberUtils.max(longArray36);
        long[] longArray40 = new long[] { 0L };
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray40);
        long[] longArray43 = new long[] { (byte) 1 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray40, longArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray36, longArray43);
        long long46 = org.apache.commons.lang.math.NumberUtils.min(longArray36);
        long long47 = org.apache.commons.lang.math.NumberUtils.max(longArray36);
        long[] longArray49 = new long[] { 0L };
        long long50 = org.apache.commons.lang.math.NumberUtils.max(longArray49);
        long[] longArray52 = new long[] { (byte) 1 };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray49, longArray52);
        long long54 = org.apache.commons.lang.math.NumberUtils.min(longArray52);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(longArray36, longArray52);
        long[] longArray58 = new long[] { (short) -1, (short) 1 };
        long[] longArray60 = new long[] { 0L };
        long long61 = org.apache.commons.lang.math.NumberUtils.max(longArray60);
        long[] longArray63 = new long[] { (byte) 1 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray60, longArray63);
        long long65 = org.apache.commons.lang.math.NumberUtils.max(longArray63);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(longArray58, longArray63);
        long long67 = org.apache.commons.lang.math.NumberUtils.max(longArray63);
        long[] longArray69 = new long[] { 0L };
        long long70 = org.apache.commons.lang.math.NumberUtils.max(longArray69);
        long[] longArray72 = new long[] { (byte) 1 };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(longArray69, longArray72);
        long long74 = org.apache.commons.lang.math.NumberUtils.min(longArray72);
        long long75 = org.apache.commons.lang.math.NumberUtils.min(longArray72);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(longArray63, longArray72);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(longArray52, longArray63);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(longArray31, longArray63);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray63);
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
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertArrayEquals(longArray16, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertArrayEquals(longArray36, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertArrayEquals(longArray40, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertArrayEquals(longArray43, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertArrayEquals(longArray49, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertArrayEquals(longArray52, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertArrayEquals(longArray58, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertArrayEquals(longArray60, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertArrayEquals(longArray63, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertArrayEquals(longArray69, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertArrayEquals(longArray72, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1L + "'", long74 == 1L);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1L + "'", long75 == 1L);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 52L, (double) (-1), (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 52, (long) 0, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0, (double) (short) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
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
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
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
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(shortArray23, shortArray44);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray23);
        // The following exception was thrown during execution in test generation
        try {
            short short52 = org.apache.commons.lang.math.NumberUtils.max(shortArray23);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] {});
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        int[] intArray41 = new int[] { (short) -1 };
        int int42 = org.apache.commons.lang.math.NumberUtils.min(intArray41);
        int[] intArray44 = new int[] { (short) -1 };
        int int45 = org.apache.commons.lang.math.NumberUtils.min(intArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray44);
        int int47 = org.apache.commons.lang.math.NumberUtils.max(intArray41);
        int[] intArray49 = new int[] { (short) -1 };
        int int50 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        int[] intArray52 = new int[] { (short) -1 };
        int int53 = org.apache.commons.lang.math.NumberUtils.min(intArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray52);
        int int55 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        int[] intArray57 = new int[] { (short) -1 };
        int int58 = org.apache.commons.lang.math.NumberUtils.min(intArray57);
        int[] intArray60 = new int[] { (short) -1 };
        int int61 = org.apache.commons.lang.math.NumberUtils.min(intArray60);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(intArray57, intArray60);
        int[] intArray64 = new int[] { (short) -1 };
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray64);
        int[] intArray67 = new int[] { (short) -1 };
        int int68 = org.apache.commons.lang.math.NumberUtils.min(intArray67);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(intArray64, intArray67);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(intArray60, intArray64);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray64);
        int[] intArray73 = new int[] { (short) -1 };
        int int74 = org.apache.commons.lang.math.NumberUtils.min(intArray73);
        int[] intArray76 = new int[] { (short) -1 };
        int int77 = org.apache.commons.lang.math.NumberUtils.min(intArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(intArray73, intArray76);
        int int79 = org.apache.commons.lang.math.NumberUtils.min(intArray73);
        int int80 = org.apache.commons.lang.math.NumberUtils.min(intArray73);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray73);
        int int82 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray49);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray41);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray41);
        int int86 = org.apache.commons.lang.math.NumberUtils.max(intArray41);
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
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
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
        short short19 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
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
        short[] shortArray36 = new short[] { (short) 100 };
        short[] shortArray37 = new short[] {};
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray36);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray36);
        short[] shortArray42 = new short[] { (short) 100 };
        short[] shortArray43 = new short[] {};
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray42, shortArray43);
        short[] shortArray46 = new short[] { (short) 100 };
        short[] shortArray47 = new short[] {};
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray46, shortArray47);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(shortArray43, shortArray46);
        short[] shortArray51 = new short[] { (short) 100 };
        short[] shortArray52 = new short[] {};
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray51, shortArray52);
        short[] shortArray55 = new short[] { (short) 100 };
        short[] shortArray56 = new short[] {};
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(shortArray55, shortArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(shortArray52, shortArray55);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(shortArray46, shortArray55);
        short short60 = org.apache.commons.lang.math.NumberUtils.min(shortArray46);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray46);
        short[] shortArray63 = new short[] { (short) 100 };
        short[] shortArray64 = new short[] {};
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray63, shortArray64);
        short[] shortArray67 = new short[] { (short) 100 };
        short[] shortArray68 = new short[] {};
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(shortArray67, shortArray68);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(shortArray64, shortArray67);
        short[] shortArray72 = new short[] { (short) 100 };
        short[] shortArray73 = new short[] {};
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(shortArray72, shortArray73);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(shortArray67, shortArray72);
        short[] shortArray77 = new short[] { (short) 100 };
        short[] shortArray78 = new short[] {};
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(shortArray77, shortArray78);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(shortArray67, shortArray77);
        short short81 = org.apache.commons.lang.math.NumberUtils.min(shortArray67);
        short short82 = org.apache.commons.lang.math.NumberUtils.min(shortArray67);
        short short83 = org.apache.commons.lang.math.NumberUtils.max(shortArray67);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(shortArray46, shortArray67);
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
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray37, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray42, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray43, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray46, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray47, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray51, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray52, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray55, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray56, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) 100 + "'", short60 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray63, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray64, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray67, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray68, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray72, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray73, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(shortArray77);
        org.junit.Assert.assertArrayEquals(shortArray77, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray78);
        org.junit.Assert.assertArrayEquals(shortArray78, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + short81 + "' != '" + (short) 100 + "'", short81 == (short) 100);
        org.junit.Assert.assertTrue("'" + short82 + "' != '" + (short) 100 + "'", short82 == (short) 100);
        org.junit.Assert.assertTrue("'" + short83 + "' != '" + (short) 100 + "'", short83 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, (float) 35L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        short[] shortArray19 = null;
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray15, shortArray19);
        short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray15);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 100 + "'", short21 == (short) 100);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(35.0f, (float) 1, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10L, (double) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
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
        int[] intArray33 = new int[] { (short) -1 };
        int int34 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        int[] intArray36 = new int[] { (short) -1 };
        int int37 = org.apache.commons.lang.math.NumberUtils.min(intArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray36);
        int[] intArray40 = new int[] { (short) -1 };
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray40);
        int[] intArray43 = new int[] { (short) -1 };
        int int44 = org.apache.commons.lang.math.NumberUtils.min(intArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray43);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray36, intArray40);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray40);
        int[] intArray49 = new int[] { (short) -1 };
        int int50 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        int[] intArray52 = new int[] { (short) -1 };
        int int53 = org.apache.commons.lang.math.NumberUtils.min(intArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray52);
        int int55 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        int int56 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray49);
        int int58 = org.apache.commons.lang.math.NumberUtils.min(intArray25);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray25);
        int[] intArray61 = new int[] { (short) -1 };
        int int62 = org.apache.commons.lang.math.NumberUtils.min(intArray61);
        int[] intArray64 = new int[] { (short) -1 };
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(intArray61, intArray64);
        int int67 = org.apache.commons.lang.math.NumberUtils.max(intArray61);
        int int68 = org.apache.commons.lang.math.NumberUtils.min(intArray61);
        int int69 = org.apache.commons.lang.math.NumberUtils.max(intArray61);
        int int70 = org.apache.commons.lang.math.NumberUtils.min(intArray61);
        int[] intArray72 = new int[] { (short) -1 };
        int int73 = org.apache.commons.lang.math.NumberUtils.min(intArray72);
        int[] intArray75 = new int[] { (short) -1 };
        int int76 = org.apache.commons.lang.math.NumberUtils.min(intArray75);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(intArray72, intArray75);
        int[] intArray79 = new int[] { (short) -1 };
        int int80 = org.apache.commons.lang.math.NumberUtils.min(intArray79);
        int[] intArray82 = new int[] { (short) -1 };
        int int83 = org.apache.commons.lang.math.NumberUtils.min(intArray82);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(intArray79, intArray82);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(intArray75, intArray79);
        int int86 = org.apache.commons.lang.math.NumberUtils.min(intArray79);
        int[] intArray88 = new int[] { (short) -1 };
        int int89 = org.apache.commons.lang.math.NumberUtils.min(intArray88);
        int[] intArray91 = new int[] { (short) -1 };
        int int92 = org.apache.commons.lang.math.NumberUtils.min(intArray91);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(intArray88, intArray91);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(intArray79, intArray88);
        int int95 = org.apache.commons.lang.math.NumberUtils.min(intArray88);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(intArray61, intArray88);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray61);
        int int98 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
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
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertArrayEquals(intArray72, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertArrayEquals(intArray75, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertArrayEquals(intArray88, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(intArray91);
        org.junit.Assert.assertArrayEquals(intArray91, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + (-1) + "'", int92 == (-1));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 100, 10.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1.0f, (double) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray25);
        int int41 = org.apache.commons.lang.math.NumberUtils.max(intArray25);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 0, (float) 1L, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) (byte) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 0L, (double) 97.0f, (double) 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) 'a', (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (-1), 0L, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
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
        int int15 = org.apache.commons.lang.math.NumberUtils.min(intArray8);
        int[] intArray17 = new int[] { (short) -1 };
        int int18 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        int[] intArray20 = new int[] { (short) -1 };
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray20);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray17);
        int int24 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        int int25 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        int int26 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) 97.0f, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        long[] longArray15 = new long[] { 0L };
        long long16 = org.apache.commons.lang.math.NumberUtils.max(longArray15);
        long[] longArray18 = new long[] { (byte) 1 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(longArray15, longArray18);
        long long20 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long[] longArray22 = new long[] { 0L };
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray22);
        long[] longArray25 = new long[] { (byte) 1 };
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray25);
        long[] longArray29 = new long[] { 0L };
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray29);
        long[] longArray32 = new long[] { (byte) 1 };
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(longArray29, longArray32);
        long long34 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        long[] longArray36 = new long[] { 0L };
        long long37 = org.apache.commons.lang.math.NumberUtils.max(longArray36);
        long[] longArray39 = new long[] { (byte) 1 };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(longArray36, longArray39);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray39);
        long long42 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        long[] longArray44 = new long[] { 0L };
        long long45 = org.apache.commons.lang.math.NumberUtils.max(longArray44);
        long[] longArray47 = new long[] { (byte) 1 };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(longArray44, longArray47);
        long long49 = org.apache.commons.lang.math.NumberUtils.max(longArray47);
        long[] longArray51 = new long[] { 0L };
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray51);
        long[] longArray54 = new long[] { (byte) 1 };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(longArray51, longArray54);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(longArray47, longArray54);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray54);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray32);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray32);
        long[] longArray60 = null;
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray60);
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
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertArrayEquals(longArray29, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertArrayEquals(longArray36, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertArrayEquals(longArray39, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertNotNull(longArray44);
        org.junit.Assert.assertArrayEquals(longArray44, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertArrayEquals(longArray47, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertArrayEquals(longArray51, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertArrayEquals(longArray54, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(52.0d, (double) (byte) 100, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 100, 97L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(35.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
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
        double[] doubleArray30 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray34 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray34);
        double[] doubleArray40 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray44 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray40, doubleArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray40);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray30);
        double[] doubleArray52 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray56 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray52, doubleArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray56);
        double double59 = org.apache.commons.lang.math.NumberUtils.max(doubleArray30);
        double[] doubleArray64 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray68 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray64, doubleArray68);
        double double70 = org.apache.commons.lang.math.NumberUtils.max(doubleArray68);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray68);
        double[] doubleArray76 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray80 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray76, doubleArray80);
        double double82 = org.apache.commons.lang.math.NumberUtils.max(doubleArray76);
        double double83 = org.apache.commons.lang.math.NumberUtils.min(doubleArray76);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray76);
        double double85 = org.apache.commons.lang.math.NumberUtils.min(doubleArray76);
        double double86 = org.apache.commons.lang.math.NumberUtils.max(doubleArray76);
        double double87 = org.apache.commons.lang.math.NumberUtils.max(doubleArray76);
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
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 52.0d + "'", double59 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 100.0d + "'", double70 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 52.0d + "'", double82 == 52.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 52.0d + "'", double86 == 52.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 52.0d + "'", double87 == 52.0d);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
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
        float float99 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
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
        org.junit.Assert.assertTrue("'" + float99 + "' != '" + 10.0f + "'", float99 == 10.0f);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 0, (long) (byte) -1, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        float float64 = org.apache.commons.lang.math.NumberUtils.min(floatArray36);
        float float65 = org.apache.commons.lang.math.NumberUtils.min(floatArray36);
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
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + (-1.0f) + "'", float64 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + (-1.0f) + "'", float65 == (-1.0f));
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 97, (float) 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray7 = new long[] { 52, (-1), '4', 100L };
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray7);
        long[] longArray11 = new long[] { 0L };
        long long12 = org.apache.commons.lang.math.NumberUtils.max(longArray11);
        long[] longArray14 = new long[] { (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray14);
        long long16 = org.apache.commons.lang.math.NumberUtils.max(longArray14);
        long[] longArray18 = new long[] { 0L };
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long[] longArray21 = new long[] { (byte) 1 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray21);
        long[] longArray25 = new long[] { 0L };
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray21, longArray25);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray21);
        long long29 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        long[] longArray31 = new long[] { 0L };
        long long32 = org.apache.commons.lang.math.NumberUtils.max(longArray31);
        long[] longArray34 = new long[] { (byte) 1 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(longArray31, longArray34);
        long long36 = org.apache.commons.lang.math.NumberUtils.max(longArray34);
        long long37 = org.apache.commons.lang.math.NumberUtils.max(longArray34);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray34);
        long[] longArray40 = new long[] { 0L };
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray40);
        long[] longArray43 = new long[] { (byte) 1 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray40, longArray43);
        long long45 = org.apache.commons.lang.math.NumberUtils.min(longArray43);
        long[] longArray47 = new long[] { 0L };
        long long48 = org.apache.commons.lang.math.NumberUtils.max(longArray47);
        long[] longArray50 = new long[] { (byte) 1 };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray47, longArray50);
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
        long[] longArray54 = new long[] { 0L };
        long long55 = org.apache.commons.lang.math.NumberUtils.max(longArray54);
        long[] longArray57 = new long[] { (byte) 1 };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(longArray54, longArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(longArray50, longArray57);
        long long60 = org.apache.commons.lang.math.NumberUtils.min(longArray50);
        long long61 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
        long[] longArray63 = new long[] { 0L };
        long long64 = org.apache.commons.lang.math.NumberUtils.max(longArray63);
        long[] longArray66 = new long[] { (byte) 1 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(longArray63, longArray66);
        long long68 = org.apache.commons.lang.math.NumberUtils.min(longArray66);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(longArray50, longArray66);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(longArray43, longArray66);
        long[] longArray72 = new long[] { 97 };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(longArray43, longArray72);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray72);
        long long75 = org.apache.commons.lang.math.NumberUtils.min(longArray72);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { 52L, (-1L), 52L, 100L });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertArrayEquals(longArray34, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1L + "'", long36 == 1L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertArrayEquals(longArray40, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertArrayEquals(longArray43, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertNotNull(longArray47);
        org.junit.Assert.assertArrayEquals(longArray47, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(longArray50);
        org.junit.Assert.assertArrayEquals(longArray50, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertArrayEquals(longArray54, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertArrayEquals(longArray57, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertArrayEquals(longArray63, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertArrayEquals(longArray66, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1L + "'", long68 == 1L);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertArrayEquals(longArray72, new long[] { 97L });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 97L + "'", long75 == 97L);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) (byte) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int int8 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray10 = new int[] { (short) -1 };
        int int11 = org.apache.commons.lang.math.NumberUtils.min(intArray10);
        int[] intArray13 = new int[] { (short) -1 };
        int int14 = org.apache.commons.lang.math.NumberUtils.min(intArray13);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(intArray10, intArray13);
        int int16 = org.apache.commons.lang.math.NumberUtils.max(intArray10);
        int int17 = org.apache.commons.lang.math.NumberUtils.max(intArray10);
        int[] intArray18 = null;
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(intArray10, intArray18);
        int int20 = org.apache.commons.lang.math.NumberUtils.max(intArray10);
        int[] intArray22 = new int[] { (short) -1 };
        int int23 = org.apache.commons.lang.math.NumberUtils.min(intArray22);
        int[] intArray25 = new int[] { (short) -1 };
        int int26 = org.apache.commons.lang.math.NumberUtils.min(intArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(intArray22, intArray25);
        int[] intArray29 = new int[] { (short) -1 };
        int int30 = org.apache.commons.lang.math.NumberUtils.min(intArray29);
        int[] intArray32 = new int[] { (short) -1 };
        int int33 = org.apache.commons.lang.math.NumberUtils.min(intArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(intArray29, intArray32);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray29);
        int[] intArray37 = new int[] { (short) -1 };
        int int38 = org.apache.commons.lang.math.NumberUtils.min(intArray37);
        int[] intArray40 = new int[] { (short) -1 };
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(intArray37, intArray40);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(intArray29, intArray37);
        int int44 = org.apache.commons.lang.math.NumberUtils.min(intArray37);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(intArray10, intArray37);
        int int46 = org.apache.commons.lang.math.NumberUtils.min(intArray37);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray37);
        int int48 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int int49 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        java.lang.Class<?> wildcardClass50 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 32, (double) 100.0f, (double) 35);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) -1, 10L, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
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
        int[] intArray34 = new int[] { (short) -1 };
        int int35 = org.apache.commons.lang.math.NumberUtils.min(intArray34);
        int[] intArray37 = new int[] { (short) -1 };
        int int38 = org.apache.commons.lang.math.NumberUtils.min(intArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray34, intArray37);
        int[] intArray41 = new int[] { (short) -1 };
        int int42 = org.apache.commons.lang.math.NumberUtils.min(intArray41);
        int[] intArray44 = new int[] { (short) -1 };
        int int45 = org.apache.commons.lang.math.NumberUtils.min(intArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray44);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray37, intArray41);
        int[] intArray49 = new int[] { (short) -1 };
        int int50 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        int[] intArray52 = new int[] { (short) -1 };
        int int53 = org.apache.commons.lang.math.NumberUtils.min(intArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray52);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray49);
        int int56 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        int int57 = org.apache.commons.lang.math.NumberUtils.max(intArray49);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray49);
        int int59 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int[] intArray61 = new int[] { (short) -1 };
        int int62 = org.apache.commons.lang.math.NumberUtils.min(intArray61);
        int[] intArray64 = new int[] { (short) -1 };
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(intArray61, intArray64);
        int[] intArray68 = new int[] { (short) -1 };
        int int69 = org.apache.commons.lang.math.NumberUtils.min(intArray68);
        int[] intArray71 = new int[] { (short) -1 };
        int int72 = org.apache.commons.lang.math.NumberUtils.min(intArray71);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(intArray68, intArray71);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(intArray64, intArray68);
        int int75 = org.apache.commons.lang.math.NumberUtils.max(intArray68);
        int int76 = org.apache.commons.lang.math.NumberUtils.min(intArray68);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray68);
        int int78 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
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
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 'a', (double) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((-1), (int) '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray12 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray12);
        float float15 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        float[] floatArray17 = new float[] { (byte) 10 };
        float float18 = org.apache.commons.lang.math.NumberUtils.min(floatArray17);
        float float19 = org.apache.commons.lang.math.NumberUtils.max(floatArray17);
        float[] floatArray26 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float27 = org.apache.commons.lang.math.NumberUtils.min(floatArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray26);
        float float29 = org.apache.commons.lang.math.NumberUtils.max(floatArray26);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray26);
        java.lang.Class<?> wildcardClass31 = floatArray26.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-1.0f) + "'", float27 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 100.0f + "'", float29 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 0, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, (double) 32L, (double) 97L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(97, 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) -1, 35.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
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
        double double24 = org.apache.commons.lang.math.NumberUtils.min(doubleArray5);
        double double25 = org.apache.commons.lang.math.NumberUtils.min(doubleArray5);
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        short[] shortArray34 = new short[] { (short) 100 };
        short[] shortArray35 = new short[] {};
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray34, shortArray35);
        short[] shortArray38 = new short[] { (short) 100 };
        short[] shortArray39 = new short[] {};
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(shortArray38, shortArray39);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(shortArray35, shortArray38);
        short[] shortArray43 = new short[] { (short) 100 };
        short[] shortArray44 = new short[] {};
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray43, shortArray44);
        short[] shortArray47 = new short[] { (short) 100 };
        short[] shortArray48 = new short[] {};
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(shortArray47, shortArray48);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(shortArray44, shortArray47);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(shortArray38, shortArray47);
        short short52 = org.apache.commons.lang.math.NumberUtils.min(shortArray47);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray47);
        short short54 = org.apache.commons.lang.math.NumberUtils.min(shortArray47);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray47);
        short short56 = org.apache.commons.lang.math.NumberUtils.min(shortArray47);
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
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray34, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray35);
        org.junit.Assert.assertArrayEquals(shortArray35, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray38, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray39, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray43, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray44);
        org.junit.Assert.assertArrayEquals(shortArray44, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray47, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray48, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + short52 + "' != '" + (short) 100 + "'", short52 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) 100 + "'", short54 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 100 + "'", short56 == (short) 100);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 97, (float) 32, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(35L, (long) '4', (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 1, 10L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 52, 100.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(52L, (long) 97, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0f), (float) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32, (float) (-1), (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(10.0f, (float) (byte) 10, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
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
        byte byte28 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
        byte[] byteArray35 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray35);
        byte byte37 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
        byte[] byteArray43 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        byte byte44 = org.apache.commons.lang.math.NumberUtils.max(byteArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray43);
        byte byte46 = org.apache.commons.lang.math.NumberUtils.min(byteArray43);
        byte[] byteArray49 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray56 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(byteArray49, byteArray56);
        byte byte58 = org.apache.commons.lang.math.NumberUtils.min(byteArray56);
        byte[] byteArray61 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray68 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(byteArray61, byteArray68);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(byteArray56, byteArray68);
        byte byte71 = org.apache.commons.lang.math.NumberUtils.max(byteArray68);
        byte[] byteArray73 = new byte[] { (byte) 100 };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(byteArray68, byteArray73);
        byte byte75 = org.apache.commons.lang.math.NumberUtils.max(byteArray73);
        byte[] byteArray82 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(byteArray73, byteArray82);
        byte byte84 = org.apache.commons.lang.math.NumberUtils.max(byteArray82);
        byte byte85 = org.apache.commons.lang.math.NumberUtils.min(byteArray82);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray82);
        byte byte87 = org.apache.commons.lang.math.NumberUtils.max(byteArray82);
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
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 100 + "'", byte37 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 100 + "'", byte38 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 10 + "'", byte44 == (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) -1 + "'", byte46 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + byte58 + "' != '" + (byte) -1 + "'", byte58 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + byte71 + "' != '" + (byte) 100 + "'", byte71 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + byte75 + "' != '" + (byte) 100 + "'", byte75 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + byte84 + "' != '" + (byte) 100 + "'", byte84 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte85 + "' != '" + (byte) -1 + "'", byte85 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + byte87 + "' != '" + (byte) 100 + "'", byte87 == (byte) 100);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32, (float) (-1), 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        int int16 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int int17 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        double[] doubleArray5 = new double[] { 35.0d, (byte) 10, 0.0f, 0.0d, ' ' };
        double double6 = org.apache.commons.lang.math.NumberUtils.min(doubleArray5);
        double[] doubleArray7 = null;
        double[] doubleArray12 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray16 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray16);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray7, doubleArray12);
        double[] doubleArray23 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray27 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray23, doubleArray27);
        double double29 = org.apache.commons.lang.math.NumberUtils.min(doubleArray23);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray23);
        double double31 = org.apache.commons.lang.math.NumberUtils.max(doubleArray12);
        double double32 = org.apache.commons.lang.math.NumberUtils.min(doubleArray12);
        double[] doubleArray37 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray41 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double[] doubleArray47 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray51 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray47, doubleArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray47);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray12, doubleArray37);
        double[] doubleArray59 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray63 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray59, doubleArray63);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray63);
        double double66 = org.apache.commons.lang.math.NumberUtils.max(doubleArray37);
        double[] doubleArray71 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray75 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray71, doubleArray75);
        double double77 = org.apache.commons.lang.math.NumberUtils.max(doubleArray75);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray75);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray37);
        double double80 = org.apache.commons.lang.math.NumberUtils.min(doubleArray5);
        double double81 = org.apache.commons.lang.math.NumberUtils.min(doubleArray5);
        double double82 = org.apache.commons.lang.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, 10.0d, 0.0d, 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 52.0d + "'", double31 == 52.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 52.0d + "'", double66 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertArrayEquals(doubleArray71, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 100.0d + "'", double77 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 35.0d + "'", double82 == 35.0d);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(35.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 52.0f, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, 52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray25);
        int[] intArray42 = new int[] { (short) -1 };
        int int43 = org.apache.commons.lang.math.NumberUtils.min(intArray42);
        int[] intArray45 = new int[] { (short) -1 };
        int int46 = org.apache.commons.lang.math.NumberUtils.min(intArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray42, intArray45);
        int[] intArray49 = new int[] { (short) -1 };
        int int50 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        int[] intArray52 = new int[] { (short) -1 };
        int int53 = org.apache.commons.lang.math.NumberUtils.min(intArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray52);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(intArray45, intArray49);
        int[] intArray57 = new int[] { (short) -1 };
        int int58 = org.apache.commons.lang.math.NumberUtils.min(intArray57);
        int[] intArray60 = new int[] { (short) -1 };
        int int61 = org.apache.commons.lang.math.NumberUtils.min(intArray60);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(intArray57, intArray60);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray57);
        int int64 = org.apache.commons.lang.math.NumberUtils.max(intArray49);
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        int int66 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        int int67 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray49);
        int[] intArray70 = new int[] { (short) -1 };
        int int71 = org.apache.commons.lang.math.NumberUtils.min(intArray70);
        int[] intArray73 = new int[] { (short) -1 };
        int int74 = org.apache.commons.lang.math.NumberUtils.min(intArray73);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(intArray70, intArray73);
        int int76 = org.apache.commons.lang.math.NumberUtils.max(intArray70);
        int int77 = org.apache.commons.lang.math.NumberUtils.max(intArray70);
        int[] intArray79 = new int[] { (short) -1 };
        int int80 = org.apache.commons.lang.math.NumberUtils.min(intArray79);
        int[] intArray82 = new int[] { (short) -1 };
        int int83 = org.apache.commons.lang.math.NumberUtils.min(intArray82);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(intArray79, intArray82);
        int[] intArray86 = new int[] { (short) -1 };
        int int87 = org.apache.commons.lang.math.NumberUtils.min(intArray86);
        int[] intArray89 = new int[] { (short) -1 };
        int int90 = org.apache.commons.lang.math.NumberUtils.min(intArray89);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(intArray86, intArray89);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(intArray82, intArray86);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(intArray70, intArray82);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray70);
        int int95 = org.apache.commons.lang.math.NumberUtils.max(intArray70);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertArrayEquals(intArray52, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertArrayEquals(intArray60, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertArrayEquals(intArray70, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertArrayEquals(intArray79, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertArrayEquals(intArray86, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertArrayEquals(intArray89, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10.0f, (double) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 52L, (float) 32L, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 97, (long) 100, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 1, (float) 52L, 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1.0f, (double) 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) '#', (double) (short) 10, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(52.0f, (float) (byte) 10, (float) 97L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, (double) 1L, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, (int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) (byte) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 0, (double) '4', 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1.0f), (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        long[] longArray25 = new long[] { (short) -1, (short) 1 };
        long[] longArray27 = new long[] { 0L };
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        long[] longArray30 = new long[] { (byte) 1 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray27, longArray30);
        long long32 = org.apache.commons.lang.math.NumberUtils.max(longArray30);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray30);
        long long34 = org.apache.commons.lang.math.NumberUtils.max(longArray30);
        long[] longArray36 = new long[] { 0L };
        long long37 = org.apache.commons.lang.math.NumberUtils.max(longArray36);
        long[] longArray39 = new long[] { (byte) 1 };
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(longArray36, longArray39);
        long long41 = org.apache.commons.lang.math.NumberUtils.min(longArray39);
        long long42 = org.apache.commons.lang.math.NumberUtils.min(longArray39);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray30, longArray39);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray39);
        long long45 = org.apache.commons.lang.math.NumberUtils.min(longArray39);
        long long46 = org.apache.commons.lang.math.NumberUtils.min(longArray39);
        long[] longArray47 = null;
        long[] longArray49 = new long[] { 0L };
        long long50 = org.apache.commons.lang.math.NumberUtils.max(longArray49);
        long[] longArray52 = new long[] { (byte) 1 };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray49, longArray52);
        long long54 = org.apache.commons.lang.math.NumberUtils.min(longArray52);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(longArray47, longArray52);
        long[] longArray57 = new long[] { 0L };
        long long58 = org.apache.commons.lang.math.NumberUtils.max(longArray57);
        long[] longArray60 = new long[] { (byte) 1 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(longArray57, longArray60);
        long long62 = org.apache.commons.lang.math.NumberUtils.min(longArray60);
        long[] longArray64 = new long[] { 0L };
        long long65 = org.apache.commons.lang.math.NumberUtils.max(longArray64);
        long[] longArray67 = new long[] { (byte) 1 };
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(longArray64, longArray67);
        long long69 = org.apache.commons.lang.math.NumberUtils.max(longArray67);
        long[] longArray71 = new long[] { 0L };
        long long72 = org.apache.commons.lang.math.NumberUtils.max(longArray71);
        long[] longArray74 = new long[] { (byte) 1 };
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(longArray71, longArray74);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(longArray67, longArray74);
        long long77 = org.apache.commons.lang.math.NumberUtils.min(longArray67);
        long long78 = org.apache.commons.lang.math.NumberUtils.max(longArray67);
        long[] longArray80 = new long[] { 0L };
        long long81 = org.apache.commons.lang.math.NumberUtils.max(longArray80);
        long[] longArray83 = new long[] { (byte) 1 };
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(longArray80, longArray83);
        long long85 = org.apache.commons.lang.math.NumberUtils.min(longArray83);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(longArray67, longArray83);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(longArray60, longArray83);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(longArray52, longArray60);
        long[] longArray90 = new long[] { 1 };
        long long91 = org.apache.commons.lang.math.NumberUtils.max(longArray90);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(longArray52, longArray90);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(longArray39, longArray90);
        java.lang.Class<?> wildcardClass94 = longArray39.getClass();
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
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertArrayEquals(longArray30, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1L + "'", long34 == 1L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertArrayEquals(longArray36, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertArrayEquals(longArray39, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertArrayEquals(longArray49, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertArrayEquals(longArray52, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertArrayEquals(longArray57, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertArrayEquals(longArray60, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertArrayEquals(longArray64, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertArrayEquals(longArray67, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertArrayEquals(longArray71, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertNotNull(longArray74);
        org.junit.Assert.assertArrayEquals(longArray74, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 1L + "'", long77 == 1L);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertArrayEquals(longArray80, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertArrayEquals(longArray83, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 1L + "'", long85 == 1L);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertArrayEquals(longArray90, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 1L + "'", long91 == 1L);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 10, (double) 1, 32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 32L, (float) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(35.0d, (double) (byte) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        float[] floatArray1 = new float[] { (byte) 10 };
        float float2 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
        float float3 = org.apache.commons.lang.math.NumberUtils.max(floatArray1);
        float[] floatArray10 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float[] floatArray18 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float19 = org.apache.commons.lang.math.NumberUtils.min(floatArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray18);
        float float21 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float[] floatArray24 = new float[] { 97L, 'a' };
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray24);
        float[] floatArray30 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float31 = org.apache.commons.lang.math.NumberUtils.min(floatArray30);
        float[] floatArray38 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float39 = org.apache.commons.lang.math.NumberUtils.min(floatArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray38);
        float float41 = org.apache.commons.lang.math.NumberUtils.max(floatArray38);
        float[] floatArray46 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float47 = org.apache.commons.lang.math.NumberUtils.min(floatArray46);
        float[] floatArray54 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float55 = org.apache.commons.lang.math.NumberUtils.min(floatArray54);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(floatArray46, floatArray54);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(floatArray38, floatArray54);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray38);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 100.0f + "'", float21 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 97.0f, 97.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-1.0f) + "'", float31 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertArrayEquals(floatArray38, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-1.0f) + "'", float39 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 100.0f + "'", float41 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray46);
        org.junit.Assert.assertArrayEquals(floatArray46, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + (-1.0f) + "'", float47 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray54);
        org.junit.Assert.assertArrayEquals(floatArray54, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + (-1.0f) + "'", float55 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray12 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray12);
        float float15 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        float[] floatArray20 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float21 = org.apache.commons.lang.math.NumberUtils.min(floatArray20);
        float[] floatArray28 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float29 = org.apache.commons.lang.math.NumberUtils.min(floatArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(floatArray20, floatArray28);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray28);
        float float32 = org.apache.commons.lang.math.NumberUtils.min(floatArray28);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray20);
        org.junit.Assert.assertArrayEquals(floatArray20, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + (-1.0f) + "'", float29 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-1.0f) + "'", float32 == (-1.0f));
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 10L, 1.0f, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) ' ', (double) 10.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 10, (float) (byte) 100, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, (int) (short) 10, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, 32, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32L, (float) 32, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 1, (float) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray9 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray5);
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
        double double36 = org.apache.commons.lang.math.NumberUtils.max(doubleArray17);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray17);
        double double38 = org.apache.commons.lang.math.NumberUtils.max(doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
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
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 52.0d + "'", double36 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 52.0d + "'", double38 == 52.0d);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        short short26 = org.apache.commons.lang.math.NumberUtils.min(shortArray1);
        short[] shortArray28 = new short[] { (short) 100 };
        short[] shortArray29 = new short[] {};
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray28, shortArray29);
        short[] shortArray32 = new short[] { (short) 100 };
        short[] shortArray33 = new short[] {};
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(shortArray29, shortArray32);
        short[] shortArray37 = new short[] { (short) 100 };
        short[] shortArray38 = new short[] {};
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray37, shortArray38);
        short[] shortArray41 = new short[] { (short) 100 };
        short[] shortArray42 = new short[] {};
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray38, shortArray41);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray41);
        short short46 = org.apache.commons.lang.math.NumberUtils.min(shortArray41);
        short short47 = org.apache.commons.lang.math.NumberUtils.min(shortArray41);
        short[] shortArray53 = new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (byte) 10 };
        short short54 = org.apache.commons.lang.math.NumberUtils.min(shortArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray53);
        short[] shortArray57 = new short[] { (short) 100 };
        short[] shortArray58 = new short[] {};
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(shortArray57, shortArray58);
        short[] shortArray61 = new short[] { (short) 100 };
        short[] shortArray62 = new short[] {};
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(shortArray61, shortArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(shortArray58, shortArray61);
        short[] shortArray66 = new short[] { (short) 100 };
        short[] shortArray67 = new short[] {};
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray66, shortArray67);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(shortArray61, shortArray66);
        short[] shortArray71 = new short[] { (short) 100 };
        short[] shortArray72 = new short[] {};
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(shortArray71, shortArray72);
        short[] shortArray75 = new short[] { (short) 100 };
        short[] shortArray76 = new short[] {};
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(shortArray75, shortArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(shortArray72, shortArray75);
        short[] shortArray80 = new short[] { (short) 100 };
        short[] shortArray81 = new short[] {};
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(shortArray80, shortArray81);
        short[] shortArray84 = new short[] { (short) 100 };
        short[] shortArray85 = new short[] {};
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(shortArray84, shortArray85);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(shortArray81, shortArray84);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(shortArray75, shortArray84);
        short short89 = org.apache.commons.lang.math.NumberUtils.min(shortArray84);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(shortArray61, shortArray84);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray61);
        short short92 = org.apache.commons.lang.math.NumberUtils.max(shortArray61);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray61);
        short short94 = org.apache.commons.lang.math.NumberUtils.min(shortArray61);
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
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 100 + "'", short26 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray28);
        org.junit.Assert.assertArrayEquals(shortArray28, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray29);
        org.junit.Assert.assertArrayEquals(shortArray29, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray32, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray33, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + short46 + "' != '" + (short) 100 + "'", short46 == (short) 100);
        org.junit.Assert.assertTrue("'" + short47 + "' != '" + (short) 100 + "'", short47 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray53);
        org.junit.Assert.assertArrayEquals(shortArray53, new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (short) 10 });
        org.junit.Assert.assertTrue("'" + short54 + "' != '" + (short) 10 + "'", short54 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(shortArray57);
        org.junit.Assert.assertArrayEquals(shortArray57, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray58);
        org.junit.Assert.assertArrayEquals(shortArray58, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(shortArray61);
        org.junit.Assert.assertArrayEquals(shortArray61, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray62);
        org.junit.Assert.assertArrayEquals(shortArray62, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(shortArray66);
        org.junit.Assert.assertArrayEquals(shortArray66, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray67);
        org.junit.Assert.assertArrayEquals(shortArray67, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(shortArray71);
        org.junit.Assert.assertArrayEquals(shortArray71, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray72, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray75, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray76, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
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
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + short89 + "' != '" + (short) 100 + "'", short89 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + short92 + "' != '" + (short) 100 + "'", short92 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + short94 + "' != '" + (short) 100 + "'", short94 == (short) 100);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 100, (double) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, 32, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, 52, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(52.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0.0f, (double) 100.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100, (double) 52, 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray21);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte byte25 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte byte26 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte byte27 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
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
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) -1 + "'", byte25 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 100 + "'", byte26 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 100 + "'", byte27 == (byte) 100);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        double[] doubleArray0 = null;
        double[] doubleArray1 = null;
        double[] doubleArray6 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray10 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray1, doubleArray6);
        double[] doubleArray17 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray21 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray21);
        double double23 = org.apache.commons.lang.math.NumberUtils.min(doubleArray17);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray17);
        double double25 = org.apache.commons.lang.math.NumberUtils.max(doubleArray6);
        double double26 = org.apache.commons.lang.math.NumberUtils.min(doubleArray6);
        double[] doubleArray31 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray35 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray31, doubleArray35);
        double[] doubleArray41 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray45 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray41, doubleArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray31, doubleArray41);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray6, doubleArray31);
        double[] doubleArray53 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray57 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray53, doubleArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray31, doubleArray57);
        double double60 = org.apache.commons.lang.math.NumberUtils.max(doubleArray31);
        double[] doubleArray65 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray69 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray65, doubleArray69);
        double double71 = org.apache.commons.lang.math.NumberUtils.max(doubleArray69);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray31, doubleArray69);
        double[] doubleArray77 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray81 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray77, doubleArray81);
        double double83 = org.apache.commons.lang.math.NumberUtils.max(doubleArray77);
        double double84 = org.apache.commons.lang.math.NumberUtils.min(doubleArray77);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray31, doubleArray77);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray77);
        // The following exception was thrown during execution in test generation
        try {
            double double87 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 52.0d + "'", double60 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 100.0d + "'", double71 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 52.0d + "'", double83 == 52.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-1.0d) + "'", double84 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32.0f, (double) 52, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 10, 10L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, (float) 100, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, (double) 10, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 0, (double) 0, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 100, (-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray7 = new long[] { 52, (-1), '4', 100L };
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray7);
        long[] longArray11 = new long[] { 0L };
        long long12 = org.apache.commons.lang.math.NumberUtils.max(longArray11);
        long[] longArray14 = new long[] { (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray14);
        long long16 = org.apache.commons.lang.math.NumberUtils.max(longArray14);
        long[] longArray18 = new long[] { 0L };
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long[] longArray21 = new long[] { (byte) 1 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray21);
        long[] longArray25 = new long[] { 0L };
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(longArray21, longArray25);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray21);
        long long29 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
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
        long[] longArray46 = new long[] { (short) -1, (short) 1 };
        long[] longArray48 = new long[] { 0L };
        long long49 = org.apache.commons.lang.math.NumberUtils.max(longArray48);
        long[] longArray51 = new long[] { (byte) 1 };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray48, longArray51);
        long long53 = org.apache.commons.lang.math.NumberUtils.max(longArray51);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(longArray46, longArray51);
        long[] longArray56 = new long[] { 0L };
        long long57 = org.apache.commons.lang.math.NumberUtils.max(longArray56);
        long long58 = org.apache.commons.lang.math.NumberUtils.max(longArray56);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(longArray46, longArray56);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray56);
        long[] longArray62 = new long[] { 0L };
        long long63 = org.apache.commons.lang.math.NumberUtils.max(longArray62);
        long[] longArray65 = new long[] { (byte) 1 };
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(longArray62, longArray65);
        long long67 = org.apache.commons.lang.math.NumberUtils.min(longArray62);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray62);
        long[] longArray71 = new long[] { (short) -1, (short) 1 };
        long[] longArray73 = new long[] { 0L };
        long long74 = org.apache.commons.lang.math.NumberUtils.max(longArray73);
        long[] longArray76 = new long[] { (byte) 1 };
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(longArray73, longArray76);
        long long78 = org.apache.commons.lang.math.NumberUtils.max(longArray76);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(longArray71, longArray76);
        long long80 = org.apache.commons.lang.math.NumberUtils.max(longArray71);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(longArray62, longArray71);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray62);
        java.lang.Class<?> wildcardClass83 = longArray7.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray7);
        org.junit.Assert.assertArrayEquals(longArray7, new long[] { 52L, (-1L), 52L, 100L });
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(longArray11);
        org.junit.Assert.assertArrayEquals(longArray11, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(longArray14);
        org.junit.Assert.assertArrayEquals(longArray14, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(longArray21);
        org.junit.Assert.assertArrayEquals(longArray21, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
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
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertArrayEquals(longArray46, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertArrayEquals(longArray48, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertArrayEquals(longArray51, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertArrayEquals(longArray56, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertArrayEquals(longArray62, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertArrayEquals(longArray65, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertArrayEquals(longArray71, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertArrayEquals(longArray73, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertArrayEquals(longArray76, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1L + "'", long80 == 1L);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        long[] longArray0 = null;
        long[] longArray2 = new long[] { 0L };
        long long3 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray5 = new long[] { (byte) 1 };
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray5);
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray5);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray5);
        long[] longArray10 = new long[] { 0L };
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray10);
        long[] longArray13 = new long[] { (byte) 1 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(longArray10, longArray13);
        long long15 = org.apache.commons.lang.math.NumberUtils.min(longArray13);
        long[] longArray17 = new long[] { 0L };
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long[] longArray20 = new long[] { (byte) 1 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long[] longArray24 = new long[] { 0L };
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        long[] longArray27 = new long[] { (byte) 1 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray27);
        long long30 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
        long long31 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long[] longArray33 = new long[] { 0L };
        long long34 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long[] longArray36 = new long[] { (byte) 1 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray36);
        long long38 = org.apache.commons.lang.math.NumberUtils.min(longArray36);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray36);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray36);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray5, longArray13);
        long[] longArray43 = new long[] { 0L };
        long long44 = org.apache.commons.lang.math.NumberUtils.max(longArray43);
        long[] longArray49 = new long[] { 52, (-1), '4', 100L };
        long long50 = org.apache.commons.lang.math.NumberUtils.max(longArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray43, longArray49);
        long[] longArray53 = new long[] { 0L };
        long long54 = org.apache.commons.lang.math.NumberUtils.max(longArray53);
        long[] longArray56 = new long[] { (byte) 1 };
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(longArray53, longArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(longArray49, longArray56);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(longArray13, longArray56);
        long long60 = org.apache.commons.lang.math.NumberUtils.max(longArray56);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertArrayEquals(longArray36, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertArrayEquals(longArray43, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertArrayEquals(longArray49, new long[] { 52L, (-1L), 52L, 100L });
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L + "'", long50 == 100L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(longArray53);
        org.junit.Assert.assertArrayEquals(longArray53, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(longArray56);
        org.junit.Assert.assertArrayEquals(longArray56, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 1L + "'", long60 == 1L);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        float[] floatArray4 = new float[] { (byte) 0, (-1.0f), (short) 1, (-1.0f) };
        float float5 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray10 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray10);
        float[] floatArray17 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float18 = org.apache.commons.lang.math.NumberUtils.min(floatArray17);
        float float19 = org.apache.commons.lang.math.NumberUtils.max(floatArray17);
        float[] floatArray24 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float25 = org.apache.commons.lang.math.NumberUtils.min(floatArray24);
        float float26 = org.apache.commons.lang.math.NumberUtils.max(floatArray24);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray24);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray17);
        float[] floatArray33 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float34 = org.apache.commons.lang.math.NumberUtils.min(floatArray33);
        float[] floatArray41 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float42 = org.apache.commons.lang.math.NumberUtils.min(floatArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray41);
        float float44 = org.apache.commons.lang.math.NumberUtils.min(floatArray33);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray33);
        java.lang.Class<?> wildcardClass46 = floatArray33.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 0.0f, (-1.0f), 1.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertArrayEquals(floatArray24, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 100.0f + "'", float26 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertArrayEquals(floatArray33, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-1.0f) + "'", float34 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray41);
        org.junit.Assert.assertArrayEquals(floatArray41, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-1.0f) + "'", float42 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-1.0f) + "'", float44 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) '#', (double) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(32L, (long) 52, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) (byte) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(1, (int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray26);
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray32 = new long[] { 0L };
        long long33 = org.apache.commons.lang.math.NumberUtils.max(longArray32);
        long[] longArray35 = new long[] { (byte) 1 };
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray35);
        long long37 = org.apache.commons.lang.math.NumberUtils.min(longArray35);
        long long38 = org.apache.commons.lang.math.NumberUtils.min(longArray35);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray35);
        long long40 = org.apache.commons.lang.math.NumberUtils.max(longArray35);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertNotNull(longArray32);
        org.junit.Assert.assertArrayEquals(longArray32, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertArrayEquals(longArray35, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1L + "'", long37 == 1L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 35L, 97.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 32, (long) '4', 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(35.0d, (double) 1.0f, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) ' ', 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '4', (long) (byte) 100, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray12 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray12);
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray12);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        float float17 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        float float18 = org.apache.commons.lang.math.NumberUtils.min(floatArray12);
        float[] floatArray23 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float24 = org.apache.commons.lang.math.NumberUtils.min(floatArray23);
        float[] floatArray31 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float32 = org.apache.commons.lang.math.NumberUtils.min(floatArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(floatArray23, floatArray31);
        float float34 = org.apache.commons.lang.math.NumberUtils.min(floatArray31);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray31);
        float float36 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-1.0f) + "'", float24 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray31);
        org.junit.Assert.assertArrayEquals(floatArray31, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-1.0f) + "'", float32 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-1.0f) + "'", float34 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 100.0f + "'", float36 == 100.0f);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, 35, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray14 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray18 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray14);
        double double21 = org.apache.commons.lang.math.NumberUtils.min(doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(100.0d, (double) (short) -1, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
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
        float float24 = org.apache.commons.lang.math.NumberUtils.max(floatArray21);
        float[] floatArray29 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float30 = org.apache.commons.lang.math.NumberUtils.min(floatArray29);
        float float31 = org.apache.commons.lang.math.NumberUtils.max(floatArray29);
        float[] floatArray36 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float37 = org.apache.commons.lang.math.NumberUtils.min(floatArray36);
        float float38 = org.apache.commons.lang.math.NumberUtils.max(floatArray36);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(floatArray29, floatArray36);
        float[] floatArray44 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float45 = org.apache.commons.lang.math.NumberUtils.min(floatArray44);
        float float46 = org.apache.commons.lang.math.NumberUtils.max(floatArray44);
        float[] floatArray51 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float52 = org.apache.commons.lang.math.NumberUtils.min(floatArray51);
        float float53 = org.apache.commons.lang.math.NumberUtils.max(floatArray51);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(floatArray44, floatArray51);
        float float55 = org.apache.commons.lang.math.NumberUtils.min(floatArray44);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(floatArray36, floatArray44);
        float[] floatArray57 = null;
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray44, floatArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray44);
        java.lang.Class<?> wildcardClass60 = floatArray21.getClass();
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
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 100.0f + "'", float24 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertArrayEquals(floatArray29, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-1.0f) + "'", float30 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertArrayEquals(floatArray36, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-1.0f) + "'", float37 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 100.0f + "'", float38 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertArrayEquals(floatArray44, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + (-1.0f) + "'", float45 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 100.0f + "'", float46 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertArrayEquals(floatArray51, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + (-1.0f) + "'", float52 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 100.0f + "'", float53 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + (-1.0f) + "'", float55 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
        int int23 = org.apache.commons.lang.math.NumberUtils.min(intArray8);
        int[] intArray25 = new int[] { (short) -1 };
        int int26 = org.apache.commons.lang.math.NumberUtils.min(intArray25);
        int[] intArray28 = new int[] { (short) -1 };
        int int29 = org.apache.commons.lang.math.NumberUtils.min(intArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray28);
        int int31 = org.apache.commons.lang.math.NumberUtils.min(intArray25);
        int[] intArray33 = new int[] { (short) -1 };
        int int34 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        int[] intArray36 = new int[] { (short) -1 };
        int int37 = org.apache.commons.lang.math.NumberUtils.min(intArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray36);
        int[] intArray40 = new int[] { (short) -1 };
        int int41 = org.apache.commons.lang.math.NumberUtils.min(intArray40);
        int[] intArray43 = new int[] { (short) -1 };
        int int44 = org.apache.commons.lang.math.NumberUtils.min(intArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(intArray40, intArray43);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray36, intArray40);
        int int47 = org.apache.commons.lang.math.NumberUtils.max(intArray40);
        int int48 = org.apache.commons.lang.math.NumberUtils.max(intArray40);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray40);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray40);
        int[] intArray51 = null;
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray51);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = org.apache.commons.lang.math.NumberUtils.max(intArray51);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (-1), (float) ' ', (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray9 = new short[] { (short) 0, (byte) -1, (short) 0, (short) 1, (byte) 0 };
        short[] shortArray11 = new short[] { (short) 100 };
        short[] shortArray12 = new short[] {};
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray12);
        short[] shortArray15 = new short[] { (short) 100 };
        short[] shortArray16 = new short[] {};
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray15, shortArray16);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray15);
        short[] shortArray20 = new short[] { (short) 100 };
        short[] shortArray21 = new short[] {};
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray21);
        short[] shortArray24 = new short[] { (short) 100 };
        short[] shortArray25 = new short[] {};
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(shortArray21, shortArray24);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(shortArray15, shortArray24);
        short short29 = org.apache.commons.lang.math.NumberUtils.min(shortArray24);
        short short30 = org.apache.commons.lang.math.NumberUtils.min(shortArray24);
        short[] shortArray36 = new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (byte) 10 };
        short short37 = org.apache.commons.lang.math.NumberUtils.min(shortArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray36);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray9, shortArray36);
        short[] shortArray41 = new short[] { (short) 100 };
        short[] shortArray42 = new short[] {};
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray42);
        short[] shortArray45 = new short[] { (short) 100 };
        short[] shortArray46 = new short[] {};
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray42, shortArray45);
        short[] shortArray50 = new short[] { (short) 100 };
        short[] shortArray51 = new short[] {};
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(shortArray50, shortArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray50);
        short[] shortArray55 = new short[] { (short) 100 };
        short[] shortArray56 = new short[] {};
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(shortArray55, shortArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray55);
        short short59 = org.apache.commons.lang.math.NumberUtils.min(shortArray45);
        short short60 = org.apache.commons.lang.math.NumberUtils.min(shortArray45);
        short short61 = org.apache.commons.lang.math.NumberUtils.max(shortArray45);
        short short62 = org.apache.commons.lang.math.NumberUtils.max(shortArray45);
        short short63 = org.apache.commons.lang.math.NumberUtils.max(shortArray45);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(shortArray9, shortArray45);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray9);
        // The following exception was thrown during execution in test generation
        try {
            short short66 = org.apache.commons.lang.math.NumberUtils.max(shortArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertArrayEquals(shortArray9, new short[] { (short) 0, (short) -1, (short) 0, (short) 1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 100 + "'", short29 == (short) 100);
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 100 + "'", short30 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (short) 10 });
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 10 + "'", short37 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray41, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray42, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray45, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray46, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray50, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray51, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray55, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray56);
        org.junit.Assert.assertArrayEquals(shortArray56, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + short59 + "' != '" + (short) 100 + "'", short59 == (short) 100);
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) 100 + "'", short60 == (short) 100);
        org.junit.Assert.assertTrue("'" + short61 + "' != '" + (short) 100 + "'", short61 == (short) 100);
        org.junit.Assert.assertTrue("'" + short62 + "' != '" + (short) 100 + "'", short62 == (short) 100);
        org.junit.Assert.assertTrue("'" + short63 + "' != '" + (short) 100 + "'", short63 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (-1), (float) 1, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 52, 32L, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
        double double24 = org.apache.commons.lang.math.NumberUtils.min(doubleArray5);
        double double25 = org.apache.commons.lang.math.NumberUtils.max(doubleArray5);
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
        double double50 = org.apache.commons.lang.math.NumberUtils.max(doubleArray42);
        double[] doubleArray55 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray59 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray55, doubleArray59);
        double double61 = org.apache.commons.lang.math.NumberUtils.max(doubleArray55);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray55);
        double double63 = org.apache.commons.lang.math.NumberUtils.max(doubleArray55);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray55);
        java.lang.Class<?> wildcardClass65 = doubleArray5.getClass();
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
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
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 52.0d + "'", double61 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 52.0d + "'", double63 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
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
        byte byte62 = org.apache.commons.lang.math.NumberUtils.min(byteArray51);
        byte byte63 = org.apache.commons.lang.math.NumberUtils.min(byteArray51);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray51);
        byte[] byteArray67 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray74 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(byteArray67, byteArray74);
        byte byte76 = org.apache.commons.lang.math.NumberUtils.min(byteArray74);
        byte[] byteArray79 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray86 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(byteArray79, byteArray86);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(byteArray74, byteArray86);
        byte byte89 = org.apache.commons.lang.math.NumberUtils.max(byteArray86);
        byte[] byteArray91 = new byte[] { (byte) 100 };
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(byteArray86, byteArray91);
        byte byte93 = org.apache.commons.lang.math.NumberUtils.max(byteArray91);
        byte byte94 = org.apache.commons.lang.math.NumberUtils.min(byteArray91);
        byte byte95 = org.apache.commons.lang.math.NumberUtils.min(byteArray91);
        byte[] byteArray96 = null;
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(byteArray91, byteArray96);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray91);
        byte byte99 = org.apache.commons.lang.math.NumberUtils.max(byteArray91);
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
        org.junit.Assert.assertTrue("'" + byte62 + "' != '" + (byte) 100 + "'", byte62 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte63 + "' != '" + (byte) 100 + "'", byte63 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) -1 + "'", byte76 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + byte89 + "' != '" + (byte) 100 + "'", byte89 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + byte93 + "' != '" + (byte) 100 + "'", byte93 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte94 + "' != '" + (byte) 100 + "'", byte94 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte95 + "' != '" + (byte) 100 + "'", byte95 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + byte99 + "' != '" + (byte) 100 + "'", byte99 == (byte) 100);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(32.0f, (float) 35L, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        short[] shortArray0 = new short[] {};
        short[] shortArray2 = new short[] { (short) 100 };
        short[] shortArray3 = new short[] {};
        boolean boolean4 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray3);
        short[] shortArray6 = new short[] { (short) 100 };
        short[] shortArray7 = new short[] {};
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(shortArray3, shortArray6);
        short[] shortArray11 = new short[] { (short) 100 };
        short[] shortArray12 = new short[] {};
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray12);
        short[] shortArray15 = new short[] { (short) 100 };
        short[] shortArray16 = new short[] {};
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(shortArray15, shortArray16);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(shortArray12, shortArray15);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray15);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray6);
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
        short[] shortArray36 = new short[] { (short) 100 };
        short[] shortArray37 = new short[] {};
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray26, shortArray36);
        short[] shortArray41 = new short[] { (short) 100 };
        short[] shortArray42 = new short[] {};
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(shortArray41, shortArray42);
        short[] shortArray45 = new short[] { (short) 100 };
        short[] shortArray46 = new short[] {};
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(shortArray42, shortArray45);
        short[] shortArray50 = new short[] { (short) 100 };
        short[] shortArray51 = new short[] {};
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(shortArray50, shortArray51);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray45, shortArray50);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray36, shortArray45);
        short short55 = org.apache.commons.lang.math.NumberUtils.max(shortArray36);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray36);
        short short57 = org.apache.commons.lang.math.NumberUtils.max(shortArray6);
        short[] shortArray59 = new short[] { (short) 100 };
        short[] shortArray60 = new short[] {};
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(shortArray59, shortArray60);
        short[] shortArray63 = new short[] { (short) 100 };
        short[] shortArray64 = new short[] {};
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray63, shortArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(shortArray60, shortArray63);
        short[] shortArray68 = new short[] { (short) 100 };
        short[] shortArray69 = new short[] {};
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(shortArray68, shortArray69);
        short[] shortArray72 = new short[] { (short) 100 };
        short[] shortArray73 = new short[] {};
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(shortArray72, shortArray73);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(shortArray69, shortArray72);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(shortArray63, shortArray72);
        short short77 = org.apache.commons.lang.math.NumberUtils.min(shortArray72);
        short short78 = org.apache.commons.lang.math.NumberUtils.min(shortArray72);
        short short79 = org.apache.commons.lang.math.NumberUtils.max(shortArray72);
        short short80 = org.apache.commons.lang.math.NumberUtils.max(shortArray72);
        short short81 = org.apache.commons.lang.math.NumberUtils.max(shortArray72);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(shortArray6, shortArray72);
        java.lang.Class<?> wildcardClass83 = shortArray72.getClass();
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertArrayEquals(shortArray0, new short[] {});
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertArrayEquals(shortArray3, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertArrayEquals(shortArray6, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(shortArray15);
        org.junit.Assert.assertArrayEquals(shortArray15, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
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
        org.junit.Assert.assertNotNull(shortArray36);
        org.junit.Assert.assertArrayEquals(shortArray36, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray37, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(shortArray41);
        org.junit.Assert.assertArrayEquals(shortArray41, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray42, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(shortArray45);
        org.junit.Assert.assertArrayEquals(shortArray45, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray46);
        org.junit.Assert.assertArrayEquals(shortArray46, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(shortArray50);
        org.junit.Assert.assertArrayEquals(shortArray50, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray51, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 100 + "'", short55 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) 100 + "'", short57 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray59);
        org.junit.Assert.assertArrayEquals(shortArray59, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray60);
        org.junit.Assert.assertArrayEquals(shortArray60, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(shortArray63);
        org.junit.Assert.assertArrayEquals(shortArray63, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray64);
        org.junit.Assert.assertArrayEquals(shortArray64, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(shortArray68);
        org.junit.Assert.assertArrayEquals(shortArray68, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray69);
        org.junit.Assert.assertArrayEquals(shortArray69, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(shortArray72);
        org.junit.Assert.assertArrayEquals(shortArray72, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray73);
        org.junit.Assert.assertArrayEquals(shortArray73, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + short77 + "' != '" + (short) 100 + "'", short77 == (short) 100);
        org.junit.Assert.assertTrue("'" + short78 + "' != '" + (short) 100 + "'", short78 == (short) 100);
        org.junit.Assert.assertTrue("'" + short79 + "' != '" + (short) 100 + "'", short79 == (short) 100);
        org.junit.Assert.assertTrue("'" + short80 + "' != '" + (short) 100 + "'", short80 == (short) 100);
        org.junit.Assert.assertTrue("'" + short81 + "' != '" + (short) 100 + "'", short81 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
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
        byte byte28 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
        byte byte29 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte byte30 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte[] byteArray31 = null;
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray31);
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
        byte byte70 = org.apache.commons.lang.math.NumberUtils.min(byteArray59);
        byte[] byteArray73 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray80 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray73, byteArray80);
        byte byte82 = org.apache.commons.lang.math.NumberUtils.min(byteArray80);
        byte[] byteArray85 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray92 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(byteArray85, byteArray92);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(byteArray80, byteArray92);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(byteArray59, byteArray92);
        byte byte96 = org.apache.commons.lang.math.NumberUtils.min(byteArray59);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray59);
        byte byte98 = org.apache.commons.lang.math.NumberUtils.max(byteArray59);
        byte byte99 = org.apache.commons.lang.math.NumberUtils.min(byteArray59);
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
        org.junit.Assert.assertTrue("'" + byte30 + "' != '" + (byte) 100 + "'", byte30 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
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
        org.junit.Assert.assertTrue("'" + byte70 + "' != '" + (byte) 100 + "'", byte70 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + byte82 + "' != '" + (byte) -1 + "'", byte82 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + byte96 + "' != '" + (byte) 100 + "'", byte96 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + byte98 + "' != '" + (byte) 100 + "'", byte98 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte99 + "' != '" + (byte) 100 + "'", byte99 == (byte) 100);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        int[] intArray34 = null;
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(intArray25, intArray34);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = org.apache.commons.lang.math.NumberUtils.max(intArray34);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 1, (int) (short) 1, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, 100, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        int[] intArray23 = new int[] { (short) -1 };
        int int24 = org.apache.commons.lang.math.NumberUtils.min(intArray23);
        int[] intArray26 = new int[] { (short) -1 };
        int int27 = org.apache.commons.lang.math.NumberUtils.min(intArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(intArray23, intArray26);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(intArray19, intArray23);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray19);
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
        int[] intArray64 = new int[] { (short) -1 };
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray64);
        int[] intArray67 = new int[] { (short) -1 };
        int int68 = org.apache.commons.lang.math.NumberUtils.min(intArray67);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(intArray64, intArray67);
        int[] intArray71 = new int[] { (short) -1 };
        int int72 = org.apache.commons.lang.math.NumberUtils.min(intArray71);
        int[] intArray74 = new int[] { (short) -1 };
        int int75 = org.apache.commons.lang.math.NumberUtils.min(intArray74);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(intArray71, intArray74);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(intArray67, intArray71);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(intArray56, intArray71);
        int[] intArray80 = new int[] { (short) -1 };
        int int81 = org.apache.commons.lang.math.NumberUtils.min(intArray80);
        int[] intArray83 = new int[] { (short) -1 };
        int int84 = org.apache.commons.lang.math.NumberUtils.min(intArray83);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(intArray80, intArray83);
        int int86 = org.apache.commons.lang.math.NumberUtils.min(intArray80);
        int int87 = org.apache.commons.lang.math.NumberUtils.min(intArray80);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(intArray56, intArray80);
        int int89 = org.apache.commons.lang.math.NumberUtils.min(intArray56);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(intArray47, intArray56);
        int int91 = org.apache.commons.lang.math.NumberUtils.max(intArray56);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(intArray19, intArray56);
        int int93 = org.apache.commons.lang.math.NumberUtils.max(intArray19);
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
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
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertArrayEquals(intArray67, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertArrayEquals(intArray74, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(intArray80);
        org.junit.Assert.assertArrayEquals(intArray80, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertArrayEquals(intArray83, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) ' ', (double) (short) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 35, (float) (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((-1), 52, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
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
        int[] intArray33 = new int[] { (short) -1 };
        int int34 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        int[] intArray36 = new int[] { (short) -1 };
        int int37 = org.apache.commons.lang.math.NumberUtils.min(intArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray36);
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        int int40 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray33);
        int int42 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray9);
        int int44 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray46 = new int[] { (short) -1 };
        int int47 = org.apache.commons.lang.math.NumberUtils.min(intArray46);
        int[] intArray49 = new int[] { (short) -1 };
        int int50 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(intArray46, intArray49);
        int[] intArray53 = new int[] { (short) -1 };
        int int54 = org.apache.commons.lang.math.NumberUtils.min(intArray53);
        int[] intArray56 = new int[] { (short) -1 };
        int int57 = org.apache.commons.lang.math.NumberUtils.min(intArray56);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(intArray53, intArray56);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray53);
        int[] intArray61 = new int[] { (short) -1 };
        int int62 = org.apache.commons.lang.math.NumberUtils.min(intArray61);
        int[] intArray64 = new int[] { (short) -1 };
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(intArray61, intArray64);
        int[] intArray68 = new int[] { (short) -1 };
        int int69 = org.apache.commons.lang.math.NumberUtils.min(intArray68);
        int[] intArray71 = new int[] { (short) -1 };
        int int72 = org.apache.commons.lang.math.NumberUtils.min(intArray71);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(intArray68, intArray71);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(intArray64, intArray68);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray64);
        int int76 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray49);
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
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertArrayEquals(intArray46, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertArrayEquals(intArray68, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertArrayEquals(intArray71, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 35, (long) 1, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) -1, 52L, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(1, (int) (byte) 100, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }
}

