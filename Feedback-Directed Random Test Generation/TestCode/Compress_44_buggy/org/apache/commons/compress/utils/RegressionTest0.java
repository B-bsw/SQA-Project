package org.apache.commons.compress.utils;

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
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = checksumCalculatingInputStream2.skip((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = checksumCalculatingInputStream2.read(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int8 = checksumCalculatingInputStream2.read(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0 });
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = checksumCalculatingInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = checksumCalculatingInputStream2.skip((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray8 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int9 = checksumCalculatingInputStream2.read(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 1 });
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream2);
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int12 = checksumCalculatingInputStream4.read(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = checksumCalculatingInputStream2.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        java.lang.Class<?> wildcardClass8 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = checksumCalculatingInputStream2.read(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray6 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int9 = checksumCalculatingInputStream2.read(byteArray6, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 1 });
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int12 = checksumCalculatingInputStream2.read(byteArray9, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        byte[] byteArray4 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int7 = checksumCalculatingInputStream2.read(byteArray4, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) 10 });
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        // The following exception was thrown during execution in test generation
        try {
            long long3 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        boolean boolean5 = checksumCalculatingInputStream2.markSupported();
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = checksumCalculatingInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream2);
        byte[] byteArray5 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int8 = checksumCalculatingInputStream4.read(byteArray5, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        java.lang.Class<?> wildcardClass4 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int15 = checksumCalculatingInputStream2.read(byteArray12, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 100 });
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        int int5 = checksumCalculatingInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        int int5 = checksumCalculatingInputStream2.available();
        byte[] byteArray6 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int7 = checksumCalculatingInputStream2.read(byteArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int11 = checksumCalculatingInputStream2.read(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 100 });
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = checksumCalculatingInputStream4.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = checksumCalculatingInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = checksumCalculatingInputStream2.skip((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        java.lang.Class<?> wildcardClass11 = checksumCalculatingInputStream10.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = checksumCalculatingInputStream2.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        boolean boolean10 = checksumCalculatingInputStream2.markSupported();
        boolean boolean11 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        boolean boolean5 = checksumCalculatingInputStream2.markSupported();
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int16 = checksumCalculatingInputStream2.read(byteArray13, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 0 });
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream16.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream14.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int24 = checksumCalculatingInputStream14.read(byteArray21, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 });
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = checksumCalculatingInputStream14.skip((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int7 = checksumCalculatingInputStream2.read(byteArray4, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        java.lang.Class<?> wildcardClass3 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream2);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = checksumCalculatingInputStream4.skip((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        byte[] byteArray10 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int11 = checksumCalculatingInputStream2.read(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = checksumCalculatingInputStream10.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 1 });
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        java.lang.Class<?> wildcardClass10 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = checksumCalculatingInputStream14.skip((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream13.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        byte[] byteArray11 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int14 = checksumCalculatingInputStream2.read(byteArray11, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1 });
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int13 = checksumCalculatingInputStream2.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) -1 });
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        int int4 = checksumCalculatingInputStream2.available();
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int12 = checksumCalculatingInputStream2.read(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = checksumCalculatingInputStream13.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        boolean boolean10 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        java.lang.Class<?> wildcardClass5 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = checksumCalculatingInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int20 = checksumCalculatingInputStream13.read(byteArray17, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 1 });
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        int int10 = checksumCalculatingInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        int int4 = checksumCalculatingInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = checksumCalculatingInputStream2.skip((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        boolean boolean5 = checksumCalculatingInputStream2.markSupported();
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int12 = checksumCalculatingInputStream2.read(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 10, (byte) 100 });
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = checksumCalculatingInputStream9.skip((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        boolean boolean5 = checksumCalculatingInputStream2.markSupported();
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = checksumCalculatingInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        boolean boolean15 = checksumCalculatingInputStream13.markSupported();
        boolean boolean16 = checksumCalculatingInputStream13.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = checksumCalculatingInputStream13.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        boolean boolean14 = checksumCalculatingInputStream13.markSupported();
        boolean boolean15 = checksumCalculatingInputStream13.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = checksumCalculatingInputStream13.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = checksumCalculatingInputStream12.skip((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream2);
        byte[] byteArray11 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int12 = checksumCalculatingInputStream4.read(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        boolean boolean14 = checksumCalculatingInputStream12.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = checksumCalculatingInputStream12.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream10.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = checksumCalculatingInputStream3.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        boolean boolean10 = checksumCalculatingInputStream2.markSupported();
        int int11 = checksumCalculatingInputStream2.available();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int17 = checksumCalculatingInputStream2.read(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 0 });
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = checksumCalculatingInputStream2.skip(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        byte[] byteArray14 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int15 = checksumCalculatingInputStream12.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = checksumCalculatingInputStream16.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        byte[] byteArray10 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int11 = checksumCalculatingInputStream9.read(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        int int11 = checksumCalculatingInputStream10.available();
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = checksumCalculatingInputStream10.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 100 });
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        int int13 = checksumCalculatingInputStream3.available();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = checksumCalculatingInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream2);
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int11 = checksumCalculatingInputStream4.read(byteArray8, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) -1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        boolean boolean14 = checksumCalculatingInputStream13.markSupported();
        boolean boolean15 = checksumCalculatingInputStream13.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        java.lang.Class<?> wildcardClass17 = checksumCalculatingInputStream16.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray8 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int11 = checksumCalculatingInputStream2.read(byteArray8, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark((int) 'a');
        int int7 = checksumCalculatingInputStream2.available();
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int15 = checksumCalculatingInputStream2.read(byteArray12, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0 });
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        byte[] byteArray4 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int5 = checksumCalculatingInputStream2.read(byteArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] {});
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        boolean boolean15 = checksumCalculatingInputStream13.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = checksumCalculatingInputStream13.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        int int11 = checksumCalculatingInputStream10.available();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = checksumCalculatingInputStream10.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = checksumCalculatingInputStream2.skip((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream14.close();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = checksumCalculatingInputStream14.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        boolean boolean12 = checksumCalculatingInputStream3.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        int int7 = checksumCalculatingInputStream2.available();
        byte[] byteArray12 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int13 = checksumCalculatingInputStream2.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream9.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = checksumCalculatingInputStream10.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.mark((int) '#');
        java.lang.Class<?> wildcardClass15 = checksumCalculatingInputStream3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        boolean boolean10 = checksumCalculatingInputStream2.markSupported();
        int int11 = checksumCalculatingInputStream2.available();
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int17 = checksumCalculatingInputStream2.read(byteArray14, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) 1 });
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) 10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = checksumCalculatingInputStream10.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.mark((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = checksumCalculatingInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        boolean boolean7 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (short) 0);
        byte[] byteArray15 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = checksumCalculatingInputStream2.read(byteArray15, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 0, (byte) 1 });
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream14.close();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = checksumCalculatingInputStream14.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        int int5 = checksumCalculatingInputStream2.available();
        byte[] byteArray6 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int9 = checksumCalculatingInputStream2.read(byteArray6, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) 10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = checksumCalculatingInputStream2.skip((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int17 = checksumCalculatingInputStream2.read(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100 });
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int12 = checksumCalculatingInputStream2.read(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) 100 });
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long10 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int14 = checksumCalculatingInputStream3.read(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 0, (byte) 0 });
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        boolean boolean5 = checksumCalculatingInputStream3.markSupported();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = checksumCalculatingInputStream3.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        byte[] byteArray12 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int15 = checksumCalculatingInputStream3.read(byteArray12, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100 });
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark((int) 'a');
        int int7 = checksumCalculatingInputStream2.available();
        java.lang.Class<?> wildcardClass8 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        boolean boolean15 = checksumCalculatingInputStream13.markSupported();
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int21 = checksumCalculatingInputStream13.read(byteArray18, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 1, (byte) 1 });
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        java.lang.Class<?> wildcardClass6 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream14.close();
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int26 = checksumCalculatingInputStream14.read(byteArray23, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 1 });
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.close();
        boolean boolean9 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = checksumCalculatingInputStream2.read(byteArray15, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        boolean boolean14 = checksumCalculatingInputStream13.markSupported();
        boolean boolean15 = checksumCalculatingInputStream13.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream13.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.close();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream17.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        boolean boolean14 = checksumCalculatingInputStream12.markSupported();
        byte[] byteArray15 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int16 = checksumCalculatingInputStream12.read(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        boolean boolean5 = checksumCalculatingInputStream2.markSupported();
        java.lang.Class<?> wildcardClass6 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = checksumCalculatingInputStream2.skip(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark((int) 'a');
        int int7 = checksumCalculatingInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        int int13 = checksumCalculatingInputStream5.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream15);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = checksumCalculatingInputStream15.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        boolean boolean5 = checksumCalculatingInputStream2.markSupported();
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = checksumCalculatingInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        boolean boolean8 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (short) 0);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        java.lang.Class<?> wildcardClass12 = checksumCalculatingInputStream3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        boolean boolean8 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (short) 0);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        boolean boolean8 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (short) 0);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream11.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int13 = checksumCalculatingInputStream6.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 0 });
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        int int4 = checksumCalculatingInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = checksumCalculatingInputStream2.skip((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        boolean boolean8 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (short) 0);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int20 = checksumCalculatingInputStream3.read(byteArray17, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        boolean boolean5 = checksumCalculatingInputStream3.markSupported();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        int int10 = checksumCalculatingInputStream3.available();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        byte[] byteArray8 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int11 = checksumCalculatingInputStream2.read(byteArray8, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        int int12 = checksumCalculatingInputStream4.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        byte[] byteArray15 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int16 = checksumCalculatingInputStream13.read(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        boolean boolean14 = checksumCalculatingInputStream12.markSupported();
        int int15 = checksumCalculatingInputStream12.available();
        byte[] byteArray17 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = checksumCalculatingInputStream12.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0 });
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = checksumCalculatingInputStream3.skip((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray7 = new byte[] { (byte) 100, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int8 = checksumCalculatingInputStream2.read(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 100, (byte) 0, (byte) 100 });
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        byte[] byteArray10 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int11 = checksumCalculatingInputStream2.read(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0, (byte) 0, (byte) 0 });
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark((int) 'a');
        int int7 = checksumCalculatingInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) 10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = checksumCalculatingInputStream10.skip((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        boolean boolean15 = checksumCalculatingInputStream13.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = checksumCalculatingInputStream13.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        boolean boolean7 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray13 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int14 = checksumCalculatingInputStream2.read(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        boolean boolean5 = checksumCalculatingInputStream2.markSupported();
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        java.lang.Class<?> wildcardClass8 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = checksumCalculatingInputStream3.skip((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        boolean boolean10 = checksumCalculatingInputStream2.markSupported();
        boolean boolean11 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = checksumCalculatingInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        int int6 = checksumCalculatingInputStream2.available();
        byte[] byteArray8 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int9 = checksumCalculatingInputStream2.read(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] { (byte) 1 });
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        boolean boolean7 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = checksumCalculatingInputStream16.skip((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int17 = checksumCalculatingInputStream2.read(byteArray14, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (byte) 1);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark((int) ' ');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int21 = checksumCalculatingInputStream15.read(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = checksumCalculatingInputStream9.skip((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        int int12 = checksumCalculatingInputStream3.available();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = checksumCalculatingInputStream3.skip((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream14.close();
        checksumCalculatingInputStream14.close();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = checksumCalculatingInputStream14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        boolean boolean5 = checksumCalculatingInputStream3.markSupported();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean10 = checksumCalculatingInputStream9.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = checksumCalculatingInputStream9.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        int int18 = checksumCalculatingInputStream17.available();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream17.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = checksumCalculatingInputStream3.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean17 = checksumCalculatingInputStream14.markSupported();
        int int18 = checksumCalculatingInputStream14.available();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        boolean boolean15 = checksumCalculatingInputStream13.markSupported();
        boolean boolean16 = checksumCalculatingInputStream13.markSupported();
        byte[] byteArray22 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int23 = checksumCalculatingInputStream13.read(byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 1 });
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = checksumCalculatingInputStream9.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream16.close();
        boolean boolean18 = checksumCalculatingInputStream16.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = checksumCalculatingInputStream16.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        java.lang.Class<?> wildcardClass6 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(100);
        byte[] byteArray8 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int9 = checksumCalculatingInputStream2.read(byteArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        int int7 = checksumCalculatingInputStream3.available();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = checksumCalculatingInputStream3.skip(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream14.close();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = checksumCalculatingInputStream14.skip((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        int int6 = checksumCalculatingInputStream2.available();
        int int7 = checksumCalculatingInputStream2.available();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.util.zip.Checksum checksum4 = null;
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum4, inputStream5);
        boolean boolean7 = checksumCalculatingInputStream6.markSupported();
        checksumCalculatingInputStream6.mark((int) (byte) -1);
        checksumCalculatingInputStream6.mark((int) '4');
        checksumCalculatingInputStream6.mark((int) (short) -1);
        boolean boolean14 = checksumCalculatingInputStream6.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, (java.io.InputStream) checksumCalculatingInputStream6);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream15);
        boolean boolean17 = checksumCalculatingInputStream15.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream18 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream15);
        checksumCalculatingInputStream15.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream20 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream15);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream15.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        boolean boolean5 = checksumCalculatingInputStream2.markSupported();
        int int6 = checksumCalculatingInputStream2.available();
        java.lang.Class<?> wildcardClass7 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) 10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int19 = checksumCalculatingInputStream3.read(byteArray16, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) -1 });
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int10 = checksumCalculatingInputStream2.read(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0 });
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream14.close();
        boolean boolean18 = checksumCalculatingInputStream14.markSupported();
        byte[] byteArray25 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int26 = checksumCalculatingInputStream14.read(byteArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 10 });
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        checksumCalculatingInputStream14.mark((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = checksumCalculatingInputStream14.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        int int11 = checksumCalculatingInputStream10.available();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream10.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        boolean boolean14 = checksumCalculatingInputStream13.markSupported();
        boolean boolean15 = checksumCalculatingInputStream13.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        int int17 = checksumCalculatingInputStream13.available();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        int int6 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.mark((int) (short) 100);
        boolean boolean9 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = checksumCalculatingInputStream2.skip((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        java.lang.Class<?> wildcardClass17 = checksumCalculatingInputStream16.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = checksumCalculatingInputStream3.skip((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        boolean boolean5 = checksumCalculatingInputStream2.markSupported();
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int13 = checksumCalculatingInputStream2.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 100 });
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        boolean boolean14 = checksumCalculatingInputStream12.markSupported();
        checksumCalculatingInputStream12.mark((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream12.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        boolean boolean5 = checksumCalculatingInputStream3.markSupported();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean10 = checksumCalculatingInputStream9.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream9.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        int int4 = checksumCalculatingInputStream2.available();
        boolean boolean5 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray11 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int14 = checksumCalculatingInputStream2.read(byteArray11, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1 });
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        boolean boolean5 = checksumCalculatingInputStream2.markSupported();
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        checksumCalculatingInputStream2.close();
        boolean boolean11 = checksumCalculatingInputStream2.markSupported();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream14.close();
        checksumCalculatingInputStream14.mark((int) (byte) 100);
        byte[] byteArray23 = new byte[] { (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int26 = checksumCalculatingInputStream14.read(byteArray23, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        int int10 = checksumCalculatingInputStream2.available();
        byte[] byteArray11 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int14 = checksumCalculatingInputStream2.read(byteArray11, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] {});
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        checksumCalculatingInputStream14.mark((int) (short) 100);
        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int23 = checksumCalculatingInputStream14.read(byteArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 10, (byte) 1 });
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) 10);
        boolean boolean9 = checksumCalculatingInputStream2.markSupported();
        int int10 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.mark((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long14 = checksumCalculatingInputStream2.skip((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean10 = checksumCalculatingInputStream9.markSupported();
        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int16 = checksumCalculatingInputStream9.read(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100 });
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        byte[] byteArray17 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = checksumCalculatingInputStream10.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) -1, (byte) 100, (byte) 100 });
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        int int5 = checksumCalculatingInputStream3.available();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        java.lang.Class<?> wildcardClass8 = checksumCalculatingInputStream3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        int int18 = checksumCalculatingInputStream17.available();
        java.lang.Class<?> wildcardClass19 = checksumCalculatingInputStream17.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        boolean boolean12 = checksumCalculatingInputStream3.markSupported();
        java.lang.Class<?> wildcardClass13 = checksumCalculatingInputStream3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        int int8 = checksumCalculatingInputStream2.available();
        byte[] byteArray12 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int13 = checksumCalculatingInputStream2.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 1, (byte) 100, (byte) -1 });
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream14.close();
        checksumCalculatingInputStream14.close();
        checksumCalculatingInputStream14.mark((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = checksumCalculatingInputStream14.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        boolean boolean12 = checksumCalculatingInputStream3.markSupported();
        boolean boolean13 = checksumCalculatingInputStream3.markSupported();
        int int14 = checksumCalculatingInputStream3.available();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        boolean boolean5 = checksumCalculatingInputStream3.markSupported();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.close();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream12.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        int int12 = checksumCalculatingInputStream4.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        boolean boolean14 = checksumCalculatingInputStream13.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        byte[] byteArray17 = new byte[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = checksumCalculatingInputStream13.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0 });
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = checksumCalculatingInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.util.zip.Checksum checksum4 = null;
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum4, inputStream5);
        boolean boolean7 = checksumCalculatingInputStream6.markSupported();
        checksumCalculatingInputStream6.mark((int) (byte) -1);
        checksumCalculatingInputStream6.mark((int) '4');
        checksumCalculatingInputStream6.mark((int) (short) -1);
        boolean boolean14 = checksumCalculatingInputStream6.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, (java.io.InputStream) checksumCalculatingInputStream6);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream15);
        boolean boolean17 = checksumCalculatingInputStream15.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream18 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream15);
        checksumCalculatingInputStream15.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream20 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream15);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream20.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        boolean boolean10 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) 10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = checksumCalculatingInputStream3.skip((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        boolean boolean5 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray6 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int9 = checksumCalculatingInputStream2.read(byteArray6, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        boolean boolean7 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = checksumCalculatingInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        java.lang.Class<?> wildcardClass8 = checksumCalculatingInputStream3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = checksumCalculatingInputStream10.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.mark((int) '#');
        checksumCalculatingInputStream3.mark((int) '4');
        byte[] byteArray17 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int18 = checksumCalculatingInputStream3.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = checksumCalculatingInputStream11.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        int int13 = checksumCalculatingInputStream3.available();
        byte[] byteArray19 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int20 = checksumCalculatingInputStream3.read(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream12.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = checksumCalculatingInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        int int4 = checksumCalculatingInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = checksumCalculatingInputStream2.skip((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        int int5 = checksumCalculatingInputStream3.available();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int16 = checksumCalculatingInputStream7.read(byteArray13, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) -1 });
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = checksumCalculatingInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        checksumCalculatingInputStream12.close();
        checksumCalculatingInputStream12.mark(1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long8 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        int int12 = checksumCalculatingInputStream3.available();
        byte[] byteArray13 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int14 = checksumCalculatingInputStream3.read(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = checksumCalculatingInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        boolean boolean10 = checksumCalculatingInputStream2.markSupported();
        boolean boolean11 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        java.lang.Class<?> wildcardClass13 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        int int5 = checksumCalculatingInputStream3.available();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.mark((int) (byte) 100);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.close();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream14.close();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = checksumCalculatingInputStream14.skip((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        boolean boolean14 = checksumCalculatingInputStream12.markSupported();
        int int15 = checksumCalculatingInputStream12.available();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = checksumCalculatingInputStream12.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(100);
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream10.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        byte[] byteArray5 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = checksumCalculatingInputStream2.read(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100 });
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        boolean boolean14 = checksumCalculatingInputStream13.markSupported();
        boolean boolean15 = checksumCalculatingInputStream13.markSupported();
        int int16 = checksumCalculatingInputStream13.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream13.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        boolean boolean5 = checksumCalculatingInputStream2.markSupported();
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        boolean boolean7 = checksumCalculatingInputStream2.markSupported();
        int int8 = checksumCalculatingInputStream2.available();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(100);
        java.lang.Class<?> wildcardClass8 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        boolean boolean5 = checksumCalculatingInputStream3.markSupported();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.mark((int) (byte) 10);
        int int12 = checksumCalculatingInputStream3.available();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        int int5 = checksumCalculatingInputStream4.available();
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.mark((int) 'a');
        int int9 = checksumCalculatingInputStream4.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        checksumCalculatingInputStream10.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream10);
        java.lang.Class<?> wildcardClass13 = checksumCalculatingInputStream12.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        boolean boolean10 = checksumCalculatingInputStream2.markSupported();
        java.lang.Class<?> wildcardClass11 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream4);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream11.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark((int) ' ');
        int int14 = checksumCalculatingInputStream2.available();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int21 = checksumCalculatingInputStream2.read(byteArray18, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100, (byte) 1, (byte) 1 });
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = checksumCalculatingInputStream3.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        boolean boolean14 = checksumCalculatingInputStream12.markSupported();
        int int15 = checksumCalculatingInputStream12.available();
        byte[] byteArray17 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = checksumCalculatingInputStream12.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1 });
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) 10);
        boolean boolean9 = checksumCalculatingInputStream2.markSupported();
        int int10 = checksumCalculatingInputStream2.available();
        int int11 = checksumCalculatingInputStream2.available();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        int int6 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.mark((int) (short) 100);
        boolean boolean9 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        java.lang.Class<?> wildcardClass11 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        int int12 = checksumCalculatingInputStream4.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        boolean boolean14 = checksumCalculatingInputStream13.markSupported();
        checksumCalculatingInputStream13.close();
        boolean boolean16 = checksumCalculatingInputStream13.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        byte[] byteArray7 = new byte[] { (byte) 0, (byte) 10, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int8 = checksumCalculatingInputStream2.read(byteArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 0, (byte) 10, (byte) 1 });
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        boolean boolean10 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray13 = new byte[] { (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int16 = checksumCalculatingInputStream2.read(byteArray13, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) -1, (byte) 1 });
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream14.close();
        java.lang.Class<?> wildcardClass19 = checksumCalculatingInputStream14.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream3.markSupported();
        byte[] byteArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int17 = checksumCalculatingInputStream3.read(byteArray14, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        boolean boolean15 = checksumCalculatingInputStream13.markSupported();
        boolean boolean16 = checksumCalculatingInputStream13.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = checksumCalculatingInputStream13.skip((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = checksumCalculatingInputStream2.skip((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        byte[] byteArray9 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int10 = checksumCalculatingInputStream3.read(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 1 });
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray5 = new byte[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int6 = checksumCalculatingInputStream2.read(byteArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1 });
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark((int) ' ');
        int int14 = checksumCalculatingInputStream2.available();
        int int15 = checksumCalculatingInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream2);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        java.lang.Class<?> wildcardClass6 = checksumCalculatingInputStream4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = checksumCalculatingInputStream14.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        boolean boolean8 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (short) 0);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = checksumCalculatingInputStream11.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        boolean boolean8 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (short) 0);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream11.mark((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream11.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        int int11 = checksumCalculatingInputStream10.available();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = checksumCalculatingInputStream10.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream12.close();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        checksumCalculatingInputStream12.close();
        byte[] byteArray18 = new byte[] { (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int21 = checksumCalculatingInputStream12.read(byteArray18, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 10, (byte) 10, (byte) 100 });
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean17 = checksumCalculatingInputStream16.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = checksumCalculatingInputStream16.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean8 = checksumCalculatingInputStream7.markSupported();
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int14 = checksumCalculatingInputStream7.read(byteArray11, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) 10 });
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(100);
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = checksumCalculatingInputStream3.read(byteArray15, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) -1 });
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = checksumCalculatingInputStream2.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        boolean boolean7 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (short) 0);
        int int10 = checksumCalculatingInputStream2.available();
        int int11 = checksumCalculatingInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int20 = checksumCalculatingInputStream12.read(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream16.close();
        boolean boolean18 = checksumCalculatingInputStream16.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = checksumCalculatingInputStream16.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        checksumCalculatingInputStream12.close();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream14.close();
        checksumCalculatingInputStream14.close();
        checksumCalculatingInputStream14.mark((int) 'a');
        checksumCalculatingInputStream14.close();
        checksumCalculatingInputStream14.close();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        byte[] byteArray17 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int20 = checksumCalculatingInputStream14.read(byteArray17, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = checksumCalculatingInputStream12.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream14.close();
        checksumCalculatingInputStream14.close();
        checksumCalculatingInputStream14.close();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream14.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        boolean boolean10 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        boolean boolean7 = checksumCalculatingInputStream2.markSupported();
        int int8 = checksumCalculatingInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) (short) 10);
        int int8 = checksumCalculatingInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        int int5 = checksumCalculatingInputStream3.available();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.mark((int) (byte) 100);
        checksumCalculatingInputStream3.close();
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int15 = checksumCalculatingInputStream3.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) -1, (byte) 0 });
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream16.close();
        boolean boolean18 = checksumCalculatingInputStream16.markSupported();
        java.lang.Class<?> wildcardClass19 = checksumCalculatingInputStream16.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        boolean boolean5 = checksumCalculatingInputStream3.markSupported();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.close();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = checksumCalculatingInputStream3.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        boolean boolean14 = checksumCalculatingInputStream13.markSupported();
        boolean boolean15 = checksumCalculatingInputStream13.markSupported();
        int int16 = checksumCalculatingInputStream13.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = checksumCalculatingInputStream13.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        checksumCalculatingInputStream12.close();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = checksumCalculatingInputStream12.skip((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        checksumCalculatingInputStream12.close();
        boolean boolean15 = checksumCalculatingInputStream12.markSupported();
        byte[] byteArray16 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int19 = checksumCalculatingInputStream12.read(byteArray16, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        boolean boolean14 = checksumCalculatingInputStream13.markSupported();
        boolean boolean15 = checksumCalculatingInputStream13.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream16.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark((int) '4');
        byte[] byteArray11 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int12 = checksumCalculatingInputStream2.read(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1 });
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        int int5 = checksumCalculatingInputStream2.available();
        byte[] byteArray6 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int9 = checksumCalculatingInputStream2.read(byteArray6, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        boolean boolean10 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int17 = checksumCalculatingInputStream2.read(byteArray14, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) -1, (byte) -1 });
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream16.close();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream16.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) (short) 10);
        int int8 = checksumCalculatingInputStream2.available();
        boolean boolean9 = checksumCalculatingInputStream2.markSupported();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark((int) (byte) 0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) (short) 10);
        checksumCalculatingInputStream2.mark((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = checksumCalculatingInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        byte[] byteArray15 = new byte[] { (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = checksumCalculatingInputStream3.read(byteArray15, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 10, (byte) 10, (byte) 100 });
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        boolean boolean5 = checksumCalculatingInputStream3.markSupported();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean10 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = checksumCalculatingInputStream3.skip((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(100);
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = checksumCalculatingInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream2);
        checksumCalculatingInputStream4.mark((int) (byte) 0);
        byte[] byteArray7 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int10 = checksumCalculatingInputStream4.read(byteArray7, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        int int13 = checksumCalculatingInputStream3.available();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = checksumCalculatingInputStream3.skip(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        checksumCalculatingInputStream12.close();
        boolean boolean15 = checksumCalculatingInputStream12.markSupported();
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int22 = checksumCalculatingInputStream12.read(byteArray19, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 1, (byte) 1, (byte) 0 });
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.mark((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long6 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        byte[] byteArray18 = new byte[] { (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int21 = checksumCalculatingInputStream3.read(byteArray18, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100, (byte) 10, (byte) 0 });
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean8 = checksumCalculatingInputStream7.markSupported();
        checksumCalculatingInputStream7.mark((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        boolean boolean5 = checksumCalculatingInputStream3.markSupported();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.mark((int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = checksumCalculatingInputStream3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(100);
        checksumCalculatingInputStream2.close();
        int int9 = checksumCalculatingInputStream2.available();
        byte[] byteArray11 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int12 = checksumCalculatingInputStream2.read(byteArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 10 });
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark((int) 'a');
        int int8 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream9.close();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = checksumCalculatingInputStream9.skip((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        int int5 = checksumCalculatingInputStream3.available();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.mark((int) (byte) 100);
        byte[] byteArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = checksumCalculatingInputStream3.read(byteArray10, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = checksumCalculatingInputStream14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream3.markSupported();
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int20 = checksumCalculatingInputStream3.read(byteArray17, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) 1, (byte) -1 });
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.close();
        boolean boolean7 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = checksumCalculatingInputStream2.skip((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean17 = checksumCalculatingInputStream14.markSupported();
        checksumCalculatingInputStream14.close();
        java.lang.Class<?> wildcardClass19 = checksumCalculatingInputStream14.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        boolean boolean10 = checksumCalculatingInputStream2.markSupported();
        int int11 = checksumCalculatingInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = checksumCalculatingInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        checksumCalculatingInputStream4.mark((int) '#');
        checksumCalculatingInputStream4.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream18 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.close();
        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int19 = checksumCalculatingInputStream3.read(byteArray16, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) 0 });
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        int int6 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.mark((int) (short) 100);
        boolean boolean9 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark((int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int26 = checksumCalculatingInputStream17.read(byteArray23, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 0 });
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        boolean boolean8 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (short) 0);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int17 = checksumCalculatingInputStream12.read(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) 0, (byte) 10 });
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        boolean boolean14 = checksumCalculatingInputStream13.markSupported();
        boolean boolean15 = checksumCalculatingInputStream13.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = checksumCalculatingInputStream13.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        boolean boolean8 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = checksumCalculatingInputStream2.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = checksumCalculatingInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        boolean boolean14 = checksumCalculatingInputStream13.markSupported();
        boolean boolean15 = checksumCalculatingInputStream13.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int23 = checksumCalculatingInputStream13.read(byteArray20, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) -1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        boolean boolean8 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        int int12 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.mark(10);
        byte[] byteArray15 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int16 = checksumCalculatingInputStream3.read(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) 10);
        boolean boolean9 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = checksumCalculatingInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = checksumCalculatingInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (byte) 1);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark((int) ' ');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = checksumCalculatingInputStream3.skip((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        boolean boolean7 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray9 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int12 = checksumCalculatingInputStream2.read(byteArray9, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) -1 });
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean17 = checksumCalculatingInputStream16.markSupported();
        byte[] byteArray23 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int24 = checksumCalculatingInputStream16.read(byteArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = checksumCalculatingInputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        boolean boolean14 = checksumCalculatingInputStream12.markSupported();
        checksumCalculatingInputStream12.close();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        int int13 = checksumCalculatingInputStream3.available();
        byte[] byteArray14 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int15 = checksumCalculatingInputStream3.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = checksumCalculatingInputStream2.skip((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.util.zip.Checksum checksum4 = null;
        java.util.zip.Checksum checksum5 = null;
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum5, inputStream6);
        boolean boolean8 = checksumCalculatingInputStream7.markSupported();
        checksumCalculatingInputStream7.mark((int) (byte) -1);
        checksumCalculatingInputStream7.mark((int) '4');
        checksumCalculatingInputStream7.mark((int) (short) -1);
        boolean boolean15 = checksumCalculatingInputStream7.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum4, (java.io.InputStream) checksumCalculatingInputStream7);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, (java.io.InputStream) checksumCalculatingInputStream16);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream18 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream16);
        checksumCalculatingInputStream18.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream20 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream18);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream21 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream20);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.util.zip.Checksum checksum4 = null;
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum4, inputStream5);
        boolean boolean7 = checksumCalculatingInputStream6.markSupported();
        checksumCalculatingInputStream6.mark((int) (byte) -1);
        checksumCalculatingInputStream6.mark((int) '4');
        checksumCalculatingInputStream6.mark((int) (short) -1);
        int int14 = checksumCalculatingInputStream6.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, (java.io.InputStream) checksumCalculatingInputStream6);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream15);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream16);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream18 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream17);
        int int19 = checksumCalculatingInputStream18.available();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (byte) 1);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark((int) ' ');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = checksumCalculatingInputStream15.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        int int5 = checksumCalculatingInputStream4.available();
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.mark((int) 'a');
        int int9 = checksumCalculatingInputStream4.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        checksumCalculatingInputStream10.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream10);
        boolean boolean13 = checksumCalculatingInputStream10.markSupported();
        checksumCalculatingInputStream10.mark((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(100);
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = checksumCalculatingInputStream14.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = checksumCalculatingInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        boolean boolean8 = checksumCalculatingInputStream2.markSupported();
        byte[] byteArray14 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int15 = checksumCalculatingInputStream2.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream2);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = checksumCalculatingInputStream4.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        checksumCalculatingInputStream12.close();
        boolean boolean15 = checksumCalculatingInputStream12.markSupported();
        boolean boolean16 = checksumCalculatingInputStream12.markSupported();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream14.close();
        checksumCalculatingInputStream14.mark(10);
        java.lang.Class<?> wildcardClass21 = checksumCalculatingInputStream14.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.mark((int) '4');
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        int int12 = checksumCalculatingInputStream2.available();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = checksumCalculatingInputStream2.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 100 });
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark((int) 'a');
        int int8 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.close();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(100);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = checksumCalculatingInputStream2.skip((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream12.mark((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        boolean boolean7 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (short) 0);
        int int10 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.mark((int) (short) 0);
        checksumCalculatingInputStream2.mark((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        int int6 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.mark((int) (short) 100);
        boolean boolean9 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(100);
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream10.close();
        boolean boolean12 = checksumCalculatingInputStream10.markSupported();
        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int17 = checksumCalculatingInputStream10.read(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 0, (byte) 0 });
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        int int13 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.mark((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        int int14 = checksumCalculatingInputStream12.available();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = checksumCalculatingInputStream12.skip((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        byte[] byteArray14 = new byte[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int17 = checksumCalculatingInputStream3.read(byteArray14, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100 });
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        int int4 = checksumCalculatingInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = checksumCalculatingInputStream2.skip((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.mark(10);
        boolean boolean8 = checksumCalculatingInputStream4.markSupported();
        boolean boolean9 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (short) 0);
        int int12 = checksumCalculatingInputStream4.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream4);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = checksumCalculatingInputStream4.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (byte) 1);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            long long11 = checksumCalculatingInputStream2.skip((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(100);
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream10.close();
        boolean boolean12 = checksumCalculatingInputStream10.markSupported();
        boolean boolean13 = checksumCalculatingInputStream10.markSupported();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        int int7 = checksumCalculatingInputStream3.available();
        java.lang.Class<?> wildcardClass8 = checksumCalculatingInputStream3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        boolean boolean12 = checksumCalculatingInputStream3.markSupported();
        byte[] byteArray17 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int20 = checksumCalculatingInputStream3.read(byteArray17, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) -1 });
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) (short) 10);
        checksumCalculatingInputStream2.mark((int) ' ');
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int15 = checksumCalculatingInputStream2.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10 });
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(100);
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream10.close();
        int int12 = checksumCalculatingInputStream10.available();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream14.close();
        checksumCalculatingInputStream14.close();
        checksumCalculatingInputStream14.mark((int) 'a');
        checksumCalculatingInputStream14.close();
        int int23 = checksumCalculatingInputStream14.available();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.mark(10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = checksumCalculatingInputStream9.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (byte) 1);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark((int) ' ');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        byte[] byteArray16 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int17 = checksumCalculatingInputStream3.read(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark((int) 'a');
        int int8 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = checksumCalculatingInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark((int) ' ');
        int int14 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.close();
        int int16 = checksumCalculatingInputStream2.available();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        int int12 = checksumCalculatingInputStream4.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        boolean boolean14 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.close();
        int int16 = checksumCalculatingInputStream4.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream4);
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int21 = checksumCalculatingInputStream17.read(byteArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 1, (byte) 0 });
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        boolean boolean14 = checksumCalculatingInputStream12.markSupported();
        checksumCalculatingInputStream12.mark((int) (byte) -1);
        boolean boolean17 = checksumCalculatingInputStream12.markSupported();
        checksumCalculatingInputStream12.close();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = checksumCalculatingInputStream12.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        int int5 = checksumCalculatingInputStream2.available();
        int int6 = checksumCalculatingInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        boolean boolean5 = checksumCalculatingInputStream3.markSupported();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean10 = checksumCalculatingInputStream9.markSupported();
        checksumCalculatingInputStream9.close();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = checksumCalculatingInputStream9.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        int int6 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.mark((int) (short) 100);
        byte[] byteArray10 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int13 = checksumCalculatingInputStream2.read(byteArray10, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) -1 });
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream14.close();
        checksumCalculatingInputStream14.mark(10);
        boolean boolean21 = checksumCalculatingInputStream14.markSupported();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        int int5 = checksumCalculatingInputStream4.available();
        checksumCalculatingInputStream4.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream8 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream4);
        checksumCalculatingInputStream4.close();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        byte[] byteArray13 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int16 = checksumCalculatingInputStream7.read(byteArray13, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 1 });
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        boolean boolean14 = checksumCalculatingInputStream13.markSupported();
        boolean boolean15 = checksumCalculatingInputStream13.markSupported();
        int int16 = checksumCalculatingInputStream13.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        checksumCalculatingInputStream13.mark((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream13.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        boolean boolean5 = checksumCalculatingInputStream3.markSupported();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean10 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long15 = checksumCalculatingInputStream3.skip((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.close();
        byte[] byteArray9 = new byte[] { (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int10 = checksumCalculatingInputStream2.read(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) -1 });
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        int int12 = checksumCalculatingInputStream4.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        boolean boolean14 = checksumCalculatingInputStream13.markSupported();
        checksumCalculatingInputStream13.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream2);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = checksumCalculatingInputStream4.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        boolean boolean5 = checksumCalculatingInputStream2.markSupported();
        int int6 = checksumCalculatingInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int13 = checksumCalculatingInputStream2.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) -1, (byte) -1 });
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) 10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = checksumCalculatingInputStream10.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        int int5 = checksumCalculatingInputStream3.available();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.close();
        boolean boolean9 = checksumCalculatingInputStream3.markSupported();
        java.lang.Class<?> wildcardClass10 = checksumCalculatingInputStream3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.util.zip.Checksum checksum4 = null;
        java.util.zip.Checksum checksum5 = null;
        java.io.InputStream inputStream6 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum5, inputStream6);
        boolean boolean8 = checksumCalculatingInputStream7.markSupported();
        checksumCalculatingInputStream7.mark((int) (byte) -1);
        checksumCalculatingInputStream7.mark((int) '4');
        checksumCalculatingInputStream7.mark((int) (short) -1);
        int int15 = checksumCalculatingInputStream7.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum4, (java.io.InputStream) checksumCalculatingInputStream7);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, (java.io.InputStream) checksumCalculatingInputStream16);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream18 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream17);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream19 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream18);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream20 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream18);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.close();
        boolean boolean9 = checksumCalculatingInputStream2.markSupported();
        java.lang.Class<?> wildcardClass10 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (short) -1);
        int int10 = checksumCalculatingInputStream2.available();
        boolean boolean11 = checksumCalculatingInputStream2.markSupported();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.close();
        boolean boolean7 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        int int6 = checksumCalculatingInputStream3.available();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = checksumCalculatingInputStream3.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (byte) 1);
        checksumCalculatingInputStream5.close();
        checksumCalculatingInputStream5.close();
        checksumCalculatingInputStream5.mark((int) ' ');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        int int18 = checksumCalculatingInputStream17.available();
        checksumCalculatingInputStream17.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream20 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream17);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream21 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream17);
        checksumCalculatingInputStream21.mark((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.close();
        int int8 = checksumCalculatingInputStream2.available();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int16 = checksumCalculatingInputStream2.read(byteArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (byte) 1);
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.mark((int) ' ');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        int int17 = checksumCalculatingInputStream16.available();
        checksumCalculatingInputStream16.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream19 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream16);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream16.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(100);
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.close();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(100);
        checksumCalculatingInputStream2.close();
        int int9 = checksumCalculatingInputStream2.available();
        byte[] byteArray13 = new byte[] { (byte) 10, (byte) 10, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int14 = checksumCalculatingInputStream2.read(byteArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 10, (byte) 10, (byte) 100 });
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        boolean boolean5 = checksumCalculatingInputStream2.markSupported();
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        boolean boolean7 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark((int) 'a');
        int int8 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        int int10 = checksumCalculatingInputStream9.available();
        checksumCalculatingInputStream9.mark((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (byte) 1);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark((int) ' ');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = checksumCalculatingInputStream15.skip((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.close();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = checksumCalculatingInputStream2.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = checksumCalculatingInputStream7.skip((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        int int13 = checksumCalculatingInputStream3.available();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean17 = checksumCalculatingInputStream14.markSupported();
        byte[] byteArray19 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int20 = checksumCalculatingInputStream14.read(byteArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 10 });
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        int int15 = checksumCalculatingInputStream3.available();
        int int16 = checksumCalculatingInputStream3.available();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        boolean boolean14 = checksumCalculatingInputStream12.markSupported();
        int int15 = checksumCalculatingInputStream12.available();
        boolean boolean16 = checksumCalculatingInputStream12.markSupported();
        boolean boolean17 = checksumCalculatingInputStream12.markSupported();
        checksumCalculatingInputStream12.close();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        boolean boolean5 = checksumCalculatingInputStream3.markSupported();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean10 = checksumCalculatingInputStream3.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = checksumCalculatingInputStream3.skip((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        boolean boolean5 = checksumCalculatingInputStream3.markSupported();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean10 = checksumCalculatingInputStream3.markSupported();
        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int15 = checksumCalculatingInputStream3.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) -1 });
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (byte) 1);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark((int) ' ');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        int int16 = checksumCalculatingInputStream15.available();
        byte[] byteArray17 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int18 = checksumCalculatingInputStream15.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        int int13 = checksumCalculatingInputStream5.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream15);
        int int17 = checksumCalculatingInputStream16.available();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        int int8 = checksumCalculatingInputStream3.available();
        boolean boolean9 = checksumCalculatingInputStream3.markSupported();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        boolean boolean14 = checksumCalculatingInputStream12.markSupported();
        boolean boolean15 = checksumCalculatingInputStream12.markSupported();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        boolean boolean12 = checksumCalculatingInputStream3.markSupported();
        boolean boolean13 = checksumCalculatingInputStream3.markSupported();
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int22 = checksumCalculatingInputStream3.read(byteArray19, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 100 });
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        int int5 = checksumCalculatingInputStream4.available();
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.mark(100);
        checksumCalculatingInputStream4.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream4);
        checksumCalculatingInputStream4.close();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        byte[] byteArray10 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int int11 = checksumCalculatingInputStream2.read(byteArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        boolean boolean16 = checksumCalculatingInputStream14.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream17 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream14.close();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream14.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        boolean boolean8 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (short) 0);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream11 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        java.lang.Class<?> wildcardClass12 = checksumCalculatingInputStream11.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        int int13 = checksumCalculatingInputStream5.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream15);
        boolean boolean17 = checksumCalculatingInputStream15.markSupported();
        checksumCalculatingInputStream15.mark(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.close();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) 10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream10.mark((-1));
        // The following exception was thrown during execution in test generation
        try {
            long long14 = checksumCalculatingInputStream10.skip((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        checksumCalculatingInputStream2.mark((-1));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        byte[] byteArray9 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int10 = checksumCalculatingInputStream3.read(byteArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 10 });
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.mark((int) '4');
        int int6 = checksumCalculatingInputStream2.available();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark(10);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = checksumCalculatingInputStream2.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        int int11 = checksumCalculatingInputStream3.available();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        checksumCalculatingInputStream12.close();
        boolean boolean15 = checksumCalculatingInputStream12.markSupported();
        checksumCalculatingInputStream12.close();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = checksumCalculatingInputStream7.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        java.lang.Class<?> wildcardClass14 = checksumCalculatingInputStream12.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (short) -1);
        boolean boolean12 = checksumCalculatingInputStream4.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream13 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream13);
        boolean boolean15 = checksumCalculatingInputStream13.markSupported();
        checksumCalculatingInputStream13.close();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        boolean boolean5 = checksumCalculatingInputStream3.markSupported();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.mark((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (byte) 1);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark((int) ' ');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        int int16 = checksumCalculatingInputStream15.available();
        checksumCalculatingInputStream15.close();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = checksumCalculatingInputStream15.skip((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        boolean boolean5 = checksumCalculatingInputStream3.markSupported();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean10 = checksumCalculatingInputStream9.markSupported();
        checksumCalculatingInputStream9.close();
        checksumCalculatingInputStream9.mark((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) 10);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        java.lang.Class<?> wildcardClass11 = checksumCalculatingInputStream10.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.close();
        byte[] byteArray9 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int12 = checksumCalculatingInputStream3.read(byteArray9, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.util.zip.Checksum checksum4 = null;
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum4, inputStream5);
        boolean boolean7 = checksumCalculatingInputStream6.markSupported();
        checksumCalculatingInputStream6.mark((int) (byte) -1);
        checksumCalculatingInputStream6.mark((int) '4');
        checksumCalculatingInputStream6.mark((int) (byte) 1);
        checksumCalculatingInputStream6.close();
        checksumCalculatingInputStream6.close();
        checksumCalculatingInputStream6.mark((int) ' ');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream18 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, (java.io.InputStream) checksumCalculatingInputStream6);
        int int19 = checksumCalculatingInputStream18.available();
        checksumCalculatingInputStream18.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream21 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream18);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream22 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream18);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream23 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream18);
        checksumCalculatingInputStream23.mark((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream10 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean11 = checksumCalculatingInputStream10.markSupported();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        int int5 = checksumCalculatingInputStream2.available();
        int int6 = checksumCalculatingInputStream2.available();
        boolean boolean7 = checksumCalculatingInputStream2.markSupported();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        boolean boolean5 = checksumCalculatingInputStream3.markSupported();
        boolean boolean6 = checksumCalculatingInputStream3.markSupported();
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream9 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        checksumCalculatingInputStream3.mark((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream3.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.util.zip.Checksum checksum4 = null;
        java.io.InputStream inputStream5 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream6 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum4, inputStream5);
        boolean boolean7 = checksumCalculatingInputStream6.markSupported();
        checksumCalculatingInputStream6.mark((int) (byte) -1);
        checksumCalculatingInputStream6.mark((int) '4');
        checksumCalculatingInputStream6.mark((int) (short) -1);
        boolean boolean14 = checksumCalculatingInputStream6.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, (java.io.InputStream) checksumCalculatingInputStream6);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream15);
        boolean boolean17 = checksumCalculatingInputStream15.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream18 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream15);
        checksumCalculatingInputStream15.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream20 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream15);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = checksumCalculatingInputStream20.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        checksumCalculatingInputStream3.close();
        checksumCalculatingInputStream3.mark(10);
        boolean boolean7 = checksumCalculatingInputStream3.markSupported();
        boolean boolean8 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (short) 0);
        int int11 = checksumCalculatingInputStream3.available();
        int int12 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.mark(100);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = checksumCalculatingInputStream3.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream4 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, inputStream3);
        boolean boolean5 = checksumCalculatingInputStream4.markSupported();
        checksumCalculatingInputStream4.mark((int) (byte) -1);
        checksumCalculatingInputStream4.mark((int) '4');
        checksumCalculatingInputStream4.mark((int) (byte) 1);
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.close();
        checksumCalculatingInputStream4.mark((int) ' ');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream16 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream4);
        int int17 = checksumCalculatingInputStream16.available();
        checksumCalculatingInputStream16.close();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream19 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream16);
        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int26 = checksumCalculatingInputStream16.read(byteArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 1, (byte) 100 });
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark((int) ' ');
        int int14 = checksumCalculatingInputStream2.available();
        // The following exception was thrown during execution in test generation
        try {
            checksumCalculatingInputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: mark/reset not supported");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        int int3 = checksumCalculatingInputStream2.available();
        checksumCalculatingInputStream2.mark((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.util.zip.Checksum checksum2 = null;
        java.util.zip.Checksum checksum3 = null;
        java.io.InputStream inputStream4 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream5 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum3, inputStream4);
        boolean boolean6 = checksumCalculatingInputStream5.markSupported();
        checksumCalculatingInputStream5.mark((int) (byte) -1);
        checksumCalculatingInputStream5.mark((int) '4');
        checksumCalculatingInputStream5.mark((int) (short) -1);
        boolean boolean13 = checksumCalculatingInputStream5.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream14 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum2, (java.io.InputStream) checksumCalculatingInputStream5);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream15 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, (java.io.InputStream) checksumCalculatingInputStream14);
        checksumCalculatingInputStream15.mark((int) (short) 100);
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream18 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        int int4 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.mark((int) '4');
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream7 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        int int8 = checksumCalculatingInputStream3.available();
        checksumCalculatingInputStream3.close();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = checksumCalculatingInputStream12.skip(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        checksumCalculatingInputStream2.mark((int) '4');
        checksumCalculatingInputStream2.mark((int) (byte) 1);
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.close();
        checksumCalculatingInputStream2.mark((int) ' ');
        int int14 = checksumCalculatingInputStream2.available();
        byte[] byteArray16 = new byte[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int int19 = checksumCalculatingInputStream2.read(byteArray16, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 10 });
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.util.zip.Checksum checksum0 = null;
        java.util.zip.Checksum checksum1 = null;
        java.io.InputStream inputStream2 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream3 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum1, inputStream2);
        boolean boolean4 = checksumCalculatingInputStream3.markSupported();
        checksumCalculatingInputStream3.mark((int) (byte) -1);
        checksumCalculatingInputStream3.mark((int) '4');
        checksumCalculatingInputStream3.mark((int) (short) -1);
        boolean boolean11 = checksumCalculatingInputStream3.markSupported();
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream12 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, (java.io.InputStream) checksumCalculatingInputStream3);
        boolean boolean13 = checksumCalculatingInputStream12.markSupported();
        boolean boolean14 = checksumCalculatingInputStream12.markSupported();
        int int15 = checksumCalculatingInputStream12.available();
        boolean boolean16 = checksumCalculatingInputStream12.markSupported();
        boolean boolean17 = checksumCalculatingInputStream12.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = checksumCalculatingInputStream12.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        checksumCalculatingInputStream2.mark((int) (byte) -1);
        boolean boolean6 = checksumCalculatingInputStream2.markSupported();
        int int7 = checksumCalculatingInputStream2.available();
        byte[] byteArray12 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int13 = checksumCalculatingInputStream2.read(byteArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 0 });
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        java.util.zip.Checksum checksum0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.commons.compress.utils.ChecksumCalculatingInputStream checksumCalculatingInputStream2 = new org.apache.commons.compress.utils.ChecksumCalculatingInputStream(checksum0, inputStream1);
        boolean boolean3 = checksumCalculatingInputStream2.markSupported();
        boolean boolean4 = checksumCalculatingInputStream2.markSupported();
        int int5 = checksumCalculatingInputStream2.available();
        java.lang.Class<?> wildcardClass6 = checksumCalculatingInputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
}

