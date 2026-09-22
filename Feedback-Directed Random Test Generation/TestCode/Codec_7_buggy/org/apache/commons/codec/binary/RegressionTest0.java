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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        int int0 = org.apache.commons.codec.binary.Base64.MIME_CHUNK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 76 + "'", int0 == 76);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int int0 = org.apache.commons.codec.binary.Base64.PEM_CHUNK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
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
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        byte[] byteArray0 = null;
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray0, false, true, 64);
        org.junit.Assert.assertNull(byteArray4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        byte[] byteArray0 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 13, (byte) 10 });
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
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
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
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
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
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
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
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
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
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
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray1, false);
        boolean boolean4 = base64_3.isUrlSafe();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
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
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
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
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
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
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
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
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
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
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray1, false);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.decodeBase64("_wo");
        java.lang.String str6 = base64_3.encodeToString(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/wo=" + "'", str6, "/wo=");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("AQ");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1 });
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
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
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
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
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
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
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
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
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
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
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -122 });
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
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
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        boolean boolean1 = base64_0.isUrlSafe();
        boolean boolean2 = base64_0.hasData();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
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
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
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
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
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
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
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
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
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
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray1, true);
        int int4 = base64_3.avail();
        byte[] byteArray6 = base64_3.decode("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
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
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) 100, byteArray1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
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
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
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
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        boolean boolean2 = base64_1.hasData();
        boolean boolean3 = base64_1.hasData();
        byte[] byteArray4 = null;
        base64_1.setInitialBuffer(byteArray4, 10, 0);
        boolean boolean8 = base64_1.hasData();
        byte[] byteArray9 = null;
        base64_1.encode(byteArray9, (int) ' ', (int) (short) 0);
        byte[] byteArray14 = base64_1.decode("CgoB");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
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
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
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
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger5);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64(0, byteArray7, false);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray7);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
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
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
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
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
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
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
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
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, true);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 90, (byte) 65, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
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
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
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
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
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
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
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
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
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
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
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
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
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
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
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
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64((int) ' ', byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
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
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
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
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
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
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
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
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
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
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
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
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
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
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
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
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
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
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray3 = base64_1.decode("_w");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -1 });
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
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
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
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
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(64);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray5);
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray5);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) ' ', byteArray10);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(76, byteArray10);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
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
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray2 = base64_0.decode("CgoB");
        java.lang.String str3 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CgoB" + "'", str3, "CgoB");
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
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
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
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
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
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
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
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
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
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
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
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
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
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
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
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
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
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
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
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
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) 0);
        byte[] byteArray2 = null;
        java.lang.String str3 = base64_1.encodeToString(byteArray2);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        java.lang.String str8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray6);
        byte[] byteArray9 = base64_1.decode(byteArray6);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1 });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_wo" + "'", str8, "_wo");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
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
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
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
}

