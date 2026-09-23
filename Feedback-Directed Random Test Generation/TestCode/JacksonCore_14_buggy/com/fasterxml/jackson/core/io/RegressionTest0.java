package com.fasterxml.jackson.core.io;

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
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        char[] charArray5 = new char[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iOContext3.releaseNameCopyBuffer(charArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { 'a' });
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        byte[] byteArray9 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iOContext3.releaseBase64Buffer(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) 1 });
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) 0, false);
        boolean boolean4 = iOContext3._managedResource;
        java.lang.Class<?> wildcardClass5 = iOContext3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        byte[] byteArray6 = new byte[] {};
        iOContext3._writeEncodingBuffer = byteArray6;
        byte[] byteArray9 = new byte[] { (byte) -1 };
        iOContext3._readIOBuffer = byteArray9;
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1 });
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        java.lang.Object obj6 = iOContext5.getSourceReference();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler7, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding11 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext12 = iOContext10.withEncoding(jsonEncoding11);
        byte[] byteArray13 = new byte[] {};
        iOContext10._writeEncodingBuffer = byteArray13;
        // The following exception was thrown during execution in test generation
        try {
            iOContext5.releaseWriteEncodingBuffer(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertNotNull(iOContext12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        char[] charArray8 = new char[] { 'a', ' ' };
        char[] charArray12 = new char[] { '4', '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iOContext5._verifyRelease(charArray8, charArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', ' ' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', '4', 'a' });
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        byte[] byteArray6 = new byte[] {};
        iOContext3._writeEncodingBuffer = byteArray6;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = iOContext3.allocBase64Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        java.lang.Object obj6 = iOContext5.getSourceReference();
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler7, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding11 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext12 = iOContext10.withEncoding(jsonEncoding11);
        byte[] byteArray13 = new byte[] {};
        iOContext10._writeEncodingBuffer = byteArray13;
        // The following exception was thrown during execution in test generation
        try {
            iOContext5.releaseReadIOBuffer(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertNotNull(iOContext12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        byte[] byteArray6 = new byte[] {};
        iOContext3._writeEncodingBuffer = byteArray6;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = iOContext3.allocNameCopyBuffer((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        byte[] byteArray6 = new byte[] {};
        iOContext3._writeEncodingBuffer = byteArray6;
        char[] charArray11 = new char[] { ' ', ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            iOContext3.releaseTokenBuffer(charArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ', ' ', '4' });
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        boolean boolean6 = iOContext5._managedResource;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler7, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding11 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext12 = iOContext10.withEncoding(jsonEncoding11);
        byte[] byteArray13 = new byte[] {};
        iOContext10._writeEncodingBuffer = byteArray13;
        byte[] byteArray16 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iOContext5._verifyRelease(byteArray13, byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Trying to release buffer not owned by the context");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(iOContext12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10 });
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        byte[] byteArray6 = iOContext5._base64Buffer;
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertNull(byteArray6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) 0, false);
        com.fasterxml.jackson.core.util.TextBuffer textBuffer4 = iOContext3.constructTextBuffer();
        org.junit.Assert.assertNotNull(textBuffer4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) 0, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext7 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler4, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding8 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext9 = iOContext7.withEncoding(jsonEncoding8);
        byte[] byteArray10 = new byte[] {};
        iOContext7._writeEncodingBuffer = byteArray10;
        byte[] byteArray13 = new byte[] { (byte) 1 };
        iOContext7._base64Buffer = byteArray13;
        iOContext3._writeEncodingBuffer = byteArray13;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = iOContext3.allocReadIOBuffer((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iOContext9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1 });
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        char[] charArray6 = iOContext5._nameCopyBuffer;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler7, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding11 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext12 = iOContext10.withEncoding(jsonEncoding11);
        byte[] byteArray13 = new byte[] {};
        iOContext10._writeEncodingBuffer = byteArray13;
        byte[] byteArray16 = new byte[] { (byte) 1 };
        iOContext10._base64Buffer = byteArray16;
        // The following exception was thrown during execution in test generation
        try {
            iOContext5.releaseWriteEncodingBuffer(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(iOContext12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 1 });
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        char[] charArray6 = iOContext3._concatCBuffer;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler7 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext10 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler7, (java.lang.Object) (byte) 0, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext14 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler11, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding15 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext16 = iOContext14.withEncoding(jsonEncoding15);
        byte[] byteArray17 = new byte[] {};
        iOContext14._writeEncodingBuffer = byteArray17;
        byte[] byteArray20 = new byte[] { (byte) 1 };
        iOContext14._base64Buffer = byteArray20;
        iOContext10._writeEncodingBuffer = byteArray20;
        // The following exception was thrown during execution in test generation
        try {
            iOContext3.releaseWriteEncodingBuffer(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(iOContext16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1 });
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) 0, false);
        boolean boolean4 = iOContext3._managedResource;
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray6 = iOContext3.allocNameCopyBuffer((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) 0, false);
        boolean boolean4 = iOContext3._managedResource;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler5 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext8 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler5, (java.lang.Object) (byte) 0, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler9 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext12 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler9, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding13 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext14 = iOContext12.withEncoding(jsonEncoding13);
        byte[] byteArray15 = new byte[] {};
        iOContext12._writeEncodingBuffer = byteArray15;
        byte[] byteArray18 = new byte[] { (byte) 1 };
        iOContext12._base64Buffer = byteArray18;
        iOContext8._writeEncodingBuffer = byteArray18;
        iOContext3._readIOBuffer = byteArray18;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iOContext14);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1 });
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        java.lang.Object obj6 = iOContext5.getSourceReference();
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding7 = null;
        iOContext5._encoding = jsonEncoding7;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding9 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext10 = iOContext5.withEncoding(jsonEncoding9);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding11 = null;
        iOContext10._encoding = jsonEncoding11;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding13 = iOContext10._encoding;
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertNotNull(iOContext10);
        org.junit.Assert.assertNull(jsonEncoding13);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        byte[] byteArray6 = new byte[] {};
        iOContext3._writeEncodingBuffer = byteArray6;
        byte[] byteArray9 = new byte[] { (byte) 1 };
        iOContext3._base64Buffer = byteArray9;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext14 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler11, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding15 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext16 = iOContext14.withEncoding(jsonEncoding15);
        byte[] byteArray17 = new byte[] {};
        iOContext14._writeEncodingBuffer = byteArray17;
        byte[] byteArray20 = new byte[] { (byte) 1 };
        iOContext14._base64Buffer = byteArray20;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler22 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext25 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler22, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding26 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext27 = iOContext25.withEncoding(jsonEncoding26);
        byte[] byteArray28 = new byte[] {};
        iOContext25._writeEncodingBuffer = byteArray28;
        iOContext3._verifyRelease(byteArray20, byteArray28);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray31 = iOContext3.allocBase64Buffer();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Trying to call same allocXxx() method second time");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(iOContext16);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(iOContext27);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding6 = iOContext3._encoding;
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertNull(jsonEncoding6);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) 0, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext7 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler4, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding8 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext9 = iOContext7.withEncoding(jsonEncoding8);
        byte[] byteArray10 = new byte[] {};
        iOContext7._writeEncodingBuffer = byteArray10;
        byte[] byteArray13 = new byte[] { (byte) 1 };
        iOContext7._base64Buffer = byteArray13;
        iOContext3._writeEncodingBuffer = byteArray13;
        boolean boolean16 = iOContext3._managedResource;
        char[] charArray17 = iOContext3._nameCopyBuffer;
        org.junit.Assert.assertNotNull(iOContext9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(charArray17);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        byte[] byteArray6 = new byte[] {};
        iOContext3._writeEncodingBuffer = byteArray6;
        byte[] byteArray9 = new byte[] { (byte) 1 };
        iOContext3._base64Buffer = byteArray9;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = iOContext3.allocReadIOBuffer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1 });
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        byte[] byteArray6 = new byte[] {};
        iOContext3._writeEncodingBuffer = byteArray6;
        byte[] byteArray8 = iOContext3._base64Buffer;
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNull(byteArray8);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (byte) 0, false);
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext7 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler4, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding8 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext9 = iOContext7.withEncoding(jsonEncoding8);
        byte[] byteArray10 = new byte[] {};
        iOContext7._writeEncodingBuffer = byteArray10;
        byte[] byteArray13 = new byte[] { (byte) 1 };
        iOContext7._base64Buffer = byteArray13;
        iOContext3._writeEncodingBuffer = byteArray13;
        boolean boolean16 = iOContext3._managedResource;
        java.lang.Object obj17 = iOContext3._sourceRef;
        org.junit.Assert.assertNotNull(iOContext9);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (byte) 0 + "'", obj17, (byte) 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        byte[] byteArray6 = new byte[] {};
        iOContext3._writeEncodingBuffer = byteArray6;
        byte[] byteArray9 = new byte[] { (byte) 1 };
        iOContext3._base64Buffer = byteArray9;
        char[] charArray16 = new char[] { '4', '#', ' ', 'a', ' ' };
        iOContext3._nameCopyBuffer = charArray16;
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1 });
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', '#', ' ', 'a', ' ' });
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        java.lang.Object obj6 = iOContext5.getSourceReference();
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding7 = null;
        iOContext5._encoding = jsonEncoding7;
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding9 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext10 = iOContext5.withEncoding(jsonEncoding9);
        // The following exception was thrown during execution in test generation
        try {
            iOContext5._verifyAlloc((java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Trying to call same allocXxx() method second time");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + (short) 10 + "'", obj6, (short) 10);
        org.junit.Assert.assertNotNull(iOContext10);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        boolean boolean6 = iOContext5._managedResource;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = iOContext5.allocWriteEncodingBuffer(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler0 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext3 = new com.fasterxml.jackson.core.io.IOContext(bufferRecycler0, (java.lang.Object) (short) 10, true);
        com.fasterxml.jackson.core.JsonEncoding jsonEncoding4 = null;
        com.fasterxml.jackson.core.io.IOContext iOContext5 = iOContext3.withEncoding(jsonEncoding4);
        byte[] byteArray6 = new byte[] {};
        iOContext3._writeEncodingBuffer = byteArray6;
        byte[] byteArray9 = new byte[] { (byte) 1 };
        iOContext3._base64Buffer = byteArray9;
        com.fasterxml.jackson.core.util.BufferRecycler bufferRecycler11 = iOContext3._bufferRecycler;
        org.junit.Assert.assertNotNull(iOContext5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1 });
        org.junit.Assert.assertNull(bufferRecycler11);
    }
}

