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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4);
        java.lang.String str6 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input array too big, the output array would be bigger (14) than the specified maxium size of -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Q2dBQVpBPT0" + "'", str6, "Q2dBQVpBPT0");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = base64_1.encode((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int int0 = org.apache.commons.codec.binary.Base64.MIME_CHUNK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 76 + "'", int0 == 76);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        java.lang.String str2 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        byte[] byteArray7 = base64_0.encode(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = base64_0.encode((java.lang.Object) "Q2dBQVpBPT0");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = base64InputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream1.mark(76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) 1);
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray6 = base64_4.encode(byteArray5);
        java.lang.String str7 = base64_2.encodeToString(byteArray5);
        java.lang.String str8 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray5);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) (short) 10, byteArray5, true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DQo=" + "'", str7, "DQo=");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DQo=" + "'", str8, "DQo=");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int0 = org.apache.commons.codec.binary.Base64.PEM_CHUNK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(0, byteArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [Q2dBQVpBPT0=]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = base64_1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        boolean boolean2 = base64_1.hasData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = base64_1.decode((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = base64InputStream1.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, true, (int) (byte) 0, byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [CgAAZA==]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48 });
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.isUrlSafe();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6);
        byte[] byteArray8 = base64_1.encode(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((-1), byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [CgAAZA==]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream3 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream3 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream1.mark((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.hasData();
        boolean boolean4 = base64_1.isUrlSafe();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [CgAAZA==]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        java.lang.String str10 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = base64InputStream1.read(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Q2dBQVpBPT0=" + "'", str10, "Q2dBQVpBPT0=");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream3 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = base64InputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("Q2dBQVpBPT0=");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10);
        byte[] byteArray12 = base64_5.encode(byteArray10);
        boolean boolean13 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray12);
        boolean boolean14 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false, (int) (byte) 10, byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [CgAAZA==]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64(0);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        byte[] byteArray14 = base64_7.encode(byteArray12);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray14);
        byte[] byteArray16 = base64_6.decode(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false, (int) '4', byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [???d]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 1);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray5 = base64_3.encode(byteArray4);
        java.lang.String str6 = base64_1.encodeToString(byteArray4);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = base64_1.encode((java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DQo=" + "'", str6, "DQo=");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10);
        byte[] byteArray12 = base64_5.encode(byteArray10);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = base64InputStream4.read(byteArray12, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6);
        byte[] byteArray8 = base64_1.encode(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) (byte) 100, byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [CgAAZA==]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64("Q2dBQVpBPT0");
        base64_1.encode(byteArray3, 64, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream3 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = base64InputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(1, byteArray6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [CgAAZA==]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream3 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream3.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = base64InputStream1.skip((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        base64_1.encode(byteArray5, (int) (byte) 0, 1);
        boolean boolean10 = base64_1.hasData();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 47, (byte) 119, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = base64InputStream1.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("DQo=");
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 68, (byte) 81, (byte) 111 });
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray5);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream7 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false, (int) (byte) 100, byteArray5);
        java.lang.Class<?> wildcardClass8 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = base64_1.decode((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = base64_2.encode(byteArray7);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray9);
        byte[] byteArray11 = base64_1.decode(byteArray9);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17);
        byte[] byteArray19 = base64_12.encode(byteArray17);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray25);
        byte[] byteArray28 = base64_12.encode(byteArray25);
        byte[] byteArray29 = base64_1.decode(byteArray25);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, true);
        java.lang.String str32 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray31);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "UTJkQlFWcEJQVDA9DQo=" + "'", str32, "UTJkQlFWcEJQVDA9DQo=");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6);
        byte[] byteArray8 = base64_1.encode(byteArray6);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(1, byteArray10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [CgAAZA==]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = base64InputStream1.skip((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream3 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream1.mark((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6);
        base64_0.setInitialBuffer(byteArray6, 64, 64);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray3);
        int int7 = base64_1.readResults(byteArray4, 76, 0);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13);
        byte[] byteArray15 = base64_8.encode(byteArray13);
        java.lang.Class<?> wildcardClass16 = byteArray15.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = base64_1.decode((java.lang.Object) wildcardClass16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        byte[] byteArray7 = base64_0.encode(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = base64_0.decode((java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10);
        byte[] byteArray12 = base64_5.encode(byteArray10);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray12);
        java.lang.String str14 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = base64InputStream1.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Q2dBQVpBPT0=" + "'", str14, "Q2dBQVpBPT0=");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream3 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) (short) 1);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray12 = base64_10.encode(byteArray11);
        java.lang.String str13 = base64_8.encodeToString(byteArray11);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray11);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((-1), byteArray14, true);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray14);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, true, (int) (byte) 1, byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = base64InputStream18.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DQo=" + "'", str13, "DQo=");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream3 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1);
        java.io.InputStream inputStream4 = null;
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream11 = new org.apache.commons.codec.binary.Base64InputStream(inputStream4, false, (int) (byte) 100, byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = base64InputStream3.read(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1 });
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = base64InputStream1.skip((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        java.math.BigInteger bigInteger2 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64(0);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        byte[] byteArray14 = base64_7.encode(byteArray12);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray14);
        byte[] byteArray16 = base64_6.decode(byteArray14);
        java.math.BigInteger bigInteger17 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray16);
        java.lang.String str18 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64InputStream base64InputStream19 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false, (int) (short) 10, byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [???d]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CgAAZA==" + "'", str18, "CgAAZA==");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        base64_1.encode(byteArray5, (int) (byte) 0, 1);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray5);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 47, (byte) 119, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(bigInteger10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        byte[] byteArray7 = base64_0.encode(byteArray5);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray13);
        byte[] byteArray16 = base64_0.encode(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, false, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input array too big, the output array would be bigger (18) than the specified maxium size of -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream3 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = base64InputStream1.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream3 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) (short) 1);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray12 = base64_10.encode(byteArray11);
        java.lang.String str13 = base64_8.encodeToString(byteArray11);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray11);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((-1), byteArray14, true);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray14);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, true, (int) (byte) 1, byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DQo=" + "'", str13, "DQo=");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        byte[] byteArray7 = base64_0.encode(byteArray5);
        boolean boolean8 = base64_0.hasData();
        boolean boolean9 = base64_0.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray5);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7, true);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 85, (byte) 84, (byte) 74, (byte) 107, (byte) 81, (byte) 108, (byte) 70, (byte) 87, (byte) 99, (byte) 69, (byte) 74, (byte) 81, (byte) 86, (byte) 68, (byte) 65, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        java.math.BigInteger bigInteger2 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger2);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger2);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6);
        byte[] byteArray8 = base64_1.encode(byteArray6);
        boolean boolean9 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray8);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64((int) ' ', byteArray8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [CgAAZA==]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream3 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream3 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = base64InputStream1.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 1);
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = base64_2.encode(byteArray7);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray9);
        base64_1.decode(byteArray11, (-1), 0);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray11);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 85, (byte) 84, (byte) 74, (byte) 107, (byte) 81, (byte) 108, (byte) 70, (byte) 87, (byte) 99, (byte) 69, (byte) 74, (byte) 81, (byte) 86, (byte) 68, (byte) 65, (byte) 57, (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray5);
        boolean boolean7 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray5);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        byte[] byteArray7 = base64_0.encode(byteArray5);
        boolean boolean8 = base64_0.hasData();
        boolean boolean9 = base64_0.hasData();
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15);
        byte[] byteArray17 = base64_10.encode(byteArray15);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray17);
        byte[] byteArray19 = base64_0.decode(byteArray18);
        java.lang.Class<?> wildcardClass20 = byteArray18.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.hasData();
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        base64_1.decode(byteArray5, (int) (short) 10, (int) (byte) -1);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        java.lang.String str10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aGc9PQ" + "'", str10, "aGc9PQ");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger5);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger5);
        int int9 = base64InputStream1.read(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream1.mark(76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = base64InputStream4.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 1);
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = base64_2.encode(byteArray7);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray9);
        base64_1.decode(byteArray11, (-1), 0);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray20);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray22, 76, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 76");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        base64_1.encode(byteArray5, (int) (byte) 0, 1);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15);
        byte[] byteArray17 = base64_10.encode(byteArray15);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray17);
        byte[] byteArray19 = base64_1.encode(byteArray17);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 47, (byte) 119, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 13, (byte) 10 });
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 1);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray5 = base64_3.encode(byteArray4);
        java.lang.String str6 = base64_1.encodeToString(byteArray4);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray7);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray9);
        java.lang.String str11 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DQo=" + "'", str6, "DQo=");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream3 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) (short) 1);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray12 = base64_10.encode(byteArray11);
        java.lang.String str13 = base64_8.encodeToString(byteArray11);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray11);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((-1), byteArray14, true);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray14);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, true, (int) (byte) 1, byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = base64InputStream1.skip((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DQo=" + "'", str13, "DQo=");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray5);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream7 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false, (int) (byte) 100, byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1 });
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream3 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger5);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger5);
        int int9 = base64InputStream1.read(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream1.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) '#');
        boolean boolean2 = base64_1.isUrlSafe();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        boolean boolean2 = base64InputStream1.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) 1);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray10 = base64_8.encode(byteArray9);
        java.lang.String str11 = base64_6.encodeToString(byteArray9);
        java.lang.String str12 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray9);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = base64InputStream4.read(byteArray13, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DQo=" + "'", str11, "DQo=");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "DQo=" + "'", str12, "DQo=");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 82, (byte) 70, (byte) 70, (byte) 118, (byte) 80, (byte) 81, (byte) 61, (byte) 61 });
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        byte[] byteArray7 = base64_0.encode(byteArray5);
        boolean boolean8 = base64_0.hasData();
        boolean boolean9 = base64_0.hasData();
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray15);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, false, false);
        base64_0.encode(byteArray16, 1, (-1));
        byte[] byteArray27 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray28);
        java.lang.String str30 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray28);
        java.lang.String str31 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray28);
        java.lang.String str32 = base64_0.encodeToString(byteArray28);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 85, (byte) 84, (byte) 74, (byte) 107, (byte) 81, (byte) 108, (byte) 70, (byte) 87, (byte) 99, (byte) 69, (byte) 74, (byte) 81, (byte) 86, (byte) 68, (byte) 65, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48 });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Q2dBQVpBPT0=" + "'", str30, "Q2dBQVpBPT0=");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Q2dBQVpBPT0=" + "'", str31, "Q2dBQVpBPT0=");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Q2dBQVpBPT0=" + "'", str32, "Q2dBQVpBPT0=");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.hasData();
        boolean boolean4 = base64_1.hasData();
        boolean boolean5 = base64_1.hasData();
        boolean boolean6 = base64_1.isUrlSafe();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream1 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream3 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) (short) 1);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray12 = base64_10.encode(byteArray11);
        java.lang.String str13 = base64_8.encodeToString(byteArray11);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray11);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((-1), byteArray14, true);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray14);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, true, (int) (byte) 1, byteArray14);
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64(0);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray28 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28);
        byte[] byteArray30 = base64_23.encode(byteArray28);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray30);
        byte[] byteArray32 = base64_22.decode(byteArray30);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64InputStream base64InputStream34 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream1, true, 10, byteArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [???d]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DQo=" + "'", str13, "DQo=");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        byte[] byteArray7 = base64_0.encode(byteArray5);
        boolean boolean8 = base64_0.hasData();
        boolean boolean9 = base64_0.hasData();
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15);
        byte[] byteArray17 = base64_10.encode(byteArray15);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray17);
        byte[] byteArray19 = base64_0.decode(byteArray18);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger23);
        org.apache.commons.codec.binary.Base64 base64_26 = new org.apache.commons.codec.binary.Base64(0, byteArray24, false);
        int int29 = base64_0.readResults(byteArray24, 76, (int) ' ');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 1);
        boolean boolean2 = base64_1.hasData();
        byte[] byteArray9 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9, false);
        java.lang.String str12 = base64_1.encodeToString(byteArray9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 67, (byte) 103, (byte) 69, (byte) 66, (byte) 65, (byte) 65, (byte) 70, (byte) 107 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CgEBAAFk" + "'", str12, "CgEBAAFk");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = base64_2.encode(byteArray7);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray9);
        byte[] byteArray11 = base64_1.decode(byteArray9);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17);
        byte[] byteArray19 = base64_12.encode(byteArray17);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray25);
        byte[] byteArray28 = base64_12.encode(byteArray25);
        byte[] byteArray29 = base64_1.decode(byteArray25);
        java.math.BigInteger bigInteger30 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray29);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(bigInteger30);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        byte[] byteArray7 = base64_0.encode(byteArray5);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray7);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        java.math.BigInteger bigInteger2 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger2);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray9 = base64_2.encode(byteArray7);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray9);
        byte[] byteArray11 = base64_1.decode(byteArray9);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray17);
        byte[] byteArray19 = base64_12.encode(byteArray17);
        byte[] byteArray24 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray25);
        byte[] byteArray28 = base64_12.encode(byteArray25);
        byte[] byteArray29 = base64_1.decode(byteArray25);
        byte[] byteArray31 = base64_1.decode("Q2dBQVpBPT0=");
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64((int) (short) 1);
        org.apache.commons.codec.binary.Base64 base64_35 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray37 = base64_35.encode(byteArray36);
        java.lang.String str38 = base64_33.encodeToString(byteArray36);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray36);
        byte[] byteArray40 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray39);
        base64_1.decode(byteArray39, (int) '#', (int) 'a');
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "DQo=" + "'", str38, "DQo=");
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray3 = base64_1.encode(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) 1);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray9 = base64_7.encode(byteArray8);
        java.lang.String str10 = base64_5.encodeToString(byteArray8);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray8);
        base64_1.encode(byteArray11, (int) (short) 0, (int) (byte) 1);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20);
        byte[] byteArray22 = base64_15.encode(byteArray20);
        byte[] byteArray23 = base64_1.encode(byteArray22);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DQo=" + "'", str10, "DQo=");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 67, (byte) 103, (byte) 65, (byte) 65, (byte) 90, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 66, (byte) 81, (byte) 86, (byte) 112, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(76);
    }
}

