package org.apache.commons.codec.binary;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        java.lang.Class<?> wildcardClass2 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = base64_1.encode((java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.math.BigInteger bigInteger0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: encodeInteger called with null parameter");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_1.encode(byteArray5, 0, 0);
        byte[] byteArray9 = new byte[] {};
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray10, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) 0, byteArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_4.encode(byteArray8, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray8, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray6);
        java.lang.Class<?> wildcardClass9 = byteArray8.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_2.encode(byteArray6, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray6);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_12.encode(byteArray16, 0, 0);
        int int22 = base64_10.readResults(byteArray16, 0, (int) (short) 10);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray29);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray29);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray29);
        byte[] byteArray33 = base64_10.decode(byteArray29);
        java.lang.Class<?> wildcardClass34 = base64_10.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) (short) 10, byteArray9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [QUFvS0Nnb0I]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) -1 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 90, (byte) 65, (byte) 111, (byte) 66, (byte) 65, (byte) 102, (byte) 56 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 87, (byte) 107, (byte) 70, (byte) 118, (byte) 81, (byte) 107, (byte) 70, (byte) 109, (byte) 79, (byte) 65 });
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_4.encode(byteArray8, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray8);
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_14.encode(byteArray18, 0, 0);
        int int24 = base64_12.readResults(byteArray18, 0, (int) (short) 10);
        int int27 = base64_1.readResults(byteArray18, 10, 0);
        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.decode(byteArray34, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) -1);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_3.encode(byteArray7, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_15.encode(byteArray19, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray19);
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_25.encode(byteArray29, 0, 0);
        int int35 = base64_23.readResults(byteArray29, 0, (int) (short) 10);
        int int38 = base64_12.readResults(byteArray29, 10, 0);
        int int41 = base64_3.readResults(byteArray29, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = base64_1.encode((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_1.encode(byteArray5, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_13.encode(byteArray17, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray17);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_23.encode(byteArray27, 0, 0);
        int int33 = base64_21.readResults(byteArray27, 0, (int) (short) 10);
        int int36 = base64_10.readResults(byteArray27, 10, 0);
        int int39 = base64_1.readResults(byteArray27, (int) (short) 1, 0);
        java.math.BigInteger bigInteger40 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        java.lang.Class<?> wildcardClass41 = byteArray27.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        base64_0.decode(byteArray9, (int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass13 = byteArray9.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10);
        base64_2.decode(byteArray11, (int) (byte) 10, (int) ' ');
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray15, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61 });
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_1.encode(byteArray5, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_13.encode(byteArray17, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray17);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_23.encode(byteArray27, 0, 0);
        int int33 = base64_21.readResults(byteArray27, 0, (int) (short) 10);
        int int36 = base64_10.readResults(byteArray27, 10, 0);
        int int39 = base64_1.readResults(byteArray27, (int) (short) 1, 0);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray27);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) -1 });
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray7);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray10);
        int int14 = base64_1.readResults(byteArray11, (int) (short) 1, 0);
        boolean boolean15 = base64_1.isUrlSafe();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = base64_1.encode((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray10);
        int int14 = base64_1.readResults(byteArray11, (int) (short) 1, 0);
        boolean boolean15 = base64_1.isUrlSafe();
        java.lang.Class<?> wildcardClass16 = base64_1.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_2.encode(byteArray6, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray6);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_12.encode(byteArray16, 0, 0);
        int int22 = base64_10.readResults(byteArray16, 0, (int) (short) 10);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray29);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray29);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray29);
        byte[] byteArray33 = base64_10.decode(byteArray29);
        java.lang.Class<?> wildcardClass34 = byteArray33.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int int0 = org.apache.commons.codec.binary.Base64.CHUNK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 76 + "'", int0 == 76);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [QUFvS0Nnb0I]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        boolean boolean5 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray6);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray6);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray6);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray6);
        java.lang.Class<?> wildcardClass11 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray6);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray6);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray9);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_1.encode(byteArray5, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_13.encode(byteArray17, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray17);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_23.encode(byteArray27, 0, 0);
        int int33 = base64_21.readResults(byteArray27, 0, (int) (short) 10);
        int int36 = base64_10.readResults(byteArray27, 10, 0);
        int int39 = base64_1.readResults(byteArray27, (int) (short) 1, 0);
        java.math.BigInteger bigInteger40 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger40);
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger40);
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray42);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) -1 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) (short) 100, byteArray9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [ZAoBAf8]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 90, (byte) 65, (byte) 111, (byte) 66, (byte) 65, (byte) 102, (byte) 56 });
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) '4', byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [AAoKCgoB??]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_1.encode(byteArray5, 0, 0);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray5);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 95, (byte) 119, (byte) 111, (byte) 75 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 47, (byte) 119, (byte) 111, (byte) 75, (byte) 13, (byte) 10 });
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        base64_0.decode(byteArray9, (int) (byte) 10, (int) ' ');
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray23);
        int int27 = base64_14.readResults(byteArray24, (int) (short) 1, 0);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray24);
        byte[] byteArray29 = base64_0.decode(byteArray24);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107 });
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray6);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray6);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray6);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray6);
        boolean boolean12 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray11);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_2.encode(byteArray6, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray6);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_12.encode(byteArray16, 0, 0);
        int int22 = base64_10.readResults(byteArray16, 0, (int) (short) 10);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray29);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray29);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray29);
        byte[] byteArray33 = base64_10.decode(byteArray29);
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray29, false);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray35);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (short) 10, byteArray8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [AAoKCgoB]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((-1));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_2.encode(byteArray6, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray6);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray11);
        base64_10.encode(byteArray11, (int) (byte) 0, 0);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray22);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray22);
        boolean boolean26 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray22);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            base64_10.decode(byteArray22, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 100);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) 100 };
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, true);
        boolean boolean8 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray7);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 65, (byte) 87, (byte) 82, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 81, (byte) 86, (byte) 100, (byte) 83, (byte) 97, (byte) 119 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_2.encode(byteArray6, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_14.encode(byteArray18, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray18);
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_24.encode(byteArray28, 0, 0);
        int int34 = base64_22.readResults(byteArray28, 0, (int) (short) 10);
        int int37 = base64_11.readResults(byteArray28, 10, 0);
        int int40 = base64_2.readResults(byteArray28, (int) (short) 1, 0);
        java.math.BigInteger bigInteger41 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray28);
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger41);
        org.apache.commons.codec.binary.Base64 base64_44 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray42, true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) -1);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        base64_1.encode(byteArray10, (int) (byte) 0, (int) (short) 0);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, true, false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(100);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.isUrlSafe();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) 100 };
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray5);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 65, (byte) 87, (byte) 82, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 81, (byte) 86, (byte) 100, (byte) 83, (byte) 97, (byte) 119, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 65, (byte) 87, (byte) 82, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 81, (byte) 86, (byte) 100, (byte) 83, (byte) 97, (byte) 119, (byte) 61, (byte) 61 });
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray10);
        int int14 = base64_1.readResults(byteArray11, (int) (short) 1, 0);
        java.math.BigInteger bigInteger15 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger15);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger15);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger15);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger15);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_2.encode(byteArray6, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray6);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_12.encode(byteArray16, 0, 0);
        int int22 = base64_10.readResults(byteArray16, 0, (int) (short) 10);
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_24.encode(byteArray28, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = base64_10.encode((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_1.encode(byteArray5, 0, 0);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray5);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 95, (byte) 119, (byte) 111, (byte) 75 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1 });
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_1.encode(byteArray5, 0, 0);
        boolean boolean9 = base64_1.isUrlSafe();
        boolean boolean10 = base64_1.isUrlSafe();
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray11);
        int int16 = base64_1.readResults(byteArray11, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) 100 };
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 65, (byte) 87, (byte) 82, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 81, (byte) 86, (byte) 100, (byte) 83, (byte) 97, (byte) 119, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 81, (byte) 86, (byte) 100, (byte) 83, (byte) 97, (byte) 119, (byte) 61, (byte) 61 });
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray0);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray0, false);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray4);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_3.encode(byteArray7, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray7);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_13.encode(byteArray17, 0, 0);
        int int23 = base64_11.readResults(byteArray17, 0, (int) (short) 10);
        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray30);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray30);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray30);
        byte[] byteArray34 = base64_11.decode(byteArray30);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray30, false);
        org.apache.commons.codec.binary.Base64 base64_38 = new org.apache.commons.codec.binary.Base64(100, byteArray30, true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        base64_0.decode(byteArray9, (int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = base64_0.decode((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[]");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61 });
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107 });
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, true);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray8);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_1.encode(byteArray5, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_13.encode(byteArray17, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray17);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_23.encode(byteArray27, 0, 0);
        int int33 = base64_21.readResults(byteArray27, 0, (int) (short) 10);
        int int36 = base64_10.readResults(byteArray27, 10, 0);
        int int39 = base64_1.readResults(byteArray27, (int) (short) 1, 0);
        java.math.BigInteger bigInteger40 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger40);
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger40);
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger40);
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray43);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray1, true);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 13, (byte) 10 });
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_2.encode(byteArray6, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray6);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_12.encode(byteArray16, 0, 0);
        int int22 = base64_10.readResults(byteArray16, 0, (int) (short) 10);
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_25.encode(byteArray29, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray29);
        int int36 = base64_10.readResults(byteArray29, (int) 'a', 100);
        org.apache.commons.codec.binary.Base64 base64_38 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_38.encode(byteArray42, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_47 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_50 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray54 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_50.encode(byteArray54, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_58 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray54);
        org.apache.commons.codec.binary.Base64 base64_60 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray64 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_60.encode(byteArray64, 0, 0);
        int int70 = base64_58.readResults(byteArray64, 0, (int) (short) 10);
        int int73 = base64_47.readResults(byteArray64, 10, 0);
        int int76 = base64_38.readResults(byteArray64, (int) (short) 1, 0);
        int int79 = base64_10.readResults(byteArray64, 1, 1);
        boolean boolean80 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray64);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(100);
        boolean boolean2 = base64_1.hasData();
        byte[] byteArray9 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray9);
        base64_1.setInitialBuffer(byteArray11, (int) 'a', (int) (byte) 0);
        boolean boolean15 = base64_1.isUrlSafe();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(0, byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [QUFvS0Nnb0I]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray10);
        int int14 = base64_1.readResults(byteArray11, (int) (short) 1, 0);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = base64_1.encode(obj15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_1.encode(byteArray5, 0, 0);
        boolean boolean9 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray5);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, true, false);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 47, (byte) 119, (byte) 111, (byte) 75, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 47, (byte) 119, (byte) 111, (byte) 75 });
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean2 = base64_1.isUrlSafe();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        boolean boolean8 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray7);
        int int11 = base64_1.readResults(byteArray7, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_2.encode(byteArray6, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray6);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray11);
        base64_10.encode(byteArray11, (int) (byte) 0, 0);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray22);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray22);
        byte[] byteArray26 = base64_10.decode(byteArray25);
        byte[] byteArray27 = null;
        byte[] byteArray28 = base64_10.encode(byteArray27);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNull(byteArray28);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        base64_0.decode(byteArray9, (int) (byte) 10, (int) ' ');
        boolean boolean13 = base64_0.hasData();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean2 = base64_1.isUrlSafe();
        boolean boolean3 = base64_1.isUrlSafe();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(100);
        boolean boolean2 = base64_1.hasData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = base64_1.encode((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) -1 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray8);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 90, (byte) 65, (byte) 111, (byte) 66, (byte) 65, (byte) 102, (byte) 56 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 90, (byte) 65, (byte) 111, (byte) 66, (byte) 65, (byte) 102, (byte) 56 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 87, (byte) 107, (byte) 70, (byte) 118, (byte) 81, (byte) 107, (byte) 70, (byte) 109, (byte) 79, (byte) 65, (byte) 61, (byte) 61 });
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_1.encode(byteArray5, 0, 0);
        boolean boolean9 = base64_1.isUrlSafe();
        boolean boolean10 = base64_1.isUrlSafe();
        int int11 = base64_1.avail();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) 100);
        int int2 = base64_1.avail();
        boolean boolean3 = base64_1.isUrlSafe();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        byte[] byteArray0 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        boolean boolean2 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        byte[] byteArray0 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        java.lang.Class<?> wildcardClass2 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_4.encode(byteArray8, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray8);
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_14.encode(byteArray18, 0, 0);
        int int24 = base64_12.readResults(byteArray18, 0, (int) (short) 10);
        int int27 = base64_1.readResults(byteArray18, 10, 0);
        boolean boolean28 = base64_1.hasData();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        base64_0.decode(byteArray9, (int) (byte) 10, (int) ' ');
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray9);
        boolean boolean14 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray9);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        java.math.BigInteger bigInteger2 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 67, (byte) 118, (byte) 56, (byte) 75, (byte) 65, (byte) 81, (byte) 69 });
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray10);
        int int14 = base64_1.readResults(byteArray11, (int) (short) 1, 0);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        boolean boolean20 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray19);
        base64_1.setInitialBuffer(byteArray19, (int) (byte) 0, (int) (byte) 10);
        int int24 = base64_1.avail();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_4.encode(byteArray8, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray8);
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_14.encode(byteArray18, 0, 0);
        int int24 = base64_12.readResults(byteArray18, 0, (int) (short) 10);
        int int27 = base64_1.readResults(byteArray18, 10, 0);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray36 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray36);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray37);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray38);
        int int42 = base64_29.readResults(byteArray39, (int) (short) 1, 0);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        boolean boolean48 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray47);
        base64_29.setInitialBuffer(byteArray47, (int) (byte) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.decode(byteArray47, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107 });
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        java.math.BigInteger bigInteger2 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (short) 0, byteArray1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_2.encode(byteArray6, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray6);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray11);
        base64_10.encode(byteArray11, (int) (byte) 0, 0);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_17.encode(byteArray21, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_26 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_29.encode(byteArray33, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_37 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray33);
        org.apache.commons.codec.binary.Base64 base64_39 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_39.encode(byteArray43, 0, 0);
        int int49 = base64_37.readResults(byteArray43, 0, (int) (short) 10);
        int int52 = base64_26.readResults(byteArray43, 10, 0);
        int int55 = base64_17.readResults(byteArray43, (int) (short) 1, 0);
        java.math.BigInteger bigInteger56 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray43);
        byte[] byteArray57 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger56);
        byte[] byteArray58 = base64_10.decode(byteArray57);
        byte[] byteArray59 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray57);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) '4');
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        base64_0.decode(byteArray9, (int) (byte) 10, (int) ' ');
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray9);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray13);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61 });
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_1.encode(byteArray5, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_13.encode(byteArray17, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray17);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_23.encode(byteArray27, 0, 0);
        int int33 = base64_21.readResults(byteArray27, 0, (int) (short) 10);
        int int36 = base64_10.readResults(byteArray27, 10, 0);
        int int39 = base64_1.readResults(byteArray27, (int) (short) 1, 0);
        java.math.BigInteger bigInteger40 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger40);
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger40);
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray42);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_2.encode(byteArray6, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray6);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_12.encode(byteArray16, 0, 0);
        int int22 = base64_10.readResults(byteArray16, 0, (int) (short) 10);
        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray29);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray29);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray29);
        byte[] byteArray33 = base64_10.decode(byteArray29);
        byte[] byteArray35 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray33, false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_2.encode(byteArray6, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray6);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_12.encode(byteArray16, 0, 0);
        int int22 = base64_10.readResults(byteArray16, 0, (int) (short) 10);
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        boolean boolean28 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray27);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray27);
        java.math.BigInteger bigInteger31 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray30);
        byte[] byteArray32 = base64_10.encode(byteArray30);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(bigInteger31);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 78, (byte) 67, (byte) 103, (byte) 61, (byte) 61 });
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_2.encode(byteArray6, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_14.encode(byteArray18, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray18);
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_24.encode(byteArray28, 0, 0);
        int int34 = base64_22.readResults(byteArray28, 0, (int) (short) 10);
        int int37 = base64_11.readResults(byteArray28, 10, 0);
        int int40 = base64_2.readResults(byteArray28, (int) (short) 1, 0);
        java.math.BigInteger bigInteger41 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray28);
        org.apache.commons.codec.binary.Base64 base64_42 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray28);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(bigInteger41);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        boolean boolean5 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray4);
        boolean boolean8 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray7);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true, false);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false, true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107, (byte) 57, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 86, (byte) 86, (byte) 90, (byte) 87, (byte) 82, (byte) 50, (byte) 82, (byte) 115, (byte) 84, (byte) 88, (byte) 100, (byte) 85, (byte) 98, (byte) 84, (byte) 86, (byte) 112, (byte) 84, (byte) 85, (byte) 86, (byte) 114, (byte) 79, (byte) 81, (byte) 48, (byte) 75 });
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        byte[] byteArray0 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray0);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray0, true);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_4.encode(byteArray8, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray8);
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_14.encode(byteArray18, 0, 0);
        int int24 = base64_12.readResults(byteArray18, 0, (int) (short) 10);
        org.apache.commons.codec.binary.Base64 base64_27 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray31 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_27.encode(byteArray31, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_35 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray31);
        int int38 = base64_12.readResults(byteArray31, (int) 'a', 100);
        org.apache.commons.codec.binary.Base64 base64_40 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray44 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_40.encode(byteArray44, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_49 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_52 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray56 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_52.encode(byteArray56, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_60 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray56);
        org.apache.commons.codec.binary.Base64 base64_62 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_62.encode(byteArray66, 0, 0);
        int int72 = base64_60.readResults(byteArray66, 0, (int) (short) 10);
        int int75 = base64_49.readResults(byteArray66, 10, 0);
        int int78 = base64_40.readResults(byteArray66, (int) (short) 1, 0);
        int int81 = base64_12.readResults(byteArray66, 1, 1);
        byte[] byteArray82 = base64_1.decode(byteArray66);
        boolean boolean83 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray66);
        byte[] byteArray84 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray66);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(byteArray84);
        org.junit.Assert.assertArrayEquals(byteArray84, new byte[] { (byte) 95, (byte) 119, (byte) 111, (byte) 75 });
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray6);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray6);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_3.encode(byteArray7, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray7);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_13.encode(byteArray17, 0, 0);
        int int23 = base64_11.readResults(byteArray17, 0, (int) (short) 10);
        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray30);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray30);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray30);
        byte[] byteArray34 = base64_11.decode(byteArray30);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray30, false);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray36, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_39 = new org.apache.commons.codec.binary.Base64((int) (byte) 100, byteArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [AAoKCgoB]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_1.encode(byteArray5, 0, 0);
        boolean boolean9 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray5);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_1.encode(byteArray5, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_13.encode(byteArray17, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray17);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_23.encode(byteArray27, 0, 0);
        int int33 = base64_21.readResults(byteArray27, 0, (int) (short) 10);
        int int36 = base64_10.readResults(byteArray27, 10, 0);
        int int39 = base64_1.readResults(byteArray27, (int) (short) 1, 0);
        java.math.BigInteger bigInteger40 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger40);
        java.math.BigInteger bigInteger42 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray41);
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger42);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray0);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray0);
        boolean boolean4 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray3);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) 100 };
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, false, false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 65, (byte) 87, (byte) 82, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 65, (byte) 87, (byte) 82, (byte) 107 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 87, (byte) 82, (byte) 107 });
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(76, byteArray8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [AAoKCgoB]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray1);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_2.encode(byteArray6, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray6);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray11);
        base64_10.encode(byteArray11, (int) (byte) 0, 0);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = base64_10.decode((java.lang.Object) base64_16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[]");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) -1);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray9);
        byte[] byteArray12 = base64_1.encode(byteArray11);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) -1);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        base64_1.encode(byteArray10, (int) (byte) 0, (int) (short) 0);
        boolean boolean14 = base64_1.hasData();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(0, byteArray1, true);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 13, (byte) 10 });
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray10);
        int int14 = base64_1.readResults(byteArray11, (int) (short) 1, 0);
        java.math.BigInteger bigInteger15 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger15);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray16);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_1.encode(byteArray5, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_13.encode(byteArray17, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray17);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_23.encode(byteArray27, 0, 0);
        int int33 = base64_21.readResults(byteArray27, 0, (int) (short) 10);
        int int36 = base64_10.readResults(byteArray27, 10, 0);
        int int39 = base64_1.readResults(byteArray27, (int) (short) 1, 0);
        java.math.BigInteger bigInteger40 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray27);
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger40);
        java.math.BigInteger bigInteger42 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray41);
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger42);
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger42);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(bigInteger40);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger42);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_2.encode(byteArray6, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray6);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray11);
        base64_10.encode(byteArray11, (int) (byte) 0, 0);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray21 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_17.encode(byteArray21, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_26 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_29.encode(byteArray33, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_37 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray33);
        org.apache.commons.codec.binary.Base64 base64_39 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_39.encode(byteArray43, 0, 0);
        int int49 = base64_37.readResults(byteArray43, 0, (int) (short) 10);
        int int52 = base64_26.readResults(byteArray43, 10, 0);
        int int55 = base64_17.readResults(byteArray43, (int) (short) 1, 0);
        java.math.BigInteger bigInteger56 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray43);
        byte[] byteArray57 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger56);
        byte[] byteArray58 = base64_10.decode(byteArray57);
        int int59 = base64_10.avail();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(bigInteger56);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) 100 };
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 100, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 65, (byte) 87, (byte) 82, (byte) 107 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_3.encode(byteArray7, 0, 0);
        boolean boolean11 = base64_3.isUrlSafe();
        boolean boolean12 = base64_3.isUrlSafe();
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray19);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray20);
        byte[] byteArray23 = base64_3.decode(byteArray20);
        base64_1.setInitialBuffer(byteArray20, 76, (-1));
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_2.encode(byteArray6, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray6);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_12.encode(byteArray16, 0, 0);
        int int22 = base64_10.readResults(byteArray16, 0, (int) (short) 10);
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_25.encode(byteArray29, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray29);
        int int36 = base64_10.readResults(byteArray29, (int) 'a', 100);
        org.apache.commons.codec.binary.Base64 base64_38 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_38.encode(byteArray42, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_47 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_50 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray54 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_50.encode(byteArray54, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_58 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray54);
        org.apache.commons.codec.binary.Base64 base64_60 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray64 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_60.encode(byteArray64, 0, 0);
        int int70 = base64_58.readResults(byteArray64, 0, (int) (short) 10);
        int int73 = base64_47.readResults(byteArray64, 10, 0);
        int int76 = base64_38.readResults(byteArray64, (int) (short) 1, 0);
        int int79 = base64_10.readResults(byteArray64, 1, 1);
        byte[] byteArray80 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray64);
        byte[] byteArray81 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray80);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 95, (byte) 119 });
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_2.encode(byteArray6, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray6);
        byte[] byteArray11 = new byte[] {};
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray11);
        base64_10.encode(byteArray11, (int) (byte) 0, 0);
        boolean boolean16 = base64_10.hasData();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray10);
        int int14 = base64_1.readResults(byteArray11, (int) (short) 1, 0);
        java.math.BigInteger bigInteger15 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger15);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray16);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107 });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73 });
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(0);
        java.lang.Class<?> wildcardClass3 = base64_2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = base64_0.encode((java.lang.Object) base64_2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        base64_0.decode(byteArray9, (int) (byte) 10, (int) ' ');
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray9);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray9);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.discardNonBase64(byteArray14);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 75, (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 118, (byte) 83, (byte) 48, (byte) 78, (byte) 110, (byte) 98, (byte) 48, (byte) 73, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107, (byte) 57 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 85, (byte) 86, (byte) 86, (byte) 71, (byte) 100, (byte) 108, (byte) 77, (byte) 119, (byte) 84, (byte) 109, (byte) 53, (byte) 105, (byte) 77, (byte) 69, (byte) 107, (byte) 57 });
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_2.encode(byteArray6, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(false);
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_14.encode(byteArray18, 0, 0);
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray18);
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) 10, (byte) 10 };
        base64_24.encode(byteArray28, 0, 0);
        int int34 = base64_22.readResults(byteArray28, 0, (int) (short) 10);
        int int37 = base64_11.readResults(byteArray28, 10, 0);
        int int40 = base64_2.readResults(byteArray28, (int) (short) 1, 0);
        java.math.BigInteger bigInteger41 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray28);
        byte[] byteArray42 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger41);
        java.math.BigInteger bigInteger43 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray42);
        byte[] byteArray44 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger43);
        byte[] byteArray45 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray44);
        org.apache.commons.codec.binary.Base64 base64_46 = new org.apache.commons.codec.binary.Base64((-1), byteArray44);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) 10, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(bigInteger41);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger43);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
    }
}

