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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32((byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: pad must not be in alphabet or whitespace");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean4 = base32_2.isInAlphabet((byte) 100);
        byte[] byteArray6 = base32_2.decode("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray6, false, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: pad must not be in alphabet or whitespace");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        java.lang.Class<?> wildcardClass6 = byteArray5.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray6, true, (byte) 0);
        boolean boolean11 = base32_1.isInAlphabet(byteArray6, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = base32_1.decode((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base-N decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        boolean boolean5 = base32_1.isInAlphabet("");
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean10 = base32_8.isInAlphabet((byte) 100);
        byte[] byteArray12 = base32_8.decode("");
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) (short) 10, byteArray12, false, (byte) -1);
        org.apache.commons.codec.binary.BaseNCodec.Context context18 = null;
        // The following exception was thrown during execution in test generation
        try {
            base32_1.encode(byteArray12, 0, 0, context18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean9 = base32_7.isInAlphabet((byte) 100);
        boolean boolean11 = base32_7.isInAlphabet("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = base32_1.encode((java.lang.Object) base32_7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base-N encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32((byte) 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        byte[] byteArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32 base32_4 = new org.apache.commons.codec.binary.Base32((int) (byte) 100, byteArray1, true, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineLength 100 > 0, but lineSeparator is null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false, (byte) 100);
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_10 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray7, true, (byte) 0);
        org.apache.commons.codec.binary.BaseNCodec.Context context13 = null;
        // The following exception was thrown during execution in test generation
        try {
            base32_2.encode(byteArray7, (int) (short) 0, 0, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        boolean boolean5 = base32_1.isInAlphabet("");
        java.lang.Class<?> wildcardClass6 = base32_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_4 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean6 = base32_4.isInAlphabet((byte) 100);
        byte[] byteArray8 = base32_4.decode("");
        org.apache.commons.codec.binary.BaseNCodec.Context context11 = null;
        // The following exception was thrown during execution in test generation
        try {
            base32_2.decode(byteArray8, 0, (int) (short) -1, context11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean9 = base32_7.isInAlphabet((byte) 100);
        byte[] byteArray11 = base32_7.decode("");
        org.apache.commons.codec.binary.Base32 base32_13 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_21 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray18, true, (byte) 0);
        boolean boolean23 = base32_13.isInAlphabet(byteArray18, false);
        long long24 = base32_7.getEncodedLength(byteArray18);
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray31, true, (byte) 0);
        boolean boolean36 = base32_26.isInAlphabet(byteArray31, false);
        byte[] byteArray37 = base32_7.encode(byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = base32_1.decode((java.lang.Object) base32_7);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base-N decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 8L + "'", long24 == 8L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.codec.binary.Base32 base32_3 = new org.apache.commons.codec.binary.Base32(true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean7 = base32_5.isInAlphabet((byte) 100);
        byte[] byteArray9 = base32_5.decode("");
        org.apache.commons.codec.binary.Base32 base32_11 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_19 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray16, true, (byte) 0);
        boolean boolean21 = base32_11.isInAlphabet(byteArray16, false);
        long long22 = base32_5.getEncodedLength(byteArray16);
        org.apache.commons.codec.binary.Base32 base32_24 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_32 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray29, true, (byte) 0);
        boolean boolean34 = base32_24.isInAlphabet(byteArray29, false);
        byte[] byteArray35 = base32_5.encode(byteArray29);
        byte[] byteArray36 = base32_3.decode(byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32 base32_37 = new org.apache.commons.codec.binary.Base32((int) (short) 100, byteArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeparator must not contain Base32 characters: [AEA76===]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 8L + "'", long22 == 8L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 83, (byte) -108, (byte) 115 });
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray12, true, (byte) 0);
        boolean boolean17 = base32_7.isInAlphabet(byteArray12, false);
        long long18 = base32_1.getEncodedLength(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = base32_1.decode((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base-N decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 8L + "'", long18 == 8L);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray6, true, (byte) 0);
        org.apache.commons.codec.binary.BaseNCodec.Context context12 = null;
        // The following exception was thrown during execution in test generation
        try {
            base32_1.decode(byteArray6, (int) (byte) -1, (int) (byte) -1, context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        int int0 = org.apache.commons.codec.binary.BaseNCodec.MIME_CHUNK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 76 + "'", int0 == 76);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray12, true, (byte) 0);
        boolean boolean17 = base32_7.isInAlphabet(byteArray12, false);
        long long18 = base32_1.getEncodedLength(byteArray12);
        org.apache.commons.codec.binary.Base32 base32_20 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_28 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray25, true, (byte) 0);
        boolean boolean30 = base32_20.isInAlphabet(byteArray25, false);
        byte[] byteArray31 = base32_1.encode(byteArray25);
        java.lang.Class<?> wildcardClass32 = base32_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 8L + "'", long18 == 8L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray4, true, (byte) 0);
        boolean boolean9 = base32_7.isInAlphabet((byte) -1);
        org.apache.commons.codec.binary.Base32 base32_12 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean14 = base32_12.isInAlphabet((byte) 100);
        byte[] byteArray16 = base32_12.decode("");
        org.apache.commons.codec.binary.Base32 base32_19 = new org.apache.commons.codec.binary.Base32((int) (short) 10, byteArray16, false, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = base32_7.encode((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base-N encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        int int0 = org.apache.commons.codec.binary.BaseNCodec.PEM_CHUNK_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray12, true, (byte) 0);
        boolean boolean17 = base32_7.isInAlphabet(byteArray12, false);
        long long18 = base32_1.getEncodedLength(byteArray12);
        org.apache.commons.codec.binary.Base32 base32_20 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean22 = base32_20.isInAlphabet((byte) 100);
        byte[] byteArray24 = base32_20.decode("");
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray31, true, (byte) 0);
        boolean boolean36 = base32_26.isInAlphabet(byteArray31, false);
        long long37 = base32_20.getEncodedLength(byteArray31);
        org.apache.commons.codec.binary.Base32 base32_39 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean41 = base32_39.isInAlphabet((byte) 100);
        byte[] byteArray43 = base32_39.decode("");
        org.apache.commons.codec.binary.Base32 base32_45 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_53 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray50, true, (byte) 0);
        boolean boolean55 = base32_45.isInAlphabet(byteArray50, false);
        long long56 = base32_39.getEncodedLength(byteArray50);
        org.apache.commons.codec.binary.Base32 base32_58 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_66 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray63, true, (byte) 0);
        boolean boolean68 = base32_58.isInAlphabet(byteArray63, false);
        byte[] byteArray69 = base32_39.encode(byteArray63);
        java.lang.String str70 = base32_20.encodeAsString(byteArray69);
        java.lang.String str71 = base32_1.encodeToString(byteArray69);
        org.apache.commons.codec.binary.Base32 base32_73 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray76 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean78 = base32_73.isInAlphabet(byteArray76, false);
        byte[] byteArray79 = base32_1.decode(byteArray76);
        boolean boolean81 = base32_1.isInAlphabet((byte) 0);
        java.lang.Class<?> wildcardClass82 = base32_1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 8L + "'", long18 == 8L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 8L + "'", long37 == 8L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 8L + "'", long56 == 8L);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "IFCUCNZWHU6T2===" + "'", str70, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "IFCUCNZWHU6T2===" + "'", str71, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false, (byte) 100);
        java.lang.Class<?> wildcardClass3 = base32_2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false, (byte) 100);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32((int) ' ', byteArray8);
        java.lang.String str10 = base32_2.encodeAsString(byteArray8);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "BIFP6CQd" + "'", str10, "BIFP6CQd");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        boolean boolean5 = base32_1.isInAlphabet("");
        byte[] byteArray8 = new byte[] { (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_10 = new org.apache.commons.codec.binary.Base32((int) (short) 10, byteArray8, false);
        org.apache.commons.codec.binary.BaseNCodec.Context context13 = null;
        // The following exception was thrown during execution in test generation
        try {
            base32_1.encode(byteArray8, (int) (byte) 100, 1, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100 });
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray12, true, (byte) 0);
        boolean boolean17 = base32_7.isInAlphabet(byteArray12, false);
        long long18 = base32_1.getEncodedLength(byteArray12);
        org.apache.commons.codec.binary.Base32 base32_20 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean22 = base32_20.isInAlphabet((byte) 100);
        byte[] byteArray24 = base32_20.decode("");
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray31, true, (byte) 0);
        boolean boolean36 = base32_26.isInAlphabet(byteArray31, false);
        long long37 = base32_20.getEncodedLength(byteArray31);
        org.apache.commons.codec.binary.Base32 base32_39 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean41 = base32_39.isInAlphabet((byte) 100);
        byte[] byteArray43 = base32_39.decode("");
        org.apache.commons.codec.binary.Base32 base32_45 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_53 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray50, true, (byte) 0);
        boolean boolean55 = base32_45.isInAlphabet(byteArray50, false);
        long long56 = base32_39.getEncodedLength(byteArray50);
        org.apache.commons.codec.binary.Base32 base32_58 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_66 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray63, true, (byte) 0);
        boolean boolean68 = base32_58.isInAlphabet(byteArray63, false);
        byte[] byteArray69 = base32_39.encode(byteArray63);
        java.lang.String str70 = base32_20.encodeAsString(byteArray69);
        java.lang.String str71 = base32_1.encodeToString(byteArray69);
        org.apache.commons.codec.binary.Base32 base32_73 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray76 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean78 = base32_73.isInAlphabet(byteArray76, false);
        byte[] byteArray79 = base32_1.decode(byteArray76);
        byte[] byteArray80 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long81 = base32_1.getEncodedLength(byteArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 8L + "'", long18 == 8L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 8L + "'", long37 == 8L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 8L + "'", long56 == 8L);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "IFCUCNZWHU6T2===" + "'", str70, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "IFCUCNZWHU6T2===" + "'", str71, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] {});
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean4 = base32_2.isInAlphabet((byte) 100);
        byte[] byteArray6 = base32_2.decode("");
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray13, true, (byte) 0);
        boolean boolean18 = base32_8.isInAlphabet(byteArray13, false);
        long long19 = base32_2.getEncodedLength(byteArray13);
        org.apache.commons.codec.binary.Base32 base32_21 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean23 = base32_21.isInAlphabet((byte) 100);
        byte[] byteArray25 = base32_21.decode("");
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_35 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray32, true, (byte) 0);
        boolean boolean37 = base32_27.isInAlphabet(byteArray32, false);
        long long38 = base32_21.getEncodedLength(byteArray32);
        org.apache.commons.codec.binary.Base32 base32_40 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean42 = base32_40.isInAlphabet((byte) 100);
        byte[] byteArray44 = base32_40.decode("");
        org.apache.commons.codec.binary.Base32 base32_46 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_54 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray51, true, (byte) 0);
        boolean boolean56 = base32_46.isInAlphabet(byteArray51, false);
        long long57 = base32_40.getEncodedLength(byteArray51);
        org.apache.commons.codec.binary.Base32 base32_59 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_67 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray64, true, (byte) 0);
        boolean boolean69 = base32_59.isInAlphabet(byteArray64, false);
        byte[] byteArray70 = base32_40.encode(byteArray64);
        java.lang.String str71 = base32_21.encodeAsString(byteArray70);
        java.lang.String str72 = base32_2.encodeToString(byteArray70);
        org.apache.commons.codec.binary.Base32 base32_74 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray77 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean79 = base32_74.isInAlphabet(byteArray77, false);
        byte[] byteArray80 = base32_2.decode(byteArray77);
        org.apache.commons.codec.binary.Base32 base32_83 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray77, true, (byte) 1);
        org.apache.commons.codec.binary.Base32 base32_85 = new org.apache.commons.codec.binary.Base32(false);
        org.apache.commons.codec.binary.Base32 base32_88 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean90 = base32_88.isInAlphabet((byte) 100);
        byte[] byteArray92 = base32_88.decode("");
        org.apache.commons.codec.binary.Base32 base32_95 = new org.apache.commons.codec.binary.Base32((int) (short) 10, byteArray92, false, (byte) -1);
        java.lang.String str96 = base32_85.encodeAsString(byteArray92);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj97 = base32_83.decode((java.lang.Object) base32_85);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base-N decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 8L + "'", long19 == 8L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 8L + "'", long38 == 8L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 8L + "'", long57 == 8L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "IFCUCNZWHU6T2===" + "'", str71, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "IFCUCNZWHU6T2===" + "'", str72, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(byteArray92);
        org.junit.Assert.assertArrayEquals(byteArray92, new byte[] {});
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32((int) ' ');
        org.apache.commons.codec.binary.Base32 base32_3 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean5 = base32_3.isInAlphabet((byte) 100);
        byte[] byteArray7 = base32_3.decode("");
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_17 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray14, true, (byte) 0);
        boolean boolean19 = base32_9.isInAlphabet(byteArray14, false);
        long long20 = base32_3.getEncodedLength(byteArray14);
        java.lang.String str21 = base32_1.encodeToString(byteArray14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 8L + "'", long20 == 8L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AEA76===\r\n" + "'", str21, "AEA76===\r\n");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray4, true, (byte) 0);
        byte[] byteArray9 = new byte[] { (byte) -1 };
        long long10 = base32_7.getEncodedLength(byteArray9);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_18 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray15, true, (byte) 0);
        boolean boolean20 = base32_18.isInAlphabet((byte) -1);
        org.apache.commons.codec.binary.Base32 base32_22 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean24 = base32_22.isInAlphabet((byte) 100);
        byte[] byteArray26 = base32_22.decode("");
        org.apache.commons.codec.binary.Base32 base32_29 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean31 = base32_29.isInAlphabet((byte) 100);
        byte[] byteArray33 = base32_29.decode("");
        org.apache.commons.codec.binary.Base32 base32_36 = new org.apache.commons.codec.binary.Base32((int) (short) 10, byteArray33, false, (byte) -1);
        boolean boolean38 = base32_22.isInAlphabet(byteArray33, false);
        java.lang.String str39 = base32_18.encodeAsString(byteArray33);
        org.apache.commons.codec.binary.BaseNCodec.Context context42 = null;
        // The following exception was thrown during execution in test generation
        try {
            base32_7.decode(byteArray33, (int) (short) 0, (-1), context42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1 });
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11L + "'", long10 == 11L);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean4 = base32_2.isInAlphabet((byte) 100);
        byte[] byteArray6 = base32_2.decode("");
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32((int) (short) 10, byteArray6, false, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = base32_9.decode((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base-N decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.codec.binary.Base32 base32_3 = new org.apache.commons.codec.binary.Base32(true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean7 = base32_5.isInAlphabet((byte) 100);
        byte[] byteArray9 = base32_5.decode("");
        org.apache.commons.codec.binary.Base32 base32_11 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_19 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray16, true, (byte) 0);
        boolean boolean21 = base32_11.isInAlphabet(byteArray16, false);
        long long22 = base32_5.getEncodedLength(byteArray16);
        org.apache.commons.codec.binary.Base32 base32_24 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_32 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray29, true, (byte) 0);
        boolean boolean34 = base32_24.isInAlphabet(byteArray29, false);
        byte[] byteArray35 = base32_5.encode(byteArray29);
        byte[] byteArray36 = base32_3.decode(byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32 base32_38 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray36, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeparator must not contain Base32 characters: [S?s]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 8L + "'", long22 == 8L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 83, (byte) -108, (byte) 115 });
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray12, true, (byte) 0);
        boolean boolean17 = base32_7.isInAlphabet(byteArray12, false);
        long long18 = base32_1.getEncodedLength(byteArray12);
        org.apache.commons.codec.binary.Base32 base32_20 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean22 = base32_20.isInAlphabet((byte) 100);
        byte[] byteArray24 = base32_20.decode("");
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray31, true, (byte) 0);
        boolean boolean36 = base32_26.isInAlphabet(byteArray31, false);
        long long37 = base32_20.getEncodedLength(byteArray31);
        org.apache.commons.codec.binary.Base32 base32_39 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean41 = base32_39.isInAlphabet((byte) 100);
        byte[] byteArray43 = base32_39.decode("");
        org.apache.commons.codec.binary.Base32 base32_45 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_53 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray50, true, (byte) 0);
        boolean boolean55 = base32_45.isInAlphabet(byteArray50, false);
        long long56 = base32_39.getEncodedLength(byteArray50);
        org.apache.commons.codec.binary.Base32 base32_58 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_66 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray63, true, (byte) 0);
        boolean boolean68 = base32_58.isInAlphabet(byteArray63, false);
        byte[] byteArray69 = base32_39.encode(byteArray63);
        java.lang.String str70 = base32_20.encodeAsString(byteArray69);
        java.lang.String str71 = base32_1.encodeToString(byteArray69);
        org.apache.commons.codec.binary.Base32 base32_73 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray76 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean78 = base32_73.isInAlphabet(byteArray76, false);
        byte[] byteArray79 = base32_1.decode(byteArray76);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj81 = base32_1.encode((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base-N encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 8L + "'", long18 == 8L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 8L + "'", long37 == 8L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 8L + "'", long56 == 8L);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "IFCUCNZWHU6T2===" + "'", str70, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "IFCUCNZWHU6T2===" + "'", str71, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] {});
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray12, true, (byte) 0);
        boolean boolean17 = base32_7.isInAlphabet(byteArray12, false);
        long long18 = base32_1.getEncodedLength(byteArray12);
        org.apache.commons.codec.binary.Base32 base32_20 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_28 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray25, true, (byte) 0);
        boolean boolean30 = base32_20.isInAlphabet(byteArray25, false);
        byte[] byteArray31 = base32_1.encode(byteArray25);
        boolean boolean33 = base32_1.isInAlphabet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = base32_1.decode((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base-N decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 8L + "'", long18 == 8L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean4 = base32_2.isInAlphabet((byte) 100);
        byte[] byteArray6 = base32_2.decode("");
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray13, true, (byte) 0);
        boolean boolean18 = base32_8.isInAlphabet(byteArray13, false);
        long long19 = base32_2.getEncodedLength(byteArray13);
        org.apache.commons.codec.binary.Base32 base32_21 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean23 = base32_21.isInAlphabet((byte) 100);
        byte[] byteArray25 = base32_21.decode("");
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_35 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray32, true, (byte) 0);
        boolean boolean37 = base32_27.isInAlphabet(byteArray32, false);
        long long38 = base32_21.getEncodedLength(byteArray32);
        org.apache.commons.codec.binary.Base32 base32_40 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean42 = base32_40.isInAlphabet((byte) 100);
        byte[] byteArray44 = base32_40.decode("");
        org.apache.commons.codec.binary.Base32 base32_46 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_54 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray51, true, (byte) 0);
        boolean boolean56 = base32_46.isInAlphabet(byteArray51, false);
        long long57 = base32_40.getEncodedLength(byteArray51);
        org.apache.commons.codec.binary.Base32 base32_59 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_67 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray64, true, (byte) 0);
        boolean boolean69 = base32_59.isInAlphabet(byteArray64, false);
        byte[] byteArray70 = base32_40.encode(byteArray64);
        java.lang.String str71 = base32_21.encodeAsString(byteArray70);
        java.lang.String str72 = base32_2.encodeToString(byteArray70);
        org.apache.commons.codec.binary.Base32 base32_74 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray77 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean79 = base32_74.isInAlphabet(byteArray77, false);
        byte[] byteArray80 = base32_2.decode(byteArray77);
        org.apache.commons.codec.binary.Base32 base32_83 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray80, true, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 8L + "'", long19 == 8L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 8L + "'", long38 == 8L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 8L + "'", long57 == 8L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "IFCUCNZWHU6T2===" + "'", str71, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "IFCUCNZWHU6T2===" + "'", str72, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] {});
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray12, true, (byte) 0);
        boolean boolean17 = base32_7.isInAlphabet(byteArray12, false);
        long long18 = base32_1.getEncodedLength(byteArray12);
        org.apache.commons.codec.binary.Base32 base32_20 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_28 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray25, true, (byte) 0);
        boolean boolean30 = base32_20.isInAlphabet(byteArray25, false);
        byte[] byteArray31 = base32_1.encode(byteArray25);
        boolean boolean33 = base32_1.isInAlphabet("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj35 = base32_1.encode((java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base-N encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 8L + "'", long18 == 8L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false, (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = base32_2.decode((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base-N decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(true, (byte) 100);
        boolean boolean4 = base32_2.isInAlphabet("KOKHGddd");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32((int) ' ', byteArray7);
        byte[] byteArray9 = base32_1.decode(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = base32_1.encode((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base-N encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray12, true, (byte) 0);
        boolean boolean17 = base32_7.isInAlphabet(byteArray12, false);
        long long18 = base32_1.getEncodedLength(byteArray12);
        org.apache.commons.codec.binary.Base32 base32_20 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean22 = base32_20.isInAlphabet((byte) 100);
        byte[] byteArray24 = base32_20.decode("");
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray31, true, (byte) 0);
        boolean boolean36 = base32_26.isInAlphabet(byteArray31, false);
        long long37 = base32_20.getEncodedLength(byteArray31);
        org.apache.commons.codec.binary.Base32 base32_39 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_47 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray44, true, (byte) 0);
        boolean boolean49 = base32_39.isInAlphabet(byteArray44, false);
        byte[] byteArray50 = base32_20.encode(byteArray44);
        java.lang.String str51 = base32_1.encodeAsString(byteArray50);
        org.apache.commons.codec.binary.Base32 base32_53 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean55 = base32_53.isInAlphabet((byte) 100);
        boolean boolean57 = base32_53.isInAlphabet("");
        byte[] byteArray59 = base32_53.decode("");
        boolean boolean61 = base32_1.isInAlphabet(byteArray59, false);
        org.apache.commons.codec.binary.Base32 base32_63 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean65 = base32_63.isInAlphabet((byte) 100);
        byte[] byteArray67 = base32_63.decode("");
        org.apache.commons.codec.binary.Base32 base32_69 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray74 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_77 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray74, true, (byte) 0);
        boolean boolean79 = base32_69.isInAlphabet(byteArray74, false);
        long long80 = base32_63.getEncodedLength(byteArray74);
        org.apache.commons.codec.binary.Base32 base32_82 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray87 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_90 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray87, true, (byte) 0);
        boolean boolean92 = base32_82.isInAlphabet(byteArray87, false);
        byte[] byteArray93 = base32_63.encode(byteArray87);
        java.lang.String str94 = base32_1.encodeAsString(byteArray87);
        java.lang.Class<?> wildcardClass95 = byteArray87.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 8L + "'", long18 == 8L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 8L + "'", long37 == 8L);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "IFCUCNZWHU6T2===" + "'", str51, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 8L + "'", long80 == 8L);
        org.junit.Assert.assertNotNull(byteArray87);
        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "AEA76===" + "'", str94, "AEA76===");
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        byte[] byteArray7 = base32_1.decode("KOKHGddd");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 83, (byte) -108, (byte) 115 });
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false, (byte) 1);
        org.apache.commons.codec.binary.Base32 base32_4 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean9 = base32_4.isInAlphabet(byteArray7, false);
        org.apache.commons.codec.binary.BaseNCodec.Context context12 = null;
        // The following exception was thrown during execution in test generation
        try {
            base32_2.encode(byteArray7, (int) 'a', (int) '4', context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32((-1));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.codec.binary.Base32 base32_3 = new org.apache.commons.codec.binary.Base32(true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean7 = base32_5.isInAlphabet((byte) 100);
        byte[] byteArray9 = base32_5.decode("");
        org.apache.commons.codec.binary.Base32 base32_11 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_19 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray16, true, (byte) 0);
        boolean boolean21 = base32_11.isInAlphabet(byteArray16, false);
        long long22 = base32_5.getEncodedLength(byteArray16);
        org.apache.commons.codec.binary.Base32 base32_24 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_32 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray29, true, (byte) 0);
        boolean boolean34 = base32_24.isInAlphabet(byteArray29, false);
        byte[] byteArray35 = base32_5.encode(byteArray29);
        byte[] byteArray36 = base32_3.decode(byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32 base32_39 = new org.apache.commons.codec.binary.Base32(100, byteArray36, false, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeparator must not contain Base32 characters: [S?s]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 8L + "'", long22 == 8L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 83, (byte) -108, (byte) 115 });
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray5, true, (byte) 0);
        byte[] byteArray10 = new byte[] { (byte) -1 };
        long long11 = base32_8.getEncodedLength(byteArray10);
        org.apache.commons.codec.binary.Base32 base32_14 = new org.apache.commons.codec.binary.Base32(0, byteArray10, false, (byte) -1);
        java.lang.Class<?> wildcardClass15 = base32_14.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1 });
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 11L + "'", long11 == 11L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray5, true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_10 = new org.apache.commons.codec.binary.Base32(10, byteArray5, false);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_18 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray15, true, (byte) 0);
        byte[] byteArray20 = new byte[] { (byte) -1 };
        long long21 = base32_18.getEncodedLength(byteArray20);
        byte[] byteArray22 = base32_10.decode(byteArray20);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1 });
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 11L + "'", long21 == 11L);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        byte[] byteArray1 = null;
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32((int) (short) 0, byteArray1);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.commons.codec.binary.Base32 base32_3 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean5 = base32_3.isInAlphabet((byte) 100);
        byte[] byteArray7 = base32_3.decode("");
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_17 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray14, true, (byte) 0);
        boolean boolean19 = base32_9.isInAlphabet(byteArray14, false);
        long long20 = base32_3.getEncodedLength(byteArray14);
        org.apache.commons.codec.binary.Base32 base32_22 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean24 = base32_22.isInAlphabet((byte) 100);
        byte[] byteArray26 = base32_22.decode("");
        org.apache.commons.codec.binary.Base32 base32_28 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_36 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray33, true, (byte) 0);
        boolean boolean38 = base32_28.isInAlphabet(byteArray33, false);
        long long39 = base32_22.getEncodedLength(byteArray33);
        org.apache.commons.codec.binary.Base32 base32_41 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean43 = base32_41.isInAlphabet((byte) 100);
        byte[] byteArray45 = base32_41.decode("");
        org.apache.commons.codec.binary.Base32 base32_47 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray52 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_55 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray52, true, (byte) 0);
        boolean boolean57 = base32_47.isInAlphabet(byteArray52, false);
        long long58 = base32_41.getEncodedLength(byteArray52);
        org.apache.commons.codec.binary.Base32 base32_60 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray65 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_68 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray65, true, (byte) 0);
        boolean boolean70 = base32_60.isInAlphabet(byteArray65, false);
        byte[] byteArray71 = base32_41.encode(byteArray65);
        java.lang.String str72 = base32_22.encodeAsString(byteArray71);
        java.lang.String str73 = base32_3.encodeToString(byteArray71);
        org.apache.commons.codec.binary.Base32 base32_75 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray78 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean80 = base32_75.isInAlphabet(byteArray78, false);
        byte[] byteArray81 = base32_3.decode(byteArray78);
        org.apache.commons.codec.binary.Base32 base32_84 = new org.apache.commons.codec.binary.Base32((int) (byte) 10, byteArray78, true, (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32 base32_87 = new org.apache.commons.codec.binary.Base32((int) (byte) 100, byteArray78, true, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeparator must not contain Base32 characters: [??]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 8L + "'", long20 == 8L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 8L + "'", long39 == 8L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 8L + "'", long58 == 8L);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "IFCUCNZWHU6T2===" + "'", str72, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "IFCUCNZWHU6T2===" + "'", str73, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] {});
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.commons.codec.binary.Base32 base32_3 = new org.apache.commons.codec.binary.Base32(true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean7 = base32_5.isInAlphabet((byte) 100);
        byte[] byteArray9 = base32_5.decode("");
        org.apache.commons.codec.binary.Base32 base32_11 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_19 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray16, true, (byte) 0);
        boolean boolean21 = base32_11.isInAlphabet(byteArray16, false);
        long long22 = base32_5.getEncodedLength(byteArray16);
        org.apache.commons.codec.binary.Base32 base32_24 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean26 = base32_24.isInAlphabet((byte) 100);
        byte[] byteArray28 = base32_24.decode("");
        org.apache.commons.codec.binary.Base32 base32_30 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_38 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray35, true, (byte) 0);
        boolean boolean40 = base32_30.isInAlphabet(byteArray35, false);
        long long41 = base32_24.getEncodedLength(byteArray35);
        org.apache.commons.codec.binary.Base32 base32_43 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean45 = base32_43.isInAlphabet((byte) 100);
        byte[] byteArray47 = base32_43.decode("");
        org.apache.commons.codec.binary.Base32 base32_49 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_57 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray54, true, (byte) 0);
        boolean boolean59 = base32_49.isInAlphabet(byteArray54, false);
        long long60 = base32_43.getEncodedLength(byteArray54);
        org.apache.commons.codec.binary.Base32 base32_62 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray67 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_70 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray67, true, (byte) 0);
        boolean boolean72 = base32_62.isInAlphabet(byteArray67, false);
        byte[] byteArray73 = base32_43.encode(byteArray67);
        java.lang.String str74 = base32_24.encodeAsString(byteArray73);
        java.lang.String str75 = base32_5.encodeToString(byteArray73);
        org.apache.commons.codec.binary.Base32 base32_77 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray80 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean82 = base32_77.isInAlphabet(byteArray80, false);
        byte[] byteArray83 = base32_5.decode(byteArray80);
        java.lang.String str84 = base32_3.encodeAsString(byteArray80);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32 base32_87 = new org.apache.commons.codec.binary.Base32((int) (short) 100, byteArray80, false, (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeparator must not contain Base32 characters: [??]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 8L + "'", long22 == 8L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 8L + "'", long41 == 8L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 8L + "'", long60 == 8L);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "IFCUCNZWHU6T2===" + "'", str74, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "IFCUCNZWHU6T2===" + "'", str75, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] {});
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "03VG\000\000\000\000" + "'", str84, "03VG\000\000\000\000");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean7 = base32_5.isInAlphabet((byte) 100);
        byte[] byteArray9 = base32_5.decode("");
        org.apache.commons.codec.binary.Base32 base32_11 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_19 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray16, true, (byte) 0);
        boolean boolean21 = base32_11.isInAlphabet(byteArray16, false);
        long long22 = base32_5.getEncodedLength(byteArray16);
        org.apache.commons.codec.binary.Base32 base32_24 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean26 = base32_24.isInAlphabet((byte) 100);
        byte[] byteArray28 = base32_24.decode("");
        org.apache.commons.codec.binary.Base32 base32_30 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_38 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray35, true, (byte) 0);
        boolean boolean40 = base32_30.isInAlphabet(byteArray35, false);
        long long41 = base32_24.getEncodedLength(byteArray35);
        org.apache.commons.codec.binary.Base32 base32_43 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean45 = base32_43.isInAlphabet((byte) 100);
        byte[] byteArray47 = base32_43.decode("");
        org.apache.commons.codec.binary.Base32 base32_49 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_57 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray54, true, (byte) 0);
        boolean boolean59 = base32_49.isInAlphabet(byteArray54, false);
        long long60 = base32_43.getEncodedLength(byteArray54);
        org.apache.commons.codec.binary.Base32 base32_62 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray67 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_70 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray67, true, (byte) 0);
        boolean boolean72 = base32_62.isInAlphabet(byteArray67, false);
        byte[] byteArray73 = base32_43.encode(byteArray67);
        java.lang.String str74 = base32_24.encodeAsString(byteArray73);
        java.lang.String str75 = base32_5.encodeToString(byteArray73);
        org.apache.commons.codec.binary.Base32 base32_77 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray80 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean82 = base32_77.isInAlphabet(byteArray80, false);
        byte[] byteArray83 = base32_5.decode(byteArray80);
        boolean boolean85 = base32_5.isInAlphabet((byte) 0);
        byte[] byteArray93 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_95 = new org.apache.commons.codec.binary.Base32(76, byteArray93, true);
        org.apache.commons.codec.binary.Base32 base32_97 = new org.apache.commons.codec.binary.Base32(0, byteArray93, false);
        byte[] byteArray98 = base32_5.encode(byteArray93);
        java.lang.String str99 = base32_1.encodeToString(byteArray93);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 8L + "'", long22 == 8L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 8L + "'", long41 == 8L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 8L + "'", long60 == 8L);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "IFCUCNZWHU6T2===" + "'", str74, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "IFCUCNZWHU6T2===" + "'", str75, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray98);
        org.junit.Assert.assertArrayEquals(byteArray98, new byte[] { (byte) 55, (byte) 53, (byte) 83, (byte) 65, (byte) 66, (byte) 55, (byte) 51, (byte) 69 });
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "75SAB73E" + "'", str99, "75SAB73E");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean4 = base32_2.isInAlphabet((byte) 100);
        byte[] byteArray6 = base32_2.decode("");
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray13, true, (byte) 0);
        boolean boolean18 = base32_8.isInAlphabet(byteArray13, false);
        long long19 = base32_2.getEncodedLength(byteArray13);
        org.apache.commons.codec.binary.Base32 base32_21 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean23 = base32_21.isInAlphabet((byte) 100);
        byte[] byteArray25 = base32_21.decode("");
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_35 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray32, true, (byte) 0);
        boolean boolean37 = base32_27.isInAlphabet(byteArray32, false);
        long long38 = base32_21.getEncodedLength(byteArray32);
        org.apache.commons.codec.binary.Base32 base32_40 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean42 = base32_40.isInAlphabet((byte) 100);
        byte[] byteArray44 = base32_40.decode("");
        org.apache.commons.codec.binary.Base32 base32_46 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_54 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray51, true, (byte) 0);
        boolean boolean56 = base32_46.isInAlphabet(byteArray51, false);
        long long57 = base32_40.getEncodedLength(byteArray51);
        org.apache.commons.codec.binary.Base32 base32_59 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_67 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray64, true, (byte) 0);
        boolean boolean69 = base32_59.isInAlphabet(byteArray64, false);
        byte[] byteArray70 = base32_40.encode(byteArray64);
        java.lang.String str71 = base32_21.encodeAsString(byteArray70);
        java.lang.String str72 = base32_2.encodeToString(byteArray70);
        org.apache.commons.codec.binary.Base32 base32_74 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray77 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean79 = base32_74.isInAlphabet(byteArray77, false);
        byte[] byteArray80 = base32_2.decode(byteArray77);
        org.apache.commons.codec.binary.Base32 base32_83 = new org.apache.commons.codec.binary.Base32(64, byteArray80, false, (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 8L + "'", long19 == 8L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 8L + "'", long38 == 8L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 8L + "'", long57 == 8L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "IFCUCNZWHU6T2===" + "'", str71, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "IFCUCNZWHU6T2===" + "'", str72, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] {});
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: pad must not be in alphabet or whitespace");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32((byte) 1);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        boolean boolean5 = base32_1.isInAlphabet("03VG\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32((byte) -1);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32((int) (short) 100);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_4 = new org.apache.commons.codec.binary.Base32((byte) 100);
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean11 = base32_9.isInAlphabet((byte) 100);
        byte[] byteArray13 = base32_9.decode("");
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_23 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray20, true, (byte) 0);
        boolean boolean25 = base32_15.isInAlphabet(byteArray20, false);
        long long26 = base32_9.getEncodedLength(byteArray20);
        org.apache.commons.codec.binary.Base32 base32_28 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray33 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_36 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray33, true, (byte) 0);
        boolean boolean38 = base32_28.isInAlphabet(byteArray33, false);
        byte[] byteArray39 = base32_9.encode(byteArray33);
        byte[] byteArray40 = base32_7.decode(byteArray39);
        java.lang.String str41 = base32_4.encodeAsString(byteArray40);
        java.lang.String str42 = base32_2.encodeAsString(byteArray40);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 8L + "'", long26 == 8L);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 83, (byte) -108, (byte) 115 });
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "KOKHGddd" + "'", str41, "KOKHGddd");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "KOKHG\000\000\000" + "'", str42, "KOKHG\000\000\000");
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray12, true, (byte) 0);
        boolean boolean17 = base32_7.isInAlphabet(byteArray12, false);
        long long18 = base32_1.getEncodedLength(byteArray12);
        org.apache.commons.codec.binary.Base32 base32_20 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean22 = base32_20.isInAlphabet((byte) 100);
        byte[] byteArray24 = base32_20.decode("");
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray31, true, (byte) 0);
        boolean boolean36 = base32_26.isInAlphabet(byteArray31, false);
        long long37 = base32_20.getEncodedLength(byteArray31);
        org.apache.commons.codec.binary.Base32 base32_39 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean41 = base32_39.isInAlphabet((byte) 100);
        byte[] byteArray43 = base32_39.decode("");
        org.apache.commons.codec.binary.Base32 base32_45 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_53 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray50, true, (byte) 0);
        boolean boolean55 = base32_45.isInAlphabet(byteArray50, false);
        long long56 = base32_39.getEncodedLength(byteArray50);
        org.apache.commons.codec.binary.Base32 base32_58 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_66 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray63, true, (byte) 0);
        boolean boolean68 = base32_58.isInAlphabet(byteArray63, false);
        byte[] byteArray69 = base32_39.encode(byteArray63);
        java.lang.String str70 = base32_20.encodeAsString(byteArray69);
        java.lang.String str71 = base32_1.encodeToString(byteArray69);
        boolean boolean73 = base32_1.isInAlphabet("");
        boolean boolean75 = base32_1.isInAlphabet("75SAB73E");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 8L + "'", long18 == 8L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 8L + "'", long37 == 8L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 8L + "'", long56 == 8L);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "IFCUCNZWHU6T2===" + "'", str70, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "IFCUCNZWHU6T2===" + "'", str71, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray12, true, (byte) 0);
        boolean boolean17 = base32_7.isInAlphabet(byteArray12, false);
        long long18 = base32_1.getEncodedLength(byteArray12);
        org.apache.commons.codec.binary.Base32 base32_20 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean22 = base32_20.isInAlphabet((byte) 100);
        byte[] byteArray24 = base32_20.decode("");
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray31, true, (byte) 0);
        boolean boolean36 = base32_26.isInAlphabet(byteArray31, false);
        long long37 = base32_20.getEncodedLength(byteArray31);
        org.apache.commons.codec.binary.Base32 base32_39 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray44 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_47 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray44, true, (byte) 0);
        boolean boolean49 = base32_39.isInAlphabet(byteArray44, false);
        byte[] byteArray50 = base32_20.encode(byteArray44);
        java.lang.String str51 = base32_1.encodeAsString(byteArray50);
        org.apache.commons.codec.binary.Base32 base32_53 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean55 = base32_53.isInAlphabet((byte) 100);
        boolean boolean57 = base32_53.isInAlphabet("");
        byte[] byteArray59 = base32_53.decode("");
        boolean boolean61 = base32_1.isInAlphabet(byteArray59, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj63 = base32_1.decode((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base-N decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 8L + "'", long18 == 8L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 8L + "'", long37 == 8L);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "IFCUCNZWHU6T2===" + "'", str51, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32((byte) 100);
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray6, true, (byte) 0);
        boolean boolean11 = base32_9.isInAlphabet((byte) -1);
        org.apache.commons.codec.binary.Base32 base32_13 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean15 = base32_13.isInAlphabet((byte) 100);
        byte[] byteArray17 = base32_13.decode("");
        org.apache.commons.codec.binary.Base32 base32_20 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean22 = base32_20.isInAlphabet((byte) 100);
        byte[] byteArray24 = base32_20.decode("");
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32((int) (short) 10, byteArray24, false, (byte) -1);
        boolean boolean29 = base32_13.isInAlphabet(byteArray24, false);
        java.lang.String str30 = base32_9.encodeAsString(byteArray24);
        long long31 = base32_1.getEncodedLength(byteArray24);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_4 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean6 = base32_4.isInAlphabet((byte) 100);
        byte[] byteArray8 = base32_4.decode("");
        org.apache.commons.codec.binary.Base32 base32_10 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_18 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray15, true, (byte) 0);
        boolean boolean20 = base32_10.isInAlphabet(byteArray15, false);
        long long21 = base32_4.getEncodedLength(byteArray15);
        org.apache.commons.codec.binary.Base32 base32_23 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean25 = base32_23.isInAlphabet((byte) 100);
        byte[] byteArray27 = base32_23.decode("");
        org.apache.commons.codec.binary.Base32 base32_29 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_37 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray34, true, (byte) 0);
        boolean boolean39 = base32_29.isInAlphabet(byteArray34, false);
        long long40 = base32_23.getEncodedLength(byteArray34);
        org.apache.commons.codec.binary.Base32 base32_42 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean44 = base32_42.isInAlphabet((byte) 100);
        byte[] byteArray46 = base32_42.decode("");
        org.apache.commons.codec.binary.Base32 base32_48 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_56 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray53, true, (byte) 0);
        boolean boolean58 = base32_48.isInAlphabet(byteArray53, false);
        long long59 = base32_42.getEncodedLength(byteArray53);
        org.apache.commons.codec.binary.Base32 base32_61 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray66 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_69 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray66, true, (byte) 0);
        boolean boolean71 = base32_61.isInAlphabet(byteArray66, false);
        byte[] byteArray72 = base32_42.encode(byteArray66);
        java.lang.String str73 = base32_23.encodeAsString(byteArray72);
        java.lang.String str74 = base32_4.encodeToString(byteArray72);
        org.apache.commons.codec.binary.Base32 base32_76 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray79 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean81 = base32_76.isInAlphabet(byteArray79, false);
        byte[] byteArray82 = base32_4.decode(byteArray79);
        java.lang.String str83 = base32_2.encodeAsString(byteArray79);
        boolean boolean85 = base32_2.isInAlphabet((byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 8L + "'", long21 == 8L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 8L + "'", long40 == 8L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 8L + "'", long59 == 8L);
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "IFCUCNZWHU6T2===" + "'", str73, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "IFCUCNZWHU6T2===" + "'", str74, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] {});
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "03VG\000\000\000\000" + "'", str83, "03VG\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray12, true, (byte) 0);
        boolean boolean17 = base32_7.isInAlphabet(byteArray12, false);
        long long18 = base32_1.getEncodedLength(byteArray12);
        org.apache.commons.codec.binary.Base32 base32_21 = new org.apache.commons.codec.binary.Base32(true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_23 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean25 = base32_23.isInAlphabet((byte) 100);
        byte[] byteArray27 = base32_23.decode("");
        org.apache.commons.codec.binary.Base32 base32_29 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_37 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray34, true, (byte) 0);
        boolean boolean39 = base32_29.isInAlphabet(byteArray34, false);
        long long40 = base32_23.getEncodedLength(byteArray34);
        org.apache.commons.codec.binary.Base32 base32_42 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean44 = base32_42.isInAlphabet((byte) 100);
        byte[] byteArray46 = base32_42.decode("");
        org.apache.commons.codec.binary.Base32 base32_48 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray53 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_56 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray53, true, (byte) 0);
        boolean boolean58 = base32_48.isInAlphabet(byteArray53, false);
        long long59 = base32_42.getEncodedLength(byteArray53);
        org.apache.commons.codec.binary.Base32 base32_61 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean63 = base32_61.isInAlphabet((byte) 100);
        byte[] byteArray65 = base32_61.decode("");
        org.apache.commons.codec.binary.Base32 base32_67 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray72 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_75 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray72, true, (byte) 0);
        boolean boolean77 = base32_67.isInAlphabet(byteArray72, false);
        long long78 = base32_61.getEncodedLength(byteArray72);
        org.apache.commons.codec.binary.Base32 base32_80 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray85 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_88 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray85, true, (byte) 0);
        boolean boolean90 = base32_80.isInAlphabet(byteArray85, false);
        byte[] byteArray91 = base32_61.encode(byteArray85);
        java.lang.String str92 = base32_42.encodeAsString(byteArray91);
        java.lang.String str93 = base32_23.encodeToString(byteArray91);
        byte[] byteArray94 = base32_21.decode(byteArray91);
        boolean boolean96 = base32_1.isInAlphabet(byteArray91, true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 8L + "'", long18 == 8L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 8L + "'", long40 == 8L);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 8L + "'", long59 == 8L);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(byteArray65);
        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 8L + "'", long78 == 8L);
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "IFCUCNZWHU6T2===" + "'", str92, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "IFCUCNZWHU6T2===" + "'", str93, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertArrayEquals(byteArray94, new byte[] { (byte) 83, (byte) -108, (byte) 115 });
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32((int) (byte) -1);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean6 = base32_1.isInAlphabet(byteArray4, false);
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean10 = base32_8.isInAlphabet((byte) 100);
        byte[] byteArray12 = base32_8.decode("");
        org.apache.commons.codec.binary.Base32 base32_14 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_22 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray19, true, (byte) 0);
        boolean boolean24 = base32_14.isInAlphabet(byteArray19, false);
        long long25 = base32_8.getEncodedLength(byteArray19);
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean29 = base32_27.isInAlphabet((byte) 100);
        byte[] byteArray31 = base32_27.decode("");
        org.apache.commons.codec.binary.Base32 base32_33 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray38 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_41 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray38, true, (byte) 0);
        boolean boolean43 = base32_33.isInAlphabet(byteArray38, false);
        long long44 = base32_27.getEncodedLength(byteArray38);
        org.apache.commons.codec.binary.Base32 base32_46 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_54 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray51, true, (byte) 0);
        boolean boolean56 = base32_46.isInAlphabet(byteArray51, false);
        byte[] byteArray57 = base32_27.encode(byteArray51);
        java.lang.String str58 = base32_8.encodeAsString(byteArray57);
        java.lang.String str59 = base32_1.encodeAsString(byteArray57);
        java.lang.Class<?> wildcardClass60 = byteArray57.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 8L + "'", long25 == 8L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 8L + "'", long44 == 8L);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "IFCUCNZWHU6T2===" + "'", str58, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "IFCUCNZWHU6T2===" + "'", str59, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        byte[] byteArray7 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32(76, byteArray7, true);
        org.apache.commons.codec.binary.Base32 base32_11 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean13 = base32_11.isInAlphabet((byte) 100);
        byte[] byteArray15 = base32_11.decode("");
        org.apache.commons.codec.binary.Base32 base32_17 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray22 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_25 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray22, true, (byte) 0);
        boolean boolean27 = base32_17.isInAlphabet(byteArray22, false);
        long long28 = base32_11.getEncodedLength(byteArray22);
        org.apache.commons.codec.binary.Base32 base32_30 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_38 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray35, true, (byte) 0);
        boolean boolean40 = base32_30.isInAlphabet(byteArray35, false);
        byte[] byteArray41 = base32_11.encode(byteArray35);
        java.lang.String str42 = base32_9.encodeToString(byteArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32 base32_45 = new org.apache.commons.codec.binary.Base32((int) ' ', byteArray35, false, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: pad must not be in alphabet or whitespace");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 8L + "'", long28 == 8L);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
// flaky "1) test64(org.apache.commons.codec.binary.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\ufffdd\000\ufffdd" + "'", str42, "\ufffdd\000\ufffdd");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.apache.commons.codec.binary.Base32 base32_3 = new org.apache.commons.codec.binary.Base32(true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean7 = base32_5.isInAlphabet((byte) 100);
        byte[] byteArray9 = base32_5.decode("");
        org.apache.commons.codec.binary.Base32 base32_11 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_19 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray16, true, (byte) 0);
        boolean boolean21 = base32_11.isInAlphabet(byteArray16, false);
        long long22 = base32_5.getEncodedLength(byteArray16);
        org.apache.commons.codec.binary.Base32 base32_24 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean26 = base32_24.isInAlphabet((byte) 100);
        byte[] byteArray28 = base32_24.decode("");
        org.apache.commons.codec.binary.Base32 base32_30 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_38 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray35, true, (byte) 0);
        boolean boolean40 = base32_30.isInAlphabet(byteArray35, false);
        long long41 = base32_24.getEncodedLength(byteArray35);
        org.apache.commons.codec.binary.Base32 base32_43 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean45 = base32_43.isInAlphabet((byte) 100);
        byte[] byteArray47 = base32_43.decode("");
        org.apache.commons.codec.binary.Base32 base32_49 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_57 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray54, true, (byte) 0);
        boolean boolean59 = base32_49.isInAlphabet(byteArray54, false);
        long long60 = base32_43.getEncodedLength(byteArray54);
        org.apache.commons.codec.binary.Base32 base32_62 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray67 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_70 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray67, true, (byte) 0);
        boolean boolean72 = base32_62.isInAlphabet(byteArray67, false);
        byte[] byteArray73 = base32_43.encode(byteArray67);
        java.lang.String str74 = base32_24.encodeAsString(byteArray73);
        java.lang.String str75 = base32_5.encodeToString(byteArray73);
        byte[] byteArray76 = base32_3.decode(byteArray73);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32 base32_79 = new org.apache.commons.codec.binary.Base32((int) (byte) 100, byteArray73, true, (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeparator must not contain Base32 characters: [AEA76===]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 8L + "'", long22 == 8L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 8L + "'", long41 == 8L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 8L + "'", long60 == 8L);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "IFCUCNZWHU6T2===" + "'", str74, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "IFCUCNZWHU6T2===" + "'", str75, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 83, (byte) -108, (byte) 115 });
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray12, true, (byte) 0);
        boolean boolean17 = base32_7.isInAlphabet(byteArray12, false);
        long long18 = base32_1.getEncodedLength(byteArray12);
        org.apache.commons.codec.binary.Base32 base32_20 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean22 = base32_20.isInAlphabet((byte) 100);
        byte[] byteArray24 = base32_20.decode("");
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray31, true, (byte) 0);
        boolean boolean36 = base32_26.isInAlphabet(byteArray31, false);
        long long37 = base32_20.getEncodedLength(byteArray31);
        org.apache.commons.codec.binary.Base32 base32_39 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean41 = base32_39.isInAlphabet((byte) 100);
        byte[] byteArray43 = base32_39.decode("");
        org.apache.commons.codec.binary.Base32 base32_45 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_53 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray50, true, (byte) 0);
        boolean boolean55 = base32_45.isInAlphabet(byteArray50, false);
        long long56 = base32_39.getEncodedLength(byteArray50);
        org.apache.commons.codec.binary.Base32 base32_58 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_66 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray63, true, (byte) 0);
        boolean boolean68 = base32_58.isInAlphabet(byteArray63, false);
        byte[] byteArray69 = base32_39.encode(byteArray63);
        java.lang.String str70 = base32_20.encodeAsString(byteArray69);
        java.lang.String str71 = base32_1.encodeToString(byteArray69);
        org.apache.commons.codec.binary.Base32 base32_73 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray76 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean78 = base32_73.isInAlphabet(byteArray76, false);
        byte[] byteArray79 = base32_1.decode(byteArray76);
        boolean boolean81 = base32_1.isInAlphabet((byte) 0);
        byte[] byteArray89 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_91 = new org.apache.commons.codec.binary.Base32(76, byteArray89, true);
        org.apache.commons.codec.binary.Base32 base32_93 = new org.apache.commons.codec.binary.Base32(0, byteArray89, false);
        byte[] byteArray94 = base32_1.encode(byteArray89);
        boolean boolean96 = base32_1.isInAlphabet((byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 8L + "'", long18 == 8L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 8L + "'", long37 == 8L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 8L + "'", long56 == 8L);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "IFCUCNZWHU6T2===" + "'", str70, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "IFCUCNZWHU6T2===" + "'", str71, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(byteArray89);
        org.junit.Assert.assertArrayEquals(byteArray89, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray94);
        org.junit.Assert.assertArrayEquals(byteArray94, new byte[] { (byte) 55, (byte) 53, (byte) 83, (byte) 65, (byte) 66, (byte) 55, (byte) 51, (byte) 69 });
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(true, (byte) 0);
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_11 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray8, true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_13 = new org.apache.commons.codec.binary.Base32((int) (byte) 100, byteArray8, true);
        org.apache.commons.codec.binary.BaseNCodec.Context context16 = null;
        // The following exception was thrown during execution in test generation
        try {
            base32_2.encode(byteArray8, 0, (int) 'a', context16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32((int) ' ', byteArray7);
        byte[] byteArray9 = base32_1.decode(byteArray7);
        java.lang.Class<?> wildcardClass10 = base32_1.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(1);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        org.apache.commons.codec.binary.Base32 base32_3 = new org.apache.commons.codec.binary.Base32(true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean7 = base32_5.isInAlphabet((byte) 100);
        byte[] byteArray9 = base32_5.decode("");
        org.apache.commons.codec.binary.Base32 base32_11 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_19 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray16, true, (byte) 0);
        boolean boolean21 = base32_11.isInAlphabet(byteArray16, false);
        long long22 = base32_5.getEncodedLength(byteArray16);
        org.apache.commons.codec.binary.Base32 base32_24 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean26 = base32_24.isInAlphabet((byte) 100);
        byte[] byteArray28 = base32_24.decode("");
        org.apache.commons.codec.binary.Base32 base32_30 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray35 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_38 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray35, true, (byte) 0);
        boolean boolean40 = base32_30.isInAlphabet(byteArray35, false);
        long long41 = base32_24.getEncodedLength(byteArray35);
        org.apache.commons.codec.binary.Base32 base32_43 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean45 = base32_43.isInAlphabet((byte) 100);
        byte[] byteArray47 = base32_43.decode("");
        org.apache.commons.codec.binary.Base32 base32_49 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_57 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray54, true, (byte) 0);
        boolean boolean59 = base32_49.isInAlphabet(byteArray54, false);
        long long60 = base32_43.getEncodedLength(byteArray54);
        org.apache.commons.codec.binary.Base32 base32_62 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray67 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_70 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray67, true, (byte) 0);
        boolean boolean72 = base32_62.isInAlphabet(byteArray67, false);
        byte[] byteArray73 = base32_43.encode(byteArray67);
        java.lang.String str74 = base32_24.encodeAsString(byteArray73);
        java.lang.String str75 = base32_5.encodeToString(byteArray73);
        org.apache.commons.codec.binary.Base32 base32_77 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray80 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean82 = base32_77.isInAlphabet(byteArray80, false);
        byte[] byteArray83 = base32_5.decode(byteArray80);
        java.lang.String str84 = base32_3.encodeAsString(byteArray80);
        org.apache.commons.codec.binary.Base32 base32_86 = new org.apache.commons.codec.binary.Base32((int) (short) 0, byteArray80, false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 8L + "'", long22 == 8L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 8L + "'", long41 == 8L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 8L + "'", long60 == 8L);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "IFCUCNZWHU6T2===" + "'", str74, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "IFCUCNZWHU6T2===" + "'", str75, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] {});
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "03VG\000\000\000\000" + "'", str84, "03VG\000\000\000\000");
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32((byte) 100);
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32(true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean9 = base32_7.isInAlphabet((byte) 100);
        byte[] byteArray11 = base32_7.decode("");
        org.apache.commons.codec.binary.Base32 base32_13 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_21 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray18, true, (byte) 0);
        boolean boolean23 = base32_13.isInAlphabet(byteArray18, false);
        long long24 = base32_7.getEncodedLength(byteArray18);
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray31, true, (byte) 0);
        boolean boolean36 = base32_26.isInAlphabet(byteArray31, false);
        byte[] byteArray37 = base32_7.encode(byteArray31);
        byte[] byteArray38 = base32_5.decode(byteArray37);
        java.lang.String str39 = base32_2.encodeAsString(byteArray38);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32 base32_40 = new org.apache.commons.codec.binary.Base32((int) (short) 1, byteArray38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeparator must not contain Base32 characters: [S?s]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 8L + "'", long24 == 8L);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 83, (byte) -108, (byte) 115 });
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "KOKHGddd" + "'", str39, "KOKHGddd");
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(0);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean4 = base32_2.isInAlphabet((byte) 100);
        byte[] byteArray6 = base32_2.decode("");
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray13, true, (byte) 0);
        boolean boolean18 = base32_8.isInAlphabet(byteArray13, false);
        long long19 = base32_2.getEncodedLength(byteArray13);
        org.apache.commons.codec.binary.Base32 base32_21 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean23 = base32_21.isInAlphabet((byte) 100);
        byte[] byteArray25 = base32_21.decode("");
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_35 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray32, true, (byte) 0);
        boolean boolean37 = base32_27.isInAlphabet(byteArray32, false);
        long long38 = base32_21.getEncodedLength(byteArray32);
        org.apache.commons.codec.binary.Base32 base32_40 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean42 = base32_40.isInAlphabet((byte) 100);
        byte[] byteArray44 = base32_40.decode("");
        org.apache.commons.codec.binary.Base32 base32_46 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_54 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray51, true, (byte) 0);
        boolean boolean56 = base32_46.isInAlphabet(byteArray51, false);
        long long57 = base32_40.getEncodedLength(byteArray51);
        org.apache.commons.codec.binary.Base32 base32_59 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_67 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray64, true, (byte) 0);
        boolean boolean69 = base32_59.isInAlphabet(byteArray64, false);
        byte[] byteArray70 = base32_40.encode(byteArray64);
        java.lang.String str71 = base32_21.encodeAsString(byteArray70);
        java.lang.String str72 = base32_2.encodeToString(byteArray70);
        org.apache.commons.codec.binary.Base32 base32_74 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray77 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean79 = base32_74.isInAlphabet(byteArray77, false);
        byte[] byteArray80 = base32_2.decode(byteArray77);
        boolean boolean82 = base32_2.isInAlphabet((byte) 0);
        byte[] byteArray90 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_92 = new org.apache.commons.codec.binary.Base32(76, byteArray90, true);
        org.apache.commons.codec.binary.Base32 base32_94 = new org.apache.commons.codec.binary.Base32(0, byteArray90, false);
        byte[] byteArray95 = base32_2.encode(byteArray90);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32 base32_96 = new org.apache.commons.codec.binary.Base32(1, byteArray95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeparator must not contain Base32 characters: [75SAB73E]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 8L + "'", long19 == 8L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 8L + "'", long38 == 8L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 8L + "'", long57 == 8L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "IFCUCNZWHU6T2===" + "'", str71, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "IFCUCNZWHU6T2===" + "'", str72, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] { (byte) 55, (byte) 53, (byte) 83, (byte) 65, (byte) 66, (byte) 55, (byte) 51, (byte) 69 });
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray6, true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_11 = new org.apache.commons.codec.binary.Base32((int) (byte) 100, byteArray6, true);
        org.apache.commons.codec.binary.Base32 base32_13 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean15 = base32_13.isInAlphabet((byte) 100);
        byte[] byteArray17 = base32_13.decode("");
        org.apache.commons.codec.binary.Base32 base32_19 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray24, true, (byte) 0);
        boolean boolean29 = base32_19.isInAlphabet(byteArray24, false);
        long long30 = base32_13.getEncodedLength(byteArray24);
        org.apache.commons.codec.binary.Base32 base32_32 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean34 = base32_32.isInAlphabet((byte) 100);
        byte[] byteArray36 = base32_32.decode("");
        org.apache.commons.codec.binary.Base32 base32_38 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray43 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_46 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray43, true, (byte) 0);
        boolean boolean48 = base32_38.isInAlphabet(byteArray43, false);
        long long49 = base32_32.getEncodedLength(byteArray43);
        org.apache.commons.codec.binary.Base32 base32_51 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean53 = base32_51.isInAlphabet((byte) 100);
        byte[] byteArray55 = base32_51.decode("");
        org.apache.commons.codec.binary.Base32 base32_57 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray62 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_65 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray62, true, (byte) 0);
        boolean boolean67 = base32_57.isInAlphabet(byteArray62, false);
        long long68 = base32_51.getEncodedLength(byteArray62);
        org.apache.commons.codec.binary.Base32 base32_70 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray75 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_78 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray75, true, (byte) 0);
        boolean boolean80 = base32_70.isInAlphabet(byteArray75, false);
        byte[] byteArray81 = base32_51.encode(byteArray75);
        java.lang.String str82 = base32_32.encodeAsString(byteArray81);
        java.lang.String str83 = base32_13.encodeToString(byteArray81);
        org.apache.commons.codec.binary.Base32 base32_85 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray88 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean90 = base32_85.isInAlphabet(byteArray88, false);
        byte[] byteArray91 = base32_13.decode(byteArray88);
        boolean boolean93 = base32_13.isInAlphabet((byte) 0);
        byte[] byteArray95 = base32_13.decode("AEA76===");
        byte[] byteArray96 = base32_11.decode(byteArray95);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32 base32_99 = new org.apache.commons.codec.binary.Base32(1, byteArray96, false, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: pad must not be in alphabet or whitespace");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 8L + "'", long30 == 8L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 8L + "'", long49 == 8L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 8L + "'", long68 == 8L);
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "IFCUCNZWHU6T2===" + "'", str82, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "IFCUCNZWHU6T2===" + "'", str83, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray88);
        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(byteArray91);
        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray96);
        org.junit.Assert.assertArrayEquals(byteArray96, new byte[] {});
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        org.apache.commons.codec.binary.Base32 base32_0 = new org.apache.commons.codec.binary.Base32();
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32((byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = base32_0.encode((java.lang.Object) base32_2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Parameter supplied to Base-N encode is not a byte[]");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32((int) ' ', byteArray8);
        byte[] byteArray10 = base32_2.decode(byteArray8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base32 base32_13 = new org.apache.commons.codec.binary.Base32((int) (byte) 0, byteArray10, true, (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: pad must not be in alphabet or whitespace");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray12, true, (byte) 0);
        boolean boolean17 = base32_7.isInAlphabet(byteArray12, false);
        long long18 = base32_1.getEncodedLength(byteArray12);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 0 };
        boolean boolean25 = base32_1.isInAlphabet(byteArray23, true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 8L + "'", long18 == 8L);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 0 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_9 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray6, true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_11 = new org.apache.commons.codec.binary.Base32(10, byteArray6, false);
        org.apache.commons.codec.binary.Base32 base32_13 = new org.apache.commons.codec.binary.Base32((int) (short) 0, byteArray6, true);
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = base32_13.decode(obj14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base-N decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet("");
        org.apache.commons.codec.binary.Base32 base32_5 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean7 = base32_5.isInAlphabet((byte) 100);
        byte[] byteArray9 = base32_5.decode("");
        org.apache.commons.codec.binary.Base32 base32_11 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_19 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray16, true, (byte) 0);
        boolean boolean21 = base32_11.isInAlphabet(byteArray16, false);
        long long22 = base32_5.getEncodedLength(byteArray16);
        org.apache.commons.codec.binary.Base32 base32_24 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_32 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray29, true, (byte) 0);
        boolean boolean34 = base32_24.isInAlphabet(byteArray29, false);
        byte[] byteArray35 = base32_5.encode(byteArray29);
        boolean boolean37 = base32_1.isInAlphabet(byteArray29, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 8L + "'", long22 == 8L);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32((byte) 100);
        org.apache.commons.codec.binary.Base32 base32_4 = new org.apache.commons.codec.binary.Base32(true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_6 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean8 = base32_6.isInAlphabet((byte) 100);
        byte[] byteArray10 = base32_6.decode("");
        org.apache.commons.codec.binary.Base32 base32_12 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_20 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray17, true, (byte) 0);
        boolean boolean22 = base32_12.isInAlphabet(byteArray17, false);
        long long23 = base32_6.getEncodedLength(byteArray17);
        org.apache.commons.codec.binary.Base32 base32_25 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray30 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_33 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray30, true, (byte) 0);
        boolean boolean35 = base32_25.isInAlphabet(byteArray30, false);
        byte[] byteArray36 = base32_6.encode(byteArray30);
        byte[] byteArray37 = base32_4.decode(byteArray36);
        java.lang.String str38 = base32_1.encodeAsString(byteArray37);
        org.apache.commons.codec.binary.Base32 base32_41 = new org.apache.commons.codec.binary.Base32(true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_43 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean45 = base32_43.isInAlphabet((byte) 100);
        byte[] byteArray47 = base32_43.decode("");
        org.apache.commons.codec.binary.Base32 base32_49 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray54 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_57 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray54, true, (byte) 0);
        boolean boolean59 = base32_49.isInAlphabet(byteArray54, false);
        long long60 = base32_43.getEncodedLength(byteArray54);
        org.apache.commons.codec.binary.Base32 base32_62 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray67 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_70 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray67, true, (byte) 0);
        boolean boolean72 = base32_62.isInAlphabet(byteArray67, false);
        byte[] byteArray73 = base32_43.encode(byteArray67);
        byte[] byteArray74 = base32_41.decode(byteArray73);
        org.apache.commons.codec.binary.BaseNCodec.Context context77 = null;
        // The following exception was thrown during execution in test generation
        try {
            base32_1.encode(byteArray74, (int) (byte) 0, (int) (short) 10, context77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 8L + "'", long23 == 8L);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 83, (byte) -108, (byte) 115 });
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "KOKHGddd" + "'", str38, "KOKHGddd");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 8L + "'", long60 == 8L);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray74);
        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 83, (byte) -108, (byte) 115 });
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray12, true, (byte) 0);
        boolean boolean17 = base32_7.isInAlphabet(byteArray12, false);
        long long18 = base32_1.getEncodedLength(byteArray12);
        org.apache.commons.codec.binary.Base32 base32_20 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean22 = base32_20.isInAlphabet((byte) 100);
        byte[] byteArray24 = base32_20.decode("");
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray31 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_34 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray31, true, (byte) 0);
        boolean boolean36 = base32_26.isInAlphabet(byteArray31, false);
        long long37 = base32_20.getEncodedLength(byteArray31);
        org.apache.commons.codec.binary.Base32 base32_39 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean41 = base32_39.isInAlphabet((byte) 100);
        byte[] byteArray43 = base32_39.decode("");
        org.apache.commons.codec.binary.Base32 base32_45 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray50 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_53 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray50, true, (byte) 0);
        boolean boolean55 = base32_45.isInAlphabet(byteArray50, false);
        long long56 = base32_39.getEncodedLength(byteArray50);
        org.apache.commons.codec.binary.Base32 base32_58 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray63 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_66 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray63, true, (byte) 0);
        boolean boolean68 = base32_58.isInAlphabet(byteArray63, false);
        byte[] byteArray69 = base32_39.encode(byteArray63);
        java.lang.String str70 = base32_20.encodeAsString(byteArray69);
        java.lang.String str71 = base32_1.encodeToString(byteArray69);
        org.apache.commons.codec.binary.Base32 base32_73 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray76 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean78 = base32_73.isInAlphabet(byteArray76, false);
        byte[] byteArray79 = base32_1.decode(byteArray76);
        boolean boolean81 = base32_1.isInAlphabet((byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj83 = base32_1.decode((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base-N decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 8L + "'", long18 == 8L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 8L + "'", long37 == 8L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 8L + "'", long56 == 8L);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "IFCUCNZWHU6T2===" + "'", str70, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "IFCUCNZWHU6T2===" + "'", str71, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray76);
        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet("");
        boolean boolean5 = base32_1.isInAlphabet("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_10 = new org.apache.commons.codec.binary.Base32(76, byteArray8, true);
        org.apache.commons.codec.binary.Base32 base32_12 = new org.apache.commons.codec.binary.Base32(0, byteArray8, false);
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32(10, byteArray8, true, (byte) 1);
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_24 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray21, true, (byte) 0);
        byte[] byteArray26 = new byte[] { (byte) -1 };
        long long27 = base32_24.getEncodedLength(byteArray26);
        org.apache.commons.codec.binary.Base32 base32_30 = new org.apache.commons.codec.binary.Base32(0, byteArray26, false, (byte) -1);
        byte[] byteArray37 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_40 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray37, true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_42 = new org.apache.commons.codec.binary.Base32(10, byteArray37, false);
        org.apache.commons.codec.binary.Base32 base32_44 = new org.apache.commons.codec.binary.Base32((int) (short) 0, byteArray37, true);
        boolean boolean46 = base32_30.isInAlphabet(byteArray37, true);
        byte[] byteArray47 = base32_15.encode(byteArray37);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1 });
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 11L + "'", long27 == 11L);
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 48, (byte) 52, (byte) 48, (byte) 86, (byte) 85, (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 });
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32((int) (short) 1);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false, (byte) -1);
        boolean boolean4 = base32_2.isInAlphabet("");
        byte[] byteArray6 = base32_2.decode("KOKHG\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 83, (byte) -108, (byte) 115 });
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base32 base32_6 = new org.apache.commons.codec.binary.Base32((int) ' ', byteArray5);
        java.lang.Class<?> wildcardClass7 = base32_6.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray5, true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_10 = new org.apache.commons.codec.binary.Base32((int) (byte) 100, byteArray5, true);
        byte[] byteArray16 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_19 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray16, true, (byte) 0);
        byte[] byteArray21 = new byte[] { (byte) -1 };
        long long22 = base32_19.getEncodedLength(byteArray21);
        org.apache.commons.codec.binary.Base32 base32_23 = new org.apache.commons.codec.binary.Base32(10, byteArray21);
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32(false, (byte) -1);
        byte[] byteArray28 = base32_26.decode("\ufffdd\000\ufffdd");
        byte[] byteArray29 = base32_23.encode(byteArray28);
        long long30 = base32_10.getEncodedLength(byteArray29);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) -1 });
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 11L + "'", long22 == 11L);
        org.junit.Assert.assertNotNull(byteArray28);
