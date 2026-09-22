package org.apache.commons.codec.net;

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
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = quotedPrintableCodec1.encode("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: hi!");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = quotedPrintableCodec1.encode("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: hi!");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = quotedPrintableCodec1.encode((java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Objects of type java.lang.Long cannot be quoted-printable encoded");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray7 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray7);
        java.lang.Class<?> wildcardClass9 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = quotedPrintableCodec1.encode("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: hi!");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str4 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = quotedPrintableCodec1.decode("", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        byte[] byteArray0 = null;
        byte[] byteArray1 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray0);
        org.junit.Assert.assertNull(byteArray1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = quotedPrintableCodec1.encode("", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = quotedPrintableCodec1.encode("", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = quotedPrintableCodec1.decode("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = quotedPrintableCodec1.encode("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec5 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str6 = quotedPrintableCodec5.getDefaultCharset();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray17 = quotedPrintableCodec5.decode(byteArray14);
        byte[] byteArray18 = quotedPrintableCodec1.encode(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = quotedPrintableCodec1.encode("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: hi!");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = quotedPrintableCodec1.encode("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: hi!");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str4 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = quotedPrintableCodec1.decode("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: hi!");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str4 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str5 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = quotedPrintableCodec1.decode("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = quotedPrintableCodec1.decode("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: hi!");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = quotedPrintableCodec1.decode((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Objects of type java.lang.Double cannot be quoted-printable decoded");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str4 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str5 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = quotedPrintableCodec1.encode((java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Objects of type java.lang.Long cannot be quoted-printable encoded");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray9 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = quotedPrintableCodec1.encode(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = quotedPrintableCodec1.decode("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray9 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = quotedPrintableCodec1.encode(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = quotedPrintableCodec1.encode("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec5 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str6 = quotedPrintableCodec5.getDefaultCharset();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray17 = quotedPrintableCodec5.decode(byteArray14);
        byte[] byteArray18 = quotedPrintableCodec1.encode(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = quotedPrintableCodec1.encode("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: hi!");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str4 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str5 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = quotedPrintableCodec1.decode("", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = quotedPrintableCodec1.decode("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: hi!");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec5 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str6 = quotedPrintableCodec5.getDefaultCharset();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray17 = quotedPrintableCodec5.decode(byteArray14);
        byte[] byteArray18 = quotedPrintableCodec1.encode(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = quotedPrintableCodec1.decode("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = quotedPrintableCodec1.encode((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Objects of type java.lang.Long cannot be quoted-printable encoded");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.BitSet bitSet0 = null;
        java.util.BitSet bitSet1 = null;
        java.util.BitSet bitSet2 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet2, byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet1, byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray13);
        java.lang.Class<?> wildcardClass15 = byteArray13.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.BitSet bitSet0 = null;
        java.util.BitSet bitSet1 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray9 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet1, byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray11);
        java.lang.Class<?> wildcardClass13 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = quotedPrintableCodec1.decode("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: hi!");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.BitSet bitSet0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray8 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray9);
        java.lang.Class<?> wildcardClass11 = byteArray10.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = quotedPrintableCodec1.decode((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Objects of type java.lang.Character cannot be quoted-printable decoded");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = quotedPrintableCodec1.decode("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: hi!");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = quotedPrintableCodec1.encode("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: hi!");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str4 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str5 = quotedPrintableCodec1.getDefaultCharset();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray16 = quotedPrintableCodec1.encode(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = quotedPrintableCodec1.encode("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray9 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = quotedPrintableCodec1.encode(byteArray11);
        java.lang.Class<?> wildcardClass13 = byteArray11.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = quotedPrintableCodec1.decode("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray7 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray7);
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray7);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec4 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str5 = quotedPrintableCodec4.getDefaultCharset();
        java.lang.String str6 = quotedPrintableCodec4.getDefaultCharset();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = quotedPrintableCodec4.decode(byteArray14);
        byte[] byteArray17 = quotedPrintableCodec1.decode(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = quotedPrintableCodec1.encode("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec5 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str6 = quotedPrintableCodec5.getDefaultCharset();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray17 = quotedPrintableCodec5.decode(byteArray14);
        byte[] byteArray18 = quotedPrintableCodec1.encode(byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = quotedPrintableCodec1.decode("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: hi!");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.BitSet bitSet0 = null;
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec2 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = quotedPrintableCodec2.encode(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray12);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = quotedPrintableCodec1.decode("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: hi!");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str4 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str5 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str6 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = quotedPrintableCodec1.encode("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str4 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str5 = quotedPrintableCodec1.getDefaultCharset();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray16 = quotedPrintableCodec1.encode(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = quotedPrintableCodec1.encode("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: hi!");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = quotedPrintableCodec1.encode("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = quotedPrintableCodec1.decode("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: hi!");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray9 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = quotedPrintableCodec1.encode(byteArray11);
        java.lang.Class<?> wildcardClass13 = quotedPrintableCodec1.getClass();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec4 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str5 = quotedPrintableCodec4.getDefaultCharset();
        java.lang.String str6 = quotedPrintableCodec4.getDefaultCharset();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = quotedPrintableCodec4.decode(byteArray14);
        byte[] byteArray17 = quotedPrintableCodec1.decode(byteArray16);
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec19 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str20 = quotedPrintableCodec19.getDefaultCharset();
        java.lang.String str21 = quotedPrintableCodec19.getDefaultCharset();
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray29 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray29);
        byte[] byteArray31 = quotedPrintableCodec19.decode(byteArray29);
        byte[] byteArray32 = quotedPrintableCodec1.decode(byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = quotedPrintableCodec1.encode("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: hi!");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec2 = new org.apache.commons.codec.net.QuotedPrintableCodec();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = quotedPrintableCodec1.decode((java.lang.Object) quotedPrintableCodec2);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Objects of type org.apache.commons.codec.net.QuotedPrintableCodec cannot be quoted-printable decoded");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.util.BitSet bitSet0 = null;
        java.util.BitSet bitSet1 = null;
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray9 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet1, byteArray8);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray8);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.BitSet bitSet0 = null;
        java.util.BitSet bitSet1 = null;
        java.util.BitSet bitSet2 = null;
        java.util.BitSet bitSet3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet3, byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet2, byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet1, byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray15);
        java.lang.Class<?> wildcardClass17 = byteArray16.getClass();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = quotedPrintableCodec1.decode("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: hi!");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec4 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str5 = quotedPrintableCodec4.getDefaultCharset();
        java.lang.String str6 = quotedPrintableCodec4.getDefaultCharset();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = quotedPrintableCodec4.decode(byteArray14);
        byte[] byteArray17 = quotedPrintableCodec1.decode(byteArray16);
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec19 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str20 = quotedPrintableCodec19.getDefaultCharset();
        java.lang.String str21 = quotedPrintableCodec19.getDefaultCharset();
        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray29 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray29);
        byte[] byteArray31 = quotedPrintableCodec19.decode(byteArray29);
        byte[] byteArray32 = quotedPrintableCodec1.decode(byteArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = quotedPrintableCodec1.decode("", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.BitSet bitSet0 = null;
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray8 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray8);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray8);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray8);
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray12);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = quotedPrintableCodec1.decode("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: hi!");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray7 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray6);
        byte[] byteArray8 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray7);
        byte[] byteArray9 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray7);
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec3 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray12);
        byte[] byteArray14 = quotedPrintableCodec3.encode(byteArray13);
        byte[] byteArray15 = quotedPrintableCodec1.encode(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = quotedPrintableCodec1.decode("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: ");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        java.util.BitSet bitSet2 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet2, byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = quotedPrintableCodec1.decode(obj14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = quotedPrintableCodec1.encode((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Objects of type java.lang.Long cannot be quoted-printable encoded");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        java.util.BitSet bitSet2 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet2, byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = quotedPrintableCodec1.decode(obj14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = quotedPrintableCodec1.decode("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: ");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec5 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str6 = quotedPrintableCodec5.getDefaultCharset();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray17 = quotedPrintableCodec5.decode(byteArray14);
        byte[] byteArray18 = quotedPrintableCodec1.encode(byteArray14);
        byte[] byteArray19 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray10);
        java.lang.String str14 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = quotedPrintableCodec1.encode("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: hi!");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        java.util.BitSet bitSet2 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet2, byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray12);
        java.lang.Class<?> wildcardClass14 = byteArray12.getClass();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.BitSet bitSet0 = null;
        java.util.BitSet bitSet1 = null;
        java.util.BitSet bitSet2 = null;
        java.util.BitSet bitSet3 = null;
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet3, byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet2, byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet1, byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray15);
        byte[] byteArray17 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray15);
        byte[] byteArray18 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray15);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertNotNull(byteArray18);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str4 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = quotedPrintableCodec1.encode("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: hi!");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str4 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str5 = quotedPrintableCodec1.getDefaultCharset();
        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray16 = quotedPrintableCodec1.encode(byteArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = quotedPrintableCodec1.decode("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str4 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str5 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str6 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec8 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str9 = quotedPrintableCodec8.getDefaultCharset();
        java.lang.String str10 = quotedPrintableCodec8.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = quotedPrintableCodec1.encode((java.lang.Object) quotedPrintableCodec8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Objects of type org.apache.commons.codec.net.QuotedPrintableCodec cannot be quoted-printable encoded");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec4 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str5 = quotedPrintableCodec4.getDefaultCharset();
        java.lang.String str6 = quotedPrintableCodec4.getDefaultCharset();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = quotedPrintableCodec4.decode(byteArray14);
        byte[] byteArray17 = quotedPrintableCodec1.decode(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = quotedPrintableCodec1.decode((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Objects of type java.lang.Integer cannot be quoted-printable decoded");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        java.util.BitSet bitSet2 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet2, byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = quotedPrintableCodec1.encode("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: ");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str4 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str5 = quotedPrintableCodec1.getDefaultCharset();
        java.util.BitSet bitSet6 = null;
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet6, byteArray13);
        byte[] byteArray16 = quotedPrintableCodec1.decode(byteArray13);
        java.lang.Class<?> wildcardClass17 = byteArray16.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray8 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray9 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray8);
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = quotedPrintableCodec1.encode(byteArray11);
        java.util.BitSet bitSet13 = null;
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec15 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray23 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray22);
        byte[] byteArray24 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray23);
        byte[] byteArray25 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray24);
        byte[] byteArray26 = quotedPrintableCodec15.encode(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray25);
        byte[] byteArray28 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet13, byteArray25);
        byte[] byteArray29 = quotedPrintableCodec1.encode(byteArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = quotedPrintableCodec1.encode("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: ");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray29);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str4 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = quotedPrintableCodec1.decode("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: hi!");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec5 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str6 = quotedPrintableCodec5.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec8 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str9 = quotedPrintableCodec8.getDefaultCharset();
        java.lang.String str10 = quotedPrintableCodec8.getDefaultCharset();
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray18 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray17);
        byte[] byteArray19 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray18);
        byte[] byteArray20 = quotedPrintableCodec8.decode(byteArray18);
        byte[] byteArray21 = quotedPrintableCodec5.decode(byteArray20);
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec23 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str24 = quotedPrintableCodec23.getDefaultCharset();
        java.lang.String str25 = quotedPrintableCodec23.getDefaultCharset();
        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray33 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray32);
        byte[] byteArray34 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray33);
        byte[] byteArray35 = quotedPrintableCodec23.decode(byteArray33);
        byte[] byteArray36 = quotedPrintableCodec5.decode(byteArray35);
        byte[] byteArray37 = quotedPrintableCodec1.decode(byteArray36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        java.util.BitSet bitSet2 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet2, byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = quotedPrintableCodec1.decode(obj14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = quotedPrintableCodec1.decode("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec3 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray12);
        byte[] byteArray14 = quotedPrintableCodec3.encode(byteArray13);
        byte[] byteArray15 = quotedPrintableCodec1.encode(byteArray13);
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec17 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray25 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray26);
        byte[] byteArray28 = quotedPrintableCodec17.encode(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray27);
        byte[] byteArray30 = quotedPrintableCodec1.encode(byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = quotedPrintableCodec1.encode("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = quotedPrintableCodec1.decode((java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: Objects of type java.lang.Character cannot be quoted-printable decoded");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec4 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str5 = quotedPrintableCodec4.getDefaultCharset();
        java.lang.String str6 = quotedPrintableCodec4.getDefaultCharset();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = quotedPrintableCodec4.decode(byteArray14);
        byte[] byteArray17 = quotedPrintableCodec1.decode(byteArray16);
        java.util.BitSet bitSet18 = null;
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec20 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray28 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray29);
        byte[] byteArray31 = quotedPrintableCodec20.encode(byteArray30);
        byte[] byteArray32 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet18, byteArray30);
        byte[] byteArray33 = quotedPrintableCodec1.decode(byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = quotedPrintableCodec1.decode("", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec0 = new org.apache.commons.codec.net.QuotedPrintableCodec();
        java.lang.String str2 = quotedPrintableCodec0.encode("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = quotedPrintableCodec1.decode("", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec3 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray12);
        byte[] byteArray14 = quotedPrintableCodec3.encode(byteArray13);
        byte[] byteArray15 = quotedPrintableCodec1.encode(byteArray13);
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec17 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray25 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray26);
        byte[] byteArray28 = quotedPrintableCodec17.encode(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray27);
        byte[] byteArray30 = quotedPrintableCodec1.encode(byteArray27);
        java.lang.Class<?> wildcardClass31 = quotedPrintableCodec1.getClass();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray11);
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        java.lang.Class<?> wildcardClass15 = byteArray11.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray10);
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec15 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str16 = quotedPrintableCodec15.getDefaultCharset();
        java.lang.String str17 = quotedPrintableCodec15.getDefaultCharset();
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray25 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray25);
        byte[] byteArray27 = quotedPrintableCodec15.decode(byteArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = quotedPrintableCodec1.encode((java.lang.Object) quotedPrintableCodec15);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: Objects of type org.apache.commons.codec.net.QuotedPrintableCodec cannot be quoted-printable encoded");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        java.util.BitSet bitSet2 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet2, byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = quotedPrintableCodec1.decode(obj14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = quotedPrintableCodec1.decode("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec5 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str6 = quotedPrintableCodec5.getDefaultCharset();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray17 = quotedPrintableCodec5.decode(byteArray14);
        byte[] byteArray18 = quotedPrintableCodec1.encode(byteArray14);
        java.lang.String str19 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = quotedPrintableCodec1.encode("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec4 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str5 = quotedPrintableCodec4.getDefaultCharset();
        java.lang.String str6 = quotedPrintableCodec4.getDefaultCharset();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = quotedPrintableCodec4.decode(byteArray14);
        byte[] byteArray17 = quotedPrintableCodec1.decode(byteArray16);
        java.lang.String str18 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.Object obj19 = null;
        java.lang.Object obj20 = quotedPrintableCodec1.decode(obj19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.util.BitSet bitSet2 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet2, byteArray9);
        byte[] byteArray12 = quotedPrintableCodec1.decode(byteArray9);
        java.lang.String str13 = quotedPrintableCodec1.getDefaultCharset();
        java.util.BitSet bitSet14 = null;
        java.util.BitSet bitSet15 = null;
        java.util.BitSet bitSet16 = null;
        java.util.BitSet bitSet17 = null;
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray25 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet17, byteArray26);
        byte[] byteArray28 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet16, byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet15, byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet14, byteArray29);
        byte[] byteArray31 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray29);
        byte[] byteArray32 = quotedPrintableCodec1.decode(byteArray29);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertNotNull(byteArray32);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.BitSet bitSet0 = null;
        java.util.BitSet bitSet1 = null;
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec3 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str4 = quotedPrintableCodec3.getDefaultCharset();
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray12);
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray12);
        byte[] byteArray15 = quotedPrintableCodec3.decode(byteArray12);
        byte[] byteArray16 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet1, byteArray12);
        byte[] byteArray17 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet0, byteArray12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        java.util.BitSet bitSet2 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet2, byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = quotedPrintableCodec1.encode("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec3 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray12);
        byte[] byteArray14 = quotedPrintableCodec3.encode(byteArray13);
        byte[] byteArray15 = quotedPrintableCodec1.encode(byteArray13);
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec17 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray25 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray26);
        byte[] byteArray28 = quotedPrintableCodec17.encode(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray27);
        byte[] byteArray30 = quotedPrintableCodec1.encode(byteArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = quotedPrintableCodec1.decode("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: ");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str4 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str5 = quotedPrintableCodec1.getDefaultCharset();
        java.util.BitSet bitSet6 = null;
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet6, byteArray13);
        byte[] byteArray16 = quotedPrintableCodec1.decode(byteArray13);
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec18 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = quotedPrintableCodec1.encode((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: hi!");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec4 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str5 = quotedPrintableCodec4.getDefaultCharset();
        java.lang.String str6 = quotedPrintableCodec4.getDefaultCharset();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = quotedPrintableCodec4.decode(byteArray14);
        byte[] byteArray17 = quotedPrintableCodec1.decode(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = quotedPrintableCodec1.encode("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec3 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray12);
        byte[] byteArray14 = quotedPrintableCodec3.encode(byteArray13);
        byte[] byteArray15 = quotedPrintableCodec1.encode(byteArray13);
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec17 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray25 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray26);
        byte[] byteArray28 = quotedPrintableCodec17.encode(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray27);
        byte[] byteArray30 = quotedPrintableCodec1.encode(byteArray27);
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec32 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str33 = quotedPrintableCodec32.getDefaultCharset();
        java.lang.String str34 = quotedPrintableCodec32.getDefaultCharset();
        java.lang.String str35 = quotedPrintableCodec32.getDefaultCharset();
        java.lang.String str36 = quotedPrintableCodec32.getDefaultCharset();
        byte[] byteArray43 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray44 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray43);
        byte[] byteArray45 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray44);
        byte[] byteArray46 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray44);
        byte[] byteArray47 = quotedPrintableCodec32.encode(byteArray44);
        byte[] byteArray48 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray44);
        byte[] byteArray49 = quotedPrintableCodec1.encode(byteArray44);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray10);
        java.lang.String str14 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = quotedPrintableCodec1.encode("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec5 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.util.BitSet bitSet6 = null;
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet6, byteArray13);
        byte[] byteArray16 = quotedPrintableCodec5.decode(byteArray13);
        byte[] byteArray17 = quotedPrintableCodec1.encode(byteArray13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec4 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str5 = quotedPrintableCodec4.getDefaultCharset();
        java.lang.String str6 = quotedPrintableCodec4.getDefaultCharset();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = quotedPrintableCodec4.decode(byteArray14);
        byte[] byteArray17 = quotedPrintableCodec1.decode(byteArray16);
        java.lang.String str18 = quotedPrintableCodec1.getDefaultCharset();
        java.util.BitSet bitSet19 = null;
        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray27 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray26);
        byte[] byteArray28 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet19, byteArray26);
        byte[] byteArray29 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray28);
        byte[] byteArray30 = quotedPrintableCodec1.decode(byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = quotedPrintableCodec1.encode("hi!");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.EncoderException; message: hi!");
        } catch (org.apache.commons.codec.EncoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec4 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str5 = quotedPrintableCodec4.getDefaultCharset();
        java.lang.String str6 = quotedPrintableCodec4.getDefaultCharset();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = quotedPrintableCodec4.decode(byteArray14);
        byte[] byteArray17 = quotedPrintableCodec1.decode(byteArray16);
        java.util.BitSet bitSet18 = null;
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec20 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray28 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray28);
        byte[] byteArray30 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray29);
        byte[] byteArray31 = quotedPrintableCodec20.encode(byteArray30);
        byte[] byteArray32 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet18, byteArray30);
        byte[] byteArray33 = quotedPrintableCodec1.decode(byteArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = quotedPrintableCodec1.encode("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray10);
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec15 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str16 = quotedPrintableCodec15.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec18 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str19 = quotedPrintableCodec18.getDefaultCharset();
        java.lang.String str20 = quotedPrintableCodec18.getDefaultCharset();
        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray28 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray28);
        byte[] byteArray30 = quotedPrintableCodec18.decode(byteArray28);
        byte[] byteArray31 = quotedPrintableCodec15.decode(byteArray30);
        byte[] byteArray32 = quotedPrintableCodec1.decode(byteArray30);
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec34 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        java.util.BitSet bitSet35 = null;
        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray43 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray42);
        byte[] byteArray44 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet35, byteArray42);
        byte[] byteArray45 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray44);
        byte[] byteArray46 = quotedPrintableCodec34.decode(byteArray45);
        byte[] byteArray47 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray45);
        byte[] byteArray48 = quotedPrintableCodec1.encode(byteArray45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec3 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray12);
        byte[] byteArray14 = quotedPrintableCodec3.encode(byteArray13);
        byte[] byteArray15 = quotedPrintableCodec1.encode(byteArray13);
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec17 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray25 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray26);
        byte[] byteArray28 = quotedPrintableCodec17.encode(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray27);
        byte[] byteArray30 = quotedPrintableCodec1.encode(byteArray27);
        java.lang.Class<?> wildcardClass31 = byteArray30.getClass();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.util.BitSet bitSet2 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet2, byteArray9);
        byte[] byteArray12 = quotedPrintableCodec1.decode(byteArray9);
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec14 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec16 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray24 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray23);
        byte[] byteArray25 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray25);
        byte[] byteArray27 = quotedPrintableCodec16.encode(byteArray26);
        byte[] byteArray28 = quotedPrintableCodec14.encode(byteArray26);
        byte[] byteArray29 = quotedPrintableCodec1.encode(byteArray26);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        java.util.BitSet bitSet2 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet2, byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = quotedPrintableCodec1.decode("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: ");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.util.BitSet bitSet2 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet2, byteArray9);
        byte[] byteArray12 = quotedPrintableCodec1.decode(byteArray9);
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec14 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str15 = quotedPrintableCodec14.getDefaultCharset();
        java.lang.String str16 = quotedPrintableCodec14.getDefaultCharset();
        java.lang.String str17 = quotedPrintableCodec14.getDefaultCharset();
        java.lang.String str18 = quotedPrintableCodec14.getDefaultCharset();
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray26 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray26);
        byte[] byteArray28 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray26);
        byte[] byteArray29 = quotedPrintableCodec14.encode(byteArray26);
        byte[] byteArray30 = quotedPrintableCodec1.encode(byteArray26);
        java.lang.String str31 = quotedPrintableCodec1.getDefaultCharset();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec3 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray12);
        byte[] byteArray14 = quotedPrintableCodec3.encode(byteArray13);
        byte[] byteArray15 = quotedPrintableCodec1.encode(byteArray13);
        java.lang.String str16 = quotedPrintableCodec1.getDefaultCharset();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec3 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray10);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray12);
        byte[] byteArray14 = quotedPrintableCodec3.encode(byteArray13);
        byte[] byteArray15 = quotedPrintableCodec1.encode(byteArray13);
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec17 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray25 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray24);
        byte[] byteArray26 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray25);
        byte[] byteArray27 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray26);
        byte[] byteArray28 = quotedPrintableCodec17.encode(byteArray27);
        byte[] byteArray29 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray27);
        byte[] byteArray30 = quotedPrintableCodec1.encode(byteArray27);
        java.lang.Class<?> wildcardClass31 = byteArray27.getClass();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str3 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str4 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str5 = quotedPrintableCodec1.getDefaultCharset();
        java.util.BitSet bitSet6 = null;
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet6, byteArray13);
        byte[] byteArray16 = quotedPrintableCodec1.decode(byteArray15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("");
        java.util.BitSet bitSet2 = null;
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray10 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray9);
        byte[] byteArray11 = org.apache.commons.codec.net.QuotedPrintableCodec.encodeQuotedPrintable(bitSet2, byteArray9);
        byte[] byteArray12 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray11);
        byte[] byteArray13 = quotedPrintableCodec1.decode(byteArray12);
        java.lang.String str14 = quotedPrintableCodec1.getDefaultCharset();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 48, (byte) 65, (byte) 61, (byte) 48, (byte) 49, (byte) 61, (byte) 70, (byte) 70 });
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec1 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str2 = quotedPrintableCodec1.getDefaultCharset();
        org.apache.commons.codec.net.QuotedPrintableCodec quotedPrintableCodec4 = new org.apache.commons.codec.net.QuotedPrintableCodec("hi!");
        java.lang.String str5 = quotedPrintableCodec4.getDefaultCharset();
        java.lang.String str6 = quotedPrintableCodec4.getDefaultCharset();
        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        byte[] byteArray14 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray13);
        byte[] byteArray15 = org.apache.commons.codec.net.QuotedPrintableCodec.decodeQuotedPrintable(byteArray14);
        byte[] byteArray16 = quotedPrintableCodec4.decode(byteArray14);
        byte[] byteArray17 = quotedPrintableCodec1.decode(byteArray16);
        java.lang.String str18 = quotedPrintableCodec1.getDefaultCharset();
        java.lang.String str19 = quotedPrintableCodec1.getDefaultCharset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = quotedPrintableCodec1.decode("");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.codec.DecoderException; message: hi!");
        } catch (org.apache.commons.codec.DecoderException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }
}

