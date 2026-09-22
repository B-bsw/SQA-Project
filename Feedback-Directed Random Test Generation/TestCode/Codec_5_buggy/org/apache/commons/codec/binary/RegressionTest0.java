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
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
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
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
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
        int int0 = org.apache.commons.codec.binary.Base64.PEM_CHUNK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean2 = base64_1.hasData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = base64_1.encode((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = base64_1.encode((java.lang.Object) bigInteger6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = base64_1.decode((java.lang.Object) bigInteger6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray1);
        java.math.BigInteger bigInteger4 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        byte[] byteArray0 = null;
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray0, false, true, 64);
        org.junit.Assert.assertNull(byteArray4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = base64_1.encode((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        byte[] byteArray0 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 13, (byte) 10 });
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean2 = base64_1.hasData();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger7);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray8, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        byte[] byteArray3 = base64_0.decode("_wo");
        java.lang.Class<?> wildcardClass4 = byteArray3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray1, false);
        byte[] byteArray5 = new byte[] { (byte) 1 };
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            base64_3.decode(byteArray5, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger4 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger5);
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray6);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger7);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray8);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray8, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger4 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray1, false);
        boolean boolean4 = base64_3.isUrlSafe();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray6);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) 10 };
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray10);
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = base64_7.decode((java.lang.Object) bigInteger12);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(bigInteger12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger7);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray8);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = base64_0.encode((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean2 = base64_1.isUrlSafe();
        byte[] byteArray4 = new byte[] { (byte) 1 };
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray5, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger4 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray3);
        java.lang.Class<?> wildcardClass7 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray1, true);
        int int4 = base64_3.avail();
        byte[] byteArray6 = null;
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray6, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = base64_3.encode((java.lang.Object) byteArray6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        byte[] byteArray3 = base64_0.decode("_wo");
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.decodeBase64("_w");
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, true, true);
        base64_0.setInitialBuffer(byteArray5, 76, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 95, (byte) 119, (byte) 13, (byte) 10 });
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.hasData();
        byte[] byteArray4 = null;
        base64_1.setInitialBuffer(byteArray4, 10, 0);
        boolean boolean8 = base64_1.hasData();
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray12);
        byte[] byteArray16 = base64_1.decode(byteArray15);
        boolean boolean17 = base64_1.hasData();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        byte[] byteArray2 = new byte[] { (byte) 1 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) 100, byteArray4, false);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, true);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 65, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        byte[] byteArray3 = base64_0.decode("_wo");
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean6 = base64_5.hasData();
        boolean boolean7 = base64_5.hasData();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray14 = base64_5.decode(byteArray11);
        byte[] byteArray15 = base64_0.decode(byteArray14);
        boolean boolean16 = base64_0.hasData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = base64_0.encode((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -122 });
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = base64_0.decode(obj2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        boolean boolean2 = base64_0.hasData();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(100, byteArray8, false);
        boolean boolean11 = base64_10.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray6);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger12);
        int int16 = base64_7.readResults(byteArray13, 1, 100);
        int int17 = base64_7.avail();
        byte[] byteArray22 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger23 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger23);
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            base64_7.decode(byteArray24, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger23);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, true, true, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input array too big, the output array would be bigger (6) than the specified maxium size of 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1 });
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.hasData();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        byte[] byteArray10 = base64_1.decode(byteArray7);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, true, true);
        java.lang.String str14 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13);
        java.lang.Class<?> wildcardClass16 = byteArray13.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.hasData();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        byte[] byteArray10 = base64_1.decode(byteArray7);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, true, true);
        java.lang.String str14 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray13);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13, true, true, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray1, true);
        int int4 = base64_3.avail();
        byte[] byteArray6 = base64_3.decode("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger4 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray3);
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray3);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray3);
        java.lang.String str10 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray9);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "AQ==\r\n" + "'", str10, "AQ==\r\n");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) 100, byteArray1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.hasData();
        byte[] byteArray4 = null;
        base64_1.setInitialBuffer(byteArray4, 10, 0);
        boolean boolean8 = base64_1.hasData();
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray12);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray12);
        byte[] byteArray16 = base64_1.decode(byteArray15);
        boolean boolean17 = base64_1.isUrlSafe();
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64(76);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = base64_1.encode((java.lang.Object) 76);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean2 = base64_1.hasData();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = base64_1.encode((java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        byte[] byteArray3 = base64_0.decode("_wo");
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean6 = base64_5.hasData();
        boolean boolean7 = base64_5.hasData();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray14 = base64_5.decode(byteArray11);
        byte[] byteArray15 = base64_0.decode(byteArray14);
        byte[] byteArray18 = new byte[] { (byte) 1 };
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray18);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray18);
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) 100, byteArray20, false);
        byte[] byteArray23 = base64_0.decode(byteArray20);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray1, true);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            base64_3.encode(byteArray7, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64("_w");
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, true, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [_w??]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 95, (byte) 119, (byte) 13, (byte) 10 });
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray2);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger4 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray3);
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        java.lang.String str8 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CgoB\r\n" + "'", str8, "CgoB\r\n");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(100, byteArray8, false);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger15 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = base64_10.encode((java.lang.Object) bigInteger15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger15);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, true);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 90, (byte) 65, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray4);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        java.lang.String str2 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_w" + "'", str2, "_w");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1 });
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray4);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) '4', byteArray4, false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
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
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) ' ', byteArray9);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 10 };
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray13);
        java.lang.String str15 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray13);
        java.lang.String str16 = base64_10.encodeToString(byteArray13);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_wo" + "'", str15, "_wo");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "/wo=" + "'", str16, "/wo=");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray6);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        java.lang.String str14 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray11);
        int int17 = base64_7.readResults(byteArray11, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "CgoB" + "'", str14, "CgoB");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray1);
        boolean boolean3 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(0, byteArray7, false);
        java.lang.Class<?> wildcardClass10 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        byte[] byteArray3 = base64_0.decode("_wo");
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean6 = base64_5.hasData();
        boolean boolean7 = base64_5.hasData();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray14 = base64_5.decode(byteArray11);
        byte[] byteArray15 = base64_0.decode(byteArray14);
        boolean boolean16 = base64_0.hasData();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 10 };
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray19);
        java.lang.String str21 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray19);
        byte[] byteArray22 = base64_0.decode(byteArray19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1 });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_wo" + "'", str21, "_wo");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        java.math.BigInteger bigInteger4 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray3);
        java.lang.Class<?> wildcardClass6 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        java.lang.String str2 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray1);
        java.math.BigInteger bigInteger3 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray1);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_w" + "'", str2, "_w");
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 47, (byte) 119, (byte) 61, (byte) 61 });
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("_w");
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, true, false, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input array too big, the output array would be bigger (6) than the specified maxium size of 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 95, (byte) 119 });
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 10 };
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray3);
        boolean boolean5 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray3);
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) '#', byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger4 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger5);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, true, true);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger4 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger5);
        java.lang.String str8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray7);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        byte[] byteArray3 = base64_0.decode("_wo");
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1 });
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray3 = base64_1.decode("_w");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1 });
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray6);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger12);
        int int16 = base64_7.readResults(byteArray13, 1, 100);
        boolean boolean17 = base64_7.isUrlSafe();
        int int18 = base64_7.avail();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger4 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger4);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger4);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(64);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(76);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray5);
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray5);
        byte[] byteArray8 = base64_1.decode(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray2 = base64_0.decode("CgoB");
        boolean boolean3 = base64_0.hasData();
        byte[] byteArray5 = base64_0.decode("");
        java.lang.String str6 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray5);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        byte[] byteArray3 = base64_0.decode("_wo");
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean6 = base64_5.hasData();
        boolean boolean7 = base64_5.hasData();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray14 = base64_5.decode(byteArray11);
        byte[] byteArray15 = base64_0.decode(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray2);
        java.math.BigInteger bigInteger4 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger4);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray6);
        int int8 = base64_7.avail();
        boolean boolean9 = base64_7.hasData();
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean12 = base64_11.hasData();
        boolean boolean13 = base64_11.hasData();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger18 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray17);
        java.math.BigInteger bigInteger19 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray17);
        byte[] byteArray20 = base64_11.decode(byteArray17);
        byte[] byteArray21 = base64_7.encode(byteArray17);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray2);
        java.lang.String str4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray2);
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1 });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_wo" + "'", str4, "_wo");
        org.junit.Assert.assertNotNull(bigInteger5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray6);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger12);
        int int16 = base64_7.readResults(byteArray13, 1, 100);
        int int17 = base64_7.avail();
        byte[] byteArray19 = base64_7.decode("hi!");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -122 });
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.hasData();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        byte[] byteArray10 = base64_1.decode(byteArray7);
        boolean boolean11 = base64_1.hasData();
        byte[] byteArray13 = base64_1.decode("CgoB");
        boolean boolean14 = base64_1.isUrlSafe();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.hasData();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        byte[] byteArray10 = base64_1.decode(byteArray7);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, true, true);
        java.lang.String str14 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13);
        java.math.BigInteger bigInteger16 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray13);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger16);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(100, byteArray8, false);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false, false, (int) '#');
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        byte[] byteArray3 = base64_0.decode("_wo");
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 47, (byte) 119, (byte) 111, (byte) 61 });
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger4 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray1, false);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.decodeBase64("_wo");
        java.lang.String str6 = base64_3.encodeToString(byteArray5);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, true);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/wo=" + "'", str6, "/wo=");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 47, (byte) 119, (byte) 111, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) 100);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.hasData();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        byte[] byteArray10 = base64_1.decode(byteArray7);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, true, true);
        boolean boolean14 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) ' ', byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        boolean boolean12 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray9);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) 0);
        byte[] byteArray2 = null;
        java.lang.String str3 = base64_1.encodeToString(byteArray2);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        java.lang.String str8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray6);
        byte[] byteArray9 = base64_1.decode(byteArray6);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_wo" + "'", str8, "_wo");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray6);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger12);
        int int16 = base64_7.readResults(byteArray13, 1, 100);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13, true);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray2 = base64_0.decode("CgoB");
        java.lang.String str3 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CgoB" + "'", str3, "CgoB");
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray2 = base64_0.decode("CgoB");
        boolean boolean3 = base64_0.hasData();
        byte[] byteArray5 = base64_0.decode("");
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean8 = base64_7.hasData();
        boolean boolean9 = base64_7.hasData();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray13);
        java.math.BigInteger bigInteger15 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray13);
        byte[] byteArray16 = base64_7.decode(byteArray13);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray16, true, true);
        java.lang.String str20 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray19);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19);
        byte[] byteArray22 = base64_0.encode(byteArray21);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(bigInteger15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) 0);
        byte[] byteArray2 = null;
        java.lang.String str3 = base64_1.encodeToString(byteArray2);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        java.lang.String str8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray6);
        byte[] byteArray9 = base64_1.decode(byteArray6);
        boolean boolean10 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_wo" + "'", str8, "_wo");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 10 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 47, (byte) 119, (byte) 111, (byte) 61 });
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) 0);
        byte[] byteArray2 = null;
        java.lang.String str3 = base64_1.encodeToString(byteArray2);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        java.lang.String str8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray6);
        byte[] byteArray9 = base64_1.decode(byteArray6);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger14 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = base64_1.encode((java.lang.Object) bigInteger14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_wo" + "'", str8, "_wo");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray6);
        int int8 = base64_7.avail();
        boolean boolean9 = base64_7.hasData();
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean12 = base64_11.hasData();
        boolean boolean13 = base64_11.hasData();
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger18 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray17);
        java.math.BigInteger bigInteger19 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray17);
        byte[] byteArray20 = base64_11.decode(byteArray17);
        boolean boolean21 = base64_11.hasData();
        byte[] byteArray23 = base64_11.decode("CgoB");
        int int26 = base64_7.readResults(byteArray23, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger18);
        org.junit.Assert.assertNotNull(bigInteger19);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        byte[] byteArray3 = base64_0.decode("_wo");
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean6 = base64_5.hasData();
        boolean boolean7 = base64_5.hasData();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray14 = base64_5.decode(byteArray11);
        byte[] byteArray15 = base64_0.decode(byteArray14);
        byte[] byteArray17 = base64_0.decode("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.hasData();
        byte[] byteArray4 = null;
        base64_1.setInitialBuffer(byteArray4, 10, 0);
        boolean boolean8 = base64_1.hasData();
        byte[] byteArray9 = null;
        base64_1.encode(byteArray9, (int) ' ', (int) (short) 0);
        byte[] byteArray14 = base64_1.decode("CgoB");
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.decodeBase64("AQ");
        java.lang.String str17 = base64_1.encodeToString(byteArray16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1 });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AQ\r\n" + "'", str17, "AQ\r\n");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger4 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger5);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, true, true, 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        byte[] byteArray3 = base64_0.decode("_wo");
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean6 = base64_5.hasData();
        boolean boolean7 = base64_5.hasData();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray14 = base64_5.decode(byteArray11);
        byte[] byteArray15 = base64_0.decode(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64();
        boolean boolean17 = base64_16.isUrlSafe();
        byte[] byteArray19 = base64_16.decode("_wo");
        // The following exception was thrown during execution in test generation
        try {
            base64_0.decode(byteArray19, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 10 });
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(0, byteArray7, false);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray7);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.hasData();
        java.lang.Class<?> wildcardClass4 = base64_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, true, true, (int) (byte) 10);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(0, byteArray7, false);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger16 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray15);
        java.math.BigInteger bigInteger17 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray15);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger17);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray18);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64((int) ' ', byteArray20);
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64(76, byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            base64_9.decode(byteArray20, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger16);
        org.junit.Assert.assertNotNull(bigInteger17);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean3 = base64_2.hasData();
        boolean boolean4 = base64_2.hasData();
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray11 = base64_2.decode(byteArray8);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, true, true);
        java.lang.String str15 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) ' ', byteArray14);
        byte[] byteArray19 = base64_17.decode("CgoB\r\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        java.math.BigInteger bigInteger4 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger4);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        byte[] byteArray3 = base64_0.decode("_wo");
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean6 = base64_5.hasData();
        boolean boolean7 = base64_5.hasData();
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger12 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray11);
        byte[] byteArray14 = base64_5.decode(byteArray11);
        byte[] byteArray15 = base64_0.decode(byteArray14);
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger20 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray19);
        java.math.BigInteger bigInteger21 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray19);
        java.lang.String str22 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray19);
        base64_0.setInitialBuffer(byteArray19, (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger12);
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger20);
        org.junit.Assert.assertNotNull(bigInteger21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "CgoB" + "'", str22, "CgoB");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) '4');
        byte[] byteArray3 = null;
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray3, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = base64_1.encode((java.lang.Object) byteArray3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean3 = base64_2.hasData();
        boolean boolean4 = base64_2.hasData();
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        java.math.BigInteger bigInteger10 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray8);
        byte[] byteArray11 = base64_2.decode(byteArray8);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray11, true, true);
        java.lang.String str15 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) ' ', byteArray14);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(bigInteger10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(0, byteArray7, false);
        int int10 = base64_9.avail();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        byte[] byteArray0 = null;
        java.lang.String str1 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.hasData();
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        java.math.BigInteger bigInteger9 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray7);
        byte[] byteArray10 = base64_1.decode(byteArray7);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, true, true);
        java.lang.String str14 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(bigInteger9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }
}

