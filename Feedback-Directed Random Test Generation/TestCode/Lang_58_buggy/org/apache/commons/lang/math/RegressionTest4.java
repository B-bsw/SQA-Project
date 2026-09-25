package org.apache.commons.lang.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 0, 52, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(1.0d, (double) '4', (double) 35L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, 35L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) (byte) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 100, 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (long) '4', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        int int8 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(97L, 52L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) (byte) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) (byte) -1, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 1, 0L, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 1, (float) (-1), (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray12 = new float[] { (byte) 0, (-1.0f), (short) 1, (-1.0f) };
        float float13 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray12);
        float[] floatArray19 = new float[] { (byte) 0, (-1.0f), (short) 1, (-1.0f) };
        float float20 = org.apache.commons.lang.math.NumberUtils.max(floatArray19);
        float[] floatArray25 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float26 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float[] floatArray28 = new float[] { (byte) 10 };
        float float29 = org.apache.commons.lang.math.NumberUtils.min(floatArray28);
        float float30 = org.apache.commons.lang.math.NumberUtils.max(floatArray28);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray25, floatArray28);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray28);
        float[] floatArray37 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float38 = org.apache.commons.lang.math.NumberUtils.min(floatArray37);
        float float39 = org.apache.commons.lang.math.NumberUtils.max(floatArray37);
        float[] floatArray44 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float45 = org.apache.commons.lang.math.NumberUtils.min(floatArray44);
        float float46 = org.apache.commons.lang.math.NumberUtils.max(floatArray44);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray37, floatArray44);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray44);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray44);
        float float50 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        float[] floatArray55 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float56 = org.apache.commons.lang.math.NumberUtils.min(floatArray55);
        float[] floatArray58 = new float[] { (byte) 10 };
        float float59 = org.apache.commons.lang.math.NumberUtils.min(floatArray58);
        float float60 = org.apache.commons.lang.math.NumberUtils.max(floatArray58);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(floatArray55, floatArray58);
        float float62 = org.apache.commons.lang.math.NumberUtils.min(floatArray55);
        float[] floatArray67 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float68 = org.apache.commons.lang.math.NumberUtils.min(floatArray67);
        float float69 = org.apache.commons.lang.math.NumberUtils.max(floatArray67);
        float[] floatArray74 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float75 = org.apache.commons.lang.math.NumberUtils.min(floatArray74);
        float float76 = org.apache.commons.lang.math.NumberUtils.max(floatArray74);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(floatArray67, floatArray74);
        float float78 = org.apache.commons.lang.math.NumberUtils.max(floatArray74);
        float float79 = org.apache.commons.lang.math.NumberUtils.min(floatArray74);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(floatArray55, floatArray74);
        float float81 = org.apache.commons.lang.math.NumberUtils.min(floatArray55);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray55);
        java.lang.Class<?> wildcardClass83 = floatArray55.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 0.0f, (-1.0f), 1.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 0.0f, (-1.0f), 1.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 10.0f + "'", float30 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertArrayEquals(floatArray37, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-1.0f) + "'", float38 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertArrayEquals(floatArray44, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + (-1.0f) + "'", float45 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 100.0f + "'", float46 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 1.0f + "'", float50 == 1.0f);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertArrayEquals(floatArray55, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + (-1.0f) + "'", float56 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertArrayEquals(floatArray58, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + 10.0f + "'", float59 == 10.0f);
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 10.0f + "'", float60 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + (-1.0f) + "'", float62 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray67);
        org.junit.Assert.assertArrayEquals(floatArray67, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + (-1.0f) + "'", float68 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float69 + "' != '" + 100.0f + "'", float69 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray74);
        org.junit.Assert.assertArrayEquals(floatArray74, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + (-1.0f) + "'", float75 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float76 + "' != '" + 100.0f + "'", float76 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + 100.0f + "'", float78 == 100.0f);
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + (-1.0f) + "'", float79 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + float81 + "' != '" + (-1.0f) + "'", float81 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
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
        byte byte37 = org.apache.commons.lang.math.NumberUtils.min(byteArray35);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.min(byteArray35);
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
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) -1 + "'", byte37 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) -1 + "'", byte38 == (byte) -1);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, (-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, 52, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
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
        byte byte29 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte byte30 = org.apache.commons.lang.math.NumberUtils.min(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray40 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray40);
        byte byte42 = org.apache.commons.lang.math.NumberUtils.min(byteArray40);
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray52 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(byteArray45, byteArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(byteArray40, byteArray52);
        byte byte55 = org.apache.commons.lang.math.NumberUtils.max(byteArray52);
        byte[] byteArray57 = new byte[] { (byte) 100 };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(byteArray52, byteArray57);
        byte byte59 = org.apache.commons.lang.math.NumberUtils.max(byteArray57);
        byte[] byteArray66 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(byteArray57, byteArray66);
        byte[] byteArray70 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray77 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(byteArray70, byteArray77);
        byte byte79 = org.apache.commons.lang.math.NumberUtils.min(byteArray77);
        byte[] byteArray82 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray89 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(byteArray82, byteArray89);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(byteArray77, byteArray89);
        byte byte92 = org.apache.commons.lang.math.NumberUtils.max(byteArray89);
        byte[] byteArray94 = new byte[] { (byte) 100 };
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(byteArray89, byteArray94);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(byteArray66, byteArray94);
        byte byte97 = org.apache.commons.lang.math.NumberUtils.max(byteArray66);
        byte byte98 = org.apache.commons.lang.math.NumberUtils.min(byteArray66);
        boolean boolean99 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray66);
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
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) -1 + "'", byte42 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + byte55 + "' != '" + (byte) 100 + "'", byte55 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + byte59 + "' != '" + (byte) 100 + "'", byte59 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + byte79 + "' != '" + (byte) -1 + "'", byte79 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + byte92 + "' != '" + (byte) 100 + "'", byte92 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertArrayEquals(byteArray94, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + byte97 + "' != '" + (byte) 100 + "'", byte97 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte98 + "' != '" + (byte) -1 + "'", byte98 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        long[] longArray31 = new long[] { 0L };
        long long32 = org.apache.commons.lang.math.NumberUtils.max(longArray31);
        long[] longArray34 = new long[] { (byte) 1 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(longArray31, longArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(longArray27, longArray34);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray34);
        long long38 = org.apache.commons.lang.math.NumberUtils.max(longArray34);
        long long39 = org.apache.commons.lang.math.NumberUtils.max(longArray34);
        long long40 = org.apache.commons.lang.math.NumberUtils.min(longArray34);
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray34);
        java.lang.Class<?> wildcardClass42 = longArray34.getClass();
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
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertArrayEquals(longArray34, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1L + "'", long38 == 1L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(32.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 10, (int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 32L, (float) 0, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long[] longArray30 = new long[] { 0L };
        long long31 = org.apache.commons.lang.math.NumberUtils.max(longArray30);
        long[] longArray33 = new long[] { (byte) 1 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(longArray30, longArray33);
        long long35 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long[] longArray37 = new long[] { 0L };
        long long38 = org.apache.commons.lang.math.NumberUtils.max(longArray37);
        long[] longArray40 = new long[] { (byte) 1 };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray37, longArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray40);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray40);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray18);
        long long45 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long long46 = org.apache.commons.lang.math.NumberUtils.min(longArray18);
        long long47 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long[] longArray49 = new long[] { 0L };
        long long50 = org.apache.commons.lang.math.NumberUtils.max(longArray49);
        long[] longArray55 = new long[] { 52, (-1), '4', 100L };
        long long56 = org.apache.commons.lang.math.NumberUtils.max(longArray55);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(longArray49, longArray55);
        long[] longArray59 = new long[] { 0L };
        long long60 = org.apache.commons.lang.math.NumberUtils.max(longArray59);
        long[] longArray62 = new long[] { (byte) 1 };
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(longArray59, longArray62);
        long long64 = org.apache.commons.lang.math.NumberUtils.max(longArray62);
        long[] longArray66 = new long[] { 0L };
        long long67 = org.apache.commons.lang.math.NumberUtils.max(longArray66);
        long[] longArray69 = new long[] { (byte) 1 };
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(longArray66, longArray69);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(longArray62, longArray69);
        long[] longArray73 = new long[] { 0L };
        long long74 = org.apache.commons.lang.math.NumberUtils.max(longArray73);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(longArray69, longArray73);
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(longArray55, longArray69);
        long long77 = org.apache.commons.lang.math.NumberUtils.max(longArray55);
        long[] longArray79 = new long[] { 0L };
        long long80 = org.apache.commons.lang.math.NumberUtils.max(longArray79);
        long[] longArray82 = new long[] { (byte) 1 };
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(longArray79, longArray82);
        long long84 = org.apache.commons.lang.math.NumberUtils.max(longArray82);
        long[] longArray86 = new long[] { 0L };
        long long87 = org.apache.commons.lang.math.NumberUtils.max(longArray86);
        long[] longArray89 = new long[] { (byte) 1 };
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(longArray86, longArray89);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(longArray82, longArray89);
        long long92 = org.apache.commons.lang.math.NumberUtils.max(longArray82);
        long long93 = org.apache.commons.lang.math.NumberUtils.max(longArray82);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(longArray55, longArray82);
        long long95 = org.apache.commons.lang.math.NumberUtils.max(longArray82);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray82);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertArrayEquals(longArray30, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertArrayEquals(longArray37, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertArrayEquals(longArray40, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertArrayEquals(longArray49, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(longArray55);
        org.junit.Assert.assertArrayEquals(longArray55, new long[] { 52L, (-1L), 52L, 100L });
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 100L + "'", long56 == 100L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertArrayEquals(longArray59, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertArrayEquals(longArray62, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertNotNull(longArray66);
        org.junit.Assert.assertArrayEquals(longArray66, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(longArray69);
        org.junit.Assert.assertArrayEquals(longArray69, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertArrayEquals(longArray73, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 100L + "'", long77 == 100L);
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertArrayEquals(longArray79, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertArrayEquals(longArray82, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 1L + "'", long84 == 1L);
        org.junit.Assert.assertNotNull(longArray86);
        org.junit.Assert.assertArrayEquals(longArray86, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertArrayEquals(longArray89, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 1L + "'", long92 == 1L);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 1L + "'", long93 == 1L);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 1L + "'", long95 == 1L);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '4', (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray9);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray21);
        byte byte24 = org.apache.commons.lang.math.NumberUtils.max(byteArray9);
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
        byte[] byteArray64 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray71 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(byteArray64, byteArray71);
        byte byte73 = org.apache.commons.lang.math.NumberUtils.min(byteArray71);
        byte[] byteArray76 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray83 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(byteArray76, byteArray83);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(byteArray71, byteArray83);
        byte byte86 = org.apache.commons.lang.math.NumberUtils.max(byteArray83);
        byte[] byteArray88 = new byte[] { (byte) 100 };
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(byteArray83, byteArray88);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(byteArray60, byteArray88);
        byte byte91 = org.apache.commons.lang.math.NumberUtils.max(byteArray60);
        byte byte92 = org.apache.commons.lang.math.NumberUtils.max(byteArray60);
        byte byte93 = org.apache.commons.lang.math.NumberUtils.min(byteArray60);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(byteArray9, byteArray60);
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
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + byte73 + "' != '" + (byte) -1 + "'", byte73 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + byte86 + "' != '" + (byte) 100 + "'", byte86 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + byte91 + "' != '" + (byte) 100 + "'", byte91 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte92 + "' != '" + (byte) 100 + "'", byte92 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte93 + "' != '" + (byte) -1 + "'", byte93 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 35, (long) 35, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        short short20 = org.apache.commons.lang.math.NumberUtils.max(shortArray5);
        short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
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
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 1, (double) 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        int int23 = org.apache.commons.lang.math.NumberUtils.min(intArray17);
        int int24 = org.apache.commons.lang.math.NumberUtils.max(intArray17);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray17);
        int[] intArray27 = new int[] { (short) -1 };
        int int28 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        int[] intArray30 = new int[] { (short) -1 };
        int int31 = org.apache.commons.lang.math.NumberUtils.min(intArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray30);
        int[] intArray34 = new int[] { (short) -1 };
        int int35 = org.apache.commons.lang.math.NumberUtils.min(intArray34);
        int[] intArray37 = new int[] { (short) -1 };
        int int38 = org.apache.commons.lang.math.NumberUtils.min(intArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(intArray34, intArray37);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray30, intArray34);
        int[] intArray42 = new int[] { (short) -1 };
        int int43 = org.apache.commons.lang.math.NumberUtils.min(intArray42);
        int[] intArray45 = new int[] { (short) -1 };
        int int46 = org.apache.commons.lang.math.NumberUtils.min(intArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(intArray42, intArray45);
        int int48 = org.apache.commons.lang.math.NumberUtils.min(intArray42);
        int int49 = org.apache.commons.lang.math.NumberUtils.max(intArray42);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(intArray34, intArray42);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(intArray17, intArray42);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray42);
        int int53 = org.apache.commons.lang.math.NumberUtils.min(intArray42);
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
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertArrayEquals(intArray45, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0, (double) 0.0f, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 10, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0.0f, (double) 100.0f, (double) 52L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(10.0f, (float) 100, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        short[] shortArray65 = new short[] { (short) 100 };
        short[] shortArray66 = new short[] {};
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(shortArray65, shortArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(shortArray62, shortArray65);
        short[] shortArray70 = new short[] { (short) 100 };
        short[] shortArray71 = new short[] {};
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(shortArray70, shortArray71);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(shortArray65, shortArray70);
        short[] shortArray75 = new short[] { (short) 100 };
        short[] shortArray76 = new short[] {};
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(shortArray75, shortArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(shortArray65, shortArray75);
        short[] shortArray79 = null;
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(shortArray75, shortArray79);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(shortArray57, shortArray79);
        short short82 = org.apache.commons.lang.math.NumberUtils.min(shortArray57);
        short short83 = org.apache.commons.lang.math.NumberUtils.max(shortArray57);
        short short84 = org.apache.commons.lang.math.NumberUtils.min(shortArray57);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray57);
        short short86 = org.apache.commons.lang.math.NumberUtils.min(shortArray57);
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(shortArray75);
        org.junit.Assert.assertArrayEquals(shortArray75, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray76);
        org.junit.Assert.assertArrayEquals(shortArray76, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + short82 + "' != '" + (short) 100 + "'", short82 == (short) 100);
        org.junit.Assert.assertTrue("'" + short83 + "' != '" + (short) 100 + "'", short83 == (short) 100);
        org.junit.Assert.assertTrue("'" + short84 + "' != '" + (short) 100 + "'", short84 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + short86 + "' != '" + (short) 100 + "'", short86 == (short) 100);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 97L, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 35L, (float) 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0d), (double) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1.0f), (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32L, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long[] longArray30 = new long[] { 0L };
        long long31 = org.apache.commons.lang.math.NumberUtils.max(longArray30);
        long[] longArray33 = new long[] { (byte) 1 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(longArray30, longArray33);
        long long35 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long[] longArray37 = new long[] { 0L };
        long long38 = org.apache.commons.lang.math.NumberUtils.max(longArray37);
        long[] longArray40 = new long[] { (byte) 1 };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray37, longArray40);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray40);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray40);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray18);
        long long45 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long long46 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertArrayEquals(longArray30, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertArrayEquals(longArray37, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(longArray40);
        org.junit.Assert.assertArrayEquals(longArray40, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1L + "'", long45 == 1L);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1L + "'", long46 == 1L);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray10 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float float12 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray10);
        float[] floatArray19 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float20 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        float[] floatArray25 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float26 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float float27 = org.apache.commons.lang.math.NumberUtils.max(floatArray25);
        float float28 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray25);
        float float30 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float float31 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float float32 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray25);
        float float34 = org.apache.commons.lang.math.NumberUtils.max(floatArray25);
        float float35 = org.apache.commons.lang.math.NumberUtils.max(floatArray25);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + (-1.0f) + "'", float30 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-1.0f) + "'", float31 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-1.0f) + "'", float32 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 100.0f + "'", float34 == 100.0f);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (-1L), (double) 10, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) -1, (float) (byte) 100, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 1, (long) (short) -1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, 32, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 10, (long) '4', (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(32L, 52L, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100, (double) (byte) -1, 52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        int[] intArray0 = null;
        int[] intArray1 = null;
        boolean boolean2 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        int int31 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        int[] intArray33 = new int[] { (short) -1 };
        int int34 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        int[] intArray36 = new int[] { (short) -1 };
        int int37 = org.apache.commons.lang.math.NumberUtils.min(intArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(intArray33, intArray36);
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray36);
        int[] intArray41 = new int[] { (short) -1 };
        int int42 = org.apache.commons.lang.math.NumberUtils.min(intArray41);
        int[] intArray44 = new int[] { (short) -1 };
        int int45 = org.apache.commons.lang.math.NumberUtils.min(intArray44);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray44);
        int int47 = org.apache.commons.lang.math.NumberUtils.min(intArray41);
        int[] intArray49 = new int[] { (short) -1 };
        int int50 = org.apache.commons.lang.math.NumberUtils.min(intArray49);
        int[] intArray52 = new int[] { (short) -1 };
        int int53 = org.apache.commons.lang.math.NumberUtils.min(intArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(intArray49, intArray52);
        int[] intArray56 = new int[] { (short) -1 };
        int int57 = org.apache.commons.lang.math.NumberUtils.min(intArray56);
        int[] intArray59 = new int[] { (short) -1 };
        int int60 = org.apache.commons.lang.math.NumberUtils.min(intArray59);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(intArray56, intArray59);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(intArray52, intArray56);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray56);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(intArray36, intArray41);
        int[] intArray66 = new int[] { (short) -1 };
        int int67 = org.apache.commons.lang.math.NumberUtils.min(intArray66);
        int[] intArray69 = new int[] { (short) -1 };
        int int70 = org.apache.commons.lang.math.NumberUtils.min(intArray69);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray66, intArray69);
        int[] intArray73 = new int[] { (short) -1 };
        int int74 = org.apache.commons.lang.math.NumberUtils.min(intArray73);
        int[] intArray76 = new int[] { (short) -1 };
        int int77 = org.apache.commons.lang.math.NumberUtils.min(intArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(intArray73, intArray76);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(intArray69, intArray73);
        int[] intArray81 = new int[] { (short) -1 };
        int int82 = org.apache.commons.lang.math.NumberUtils.min(intArray81);
        int[] intArray84 = new int[] { (short) -1 };
        int int85 = org.apache.commons.lang.math.NumberUtils.min(intArray84);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(intArray81, intArray84);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(intArray73, intArray81);
        int int88 = org.apache.commons.lang.math.NumberUtils.min(intArray81);
        int int89 = org.apache.commons.lang.math.NumberUtils.max(intArray81);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(intArray41, intArray81);
        int int91 = org.apache.commons.lang.math.NumberUtils.min(intArray41);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray41);
        int int93 = org.apache.commons.lang.math.NumberUtils.min(intArray41);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
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
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertArrayEquals(intArray59, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertArrayEquals(intArray81, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(intArray84);
        org.junit.Assert.assertArrayEquals(intArray84, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '4', (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 0, (double) 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) -1, (long) 'a', 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 0, (long) (short) 1, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) ' ', (float) (byte) -1, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        double double38 = org.apache.commons.lang.math.NumberUtils.min(doubleArray17);
        double double39 = org.apache.commons.lang.math.NumberUtils.min(doubleArray17);
        double double40 = org.apache.commons.lang.math.NumberUtils.max(doubleArray17);
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
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 52.0d + "'", double40 == 52.0d);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1L, (float) 0L, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        long[] longArray2 = new long[] { (short) -1, (short) 1 };
        long[] longArray4 = new long[] { 0L };
        long long5 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray7 = new long[] { (byte) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray7);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray7);
        long[] longArray12 = new long[] { 0L };
        long long13 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        long[] longArray18 = new long[] { 52, (-1), '4', 100L };
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray18);
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
        long[] longArray36 = new long[] { 0L };
        long long37 = org.apache.commons.lang.math.NumberUtils.max(longArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray32, longArray36);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray32);
        long long40 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long[] longArray42 = new long[] { 0L };
        long long43 = org.apache.commons.lang.math.NumberUtils.max(longArray42);
        long[] longArray45 = new long[] { (byte) 1 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray45);
        long long47 = org.apache.commons.lang.math.NumberUtils.max(longArray45);
        long[] longArray49 = new long[] { 0L };
        long long50 = org.apache.commons.lang.math.NumberUtils.max(longArray49);
        long[] longArray52 = new long[] { (byte) 1 };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray49, longArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(longArray45, longArray52);
        long[] longArray57 = new long[] { (short) -1, (short) 1 };
        long[] longArray59 = new long[] { 0L };
        long long60 = org.apache.commons.lang.math.NumberUtils.max(longArray59);
        long[] longArray62 = new long[] { (byte) 1 };
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(longArray59, longArray62);
        long long64 = org.apache.commons.lang.math.NumberUtils.max(longArray62);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(longArray57, longArray62);
        long[] longArray67 = new long[] { 0L };
        long long68 = org.apache.commons.lang.math.NumberUtils.max(longArray67);
        long long69 = org.apache.commons.lang.math.NumberUtils.max(longArray67);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(longArray57, longArray67);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(longArray45, longArray67);
        long[] longArray73 = new long[] { 0L };
        long long74 = org.apache.commons.lang.math.NumberUtils.max(longArray73);
        long[] longArray76 = new long[] { (byte) 1 };
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(longArray73, longArray76);
        long long78 = org.apache.commons.lang.math.NumberUtils.min(longArray73);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(longArray45, longArray73);
        long[] longArray82 = new long[] { (short) -1, (short) 1 };
        long[] longArray84 = new long[] { 0L };
        long long85 = org.apache.commons.lang.math.NumberUtils.max(longArray84);
        long[] longArray87 = new long[] { (byte) 1 };
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(longArray84, longArray87);
        long long89 = org.apache.commons.lang.math.NumberUtils.max(longArray87);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(longArray82, longArray87);
        long long91 = org.apache.commons.lang.math.NumberUtils.max(longArray82);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(longArray73, longArray82);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray73);
        long long94 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray18);
        long long96 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
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
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 52L, (-1L), 52L, 100L });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
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
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertArrayEquals(longArray36, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertArrayEquals(longArray42, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertArrayEquals(longArray45, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertArrayEquals(longArray49, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertArrayEquals(longArray52, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertArrayEquals(longArray57, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray59);
        org.junit.Assert.assertArrayEquals(longArray59, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(longArray62);
        org.junit.Assert.assertArrayEquals(longArray62, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(longArray67);
        org.junit.Assert.assertArrayEquals(longArray67, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertArrayEquals(longArray73, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNotNull(longArray76);
        org.junit.Assert.assertArrayEquals(longArray76, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertArrayEquals(longArray82, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray84);
        org.junit.Assert.assertArrayEquals(longArray84, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertArrayEquals(longArray87, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 1L + "'", long89 == 1L);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + long91 + "' != '" + 1L + "'", long91 == 1L);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + long94 + "' != '" + 100L + "'", long94 == 100L);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + long96 + "' != '" + 100L + "'", long96 == 100L);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 52, (long) (byte) 10, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
        short short33 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
        short short34 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
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
        short[] shortArray54 = new short[] { (short) 100 };
        short[] shortArray55 = new short[] {};
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(shortArray54, shortArray55);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(shortArray51, shortArray54);
        short[] shortArray59 = new short[] { (short) 100 };
        short[] shortArray60 = new short[] {};
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(shortArray59, shortArray60);
        short[] shortArray63 = new short[] { (short) 100 };
        short[] shortArray64 = new short[] {};
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(shortArray63, shortArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(shortArray60, shortArray63);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(shortArray54, shortArray63);
        short short68 = org.apache.commons.lang.math.NumberUtils.min(shortArray63);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(shortArray40, shortArray63);
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
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(shortArray40, shortArray75);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(shortArray19, shortArray40);
        short short91 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
        short short92 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(shortArray10, shortArray19);
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
        org.junit.Assert.assertNotNull(shortArray54);
        org.junit.Assert.assertArrayEquals(shortArray54, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray55);
        org.junit.Assert.assertArrayEquals(shortArray55, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + short68 + "' != '" + (short) 100 + "'", short68 == (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + short91 + "' != '" + (short) 100 + "'", short91 == (short) 100);
        org.junit.Assert.assertTrue("'" + short92 + "' != '" + (short) 100 + "'", short92 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 100, (float) (-1L), (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) (byte) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
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
        java.lang.Class<?> wildcardClass24 = longArray20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) (byte) 10, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 100, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        java.lang.Class<?> wildcardClass8 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((-1.0f), 35.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, (int) '#', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 97.0f, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 35, (long) (byte) 100, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 10, 97, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) 'a', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 32.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(100.0d, (double) 52L, (double) 32L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 10, (double) (short) 100, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '4', (long) (short) -1, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
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
        java.lang.Class<?> wildcardClass32 = floatArray28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(97L, (long) ' ', 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(32.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (-1L), (float) 97L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '4', 0, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
        int int15 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
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
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray49);
        short short55 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
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
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 100 + "'", short55 == (short) 100);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(100.0d, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) -1, (long) 10, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, (int) (short) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        int int46 = org.apache.commons.lang.math.NumberUtils.max(intArray39);
        int int47 = org.apache.commons.lang.math.NumberUtils.max(intArray39);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(intArray24, intArray39);
        int[] intArray50 = new int[] { (short) -1 };
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray50);
        int[] intArray53 = new int[] { (short) -1 };
        int int54 = org.apache.commons.lang.math.NumberUtils.min(intArray53);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray53);
        int int56 = org.apache.commons.lang.math.NumberUtils.max(intArray50);
        int[] intArray58 = new int[] { (short) -1 };
        int int59 = org.apache.commons.lang.math.NumberUtils.min(intArray58);
        int[] intArray61 = new int[] { (short) -1 };
        int int62 = org.apache.commons.lang.math.NumberUtils.min(intArray61);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(intArray58, intArray61);
        int int64 = org.apache.commons.lang.math.NumberUtils.min(intArray58);
        int[] intArray66 = new int[] { (short) -1 };
        int int67 = org.apache.commons.lang.math.NumberUtils.min(intArray66);
        int[] intArray69 = new int[] { (short) -1 };
        int int70 = org.apache.commons.lang.math.NumberUtils.min(intArray69);
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(intArray66, intArray69);
        int[] intArray73 = new int[] { (short) -1 };
        int int74 = org.apache.commons.lang.math.NumberUtils.min(intArray73);
        int[] intArray76 = new int[] { (short) -1 };
        int int77 = org.apache.commons.lang.math.NumberUtils.min(intArray76);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(intArray73, intArray76);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(intArray69, intArray73);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(intArray58, intArray73);
        int[] intArray82 = new int[] { (short) -1 };
        int int83 = org.apache.commons.lang.math.NumberUtils.min(intArray82);
        int[] intArray85 = new int[] { (short) -1 };
        int int86 = org.apache.commons.lang.math.NumberUtils.min(intArray85);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(intArray82, intArray85);
        int int88 = org.apache.commons.lang.math.NumberUtils.min(intArray82);
        int int89 = org.apache.commons.lang.math.NumberUtils.min(intArray82);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(intArray58, intArray82);
        int int91 = org.apache.commons.lang.math.NumberUtils.min(intArray58);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(intArray50, intArray58);
        int int93 = org.apache.commons.lang.math.NumberUtils.min(intArray50);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(intArray39, intArray50);
        int int95 = org.apache.commons.lang.math.NumberUtils.min(intArray50);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(intArray16, intArray50);
        int int97 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        int int98 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
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
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertArrayEquals(intArray50, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertArrayEquals(intArray53, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertArrayEquals(intArray58, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertArrayEquals(intArray66, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertArrayEquals(intArray69, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertArrayEquals(intArray76, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(intArray82);
        org.junit.Assert.assertArrayEquals(intArray82, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(intArray85);
        org.junit.Assert.assertArrayEquals(intArray85, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + (-1) + "'", int95 == (-1));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        short short35 = org.apache.commons.lang.math.NumberUtils.min(shortArray28);
        short short36 = org.apache.commons.lang.math.NumberUtils.min(shortArray28);
        short short37 = org.apache.commons.lang.math.NumberUtils.min(shortArray28);
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
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 100 + "'", short35 == (short) 100);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 100 + "'", short36 == (short) 100);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 100 + "'", short37 == (short) 100);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (long) '4', (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 0, 52.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1, (float) 52, (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 10.0f, (double) 35, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 10, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0d), (double) 52L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 10, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray7 = new long[] { 52, (-1), '4', 100L };
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray7);
        long[] longArray11 = new long[] { 0L };
        long long12 = org.apache.commons.lang.math.NumberUtils.max(longArray11);
        long[] longArray14 = new long[] { (byte) 1 };
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray14);
        long long16 = org.apache.commons.lang.math.NumberUtils.min(longArray14);
        long[] longArray18 = new long[] { 0L };
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long[] longArray21 = new long[] { (byte) 1 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray21);
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray21);
        long[] longArray25 = new long[] { 0L };
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        long[] longArray28 = new long[] { (byte) 1 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray21, longArray28);
        long long31 = org.apache.commons.lang.math.NumberUtils.min(longArray21);
        long long32 = org.apache.commons.lang.math.NumberUtils.max(longArray21);
        long[] longArray34 = new long[] { 0L };
        long long35 = org.apache.commons.lang.math.NumberUtils.max(longArray34);
        long[] longArray37 = new long[] { (byte) 1 };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray37);
        long long39 = org.apache.commons.lang.math.NumberUtils.min(longArray37);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(longArray21, longArray37);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray37);
        long long42 = org.apache.commons.lang.math.NumberUtils.min(longArray37);
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
        long long57 = org.apache.commons.lang.math.NumberUtils.min(longArray47);
        long long58 = org.apache.commons.lang.math.NumberUtils.max(longArray47);
        long long59 = org.apache.commons.lang.math.NumberUtils.max(longArray47);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(longArray37, longArray47);
        long long61 = org.apache.commons.lang.math.NumberUtils.min(longArray47);
        long long62 = org.apache.commons.lang.math.NumberUtils.min(longArray47);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(longArray7, longArray47);
        long long64 = org.apache.commons.lang.math.NumberUtils.min(longArray47);
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertArrayEquals(longArray28, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertArrayEquals(longArray34, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertArrayEquals(longArray37, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
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
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1L + "'", long61 == 1L);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 1L + "'", long64 == 1L);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, 97, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 52, (long) (short) 100, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 'a', (double) (short) 0, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        float[] floatArray4 = new float[] { (byte) 0, (-1.0f), (short) 1, (-1.0f) };
        float float5 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray10 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float[] floatArray18 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float19 = org.apache.commons.lang.math.NumberUtils.min(floatArray18);
        float[] floatArray26 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float27 = org.apache.commons.lang.math.NumberUtils.min(floatArray26);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(floatArray18, floatArray26);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray18);
        float float30 = org.apache.commons.lang.math.NumberUtils.max(floatArray18);
        float float31 = org.apache.commons.lang.math.NumberUtils.max(floatArray18);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 0.0f, (-1.0f), 1.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray18);
        org.junit.Assert.assertArrayEquals(floatArray18, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertArrayEquals(floatArray26, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + (-1.0f) + "'", float27 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 100.0f + "'", float30 == 100.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(97L, (long) 'a', 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(byteArray30, byteArray37);
        byte byte39 = org.apache.commons.lang.math.NumberUtils.min(byteArray37);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray25, byteArray37);
        byte byte41 = org.apache.commons.lang.math.NumberUtils.max(byteArray25);
        byte byte42 = org.apache.commons.lang.math.NumberUtils.min(byteArray25);
        byte byte43 = org.apache.commons.lang.math.NumberUtils.max(byteArray25);
        byte byte44 = org.apache.commons.lang.math.NumberUtils.min(byteArray25);
        byte byte45 = org.apache.commons.lang.math.NumberUtils.max(byteArray25);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray25);
        byte[] byteArray49 = new byte[] { (byte) 0, (byte) 0 };
        byte byte50 = org.apache.commons.lang.math.NumberUtils.min(byteArray49);
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray60 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(byteArray53, byteArray60);
        byte byte62 = org.apache.commons.lang.math.NumberUtils.min(byteArray60);
        byte[] byteArray65 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray72 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(byteArray65, byteArray72);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(byteArray60, byteArray72);
        byte byte75 = org.apache.commons.lang.math.NumberUtils.max(byteArray72);
        byte[] byteArray77 = new byte[] { (byte) 100 };
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(byteArray72, byteArray77);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(byteArray49, byteArray77);
        byte[] byteArray84 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte85 = org.apache.commons.lang.math.NumberUtils.min(byteArray84);
        byte byte86 = org.apache.commons.lang.math.NumberUtils.min(byteArray84);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(byteArray49, byteArray84);
        byte[] byteArray90 = new byte[] { (byte) 0, (byte) 0 };
        byte byte91 = org.apache.commons.lang.math.NumberUtils.min(byteArray90);
        byte byte92 = org.apache.commons.lang.math.NumberUtils.min(byteArray90);
        byte byte93 = org.apache.commons.lang.math.NumberUtils.max(byteArray90);
        byte byte94 = org.apache.commons.lang.math.NumberUtils.min(byteArray90);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(byteArray84, byteArray90);
        byte byte96 = org.apache.commons.lang.math.NumberUtils.max(byteArray84);
        byte byte97 = org.apache.commons.lang.math.NumberUtils.max(byteArray84);
        boolean boolean98 = org.apache.commons.lang.math.NumberUtils.equals(byteArray25, byteArray84);
        byte byte99 = org.apache.commons.lang.math.NumberUtils.max(byteArray25);
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
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) -1 + "'", byte39 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 100 + "'", byte41 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) -1 + "'", byte42 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 100 + "'", byte43 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) -1 + "'", byte44 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 100 + "'", byte45 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) 0 + "'", byte50 == (byte) 0);
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
        org.junit.Assert.assertTrue("'" + byte75 + "' != '" + (byte) 100 + "'", byte75 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte85 + "' != '" + (byte) 1 + "'", byte85 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte86 + "' != '" + (byte) 1 + "'", byte86 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte91 + "' != '" + (byte) 0 + "'", byte91 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte92 + "' != '" + (byte) 0 + "'", byte92 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte93 + "' != '" + (byte) 0 + "'", byte93 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte94 + "' != '" + (byte) 0 + "'", byte94 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + byte96 + "' != '" + (byte) 100 + "'", byte96 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte97 + "' != '" + (byte) 100 + "'", byte97 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + byte99 + "' != '" + (byte) 100 + "'", byte99 == (byte) 100);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 100, (double) 100.0f, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1L), (double) 0L, (double) 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(1, 97, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (long) (byte) 10, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(32.0d, 0.0d, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 10, (-1L), (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(10L, (long) (short) 1, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 35L, (float) (short) 1, (float) 35L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((-1.0f), (float) (byte) 1, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 32, 32L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        short[] shortArray0 = null;
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
        short short20 = org.apache.commons.lang.math.NumberUtils.min(shortArray15);
        short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray15);
        short[] shortArray27 = new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (byte) 10 };
        short short28 = org.apache.commons.lang.math.NumberUtils.min(shortArray27);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(shortArray15, shortArray27);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(shortArray0, shortArray27);
        short[] shortArray32 = new short[] { (short) 100 };
        short[] shortArray33 = new short[] {};
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray33);
        short short35 = org.apache.commons.lang.math.NumberUtils.min(shortArray32);
        short[] shortArray37 = new short[] { (short) 100 };
        short[] shortArray38 = new short[] {};
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(shortArray37, shortArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(shortArray32, shortArray38);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(shortArray27, shortArray32);
        java.lang.Class<?> wildcardClass42 = shortArray27.getClass();
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
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 100 + "'", short21 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray27);
        org.junit.Assert.assertArrayEquals(shortArray27, new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (short) 10 });
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 10 + "'", short28 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray32, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray33, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 100 + "'", short35 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray37);
        org.junit.Assert.assertArrayEquals(shortArray37, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray38, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 1, (float) '4', (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) -1, (float) (short) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, 0.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((-1.0d), 0.0d, (double) 35);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 10, (int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 0, (float) 97L, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 97L, (double) (short) 1, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(100, 10, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 0, (float) 35L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 35L, (float) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(100L, (long) 'a', (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) '#', (double) 52.0f, (double) 32L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 1, (float) 32L, (float) 32L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) -1, (double) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        byte[] byteArray37 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte38 = org.apache.commons.lang.math.NumberUtils.min(byteArray37);
        byte[] byteArray42 = new byte[] { (byte) 0, (byte) -1, (byte) 0 };
        byte byte43 = org.apache.commons.lang.math.NumberUtils.min(byteArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(byteArray37, byteArray42);
        byte byte45 = org.apache.commons.lang.math.NumberUtils.max(byteArray37);
        byte byte46 = org.apache.commons.lang.math.NumberUtils.min(byteArray37);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray37);
        byte byte48 = org.apache.commons.lang.math.NumberUtils.max(byteArray37);
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
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 1 + "'", byte38 == (byte) 1);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 0, (byte) -1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) -1 + "'", byte43 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + byte45 + "' != '" + (byte) 100 + "'", byte45 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte46 + "' != '" + (byte) 1 + "'", byte46 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) 100 + "'", byte48 == (byte) 100);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((-1), 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short short4 = org.apache.commons.lang.math.NumberUtils.min(shortArray1);
        short[] shortArray5 = null;
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray5);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 100 + "'", short4 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        int[] intArray0 = null;
        int[] intArray1 = null;
        int[] intArray3 = new int[] { (short) -1 };
        int int4 = org.apache.commons.lang.math.NumberUtils.min(intArray3);
        int[] intArray6 = new int[] { (short) -1 };
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(intArray3, intArray6);
        int int9 = org.apache.commons.lang.math.NumberUtils.min(intArray3);
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
        int int25 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray18);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(intArray3, intArray18);
        int int28 = org.apache.commons.lang.math.NumberUtils.max(intArray3);
        int int29 = org.apache.commons.lang.math.NumberUtils.max(intArray3);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray3);
        int int31 = org.apache.commons.lang.math.NumberUtils.min(intArray3);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100.0f, (double) 97, (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) 97L, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 35, 97.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        long[] longArray2 = new long[] { (short) -1, (short) 1 };
        long[] longArray4 = new long[] { 0L };
        long long5 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray7 = new long[] { (byte) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray7);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray7);
        long[] longArray12 = new long[] { 0L };
        long long13 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray12);
        long[] longArray17 = new long[] { 0L };
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long[] longArray20 = new long[] { (byte) 1 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long long23 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
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
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray28);
        long[] longArray40 = new long[] { 0L };
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray40);
        long[] longArray43 = new long[] { (byte) 1 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray40, longArray43);
        long long45 = org.apache.commons.lang.math.NumberUtils.max(longArray43);
        long[] longArray47 = new long[] { 0L };
        long long48 = org.apache.commons.lang.math.NumberUtils.max(longArray47);
        long[] longArray50 = new long[] { (byte) 1 };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray47, longArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray43, longArray50);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray50);
        long long54 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray50);
        long[] longArray57 = new long[] { 0L };
        long long58 = org.apache.commons.lang.math.NumberUtils.max(longArray57);
        long[] longArray60 = new long[] { (byte) 1 };
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(longArray57, longArray60);
        long long62 = org.apache.commons.lang.math.NumberUtils.min(longArray57);
        long long63 = org.apache.commons.lang.math.NumberUtils.max(longArray57);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray50, longArray57);
        long long65 = org.apache.commons.lang.math.NumberUtils.min(longArray50);
        long long66 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
        long long67 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
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
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertArrayEquals(longArray57, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertArrayEquals(longArray60, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0d), 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 1, (float) 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(52L, (long) (byte) 0, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 10, 0.0d, (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) 10, (double) 32.0f, (double) 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 100, (float) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(1, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 32, (long) 1, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 1, 10.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 0.0f, (double) 1.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32, 10.0f, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0, 35.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
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
        byte byte34 = org.apache.commons.lang.math.NumberUtils.min(byteArray30);
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
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 100 + "'", byte34 == (byte) 100);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 97L, 0.0d, (double) 52L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        int[] intArray26 = new int[] { (short) -1 };
        int int27 = org.apache.commons.lang.math.NumberUtils.min(intArray26);
        int[] intArray29 = new int[] { (short) -1 };
        int int30 = org.apache.commons.lang.math.NumberUtils.min(intArray29);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(intArray26, intArray29);
        int int32 = org.apache.commons.lang.math.NumberUtils.min(intArray26);
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
        int int48 = org.apache.commons.lang.math.NumberUtils.max(intArray41);
        int int49 = org.apache.commons.lang.math.NumberUtils.max(intArray41);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(intArray26, intArray41);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray41);
        int int52 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int int53 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int int54 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray55 = null;
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray55);
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
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100.0f, (double) '#', (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
            int int19 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
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
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        byte[] byteArray27 = new byte[] { (byte) 100 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(byteArray22, byteArray27);
        byte byte29 = org.apache.commons.lang.math.NumberUtils.max(byteArray27);
        byte[] byteArray36 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(byteArray27, byteArray36);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.min(byteArray27);
        byte byte39 = org.apache.commons.lang.math.NumberUtils.min(byteArray27);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray27);
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(byteArray43, byteArray50);
        byte byte52 = org.apache.commons.lang.math.NumberUtils.min(byteArray50);
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray62 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(byteArray55, byteArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(byteArray50, byteArray62);
        byte byte65 = org.apache.commons.lang.math.NumberUtils.max(byteArray62);
        byte[] byteArray67 = new byte[] { (byte) 100 };
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(byteArray62, byteArray67);
        byte byte69 = org.apache.commons.lang.math.NumberUtils.max(byteArray67);
        byte[] byteArray76 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(byteArray67, byteArray76);
        byte byte78 = org.apache.commons.lang.math.NumberUtils.min(byteArray67);
        byte byte79 = org.apache.commons.lang.math.NumberUtils.min(byteArray67);
        byte byte80 = org.apache.commons.lang.math.NumberUtils.min(byteArray67);
        byte byte81 = org.apache.commons.lang.math.NumberUtils.min(byteArray67);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray67);
        // The following exception was thrown during execution in test generation
        try {
            byte byte83 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 100 + "'", byte29 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 100 + "'", byte38 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 100 + "'", byte39 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + byte52 + "' != '" + (byte) -1 + "'", byte52 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) 100 + "'", byte65 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + byte69 + "' != '" + (byte) 100 + "'", byte69 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + byte78 + "' != '" + (byte) 100 + "'", byte78 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte79 + "' != '" + (byte) 100 + "'", byte79 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) 100 + "'", byte80 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte81 + "' != '" + (byte) 100 + "'", byte81 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '#', (float) (short) 0, (float) 97L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(97L, (long) 'a', 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(1L, (long) 10, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { (byte) 1 };
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        long[] longArray8 = new long[] { (short) -1, (short) 1 };
        long[] longArray10 = new long[] { 0L };
        long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray10);
        long[] longArray13 = new long[] { (byte) 1 };
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(longArray10, longArray13);
        long long15 = org.apache.commons.lang.math.NumberUtils.max(longArray13);
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray13);
        long long17 = org.apache.commons.lang.math.NumberUtils.min(longArray8);
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray8);
        long[] longArray20 = new long[] { 0L };
        long long21 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long[] longArray23 = new long[] { (byte) 1 };
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray23);
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray23);
        long[] longArray27 = new long[] { 0L };
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        long[] longArray30 = new long[] { (byte) 1 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray27, longArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray30);
        long long33 = org.apache.commons.lang.math.NumberUtils.max(longArray23);
        long[] longArray35 = new long[] { 0L };
        long long36 = org.apache.commons.lang.math.NumberUtils.max(longArray35);
        long[] longArray38 = new long[] { (byte) 1 };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray35, longArray38);
        long long40 = org.apache.commons.lang.math.NumberUtils.max(longArray38);
        long[] longArray42 = new long[] { 0L };
        long long43 = org.apache.commons.lang.math.NumberUtils.max(longArray42);
        long[] longArray45 = new long[] { (byte) 1 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray45);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(longArray23, longArray45);
        long long49 = org.apache.commons.lang.math.NumberUtils.max(longArray45);
        long[] longArray51 = new long[] { 0L };
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray51);
        long[] longArray54 = new long[] { (byte) 1 };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(longArray51, longArray54);
        long long56 = org.apache.commons.lang.math.NumberUtils.max(longArray54);
        long[] longArray58 = new long[] { 0L };
        long long59 = org.apache.commons.lang.math.NumberUtils.max(longArray58);
        long[] longArray61 = new long[] { (byte) 1 };
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(longArray58, longArray61);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(longArray54, longArray61);
        long[] longArray65 = new long[] { 0L };
        long long66 = org.apache.commons.lang.math.NumberUtils.max(longArray65);
        long[] longArray68 = new long[] { (byte) 1 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(longArray65, longArray68);
        long long70 = org.apache.commons.lang.math.NumberUtils.max(longArray68);
        long[] longArray72 = new long[] { 0L };
        long long73 = org.apache.commons.lang.math.NumberUtils.max(longArray72);
        long[] longArray75 = new long[] { (byte) 1 };
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(longArray72, longArray75);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(longArray68, longArray75);
        long long78 = org.apache.commons.lang.math.NumberUtils.max(longArray68);
        long[] longArray80 = new long[] { 0L };
        long long81 = org.apache.commons.lang.math.NumberUtils.max(longArray80);
        long[] longArray83 = new long[] { (byte) 1 };
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(longArray80, longArray83);
        long long85 = org.apache.commons.lang.math.NumberUtils.max(longArray83);
        long[] longArray87 = new long[] { 0L };
        long long88 = org.apache.commons.lang.math.NumberUtils.max(longArray87);
        long[] longArray90 = new long[] { (byte) 1 };
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(longArray87, longArray90);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(longArray83, longArray90);
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(longArray68, longArray90);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(longArray54, longArray68);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(longArray45, longArray54);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray54);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray10);
        org.junit.Assert.assertArrayEquals(longArray10, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(longArray23);
        org.junit.Assert.assertArrayEquals(longArray23, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertArrayEquals(longArray30, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertArrayEquals(longArray35, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertArrayEquals(longArray38, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertArrayEquals(longArray42, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertArrayEquals(longArray45, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertArrayEquals(longArray51, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertArrayEquals(longArray54, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertArrayEquals(longArray58, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertArrayEquals(longArray61, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(longArray65);
        org.junit.Assert.assertArrayEquals(longArray65, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertArrayEquals(longArray68, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertArrayEquals(longArray72, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertArrayEquals(longArray75, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1L + "'", long78 == 1L);
        org.junit.Assert.assertNotNull(longArray80);
        org.junit.Assert.assertArrayEquals(longArray80, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 0L + "'", long81 == 0L);
        org.junit.Assert.assertNotNull(longArray83);
        org.junit.Assert.assertArrayEquals(longArray83, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 1L + "'", long85 == 1L);
        org.junit.Assert.assertNotNull(longArray87);
        org.junit.Assert.assertArrayEquals(longArray87, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 0L + "'", long88 == 0L);
        org.junit.Assert.assertNotNull(longArray90);
        org.junit.Assert.assertArrayEquals(longArray90, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 10, (float) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 100L, 0.0f, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(10.0f, (float) '4', (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
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
        short[] shortArray33 = new short[] { (short) 100 };
        short[] shortArray34 = new short[] {};
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(shortArray33, shortArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray30, shortArray33);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray33);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray24);
        short short39 = org.apache.commons.lang.math.NumberUtils.max(shortArray24);
        short short40 = org.apache.commons.lang.math.NumberUtils.max(shortArray24);
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
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray46, shortArray51);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray51);
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
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray33, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray34, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 100 + "'", short39 == (short) 100);
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) 100 + "'", short40 == (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 100, (float) (short) -1, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) -1, (int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 35L, (double) 35.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 10, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 10, 0, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '4', (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 100, (long) (-1), (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 52, (float) 97, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) -1, (long) 10, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 97, (float) 'a', (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, 52.0d, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(35.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(32, 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 0L, (double) 'a', 32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 32, (long) (byte) 1, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 97, (long) '4', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        long[] longArray0 = null;
        long[] longArray2 = new long[] { 0L };
        long long3 = org.apache.commons.lang.math.NumberUtils.max(longArray2);
        long[] longArray8 = new long[] { 52, (-1), '4', 100L };
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray8);
        long[] longArray12 = new long[] { 0L };
        long long13 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        long[] longArray15 = new long[] { (byte) 1 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray15);
        long[] longArray19 = new long[] { 0L };
        long long20 = org.apache.commons.lang.math.NumberUtils.max(longArray19);
        long[] longArray22 = new long[] { (byte) 1 };
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(longArray19, longArray22);
        long long24 = org.apache.commons.lang.math.NumberUtils.min(longArray22);
        long[] longArray26 = new long[] { 0L };
        long long27 = org.apache.commons.lang.math.NumberUtils.max(longArray26);
        long[] longArray29 = new long[] { (byte) 1 };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray26, longArray29);
        long long31 = org.apache.commons.lang.math.NumberUtils.max(longArray29);
        long[] longArray33 = new long[] { 0L };
        long long34 = org.apache.commons.lang.math.NumberUtils.max(longArray33);
        long[] longArray36 = new long[] { (byte) 1 };
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray33, longArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray29, longArray36);
        long long39 = org.apache.commons.lang.math.NumberUtils.min(longArray29);
        long long40 = org.apache.commons.lang.math.NumberUtils.max(longArray29);
        long[] longArray42 = new long[] { 0L };
        long long43 = org.apache.commons.lang.math.NumberUtils.max(longArray42);
        long[] longArray45 = new long[] { (byte) 1 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray45);
        long long47 = org.apache.commons.lang.math.NumberUtils.min(longArray45);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(longArray29, longArray45);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray45);
        long long50 = org.apache.commons.lang.math.NumberUtils.min(longArray22);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray8, longArray22);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray0, longArray22);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertArrayEquals(longArray2, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 52L, (-1L), 52L, 100L });
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(longArray15);
        org.junit.Assert.assertArrayEquals(longArray15, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(longArray19);
        org.junit.Assert.assertArrayEquals(longArray19, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(longArray26);
        org.junit.Assert.assertArrayEquals(longArray26, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(longArray29);
        org.junit.Assert.assertArrayEquals(longArray29, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertNotNull(longArray33);
        org.junit.Assert.assertArrayEquals(longArray33, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(longArray36);
        org.junit.Assert.assertArrayEquals(longArray36, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertArrayEquals(longArray42, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertArrayEquals(longArray45, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 1, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        java.lang.Class<?> wildcardClass62 = shortArray46.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
        byte[] byteArray37 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte38 = org.apache.commons.lang.math.NumberUtils.min(byteArray37);
        byte byte39 = org.apache.commons.lang.math.NumberUtils.min(byteArray37);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray37);
        byte byte41 = org.apache.commons.lang.math.NumberUtils.max(byteArray37);
        byte byte42 = org.apache.commons.lang.math.NumberUtils.min(byteArray37);
        byte byte43 = org.apache.commons.lang.math.NumberUtils.max(byteArray37);
        byte byte44 = org.apache.commons.lang.math.NumberUtils.min(byteArray37);
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
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) 1 + "'", byte38 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 1 + "'", byte39 == (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 100 + "'", byte41 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 1 + "'", byte42 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte43 + "' != '" + (byte) 100 + "'", byte43 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte44 + "' != '" + (byte) 1 + "'", byte44 == (byte) 1);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((-1), (int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray7 = new float[] { (byte) 10 };
        float float8 = org.apache.commons.lang.math.NumberUtils.min(floatArray7);
        float float9 = org.apache.commons.lang.math.NumberUtils.max(floatArray7);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray7);
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray16 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float17 = org.apache.commons.lang.math.NumberUtils.min(floatArray16);
        float float18 = org.apache.commons.lang.math.NumberUtils.max(floatArray16);
        float[] floatArray23 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float24 = org.apache.commons.lang.math.NumberUtils.min(floatArray23);
        float float25 = org.apache.commons.lang.math.NumberUtils.max(floatArray23);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(floatArray16, floatArray23);
        float float27 = org.apache.commons.lang.math.NumberUtils.max(floatArray23);
        float float28 = org.apache.commons.lang.math.NumberUtils.min(floatArray23);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray23);
        float float30 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float31 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float32 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        java.lang.Class<?> wildcardClass33 = floatArray4.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertArrayEquals(floatArray23, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + (-1.0f) + "'", float24 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 100.0f + "'", float30 == 100.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 100.0f + "'", float31 == 100.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 100.0f + "'", float32 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 52, (double) 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, 52, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
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
        double double53 = org.apache.commons.lang.math.NumberUtils.max(doubleArray4);
        double double54 = org.apache.commons.lang.math.NumberUtils.max(doubleArray4);
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
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 52.0d + "'", double53 == 52.0d);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 52.0d + "'", double54 == 52.0d);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 97L, (float) 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 0.0f, 100.0d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(97.0d, (double) '#', (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        double[] doubleArray38 = null;
        double[] doubleArray43 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray47 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray43, doubleArray47);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray38, doubleArray43);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray17, doubleArray43);
        double double51 = org.apache.commons.lang.math.NumberUtils.min(doubleArray43);
        double[] doubleArray52 = null;
        double[] doubleArray57 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray61 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray57, doubleArray61);
        boolean boolean63 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray52, doubleArray57);
        double[] doubleArray68 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray72 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray68, doubleArray72);
        double double74 = org.apache.commons.lang.math.NumberUtils.min(doubleArray68);
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray57, doubleArray68);
        double double76 = org.apache.commons.lang.math.NumberUtils.min(doubleArray68);
        double double77 = org.apache.commons.lang.math.NumberUtils.max(doubleArray68);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray43, doubleArray68);
        double double79 = org.apache.commons.lang.math.NumberUtils.min(doubleArray43);
        double double80 = org.apache.commons.lang.math.NumberUtils.max(doubleArray43);
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
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.0d) + "'", double76 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 52.0d + "'", double77 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + (-1.0d) + "'", double79 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 52.0d + "'", double80 == 52.0d);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray14 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray18 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray14);
        double[] doubleArray21 = null;
        double[] doubleArray26 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray30 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray21, doubleArray26);
        double[] doubleArray37 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray41 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray41);
        double double43 = org.apache.commons.lang.math.NumberUtils.min(doubleArray37);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray37);
        double[] doubleArray45 = null;
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray45);
        double[] doubleArray51 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray55 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray51, doubleArray55);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray55);
        double double58 = org.apache.commons.lang.math.NumberUtils.min(doubleArray26);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray26);
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
        double double84 = org.apache.commons.lang.math.NumberUtils.min(doubleArray76);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray76);
        double double86 = org.apache.commons.lang.math.NumberUtils.min(doubleArray76);
        double double87 = org.apache.commons.lang.math.NumberUtils.max(doubleArray76);
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
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + (-1.0d) + "'", double58 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
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
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-1.0d) + "'", double84 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + (-1.0d) + "'", double86 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 52.0d + "'", double87 == 52.0d);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) '#', (long) 100, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 97, 0.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 1, (int) (byte) -1, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
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
        byte byte37 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte byte38 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte byte39 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte byte40 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte byte41 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte byte42 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
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
        org.junit.Assert.assertTrue("'" + byte37 + "' != '" + (byte) 100 + "'", byte37 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte38 + "' != '" + (byte) -1 + "'", byte38 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 100 + "'", byte39 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) -1 + "'", byte40 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte41 + "' != '" + (byte) 100 + "'", byte41 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) 100 + "'", byte42 == (byte) 100);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) ' ', 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) -1, (int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
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
        short short21 = org.apache.commons.lang.math.NumberUtils.max(shortArray5);
        short short22 = org.apache.commons.lang.math.NumberUtils.max(shortArray5);
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
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray28, shortArray33);
        short[] shortArray38 = new short[] { (short) 100 };
        short[] shortArray39 = new short[] {};
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(shortArray38, shortArray39);
        short[] shortArray42 = new short[] { (short) 100 };
        short[] shortArray43 = new short[] {};
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(shortArray42, shortArray43);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(shortArray39, shortArray42);
        short[] shortArray47 = new short[] { (short) 100 };
        short[] shortArray48 = new short[] {};
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(shortArray47, shortArray48);
        short[] shortArray51 = new short[] { (short) 100 };
        short[] shortArray52 = new short[] {};
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(shortArray51, shortArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(shortArray48, shortArray51);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(shortArray42, shortArray51);
        short short56 = org.apache.commons.lang.math.NumberUtils.min(shortArray51);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(shortArray28, shortArray51);
        short short58 = org.apache.commons.lang.math.NumberUtils.min(shortArray51);
        short short59 = org.apache.commons.lang.math.NumberUtils.max(shortArray51);
        short short60 = org.apache.commons.lang.math.NumberUtils.min(shortArray51);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray51);
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(shortArray38);
        org.junit.Assert.assertArrayEquals(shortArray38, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray39);
        org.junit.Assert.assertArrayEquals(shortArray39, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(shortArray42);
        org.junit.Assert.assertArrayEquals(shortArray42, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray43);
        org.junit.Assert.assertArrayEquals(shortArray43, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(shortArray47);
        org.junit.Assert.assertArrayEquals(shortArray47, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertArrayEquals(shortArray48, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(shortArray51);
        org.junit.Assert.assertArrayEquals(shortArray51, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray52);
        org.junit.Assert.assertArrayEquals(shortArray52, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 100 + "'", short56 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + short58 + "' != '" + (short) 100 + "'", short58 == (short) 100);
        org.junit.Assert.assertTrue("'" + short59 + "' != '" + (short) 100 + "'", short59 == (short) 100);
        org.junit.Assert.assertTrue("'" + short60 + "' != '" + (short) 100 + "'", short60 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 10, 1L, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 1L, (float) 32L, (float) 32L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int int27 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray29 = new int[] { (short) -1 };
        int int30 = org.apache.commons.lang.math.NumberUtils.min(intArray29);
        int[] intArray32 = new int[] { (short) -1 };
        int int33 = org.apache.commons.lang.math.NumberUtils.min(intArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(intArray29, intArray32);
        int[] intArray36 = new int[] { (short) -1 };
        int int37 = org.apache.commons.lang.math.NumberUtils.min(intArray36);
        int[] intArray39 = new int[] { (short) -1 };
        int int40 = org.apache.commons.lang.math.NumberUtils.min(intArray39);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(intArray36, intArray39);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(intArray32, intArray36);
        int[] intArray44 = new int[] { (short) -1 };
        int int45 = org.apache.commons.lang.math.NumberUtils.min(intArray44);
        int[] intArray47 = new int[] { (short) -1 };
        int int48 = org.apache.commons.lang.math.NumberUtils.min(intArray47);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(intArray44, intArray47);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(intArray36, intArray44);
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray44);
        int[] intArray52 = null;
        int[] intArray54 = new int[] { (short) -1 };
        int int55 = org.apache.commons.lang.math.NumberUtils.min(intArray54);
        int[] intArray57 = new int[] { (short) -1 };
        int int58 = org.apache.commons.lang.math.NumberUtils.min(intArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(intArray54, intArray57);
        int[] intArray61 = new int[] { (short) -1 };
        int int62 = org.apache.commons.lang.math.NumberUtils.min(intArray61);
        int[] intArray64 = new int[] { (short) -1 };
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(intArray61, intArray64);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(intArray57, intArray61);
        int int68 = org.apache.commons.lang.math.NumberUtils.max(intArray61);
        int int69 = org.apache.commons.lang.math.NumberUtils.max(intArray61);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(intArray52, intArray61);
        int int71 = org.apache.commons.lang.math.NumberUtils.max(intArray61);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(intArray44, intArray61);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray44);
        int int74 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int int75 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (-1), (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double double10 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double11 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
        double[] doubleArray16 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray20 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray20);
        double[] doubleArray26 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray30 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray26, doubleArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray26);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray16);
        double double34 = org.apache.commons.lang.math.NumberUtils.min(doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int[] intArray7 = null;
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = org.apache.commons.lang.math.NumberUtils.min(intArray7);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 35, (float) (short) 1, (float) 32);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 1, (float) (-1), 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
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
        int int72 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
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
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(35.0d, (double) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32, (double) 97, (double) 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(35.0d, 97.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (-1), (long) '4', (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 0, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100.0f, (double) (short) 1, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) 10, (double) (byte) 1, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 52L, 1.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        long[] longArray2 = new long[] { (short) -1, (short) 1 };
        long[] longArray4 = new long[] { 0L };
        long long5 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray7 = new long[] { (byte) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray7);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray7);
        long long11 = org.apache.commons.lang.math.NumberUtils.min(longArray2);
        long[] longArray13 = new long[] { 0L };
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray13);
        long long15 = org.apache.commons.lang.math.NumberUtils.min(longArray13);
        long long16 = org.apache.commons.lang.math.NumberUtils.max(longArray13);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray13);
        long long18 = org.apache.commons.lang.math.NumberUtils.min(longArray13);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(longArray13);
        org.junit.Assert.assertArrayEquals(longArray13, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
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
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(longArray11, longArray15);
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray11);
        long long19 = org.apache.commons.lang.math.NumberUtils.min(longArray11);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
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
        byte byte30 = org.apache.commons.lang.math.NumberUtils.max(byteArray26);
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray40 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray40);
        byte byte42 = org.apache.commons.lang.math.NumberUtils.min(byteArray40);
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray52 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(byteArray45, byteArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(byteArray40, byteArray52);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray40);
        java.lang.Class<?> wildcardClass56 = byteArray40.getClass();
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
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + byte42 + "' != '" + (byte) -1 + "'", byte42 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(52.0d, (double) (short) -1, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        long[] longArray2 = new long[] { (short) -1, (short) 1 };
        long[] longArray4 = new long[] { 0L };
        long long5 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray7 = new long[] { (byte) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray7);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray7);
        long[] longArray12 = new long[] { 0L };
        long long13 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray12);
        long[] longArray17 = new long[] { 0L };
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long[] longArray20 = new long[] { (byte) 1 };
        boolean boolean21 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray20);
        long long22 = org.apache.commons.lang.math.NumberUtils.max(longArray20);
        long long23 = org.apache.commons.lang.math.NumberUtils.min(longArray20);
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
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray20, longArray28);
        long[] longArray40 = new long[] { 0L };
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray40);
        long[] longArray43 = new long[] { (byte) 1 };
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray40, longArray43);
        long long45 = org.apache.commons.lang.math.NumberUtils.max(longArray43);
        long[] longArray47 = new long[] { 0L };
        long long48 = org.apache.commons.lang.math.NumberUtils.max(longArray47);
        long[] longArray50 = new long[] { (byte) 1 };
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray47, longArray50);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray43, longArray50);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray50);
        long long54 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray50);
        long long56 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
        long long57 = org.apache.commons.lang.math.NumberUtils.min(longArray50);
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
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(longArray20);
        org.junit.Assert.assertArrayEquals(longArray20, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1L + "'", long54 == 1L);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
        short short27 = org.apache.commons.lang.math.NumberUtils.max(shortArray1);
        short short28 = org.apache.commons.lang.math.NumberUtils.max(shortArray1);
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
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 100 + "'", short27 == (short) 100);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 100 + "'", short28 == (short) 100);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 10L, (float) 32L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) 32, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
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
        long long47 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        long long48 = org.apache.commons.lang.math.NumberUtils.min(longArray27);
        long long49 = org.apache.commons.lang.math.NumberUtils.min(longArray27);
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
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1L + "'", long49 == 1L);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        long[] longArray2 = new long[] { (short) -1, (short) 1 };
        long[] longArray4 = new long[] { 0L };
        long long5 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray7 = new long[] { (byte) 1 };
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray7);
        long long9 = org.apache.commons.lang.math.NumberUtils.max(longArray7);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray7);
        long[] longArray12 = new long[] { 0L };
        long long13 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        long long14 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        boolean boolean15 = org.apache.commons.lang.math.NumberUtils.equals(longArray2, longArray12);
        long[] longArray17 = new long[] { 0L };
        long long18 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray17);
        long[] longArray22 = new long[] { (short) -1, (short) 1 };
        long[] longArray24 = new long[] { 0L };
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        long[] longArray27 = new long[] { (byte) 1 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray27);
        long long29 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray22, longArray27);
        long long31 = org.apache.commons.lang.math.NumberUtils.max(longArray22);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(longArray17, longArray22);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray22);
        long[] longArray35 = new long[] { 0L };
        long long36 = org.apache.commons.lang.math.NumberUtils.max(longArray35);
        long[] longArray38 = new long[] { (byte) 1 };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray35, longArray38);
        long long40 = org.apache.commons.lang.math.NumberUtils.min(longArray38);
        long[] longArray42 = new long[] { 0L };
        long long43 = org.apache.commons.lang.math.NumberUtils.max(longArray42);
        long[] longArray45 = new long[] { (byte) 1 };
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray45);
        long long47 = org.apache.commons.lang.math.NumberUtils.max(longArray45);
        long[] longArray49 = new long[] { 0L };
        long long50 = org.apache.commons.lang.math.NumberUtils.max(longArray49);
        long[] longArray52 = new long[] { (byte) 1 };
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(longArray49, longArray52);
        boolean boolean54 = org.apache.commons.lang.math.NumberUtils.equals(longArray45, longArray52);
        long long55 = org.apache.commons.lang.math.NumberUtils.min(longArray45);
        long long56 = org.apache.commons.lang.math.NumberUtils.max(longArray45);
        long[] longArray58 = new long[] { 0L };
        long long59 = org.apache.commons.lang.math.NumberUtils.max(longArray58);
        long[] longArray61 = new long[] { (byte) 1 };
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(longArray58, longArray61);
        long long63 = org.apache.commons.lang.math.NumberUtils.min(longArray61);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray45, longArray61);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray61);
        long long66 = org.apache.commons.lang.math.NumberUtils.min(longArray61);
        long[] longArray68 = new long[] { 0L };
        long long69 = org.apache.commons.lang.math.NumberUtils.max(longArray68);
        long[] longArray71 = new long[] { (byte) 1 };
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(longArray68, longArray71);
        long long73 = org.apache.commons.lang.math.NumberUtils.max(longArray71);
        long[] longArray75 = new long[] { 0L };
        long long76 = org.apache.commons.lang.math.NumberUtils.max(longArray75);
        long[] longArray78 = new long[] { (byte) 1 };
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(longArray75, longArray78);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(longArray71, longArray78);
        long long81 = org.apache.commons.lang.math.NumberUtils.min(longArray71);
        long long82 = org.apache.commons.lang.math.NumberUtils.max(longArray71);
        long long83 = org.apache.commons.lang.math.NumberUtils.max(longArray71);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(longArray61, longArray71);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray61);
        long long86 = org.apache.commons.lang.math.NumberUtils.min(longArray61);
        long long87 = org.apache.commons.lang.math.NumberUtils.min(longArray61);
        long long88 = org.apache.commons.lang.math.NumberUtils.min(longArray61);
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
        org.junit.Assert.assertNotNull(longArray12);
        org.junit.Assert.assertArrayEquals(longArray12, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(longArray17);
        org.junit.Assert.assertArrayEquals(longArray17, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(longArray22);
        org.junit.Assert.assertArrayEquals(longArray22, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertArrayEquals(longArray35, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertArrayEquals(longArray38, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertArrayEquals(longArray42, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(longArray45);
        org.junit.Assert.assertArrayEquals(longArray45, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1L + "'", long47 == 1L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertArrayEquals(longArray49, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(longArray52);
        org.junit.Assert.assertArrayEquals(longArray52, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 1L + "'", long55 == 1L);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertNotNull(longArray58);
        org.junit.Assert.assertArrayEquals(longArray58, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertArrayEquals(longArray61, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 1L + "'", long63 == 1L);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertNotNull(longArray68);
        org.junit.Assert.assertArrayEquals(longArray68, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 0L + "'", long69 == 0L);
        org.junit.Assert.assertNotNull(longArray71);
        org.junit.Assert.assertArrayEquals(longArray71, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 1L + "'", long73 == 1L);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertArrayEquals(longArray75, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertNotNull(longArray78);
        org.junit.Assert.assertArrayEquals(longArray78, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1L + "'", long81 == 1L);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1L + "'", long82 == 1L);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 1L + "'", long83 == 1L);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 1L + "'", long86 == 1L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 1L + "'", long87 == 1L);
        org.junit.Assert.assertTrue("'" + long88 + "' != '" + 1L + "'", long88 == 1L);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 100, (double) 0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 1, 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) 'a', (int) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 10, 52, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 52, (long) ' ', (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '#', (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 0, 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 1, (float) 0, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 97, (long) 10, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100.0f, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
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
        int int72 = org.apache.commons.lang.math.NumberUtils.min(intArray27);
        int int73 = org.apache.commons.lang.math.NumberUtils.max(intArray27);
        int[] intArray78 = new int[] { ' ', (short) 100, (short) 1, (short) 10 };
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(intArray27, intArray78);
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
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertArrayEquals(intArray78, new int[] { 32, 100, 1, 10 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 0, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
        short short14 = org.apache.commons.lang.math.NumberUtils.max(shortArray5);
        short[] shortArray20 = new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (byte) 10 };
        short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray20);
        short short23 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
        short short24 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
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
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (short) 10 });
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 10 + "'", short21 == (short) 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 10 + "'", short23 == (short) 10);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 10 + "'", short24 == (short) 10);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1L), (double) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) '4', (double) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, 100, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 1, 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 1, (float) 32, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 100, 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
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
        long[] longArray25 = new long[] { 0L };
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        long[] longArray28 = new long[] { (byte) 1 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray28);
        long long30 = org.apache.commons.lang.math.NumberUtils.max(longArray28);
        long long31 = org.apache.commons.lang.math.NumberUtils.min(longArray28);
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
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray36);
        long[] longArray49 = new long[] { (short) -1, (short) 1 };
        long[] longArray51 = new long[] { 0L };
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray51);
        long[] longArray54 = new long[] { (byte) 1 };
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(longArray51, longArray54);
        long long56 = org.apache.commons.lang.math.NumberUtils.max(longArray54);
        boolean boolean57 = org.apache.commons.lang.math.NumberUtils.equals(longArray49, longArray54);
        long long58 = org.apache.commons.lang.math.NumberUtils.max(longArray54);
        long[] longArray60 = new long[] { 0L };
        long long61 = org.apache.commons.lang.math.NumberUtils.max(longArray60);
        long[] longArray63 = new long[] { (byte) 1 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray60, longArray63);
        long long65 = org.apache.commons.lang.math.NumberUtils.min(longArray63);
        long long66 = org.apache.commons.lang.math.NumberUtils.min(longArray63);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(longArray54, longArray63);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray63);
        long long69 = org.apache.commons.lang.math.NumberUtils.max(longArray63);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray63);
        long long71 = org.apache.commons.lang.math.NumberUtils.min(longArray63);
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
        org.junit.Assert.assertNotNull(longArray25);
        org.junit.Assert.assertArrayEquals(longArray25, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertArrayEquals(longArray28, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertArrayEquals(longArray49, new long[] { (-1L), 1L });
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertArrayEquals(longArray51, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertArrayEquals(longArray54, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1L + "'", long56 == 1L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertArrayEquals(longArray60, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertArrayEquals(longArray63, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 1L + "'", long66 == 1L);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 1L + "'", long69 == 1L);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 1L + "'", long71 == 1L);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 0, (double) (-1L), (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) 'a', (int) (byte) 100, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) 'a', (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 100, (float) ' ', 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) -1, (-1.0d), (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 0, (long) (-1), 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 1, 1.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 97L, (float) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) -1, 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(32.0d, (double) 35L, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) (byte) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
        long long56 = org.apache.commons.lang.math.NumberUtils.max(longArray50);
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
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(52L, (long) 10, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) (byte) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 97L, (double) (-1), (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        int[] intArray7 = new int[] { (short) -1 };
        int int8 = org.apache.commons.lang.math.NumberUtils.min(intArray7);
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray7);
        int int10 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        int[] intArray12 = new int[] { (short) -1 };
        int int13 = org.apache.commons.lang.math.NumberUtils.min(intArray12);
        int[] intArray15 = new int[] { (short) -1 };
        int int16 = org.apache.commons.lang.math.NumberUtils.min(intArray15);
        boolean boolean17 = org.apache.commons.lang.math.NumberUtils.equals(intArray12, intArray15);
        int[] intArray19 = new int[] { (short) -1 };
        int int20 = org.apache.commons.lang.math.NumberUtils.min(intArray19);
        int[] intArray22 = new int[] { (short) -1 };
        int int23 = org.apache.commons.lang.math.NumberUtils.min(intArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(intArray19, intArray22);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray15, intArray19);
        int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray19);
        int int27 = org.apache.commons.lang.math.NumberUtils.max(intArray19);
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(intArray4, intArray19);
        int[] intArray30 = new int[] { (short) -1 };
        int int31 = org.apache.commons.lang.math.NumberUtils.min(intArray30);
        int[] intArray33 = new int[] { (short) -1 };
        int int34 = org.apache.commons.lang.math.NumberUtils.min(intArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(intArray30, intArray33);
        int int36 = org.apache.commons.lang.math.NumberUtils.max(intArray30);
        int[] intArray38 = new int[] { (short) -1 };
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray38);
        int[] intArray41 = new int[] { (short) -1 };
        int int42 = org.apache.commons.lang.math.NumberUtils.min(intArray41);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(intArray38, intArray41);
        int int44 = org.apache.commons.lang.math.NumberUtils.min(intArray38);
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
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(intArray38, intArray53);
        int[] intArray62 = new int[] { (short) -1 };
        int int63 = org.apache.commons.lang.math.NumberUtils.min(intArray62);
        int[] intArray65 = new int[] { (short) -1 };
        int int66 = org.apache.commons.lang.math.NumberUtils.min(intArray65);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(intArray62, intArray65);
        int int68 = org.apache.commons.lang.math.NumberUtils.min(intArray62);
        int int69 = org.apache.commons.lang.math.NumberUtils.min(intArray62);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(intArray38, intArray62);
        int int71 = org.apache.commons.lang.math.NumberUtils.min(intArray38);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(intArray30, intArray38);
        int int73 = org.apache.commons.lang.math.NumberUtils.min(intArray30);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(intArray19, intArray30);
        int int75 = org.apache.commons.lang.math.NumberUtils.min(intArray30);
        int int76 = org.apache.commons.lang.math.NumberUtils.max(intArray30);
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray30);
        int int78 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray80 = new int[] { (short) -1 };
        int int81 = org.apache.commons.lang.math.NumberUtils.min(intArray80);
        int[] intArray83 = new int[] { (short) -1 };
        int int84 = org.apache.commons.lang.math.NumberUtils.min(intArray83);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(intArray80, intArray83);
        int int86 = org.apache.commons.lang.math.NumberUtils.min(intArray80);
        int int87 = org.apache.commons.lang.math.NumberUtils.min(intArray80);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray80);
        int int89 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertArrayEquals(intArray41, new int[] { (-1) });
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
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertArrayEquals(intArray65, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
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
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        java.lang.Class<?> wildcardClass51 = longArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 'a', (long) 32, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        long long24 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        java.lang.Class<?> wildcardClass27 = longArray4.getClass();
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '4', 35L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
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
        long long16 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray18 = new long[] { 0L };
        long long19 = org.apache.commons.lang.math.NumberUtils.max(longArray18);
        long[] longArray24 = new long[] { 52, (-1), '4', 100L };
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        boolean boolean26 = org.apache.commons.lang.math.NumberUtils.equals(longArray18, longArray24);
        long[] longArray28 = new long[] { 0L };
        long long29 = org.apache.commons.lang.math.NumberUtils.max(longArray28);
        long[] longArray31 = new long[] { (byte) 1 };
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(longArray28, longArray31);
        long long33 = org.apache.commons.lang.math.NumberUtils.max(longArray31);
        long[] longArray35 = new long[] { 0L };
        long long36 = org.apache.commons.lang.math.NumberUtils.max(longArray35);
        long[] longArray38 = new long[] { (byte) 1 };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray35, longArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(longArray31, longArray38);
        long[] longArray42 = new long[] { 0L };
        long long43 = org.apache.commons.lang.math.NumberUtils.max(longArray42);
        boolean boolean44 = org.apache.commons.lang.math.NumberUtils.equals(longArray38, longArray42);
        boolean boolean45 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray38);
        long long46 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        long[] longArray48 = new long[] { 0L };
        long long49 = org.apache.commons.lang.math.NumberUtils.max(longArray48);
        long[] longArray51 = new long[] { (byte) 1 };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(longArray48, longArray51);
        long long53 = org.apache.commons.lang.math.NumberUtils.max(longArray51);
        long long54 = org.apache.commons.lang.math.NumberUtils.max(longArray51);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray51);
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
        long[] longArray89 = new long[] { 97 };
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(longArray60, longArray89);
        boolean boolean91 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray89);
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray24);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(longArray18);
        org.junit.Assert.assertArrayEquals(longArray18, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] { 52L, (-1L), 52L, 100L });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertArrayEquals(longArray28, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1L + "'", long33 == 1L);
        org.junit.Assert.assertNotNull(longArray35);
        org.junit.Assert.assertArrayEquals(longArray35, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(longArray38);
        org.junit.Assert.assertArrayEquals(longArray38, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertArrayEquals(longArray42, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 100L + "'", long46 == 100L);
        org.junit.Assert.assertNotNull(longArray48);
        org.junit.Assert.assertArrayEquals(longArray48, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(longArray51);
        org.junit.Assert.assertArrayEquals(longArray51, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
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
        org.junit.Assert.assertNotNull(longArray89);
        org.junit.Assert.assertArrayEquals(longArray89, new long[] { 97L });
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) ' ', (long) 10, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        double[] doubleArray72 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray76 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean77 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray72, doubleArray76);
        double[] doubleArray82 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray86 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray82, doubleArray86);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray72, doubleArray82);
        double double89 = org.apache.commons.lang.math.NumberUtils.max(doubleArray82);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray8, doubleArray82);
        double double91 = org.apache.commons.lang.math.NumberUtils.min(doubleArray82);
        double[] doubleArray92 = null;
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray82, doubleArray92);
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
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 52.0d + "'", double89 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-1.0d) + "'", double91 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
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
        double[] doubleArray42 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray46 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray46);
        double double48 = org.apache.commons.lang.math.NumberUtils.min(doubleArray42);
        double[] doubleArray49 = null;
        double[] doubleArray54 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray58 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray54, doubleArray58);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray49, doubleArray54);
        double[] doubleArray61 = null;
        double[] doubleArray66 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray70 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean71 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray66, doubleArray70);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray61, doubleArray66);
        double[] doubleArray77 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray81 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray77, doubleArray81);
        double double83 = org.apache.commons.lang.math.NumberUtils.min(doubleArray77);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray66, doubleArray77);
        double double85 = org.apache.commons.lang.math.NumberUtils.max(doubleArray66);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray49, doubleArray66);
        double double87 = org.apache.commons.lang.math.NumberUtils.min(doubleArray66);
        double double88 = org.apache.commons.lang.math.NumberUtils.min(doubleArray66);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray66);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray66);
        double double91 = org.apache.commons.lang.math.NumberUtils.min(doubleArray66);
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
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 52.0d + "'", double85 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + (-1.0d) + "'", double87 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + (-1.0d) + "'", double88 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + (-1.0d) + "'", double91 == (-1.0d));
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
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
        float float32 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        float[] floatArray37 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float38 = org.apache.commons.lang.math.NumberUtils.min(floatArray37);
        float[] floatArray45 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float46 = org.apache.commons.lang.math.NumberUtils.min(floatArray45);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray37, floatArray45);
        float[] floatArray52 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float53 = org.apache.commons.lang.math.NumberUtils.min(floatArray52);
        float[] floatArray58 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float59 = org.apache.commons.lang.math.NumberUtils.min(floatArray58);
        float float60 = org.apache.commons.lang.math.NumberUtils.max(floatArray58);
        float float61 = org.apache.commons.lang.math.NumberUtils.min(floatArray58);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(floatArray52, floatArray58);
        float float63 = org.apache.commons.lang.math.NumberUtils.max(floatArray52);
        float[] floatArray68 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float69 = org.apache.commons.lang.math.NumberUtils.min(floatArray68);
        float[] floatArray71 = new float[] { (byte) 10 };
        float float72 = org.apache.commons.lang.math.NumberUtils.min(floatArray71);
        float float73 = org.apache.commons.lang.math.NumberUtils.max(floatArray71);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(floatArray68, floatArray71);
        float[] floatArray76 = new float[] { (byte) 10 };
        float float77 = org.apache.commons.lang.math.NumberUtils.min(floatArray76);
        float float78 = org.apache.commons.lang.math.NumberUtils.max(floatArray76);
        float[] floatArray85 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float86 = org.apache.commons.lang.math.NumberUtils.min(floatArray85);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(floatArray76, floatArray85);
        float float88 = org.apache.commons.lang.math.NumberUtils.max(floatArray85);
        float[] floatArray92 = new float[] { 97.0f, 0L, 32L };
        boolean boolean93 = org.apache.commons.lang.math.NumberUtils.equals(floatArray85, floatArray92);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(floatArray68, floatArray85);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(floatArray52, floatArray68);
        boolean boolean96 = org.apache.commons.lang.math.NumberUtils.equals(floatArray45, floatArray52);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray45);
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
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + (-1.0f) + "'", float32 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertArrayEquals(floatArray37, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-1.0f) + "'", float38 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertArrayEquals(floatArray45, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + (-1.0f) + "'", float46 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertArrayEquals(floatArray52, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + (-1.0f) + "'", float53 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertArrayEquals(floatArray58, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + (-1.0f) + "'", float59 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 100.0f + "'", float60 == 100.0f);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + (-1.0f) + "'", float61 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 100.0f + "'", float63 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertArrayEquals(floatArray68, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float69 + "' != '" + (-1.0f) + "'", float69 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray71);
        org.junit.Assert.assertArrayEquals(floatArray71, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + 10.0f + "'", float72 == 10.0f);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + 10.0f + "'", float73 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(floatArray76);
        org.junit.Assert.assertArrayEquals(floatArray76, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float77 + "' != '" + 10.0f + "'", float77 == 10.0f);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + 10.0f + "'", float78 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray85);
        org.junit.Assert.assertArrayEquals(floatArray85, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float86 + "' != '" + (-1.0f) + "'", float86 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + float88 + "' != '" + 100.0f + "'", float88 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray92);
        org.junit.Assert.assertArrayEquals(floatArray92, new float[] { 97.0f, 0.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
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
        double double52 = org.apache.commons.lang.math.NumberUtils.min(doubleArray28);
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
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 1, 97.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
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
        byte byte75 = org.apache.commons.lang.math.NumberUtils.max(byteArray21);
        byte byte76 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte byte77 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        java.lang.Class<?> wildcardClass78 = byteArray21.getClass();
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
        org.junit.Assert.assertTrue("'" + byte75 + "' != '" + (byte) 100 + "'", byte75 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) -1 + "'", byte76 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte77 + "' != '" + (byte) -1 + "'", byte77 == (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
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
        float[] floatArray53 = new float[] { (byte) 10 };
        float float54 = org.apache.commons.lang.math.NumberUtils.min(floatArray53);
        float float55 = org.apache.commons.lang.math.NumberUtils.max(floatArray53);
        float[] floatArray62 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float63 = org.apache.commons.lang.math.NumberUtils.min(floatArray62);
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(floatArray53, floatArray62);
        float float65 = org.apache.commons.lang.math.NumberUtils.min(floatArray62);
        float[] floatArray70 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float71 = org.apache.commons.lang.math.NumberUtils.min(floatArray70);
        float float72 = org.apache.commons.lang.math.NumberUtils.max(floatArray70);
        float[] floatArray77 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float78 = org.apache.commons.lang.math.NumberUtils.min(floatArray77);
        float float79 = org.apache.commons.lang.math.NumberUtils.max(floatArray77);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(floatArray70, floatArray77);
        float float81 = org.apache.commons.lang.math.NumberUtils.max(floatArray77);
        float float82 = org.apache.commons.lang.math.NumberUtils.min(floatArray77);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(floatArray62, floatArray77);
        float[] floatArray88 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float89 = org.apache.commons.lang.math.NumberUtils.min(floatArray88);
        float[] floatArray91 = new float[] { (byte) 10 };
        float float92 = org.apache.commons.lang.math.NumberUtils.min(floatArray91);
        float float93 = org.apache.commons.lang.math.NumberUtils.max(floatArray91);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(floatArray88, floatArray91);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(floatArray62, floatArray91);
        float float96 = org.apache.commons.lang.math.NumberUtils.min(floatArray91);
        boolean boolean97 = org.apache.commons.lang.math.NumberUtils.equals(floatArray45, floatArray91);
        float float98 = org.apache.commons.lang.math.NumberUtils.min(floatArray91);
        float float99 = org.apache.commons.lang.math.NumberUtils.min(floatArray91);
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
        org.junit.Assert.assertNotNull(floatArray53);
        org.junit.Assert.assertArrayEquals(floatArray53, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 10.0f + "'", float54 == 10.0f);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 10.0f + "'", float55 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray62);
        org.junit.Assert.assertArrayEquals(floatArray62, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + (-1.0f) + "'", float63 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + (-1.0f) + "'", float65 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray70);
        org.junit.Assert.assertArrayEquals(floatArray70, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + (-1.0f) + "'", float71 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + 100.0f + "'", float72 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray77);
        org.junit.Assert.assertArrayEquals(floatArray77, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + (-1.0f) + "'", float78 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + 100.0f + "'", float79 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + float81 + "' != '" + 100.0f + "'", float81 == 100.0f);
        org.junit.Assert.assertTrue("'" + float82 + "' != '" + (-1.0f) + "'", float82 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(floatArray88);
        org.junit.Assert.assertArrayEquals(floatArray88, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float89 + "' != '" + (-1.0f) + "'", float89 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray91);
        org.junit.Assert.assertArrayEquals(floatArray91, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float92 + "' != '" + 10.0f + "'", float92 == 10.0f);
        org.junit.Assert.assertTrue("'" + float93 + "' != '" + 10.0f + "'", float93 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + float96 + "' != '" + 10.0f + "'", float96 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + float98 + "' != '" + 10.0f + "'", float98 == 10.0f);
        org.junit.Assert.assertTrue("'" + float99 + "' != '" + 10.0f + "'", float99 == 10.0f);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang.math.NumberUtils.min(longArray1);
        long[] longArray5 = new long[] { 0L };
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray5);
        long long7 = org.apache.commons.lang.math.NumberUtils.max(longArray5);
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
        long long22 = org.apache.commons.lang.math.NumberUtils.max(longArray12);
        long[] longArray24 = new long[] { 0L };
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray24);
        long[] longArray27 = new long[] { (byte) 1 };
        boolean boolean28 = org.apache.commons.lang.math.NumberUtils.equals(longArray24, longArray27);
        long long29 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        long[] longArray31 = new long[] { 0L };
        long long32 = org.apache.commons.lang.math.NumberUtils.max(longArray31);
        long[] longArray34 = new long[] { (byte) 1 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(longArray31, longArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(longArray27, longArray34);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(longArray12, longArray34);
        long[] longArray39 = new long[] { 0L };
        long long40 = org.apache.commons.lang.math.NumberUtils.max(longArray39);
        long[] longArray42 = new long[] { (byte) 1 };
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(longArray39, longArray42);
        long long44 = org.apache.commons.lang.math.NumberUtils.max(longArray42);
        long[] longArray46 = new long[] { 0L };
        long long47 = org.apache.commons.lang.math.NumberUtils.max(longArray46);
        long[] longArray49 = new long[] { (byte) 1 };
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(longArray46, longArray49);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray49);
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray42);
        long[] longArray54 = new long[] { 0L };
        long long55 = org.apache.commons.lang.math.NumberUtils.max(longArray54);
        long[] longArray57 = new long[] { (byte) 1 };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(longArray54, longArray57);
        long long59 = org.apache.commons.lang.math.NumberUtils.max(longArray57);
        long[] longArray61 = new long[] { 0L };
        long long62 = org.apache.commons.lang.math.NumberUtils.max(longArray61);
        long[] longArray64 = new long[] { (byte) 1 };
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(longArray61, longArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(longArray57, longArray64);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(longArray42, longArray64);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray42);
        long[] longArray70 = new long[] { 0L };
        long long71 = org.apache.commons.lang.math.NumberUtils.max(longArray70);
        long[] longArray73 = new long[] { (byte) 1 };
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(longArray70, longArray73);
        long long75 = org.apache.commons.lang.math.NumberUtils.min(longArray73);
        long long76 = org.apache.commons.lang.math.NumberUtils.min(longArray73);
        long long77 = org.apache.commons.lang.math.NumberUtils.min(longArray73);
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray73);
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(longArray5, longArray34);
        long long80 = org.apache.commons.lang.math.NumberUtils.min(longArray34);
        long long81 = org.apache.commons.lang.math.NumberUtils.max(longArray34);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray34);
        java.lang.Class<?> wildcardClass83 = longArray1.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(longArray24);
        org.junit.Assert.assertArrayEquals(longArray24, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(longArray31);
        org.junit.Assert.assertArrayEquals(longArray31, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertArrayEquals(longArray34, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(longArray39);
        org.junit.Assert.assertArrayEquals(longArray39, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(longArray42);
        org.junit.Assert.assertArrayEquals(longArray42, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1L + "'", long44 == 1L);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertArrayEquals(longArray46, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(longArray49);
        org.junit.Assert.assertArrayEquals(longArray49, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertNotNull(longArray54);
        org.junit.Assert.assertArrayEquals(longArray54, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(longArray57);
        org.junit.Assert.assertArrayEquals(longArray57, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 1L + "'", long59 == 1L);
        org.junit.Assert.assertNotNull(longArray61);
        org.junit.Assert.assertArrayEquals(longArray61, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertNotNull(longArray64);
        org.junit.Assert.assertArrayEquals(longArray64, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(longArray70);
        org.junit.Assert.assertArrayEquals(longArray70, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 0L + "'", long71 == 0L);
        org.junit.Assert.assertNotNull(longArray73);
        org.junit.Assert.assertArrayEquals(longArray73, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + long75 + "' != '" + 1L + "'", long75 == 1L);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 1L + "'", long76 == 1L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 1L + "'", long77 == 1L);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1L + "'", long80 == 1L);
        org.junit.Assert.assertTrue("'" + long81 + "' != '" + 1L + "'", long81 == 1L);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) -1, (short) (byte) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1L, (double) 1L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) (byte) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1, (double) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(100, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 100, (long) 52, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
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
        // The following exception was thrown during execution in test generation
        try {
            float float34 = org.apache.commons.lang.math.NumberUtils.min(floatArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1L), 0.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1.0f), (double) (-1), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        float[] floatArray1 = new float[] { (byte) 10 };
        float float2 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
        float float3 = org.apache.commons.lang.math.NumberUtils.max(floatArray1);
        float[] floatArray10 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float[] floatArray17 = new float[] { 97.0f, 0L, 32L };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray17);
        float float19 = org.apache.commons.lang.math.NumberUtils.max(floatArray17);
        float[] floatArray21 = new float[] { (byte) 10 };
        float float22 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        float float23 = org.apache.commons.lang.math.NumberUtils.max(floatArray21);
        float[] floatArray30 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float31 = org.apache.commons.lang.math.NumberUtils.min(floatArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray30);
        float float33 = org.apache.commons.lang.math.NumberUtils.min(floatArray30);
        float[] floatArray38 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float39 = org.apache.commons.lang.math.NumberUtils.min(floatArray38);
        float float40 = org.apache.commons.lang.math.NumberUtils.max(floatArray38);
        float[] floatArray45 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float46 = org.apache.commons.lang.math.NumberUtils.min(floatArray45);
        float float47 = org.apache.commons.lang.math.NumberUtils.max(floatArray45);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(floatArray38, floatArray45);
        float float49 = org.apache.commons.lang.math.NumberUtils.max(floatArray45);
        float float50 = org.apache.commons.lang.math.NumberUtils.min(floatArray45);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray45);
        float float52 = org.apache.commons.lang.math.NumberUtils.max(floatArray30);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray30);
        float[] floatArray58 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float59 = org.apache.commons.lang.math.NumberUtils.min(floatArray58);
        float float60 = org.apache.commons.lang.math.NumberUtils.max(floatArray58);
        float float61 = org.apache.commons.lang.math.NumberUtils.max(floatArray58);
        float[] floatArray66 = new float[] { (byte) 0, (-1.0f), (short) 1, (-1.0f) };
        float float67 = org.apache.commons.lang.math.NumberUtils.max(floatArray66);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(floatArray58, floatArray66);
        float[] floatArray73 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float74 = org.apache.commons.lang.math.NumberUtils.min(floatArray73);
        float[] floatArray81 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float82 = org.apache.commons.lang.math.NumberUtils.min(floatArray81);
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(floatArray73, floatArray81);
        float float84 = org.apache.commons.lang.math.NumberUtils.min(floatArray81);
        float float85 = org.apache.commons.lang.math.NumberUtils.max(floatArray81);
        float float86 = org.apache.commons.lang.math.NumberUtils.max(floatArray81);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(floatArray66, floatArray81);
        boolean boolean88 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray81);
        float float89 = org.apache.commons.lang.math.NumberUtils.max(floatArray30);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 97.0f, 0.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 97.0f + "'", float19 == 97.0f);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-1.0f) + "'", float31 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertArrayEquals(floatArray38, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-1.0f) + "'", float39 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 100.0f + "'", float40 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertArrayEquals(floatArray45, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + (-1.0f) + "'", float46 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 100.0f + "'", float47 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 100.0f + "'", float49 == 100.0f);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + (-1.0f) + "'", float50 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 100.0f + "'", float52 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertArrayEquals(floatArray58, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + (-1.0f) + "'", float59 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 100.0f + "'", float60 == 100.0f);
        org.junit.Assert.assertTrue("'" + float61 + "' != '" + 100.0f + "'", float61 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertArrayEquals(floatArray66, new float[] { 0.0f, (-1.0f), 1.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 1.0f + "'", float67 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(floatArray73);
        org.junit.Assert.assertArrayEquals(floatArray73, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float74 + "' != '" + (-1.0f) + "'", float74 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray81);
        org.junit.Assert.assertArrayEquals(floatArray81, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float82 + "' != '" + (-1.0f) + "'", float82 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + float84 + "' != '" + (-1.0f) + "'", float84 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float85 + "' != '" + 100.0f + "'", float85 == 100.0f);
        org.junit.Assert.assertTrue("'" + float86 + "' != '" + 100.0f + "'", float86 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + float89 + "' != '" + 100.0f + "'", float89 == 100.0f);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
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
        double double52 = org.apache.commons.lang.math.NumberUtils.min(doubleArray28);
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
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
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
        long long39 = org.apache.commons.lang.math.NumberUtils.max(longArray34);
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
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 100, (long) ' ', (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 35L, (double) (-1), (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 0, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray2);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        byte byte23 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray33);
        byte byte36 = org.apache.commons.lang.math.NumberUtils.max(byteArray33);
        byte[] byteArray38 = new byte[] { (byte) 100 };
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray38);
        byte byte40 = org.apache.commons.lang.math.NumberUtils.max(byteArray38);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(byteArray38, byteArray47);
        byte byte49 = org.apache.commons.lang.math.NumberUtils.max(byteArray47);
        byte byte50 = org.apache.commons.lang.math.NumberUtils.min(byteArray47);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray47);
        byte[] byteArray52 = null;
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(byteArray47, byteArray52);
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
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) 100 + "'", byte36 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + byte40 + "' != '" + (byte) 100 + "'", byte40 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + byte49 + "' != '" + (byte) 100 + "'", byte49 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte50 + "' != '" + (byte) -1 + "'", byte50 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 32, (long) 1, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 52, (long) (-1), 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1L, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(52.0d, (-1.0d), (double) 52L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 100, 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 'a', (float) (-1L), (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 100, 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
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
        short short35 = org.apache.commons.lang.math.NumberUtils.max(shortArray5);
        short short36 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
        short short37 = org.apache.commons.lang.math.NumberUtils.min(shortArray5);
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
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 100 + "'", short35 == (short) 100);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 100 + "'", short36 == (short) 100);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 100 + "'", short37 == (short) 100);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray12 = new float[] { (byte) 0, (-1.0f), (short) 1, (-1.0f) };
        float float13 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray12);
        float[] floatArray16 = new float[] { (byte) 10 };
        float float17 = org.apache.commons.lang.math.NumberUtils.min(floatArray16);
        float float18 = org.apache.commons.lang.math.NumberUtils.max(floatArray16);
        float[] floatArray25 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float26 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        boolean boolean27 = org.apache.commons.lang.math.NumberUtils.equals(floatArray16, floatArray25);
        float float28 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float[] floatArray33 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float34 = org.apache.commons.lang.math.NumberUtils.min(floatArray33);
        float float35 = org.apache.commons.lang.math.NumberUtils.max(floatArray33);
        float[] floatArray40 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float41 = org.apache.commons.lang.math.NumberUtils.min(floatArray40);
        float float42 = org.apache.commons.lang.math.NumberUtils.max(floatArray40);
        boolean boolean43 = org.apache.commons.lang.math.NumberUtils.equals(floatArray33, floatArray40);
        float float44 = org.apache.commons.lang.math.NumberUtils.max(floatArray40);
        float float45 = org.apache.commons.lang.math.NumberUtils.min(floatArray40);
        boolean boolean46 = org.apache.commons.lang.math.NumberUtils.equals(floatArray25, floatArray40);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray25);
        float[] floatArray52 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float53 = org.apache.commons.lang.math.NumberUtils.min(floatArray52);
        float[] floatArray55 = new float[] { (byte) 10 };
        float float56 = org.apache.commons.lang.math.NumberUtils.min(floatArray55);
        float float57 = org.apache.commons.lang.math.NumberUtils.max(floatArray55);
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(floatArray52, floatArray55);
        float float59 = org.apache.commons.lang.math.NumberUtils.min(floatArray52);
        float float60 = org.apache.commons.lang.math.NumberUtils.max(floatArray52);
        boolean boolean61 = org.apache.commons.lang.math.NumberUtils.equals(floatArray25, floatArray52);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 0.0f, (-1.0f), 1.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertArrayEquals(floatArray16, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray33);
        org.junit.Assert.assertArrayEquals(floatArray33, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + (-1.0f) + "'", float34 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 100.0f + "'", float35 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray40);
        org.junit.Assert.assertArrayEquals(floatArray40, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-1.0f) + "'", float41 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 100.0f + "'", float42 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 100.0f + "'", float44 == 100.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + (-1.0f) + "'", float45 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertArrayEquals(floatArray52, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + (-1.0f) + "'", float53 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertArrayEquals(floatArray55, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 10.0f + "'", float56 == 10.0f);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 10.0f + "'", float57 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + (-1.0f) + "'", float59 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 100.0f + "'", float60 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
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
        java.lang.Class<?> wildcardClass63 = doubleArray8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
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
        short[] shortArray33 = new short[] { (short) 100 };
        short[] shortArray34 = new short[] {};
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(shortArray33, shortArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(shortArray30, shortArray33);
        boolean boolean37 = org.apache.commons.lang.math.NumberUtils.equals(shortArray24, shortArray33);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(shortArray14, shortArray24);
        short short39 = org.apache.commons.lang.math.NumberUtils.max(shortArray24);
        short short40 = org.apache.commons.lang.math.NumberUtils.max(shortArray24);
        short short41 = org.apache.commons.lang.math.NumberUtils.max(shortArray24);
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
        org.junit.Assert.assertNotNull(shortArray33);
        org.junit.Assert.assertArrayEquals(shortArray33, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray34);
        org.junit.Assert.assertArrayEquals(shortArray34, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + short39 + "' != '" + (short) 100 + "'", short39 == (short) 100);
        org.junit.Assert.assertTrue("'" + short40 + "' != '" + (short) 100 + "'", short40 == (short) 100);
        org.junit.Assert.assertTrue("'" + short41 + "' != '" + (short) 100 + "'", short41 == (short) 100);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
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
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(byteArray39, byteArray46);
        byte byte48 = org.apache.commons.lang.math.NumberUtils.min(byteArray46);
        byte[] byteArray51 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray58 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(byteArray51, byteArray58);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(byteArray46, byteArray58);
        byte byte61 = org.apache.commons.lang.math.NumberUtils.max(byteArray58);
        byte[] byteArray63 = new byte[] { (byte) 100 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(byteArray58, byteArray63);
        byte byte65 = org.apache.commons.lang.math.NumberUtils.max(byteArray63);
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(byteArray63, byteArray72);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray72);
        byte byte75 = org.apache.commons.lang.math.NumberUtils.max(byteArray72);
        byte byte76 = org.apache.commons.lang.math.NumberUtils.max(byteArray72);
        byte byte77 = org.apache.commons.lang.math.NumberUtils.min(byteArray72);
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
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) -1 + "'", byte48 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 100 + "'", byte61 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) 100 + "'", byte65 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + byte75 + "' != '" + (byte) 100 + "'", byte75 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte76 + "' != '" + (byte) 100 + "'", byte76 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte77 + "' != '" + (byte) -1 + "'", byte77 == (byte) -1);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 10, (float) 35, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (long) 'a', 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32.0f, (double) 10.0f, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 0, (float) 97L, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(1.0d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 100, (float) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray12 = new float[] { (byte) 0, (-1.0f), (short) 1, (-1.0f) };
        float float13 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray12);
        float[] floatArray19 = new float[] { (byte) 0, (-1.0f), (short) 1, (-1.0f) };
        float float20 = org.apache.commons.lang.math.NumberUtils.max(floatArray19);
        float[] floatArray25 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float26 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float[] floatArray28 = new float[] { (byte) 10 };
        float float29 = org.apache.commons.lang.math.NumberUtils.min(floatArray28);
        float float30 = org.apache.commons.lang.math.NumberUtils.max(floatArray28);
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(floatArray25, floatArray28);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray28);
        float[] floatArray37 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float38 = org.apache.commons.lang.math.NumberUtils.min(floatArray37);
        float float39 = org.apache.commons.lang.math.NumberUtils.max(floatArray37);
        float[] floatArray44 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float45 = org.apache.commons.lang.math.NumberUtils.min(floatArray44);
        float float46 = org.apache.commons.lang.math.NumberUtils.max(floatArray44);
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(floatArray37, floatArray44);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray44);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray44);
        float float50 = org.apache.commons.lang.math.NumberUtils.min(floatArray12);
        float float51 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 0.0f, (-1.0f), 1.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 0.0f, (-1.0f), 1.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray28);
        org.junit.Assert.assertArrayEquals(floatArray28, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 10.0f + "'", float29 == 10.0f);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 10.0f + "'", float30 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertArrayEquals(floatArray37, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-1.0f) + "'", float38 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray44);
        org.junit.Assert.assertArrayEquals(floatArray44, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + (-1.0f) + "'", float45 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 100.0f + "'", float46 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + (-1.0f) + "'", float50 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 1.0f + "'", float51 == 1.0f);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) ' ', (long) (short) 100, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        double[] doubleArray5 = new double[] { 35.0d, (byte) 10, 0.0f, 0.0d, ' ' };
        double double6 = org.apache.commons.lang.math.NumberUtils.min(doubleArray5);
        double[] doubleArray11 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray15 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean16 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray11, doubleArray15);
        double double17 = org.apache.commons.lang.math.NumberUtils.max(doubleArray15);
        double double18 = org.apache.commons.lang.math.NumberUtils.max(doubleArray15);
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray15);
        double double20 = org.apache.commons.lang.math.NumberUtils.min(doubleArray5);
        double double21 = org.apache.commons.lang.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, 10.0d, 0.0d, 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 1, (long) '4', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray12 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray12);
        float float15 = org.apache.commons.lang.math.NumberUtils.min(floatArray12);
        float float16 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        float float17 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
        float float18 = org.apache.commons.lang.math.NumberUtils.max(floatArray12);
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (-1L), (double) 35.0f, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((-1L), 100L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32.0f, (double) 35L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 10, (long) (byte) 1, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
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
        int int17 = org.apache.commons.lang.math.NumberUtils.min(intArray9);
        int int18 = org.apache.commons.lang.math.NumberUtils.max(intArray9);
        int[] intArray20 = new int[] { (short) -1 };
        int int21 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        int[] intArray23 = new int[] { (short) -1 };
        int int24 = org.apache.commons.lang.math.NumberUtils.min(intArray23);
        boolean boolean25 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray23);
        int int26 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        int[] intArray28 = new int[] { (short) -1 };
        int int29 = org.apache.commons.lang.math.NumberUtils.min(intArray28);
        int[] intArray31 = new int[] { (short) -1 };
        int int32 = org.apache.commons.lang.math.NumberUtils.min(intArray31);
        boolean boolean33 = org.apache.commons.lang.math.NumberUtils.equals(intArray28, intArray31);
        int[] intArray35 = new int[] { (short) -1 };
        int int36 = org.apache.commons.lang.math.NumberUtils.min(intArray35);
        int[] intArray38 = new int[] { (short) -1 };
        int int39 = org.apache.commons.lang.math.NumberUtils.min(intArray38);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(intArray35, intArray38);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(intArray31, intArray35);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray35);
        int[] intArray44 = new int[] { (short) -1 };
        int int45 = org.apache.commons.lang.math.NumberUtils.min(intArray44);
        int[] intArray47 = new int[] { (short) -1 };
        int int48 = org.apache.commons.lang.math.NumberUtils.min(intArray47);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(intArray44, intArray47);
        int int50 = org.apache.commons.lang.math.NumberUtils.min(intArray44);
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray44);
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(intArray20, intArray44);
        int int53 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        int int54 = org.apache.commons.lang.math.NumberUtils.min(intArray20);
        boolean boolean55 = org.apache.commons.lang.math.NumberUtils.equals(intArray9, intArray20);
        boolean boolean56 = org.apache.commons.lang.math.NumberUtils.equals(intArray0, intArray9);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertArrayEquals(intArray28, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 'a', 32L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 1, (long) 32, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) '4', (-1.0d));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((-1L), (long) (short) 100, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(97, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(100L, 0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(35, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) 100, (double) 100.0f, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 97L, 100.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { (byte) 1 };
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long long7 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long long8 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray9 = null;
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray9);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.lang.math.NumberUtils.max(longArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 0, (float) 97L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (byte) 0, (double) '#', (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 35L, (double) (short) 100, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
        short short30 = org.apache.commons.lang.math.NumberUtils.min(shortArray23);
        short short31 = org.apache.commons.lang.math.NumberUtils.max(shortArray23);
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
        org.junit.Assert.assertTrue("'" + short30 + "' != '" + (short) 100 + "'", short30 == (short) 100);
        org.junit.Assert.assertTrue("'" + short31 + "' != '" + (short) 100 + "'", short31 == (short) 100);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(1L, (long) 0, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 100, (long) 10, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
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
        long long24 = org.apache.commons.lang.math.NumberUtils.min(longArray4);
        long long25 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long[] longArray27 = new long[] { 0L };
        long long28 = org.apache.commons.lang.math.NumberUtils.max(longArray27);
        long[] longArray30 = new long[] { (byte) 1 };
        boolean boolean31 = org.apache.commons.lang.math.NumberUtils.equals(longArray27, longArray30);
        long long32 = org.apache.commons.lang.math.NumberUtils.max(longArray30);
        long[] longArray34 = new long[] { 0L };
        long long35 = org.apache.commons.lang.math.NumberUtils.max(longArray34);
        long[] longArray37 = new long[] { (byte) 1 };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray37);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(longArray30, longArray37);
        long long40 = org.apache.commons.lang.math.NumberUtils.min(longArray30);
        long long41 = org.apache.commons.lang.math.NumberUtils.max(longArray30);
        long[] longArray43 = new long[] { 0L };
        long long44 = org.apache.commons.lang.math.NumberUtils.max(longArray43);
        long[] longArray46 = new long[] { (byte) 1 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(longArray43, longArray46);
        long long48 = org.apache.commons.lang.math.NumberUtils.min(longArray46);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(longArray30, longArray46);
        long long50 = org.apache.commons.lang.math.NumberUtils.min(longArray30);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(longArray4, longArray30);
        long long52 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        long long53 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(longArray27);
        org.junit.Assert.assertArrayEquals(longArray27, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(longArray30);
        org.junit.Assert.assertArrayEquals(longArray30, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertArrayEquals(longArray34, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertArrayEquals(longArray37, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1L + "'", long40 == 1L);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
        org.junit.Assert.assertNotNull(longArray43);
        org.junit.Assert.assertArrayEquals(longArray43, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(longArray46);
        org.junit.Assert.assertArrayEquals(longArray46, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1L + "'", long48 == 1L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1L + "'", long50 == 1L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1L + "'", long52 == 1L);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1L + "'", long53 == 1L);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 0 };
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min(byteArray2);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        byte byte9 = org.apache.commons.lang.math.NumberUtils.min(byteArray8);
        byte byte10 = org.apache.commons.lang.math.NumberUtils.min(byteArray8);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.min(byteArray8);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(byteArray14, byteArray21);
        byte byte23 = org.apache.commons.lang.math.NumberUtils.min(byteArray21);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(byteArray26, byteArray33);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(byteArray21, byteArray33);
        byte byte36 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        byte[] byteArray39 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(byteArray39, byteArray46);
        byte byte48 = org.apache.commons.lang.math.NumberUtils.min(byteArray46);
        byte[] byteArray51 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray58 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(byteArray51, byteArray58);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(byteArray46, byteArray58);
        byte byte61 = org.apache.commons.lang.math.NumberUtils.max(byteArray58);
        byte[] byteArray63 = new byte[] { (byte) 100 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(byteArray58, byteArray63);
        byte byte65 = org.apache.commons.lang.math.NumberUtils.max(byteArray63);
        byte[] byteArray72 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(byteArray63, byteArray72);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray63);
        byte[] byteArray77 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray84 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(byteArray77, byteArray84);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(byteArray33, byteArray77);
        byte byte87 = org.apache.commons.lang.math.NumberUtils.max(byteArray33);
        byte byte88 = org.apache.commons.lang.math.NumberUtils.min(byteArray33);
        boolean boolean89 = org.apache.commons.lang.math.NumberUtils.equals(byteArray8, byteArray33);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray8);
        byte byte91 = org.apache.commons.lang.math.NumberUtils.min(byteArray8);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
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
        org.junit.Assert.assertTrue("'" + byte36 + "' != '" + (byte) -1 + "'", byte36 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + byte48 + "' != '" + (byte) -1 + "'", byte48 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + byte61 + "' != '" + (byte) 100 + "'", byte61 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + byte65 + "' != '" + (byte) 100 + "'", byte65 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + byte87 + "' != '" + (byte) 100 + "'", byte87 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte88 + "' != '" + (byte) -1 + "'", byte88 == (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + byte91 + "' != '" + (byte) 1 + "'", byte91 == (byte) 1);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(32.0d, (double) 32.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int int3 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int int4 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        java.lang.Class<?> wildcardClass5 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1L), 52.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 32, (long) 1, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(10L, (long) (byte) 1, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int int8 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int int9 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int int10 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 97.0f, (double) 35L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 1, (long) 1, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) 'a', 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
        double double63 = org.apache.commons.lang.math.NumberUtils.max(doubleArray55);
        double double64 = org.apache.commons.lang.math.NumberUtils.min(doubleArray55);
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
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 52.0d + "'", double63 == 52.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1.0d) + "'", double64 == (-1.0d));
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        short[] shortArray5 = new short[] { (short) 0, (byte) -1, (short) 0, (short) 1, (byte) 0 };
        short[] shortArray7 = new short[] { (short) 100 };
        short[] shortArray8 = new short[] {};
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(shortArray7, shortArray8);
        short[] shortArray11 = new short[] { (short) 100 };
        short[] shortArray12 = new short[] {};
        boolean boolean13 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(shortArray8, shortArray11);
        short[] shortArray16 = new short[] { (short) 100 };
        short[] shortArray17 = new short[] {};
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(shortArray16, shortArray17);
        short[] shortArray20 = new short[] { (short) 100 };
        short[] shortArray21 = new short[] {};
        boolean boolean22 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray21);
        boolean boolean23 = org.apache.commons.lang.math.NumberUtils.equals(shortArray17, shortArray20);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(shortArray11, shortArray20);
        short short25 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
        short short26 = org.apache.commons.lang.math.NumberUtils.min(shortArray20);
        short[] shortArray32 = new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (byte) 10 };
        short short33 = org.apache.commons.lang.math.NumberUtils.min(shortArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(shortArray20, shortArray32);
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray32);
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
        short short55 = org.apache.commons.lang.math.NumberUtils.min(shortArray41);
        short short56 = org.apache.commons.lang.math.NumberUtils.min(shortArray41);
        short short57 = org.apache.commons.lang.math.NumberUtils.max(shortArray41);
        short short58 = org.apache.commons.lang.math.NumberUtils.max(shortArray41);
        short short59 = org.apache.commons.lang.math.NumberUtils.max(shortArray41);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray41);
        short short61 = org.apache.commons.lang.math.NumberUtils.min(shortArray41);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertArrayEquals(shortArray5, new short[] { (short) 0, (short) -1, (short) 0, (short) 1, (short) 0 });
        org.junit.Assert.assertNotNull(shortArray7);
        org.junit.Assert.assertArrayEquals(shortArray7, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray8);
        org.junit.Assert.assertArrayEquals(shortArray8, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shortArray11);
        org.junit.Assert.assertArrayEquals(shortArray11, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray12);
        org.junit.Assert.assertArrayEquals(shortArray12, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(shortArray16);
        org.junit.Assert.assertArrayEquals(shortArray16, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray17);
        org.junit.Assert.assertArrayEquals(shortArray17, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(shortArray20);
        org.junit.Assert.assertArrayEquals(shortArray20, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray21);
        org.junit.Assert.assertArrayEquals(shortArray21, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 100 + "'", short25 == (short) 100);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 100 + "'", short26 == (short) 100);
        org.junit.Assert.assertNotNull(shortArray32);
        org.junit.Assert.assertArrayEquals(shortArray32, new short[] { (short) 100, (short) 100, (short) 10, (short) 10, (short) 10 });
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 10 + "'", short33 == (short) 10);
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
        org.junit.Assert.assertTrue("'" + short55 + "' != '" + (short) 100 + "'", short55 == (short) 100);
        org.junit.Assert.assertTrue("'" + short56 + "' != '" + (short) 100 + "'", short56 == (short) 100);
        org.junit.Assert.assertTrue("'" + short57 + "' != '" + (short) 100 + "'", short57 == (short) 100);
        org.junit.Assert.assertTrue("'" + short58 + "' != '" + (short) 100 + "'", short58 == (short) 100);
        org.junit.Assert.assertTrue("'" + short59 + "' != '" + (short) 100 + "'", short59 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + short61 + "' != '" + (short) 100 + "'", short61 == (short) 100);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((-1L), (long) (byte) 10, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) ' ', (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1L, (double) 35.0f, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '4', (float) (byte) 10, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(100.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, (int) '#', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 35, (float) 97L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 10L, (float) 35L, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, 0.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 100, 35L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 1, (float) (short) 10, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) '4', 10.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
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
        double[] doubleArray25 = null;
        double[] doubleArray30 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray34 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean35 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray30, doubleArray34);
        boolean boolean36 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray30);
        double[] doubleArray37 = null;
        double[] doubleArray42 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray46 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean47 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray46);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray37, doubleArray42);
        double[] doubleArray53 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray57 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean58 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray53, doubleArray57);
        double double59 = org.apache.commons.lang.math.NumberUtils.min(doubleArray53);
        boolean boolean60 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray42, doubleArray53);
        double double61 = org.apache.commons.lang.math.NumberUtils.max(doubleArray42);
        boolean boolean62 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray25, doubleArray42);
        double double63 = org.apache.commons.lang.math.NumberUtils.min(doubleArray42);
        double double64 = org.apache.commons.lang.math.NumberUtils.min(doubleArray42);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray42);
        double[] doubleArray70 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray74 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean75 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray70, doubleArray74);
        double[] doubleArray80 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray84 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray80, doubleArray84);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray70, doubleArray80);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray70);
        double double88 = org.apache.commons.lang.math.NumberUtils.max(doubleArray70);
        java.lang.Class<?> wildcardClass89 = doubleArray70.getClass();
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
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 52.0d + "'", double61 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + (-1.0d) + "'", double64 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertArrayEquals(doubleArray84, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 52.0d + "'", double88 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray12 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float13 = org.apache.commons.lang.math.NumberUtils.min(floatArray12);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray12);
        float[] floatArray19 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float20 = org.apache.commons.lang.math.NumberUtils.min(floatArray19);
        float[] floatArray25 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float26 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        float float27 = org.apache.commons.lang.math.NumberUtils.max(floatArray25);
        float float28 = org.apache.commons.lang.math.NumberUtils.min(floatArray25);
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray25);
        float[] floatArray36 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float37 = org.apache.commons.lang.math.NumberUtils.min(floatArray36);
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(floatArray19, floatArray36);
        boolean boolean39 = org.apache.commons.lang.math.NumberUtils.equals(floatArray12, floatArray36);
        java.lang.Class<?> wildcardClass40 = floatArray36.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray12);
        org.junit.Assert.assertArrayEquals(floatArray12, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(floatArray19);
        org.junit.Assert.assertArrayEquals(floatArray19, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertArrayEquals(floatArray25, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + (-1.0f) + "'", float26 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 100.0f + "'", float27 == 100.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + (-1.0f) + "'", float28 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(floatArray36);
        org.junit.Assert.assertArrayEquals(floatArray36, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-1.0f) + "'", float37 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 32L, 100.0f, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(0, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) (byte) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, 32, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0L, (double) 35.0f, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) '4', (double) (byte) -1, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) -1, (short) (byte) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray7 = new float[] { (byte) 10 };
        float float8 = org.apache.commons.lang.math.NumberUtils.min(floatArray7);
        float float9 = org.apache.commons.lang.math.NumberUtils.max(floatArray7);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray7);
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray13 = new float[] { (byte) 10 };
        float float14 = org.apache.commons.lang.math.NumberUtils.min(floatArray13);
        float float15 = org.apache.commons.lang.math.NumberUtils.max(floatArray13);
        float[] floatArray22 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float23 = org.apache.commons.lang.math.NumberUtils.min(floatArray22);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(floatArray13, floatArray22);
        float float25 = org.apache.commons.lang.math.NumberUtils.max(floatArray22);
        float[] floatArray29 = new float[] { 97.0f, 0L, 32L };
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(floatArray22, floatArray29);
        float float31 = org.apache.commons.lang.math.NumberUtils.min(floatArray29);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray29);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray13);
        org.junit.Assert.assertArrayEquals(floatArray13, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray22);
        org.junit.Assert.assertArrayEquals(floatArray22, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-1.0f) + "'", float23 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 100.0f + "'", float25 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray29);
        org.junit.Assert.assertArrayEquals(floatArray29, new float[] { 97.0f, 0.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(35, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
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
        long long15 = org.apache.commons.lang.math.NumberUtils.max(longArray4);
        java.lang.Class<?> wildcardClass16 = longArray4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(35L, (long) 10, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 10, (float) (-1), 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
        float[] floatArray66 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float67 = org.apache.commons.lang.math.NumberUtils.min(floatArray66);
        float[] floatArray72 = new float[] { (byte) 0, (-1.0f), (short) 1, (-1.0f) };
        float float73 = org.apache.commons.lang.math.NumberUtils.max(floatArray72);
        float[] floatArray78 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float79 = org.apache.commons.lang.math.NumberUtils.min(floatArray78);
        float[] floatArray81 = new float[] { (byte) 10 };
        float float82 = org.apache.commons.lang.math.NumberUtils.min(floatArray81);
        float float83 = org.apache.commons.lang.math.NumberUtils.max(floatArray81);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(floatArray78, floatArray81);
        boolean boolean85 = org.apache.commons.lang.math.NumberUtils.equals(floatArray72, floatArray81);
        boolean boolean86 = org.apache.commons.lang.math.NumberUtils.equals(floatArray66, floatArray72);
        boolean boolean87 = org.apache.commons.lang.math.NumberUtils.equals(floatArray44, floatArray72);
        float float88 = org.apache.commons.lang.math.NumberUtils.min(floatArray72);
        float float89 = org.apache.commons.lang.math.NumberUtils.max(floatArray72);
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
        org.junit.Assert.assertNotNull(floatArray66);
        org.junit.Assert.assertArrayEquals(floatArray66, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + (-1.0f) + "'", float67 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertArrayEquals(floatArray72, new float[] { 0.0f, (-1.0f), 1.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + 1.0f + "'", float73 == 1.0f);
        org.junit.Assert.assertNotNull(floatArray78);
        org.junit.Assert.assertArrayEquals(floatArray78, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float79 + "' != '" + (-1.0f) + "'", float79 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray81);
        org.junit.Assert.assertArrayEquals(floatArray81, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float82 + "' != '" + 10.0f + "'", float82 == 10.0f);
        org.junit.Assert.assertTrue("'" + float83 + "' != '" + 10.0f + "'", float83 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + float88 + "' != '" + (-1.0f) + "'", float88 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float89 + "' != '" + 1.0f + "'", float89 == 1.0f);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((-1.0d), (double) (byte) 10, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
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
        float[] floatArray50 = new float[] { (byte) 0, (-1.0f), (short) 1, (-1.0f) };
        float float51 = org.apache.commons.lang.math.NumberUtils.max(floatArray50);
        float float52 = org.apache.commons.lang.math.NumberUtils.max(floatArray50);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray50);
        float float54 = org.apache.commons.lang.math.NumberUtils.max(floatArray50);
        float float55 = org.apache.commons.lang.math.NumberUtils.min(floatArray50);
        float float56 = org.apache.commons.lang.math.NumberUtils.min(floatArray50);
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
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertArrayEquals(floatArray50, new float[] { 0.0f, (-1.0f), 1.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 1.0f + "'", float51 == 1.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 1.0f + "'", float52 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + 1.0f + "'", float54 == 1.0f);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + (-1.0f) + "'", float55 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + (-1.0f) + "'", float56 == (-1.0f));
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
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
        int int31 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        int int32 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        int int33 = org.apache.commons.lang.math.NumberUtils.max(intArray4);
        java.lang.Class<?> wildcardClass34 = intArray4.getClass();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
        float[] floatArray50 = new float[] { (byte) 0, (-1.0f), (short) 1, (-1.0f) };
        float float51 = org.apache.commons.lang.math.NumberUtils.max(floatArray50);
        float float52 = org.apache.commons.lang.math.NumberUtils.max(floatArray50);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray50);
        float float54 = org.apache.commons.lang.math.NumberUtils.min(floatArray50);
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
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertArrayEquals(floatArray50, new float[] { 0.0f, (-1.0f), 1.0f, (-1.0f) }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 1.0f + "'", float51 == 1.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 1.0f + "'", float52 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + (-1.0f) + "'", float54 == (-1.0f));
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        float[] floatArray1 = new float[] { (byte) 10 };
        float float2 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
        float float3 = org.apache.commons.lang.math.NumberUtils.max(floatArray1);
        float[] floatArray10 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float[] floatArray17 = new float[] { 97.0f, 0L, 32L };
        boolean boolean18 = org.apache.commons.lang.math.NumberUtils.equals(floatArray10, floatArray17);
        float float19 = org.apache.commons.lang.math.NumberUtils.max(floatArray17);
        float[] floatArray21 = new float[] { (byte) 10 };
        float float22 = org.apache.commons.lang.math.NumberUtils.min(floatArray21);
        float float23 = org.apache.commons.lang.math.NumberUtils.max(floatArray21);
        float[] floatArray30 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float31 = org.apache.commons.lang.math.NumberUtils.min(floatArray30);
        boolean boolean32 = org.apache.commons.lang.math.NumberUtils.equals(floatArray21, floatArray30);
        float float33 = org.apache.commons.lang.math.NumberUtils.min(floatArray30);
        float[] floatArray38 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float39 = org.apache.commons.lang.math.NumberUtils.min(floatArray38);
        float float40 = org.apache.commons.lang.math.NumberUtils.max(floatArray38);
        float[] floatArray45 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float46 = org.apache.commons.lang.math.NumberUtils.min(floatArray45);
        float float47 = org.apache.commons.lang.math.NumberUtils.max(floatArray45);
        boolean boolean48 = org.apache.commons.lang.math.NumberUtils.equals(floatArray38, floatArray45);
        float float49 = org.apache.commons.lang.math.NumberUtils.max(floatArray45);
        float float50 = org.apache.commons.lang.math.NumberUtils.min(floatArray45);
        boolean boolean51 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray45);
        float float52 = org.apache.commons.lang.math.NumberUtils.max(floatArray30);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(floatArray17, floatArray30);
        float[] floatArray55 = new float[] { (byte) 10 };
        float float56 = org.apache.commons.lang.math.NumberUtils.min(floatArray55);
        float float57 = org.apache.commons.lang.math.NumberUtils.max(floatArray55);
        float[] floatArray64 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float65 = org.apache.commons.lang.math.NumberUtils.min(floatArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(floatArray55, floatArray64);
        float float67 = org.apache.commons.lang.math.NumberUtils.max(floatArray64);
        float[] floatArray72 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float73 = org.apache.commons.lang.math.NumberUtils.min(floatArray72);
        boolean boolean74 = org.apache.commons.lang.math.NumberUtils.equals(floatArray64, floatArray72);
        float float75 = org.apache.commons.lang.math.NumberUtils.max(floatArray64);
        float[] floatArray78 = new float[] { 97L, 'a' };
        boolean boolean79 = org.apache.commons.lang.math.NumberUtils.equals(floatArray64, floatArray78);
        boolean boolean80 = org.apache.commons.lang.math.NumberUtils.equals(floatArray30, floatArray78);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertArrayEquals(floatArray17, new float[] { 97.0f, 0.0f, 32.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 97.0f + "'", float19 == 97.0f);
        org.junit.Assert.assertNotNull(floatArray21);
        org.junit.Assert.assertArrayEquals(floatArray21, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray30);
        org.junit.Assert.assertArrayEquals(floatArray30, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + (-1.0f) + "'", float31 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray38);
        org.junit.Assert.assertArrayEquals(floatArray38, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-1.0f) + "'", float39 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + 100.0f + "'", float40 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray45);
        org.junit.Assert.assertArrayEquals(floatArray45, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + (-1.0f) + "'", float46 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + 100.0f + "'", float47 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 100.0f + "'", float49 == 100.0f);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + (-1.0f) + "'", float50 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 100.0f + "'", float52 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(floatArray55);
        org.junit.Assert.assertArrayEquals(floatArray55, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + 10.0f + "'", float56 == 10.0f);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + 10.0f + "'", float57 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray64);
        org.junit.Assert.assertArrayEquals(floatArray64, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + (-1.0f) + "'", float65 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 100.0f + "'", float67 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertArrayEquals(floatArray72, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float73 + "' != '" + (-1.0f) + "'", float73 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 100.0f + "'", float75 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray78);
        org.junit.Assert.assertArrayEquals(floatArray78, new float[] { 97.0f, 97.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 100, 0.0d, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '4', (long) (byte) 10, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 97, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
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
        int int26 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int int27 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int[] intArray29 = new int[] { (short) -1 };
        int int30 = org.apache.commons.lang.math.NumberUtils.min(intArray29);
        int[] intArray32 = new int[] { (short) -1 };
        int int33 = org.apache.commons.lang.math.NumberUtils.min(intArray32);
        boolean boolean34 = org.apache.commons.lang.math.NumberUtils.equals(intArray29, intArray32);
        int[] intArray36 = new int[] { (short) -1 };
        int int37 = org.apache.commons.lang.math.NumberUtils.min(intArray36);
        int[] intArray39 = new int[] { (short) -1 };
        int int40 = org.apache.commons.lang.math.NumberUtils.min(intArray39);
        boolean boolean41 = org.apache.commons.lang.math.NumberUtils.equals(intArray36, intArray39);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(intArray32, intArray36);
        int[] intArray44 = new int[] { (short) -1 };
        int int45 = org.apache.commons.lang.math.NumberUtils.min(intArray44);
        int[] intArray47 = new int[] { (short) -1 };
        int int48 = org.apache.commons.lang.math.NumberUtils.min(intArray47);
        boolean boolean49 = org.apache.commons.lang.math.NumberUtils.equals(intArray44, intArray47);
        boolean boolean50 = org.apache.commons.lang.math.NumberUtils.equals(intArray36, intArray44);
        int int51 = org.apache.commons.lang.math.NumberUtils.min(intArray44);
        int[] intArray52 = null;
        int[] intArray54 = new int[] { (short) -1 };
        int int55 = org.apache.commons.lang.math.NumberUtils.min(intArray54);
        int[] intArray57 = new int[] { (short) -1 };
        int int58 = org.apache.commons.lang.math.NumberUtils.min(intArray57);
        boolean boolean59 = org.apache.commons.lang.math.NumberUtils.equals(intArray54, intArray57);
        int[] intArray61 = new int[] { (short) -1 };
        int int62 = org.apache.commons.lang.math.NumberUtils.min(intArray61);
        int[] intArray64 = new int[] { (short) -1 };
        int int65 = org.apache.commons.lang.math.NumberUtils.min(intArray64);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(intArray61, intArray64);
        boolean boolean67 = org.apache.commons.lang.math.NumberUtils.equals(intArray57, intArray61);
        int int68 = org.apache.commons.lang.math.NumberUtils.max(intArray61);
        int int69 = org.apache.commons.lang.math.NumberUtils.max(intArray61);
        boolean boolean70 = org.apache.commons.lang.math.NumberUtils.equals(intArray52, intArray61);
        int int71 = org.apache.commons.lang.math.NumberUtils.max(intArray61);
        boolean boolean72 = org.apache.commons.lang.math.NumberUtils.equals(intArray44, intArray61);
        boolean boolean73 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray44);
        int int74 = org.apache.commons.lang.math.NumberUtils.min(intArray44);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertArrayEquals(intArray54, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertArrayEquals(intArray57, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertArrayEquals(intArray61, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertArrayEquals(intArray64, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 10, (long) (byte) 10, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
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
        long long83 = org.apache.commons.lang.math.NumberUtils.max(longArray47);
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
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(52.0f, 52.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
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
        double double25 = org.apache.commons.lang.math.NumberUtils.min(doubleArray16);
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
        double double50 = org.apache.commons.lang.math.NumberUtils.min(doubleArray31);
        double double51 = org.apache.commons.lang.math.NumberUtils.max(doubleArray31);
        double double52 = org.apache.commons.lang.math.NumberUtils.max(doubleArray31);
        boolean boolean53 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray16, doubleArray31);
        java.lang.Class<?> wildcardClass54 = doubleArray31.getClass();
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
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 52.0d + "'", double51 == 52.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 52.0d + "'", double52 == 52.0d);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32, 100.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 10, (long) (short) 100, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 52L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
        long long23 = org.apache.commons.lang.math.NumberUtils.max(longArray21);
        long[] longArray25 = new long[] { 0L };
        long long26 = org.apache.commons.lang.math.NumberUtils.max(longArray25);
        long[] longArray28 = new long[] { (byte) 1 };
        boolean boolean29 = org.apache.commons.lang.math.NumberUtils.equals(longArray25, longArray28);
        boolean boolean30 = org.apache.commons.lang.math.NumberUtils.equals(longArray21, longArray28);
        long long31 = org.apache.commons.lang.math.NumberUtils.min(longArray21);
        long long32 = org.apache.commons.lang.math.NumberUtils.max(longArray21);
        long[] longArray34 = new long[] { 0L };
        long long35 = org.apache.commons.lang.math.NumberUtils.max(longArray34);
        long[] longArray37 = new long[] { (byte) 1 };
        boolean boolean38 = org.apache.commons.lang.math.NumberUtils.equals(longArray34, longArray37);
        long long39 = org.apache.commons.lang.math.NumberUtils.min(longArray37);
        boolean boolean40 = org.apache.commons.lang.math.NumberUtils.equals(longArray21, longArray37);
        long long41 = org.apache.commons.lang.math.NumberUtils.min(longArray21);
        long long42 = org.apache.commons.lang.math.NumberUtils.max(longArray21);
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
        long long57 = org.apache.commons.lang.math.NumberUtils.min(longArray47);
        long long58 = org.apache.commons.lang.math.NumberUtils.max(longArray47);
        long[] longArray60 = new long[] { 0L };
        long long61 = org.apache.commons.lang.math.NumberUtils.max(longArray60);
        long[] longArray63 = new long[] { (byte) 1 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(longArray60, longArray63);
        long long65 = org.apache.commons.lang.math.NumberUtils.min(longArray63);
        boolean boolean66 = org.apache.commons.lang.math.NumberUtils.equals(longArray47, longArray63);
        long long67 = org.apache.commons.lang.math.NumberUtils.min(longArray47);
        boolean boolean68 = org.apache.commons.lang.math.NumberUtils.equals(longArray21, longArray47);
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray47);
        long long70 = org.apache.commons.lang.math.NumberUtils.max(longArray14);
        long[] longArray72 = new long[] { 0L };
        long long73 = org.apache.commons.lang.math.NumberUtils.max(longArray72);
        long[] longArray75 = new long[] { (byte) 1 };
        boolean boolean76 = org.apache.commons.lang.math.NumberUtils.equals(longArray72, longArray75);
        long long77 = org.apache.commons.lang.math.NumberUtils.max(longArray75);
        long[] longArray79 = new long[] { 0L };
        long long80 = org.apache.commons.lang.math.NumberUtils.max(longArray79);
        long[] longArray82 = new long[] { (byte) 1 };
        boolean boolean83 = org.apache.commons.lang.math.NumberUtils.equals(longArray79, longArray82);
        boolean boolean84 = org.apache.commons.lang.math.NumberUtils.equals(longArray75, longArray82);
        long long85 = org.apache.commons.lang.math.NumberUtils.min(longArray75);
        long long86 = org.apache.commons.lang.math.NumberUtils.max(longArray75);
        long[] longArray88 = new long[] { 0L };
        long long89 = org.apache.commons.lang.math.NumberUtils.max(longArray88);
        long[] longArray91 = new long[] { (byte) 1 };
        boolean boolean92 = org.apache.commons.lang.math.NumberUtils.equals(longArray88, longArray91);
        long long93 = org.apache.commons.lang.math.NumberUtils.min(longArray91);
        boolean boolean94 = org.apache.commons.lang.math.NumberUtils.equals(longArray75, longArray91);
        boolean boolean95 = org.apache.commons.lang.math.NumberUtils.equals(longArray14, longArray91);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1L + "'", long31 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNotNull(longArray34);
        org.junit.Assert.assertArrayEquals(longArray34, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(longArray37);
        org.junit.Assert.assertArrayEquals(longArray37, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1L + "'", long39 == 1L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1L + "'", long41 == 1L);
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
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1L + "'", long57 == 1L);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 1L + "'", long58 == 1L);
        org.junit.Assert.assertNotNull(longArray60);
        org.junit.Assert.assertArrayEquals(longArray60, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertNotNull(longArray63);
        org.junit.Assert.assertArrayEquals(longArray63, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 1L + "'", long65 == 1L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 1L + "'", long67 == 1L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
        org.junit.Assert.assertNotNull(longArray72);
        org.junit.Assert.assertArrayEquals(longArray72, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertNotNull(longArray75);
        org.junit.Assert.assertArrayEquals(longArray75, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 1L + "'", long77 == 1L);
        org.junit.Assert.assertNotNull(longArray79);
        org.junit.Assert.assertArrayEquals(longArray79, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNotNull(longArray82);
        org.junit.Assert.assertArrayEquals(longArray82, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 1L + "'", long85 == 1L);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + 1L + "'", long86 == 1L);
        org.junit.Assert.assertNotNull(longArray88);
        org.junit.Assert.assertArrayEquals(longArray88, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long89 + "' != '" + 0L + "'", long89 == 0L);
        org.junit.Assert.assertNotNull(longArray91);
        org.junit.Assert.assertArrayEquals(longArray91, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + long93 + "' != '" + 1L + "'", long93 == 1L);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
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
        short short87 = org.apache.commons.lang.math.NumberUtils.min(shortArray80);
        short short88 = org.apache.commons.lang.math.NumberUtils.max(shortArray80);
        short short89 = org.apache.commons.lang.math.NumberUtils.min(shortArray80);
        boolean boolean90 = org.apache.commons.lang.math.NumberUtils.equals(shortArray23, shortArray80);
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
        org.junit.Assert.assertTrue("'" + short87 + "' != '" + (short) 100 + "'", short87 == (short) 100);
        org.junit.Assert.assertTrue("'" + short88 + "' != '" + (short) 100 + "'", short88 == (short) 100);
        org.junit.Assert.assertTrue("'" + short89 + "' != '" + (short) 100 + "'", short89 == (short) 100);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((-1.0f), (float) 35, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1L), (double) (short) 100, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((-1), (int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((-1.0d), (double) 97, (double) 32L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
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
        float[] floatArray37 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float38 = org.apache.commons.lang.math.NumberUtils.min(floatArray37);
        float float39 = org.apache.commons.lang.math.NumberUtils.max(floatArray37);
        float float40 = org.apache.commons.lang.math.NumberUtils.min(floatArray37);
        float float41 = org.apache.commons.lang.math.NumberUtils.min(floatArray37);
        boolean boolean42 = org.apache.commons.lang.math.NumberUtils.equals(floatArray11, floatArray37);
        float float43 = org.apache.commons.lang.math.NumberUtils.max(floatArray11);
        float float44 = org.apache.commons.lang.math.NumberUtils.max(floatArray11);
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
        org.junit.Assert.assertNotNull(floatArray37);
        org.junit.Assert.assertArrayEquals(floatArray37, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-1.0f) + "'", float38 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 100.0f + "'", float39 == 100.0f);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + (-1.0f) + "'", float41 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 100.0f + "'", float43 == 100.0f);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 100.0f + "'", float44 == 100.0f);
    }
}

