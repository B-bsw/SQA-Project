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
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.mark((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        java.lang.Class<?> wildcardClass13 = base64InputStream12.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = base64InputStream12.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = base64InputStream2.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = base64InputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        java.io.InputStream inputStream13 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream(inputStream13, false);
        byte[] byteArray24 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream25 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream15, true, (int) (byte) 10, byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = base64InputStream2.read(byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.mark((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.close();
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
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = base64InputStream12.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        byte[] byteArray15 = new byte[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = base64InputStream12.read(byteArray15, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1 });
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        java.io.InputStream inputStream3 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream5 = new org.apache.commons.codec.binary.Base64InputStream(inputStream3, false);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream5, true, (int) (byte) 10, byteArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = base64InputStream2.read(byteArray14, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = base64InputStream2.skip((long) 1);
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
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream13.mark(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream7 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, true, (int) 'a', byteArray6);
        java.lang.Class<?> wildcardClass8 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = base64InputStream13.skip((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream4.mark((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = base64InputStream2.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0 });
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = base64InputStream12.skip(100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        java.io.InputStream inputStream14 = null;
        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream(inputStream14, true, (int) 'a', byteArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = base64InputStream13.read(byteArray20, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 0, (byte) 10 });
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        java.io.InputStream inputStream4 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream6 = new org.apache.commons.codec.binary.Base64InputStream(inputStream4, false);
        byte[] byteArray15 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream6, true, (int) (byte) 10, byteArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = base64InputStream2.read(byteArray15, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream13.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream14.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream(inputStream15, false);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream27 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream17, true, (int) (byte) 10, byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = base64InputStream2.read(byteArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream4.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream12.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = base64InputStream15.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream13.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream13.mark(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream15.mark((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = base64InputStream2.skip((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        java.lang.Class<?> wildcardClass13 = base64InputStream2.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = base64InputStream4.skip((long) '#');
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
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream(inputStream15, false);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream27 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream17, true, (int) (byte) 10, byteArray26);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream17);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream17);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream17);
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream40 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream17, true, (int) '#', byteArray39);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = base64InputStream14.read(byteArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        java.io.InputStream inputStream15 = null;
        byte[] byteArray21 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream22 = new org.apache.commons.codec.binary.Base64InputStream(inputStream15, true, (int) 'a', byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = base64InputStream2.read(byteArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 0, (byte) 0, (byte) 10 });
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.mark((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream7 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, true, (int) 'a', byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream7.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10 });
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream18.mark((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = base64InputStream14.skip(0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        java.lang.Class<?> wildcardClass4 = base64InputStream2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = base64InputStream4.skip((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.mark((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        // The following exception was thrown during execution in test generation
        try {
            long long44 = base64InputStream12.skip(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = base64InputStream14.skip((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream14.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        boolean boolean15 = base64InputStream14.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream14.mark((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = base64InputStream15.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        boolean boolean15 = base64InputStream14.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream14.mark(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream25 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) '#', byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = base64InputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.mark((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = base64InputStream14.skip((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream16.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream42.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream25 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) '#', byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        java.io.InputStream inputStream18 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream20 = new org.apache.commons.codec.binary.Base64InputStream(inputStream18, false);
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20, true, (int) (byte) 10, byteArray29);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream33 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20, true, (int) '#', byteArray42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true, 100, byteArray42);
        java.lang.Class<?> wildcardClass45 = base64InputStream44.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = base64InputStream44.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream16.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        java.lang.Class<?> wildcardClass15 = base64InputStream13.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream14.mark((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream14.mark(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        byte[] byteArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = base64InputStream2.read(byteArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream25 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) '#', byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = base64InputStream2.skip((long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream15.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.mark((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream28);
        java.io.InputStream inputStream32 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream34 = new org.apache.commons.codec.binary.Base64InputStream(inputStream32, false);
        byte[] byteArray43 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34, true, (int) (byte) 10, byteArray43);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream45 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream46 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream47 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34);
        byte[] byteArray56 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream57 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34, true, (int) '#', byteArray56);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream58 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream28, false, 100, byteArray56);
        // The following exception was thrown during execution in test generation
        try {
            int int61 = base64InputStream15.read(byteArray56, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = base64InputStream12.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        boolean boolean16 = base64InputStream14.markSupported();
        boolean boolean17 = base64InputStream14.markSupported();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream22 = new org.apache.commons.codec.binary.Base64InputStream(inputStream20, false);
        byte[] byteArray31 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream22, true, (int) (byte) 10, byteArray31);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream33 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream22);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream34 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream33);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream36 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34, false);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream(inputStream39, false);
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream51 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream41, true, (int) (byte) 10, byteArray50);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream52 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream51);
        java.io.InputStream inputStream55 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream57 = new org.apache.commons.codec.binary.Base64InputStream(inputStream55, false);
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream67 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57, true, (int) (byte) 10, byteArray66);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream68 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream69 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream70 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        byte[] byteArray79 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream80 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57, true, (int) '#', byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream81 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream51, false, 100, byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream82 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34, false, (int) (byte) -1, byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream83 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true, (int) 'a', byteArray79);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream83.mark((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        boolean boolean15 = base64InputStream14.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream14.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream14.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream25 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) '#', byteArray24);
        java.io.InputStream inputStream26 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream(inputStream26, false);
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream38 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream28, true, (int) (byte) 10, byteArray37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream39 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream28);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream40 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream28);
        boolean boolean41 = base64InputStream40.markSupported();
        java.io.InputStream inputStream44 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream46 = new org.apache.commons.codec.binary.Base64InputStream(inputStream44, false);
        byte[] byteArray55 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream56 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream46, true, (int) (byte) 10, byteArray55);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream57 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream46);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream58 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream46);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream59 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream46);
        byte[] byteArray68 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream69 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream46, true, (int) '#', byteArray68);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream70 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream40, true, 100, byteArray68);
        // The following exception was thrown during execution in test generation
        try {
            int int73 = base64InputStream25.read(byteArray68, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        boolean boolean4 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream6 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream9 = new org.apache.commons.codec.binary.Base64InputStream(inputStream7, false);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream19 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream9, true, (int) (byte) 10, byteArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = base64InputStream2.read(byteArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream42.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        java.io.InputStream inputStream5 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream7 = new org.apache.commons.codec.binary.Base64InputStream(inputStream5, false);
        byte[] byteArray16 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream7, true, (int) (byte) 10, byteArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = base64InputStream2.read(byteArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream43.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        java.io.InputStream inputStream17 = null;
        byte[] byteArray23 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream24 = new org.apache.commons.codec.binary.Base64InputStream(inputStream17, true, (int) 'a', byteArray23);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = base64InputStream14.read(byteArray23, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray23);
        org.junit.Assert.assertArrayEquals(byteArray23, new byte[] { (byte) 0, (byte) 0, (byte) 10 });
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream45 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream44);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream45.mark((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = base64InputStream14.skip((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = base64InputStream42.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        boolean boolean4 = base64InputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.mark((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13, true);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = base64InputStream15.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        java.io.InputStream inputStream43 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream45 = new org.apache.commons.codec.binary.Base64InputStream(inputStream43, false);
        byte[] byteArray54 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream55 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream45, true, (int) (byte) 10, byteArray54);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream56 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream55);
        java.io.InputStream inputStream59 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream61 = new org.apache.commons.codec.binary.Base64InputStream(inputStream59, false);
        byte[] byteArray70 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream71 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream61, true, (int) (byte) 10, byteArray70);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream72 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream61);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream73 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream61);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream74 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream61);
        byte[] byteArray83 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream84 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream61, true, (int) '#', byteArray83);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream85 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream55, false, 100, byteArray83);
        // The following exception was thrown during execution in test generation
        try {
            int int88 = base64InputStream12.read(byteArray83, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray54);
        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray83);
        org.junit.Assert.assertArrayEquals(byteArray83, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true);
        boolean boolean19 = base64InputStream18.markSupported();
        java.lang.Class<?> wildcardClass20 = base64InputStream18.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = base64InputStream12.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream17.mark((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream45 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream44);
        // The following exception was thrown during execution in test generation
        try {
            long long47 = base64InputStream45.skip((long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true);
        boolean boolean19 = base64InputStream18.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = base64InputStream18.skip((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream(inputStream15, false);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream27 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream17, true, (int) (byte) 10, byteArray26);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = base64InputStream14.read(byteArray26, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        boolean boolean18 = base64InputStream14.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = base64InputStream14.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream14.mark((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        // The following exception was thrown during execution in test generation
        try {
            long long4 = base64InputStream2.skip(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream13.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean16 = base64InputStream15.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream15.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.mark(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        java.lang.Class<?> wildcardClass16 = base64InputStream14.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = base64InputStream16.skip((long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        boolean boolean15 = base64InputStream2.markSupported();
        java.lang.Class<?> wildcardClass16 = base64InputStream2.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        boolean boolean4 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream6 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        java.io.InputStream inputStream18 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream20 = new org.apache.commons.codec.binary.Base64InputStream(inputStream18, false);
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20, true, (int) (byte) 10, byteArray29);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream33 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20, true, (int) '#', byteArray42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true, 100, byteArray42);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = base64InputStream14.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream16.mark((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean16 = base64InputStream15.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream15.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.mark((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = base64InputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        boolean boolean4 = base64InputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream(inputStream19, false);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, true, (int) (byte) 10, byteArray30);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream37 = new org.apache.commons.codec.binary.Base64InputStream(inputStream35, false);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream47 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) (byte) 10, byteArray46);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream49 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream60 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) '#', byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream61 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31, false, 100, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream62 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false, (int) (byte) -1, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream64 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream62, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream64.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream25 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) '#', byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = base64InputStream25.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream42.mark((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        boolean boolean16 = base64InputStream14.markSupported();
        boolean boolean17 = base64InputStream14.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = base64InputStream14.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        java.io.InputStream inputStream18 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream20 = new org.apache.commons.codec.binary.Base64InputStream(inputStream18, false);
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20, true, (int) (byte) 10, byteArray29);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream33 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20, true, (int) '#', byteArray42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true, 100, byteArray42);
        java.io.InputStream inputStream45 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream47 = new org.apache.commons.codec.binary.Base64InputStream(inputStream45, false);
        byte[] byteArray56 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream57 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream47, true, (int) (byte) 10, byteArray56);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream58 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        java.io.InputStream inputStream61 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream63 = new org.apache.commons.codec.binary.Base64InputStream(inputStream61, false);
        byte[] byteArray72 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream73 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream63, true, (int) (byte) 10, byteArray72);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream74 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream63);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream75 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream63);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream76 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream63);
        byte[] byteArray85 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream86 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream63, true, (int) '#', byteArray85);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream87 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57, false, 100, byteArray85);
        // The following exception was thrown during execution in test generation
        try {
            int int88 = base64InputStream14.read(byteArray85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray85);
        org.junit.Assert.assertArrayEquals(byteArray85, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream45 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream44);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream46 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream45);
        byte[] byteArray51 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int int52 = base64InputStream46.read(byteArray51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray51);
        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 100 });
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.codec.binary.Base64InputStream base64InputStream25 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (short) 0, byteArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: lineSeperator must not contain base64 characters: [d?d?d?]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 10 });
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        byte[] byteArray17 = new byte[] { (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = base64InputStream2.read(byteArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) -1 });
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream3 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream5 = new org.apache.commons.codec.binary.Base64InputStream(inputStream3, false);
        byte[] byteArray14 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream5, true, (int) (byte) 10, byteArray14);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream5);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream16);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream19 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream17, false);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream24 = new org.apache.commons.codec.binary.Base64InputStream(inputStream22, false);
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream34 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream24, true, (int) (byte) 10, byteArray33);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream35 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34);
        java.io.InputStream inputStream38 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream40 = new org.apache.commons.codec.binary.Base64InputStream(inputStream38, false);
        byte[] byteArray49 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream40, true, (int) (byte) 10, byteArray49);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream51 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream52 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream53 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream40);
        byte[] byteArray62 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream63 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream40, true, (int) '#', byteArray62);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream64 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34, false, 100, byteArray62);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream65 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream17, false, (int) (byte) -1, byteArray62);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream66 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, true, (int) (byte) 100, byteArray62);
        java.io.InputStream inputStream67 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream69 = new org.apache.commons.codec.binary.Base64InputStream(inputStream67, false);
        byte[] byteArray78 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream79 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream69, true, (int) (byte) 10, byteArray78);
        // The following exception was thrown during execution in test generation
        try {
            int int80 = base64InputStream66.read(byteArray78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray78);
        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream(inputStream19, false);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, true, (int) (byte) 10, byteArray30);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream37 = new org.apache.commons.codec.binary.Base64InputStream(inputStream35, false);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream47 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) (byte) 10, byteArray46);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream49 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream60 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) '#', byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream61 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31, false, 100, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream62 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false, (int) (byte) -1, byteArray59);
        // The following exception was thrown during execution in test generation
        try {
            long long64 = base64InputStream14.skip((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.io.InputStream inputStream0 = null;
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream7 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, true, (int) 'a', byteArray6);
        java.lang.Class<?> wildcardClass8 = base64InputStream7.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 0, (byte) 0, (byte) 10 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = base64InputStream16.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream46 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream46.mark(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream(inputStream19, false);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, true, (int) (byte) 10, byteArray30);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream37 = new org.apache.commons.codec.binary.Base64InputStream(inputStream35, false);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream47 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) (byte) 10, byteArray46);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream49 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream60 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) '#', byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream61 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31, false, 100, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream62 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false, (int) (byte) -1, byteArray59);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream62.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream25 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) '#', byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream14.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream12.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true);
        boolean boolean17 = base64InputStream16.markSupported();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        boolean boolean15 = base64InputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = base64InputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream(inputStream19, false);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, true, (int) (byte) 10, byteArray30);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream37 = new org.apache.commons.codec.binary.Base64InputStream(inputStream35, false);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream47 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) (byte) 10, byteArray46);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream49 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream60 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) '#', byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream61 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31, false, 100, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream62 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false, (int) (byte) -1, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream64 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream62, true);
        boolean boolean65 = base64InputStream64.markSupported();
        java.io.InputStream inputStream66 = null;
        byte[] byteArray72 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream73 = new org.apache.commons.codec.binary.Base64InputStream(inputStream66, true, (int) 'a', byteArray72);
        // The following exception was thrown during execution in test generation
        try {
            int int74 = base64InputStream64.read(byteArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(byteArray72);
        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 0, (byte) 0, (byte) 10 });
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean5 = base64InputStream4.markSupported();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream(inputStream8, false);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream20 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream10, true, (int) (byte) 10, byteArray19);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream4, true, (int) (short) 0, byteArray19);
        java.io.InputStream inputStream22 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream24 = new org.apache.commons.codec.binary.Base64InputStream(inputStream22, false);
        byte[] byteArray33 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream34 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream24, true, (int) (byte) 10, byteArray33);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream35 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream24);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream36 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream35);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream38 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream36, false);
        java.io.InputStream inputStream41 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream(inputStream41, false);
        byte[] byteArray52 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream53 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream43, true, (int) (byte) 10, byteArray52);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream54 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream53);
        java.io.InputStream inputStream57 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream59 = new org.apache.commons.codec.binary.Base64InputStream(inputStream57, false);
        byte[] byteArray68 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream69 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream59, true, (int) (byte) 10, byteArray68);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream70 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream71 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream72 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream59);
        byte[] byteArray81 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream82 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream59, true, (int) '#', byteArray81);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream83 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream53, false, 100, byteArray81);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream84 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream36, false, (int) (byte) -1, byteArray81);
        // The following exception was thrown during execution in test generation
        try {
            int int87 = base64InputStream4.read(byteArray81, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray52);
        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray68);
        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray81);
        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        boolean boolean16 = base64InputStream14.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream14.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream46 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42, true);
        boolean boolean47 = base64InputStream42.markSupported();
        java.lang.Class<?> wildcardClass48 = base64InputStream42.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream16);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream20 = new org.apache.commons.codec.binary.Base64InputStream(inputStream18, false);
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20, true, (int) (byte) 10, byteArray29);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = base64InputStream17.read(byteArray29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = base64InputStream14.skip((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream(inputStream14, false);
        byte[] byteArray25 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream26 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream16, true, (int) (byte) 10, byteArray25);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream27 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream16);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream16);
        boolean boolean29 = base64InputStream28.markSupported();
        boolean boolean30 = base64InputStream28.markSupported();
        boolean boolean31 = base64InputStream28.markSupported();
        java.io.InputStream inputStream34 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream36 = new org.apache.commons.codec.binary.Base64InputStream(inputStream34, false);
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream46 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream36, true, (int) (byte) 10, byteArray45);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream47 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream36);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream47);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream48, false);
        java.io.InputStream inputStream53 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream55 = new org.apache.commons.codec.binary.Base64InputStream(inputStream53, false);
        byte[] byteArray64 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream65 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream55, true, (int) (byte) 10, byteArray64);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream66 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream65);
        java.io.InputStream inputStream69 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream71 = new org.apache.commons.codec.binary.Base64InputStream(inputStream69, false);
        byte[] byteArray80 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream81 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream71, true, (int) (byte) 10, byteArray80);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream82 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream71);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream83 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream71);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream84 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream71);
        byte[] byteArray93 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream94 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream71, true, (int) '#', byteArray93);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream95 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream65, false, 100, byteArray93);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream96 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream48, false, (int) (byte) -1, byteArray93);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream97 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream28, true, (int) 'a', byteArray93);
        // The following exception was thrown during execution in test generation
        try {
            int int98 = base64InputStream13.read(byteArray93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray25);
        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray80);
        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray93);
        org.junit.Assert.assertArrayEquals(byteArray93, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream(inputStream19, false);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, true, (int) (byte) 10, byteArray30);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream37 = new org.apache.commons.codec.binary.Base64InputStream(inputStream35, false);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream47 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) (byte) 10, byteArray46);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream49 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream60 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) '#', byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream61 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31, false, 100, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream62 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false, (int) (byte) -1, byteArray59);
        // The following exception was thrown during execution in test generation
        try {
            int int63 = base64InputStream62.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        boolean boolean16 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = base64InputStream17.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = base64InputStream2.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = base64InputStream14.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream(inputStream19, false);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, true, (int) (byte) 10, byteArray30);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream37 = new org.apache.commons.codec.binary.Base64InputStream(inputStream35, false);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream47 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) (byte) 10, byteArray46);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream49 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream60 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) '#', byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream61 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31, false, 100, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream62 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false, (int) (byte) -1, byteArray59);
        boolean boolean63 = base64InputStream14.markSupported();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream44.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = base64InputStream15.skip(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream18.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream(inputStream19, false);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, true, (int) (byte) 10, byteArray30);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream37 = new org.apache.commons.codec.binary.Base64InputStream(inputStream35, false);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream47 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) (byte) 10, byteArray46);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream49 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream60 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) '#', byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream61 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31, false, 100, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream62 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false, (int) (byte) -1, byteArray59);
        // The following exception was thrown during execution in test generation
        try {
            long long64 = base64InputStream14.skip((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        boolean boolean16 = base64InputStream14.markSupported();
        boolean boolean17 = base64InputStream14.markSupported();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream22 = new org.apache.commons.codec.binary.Base64InputStream(inputStream20, false);
        byte[] byteArray31 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream22, true, (int) (byte) 10, byteArray31);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream33 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream22);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream34 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream33);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream36 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34, false);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream(inputStream39, false);
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream51 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream41, true, (int) (byte) 10, byteArray50);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream52 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream51);
        java.io.InputStream inputStream55 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream57 = new org.apache.commons.codec.binary.Base64InputStream(inputStream55, false);
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream67 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57, true, (int) (byte) 10, byteArray66);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream68 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream69 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream70 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        byte[] byteArray79 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream80 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57, true, (int) '#', byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream81 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream51, false, 100, byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream82 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34, false, (int) (byte) -1, byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream83 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true, (int) 'a', byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream85 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream83, true);
        java.lang.Class<?> wildcardClass86 = base64InputStream83.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        java.io.InputStream inputStream18 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream20 = new org.apache.commons.codec.binary.Base64InputStream(inputStream18, false);
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20, true, (int) (byte) 10, byteArray29);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream33 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20, true, (int) '#', byteArray42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true, 100, byteArray42);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream14.mark(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        boolean boolean16 = base64InputStream14.markSupported();
        boolean boolean17 = base64InputStream14.markSupported();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream22 = new org.apache.commons.codec.binary.Base64InputStream(inputStream20, false);
        byte[] byteArray31 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream22, true, (int) (byte) 10, byteArray31);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream33 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream22);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream34 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream33);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream36 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34, false);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream(inputStream39, false);
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream51 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream41, true, (int) (byte) 10, byteArray50);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream52 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream51);
        java.io.InputStream inputStream55 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream57 = new org.apache.commons.codec.binary.Base64InputStream(inputStream55, false);
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream67 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57, true, (int) (byte) 10, byteArray66);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream68 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream69 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream70 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        byte[] byteArray79 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream80 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57, true, (int) '#', byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream81 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream51, false, 100, byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream82 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34, false, (int) (byte) -1, byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream83 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true, (int) 'a', byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream85 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream83, true);
        java.io.InputStream inputStream86 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream88 = new org.apache.commons.codec.binary.Base64InputStream(inputStream86, false);
        byte[] byteArray97 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream98 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream88, true, (int) (byte) 10, byteArray97);
        // The following exception was thrown during execution in test generation
        try {
            int int99 = base64InputStream85.read(byteArray97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray97);
        org.junit.Assert.assertArrayEquals(byteArray97, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true);
        boolean boolean19 = base64InputStream18.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream18.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream6 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream4, false);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = base64InputStream4.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = base64InputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        boolean boolean18 = base64InputStream14.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream14.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        boolean boolean4 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream6 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = base64InputStream6.skip((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream(inputStream19, false);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, true, (int) (byte) 10, byteArray30);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream37 = new org.apache.commons.codec.binary.Base64InputStream(inputStream35, false);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream47 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) (byte) 10, byteArray46);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream49 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream60 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) '#', byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream61 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31, false, 100, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream62 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false, (int) (byte) -1, byteArray59);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream62.mark(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream45 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream44);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream46 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream45);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = base64InputStream46.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream46 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42, true);
        java.lang.Class<?> wildcardClass47 = base64InputStream46.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream45 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream44);
        // The following exception was thrown during execution in test generation
        try {
            long long47 = base64InputStream45.skip((long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        boolean boolean16 = base64InputStream14.markSupported();
        boolean boolean17 = base64InputStream14.markSupported();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream22 = new org.apache.commons.codec.binary.Base64InputStream(inputStream20, false);
        byte[] byteArray31 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream22, true, (int) (byte) 10, byteArray31);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream33 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream22);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream34 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream33);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream36 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34, false);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream(inputStream39, false);
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream51 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream41, true, (int) (byte) 10, byteArray50);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream52 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream51);
        java.io.InputStream inputStream55 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream57 = new org.apache.commons.codec.binary.Base64InputStream(inputStream55, false);
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream67 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57, true, (int) (byte) 10, byteArray66);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream68 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream69 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream70 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        byte[] byteArray79 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream80 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57, true, (int) '#', byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream81 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream51, false, 100, byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream82 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34, false, (int) (byte) -1, byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream83 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true, (int) 'a', byteArray79);
        java.lang.Class<?> wildcardClass84 = base64InputStream83.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean5 = base64InputStream4.markSupported();
        java.io.InputStream inputStream8 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream10 = new org.apache.commons.codec.binary.Base64InputStream(inputStream8, false);
        byte[] byteArray19 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream20 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream10, true, (int) (byte) 10, byteArray19);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream4, true, (int) (short) 0, byteArray19);
        java.io.InputStream inputStream24 = null;
        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 0, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream(inputStream24, true, (int) 'a', byteArray30);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, false, (int) (byte) 10, byteArray30);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) 0, (byte) 10 });
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        boolean boolean4 = base64InputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = base64InputStream2.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream16.mark(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray7 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream8 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, true, (int) ' ', byteArray7);
        java.lang.Class<?> wildcardClass9 = byteArray7.getClass();
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] { (byte) 10, (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        java.io.InputStream inputStream17 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream19 = new org.apache.commons.codec.binary.Base64InputStream(inputStream17, false);
        byte[] byteArray28 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream19, true, (int) (byte) 10, byteArray28);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream19);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream19);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream19);
        byte[] byteArray41 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream19, true, (int) '#', byteArray41);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = base64InputStream14.read(byteArray41, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray28);
        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray41);
        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        java.io.InputStream inputStream20 = null;
        java.io.InputStream inputStream23 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream25 = new org.apache.commons.codec.binary.Base64InputStream(inputStream23, false);
        byte[] byteArray34 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream35 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream25, true, (int) (byte) 10, byteArray34);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream36 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream25);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream37 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream36);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream39 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, false);
        java.io.InputStream inputStream42 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream(inputStream42, false);
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream54 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream44, true, (int) (byte) 10, byteArray53);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream55 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream54);
        java.io.InputStream inputStream58 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream60 = new org.apache.commons.codec.binary.Base64InputStream(inputStream58, false);
        byte[] byteArray69 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream70 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream60, true, (int) (byte) 10, byteArray69);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream71 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream60);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream72 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream60);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream73 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream60);
        byte[] byteArray82 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream83 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream60, true, (int) '#', byteArray82);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream84 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream54, false, 100, byteArray82);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream85 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, false, (int) (byte) -1, byteArray82);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream86 = new org.apache.commons.codec.binary.Base64InputStream(inputStream20, true, (int) (byte) 100, byteArray82);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream87 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream17, true, 0, byteArray82);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream87.mark((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray69);
        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray82);
        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        boolean boolean16 = base64InputStream14.markSupported();
        java.lang.Class<?> wildcardClass17 = base64InputStream14.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        java.lang.Class<?> wildcardClass15 = base64InputStream2.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream14 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream(inputStream14, false);
        byte[] byteArray21 = new byte[] { (byte) 10, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream22 = new org.apache.commons.codec.binary.Base64InputStream(inputStream14, true, (int) ' ', byteArray21);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = base64InputStream12.read(byteArray21, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 10, (byte) 1 });
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream(inputStream15, false);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream27 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream17, true, (int) (byte) 10, byteArray26);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream17);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream17);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream17);
        byte[] byteArray39 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream40 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream17, true, (int) '#', byteArray39);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = base64InputStream14.read(byteArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream25 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) '#', byteArray24);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream27 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream25, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream25.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, true);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = base64InputStream2.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        byte[] byteArray24 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream25 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) '#', byteArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = base64InputStream25.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray24);
        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = base64InputStream14.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        boolean boolean4 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream6 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        boolean boolean7 = base64InputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        boolean boolean18 = base64InputStream17.markSupported();
        boolean boolean19 = base64InputStream17.markSupported();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        boolean boolean4 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream6 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream45 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream43, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream43.mark(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream15.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        boolean boolean4 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream6 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        boolean boolean7 = base64InputStream6.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream6.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream(inputStream19, false);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, true, (int) (byte) 10, byteArray30);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream37 = new org.apache.commons.codec.binary.Base64InputStream(inputStream35, false);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream47 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) (byte) 10, byteArray46);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream49 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream60 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) '#', byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream61 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31, false, 100, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream62 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false, (int) (byte) -1, byteArray59);
        java.lang.Class<?> wildcardClass63 = base64InputStream62.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream(inputStream19, false);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, true, (int) (byte) 10, byteArray30);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream16, true, 10, byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream16.mark((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        java.io.InputStream inputStream18 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream20 = new org.apache.commons.codec.binary.Base64InputStream(inputStream18, false);
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20, true, (int) (byte) 10, byteArray29);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        boolean boolean33 = base64InputStream32.markSupported();
        java.io.InputStream inputStream36 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream38 = new org.apache.commons.codec.binary.Base64InputStream(inputStream36, false);
        byte[] byteArray47 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream38, true, (int) (byte) 10, byteArray47);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream49 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream38);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream38);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream51 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream38);
        byte[] byteArray60 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream61 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream38, true, (int) '#', byteArray60);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream62 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream32, true, 100, byteArray60);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream63 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, (int) '#', byteArray60);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(byteArray47);
        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        java.io.InputStream inputStream46 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream(inputStream46, false);
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream58 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream48, true, (int) (byte) 10, byteArray57);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream59 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream58);
        java.io.InputStream inputStream62 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream64 = new org.apache.commons.codec.binary.Base64InputStream(inputStream62, false);
        byte[] byteArray73 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream74 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream64, true, (int) (byte) 10, byteArray73);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream75 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream64);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream76 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream64);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream77 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream64);
        byte[] byteArray86 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream87 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream64, true, (int) '#', byteArray86);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream88 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream58, false, 100, byteArray86);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream89 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42, true, (int) (short) -1, byteArray86);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream42.mark((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray73);
        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray86);
        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = base64InputStream14.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream(inputStream19, false);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, true, (int) (byte) 10, byteArray30);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream16, true, 10, byteArray30);
        java.lang.Class<?> wildcardClass33 = byteArray30.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream(inputStream19, false);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, true, (int) (byte) 10, byteArray30);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream37 = new org.apache.commons.codec.binary.Base64InputStream(inputStream35, false);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream47 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) (byte) 10, byteArray46);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream49 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream60 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) '#', byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream61 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31, false, 100, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream62 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false, (int) (byte) -1, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream64 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream62, true);
        // The following exception was thrown during execution in test generation
        try {
            int int65 = base64InputStream64.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream13.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream6 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream4, false);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream4.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13, true);
        boolean boolean16 = base64InputStream15.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream15, false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream15.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream(inputStream19, false);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, true, (int) (byte) 10, byteArray30);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream37 = new org.apache.commons.codec.binary.Base64InputStream(inputStream35, false);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream47 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) (byte) 10, byteArray46);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream49 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream60 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) '#', byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream61 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31, false, 100, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream62 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false, (int) (byte) -1, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream64 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream62, true);
        boolean boolean65 = base64InputStream64.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream67 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream64, true);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true);
        boolean boolean15 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream2.mark((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        boolean boolean16 = base64InputStream14.markSupported();
        boolean boolean17 = base64InputStream14.markSupported();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream22 = new org.apache.commons.codec.binary.Base64InputStream(inputStream20, false);
        byte[] byteArray31 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream22, true, (int) (byte) 10, byteArray31);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream33 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream22);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream34 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream33);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream36 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34, false);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream(inputStream39, false);
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream51 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream41, true, (int) (byte) 10, byteArray50);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream52 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream51);
        java.io.InputStream inputStream55 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream57 = new org.apache.commons.codec.binary.Base64InputStream(inputStream55, false);
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream67 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57, true, (int) (byte) 10, byteArray66);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream68 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream69 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream70 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        byte[] byteArray79 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream80 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57, true, (int) '#', byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream81 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream51, false, 100, byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream82 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34, false, (int) (byte) -1, byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream83 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true, (int) 'a', byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream85 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream83, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream85.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean16 = base64InputStream15.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream15);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = base64InputStream17.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream45 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream43, true);
        java.io.InputStream inputStream46 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream(inputStream46, false);
        byte[] byteArray57 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream58 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream48, true, (int) (byte) 10, byteArray57);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream59 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream48);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream60 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream48);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream61 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream48);
        byte[] byteArray70 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream71 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream48, true, (int) '#', byteArray70);
        // The following exception was thrown during execution in test generation
        try {
            int int74 = base64InputStream45.read(byteArray70, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertNotNull(byteArray57);
        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray70);
        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream15.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream15.mark(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        byte[] byteArray40 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) '#', byteArray40);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream42 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12, false, 100, byteArray40);
        boolean boolean43 = base64InputStream42.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream42.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray40);
        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean15 = base64InputStream14.markSupported();
        boolean boolean16 = base64InputStream14.markSupported();
        boolean boolean17 = base64InputStream14.markSupported();
        java.io.InputStream inputStream20 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream22 = new org.apache.commons.codec.binary.Base64InputStream(inputStream20, false);
        byte[] byteArray31 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream22, true, (int) (byte) 10, byteArray31);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream33 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream22);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream34 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream33);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream36 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34, false);
        java.io.InputStream inputStream39 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream41 = new org.apache.commons.codec.binary.Base64InputStream(inputStream39, false);
        byte[] byteArray50 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream51 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream41, true, (int) (byte) 10, byteArray50);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream52 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream51);
        java.io.InputStream inputStream55 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream57 = new org.apache.commons.codec.binary.Base64InputStream(inputStream55, false);
        byte[] byteArray66 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream67 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57, true, (int) (byte) 10, byteArray66);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream68 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream69 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream70 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57);
        byte[] byteArray79 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream80 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream57, true, (int) '#', byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream81 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream51, false, 100, byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream82 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream34, false, (int) (byte) -1, byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream83 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, true, (int) 'a', byteArray79);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream85 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream83, true);
        // The following exception was thrown during execution in test generation
        try {
            int int86 = base64InputStream85.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(byteArray31);
        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray50);
        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray79);
        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream(inputStream19, false);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, true, (int) (byte) 10, byteArray30);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream37 = new org.apache.commons.codec.binary.Base64InputStream(inputStream35, false);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream47 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) (byte) 10, byteArray46);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream49 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream60 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) '#', byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream61 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31, false, 100, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream62 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false, (int) (byte) -1, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream64 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream62, true);
        boolean boolean65 = base64InputStream64.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream64.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        java.lang.Class<?> wildcardClass17 = base64InputStream16.getClass();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        java.io.InputStream inputStream15 = null;
        java.io.InputStream inputStream18 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream20 = new org.apache.commons.codec.binary.Base64InputStream(inputStream18, false);
        byte[] byteArray29 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20, true, (int) (byte) 10, byteArray29);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream33 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        byte[] byteArray42 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20, true, (int) '#', byteArray42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream(inputStream15, true, 10, byteArray42);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = base64InputStream14.read(byteArray42, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream12.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream16 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false);
        java.io.InputStream inputStream19 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream(inputStream19, false);
        byte[] byteArray30 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream31 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, true, (int) (byte) 10, byteArray30);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream32 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31);
        java.io.InputStream inputStream35 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream37 = new org.apache.commons.codec.binary.Base64InputStream(inputStream35, false);
        byte[] byteArray46 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream47 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) (byte) 10, byteArray46);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream49 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream50 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37);
        byte[] byteArray59 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream60 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream37, true, (int) '#', byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream61 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream31, false, 100, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream62 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream14, false, (int) (byte) -1, byteArray59);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream64 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream62, true);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream66 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream62, true);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream62.reset();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray46);
        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray59);
        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        boolean boolean5 = base64InputStream2.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = base64InputStream2.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream12.mark(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        // The following exception was thrown during execution in test generation
        try {
            base64InputStream14.mark((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        java.io.InputStream inputStream16 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream18 = new org.apache.commons.codec.binary.Base64InputStream(inputStream16, false);
        byte[] byteArray27 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18, true, (int) (byte) 10, byteArray27);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream29 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream30 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream18);
        boolean boolean31 = base64InputStream30.markSupported();
        java.io.InputStream inputStream34 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream36 = new org.apache.commons.codec.binary.Base64InputStream(inputStream34, false);
        byte[] byteArray45 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream46 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream36, true, (int) (byte) 10, byteArray45);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream47 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream36);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream48 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream36);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream49 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream36);
        byte[] byteArray58 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream59 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream36, true, (int) '#', byteArray58);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream60 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream30, true, 100, byteArray58);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream61 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, false, (int) (byte) -1, byteArray58);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream62 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream61);
        boolean boolean63 = base64InputStream62.markSupported();
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray27);
        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray45);
        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream14 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13);
        java.io.InputStream inputStream15 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream17 = new org.apache.commons.codec.binary.Base64InputStream(inputStream15, false);
        byte[] byteArray26 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream27 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream17, true, (int) (byte) 10, byteArray26);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream27);
        java.io.InputStream inputStream31 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream33 = new org.apache.commons.codec.binary.Base64InputStream(inputStream31, false);
        byte[] byteArray42 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream43 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream33, true, (int) (byte) 10, byteArray42);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream33);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream45 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream33);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream46 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream33);
        byte[] byteArray55 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream56 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream33, true, (int) '#', byteArray55);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream57 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream27, false, 100, byteArray55);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = base64InputStream13.read(byteArray55, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream12 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2, true, (int) (byte) 10, byteArray11);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream13 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream12);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream15 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream13, true);
        boolean boolean16 = base64InputStream15.markSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = base64InputStream15.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.io.InputStream inputStream0 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream2 = new org.apache.commons.codec.binary.Base64InputStream(inputStream0, false);
        boolean boolean3 = base64InputStream2.markSupported();
        org.apache.commons.codec.binary.Base64InputStream base64InputStream4 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream2);
        java.io.InputStream inputStream7 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream9 = new org.apache.commons.codec.binary.Base64InputStream(inputStream7, false);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream19 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream9, true, (int) (byte) 10, byteArray18);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream20 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream9);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream21 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream20);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream23 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, false);
        java.io.InputStream inputStream26 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream28 = new org.apache.commons.codec.binary.Base64InputStream(inputStream26, false);
        byte[] byteArray37 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream38 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream28, true, (int) (byte) 10, byteArray37);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream39 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream38);
        java.io.InputStream inputStream42 = null;
        org.apache.commons.codec.binary.Base64InputStream base64InputStream44 = new org.apache.commons.codec.binary.Base64InputStream(inputStream42, false);
        byte[] byteArray53 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream54 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream44, true, (int) (byte) 10, byteArray53);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream55 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream44);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream56 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream44);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream57 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream44);
        byte[] byteArray66 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 };
        org.apache.commons.codec.binary.Base64InputStream base64InputStream67 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream44, true, (int) '#', byteArray66);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream68 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream38, false, 100, byteArray66);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream69 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream21, false, (int) (byte) -1, byteArray66);
        org.apache.commons.codec.binary.Base64InputStream base64InputStream70 = new org.apache.commons.codec.binary.Base64InputStream((java.io.InputStream) base64InputStream4, false, (int) ' ', byteArray66);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray37);
        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray53);
        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 1, (byte) 1, (byte) 1 });
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) -1, (byte) 10 });
    }
}

