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
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray4, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray4, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = base64_8.encode((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1 });
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray4, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray4, false);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false);
        java.lang.Class<?> wildcardClass11 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 65, (byte) 81, (byte) 69, (byte) 61 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int0 = org.apache.commons.codec.binary.Base64.MIME_CHUNK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 76 + "'", int0 == 76);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray4, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray4, false);
        byte[] byteArray10 = base64_8.decode("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = base64_8.encode((java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray4, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray4, false);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            base64_8.encode(byteArray14, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 1 });
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int0 = org.apache.commons.codec.binary.Base64.PEM_CHUNK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64("AQE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(100, byteArray5, false);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        java.lang.Class<?> wildcardClass13 = byteArray12.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 65, (byte) 81, (byte) 69, (byte) 61 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray5, false);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray13, false, true, (int) (short) 10);
        int int20 = base64_9.readResults(byteArray17, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) 100, byteArray17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [AAEK]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 65, (byte) 65, (byte) 69, (byte) 75 });
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        java.math.BigInteger bigInteger3 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray0);
        java.lang.String str4 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray0);
        java.lang.Class<?> wildcardClass5 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray4, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray4, false);
        byte[] byteArray10 = base64_8.decode("");
        int int11 = base64_8.avail();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        boolean boolean2 = base64_1.hasData();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(100, byteArray5, false);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray15, false);
        java.lang.String str18 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray15);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            base64_11.decode(byteArray15, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AQE" + "'", str18, "AQE");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 1 });
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        boolean boolean6 = base64_5.hasData();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = base64_5.decode(obj7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
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
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false, true, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(76);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        byte[] byteArray1 = new byte[] {};
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray1);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray1);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray3);
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) 1, byteArray4, false);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        boolean boolean6 = base64_5.hasData();
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray8 = base64_5.encode(byteArray7);
        int int9 = base64_5.avail();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        java.math.BigInteger bigInteger3 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray0);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger3);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, true, false);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, true, 100);
        java.lang.String str11 = base64_1.encodeToString(byteArray10);
        boolean boolean12 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray10);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 97, (byte) 71, (byte) 99, (byte) 57, (byte) 80, (byte) 81, (byte) 48, (byte) 75 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "YUdjOVBRMEs\r\n" + "'", str11, "YUdjOVBRMEs\r\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        java.math.BigInteger bigInteger3 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray0);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger3);
        java.lang.Class<?> wildcardClass5 = bigInteger3.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray0);
        java.lang.String str2 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray1);
        java.lang.Class<?> wildcardClass3 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64("YUdjOVBRMEs\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray7, false);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray7, false);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(100, byteArray7, false);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray18, false);
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray18, false);
        int int25 = base64_13.readResults(byteArray18, 76, (int) '#');
        byte[] byteArray26 = base64_1.decode(byteArray18);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray26);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(100, byteArray5, false);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray15, false);
        java.lang.String str18 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray15);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray15);
        byte[] byteArray20 = base64_11.decode(byteArray15);
        java.lang.Class<?> wildcardClass21 = base64_11.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AQE" + "'", str18, "AQE");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, true, false);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, true, 100);
        boolean boolean9 = org.apache.commons.codec.binary.Base64.isBase64(byteArray4);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 97, (byte) 71, (byte) 99, (byte) 57, (byte) 80, (byte) 81, (byte) 48, (byte) 75 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(100);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        java.math.BigInteger bigInteger3 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray0);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger3);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray1);
        boolean boolean3 = base64_2.hasData();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray7, false);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            base64_2.encode(byteArray7, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 65, (byte) 81, (byte) 69, (byte) 61 });
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        byte[] byteArray0 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) 10);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("AQE");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 1, (byte) 1 });
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        byte[] byteArray0 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        java.lang.String str2 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DQo" + "'", str2, "DQo");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray4, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray4, false);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray10);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 65, (byte) 81, (byte) 69, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 81, (byte) 86, (byte) 70, (byte) 70, (byte) 80, (byte) 81 });
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, true, false);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, true, 100);
        java.lang.String str11 = base64_1.encodeToString(byteArray10);
        java.lang.String str12 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray10);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger13);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 97, (byte) 71, (byte) 99, (byte) 57, (byte) 80, (byte) 81, (byte) 48, (byte) 75 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "YUdjOVBRMEs\r\n" + "'", str11, "YUdjOVBRMEs\r\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "YUdjOVBRMEs=" + "'", str12, "YUdjOVBRMEs=");
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, true, false);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, true, 100);
        java.lang.String str9 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray4);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 97, (byte) 71, (byte) 99, (byte) 57, (byte) 80, (byte) 81, (byte) 48, (byte) 75 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "aGc9PQ0K" + "'", str9, "aGc9PQ0K");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) '#');
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray4 = base64_2.decode("hi!");
        byte[] byteArray5 = base64_1.encode(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        byte[] byteArray6 = new byte[] {};
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        java.lang.String str8 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray7);
        byte[] byteArray9 = base64_5.encode(byteArray7);
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = base64_5.decode(obj10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5, false, true, (int) (short) 10);
        byte[] byteArray10 = base64_1.decode(byteArray9);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 65, (byte) 65, (byte) 69, (byte) 75 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        boolean boolean6 = base64_5.hasData();
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray8 = base64_5.encode(byteArray7);
        boolean boolean9 = base64_5.isUrlSafe();
        byte[] byteArray11 = base64_5.decode("hg==");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -122 });
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        boolean boolean6 = base64_5.hasData();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, true, (int) (short) 10);
        byte[] byteArray15 = base64_5.encode(byteArray14);
        boolean boolean16 = base64_5.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 65, (byte) 65, (byte) 69, (byte) 75 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 70, (byte) 83, (byte) 119, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray3 = base64_1.decode("");
        boolean boolean4 = base64_1.hasData();
        boolean boolean5 = base64_1.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        boolean boolean6 = base64_5.hasData();
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray8 = base64_5.encode(byteArray7);
        boolean boolean9 = base64_5.isUrlSafe();
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_19 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray17, false);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray17, false);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64(100, byteArray17, false);
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_30 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray28, false);
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray28, false);
        int int35 = base64_23.readResults(byteArray28, 76, (int) '#');
        byte[] byteArray36 = base64_11.decode(byteArray28);
        byte[] byteArray37 = base64_5.decode(byteArray28);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] {});
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        int int2 = base64_1.avail();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(100, byteArray5, false);
        java.lang.String str12 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "AQE=" + "'", str12, "AQE=");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64("AQE=");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(100, byteArray5, false);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray15, false);
        java.lang.String str18 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray15);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray15);
        byte[] byteArray20 = base64_11.decode(byteArray15);
        byte[] byteArray22 = base64_11.decode("AQE");
        byte[] byteArray26 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_28 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray26, false);
        java.lang.String str29 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray26);
        int int32 = base64_11.readResults(byteArray26, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AQE" + "'", str18, "AQE");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "AQE" + "'", str29, "AQE");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) 'a');
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, true, false);
        java.lang.String str7 = base64_1.encodeToString(byteArray6);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aGc9PQ0K\r\n" + "'", str7, "aGc9PQ0K\r\n");
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(100, byteArray5, false);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray15, false);
        java.lang.String str18 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray15);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray15);
        byte[] byteArray20 = base64_11.decode(byteArray15);
        byte[] byteArray22 = base64_11.decode("AQE");
        boolean boolean23 = base64_11.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AQE" + "'", str18, "AQE");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        boolean boolean6 = base64_5.hasData();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, true, (int) (short) 10);
        byte[] byteArray15 = base64_5.encode(byteArray14);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray19, false);
        boolean boolean22 = base64_21.hasData();
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray24 = base64_21.encode(byteArray23);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23);
        base64_5.encode(byteArray23, (int) '#', (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 65, (byte) 65, (byte) 69, (byte) 75 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 70, (byte) 83, (byte) 119, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        boolean boolean6 = base64_5.hasData();
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray8 = base64_5.encode(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray7);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 68, (byte) 81, (byte) 111 });
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, true, false);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        java.lang.String str6 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray5);
        java.lang.Class<?> wildcardClass8 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -122 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hg==" + "'", str6, "hg==");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 104, (byte) 103 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        boolean boolean6 = base64_5.hasData();
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray10, false);
        java.lang.String str13 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray10);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray10);
        byte[] byteArray15 = base64_5.encode(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray14);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "AQE" + "'", str13, "AQE");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 65, (byte) 81, (byte) 69, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        boolean boolean6 = base64_5.hasData();
        byte[] byteArray7 = new byte[] {};
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray7);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            base64_5.decode(byteArray11, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray4, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray4, false);
        byte[] byteArray10 = base64_8.decode("");
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14, false);
        java.lang.String str17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray14);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray14);
        byte[] byteArray19 = base64_8.decode(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23, true, false);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray26, false, true, 100);
        java.lang.String str31 = base64_21.encodeToString(byteArray30);
        java.lang.String str32 = base64_8.encodeToString(byteArray30);
        java.math.BigInteger bigInteger33 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray30);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AQE" + "'", str17, "AQE");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 97, (byte) 71, (byte) 99, (byte) 57, (byte) 80, (byte) 81, (byte) 48, (byte) 75 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "YUdjOVBRMEs\r\n" + "'", str31, "YUdjOVBRMEs\r\n");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "YUdjOVBRMEs=\001\001" + "'", str32, "YUdjOVBRMEs=\001\001");
        org.junit.Assert.assertNotNull(bigInteger33);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray7, false);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray7, false);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(100, byteArray7, false);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray18, false);
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray18, false);
        int int25 = base64_13.readResults(byteArray18, 76, (int) '#');
        byte[] byteArray26 = base64_1.decode(byteArray18);
        boolean boolean27 = base64_1.hasData();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 100);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        boolean boolean3 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray2);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray2, true, true);
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger7);
        byte[] byteArray9 = base64_1.decode(byteArray8);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 13, (byte) 10 });
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        java.math.BigInteger bigInteger3 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray0);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger3);
        java.lang.String str6 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray5);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, true, true, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input array too big, the output array would be bigger (6) than the specified maxium size of 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 65, (byte) 81, (byte) 69, (byte) 61 });
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray4, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray4, false);
        byte[] byteArray10 = base64_8.decode("");
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_16 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray14, false);
        java.lang.String str17 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray14);
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray14);
        byte[] byteArray19 = base64_8.decode(byteArray14);
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23, true, false);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray26, false, true, 100);
        java.lang.String str31 = base64_21.encodeToString(byteArray30);
        java.lang.String str32 = base64_8.encodeToString(byteArray30);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray36 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray36, true, false);
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray39, false, true, 100);
        java.lang.String str44 = base64_34.encodeToString(byteArray43);
        java.lang.String str45 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray43);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray43, false);
        byte[] byteArray48 = base64_8.decode(byteArray43);
        org.apache.commons.codec.binary.Base64 base64_51 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray57 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_59 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray57, false);
        org.apache.commons.codec.binary.Base64 base64_61 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray57, false);
        org.apache.commons.codec.binary.Base64 base64_63 = new org.apache.commons.codec.binary.Base64(100, byteArray57, false);
        byte[] byteArray68 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_70 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray68, false);
        org.apache.commons.codec.binary.Base64 base64_72 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray68, false);
        int int75 = base64_63.readResults(byteArray68, 76, (int) '#');
        byte[] byteArray76 = base64_51.decode(byteArray68);
        org.apache.commons.codec.binary.Base64 base64_78 = new org.apache.commons.codec.binary.Base64((int) ' ', byteArray68, true);
        int int81 = base64_8.readResults(byteArray68, 10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AQE" + "'", str17, "AQE");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 97, (byte) 71, (byte) 99, (byte) 57, (byte) 80, (byte) 81, (byte) 48, (byte) 75 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "YUdjOVBRMEs\r\n" + "'", str31, "YUdjOVBRMEs\r\n");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "YUdjOVBRMEs=\001\001" + "'", str32, "YUdjOVBRMEs=\001\001");
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 97, (byte) 71, (byte) 99, (byte) 57, (byte) 80, (byte) 81, (byte) 48, (byte) 75 });
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "YUdjOVBRMEs\r\n" + "'", str44, "YUdjOVBRMEs\r\n");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "YUdjOVBRMEs=" + "'", str45, "YUdjOVBRMEs=");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 89, (byte) 85, (byte) 100, (byte) 106, (byte) 79, (byte) 86, (byte) 66, (byte) 82, (byte) 77, (byte) 69, (byte) 115, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] {});
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        byte[] byteArray0 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray0, false, false);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, true);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 82, (byte) 70, (byte) 70, (byte) 118, (byte) 80, (byte) 81, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray4, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray4, false);
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, true, (int) (short) 10);
        int int19 = base64_8.readResults(byteArray16, (int) (byte) 1, (int) (short) 0);
        byte[] byteArray20 = new byte[] {};
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray20);
        int int24 = base64_8.readResults(byteArray21, (int) (short) -1, 1);
        byte[] byteArray25 = new byte[] {};
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray25);
        java.math.BigInteger bigInteger28 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray25);
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger28);
        byte[] byteArray30 = base64_8.decode(byteArray29);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 65, (byte) 65, (byte) 69, (byte) 75 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray1);
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray6, false);
        boolean boolean9 = base64_8.hasData();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray13, false);
        java.lang.String str16 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray13);
        byte[] byteArray17 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray13);
        byte[] byteArray18 = base64_8.encode(byteArray17);
        base64_2.decode(byteArray17, (int) ' ', (int) (short) -1);
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray25, false, true, (int) (short) 10);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray29);
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray29, false);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray29);
        base64_2.encode(byteArray33, 76, 1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "AQE" + "'", str16, "AQE");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 65, (byte) 81, (byte) 69, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 65, (byte) 65, (byte) 69, (byte) 75 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 65, (byte) 65, (byte) 69, (byte) 75 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 70, (byte) 83, (byte) 119, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, true, (int) (short) 10);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray8);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8, false);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray8);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(100, byteArray12);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 65, (byte) 65, (byte) 69, (byte) 75 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 65, (byte) 65, (byte) 69, (byte) 75 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 70, (byte) 83, (byte) 119, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(100, byteArray5, false);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray15, false);
        java.lang.String str18 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray15);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray15);
        byte[] byteArray20 = base64_11.decode(byteArray15);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray15);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AQE" + "'", str18, "AQE");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 65, (byte) 81, (byte) 69 });
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray4, false);
        boolean boolean7 = base64_6.hasData();
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray11, false);
        java.lang.String str14 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray11);
        byte[] byteArray15 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray11);
        byte[] byteArray16 = base64_6.encode(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) (byte) 10, byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [AQE=]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "AQE" + "'", str14, "AQE");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 65, (byte) 81, (byte) 69, (byte) 61 });
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        java.math.BigInteger bigInteger3 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray0);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger3);
        java.lang.Class<?> wildcardClass6 = bigInteger3.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, true, false);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6, false, true, 100);
        java.lang.String str11 = base64_1.encodeToString(byteArray10);
        java.lang.String str12 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray10);
        java.math.BigInteger bigInteger13 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray10);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 97, (byte) 71, (byte) 99, (byte) 57, (byte) 80, (byte) 81, (byte) 48, (byte) 75 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "YUdjOVBRMEs\r\n" + "'", str11, "YUdjOVBRMEs\r\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "YUdjOVBRMEs=" + "'", str12, "YUdjOVBRMEs=");
        org.junit.Assert.assertNotNull(bigInteger13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 97, (byte) 71, (byte) 99, (byte) 57, (byte) 80, (byte) 81, (byte) 48, (byte) 75 });
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("YUdjOVBRMEs=");
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray1);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 97, (byte) 71, (byte) 99, (byte) 57, (byte) 80, (byte) 81, (byte) 48, (byte) 75 });
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 89, (byte) 85, (byte) 100, (byte) 106, (byte) 79, (byte) 86, (byte) 66, (byte) 82, (byte) 77, (byte) 69, (byte) 115, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 89, (byte) 85, (byte) 100, (byte) 106, (byte) 79, (byte) 86, (byte) 66, (byte) 82, (byte) 77, (byte) 69, (byte) 115, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 97, (byte) 71, (byte) 99, (byte) 57, (byte) 80, (byte) 81, (byte) 48, (byte) 75 });
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray7, false);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray7, false);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(100, byteArray7, false);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray18, false);
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray18, false);
        int int25 = base64_13.readResults(byteArray18, 76, (int) '#');
        byte[] byteArray26 = base64_1.decode(byteArray18);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 65, (byte) 81, (byte) 69, (byte) 61 });
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray4, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray4, false);
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12, false, true, (int) (short) 10);
        int int19 = base64_8.readResults(byteArray16, (int) (byte) 1, (int) (short) 0);
        byte[] byteArray20 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray16);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 65, (byte) 65, (byte) 69, (byte) 75 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 70, (byte) 83, (byte) 119, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        java.math.BigInteger bigInteger3 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray0);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger3);
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger3);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        java.math.BigInteger bigInteger3 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray0);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger3);
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger5);
        boolean boolean7 = org.apache.commons.codec.binary.Base64.isBase64(byteArray6);
        java.lang.String str8 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray6);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        boolean boolean6 = base64_5.hasData();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, true, (int) (short) 10);
        byte[] byteArray15 = base64_5.encode(byteArray14);
        boolean boolean16 = base64_5.hasData();
        boolean boolean17 = base64_5.hasData();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 65, (byte) 65, (byte) 69, (byte) 75 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 70, (byte) 83, (byte) 119, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        java.math.BigInteger bigInteger3 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray0);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger3);
        java.math.BigInteger bigInteger5 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        java.lang.String str6 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray4);
        java.lang.Class<?> wildcardClass7 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
        org.junit.Assert.assertNotNull(bigInteger5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray4, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray4, false);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray12, false);
        boolean boolean15 = base64_14.hasData();
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19, false, true, (int) (short) 10);
        byte[] byteArray24 = base64_14.encode(byteArray23);
        byte[] byteArray25 = base64_8.decode(byteArray23);
        boolean boolean26 = base64_8.hasData();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 65, (byte) 65, (byte) 69, (byte) 75 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 70, (byte) 83, (byte) 119, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        boolean boolean6 = base64_5.hasData();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, true, (int) (short) 10);
        byte[] byteArray15 = base64_5.encode(byteArray14);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray20, false);
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray20, false);
        byte[] byteArray28 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        byte[] byteArray32 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray28, false, true, (int) (short) 10);
        int int35 = base64_24.readResults(byteArray32, (int) (byte) 1, (int) (short) 0);
        byte[] byteArray38 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray32, true, false);
        byte[] byteArray39 = base64_5.decode(byteArray38);
        byte[] byteArray41 = base64_5.decode("hg==");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 65, (byte) 65, (byte) 69, (byte) 75 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 70, (byte) 83, (byte) 119, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 65, (byte) 65, (byte) 69, (byte) 75 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 70, (byte) 83, (byte) 119, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 65, (byte) 65, (byte) 69, (byte) 75 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) -122 });
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray4, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray4, false);
        byte[] byteArray10 = base64_8.decode("");
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray10);
        java.lang.String str12 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray11);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray4, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray4, false);
        byte[] byteArray10 = base64_8.decode("");
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray10);
        boolean boolean12 = org.apache.commons.codec.binary.Base64.isBase64(byteArray10);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        byte[] byteArray0 = new byte[] {};
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray0);
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray0);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray2);
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray3);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray4, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray4, false);
        byte[] byteArray10 = base64_8.decode("");
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray10);
        java.lang.Class<?> wildcardClass12 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 65, (byte) 81, (byte) 69 });
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(100, byteArray5, false);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray16, false);
        org.apache.commons.codec.binary.Base64 base64_20 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray16, false);
        int int23 = base64_11.readResults(byteArray16, 76, (int) '#');
        boolean boolean24 = org.apache.commons.codec.binary.Base64.isBase64(byteArray16);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray5, false);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(100, byteArray5, false);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_17 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray15, false);
        java.lang.String str18 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray15);
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray15);
        byte[] byteArray20 = base64_11.decode(byteArray15);
        byte[] byteArray22 = base64_11.decode("AQE");
        boolean boolean23 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray22);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "AQE" + "'", str18, "AQE");
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        java.math.BigInteger bigInteger6 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray3);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger6);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger6);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray4, false);
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray4, false);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, false, false);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4, true, true);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 65, (byte) 81, (byte) 69, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 65, (byte) 81, (byte) 69, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 65, (byte) 81, (byte) 69, (byte) 13, (byte) 10 });
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test95");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 0);
        byte[] byteArray3 = org.apache.commons.codec.binary.Base64.decodeBase64("hi!");
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray3, true, false);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray3);
        java.lang.String str8 = base64_1.encodeToString(byteArray7);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) -122 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 104, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test96");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        boolean boolean6 = base64_5.hasData();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false, true, (int) (short) 10);
        byte[] byteArray15 = base64_5.encode(byteArray14);
        byte[] byteArray16 = null;
        byte[] byteArray17 = base64_5.encode(byteArray16);
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = base64_5.encode(obj18);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 65, (byte) 65, (byte) 69, (byte) 75 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 70, (byte) 83, (byte) 119, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNull(byteArray17);
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test97");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray2 = base64_0.decode("AQE");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray7, false);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray7, false);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 1, (byte) 10 };
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray15, false, true, (int) (short) 10);
        int int22 = base64_11.readResults(byteArray19, (int) (byte) 1, (int) (short) 0);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19, true, false);
        java.lang.String str26 = base64_0.encodeToString(byteArray25);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0, (byte) 1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 65, (byte) 65, (byte) 69, (byte) 75 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 81, (byte) 85, (byte) 70, (byte) 70, (byte) 83, (byte) 119, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "UVVGRlN3PT0NCg==" + "'", str26, "UVVGRlN3PT0NCg==");
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test98");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray2 = base64_0.decode("hi!");
        boolean boolean3 = base64_0.hasData();
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64();
        byte[] byteArray6 = base64_4.decode("hi!");
        java.lang.String str7 = base64_0.encodeToString(byteArray6);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -122 });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -122 });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hg==" + "'", str7, "hg==");
    }

    @Test
    public void test99() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test99");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        boolean boolean6 = base64_5.hasData();
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        byte[] byteArray8 = base64_5.encode(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray7);
        java.lang.String str10 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray9);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 68, (byte) 81, (byte) 111, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }
}

