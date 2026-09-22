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
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int12 = baseNCodecInputStream3.read(byteArray9, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1 });
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        java.lang.Class<?> wildcardClass4 = baseNCodecInputStream3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream9.mark((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        byte[] byteArray10 = new byte[] { (byte) -1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int13 = baseNCodecInputStream6.read(byteArray10, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1, (byte) -1, (byte) 1 });
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        byte[] byteArray10 = new byte[] { (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int11 = baseNCodecInputStream6.read(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = baseNCodecInputStream3.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = baseNCodecInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = baseNCodecInputStream6.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream6.close();
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
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int15 = baseNCodecInputStream6.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 100, (byte) 100 });
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream9.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = baseNCodecInputStream3.skip((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = baseNCodecInputStream3.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int9 = baseNCodecInputStream3.read(byteArray6, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) 0 });
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream9.mark((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = baseNCodecInputStream3.skip((long) '4');
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
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = baseNCodecInputStream3.skip((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream6.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = baseNCodecInputStream6.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = baseNCodecInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = baseNCodecInputStream6.skip((long) 10);
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
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream6.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int8 = baseNCodecInputStream3.read(byteArray5, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        java.lang.Class<?> wildcardClass7 = baseNCodecInputStream6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream9.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream9.mark((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream9.mark(0);
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
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        java.lang.Class<?> wildcardClass11 = baseNCodecInputStream6.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = baseNCodecInputStream3.skip(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = baseNCodecInputStream6.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = baseNCodecInputStream9.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec7, true);
        byte[] byteArray14 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int15 = baseNCodecInputStream9.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 100 });
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = baseNCodecInputStream3.skip((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream9.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = baseNCodecInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec12, false);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream6.mark(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int10 = baseNCodecInputStream3.read(byteArray7, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec12, false);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = baseNCodecInputStream14.skip((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = baseNCodecInputStream12.skip(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        byte[] byteArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = baseNCodecInputStream9.read(byteArray10, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream3.reset();
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
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec7, true);
        byte[] byteArray11 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int14 = baseNCodecInputStream9.read(byteArray11, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100 });
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec7, true);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = baseNCodecInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec7, true);
        java.lang.Class<?> wildcardClass10 = baseNCodecInputStream9.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        byte[] byteArray14 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int15 = baseNCodecInputStream12.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10 });
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int17 = baseNCodecInputStream9.read(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 1 });
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec7, true);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = baseNCodecInputStream9.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream9.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = baseNCodecInputStream9.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = baseNCodecInputStream12.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        byte[] byteArray11 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int12 = baseNCodecInputStream6.read(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1 });
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = baseNCodecInputStream3.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = baseNCodecInputStream9.skip((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        boolean boolean7 = baseNCodecInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = baseNCodecInputStream6.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = baseNCodecInputStream9.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream6.mark(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec12, false);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream14.mark(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int19 = baseNCodecInputStream6.read(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 });
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec12, false);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = baseNCodecInputStream6.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        boolean boolean7 = baseNCodecInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = baseNCodecInputStream6.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream6.mark((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec12, false);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = baseNCodecInputStream6.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = baseNCodecInputStream6.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        java.lang.Class<?> wildcardClass7 = byteArray5.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec7, true);
        java.lang.Class<?> wildcardClass10 = baseNCodecInputStream3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec7, true);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = baseNCodecInputStream3.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = baseNCodecInputStream3.skip((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec7, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream9.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec8 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream10 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream7, baseNCodec8, true);
        boolean boolean11 = baseNCodecInputStream10.markSupported();
        byte[] byteArray12 = new byte[] {};
        int int13 = baseNCodecInputStream10.read(byteArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = baseNCodecInputStream3.read(byteArray12, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = baseNCodecInputStream6.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec7, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream9.mark(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int20 = baseNCodecInputStream12.read(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) -1 });
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream9, baseNCodec10, true);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = baseNCodecInputStream9.available();
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
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream3.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec12, false);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = baseNCodecInputStream14.skip((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        java.lang.Class<?> wildcardClass5 = baseNCodecInputStream3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        byte[] byteArray13 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int14 = baseNCodecInputStream6.read(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0 });
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream9, baseNCodec10, true);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int20 = baseNCodecInputStream9.read(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = baseNCodecInputStream6.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream12.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = baseNCodecInputStream6.skip((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream9, baseNCodec10, true);
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int20 = baseNCodecInputStream12.read(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) -1 });
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int13 = baseNCodecInputStream3.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec11 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream13 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream10, baseNCodec11, true);
        boolean boolean14 = baseNCodecInputStream13.markSupported();
        byte[] byteArray15 = new byte[] {};
        int int16 = baseNCodecInputStream13.read(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = baseNCodecInputStream9.read(byteArray15, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        boolean boolean7 = baseNCodecInputStream6.markSupported();
        java.lang.Class<?> wildcardClass8 = baseNCodecInputStream6.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = baseNCodecInputStream12.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 1 });
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = baseNCodecInputStream12.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream11, baseNCodec12, true);
        boolean boolean15 = baseNCodecInputStream14.markSupported();
        byte[] byteArray16 = new byte[] {};
        int int17 = baseNCodecInputStream14.read(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = baseNCodecInputStream6.read(byteArray16, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        byte[] byteArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = baseNCodecInputStream9.read(byteArray10, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream12.mark((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        byte[] byteArray7 = new byte[] {};
        int int8 = baseNCodecInputStream3.read(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = baseNCodecInputStream3.skip((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        byte[] byteArray13 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int16 = baseNCodecInputStream6.read(byteArray13, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10 });
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec12, false);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec15 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream17 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream14, baseNCodec15, false);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream17.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec11 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream13 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec11, true);
        byte[] byteArray20 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int21 = baseNCodecInputStream6.read(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 10 });
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        byte[] byteArray7 = new byte[] {};
        int int8 = baseNCodecInputStream3.read(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = baseNCodecInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        boolean boolean14 = baseNCodecInputStream12.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream12.mark((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        java.io.InputStream inputStream4 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec5 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream7 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream4, baseNCodec5, true);
        boolean boolean8 = baseNCodecInputStream7.markSupported();
        byte[] byteArray9 = new byte[] {};
        int int10 = baseNCodecInputStream7.read(byteArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = baseNCodecInputStream3.read(byteArray9, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream9, baseNCodec10, true);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = baseNCodecInputStream12.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec11 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream13 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream10, baseNCodec11, true);
        boolean boolean14 = baseNCodecInputStream13.markSupported();
        byte[] byteArray15 = new byte[] {};
        int int16 = baseNCodecInputStream13.read(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = baseNCodecInputStream9.read(byteArray15, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec14 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream16 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream12, baseNCodec14, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream16.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream6.mark((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        java.io.InputStream inputStream12 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec13 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream15 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream12, baseNCodec13, true);
        boolean boolean16 = baseNCodecInputStream15.markSupported();
        byte[] byteArray17 = new byte[] {};
        int int18 = baseNCodecInputStream15.read(byteArray17);
        int int19 = baseNCodecInputStream6.read(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = baseNCodecInputStream6.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream3.mark((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec12, false);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = baseNCodecInputStream14.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream9, baseNCodec10, true);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec14 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream16 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream13, baseNCodec14, true);
        boolean boolean17 = baseNCodecInputStream16.markSupported();
        byte[] byteArray18 = new byte[] {};
        int int19 = baseNCodecInputStream16.read(byteArray18);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec20 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream22 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream16, baseNCodec20, true);
        java.io.InputStream inputStream23 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec24 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream26 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream23, baseNCodec24, true);
        boolean boolean27 = baseNCodecInputStream26.markSupported();
        byte[] byteArray28 = new byte[] {};
        int int29 = baseNCodecInputStream26.read(byteArray28);
        int int30 = baseNCodecInputStream16.read(byteArray28);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = baseNCodecInputStream9.read(byteArray28, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec14 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream16 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream13, baseNCodec14, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec17 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream19 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream13, baseNCodec17, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec20 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream22 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream19, baseNCodec20, true);
        boolean boolean23 = baseNCodecInputStream19.markSupported();
        boolean boolean24 = baseNCodecInputStream19.markSupported();
        java.io.InputStream inputStream25 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec26 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream28 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream25, baseNCodec26, true);
        boolean boolean29 = baseNCodecInputStream28.markSupported();
        byte[] byteArray30 = new byte[] {};
        int int31 = baseNCodecInputStream28.read(byteArray30);
        int int32 = baseNCodecInputStream19.read(byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = baseNCodecInputStream6.read(byteArray30, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        java.lang.Class<?> wildcardClass14 = baseNCodecInputStream12.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec7, true);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec11 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream13 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream10, baseNCodec11, true);
        boolean boolean14 = baseNCodecInputStream13.markSupported();
        byte[] byteArray15 = new byte[] {};
        int int16 = baseNCodecInputStream13.read(byteArray15);
        int int17 = baseNCodecInputStream3.read(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream3.mark((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        boolean boolean5 = baseNCodecInputStream3.markSupported();
        java.lang.Class<?> wildcardClass6 = baseNCodecInputStream3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec12, false);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream14.mark((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec12, false);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec15 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream17 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream14, baseNCodec15, false);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec19 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream21 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream18, baseNCodec19, true);
        boolean boolean22 = baseNCodecInputStream21.markSupported();
        byte[] byteArray23 = new byte[] {};
        int int24 = baseNCodecInputStream21.read(byteArray23);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec25 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream27 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream21, baseNCodec25, true);
        java.io.InputStream inputStream28 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec29 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream31 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream28, baseNCodec29, true);
        boolean boolean32 = baseNCodecInputStream31.markSupported();
        byte[] byteArray33 = new byte[] {};
        int int34 = baseNCodecInputStream31.read(byteArray33);
        int int35 = baseNCodecInputStream21.read(byteArray33);
        java.io.InputStream inputStream36 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec37 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream39 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream36, baseNCodec37, true);
        boolean boolean40 = baseNCodecInputStream39.markSupported();
        byte[] byteArray41 = new byte[] {};
        int int42 = baseNCodecInputStream39.read(byteArray41);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec43 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream45 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream39, baseNCodec43, true);
        java.io.InputStream inputStream46 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec47 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream49 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream46, baseNCodec47, true);
        boolean boolean50 = baseNCodecInputStream49.markSupported();
        byte[] byteArray51 = new byte[] {};
        int int52 = baseNCodecInputStream49.read(byteArray51);
        int int53 = baseNCodecInputStream39.read(byteArray51);
        int int54 = baseNCodecInputStream21.read(byteArray51);
        int int55 = baseNCodecInputStream17.read(byteArray51);
        java.lang.Class<?> wildcardClass56 = byteArray51.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] {});
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream9.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = baseNCodecInputStream9.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        boolean boolean5 = baseNCodecInputStream3.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec6 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream8 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec6, true);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream9, baseNCodec10, true);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        byte[] byteArray14 = new byte[] {};
        int int15 = baseNCodecInputStream12.read(byteArray14);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec16 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream18 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream12, baseNCodec16, true);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec20 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream22 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream19, baseNCodec20, true);
        boolean boolean23 = baseNCodecInputStream22.markSupported();
        byte[] byteArray24 = new byte[] {};
        int int25 = baseNCodecInputStream22.read(byteArray24);
        int int26 = baseNCodecInputStream12.read(byteArray24);
        int int27 = baseNCodecInputStream3.read(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = baseNCodecInputStream3.skip((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec7, true);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec11 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream13 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream10, baseNCodec11, true);
        boolean boolean14 = baseNCodecInputStream13.markSupported();
        byte[] byteArray15 = new byte[] {};
        int int16 = baseNCodecInputStream13.read(byteArray15);
        int int17 = baseNCodecInputStream3.read(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = baseNCodecInputStream3.skip(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        boolean boolean7 = baseNCodecInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = baseNCodecInputStream6.skip((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream9, baseNCodec10, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec13 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream15 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream9, baseNCodec13, false);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream15.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec12, false);
        boolean boolean15 = baseNCodecInputStream14.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream14.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec14 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream16 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream12, baseNCodec14, true);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = baseNCodecInputStream16.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        java.io.InputStream inputStream12 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec13 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream15 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream12, baseNCodec13, true);
        boolean boolean16 = baseNCodecInputStream15.markSupported();
        byte[] byteArray17 = new byte[] {};
        int int18 = baseNCodecInputStream15.read(byteArray17);
        int int19 = baseNCodecInputStream6.read(byteArray17);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec12, false);
        byte[] byteArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = baseNCodecInputStream14.read(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec8 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream10 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream7, baseNCodec8, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec11 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream13 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream7, baseNCodec11, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec14 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream16 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream13, baseNCodec14, true);
        boolean boolean17 = baseNCodecInputStream13.markSupported();
        boolean boolean18 = baseNCodecInputStream13.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec19 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream21 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream13, baseNCodec19, false);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec22 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream24 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream21, baseNCodec22, false);
        java.io.InputStream inputStream25 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec26 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream28 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream25, baseNCodec26, true);
        boolean boolean29 = baseNCodecInputStream28.markSupported();
        byte[] byteArray30 = new byte[] {};
        int int31 = baseNCodecInputStream28.read(byteArray30);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec32 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream34 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream28, baseNCodec32, true);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec36 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream38 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream35, baseNCodec36, true);
        boolean boolean39 = baseNCodecInputStream38.markSupported();
        byte[] byteArray40 = new byte[] {};
        int int41 = baseNCodecInputStream38.read(byteArray40);
        int int42 = baseNCodecInputStream28.read(byteArray40);
        java.io.InputStream inputStream43 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec44 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream46 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream43, baseNCodec44, true);
        boolean boolean47 = baseNCodecInputStream46.markSupported();
        byte[] byteArray48 = new byte[] {};
        int int49 = baseNCodecInputStream46.read(byteArray48);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec50 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream52 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream46, baseNCodec50, true);
        java.io.InputStream inputStream53 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec54 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream56 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream53, baseNCodec54, true);
        boolean boolean57 = baseNCodecInputStream56.markSupported();
        byte[] byteArray58 = new byte[] {};
        int int59 = baseNCodecInputStream56.read(byteArray58);
        int int60 = baseNCodecInputStream46.read(byteArray58);
        int int61 = baseNCodecInputStream28.read(byteArray58);
        int int62 = baseNCodecInputStream24.read(byteArray58);
        // The following exception was thrown during execution in test generation
        try {
            int int65 = baseNCodecInputStream3.read(byteArray58, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream9, baseNCodec10, true);
        java.lang.Class<?> wildcardClass13 = baseNCodecInputStream12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int22 = baseNCodecInputStream6.read(byteArray19, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream9, baseNCodec10, true);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec14 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream16 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream12, baseNCodec14, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream16.mark((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec7, true);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec11 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream13 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream10, baseNCodec11, true);
        boolean boolean14 = baseNCodecInputStream13.markSupported();
        byte[] byteArray15 = new byte[] {};
        int int16 = baseNCodecInputStream13.read(byteArray15);
        int int17 = baseNCodecInputStream3.read(byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = baseNCodecInputStream3.skip(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec7, true);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec11 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream13 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream10, baseNCodec11, true);
        boolean boolean14 = baseNCodecInputStream13.markSupported();
        byte[] byteArray15 = new byte[] {};
        int int16 = baseNCodecInputStream13.read(byteArray15);
        int int17 = baseNCodecInputStream3.read(byteArray15);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec19 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream21 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream18, baseNCodec19, true);
        boolean boolean22 = baseNCodecInputStream21.markSupported();
        byte[] byteArray23 = new byte[] {};
        int int24 = baseNCodecInputStream21.read(byteArray23);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec25 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream27 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream21, baseNCodec25, true);
        java.io.InputStream inputStream28 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec29 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream31 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream28, baseNCodec29, true);
        boolean boolean32 = baseNCodecInputStream31.markSupported();
        byte[] byteArray33 = new byte[] {};
        int int34 = baseNCodecInputStream31.read(byteArray33);
        int int35 = baseNCodecInputStream21.read(byteArray33);
        int int36 = baseNCodecInputStream3.read(byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            long long38 = baseNCodecInputStream3.skip((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        boolean boolean5 = baseNCodecInputStream3.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec6 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream8 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec6, true);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream9, baseNCodec10, true);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        byte[] byteArray14 = new byte[] {};
        int int15 = baseNCodecInputStream12.read(byteArray14);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec16 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream18 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream12, baseNCodec16, true);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec20 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream22 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream19, baseNCodec20, true);
        boolean boolean23 = baseNCodecInputStream22.markSupported();
        byte[] byteArray24 = new byte[] {};
        int int25 = baseNCodecInputStream22.read(byteArray24);
        int int26 = baseNCodecInputStream12.read(byteArray24);
        int int27 = baseNCodecInputStream3.read(byteArray24);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec28 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream30 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec28, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream3.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream9, baseNCodec10, true);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec14 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream16 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream13, baseNCodec14, true);
        boolean boolean17 = baseNCodecInputStream16.markSupported();
        byte[] byteArray18 = new byte[] {};
        int int19 = baseNCodecInputStream16.read(byteArray18);
        int int20 = baseNCodecInputStream9.read(byteArray18);
        java.io.InputStream inputStream21 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec22 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream24 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream21, baseNCodec22, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec25 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream27 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream21, baseNCodec25, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec28 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream30 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream27, baseNCodec28, true);
        boolean boolean31 = baseNCodecInputStream27.markSupported();
        boolean boolean32 = baseNCodecInputStream27.markSupported();
        java.io.InputStream inputStream33 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec34 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream36 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream33, baseNCodec34, true);
        boolean boolean37 = baseNCodecInputStream36.markSupported();
        byte[] byteArray38 = new byte[] {};
        int int39 = baseNCodecInputStream36.read(byteArray38);
        int int40 = baseNCodecInputStream27.read(byteArray38);
        int int41 = baseNCodecInputStream9.read(byteArray38);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec14 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream16 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream12, baseNCodec14, true);
        java.lang.Class<?> wildcardClass17 = baseNCodecInputStream12.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream3.mark((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec7, true);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec11 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream13 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream10, baseNCodec11, true);
        boolean boolean14 = baseNCodecInputStream13.markSupported();
        byte[] byteArray15 = new byte[] {};
        int int16 = baseNCodecInputStream13.read(byteArray15);
        int int17 = baseNCodecInputStream3.read(byteArray15);
        java.lang.Class<?> wildcardClass18 = baseNCodecInputStream3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        boolean boolean5 = baseNCodecInputStream3.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream3.mark((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec11 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream13 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec11, true);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec15 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream17 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream14, baseNCodec15, true);
        boolean boolean18 = baseNCodecInputStream17.markSupported();
        byte[] byteArray19 = new byte[] {};
        int int20 = baseNCodecInputStream17.read(byteArray19);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec21 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream23 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream17, baseNCodec21, true);
        java.io.InputStream inputStream24 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec25 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream27 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream24, baseNCodec25, true);
        boolean boolean28 = baseNCodecInputStream27.markSupported();
        byte[] byteArray29 = new byte[] {};
        int int30 = baseNCodecInputStream27.read(byteArray29);
        int int31 = baseNCodecInputStream17.read(byteArray29);
        int int32 = baseNCodecInputStream6.read(byteArray29);
        byte[] byteArray33 = new byte[] {};
        int int34 = baseNCodecInputStream6.read(byteArray33);
        java.lang.Class<?> wildcardClass35 = byteArray33.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream3.markSupported();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        boolean boolean5 = baseNCodecInputStream3.markSupported();
        boolean boolean6 = baseNCodecInputStream3.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream3.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec7, true);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec11 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream13 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream10, baseNCodec11, true);
        boolean boolean14 = baseNCodecInputStream13.markSupported();
        byte[] byteArray15 = new byte[] {};
        int int16 = baseNCodecInputStream13.read(byteArray15);
        int int17 = baseNCodecInputStream3.read(byteArray15);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec19 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream21 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream18, baseNCodec19, true);
        boolean boolean22 = baseNCodecInputStream21.markSupported();
        byte[] byteArray23 = new byte[] {};
        int int24 = baseNCodecInputStream21.read(byteArray23);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec25 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream27 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream21, baseNCodec25, true);
        java.io.InputStream inputStream28 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec29 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream31 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream28, baseNCodec29, true);
        boolean boolean32 = baseNCodecInputStream31.markSupported();
        byte[] byteArray33 = new byte[] {};
        int int34 = baseNCodecInputStream31.read(byteArray33);
        int int35 = baseNCodecInputStream21.read(byteArray33);
        int int36 = baseNCodecInputStream3.read(byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream3.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        boolean boolean5 = baseNCodecInputStream3.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec6 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream8 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec6, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec9 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream11 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec9, false);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = baseNCodecInputStream11.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec11 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream13 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec11, true);
        boolean boolean14 = baseNCodecInputStream13.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        boolean boolean5 = baseNCodecInputStream3.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec6 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream8 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec6, true);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream9, baseNCodec10, true);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        byte[] byteArray14 = new byte[] {};
        int int15 = baseNCodecInputStream12.read(byteArray14);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec16 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream18 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream12, baseNCodec16, true);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec20 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream22 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream19, baseNCodec20, true);
        boolean boolean23 = baseNCodecInputStream22.markSupported();
        byte[] byteArray24 = new byte[] {};
        int int25 = baseNCodecInputStream22.read(byteArray24);
        int int26 = baseNCodecInputStream12.read(byteArray24);
        int int27 = baseNCodecInputStream3.read(byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = baseNCodecInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec11 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream13 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec11, true);
        boolean boolean14 = baseNCodecInputStream13.markSupported();
        java.io.InputStream inputStream15 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec16 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream18 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream15, baseNCodec16, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec19 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream21 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream15, baseNCodec19, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec22 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream24 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream21, baseNCodec22, true);
        boolean boolean25 = baseNCodecInputStream21.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec26 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream28 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream21, baseNCodec26, true);
        java.io.InputStream inputStream29 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec30 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream32 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream29, baseNCodec30, true);
        boolean boolean33 = baseNCodecInputStream32.markSupported();
        byte[] byteArray34 = new byte[] {};
        int int35 = baseNCodecInputStream32.read(byteArray34);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec36 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream38 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream32, baseNCodec36, true);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec40 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream42 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream39, baseNCodec40, true);
        boolean boolean43 = baseNCodecInputStream42.markSupported();
        byte[] byteArray44 = new byte[] {};
        int int45 = baseNCodecInputStream42.read(byteArray44);
        int int46 = baseNCodecInputStream32.read(byteArray44);
        int int47 = baseNCodecInputStream21.read(byteArray44);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = baseNCodecInputStream13.read(byteArray44, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream12.mark((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        boolean boolean7 = baseNCodecInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = baseNCodecInputStream6.skip((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        java.lang.Class<?> wildcardClass7 = baseNCodecInputStream3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        boolean boolean5 = baseNCodecInputStream3.markSupported();
        java.io.InputStream inputStream6 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream9.markSupported();
        java.io.InputStream inputStream11 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream11, baseNCodec12, true);
        boolean boolean15 = baseNCodecInputStream14.markSupported();
        byte[] byteArray16 = new byte[] {};
        int int17 = baseNCodecInputStream14.read(byteArray16);
        int int18 = baseNCodecInputStream9.read(byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = baseNCodecInputStream3.read(byteArray16, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec14 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream16 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream12, baseNCodec14, true);
        boolean boolean17 = baseNCodecInputStream16.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream16.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec14 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream16 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream12, baseNCodec14, true);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = baseNCodecInputStream12.skip((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec14 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream16 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream12, baseNCodec14, true);
        boolean boolean17 = baseNCodecInputStream16.markSupported();
        java.lang.Class<?> wildcardClass18 = baseNCodecInputStream16.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream9, baseNCodec10, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec13 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream15 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream9, baseNCodec13, false);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = baseNCodecInputStream9.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        java.io.InputStream inputStream10 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec11 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream13 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream10, baseNCodec11, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec14 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream16 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream10, baseNCodec14, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec17 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream19 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream16, baseNCodec17, true);
        byte[] byteArray20 = new byte[] {};
        int int23 = baseNCodecInputStream19.read(byteArray20, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = baseNCodecInputStream9.read(byteArray20, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream9, baseNCodec10, true);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec14 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream16 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream13, baseNCodec14, true);
        boolean boolean17 = baseNCodecInputStream16.markSupported();
        byte[] byteArray18 = new byte[] {};
        int int19 = baseNCodecInputStream16.read(byteArray18);
        int int20 = baseNCodecInputStream12.read(byteArray18);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec14 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream16 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream13, baseNCodec14, true);
        boolean boolean17 = baseNCodecInputStream16.markSupported();
        byte[] byteArray18 = new byte[] {};
        int int19 = baseNCodecInputStream16.read(byteArray18);
        byte[] byteArray20 = new byte[] {};
        int int21 = baseNCodecInputStream16.read(byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = baseNCodecInputStream12.read(byteArray20, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec12, false);
        boolean boolean15 = baseNCodecInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = baseNCodecInputStream6.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream6.mark((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        byte[] byteArray7 = new byte[] {};
        int int8 = baseNCodecInputStream3.read(byteArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = baseNCodecInputStream3.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream9, baseNCodec10, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec13 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream15 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream9, baseNCodec13, false);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream9.mark((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec11 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream13 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec11, true);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec15 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream17 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream14, baseNCodec15, true);
        boolean boolean18 = baseNCodecInputStream17.markSupported();
        byte[] byteArray19 = new byte[] {};
        int int20 = baseNCodecInputStream17.read(byteArray19);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec21 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream23 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream17, baseNCodec21, true);
        java.io.InputStream inputStream24 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec25 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream27 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream24, baseNCodec25, true);
        boolean boolean28 = baseNCodecInputStream27.markSupported();
        byte[] byteArray29 = new byte[] {};
        int int30 = baseNCodecInputStream27.read(byteArray29);
        int int31 = baseNCodecInputStream17.read(byteArray29);
        int int32 = baseNCodecInputStream6.read(byteArray29);
        byte[] byteArray33 = new byte[] {};
        int int34 = baseNCodecInputStream6.read(byteArray33);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = baseNCodecInputStream6.skip(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] {});
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        boolean boolean5 = baseNCodecInputStream3.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec6 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream8 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec6, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream3.mark((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream9.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = baseNCodecInputStream9.skip((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec12, false);
        java.lang.Class<?> wildcardClass15 = baseNCodecInputStream14.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        boolean boolean5 = baseNCodecInputStream3.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec6 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream8 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec6, true);
        boolean boolean9 = baseNCodecInputStream3.markSupported();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        boolean boolean11 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec12 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream14 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec12, false);
        boolean boolean15 = baseNCodecInputStream14.markSupported();
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int21 = baseNCodecInputStream14.read(byteArray18, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) 1 });
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        boolean boolean10 = baseNCodecInputStream6.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec11 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream13 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec11, true);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream13.mark((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        boolean boolean5 = baseNCodecInputStream3.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec6 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream8 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec6, true);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream9, baseNCodec10, true);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        byte[] byteArray14 = new byte[] {};
        int int15 = baseNCodecInputStream12.read(byteArray14);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec16 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream18 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream12, baseNCodec16, true);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec20 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream22 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream19, baseNCodec20, true);
        boolean boolean23 = baseNCodecInputStream22.markSupported();
        byte[] byteArray24 = new byte[] {};
        int int25 = baseNCodecInputStream22.read(byteArray24);
        int int26 = baseNCodecInputStream12.read(byteArray24);
        int int27 = baseNCodecInputStream3.read(byteArray24);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec28 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream30 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec28, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec31 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream33 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec31, false);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = baseNCodecInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec10, false);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec14 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream16 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream12, baseNCodec14, true);
        boolean boolean17 = baseNCodecInputStream16.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = baseNCodecInputStream16.skip(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream9, baseNCodec10, true);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec14 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream16 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream13, baseNCodec14, true);
        boolean boolean17 = baseNCodecInputStream16.markSupported();
        byte[] byteArray18 = new byte[] {};
        int int19 = baseNCodecInputStream16.read(byteArray18);
        int int20 = baseNCodecInputStream9.read(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream9.mark(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        byte[] byteArray5 = new byte[] {};
        int int6 = baseNCodecInputStream3.read(byteArray5);
        byte[] byteArray7 = new byte[] {};
        int int8 = baseNCodecInputStream3.read(byteArray7);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec9 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream11 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec9, false);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = baseNCodecInputStream3.skip((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec4 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream6 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec4, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec7 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream9 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream6, baseNCodec7, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream9, baseNCodec10, true);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec14 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream16 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream13, baseNCodec14, true);
        boolean boolean17 = baseNCodecInputStream16.markSupported();
        byte[] byteArray18 = new byte[] {};
        int int19 = baseNCodecInputStream16.read(byteArray18);
        int int20 = baseNCodecInputStream9.read(byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            baseNCodecInputStream9.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        boolean boolean5 = baseNCodecInputStream3.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec6 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream8 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec6, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec9 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream11 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec9, false);
        boolean boolean12 = baseNCodecInputStream11.markSupported();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        boolean boolean5 = baseNCodecInputStream3.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec6 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream8 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec6, true);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream9, baseNCodec10, true);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        byte[] byteArray14 = new byte[] {};
        int int15 = baseNCodecInputStream12.read(byteArray14);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec16 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream18 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream12, baseNCodec16, true);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec20 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream22 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream19, baseNCodec20, true);
        boolean boolean23 = baseNCodecInputStream22.markSupported();
        byte[] byteArray24 = new byte[] {};
        int int25 = baseNCodecInputStream22.read(byteArray24);
        int int26 = baseNCodecInputStream12.read(byteArray24);
        int int27 = baseNCodecInputStream3.read(byteArray24);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec28 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream30 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec28, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec31 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream33 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec31, false);
        java.io.InputStream inputStream34 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec35 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream37 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream34, baseNCodec35, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec38 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream40 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream34, baseNCodec38, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec41 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream43 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream40, baseNCodec41, true);
        boolean boolean44 = baseNCodecInputStream40.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec45 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream47 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream40, baseNCodec45, true);
        java.io.InputStream inputStream48 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec49 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream51 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream48, baseNCodec49, true);
        boolean boolean52 = baseNCodecInputStream51.markSupported();
        byte[] byteArray53 = new byte[] {};
        int int54 = baseNCodecInputStream51.read(byteArray53);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec55 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream57 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream51, baseNCodec55, true);
        java.io.InputStream inputStream58 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec59 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream61 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream58, baseNCodec59, true);
        boolean boolean62 = baseNCodecInputStream61.markSupported();
        byte[] byteArray63 = new byte[] {};
        int int64 = baseNCodecInputStream61.read(byteArray63);
        int int65 = baseNCodecInputStream51.read(byteArray63);
        int int66 = baseNCodecInputStream40.read(byteArray63);
        byte[] byteArray67 = new byte[] {};
        int int68 = baseNCodecInputStream40.read(byteArray67);
        int int69 = baseNCodecInputStream33.read(byteArray67);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] {});
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(byteArray63);
        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(byteArray67);
        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] {});
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        boolean boolean5 = baseNCodecInputStream3.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec6 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream8 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec6, true);
        java.io.InputStream inputStream9 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec10 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream12 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream9, baseNCodec10, true);
        boolean boolean13 = baseNCodecInputStream12.markSupported();
        byte[] byteArray14 = new byte[] {};
        int int15 = baseNCodecInputStream12.read(byteArray14);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec16 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream18 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream12, baseNCodec16, true);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec20 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream22 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream19, baseNCodec20, true);
        boolean boolean23 = baseNCodecInputStream22.markSupported();
        byte[] byteArray24 = new byte[] {};
        int int25 = baseNCodecInputStream22.read(byteArray24);
        int int26 = baseNCodecInputStream12.read(byteArray24);
        int int27 = baseNCodecInputStream3.read(byteArray24);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec28 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream30 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec28, true);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec32 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream34 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream31, baseNCodec32, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec35 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream37 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream31, baseNCodec35, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec38 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream40 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream37, baseNCodec38, true);
        boolean boolean41 = baseNCodecInputStream37.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec42 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream44 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream37, baseNCodec42, true);
        java.io.InputStream inputStream45 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec46 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream48 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream45, baseNCodec46, true);
        boolean boolean49 = baseNCodecInputStream48.markSupported();
        byte[] byteArray50 = new byte[] {};
        int int51 = baseNCodecInputStream48.read(byteArray50);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec52 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream54 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream48, baseNCodec52, true);
        java.io.InputStream inputStream55 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec56 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream58 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream55, baseNCodec56, true);
        boolean boolean59 = baseNCodecInputStream58.markSupported();
        byte[] byteArray60 = new byte[] {};
        int int61 = baseNCodecInputStream58.read(byteArray60);
        int int62 = baseNCodecInputStream48.read(byteArray60);
        int int63 = baseNCodecInputStream37.read(byteArray60);
        byte[] byteArray64 = new byte[] {};
        int int65 = baseNCodecInputStream37.read(byteArray64);
        int int66 = baseNCodecInputStream3.read(byteArray64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] {});
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec1 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream3 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream0, baseNCodec1, true);
        boolean boolean4 = baseNCodecInputStream3.markSupported();
        boolean boolean5 = baseNCodecInputStream3.markSupported();
        org.apache.commons.codec.binary.BaseNCodec baseNCodec6 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream8 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec6, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec9 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream11 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream3, baseNCodec9, false);
        java.io.InputStream inputStream12 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec13 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream15 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream12, baseNCodec13, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec16 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream18 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream12, baseNCodec16, true);
        org.apache.commons.codec.binary.BaseNCodec baseNCodec19 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream21 = new org.apache.commons.codec.binary.BaseNCodecInputStream((java.io.InputStream) baseNCodecInputStream18, baseNCodec19, true);
        boolean boolean22 = baseNCodecInputStream18.markSupported();
        boolean boolean23 = baseNCodecInputStream18.markSupported();
        java.io.InputStream inputStream24 = null;
        org.apache.commons.codec.binary.BaseNCodec baseNCodec25 = null;
        org.apache.commons.codec.binary.BaseNCodecInputStream baseNCodecInputStream27 = new org.apache.commons.codec.binary.BaseNCodecInputStream(inputStream24, baseNCodec25, true);
        boolean boolean28 = baseNCodecInputStream27.markSupported();
        byte[] byteArray29 = new byte[] {};
        int int30 = baseNCodecInputStream27.read(byteArray29);
        int int31 = baseNCodecInputStream18.read(byteArray29);
        int int32 = baseNCodecInputStream3.read(byteArray29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }
}

