package org.apache.commons.lang.math;

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang.math.NumberUtils.createBigInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang.math.NumberUtils.createLong("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, (double) 1L, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.Integer int0 = org.apache.commons.lang.math.NumberUtils.INTEGER_ONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang.math.NumberUtils.createBigInteger("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang.math.NumberUtils.createNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.Short short0 = org.apache.commons.lang.math.NumberUtils.SHORT_MINUS_ONE;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) -1 + "'", short0 == (short) -1);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang.math.NumberUtils.createBigDecimal("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        double double1 = org.apache.commons.lang.math.NumberUtils.toDouble("");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 0, 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        float float1 = org.apache.commons.lang.math.NumberUtils.toFloat("");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.Integer int0 = org.apache.commons.lang.math.NumberUtils.INTEGER_MINUS_ONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.DOUBLE_MINUS_ONE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + (-1.0d) + "'", double0 == (-1.0d));
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100L, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, (double) 0L, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.Byte byte0 = org.apache.commons.lang.math.NumberUtils.BYTE_ONE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 1 + "'", byte0 == (byte) 1);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 0, (float) (short) 0, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) 1, (float) (byte) 0, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 0, (long) 100, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.lang.Short short0 = org.apache.commons.lang.math.NumberUtils.SHORT_ONE;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 1 + "'", short0 == (short) 1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.Float float0 = org.apache.commons.lang.math.NumberUtils.FLOAT_ONE;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.DOUBLE_ZERO;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (-1L), (float) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        java.lang.Class<?> wildcardClass3 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang.math.NumberUtils.createInteger("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length string");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.Short short0 = org.apache.commons.lang.math.NumberUtils.SHORT_ZERO;
        org.junit.Assert.assertTrue("'" + short0 + "' != '" + (short) 0 + "'", short0 == (short) 0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang.math.NumberUtils.createLong("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.Long long0 = org.apache.commons.lang.math.NumberUtils.LONG_MINUS_ONE;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + (-1L) + "'", long0 == (-1L));
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 100, (float) 10, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int int1 = org.apache.commons.lang.math.NumberUtils.stringToInt("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) '#', 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.Integer int0 = org.apache.commons.lang.math.NumberUtils.INTEGER_ZERO;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.Byte byte0 = org.apache.commons.lang.math.NumberUtils.BYTE_MINUS_ONE;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) -1 + "'", byte0 == (byte) -1);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(0.0f, (float) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            short short4 = org.apache.commons.lang.math.NumberUtils.max(shortArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        boolean boolean1 = org.apache.commons.lang.math.NumberUtils.isDigits("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) '4', (double) 10.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang.math.NumberUtils.createFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.lang.math.NumberUtils numberUtils0 = new org.apache.commons.lang.math.NumberUtils();
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.Double double0 = org.apache.commons.lang.math.NumberUtils.DOUBLE_ONE;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (byte) 10, (double) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        long long1 = org.apache.commons.lang.math.NumberUtils.toLong("hi!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.Float float0 = org.apache.commons.lang.math.NumberUtils.FLOAT_MINUS_ONE;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + (-1.0f) + "'", float0 == (-1.0f));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1L, (double) 10, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang.math.NumberUtils.createDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        double double1 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.Long long0 = org.apache.commons.lang.math.NumberUtils.LONG_ONE;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0 == 1L);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        short[] shortArray5 = new short[] { (short) 100 };
        short[] shortArray6 = new short[] {};
        boolean boolean7 = org.apache.commons.lang.math.NumberUtils.equals(shortArray5, shortArray6);
        boolean boolean8 = org.apache.commons.lang.math.NumberUtils.equals(shortArray2, shortArray5);
        java.lang.Class<?> wildcardClass9 = shortArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        boolean boolean1 = org.apache.commons.lang.math.NumberUtils.isNumber("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang.math.NumberUtils.createInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.Byte byte0 = org.apache.commons.lang.math.NumberUtils.BYTE_ZERO;
        org.junit.Assert.assertTrue("'" + byte0 + "' != '" + (byte) 0 + "'", byte0 == (byte) 0);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double[] doubleArray14 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray18 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean19 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray14, doubleArray18);
        boolean boolean20 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray14);
        java.lang.Class<?> wildcardClass21 = doubleArray4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.Long long0 = org.apache.commons.lang.math.NumberUtils.LONG_ZERO;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 0L + "'", long0 == 0L);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang.math.NumberUtils.createBigDecimal("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Character h is neither a decimal digit number, decimal point, nor \"e\" notation exponential mark.");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(1, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang.math.NumberUtils.createFloat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        float float1 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = org.apache.commons.lang.math.NumberUtils.max(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int int1 = org.apache.commons.lang.math.NumberUtils.toInt("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 0, (long) (-1), (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(100.0d, (double) (short) 1, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
        java.lang.Class<?> wildcardClass14 = shortArray10.getClass();
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
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang.math.NumberUtils.createDouble("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        java.lang.Class<?> wildcardClass11 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray9 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, (float) (short) 10, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(1L, (long) (byte) 10, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang.math.NumberUtils.createNumber("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (short) 100, 100.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang.math.NumberUtils.max(longArray1);
        long[] longArray4 = new long[] { (byte) 1 };
        boolean boolean5 = org.apache.commons.lang.math.NumberUtils.equals(longArray1, longArray4);
        java.lang.Class<?> wildcardClass6 = longArray1.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertArrayEquals(longArray1, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertArrayEquals(longArray4, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        long long1 = org.apache.commons.lang.math.NumberUtils.toLong("");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.Float float0 = org.apache.commons.lang.math.NumberUtils.FLOAT_ZERO;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) -1, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10.0f, (double) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 1, (long) 'a', (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) ' ', (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 0, (float) 0, (float) 32);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100L, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1.0f, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        boolean boolean1 = org.apache.commons.lang.math.NumberUtils.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) 10L, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        // The following exception was thrown during execution in test generation
        try {
            short short21 = org.apache.commons.lang.math.NumberUtils.min(shortArray19);
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
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 10L, (double) 10L, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 1L, (float) ' ', (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 0.0f, (double) 100.0f, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1.0f), (double) (byte) 100, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray9 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
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
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) -1, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        int int1 = org.apache.commons.lang.math.NumberUtils.toInt("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        boolean boolean1 = org.apache.commons.lang.math.NumberUtils.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) '#', (double) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(100.0d, (double) (-1), (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
        java.lang.Class<?> wildcardClass21 = shortArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) -1, (double) (byte) 100, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 100, (short) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(10.0f, (float) 10, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) -1, (long) (byte) 1, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 10, (double) (short) 0, 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) ' ', (long) 100, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        int int1 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) (byte) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1.0f), (double) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray11 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float12 = org.apache.commons.lang.math.NumberUtils.min(floatArray11);
        float float13 = org.apache.commons.lang.math.NumberUtils.max(floatArray11);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray11);
        java.lang.Class<?> wildcardClass15 = floatArray4.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) -1, 97, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 'a', (long) (short) -1, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) 'a', (int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) -1, (float) (short) 100, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) (byte) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 52, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 97, (float) (short) -1, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 1, (long) '4', (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1.0f), (double) 52L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 0, (-1), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 10, (long) (short) -1, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 35.0f, (double) 10L, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 32, (double) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, (long) 0, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.lang.math.NumberUtils.min(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '4', (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 100, (double) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(100L, 52L, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 1, (short) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 100, 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(100.0f, (float) (byte) -1, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 100, (long) (short) 100, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 1.0f, (double) '#', (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(52, (int) '4', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 100L, (float) 10L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 10.0f, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (short) -1, (float) 10, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (short) 10, (float) 32, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", 35.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 'a', (double) 0L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (long) (short) -1, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float[] floatArray7 = new float[] { (byte) 10 };
        float float8 = org.apache.commons.lang.math.NumberUtils.min(floatArray7);
        float float9 = org.apache.commons.lang.math.NumberUtils.max(floatArray7);
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray7);
        java.lang.Class<?> wildcardClass11 = floatArray4.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNotNull(floatArray7);
        org.junit.Assert.assertArrayEquals(floatArray7, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) (byte) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) -1, 97L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = org.apache.commons.lang.math.NumberUtils.min(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang.math.NumberUtils.max(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) (byte) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((-1), 100, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((-1), (int) (byte) 100, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(1.0d, (double) (-1.0f), (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        java.lang.Class<?> wildcardClass38 = byteArray26.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 0, (short) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) '#', (long) (byte) 10, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 100, (double) 35L, (double) 52);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 0, (short) (byte) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(32, 0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(0L, (long) 10, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 10, 97L, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 1.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 10, 0L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(97.0d, (double) 0.0f, (double) 97L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang.math.NumberUtils.max(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) ' ', (float) 32, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        short[] shortArray1 = new short[] { (short) 100 };
        short[] shortArray2 = new short[] {};
        boolean boolean3 = org.apache.commons.lang.math.NumberUtils.equals(shortArray1, shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            short short4 = org.apache.commons.lang.math.NumberUtils.min(shortArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertArrayEquals(shortArray1, new short[] { (short) 100 });
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertArrayEquals(shortArray2, new short[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) 100, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        float[] floatArray1 = new float[] { (byte) 10 };
        float float2 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
        float float3 = org.apache.commons.lang.math.NumberUtils.max(floatArray1);
        java.lang.Class<?> wildcardClass4 = floatArray1.getClass();
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(10.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        short short20 = org.apache.commons.lang.math.NumberUtils.max(shortArray5);
        java.lang.Class<?> wildcardClass21 = shortArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 97L, (double) (short) 1, (double) 97);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(1.0d, (double) 100.0f, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        float[] floatArray1 = new float[] { (byte) 10 };
        float float2 = org.apache.commons.lang.math.NumberUtils.min(floatArray1);
        float float3 = org.apache.commons.lang.math.NumberUtils.max(floatArray1);
        float[] floatArray10 = new float[] { 10L, 100L, 10.0f, (-1.0f), (short) 100, 1 };
        float float11 = org.apache.commons.lang.math.NumberUtils.min(floatArray10);
        boolean boolean12 = org.apache.commons.lang.math.NumberUtils.equals(floatArray1, floatArray10);
        float float13 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        float float14 = org.apache.commons.lang.math.NumberUtils.max(floatArray10);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertArrayEquals(floatArray1, new float[] { 10.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertNotNull(floatArray10);
        org.junit.Assert.assertArrayEquals(floatArray10, new float[] { 10.0f, 100.0f, 10.0f, (-1.0f), 100.0f, 1.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 1, (int) (short) -1, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        long[] longArray3 = new long[] { 97L, 1L, (-1) };
        long[] longArray5 = new long[] { 0L };
        long long6 = org.apache.commons.lang.math.NumberUtils.max(longArray5);
        long[] longArray8 = new long[] { (byte) 1 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(longArray5, longArray8);
        long long10 = org.apache.commons.lang.math.NumberUtils.max(longArray8);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(longArray3, longArray8);
        java.lang.Class<?> wildcardClass12 = longArray8.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertArrayEquals(longArray3, new long[] { 97L, 1L, (-1L) });
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertArrayEquals(longArray5, new long[] { 0L });
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(longArray8);
        org.junit.Assert.assertArrayEquals(longArray8, new long[] { 1L });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        long long23 = org.apache.commons.lang.math.NumberUtils.min(longArray12);
        long long24 = org.apache.commons.lang.math.NumberUtils.min(longArray12);
        java.lang.Class<?> wildcardClass25 = longArray12.getClass();
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
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 52L, 0.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang.math.NumberUtils.min(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 100, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", 35.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) (byte) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 52, (long) (byte) -1, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 100L, (double) (-1), (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 0, (float) (byte) -1, 97.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 10, (short) (byte) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 32.0f, (double) 97, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 0, (float) 10, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (short) 100, (double) 32.0f, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((-1), (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(100L, (long) (byte) 10, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 52, (long) 0, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(byteArray2, byteArray9);
        byte byte11 = org.apache.commons.lang.math.NumberUtils.max(byteArray9);
        java.lang.Class<?> wildcardClass12 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 1, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(100L, (long) 97, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(100L, (long) 1, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        java.lang.Class<?> wildcardClass23 = longArray4.getClass();
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 0, (double) 100L, (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 52L, (float) 0L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 1, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int[] intArray4 = new int[] { (short) -1 };
        int int5 = org.apache.commons.lang.math.NumberUtils.min(intArray4);
        boolean boolean6 = org.apache.commons.lang.math.NumberUtils.equals(intArray1, intArray4);
        int int7 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        int int8 = org.apache.commons.lang.math.NumberUtils.min(intArray1);
        int int9 = org.apache.commons.lang.math.NumberUtils.max(intArray1);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) (byte) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 52, (float) 35L, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(97, (int) (short) 100, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 97, (float) 100L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, (float) (short) 0, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, 52.0f, 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) (byte) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1.0f), 0.0d, (double) 32);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray9 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean10 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray5, doubleArray9);
        boolean boolean11 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray0, doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = org.apache.commons.lang.math.NumberUtils.max(doubleArray0);
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
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 10, 1L, 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 10, 52, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) (byte) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 0, 52L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 32, (double) 100.0f, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 10, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (short) -1, (double) (short) 10, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 0L, 32.0f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 0, (long) 100, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) -1, (double) (-1), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '#', (int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 1, (long) 0, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(1L, (long) '4', 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(97, (int) (byte) 10, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("hi!", (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 100, (float) 97L, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '4', (-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '4', (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(97.0f, (float) 35L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, (float) (-1L), 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        // The following exception was thrown during execution in test generation
        try {
            short short21 = org.apache.commons.lang.math.NumberUtils.max(shortArray19);
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
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 97L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(1.0f, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang.math.NumberUtils.min(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) '#', (int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 10, (long) '#', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, (float) 1L, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(1.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 35L, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) -1, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) ' ', (float) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100.0f, (double) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 1, 0L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 100, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100.0f, (double) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(97, (int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 1, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(0, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1), (-1.0d), (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 100L, (double) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) (byte) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        int int3 = org.apache.commons.lang.math.NumberUtils.max(97, 97, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray11 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float12 = org.apache.commons.lang.math.NumberUtils.min(floatArray11);
        float float13 = org.apache.commons.lang.math.NumberUtils.max(floatArray11);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray11);
        java.lang.Class<?> wildcardClass15 = floatArray11.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 1, (long) 100, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(35.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 52L, (float) 32L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        java.lang.Class<?> wildcardClass90 = doubleArray8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) 'a', 10L, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 35.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.commons.lang.math.NumberUtils.min(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 10, (-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0f, (float) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(100.0f, 100.0f, 35.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) '4', (double) 52, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 32, (float) 0L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (-1), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 100, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) (byte) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (short) 100, 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 0.0f, (double) 10, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) 100, (double) 97.0f, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((-1.0d), (double) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(1.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", (double) 32L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((-1.0f), (float) (short) -1, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (byte) 10, 35L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
            short short26 = org.apache.commons.lang.math.NumberUtils.min(shortArray23);
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
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1L), (double) 35.0f, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((-1L), (long) (short) -1, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        double double3 = org.apache.commons.lang.math.NumberUtils.max(0.0d, (double) 0, 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 35L, (double) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        java.lang.Class<?> wildcardClass22 = shortArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) 35L, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 10, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 52, 52.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) 0, (float) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 100, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (-1L), (float) ' ', (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) 97, (double) 32L, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) -1, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        float float3 = org.apache.commons.lang.math.NumberUtils.min(52.0f, (float) (-1L), 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("", 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) 0, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '#', (int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        double[] doubleArray4 = new double[] { (-1.0f), '4', (byte) 10, 0.0d };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1, (byte) 100 };
        boolean boolean9 = org.apache.commons.lang.math.NumberUtils.equals(doubleArray4, doubleArray8);
        double double10 = org.apache.commons.lang.math.NumberUtils.max(doubleArray8);
        double double11 = org.apache.commons.lang.math.NumberUtils.min(doubleArray8);
        java.lang.Class<?> wildcardClass12 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) -1, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(0L, 0L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 35L, (float) 1L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(32L, (long) '#', (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        long long2 = org.apache.commons.lang.math.NumberUtils.toLong("", (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) '4', (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(97L, (long) (short) 10, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        float[] floatArray4 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float5 = org.apache.commons.lang.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang.math.NumberUtils.max(floatArray4);
        float[] floatArray11 = new float[] { 1, (-1), (byte) 10, (byte) 100 };
        float float12 = org.apache.commons.lang.math.NumberUtils.min(floatArray11);
        float float13 = org.apache.commons.lang.math.NumberUtils.max(floatArray11);
        boolean boolean14 = org.apache.commons.lang.math.NumberUtils.equals(floatArray4, floatArray11);
        float float15 = org.apache.commons.lang.math.NumberUtils.max(floatArray11);
        float float16 = org.apache.commons.lang.math.NumberUtils.min(floatArray11);
        java.lang.Class<?> wildcardClass17 = floatArray11.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertArrayEquals(floatArray4, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertNotNull(floatArray11);
        org.junit.Assert.assertArrayEquals(floatArray11, new float[] { 1.0f, (-1.0f), 10.0f, 100.0f }, (float) 1.0E-15);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((double) (short) -1, (double) 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) (short) 1, 0L, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(32.0f, (float) '4', (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) (byte) 0, (float) (-1L), 32.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) 'a', 32, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) (byte) 10, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        long long3 = org.apache.commons.lang.math.NumberUtils.max(97L, (long) 100, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(97, (-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(10, (int) (byte) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) 52, (float) (-1L), (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) 97, (double) 52.0f, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, (-1), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        float float3 = org.apache.commons.lang.math.NumberUtils.max((float) (byte) 1, (-1.0f), (float) 52L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) 0, (long) (short) 0, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 1, 97L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        long long3 = org.apache.commons.lang.math.NumberUtils.min((long) 35, (long) 0, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 97L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) -1, (short) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        int int22 = org.apache.commons.lang.math.NumberUtils.min(intArray16);
        int int23 = org.apache.commons.lang.math.NumberUtils.max(intArray16);
        boolean boolean24 = org.apache.commons.lang.math.NumberUtils.equals(intArray8, intArray16);
        int int25 = org.apache.commons.lang.math.NumberUtils.max(intArray8);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        long long3 = org.apache.commons.lang.math.NumberUtils.min(52L, (long) 97, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((double) (byte) -1, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 10, (short) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        java.lang.Class<?> wildcardClass37 = shortArray28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (byte) 10, 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        int int3 = org.apache.commons.lang.math.NumberUtils.min((int) (short) 1, (-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 100, 97, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        byte[] byteArray41 = null;
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray51 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean52 = org.apache.commons.lang.math.NumberUtils.equals(byteArray44, byteArray51);
        byte byte53 = org.apache.commons.lang.math.NumberUtils.min(byteArray51);
        byte[] byteArray56 = new byte[] { (byte) -1, (byte) 0 };
        byte[] byteArray63 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean64 = org.apache.commons.lang.math.NumberUtils.equals(byteArray56, byteArray63);
        boolean boolean65 = org.apache.commons.lang.math.NumberUtils.equals(byteArray51, byteArray63);
        byte byte66 = org.apache.commons.lang.math.NumberUtils.max(byteArray63);
        byte[] byteArray68 = new byte[] { (byte) 100 };
        boolean boolean69 = org.apache.commons.lang.math.NumberUtils.equals(byteArray63, byteArray68);
        byte byte70 = org.apache.commons.lang.math.NumberUtils.max(byteArray68);
        byte[] byteArray77 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        boolean boolean78 = org.apache.commons.lang.math.NumberUtils.equals(byteArray68, byteArray77);
        byte byte79 = org.apache.commons.lang.math.NumberUtils.min(byteArray68);
        byte byte80 = org.apache.commons.lang.math.NumberUtils.min(byteArray68);
        boolean boolean81 = org.apache.commons.lang.math.NumberUtils.equals(byteArray41, byteArray68);
        boolean boolean82 = org.apache.commons.lang.math.NumberUtils.equals(byteArray0, byteArray41);
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
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + byte53 + "' != '" + (byte) -1 + "'", byte53 == (byte) -1);
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + byte66 + "' != '" + (byte) 100 + "'", byte66 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + byte70 + "' != '" + (byte) 100 + "'", byte70 == (byte) 100);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + byte79 + "' != '" + (byte) 100 + "'", byte79 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte80 + "' != '" + (byte) 100 + "'", byte80 == (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.max((byte) 0, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(97, (int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        int int3 = org.apache.commons.lang.math.NumberUtils.max((int) (byte) 1, 35, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        short short3 = org.apache.commons.lang.math.NumberUtils.min((short) (byte) 1, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare((float) (byte) 0, 97.0f);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (byte) 0, (long) (short) 0, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((-1.0d), (double) (-1L), (double) 32L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 100, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) ' ', 0L, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 100L, (float) (short) -1, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("hi!", (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        int int3 = org.apache.commons.lang.math.NumberUtils.min(1, (int) (short) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        java.lang.Class<?> wildcardClass35 = shortArray28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        int int2 = org.apache.commons.lang.math.NumberUtils.compare(0.0d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) 1, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(97.0f, (float) (byte) 10, (float) 35L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        int int2 = org.apache.commons.lang.math.NumberUtils.stringToInt("", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        double double3 = org.apache.commons.lang.math.NumberUtils.min((-1.0d), 35.0d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        double double3 = org.apache.commons.lang.math.NumberUtils.min(0.0d, (double) (-1.0f), (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        long long3 = org.apache.commons.lang.math.NumberUtils.max((long) (short) -1, (long) '4', (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
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
        java.lang.Class<?> wildcardClass60 = shortArray44.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        float float3 = org.apache.commons.lang.math.NumberUtils.min((float) 0L, 32.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        double double3 = org.apache.commons.lang.math.NumberUtils.max((double) (-1L), (double) 1L, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        byte byte3 = org.apache.commons.lang.math.NumberUtils.min((byte) -1, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        short short3 = org.apache.commons.lang.math.NumberUtils.max((short) 1, (short) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        int int2 = org.apache.commons.lang.math.NumberUtils.toInt("hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        double double2 = org.apache.commons.lang.math.NumberUtils.toDouble("hi!", (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        float float2 = org.apache.commons.lang.math.NumberUtils.toFloat("", (float) 52L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        float float3 = org.apache.commons.lang.math.NumberUtils.max(0.0f, (float) (byte) 1, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }
}