// flaky "2) test87(org.apache.commons.codec.binary.RegressionTest0)":         org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -27 });
        org.junit.Assert.assertNotNull(byteArray29);
// flaky "1) test87(org.apache.commons.codec.binary.RegressionTest0)":         org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 52, (byte) 85, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) 61, (byte) -1 });
// flaky "1) test87(org.apache.commons.codec.binary.RegressionTest0)":         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 19L + "'", long30 == 19L);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 100);
        byte[] byteArray5 = base32_1.decode("");
        org.apache.commons.codec.binary.Base32 base32_7 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_15 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray12, true, (byte) 0);
        boolean boolean17 = base32_7.isInAlphabet(byteArray12, false);
        long long18 = base32_1.getEncodedLength(byteArray12);
        org.apache.commons.codec.binary.Base32 base32_20 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray25 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_28 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray25, true, (byte) 0);
        boolean boolean30 = base32_20.isInAlphabet(byteArray25, false);
        byte[] byteArray31 = base32_1.encode(byteArray25);
        boolean boolean33 = base32_1.isInAlphabet("hi!");
        byte[] byteArray35 = base32_1.decode("AEA76===");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 8L + "'", long18 == 8L);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_4 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean6 = base32_4.isInAlphabet((byte) 100);
        byte[] byteArray8 = base32_4.decode("");
        org.apache.commons.codec.binary.Base32 base32_10 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_18 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray15, true, (byte) 0);
        boolean boolean20 = base32_10.isInAlphabet(byteArray15, false);
        long long21 = base32_4.getEncodedLength(byteArray15);
        org.apache.commons.codec.binary.Base32 base32_23 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray28 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_31 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray28, true, (byte) 0);
        boolean boolean33 = base32_23.isInAlphabet(byteArray28, false);
        byte[] byteArray34 = base32_4.encode(byteArray28);
        byte[] byteArray35 = base32_2.decode(byteArray34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = base32_2.decode((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Parameter supplied to Base-N decode is not a byte[] or a String");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 8L + "'", long21 == 8L);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 83, (byte) -108, (byte) 115 });
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false, (byte) -1);
        byte[] byteArray4 = base32_2.decode("\ufffdd\000\ufffdd");
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_12 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray9, true, (byte) 0);
        boolean boolean14 = base32_12.isInAlphabet((byte) -1);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean18 = base32_16.isInAlphabet((byte) 100);
        byte[] byteArray20 = base32_16.decode("");
        org.apache.commons.codec.binary.Base32 base32_23 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean25 = base32_23.isInAlphabet((byte) 100);
        byte[] byteArray27 = base32_23.decode("");
        org.apache.commons.codec.binary.Base32 base32_30 = new org.apache.commons.codec.binary.Base32((int) (short) 10, byteArray27, false, (byte) -1);
        boolean boolean32 = base32_16.isInAlphabet(byteArray27, false);
        java.lang.String str33 = base32_12.encodeAsString(byteArray27);
        long long34 = base32_2.getEncodedLength(byteArray27);
        org.junit.Assert.assertNotNull(byteArray4);
// flaky "3) test90(org.apache.commons.codec.binary.RegressionTest0)":         org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -27 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        org.apache.commons.codec.binary.Base32 base32_1 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean3 = base32_1.isInAlphabet((byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false, (byte) -1);
        org.apache.commons.codec.binary.Base32 base32_4 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean6 = base32_4.isInAlphabet((byte) 100);
        boolean boolean8 = base32_4.isInAlphabet("");
        byte[] byteArray10 = base32_4.decode("");
        java.lang.String str11 = base32_2.encodeAsString(byteArray10);
        org.apache.commons.codec.binary.Base32 base32_13 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean15 = base32_13.isInAlphabet("");
        byte[] byteArray21 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_24 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray21, true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_26 = new org.apache.commons.codec.binary.Base32((int) (byte) 100, byteArray21, true);
        byte[] byteArray27 = base32_13.encode(byteArray21);
        java.lang.String str28 = base32_2.encodeAsString(byteArray27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
// flaky "4) test92(org.apache.commons.codec.binary.RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str28, "\ufffd\ufffd\ufffd");
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_10 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray7, true, (byte) 0);
        org.apache.commons.codec.binary.Base32 base32_12 = new org.apache.commons.codec.binary.Base32(10, byteArray7, false);
        org.apache.commons.codec.binary.Base32 base32_14 = new org.apache.commons.codec.binary.Base32((int) (short) 0, byteArray7, true);
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) (short) 0, byteArray7, false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        org.apache.commons.codec.binary.Base32 base32_2 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean4 = base32_2.isInAlphabet((byte) 100);
        byte[] byteArray6 = base32_2.decode("");
        org.apache.commons.codec.binary.Base32 base32_8 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_16 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray13, true, (byte) 0);
        boolean boolean18 = base32_8.isInAlphabet(byteArray13, false);
        long long19 = base32_2.getEncodedLength(byteArray13);
        org.apache.commons.codec.binary.Base32 base32_21 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean23 = base32_21.isInAlphabet((byte) 100);
        byte[] byteArray25 = base32_21.decode("");
        org.apache.commons.codec.binary.Base32 base32_27 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray32 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_35 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray32, true, (byte) 0);
        boolean boolean37 = base32_27.isInAlphabet(byteArray32, false);
        long long38 = base32_21.getEncodedLength(byteArray32);
        org.apache.commons.codec.binary.Base32 base32_40 = new org.apache.commons.codec.binary.Base32(false);
        boolean boolean42 = base32_40.isInAlphabet((byte) 100);
        byte[] byteArray44 = base32_40.decode("");
        org.apache.commons.codec.binary.Base32 base32_46 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray51 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_54 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray51, true, (byte) 0);
        boolean boolean56 = base32_46.isInAlphabet(byteArray51, false);
        long long57 = base32_40.getEncodedLength(byteArray51);
        org.apache.commons.codec.binary.Base32 base32_59 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray64 = new byte[] { (byte) 1, (byte) 1, (byte) -1 };
        org.apache.commons.codec.binary.Base32 base32_67 = new org.apache.commons.codec.binary.Base32((int) 'a', byteArray64, true, (byte) 0);
        boolean boolean69 = base32_59.isInAlphabet(byteArray64, false);
        byte[] byteArray70 = base32_40.encode(byteArray64);
        java.lang.String str71 = base32_21.encodeAsString(byteArray70);
        java.lang.String str72 = base32_2.encodeToString(byteArray70);
        org.apache.commons.codec.binary.Base32 base32_74 = new org.apache.commons.codec.binary.Base32(false);
        byte[] byteArray77 = new byte[] { (byte) 0, (byte) -1 };
        boolean boolean79 = base32_74.isInAlphabet(byteArray77, false);
        byte[] byteArray80 = base32_2.decode(byteArray77);
        boolean boolean82 = base32_2.isInAlphabet((byte) 0);
        byte[] byteArray90 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_92 = new org.apache.commons.codec.binary.Base32(76, byteArray90, true);
        org.apache.commons.codec.binary.Base32 base32_94 = new org.apache.commons.codec.binary.Base32(0, byteArray90, false);
        byte[] byteArray95 = base32_2.encode(byteArray90);
        org.apache.commons.codec.binary.Base32 base32_98 = new org.apache.commons.codec.binary.Base32(0, byteArray90, false, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 8L + "'", long19 == 8L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 8L + "'", long38 == 8L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 8L + "'", long57 == 8L);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) 1, (byte) 1, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 65, (byte) 69, (byte) 65, (byte) 55, (byte) 54, (byte) 61, (byte) 61, (byte) 61 });
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "IFCUCNZWHU6T2===" + "'", str71, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "IFCUCNZWHU6T2===" + "'", str72, "IFCUCNZWHU6T2===");
        org.junit.Assert.assertNotNull(byteArray77);
        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 0, (byte) -1 });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(byteArray90);
        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) -1, (byte) 100 });
        org.junit.Assert.assertNotNull(byteArray95);
        org.junit.Assert.assertArrayEquals(byteArray95, new byte[] { (byte) 55, (byte) 53, (byte) 83, (byte) 65, (byte) 66, (byte) 55, (byte) 51, (byte) 69 });
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test95");
        byte[] byteArray2 = new byte[] { (byte) 100 };
        org.apache.commons.codec.binary.Base32 base32_3 = new org.apache.commons.codec.binary.Base32((int) '4', byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 100 });
    }
}
