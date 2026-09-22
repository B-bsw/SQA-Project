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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = base64_1.encode((java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        base64_1.setInitialBuffer(byteArray7, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray18 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray17);
        base64_12.setInitialBuffer(byteArray18, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_23 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str31 = base64_23.encodeToString(byteArray30);
        byte[] byteArray32 = base64_12.encode(byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.decode(byteArray30, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "AWQBAAAB" + "'", str31, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int0 = org.apache.commons.codec.binary.Base64.CHUNK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 76 + "'", int0 == 76);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        java.lang.String str2 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) -1 });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_w" + "'", str2, "_w");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str9 = base64_1.encodeToString(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = base64_1.encode((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AWQBAAAB" + "'", str9, "AWQBAAAB");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        base64_1.setInitialBuffer(byteArray7, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str20 = base64_12.encodeToString(byteArray19);
        byte[] byteArray21 = base64_1.encode(byteArray19);
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray22, true, false, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input array too big, the output array would be bigger (18) than the specified maxium size of -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AWQBAAAB" + "'", str20, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 81, (byte) 86, (byte) 100, (byte) 82, (byte) 81, (byte) 107, (byte) 70, (byte) 66, (byte) 81, (byte) 85, (byte) 73 });
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        byte[] byteArray0 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR;
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] { (byte) 13, (byte) 10 });
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray7);
        base64_2.setInitialBuffer(byteArray8, 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0, byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [dd??]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(false);
        boolean boolean2 = base64_1.isUrlSafe();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray7);
        base64_2.setInitialBuffer(byteArray8, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str21 = base64_13.encodeToString(byteArray20);
        byte[] byteArray22 = base64_2.encode(byteArray20);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64((int) (byte) 1, byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [AWQBAAAB]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AWQBAAAB" + "'", str21, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 81, (byte) 86, (byte) 100, (byte) 82, (byte) 81, (byte) 107, (byte) 70, (byte) 66, (byte) 81, (byte) 85, (byte) 73 });
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((-1), byteArray4);
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray12);
        base64_7.setInitialBuffer(byteArray13, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_18 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str26 = base64_18.encodeToString(byteArray25);
        byte[] byteArray27 = base64_7.encode(byteArray25);
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray27);
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray27, false);
        // The following exception was thrown during execution in test generation
        try {
            base64_5.encode(byteArray30, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "AWQBAAAB" + "'", str26, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 81, (byte) 86, (byte) 100, (byte) 82, (byte) 81, (byte) 107, (byte) 70, (byte) 66, (byte) 81, (byte) 85, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 81, (byte) 86, (byte) 100, (byte) 82, (byte) 81, (byte) 107, (byte) 70, (byte) 66, (byte) 81, (byte) 85, (byte) 73, (byte) 61 });
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((-1), byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray9, false);
        base64_5.setInitialBuffer(byteArray9, (int) (short) -1, (int) (short) 10);
        boolean boolean15 = base64_5.isUrlSafe();
        boolean boolean16 = base64_5.hasData();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str9 = base64_1.encodeToString(byteArray8);
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str19 = base64_11.encodeToString(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = base64_1.encode((java.lang.Object) base64_11);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AWQBAAAB" + "'", str9, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "AWQBAAAB" + "'", str19, "AWQBAAAB");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 65, (byte) 65, (byte) 111, (byte) 65, (byte) 65, (byte) 81, (byte) 69, (byte) 65 });
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray8);
        base64_3.setInitialBuffer(byteArray9, 1, (int) (short) -1);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray13, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 90, (byte) 71, (byte) 84, (byte) 47, (byte) 65, (byte) 65, (byte) 61, (byte) 61 });
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("");
        byte[] byteArray4 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false, true);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray1 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str9 = base64_1.encodeToString(byteArray8);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((-1), byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14);
        boolean boolean17 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray14);
        base64_1.decode(byteArray14, (int) (short) 100, 0);
        java.lang.Class<?> wildcardClass21 = base64_1.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AWQBAAAB" + "'", str9, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((-1), byteArray6);
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray11, false);
        base64_7.setInitialBuffer(byteArray11, (int) (short) -1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray11, (int) (short) 1, 76);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 0 });
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = base64_1.encode((java.lang.Object) base64_3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        boolean boolean2 = base64_1.isUrlSafe();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(100);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        base64_1.setInitialBuffer(byteArray7, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str20 = base64_12.encodeToString(byteArray19);
        byte[] byteArray21 = base64_1.encode(byteArray19);
        boolean boolean22 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray29);
        base64_24.setInitialBuffer(byteArray30, 1, (int) (short) -1);
        base64_1.setInitialBuffer(byteArray30, (int) (byte) 0, 0);
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray30);
        java.lang.Class<?> wildcardClass38 = byteArray37.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AWQBAAAB" + "'", str20, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        base64_1.setInitialBuffer(byteArray7, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str20 = base64_12.encodeToString(byteArray19);
        byte[] byteArray21 = base64_1.encode(byteArray19);
        boolean boolean22 = base64_1.hasData();
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray27);
        base64_1.decode(byteArray27, (int) '#', 76);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.decodeBase64("CgoB");
        base64_1.decode(byteArray33, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AWQBAAAB" + "'", str20, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 90, (byte) 71, (byte) 84, (byte) 95, (byte) 65, (byte) 65 });
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        base64_1.setInitialBuffer(byteArray7, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str20 = base64_12.encodeToString(byteArray19);
        byte[] byteArray21 = base64_1.encode(byteArray19);
        boolean boolean22 = base64_1.hasData();
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray27);
        base64_1.decode(byteArray27, (int) '#', 76);
        boolean boolean32 = base64_1.hasData();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AWQBAAAB" + "'", str20, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((-1), byteArray4);
        boolean boolean6 = base64_5.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        base64_1.setInitialBuffer(byteArray7, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str20 = base64_12.encodeToString(byteArray19);
        byte[] byteArray21 = base64_1.encode(byteArray19);
        boolean boolean22 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray29);
        base64_24.setInitialBuffer(byteArray30, 1, (int) (short) -1);
        base64_1.setInitialBuffer(byteArray30, (int) (byte) 0, 0);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_42 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray40, false);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_50 = new org.apache.commons.codec.binary.Base64(0, byteArray48, true);
        byte[] byteArray51 = base64_42.encode(byteArray48);
        byte[] byteArray52 = base64_1.encode(byteArray51);
        org.apache.commons.codec.binary.Base64 base64_54 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray59 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray60 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray59);
        base64_54.setInitialBuffer(byteArray60, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_65 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str73 = base64_65.encodeToString(byteArray72);
        byte[] byteArray74 = base64_54.encode(byteArray72);
        byte[] byteArray75 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray74);
        byte[] byteArray76 = base64_1.encode(byteArray74);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AWQBAAAB" + "'", str20, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 67, (byte) 103, (byte) 114, (byte) 47, (byte) 67, (byte) 103, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 121, (byte) 76, (byte) 48, (byte) 78, (byte) 110, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "AWQBAAAB" + "'", str73, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 81, (byte) 86, (byte) 100, (byte) 82, (byte) 81, (byte) 107, (byte) 70, (byte) 66, (byte) 81, (byte) 85, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 81, (byte) 86, (byte) 100, (byte) 82, (byte) 81, (byte) 107, (byte) 70, (byte) 66, (byte) 81, (byte) 85, (byte) 73, (byte) 61 });
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(0, byteArray11, true);
        byte[] byteArray14 = base64_5.encode(byteArray11);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64(0, byteArray20, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = base64_5.encode((java.lang.Object) base64_22);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 67, (byte) 103, (byte) 114, (byte) 47, (byte) 67, (byte) 103, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((-1), byteArray4);
        boolean boolean6 = base64_5.hasData();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) ' ');
        boolean boolean2 = base64_1.hasData();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(0, byteArray11, true);
        byte[] byteArray14 = base64_5.encode(byteArray11);
        java.lang.String str15 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray14);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 67, (byte) 103, (byte) 114, (byte) 47, (byte) 67, (byte) 103, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Q2dyL0NnPT0=\r\n" + "'", str15, "Q2dyL0NnPT0=\r\n");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 10);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray8);
        base64_3.setInitialBuffer(byteArray9, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str22 = base64_14.encodeToString(byteArray21);
        byte[] byteArray23 = base64_3.encode(byteArray21);
        byte[] byteArray24 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray23);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray23, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = base64_1.encode((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base64 encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AWQBAAAB" + "'", str22, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 81, (byte) 86, (byte) 100, (byte) 82, (byte) 81, (byte) 107, (byte) 70, (byte) 66, (byte) 81, (byte) 85, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 81, (byte) 86, (byte) 100, (byte) 82, (byte) 81, (byte) 107, (byte) 70, (byte) 66, (byte) 81, (byte) 85, (byte) 73, (byte) 61 });
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        base64_1.setInitialBuffer(byteArray7, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str20 = base64_12.encodeToString(byteArray19);
        byte[] byteArray21 = base64_1.encode(byteArray19);
        boolean boolean22 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray29);
        base64_24.setInitialBuffer(byteArray30, 1, (int) (short) -1);
        base64_1.setInitialBuffer(byteArray30, (int) (byte) 0, 0);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_42 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray40, false);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_50 = new org.apache.commons.codec.binary.Base64(0, byteArray48, true);
        byte[] byteArray51 = base64_42.encode(byteArray48);
        byte[] byteArray52 = base64_1.encode(byteArray51);
        org.apache.commons.codec.binary.Base64 base64_54 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray59 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray60 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray59);
        base64_54.setInitialBuffer(byteArray60, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_65 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str73 = base64_65.encodeToString(byteArray72);
        byte[] byteArray74 = base64_54.encode(byteArray72);
        byte[] byteArray75 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray74);
        byte[] byteArray76 = base64_1.encode(byteArray75);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AWQBAAAB" + "'", str20, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 67, (byte) 103, (byte) 114, (byte) 47, (byte) 67, (byte) 103, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 121, (byte) 76, (byte) 48, (byte) 78, (byte) 110, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "AWQBAAAB" + "'", str73, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 81, (byte) 86, (byte) 100, (byte) 82, (byte) 81, (byte) 107, (byte) 70, (byte) 66, (byte) 81, (byte) 85, (byte) 73 });
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 85, (byte) 86, (byte) 90, (byte) 107, (byte) 85, (byte) 108, (byte) 70, (byte) 114, (byte) 82, (byte) 107, (byte) 74, (byte) 82, (byte) 86, (byte) 85, (byte) 107, (byte) 61 });
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        base64_1.setInitialBuffer(byteArray7, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str20 = base64_12.encodeToString(byteArray19);
        byte[] byteArray21 = base64_1.encode(byteArray19);
        boolean boolean22 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray29);
        base64_24.setInitialBuffer(byteArray30, 1, (int) (short) -1);
        base64_1.setInitialBuffer(byteArray30, (int) (byte) 0, 0);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_42 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray40, false);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_50 = new org.apache.commons.codec.binary.Base64(0, byteArray48, true);
        byte[] byteArray51 = base64_42.encode(byteArray48);
        byte[] byteArray52 = base64_1.encode(byteArray51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = base64_1.decode((java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base64 decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AWQBAAAB" + "'", str20, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 67, (byte) 103, (byte) 114, (byte) 47, (byte) 67, (byte) 103, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 121, (byte) 76, (byte) 48, (byte) 78, (byte) 110, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((-1), byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray4);
        boolean boolean7 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray4);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray4);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray8);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 118, (byte) 81, (byte) 103 });
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("CgoB");
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false, true, (int) ' ');
        java.lang.String str6 = org.apache.commons.codec.binary.Base64.encodeBase64String(byteArray5);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Q2dvQg==\r\n" + "'", str6, "Q2dvQg==\r\n");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) '4');
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_7 = new org.apache.commons.codec.binary.Base64((-1), byteArray6);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64((-1), byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray12);
        boolean boolean15 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray12);
        base64_7.encode(byteArray12, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            base64_1.encode(byteArray12, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((-1), byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray9, false);
        base64_5.setInitialBuffer(byteArray9, (int) (short) -1, (int) (short) 10);
        byte[] byteArray16 = base64_5.decode("_w");
        byte[] byteArray18 = base64_5.decode("AWQBAAAB");
        byte[] byteArray19 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        base64_1.setInitialBuffer(byteArray7, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str20 = base64_12.encodeToString(byteArray19);
        byte[] byteArray21 = base64_1.encode(byteArray19);
        byte[] byteArray25 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray19, false, true, (int) (short) 10);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray19);
        java.math.BigInteger bigInteger27 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray19);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AWQBAAAB" + "'", str20, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertNotNull(bigInteger27);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) '#');
        boolean boolean2 = base64_1.isUrlSafe();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (byte) 0);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        base64_1.setInitialBuffer(byteArray7, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str20 = base64_12.encodeToString(byteArray19);
        byte[] byteArray21 = base64_1.encode(byteArray19);
        boolean boolean22 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray29);
        base64_24.setInitialBuffer(byteArray30, 1, (int) (short) -1);
        base64_1.setInitialBuffer(byteArray30, (int) (byte) 0, 0);
        byte[] byteArray37 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray41 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray30, false, false, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input array too big, the output array would be bigger (10) than the specified maxium size of -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AWQBAAAB" + "'", str20, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("Q2dyL0NnPT0=\r\n");
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 67, (byte) 103, (byte) 114, (byte) 47, (byte) 67, (byte) 103, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 121, (byte) 76, (byte) 48, (byte) 78, (byte) 110, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        base64_1.setInitialBuffer(byteArray7, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str20 = base64_12.encodeToString(byteArray19);
        byte[] byteArray21 = base64_1.encode(byteArray19);
        byte[] byteArray23 = base64_1.decode("QVdRQkFBQUI\r\n");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AWQBAAAB" + "'", str20, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        base64_1.setInitialBuffer(byteArray7, 1, (int) (short) -1);
        byte[] byteArray11 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray7);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray7);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 90, (byte) 71, (byte) 84, (byte) 47, (byte) 65, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 90, (byte) 71, (byte) 84, (byte) 47, (byte) 65, (byte) 65, (byte) 61, (byte) 61 });
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        base64_1.setInitialBuffer(byteArray7, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str20 = base64_12.encodeToString(byteArray19);
        byte[] byteArray21 = base64_1.encode(byteArray19);
        boolean boolean22 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray29);
        base64_24.setInitialBuffer(byteArray30, 1, (int) (short) -1);
        base64_1.setInitialBuffer(byteArray30, (int) (byte) 0, 0);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_42 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray40, false);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_50 = new org.apache.commons.codec.binary.Base64(0, byteArray48, true);
        byte[] byteArray51 = base64_42.encode(byteArray48);
        byte[] byteArray52 = base64_1.encode(byteArray51);
        org.apache.commons.codec.binary.Base64 base64_54 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str62 = base64_54.encodeToString(byteArray61);
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_68 = new org.apache.commons.codec.binary.Base64((-1), byteArray67);
        byte[] byteArray69 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray67);
        boolean boolean70 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray67);
        base64_54.decode(byteArray67, (int) (short) 100, 0);
        byte[] byteArray74 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray67);
        byte[] byteArray75 = base64_1.decode(byteArray67);
        byte[] byteArray79 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray67, false, false, 10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray83 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray79, false, false, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Input array too big, the output array would be bigger (10) than the specified maxium size of 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AWQBAAAB" + "'", str20, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 67, (byte) 103, (byte) 114, (byte) 47, (byte) 67, (byte) 103, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 121, (byte) 76, (byte) 48, (byte) 78, (byte) 110, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "AWQBAAAB" + "'", str62, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        byte[] byteArray2 = org.apache.commons.codec.binary.Base64.decodeBase64("Q2dvQg==\r\n");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64((int) (byte) -1, byteArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [CgoB]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((-1), byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        java.lang.String str7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray4);
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10, false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CgoB" + "'", str7, "CgoB");
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray4);
        boolean boolean6 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray4);
        java.math.BigInteger bigInteger7 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 117 });
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((-1), byteArray4);
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((-1), byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray10);
        boolean boolean13 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray10);
        base64_5.encode(byteArray10, (int) (byte) 1, (int) (byte) 0);
        byte[] byteArray23 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64(0, byteArray23, true);
        java.lang.String str26 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray23);
        org.apache.commons.codec.binary.Base64 base64_27 = new org.apache.commons.codec.binary.Base64((int) (byte) 100, byteArray23);
        int int30 = base64_5.readResults(byteArray23, (int) '4', 76);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Cgr_Cg" + "'", str26, "Cgr_Cg");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        base64_1.setInitialBuffer(byteArray7, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str20 = base64_12.encodeToString(byteArray19);
        byte[] byteArray21 = base64_1.encode(byteArray19);
        boolean boolean22 = base64_1.hasData();
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray27);
        base64_1.decode(byteArray27, (int) '#', 76);
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str41 = base64_33.encodeToString(byteArray40);
        byte[] byteArray46 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_47 = new org.apache.commons.codec.binary.Base64((-1), byteArray46);
        byte[] byteArray48 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray46);
        boolean boolean49 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray46);
        base64_33.decode(byteArray46, (int) (short) 100, 0);
        byte[] byteArray53 = base64_1.encode(byteArray46);
        byte[] byteArray54 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray53);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AWQBAAAB" + "'", str20, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "AWQBAAAB" + "'", str41, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((-1), byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray9, false);
        base64_5.setInitialBuffer(byteArray9, (int) (short) -1, (int) (short) 10);
        boolean boolean15 = base64_5.isUrlSafe();
        byte[] byteArray16 = null;
        java.lang.String str17 = base64_5.encodeToString(byteArray16);
        boolean boolean18 = base64_5.hasData();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_6 = new org.apache.commons.codec.binary.Base64((-1), byteArray5);
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray5);
        boolean boolean8 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray5);
        org.apache.commons.codec.binary.Base64 base64_9 = new org.apache.commons.codec.binary.Base64((int) (byte) 100, byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64((int) (short) 100, byteArray1);
        org.apache.commons.codec.binary.Base64 base64_4 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray9);
        base64_4.setInitialBuffer(byteArray10, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str23 = base64_15.encodeToString(byteArray22);
        byte[] byteArray24 = base64_4.encode(byteArray22);
        boolean boolean25 = base64_4.hasData();
        org.apache.commons.codec.binary.Base64 base64_27 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray32);
        base64_27.setInitialBuffer(byteArray33, 1, (int) (short) -1);
        base64_4.setInitialBuffer(byteArray33, (int) (byte) 0, 0);
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_45 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray43, false);
        byte[] byteArray51 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_53 = new org.apache.commons.codec.binary.Base64(0, byteArray51, true);
        byte[] byteArray54 = base64_45.encode(byteArray51);
        byte[] byteArray55 = base64_4.encode(byteArray54);
        org.apache.commons.codec.binary.Base64 base64_57 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str65 = base64_57.encodeToString(byteArray64);
        byte[] byteArray70 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_71 = new org.apache.commons.codec.binary.Base64((-1), byteArray70);
        byte[] byteArray72 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray70);
        boolean boolean73 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray70);
        base64_57.decode(byteArray70, (int) (short) 100, 0);
        byte[] byteArray77 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray70);
        byte[] byteArray78 = base64_4.decode(byteArray70);
        byte[] byteArray82 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray70, false, false, 10);
        byte[] byteArray83 = base64_2.decode(byteArray70);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AWQBAAAB" + "'", str23, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 67, (byte) 103, (byte) 114, (byte) 47, (byte) 67, (byte) 103, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 121, (byte) 76, (byte) 48, (byte) 78, (byte) 110, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "AWQBAAAB" + "'", str65, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] {});
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        base64_1.setInitialBuffer(byteArray7, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str20 = base64_12.encodeToString(byteArray19);
        byte[] byteArray21 = base64_1.encode(byteArray19);
        boolean boolean22 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray29);
        base64_24.setInitialBuffer(byteArray30, 1, (int) (short) -1);
        base64_1.setInitialBuffer(byteArray30, (int) (byte) 0, 0);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_42 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray40, false);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_50 = new org.apache.commons.codec.binary.Base64(0, byteArray48, true);
        byte[] byteArray51 = base64_42.encode(byteArray48);
        byte[] byteArray52 = base64_1.encode(byteArray51);
        org.apache.commons.codec.binary.Base64 base64_54 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str62 = base64_54.encodeToString(byteArray61);
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_68 = new org.apache.commons.codec.binary.Base64((-1), byteArray67);
        byte[] byteArray69 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray67);
        boolean boolean70 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray67);
        base64_54.decode(byteArray67, (int) (short) 100, 0);
        byte[] byteArray74 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray67);
        byte[] byteArray75 = base64_1.decode(byteArray67);
        java.lang.String str76 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray67);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AWQBAAAB" + "'", str20, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 67, (byte) 103, (byte) 114, (byte) 47, (byte) 67, (byte) 103, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 121, (byte) 76, (byte) 48, (byte) 78, (byte) 110, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "AWQBAAAB" + "'", str62, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "CgoB" + "'", str76, "CgoB");
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray7);
        base64_2.setInitialBuffer(byteArray8, 1, (int) (short) -1);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64((int) 'a', byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [dd??]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 90, (byte) 71, (byte) 84, (byte) 47, (byte) 65, (byte) 65, (byte) 61, (byte) 61 });
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((-1), byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        java.lang.String str7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray4);
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CgoB" + "'", str7, "CgoB");
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((-1), byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray9, false);
        base64_5.setInitialBuffer(byteArray9, (int) (short) -1, (int) (short) 10);
        byte[] byteArray16 = base64_5.decode("_w");
        byte[] byteArray18 = base64_5.decode("AWQBAAAB");
        java.lang.Class<?> wildcardClass19 = base64_5.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        base64_1.setInitialBuffer(byteArray7, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str20 = base64_12.encodeToString(byteArray19);
        byte[] byteArray21 = base64_1.encode(byteArray19);
        boolean boolean22 = base64_1.hasData();
        org.apache.commons.codec.binary.Base64 base64_24 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray30 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray29);
        base64_24.setInitialBuffer(byteArray30, 1, (int) (short) -1);
        base64_1.setInitialBuffer(byteArray30, (int) (byte) 0, 0);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_42 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray40, false);
        byte[] byteArray48 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_50 = new org.apache.commons.codec.binary.Base64(0, byteArray48, true);
        byte[] byteArray51 = base64_42.encode(byteArray48);
        byte[] byteArray52 = base64_1.encode(byteArray51);
        org.apache.commons.codec.binary.Base64 base64_54 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray61 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str62 = base64_54.encodeToString(byteArray61);
        byte[] byteArray67 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_68 = new org.apache.commons.codec.binary.Base64((-1), byteArray67);
        byte[] byteArray69 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray67);
        boolean boolean70 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray67);
        base64_54.decode(byteArray67, (int) (short) 100, 0);
        byte[] byteArray74 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray67);
        byte[] byteArray75 = base64_1.decode(byteArray67);
        byte[] byteArray79 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray67, false, false, 10);
        java.lang.String str80 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray67);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AWQBAAAB" + "'", str20, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 67, (byte) 103, (byte) 114, (byte) 47, (byte) 67, (byte) 103, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 81, (byte) 50, (byte) 100, (byte) 121, (byte) 76, (byte) 48, (byte) 78, (byte) 110, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray61);
        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "AWQBAAAB" + "'", str62, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "CgoB" + "'", str80, "CgoB");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray7);
        base64_2.setInitialBuffer(byteArray8, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str21 = base64_13.encodeToString(byteArray20);
        byte[] byteArray22 = base64_2.encode(byteArray20);
        boolean boolean23 = base64_2.hasData();
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray30 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray30);
        base64_25.setInitialBuffer(byteArray31, 1, (int) (short) -1);
        base64_2.setInitialBuffer(byteArray31, (int) (byte) 0, 0);
        byte[] byteArray38 = base64_0.encode(byteArray31);
        boolean boolean39 = base64_0.isUrlSafe();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AWQBAAAB" + "'", str21, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 90, (byte) 71, (byte) 84, (byte) 47, (byte) 65, (byte) 65, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64((int) (short) 0);
        boolean boolean2 = base64_1.isUrlSafe();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        byte[] byteArray11 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(0, byteArray11, true);
        byte[] byteArray14 = base64_5.encode(byteArray11);
        java.lang.String str15 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray11);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 67, (byte) 103, (byte) 114, (byte) 47, (byte) 67, (byte) 103, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Cgr_Cg" + "'", str15, "Cgr_Cg");
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((-1), byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray9, false);
        base64_5.setInitialBuffer(byteArray9, (int) (short) -1, (int) (short) 10);
        byte[] byteArray16 = base64_5.decode("_w");
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_22 = new org.apache.commons.codec.binary.Base64((-1), byteArray21);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray21);
        base64_5.encode(byteArray21, 0, 100);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray7);
        base64_2.setInitialBuffer(byteArray8, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str21 = base64_13.encodeToString(byteArray20);
        byte[] byteArray22 = base64_2.encode(byteArray20);
        byte[] byteArray26 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray20, false, true, (int) (short) 10);
        java.lang.String str27 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_29 = new org.apache.commons.codec.binary.Base64(76, byteArray26, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [AWQBAAAB]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AWQBAAAB" + "'", str21, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "QVdRQkFBQUI" + "'", str27, "QVdRQkFBQUI");
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str9 = base64_1.encodeToString(byteArray8);
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_15 = new org.apache.commons.codec.binary.Base64((-1), byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14);
        boolean boolean17 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray14);
        base64_1.decode(byteArray14, (int) (short) 100, 0);
        byte[] byteArray21 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14);
        byte[] byteArray23 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray14, true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AWQBAAAB" + "'", str9, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66, (byte) 13, (byte) 10 });
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        org.apache.commons.codec.binary.Base64 base64_0 = new org.apache.commons.codec.binary.Base64();
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray7);
        base64_2.setInitialBuffer(byteArray8, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str21 = base64_13.encodeToString(byteArray20);
        byte[] byteArray22 = base64_2.encode(byteArray20);
        boolean boolean23 = base64_2.hasData();
        org.apache.commons.codec.binary.Base64 base64_25 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray30 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray30);
        base64_25.setInitialBuffer(byteArray31, 1, (int) (short) -1);
        base64_2.setInitialBuffer(byteArray31, (int) (byte) 0, 0);
        byte[] byteArray38 = base64_0.encode(byteArray31);
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray38);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AWQBAAAB" + "'", str21, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 90, (byte) 71, (byte) 84, (byte) 47, (byte) 65, (byte) 65, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 87, (byte) 107, (byte) 100, (byte) 85, (byte) 76, (byte) 48, (byte) 70, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 78, (byte) 67, (byte) 103, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray3, false);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.encodeBase64Chunked(byteArray3);
        java.lang.String str7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray6);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 65, (byte) 81, (byte) 65, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "QVFBPQ0K" + "'", str7, "QVFBPQ0K");
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray8);
        base64_3.setInitialBuffer(byteArray9, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str22 = base64_14.encodeToString(byteArray21);
        byte[] byteArray23 = base64_3.encode(byteArray21);
        java.lang.String str24 = base64_1.encodeToString(byteArray23);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_30 = new org.apache.commons.codec.binary.Base64((-1), byteArray29);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray29);
        java.lang.String str32 = base64_1.encodeToString(byteArray31);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray31);
        byte[] byteArray34 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafe(byteArray33);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AWQBAAAB" + "'", str22, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "QVdRQkFBQUI\r\n" + "'", str24, "QVdRQkFBQUI\r\n");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(true);
        org.apache.commons.codec.binary.Base64 base64_3 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray8);
        base64_3.setInitialBuffer(byteArray9, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_14 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str22 = base64_14.encodeToString(byteArray21);
        byte[] byteArray23 = base64_3.encode(byteArray21);
        java.lang.String str24 = base64_1.encodeToString(byteArray23);
        byte[] byteArray29 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_30 = new org.apache.commons.codec.binary.Base64((-1), byteArray29);
        byte[] byteArray31 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray29);
        java.lang.String str32 = base64_1.encodeToString(byteArray31);
        byte[] byteArray33 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray31);
        boolean boolean34 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray33);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AWQBAAAB" + "'", str22, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "QVdRQkFBQUI\r\n" + "'", str24, "QVdRQkFBQUI\r\n");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        org.apache.commons.codec.binary.Base64 base64_1 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray7 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray6);
        base64_1.setInitialBuffer(byteArray7, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_12 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str20 = base64_12.encodeToString(byteArray19);
        byte[] byteArray21 = base64_1.encode(byteArray19);
        boolean boolean22 = base64_1.hasData();
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray28 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray27);
        base64_1.decode(byteArray27, (int) '#', 76);
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray39 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray38);
        base64_33.setInitialBuffer(byteArray39, 1, (int) (short) -1);
        byte[] byteArray43 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray39);
        boolean boolean44 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray43);
        byte[] byteArray47 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray43, true, false);
        byte[] byteArray48 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray43);
        int int51 = base64_1.readResults(byteArray43, (-1), (int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "AWQBAAAB" + "'", str20, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 90, (byte) 71, (byte) 84, (byte) 47, (byte) 65, (byte) 65, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 87, (byte) 107, (byte) 100, (byte) 85, (byte) 76, (byte) 48, (byte) 70, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 87, (byte) 107, (byte) 100, (byte) 85, (byte) 76, (byte) 48, (byte) 70, (byte) 66, (byte) 80, (byte) 84, (byte) 48, (byte) 61 });
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((-1), byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        java.lang.String str7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray4);
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger8);
        boolean boolean11 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray10);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CgoB" + "'", str7, "CgoB");
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray7);
        base64_2.setInitialBuffer(byteArray8, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str21 = base64_13.encodeToString(byteArray20);
        byte[] byteArray22 = base64_2.encode(byteArray20);
        boolean boolean23 = base64_2.hasData();
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray28);
        base64_2.decode(byteArray28, (int) '#', 76);
        org.apache.commons.codec.binary.Base64 base64_34 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str42 = base64_34.encodeToString(byteArray41);
        byte[] byteArray47 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_48 = new org.apache.commons.codec.binary.Base64((-1), byteArray47);
        byte[] byteArray49 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray47);
        boolean boolean50 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray47);
        base64_34.decode(byteArray47, (int) (short) 100, 0);
        byte[] byteArray54 = base64_2.encode(byteArray47);
        org.apache.commons.codec.binary.Base64 base64_56 = new org.apache.commons.codec.binary.Base64((int) '#', byteArray47, false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AWQBAAAB" + "'", str21, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "AWQBAAAB" + "'", str42, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64 base64_8 = new org.apache.commons.codec.binary.Base64(0, byteArray6, true);
        org.apache.commons.codec.binary.Base64 base64_10 = new org.apache.commons.codec.binary.Base64(0, byteArray6, false);
        java.lang.String str11 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray6);
        byte[] byteArray12 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6);
        byte[] byteArray13 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Cgr_Cg" + "'", str11, "Cgr_Cg");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 67, (byte) 103, (byte) 114, (byte) 47, (byte) 67, (byte) 103, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 67, (byte) 103, (byte) 114, (byte) 47, (byte) 67, (byte) 103, (byte) 61, (byte) 61 });
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((-1), byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray9, false);
        base64_5.setInitialBuffer(byteArray9, (int) (short) -1, (int) (short) 10);
        byte[] byteArray16 = base64_5.decode("_w");
        byte[] byteArray18 = base64_5.decode("AWQBAAAB");
        boolean boolean19 = base64_5.hasData();
        org.apache.commons.codec.binary.Base64 base64_21 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray27 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray26);
        base64_21.setInitialBuffer(byteArray27, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_32 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str40 = base64_32.encodeToString(byteArray39);
        byte[] byteArray41 = base64_21.encode(byteArray39);
        java.lang.String str42 = base64_5.encodeToString(byteArray39);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "AWQBAAAB" + "'", str40, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "AWQBAAAB" + "'", str42, "AWQBAAAB");
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        byte[] byteArray0 = null;
        java.lang.String str1 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray4);
        boolean boolean6 = org.apache.commons.codec.binary.Base64.isArrayByteBase64(byteArray4);
        java.lang.String str7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ZGT_AA" + "'", str7, "ZGT_AA");
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        org.apache.commons.codec.binary.Base64 base64_2 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray8 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray7);
        base64_2.setInitialBuffer(byteArray8, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_13 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str21 = base64_13.encodeToString(byteArray20);
        byte[] byteArray22 = base64_2.encode(byteArray20);
        boolean boolean23 = base64_2.hasData();
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray29 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray28);
        base64_2.decode(byteArray28, (int) '#', 76);
        org.apache.commons.codec.binary.Base64 base64_33 = new org.apache.commons.codec.binary.Base64();
        org.apache.commons.codec.binary.Base64 base64_35 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray40 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray41 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray40);
        base64_35.setInitialBuffer(byteArray41, 1, (int) (short) -1);
        org.apache.commons.codec.binary.Base64 base64_46 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.lang.String str54 = base64_46.encodeToString(byteArray53);
        byte[] byteArray55 = base64_35.encode(byteArray53);
        boolean boolean56 = base64_35.hasData();
        org.apache.commons.codec.binary.Base64 base64_58 = new org.apache.commons.codec.binary.Base64(0);
        byte[] byteArray63 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        byte[] byteArray64 = org.apache.commons.codec.binary.Base64.discardWhitespace(byteArray63);
        base64_58.setInitialBuffer(byteArray64, 1, (int) (short) -1);
        base64_35.setInitialBuffer(byteArray64, (int) (byte) 0, 0);
        byte[] byteArray71 = base64_33.encode(byteArray64);
        int int74 = base64_2.readResults(byteArray64, (int) ' ', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64 base64_76 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray64, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [dd??]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AWQBAAAB" + "'", str21, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "AWQBAAAB" + "'", str54, "AWQBAAAB");
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 90, (byte) 71, (byte) 84, (byte) 47, (byte) 65, (byte) 65, (byte) 61, (byte) 61, (byte) 13, (byte) 10 });
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        byte[] byteArray1 = org.apache.commons.codec.binary.Base64.decodeBase64("CgoB");
        byte[] byteArray5 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray1, false, true, (int) ' ');
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 67, (byte) 103, (byte) 111, (byte) 66 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        boolean boolean1 = org.apache.commons.codec.binary.Base64.isBase64((byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((-1), byteArray4);
        byte[] byteArray6 = org.apache.commons.codec.binary.Base64.decodeBase64(byteArray4);
        java.lang.String str7 = org.apache.commons.codec.binary.Base64.encodeBase64URLSafeString(byteArray4);
        java.math.BigInteger bigInteger8 = org.apache.commons.codec.binary.Base64.decodeInteger(byteArray4);
        byte[] byteArray9 = org.apache.commons.codec.binary.Base64.toIntegerBytes(bigInteger8);
        byte[] byteArray10 = org.apache.commons.codec.binary.Base64.encodeInteger(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CgoB" + "'", str7, "CgoB");
        org.junit.Assert.assertNotNull(bigInteger8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64 base64_5 = new org.apache.commons.codec.binary.Base64((-1), byteArray4);
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0 };
        org.apache.commons.codec.binary.Base64 base64_11 = new org.apache.commons.codec.binary.Base64((int) (short) -1, byteArray9, false);
        base64_5.setInitialBuffer(byteArray9, (int) (short) -1, (int) (short) 10);
        byte[] byteArray16 = base64_5.decode("_w");
        byte[] byteArray18 = base64_5.decode("AWQBAAAB");
        byte[] byteArray22 = org.apache.commons.codec.binary.Base64.encodeBase64(byteArray18, false, true, 76);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10, (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 0 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 65, (byte) 87, (byte) 81, (byte) 66, (byte) 65, (byte) 65, (byte) 65, (byte) 66 });
    }
}

